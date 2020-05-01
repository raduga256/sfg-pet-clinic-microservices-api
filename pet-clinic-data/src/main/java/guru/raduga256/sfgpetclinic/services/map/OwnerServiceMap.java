package guru.raduga256.sfgpetclinic.services.map;

import guru.raduga256.sfgpetclinic.model.Owner;
import guru.raduga256.sfgpetclinic.model.Pet;
import guru.raduga256.sfgpetclinic.services.OwnerService;
import guru.raduga256.sfgpetclinic.services.PetService;
import guru.raduga256.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {

        if(object != null){
            if(object.getPets() != null){
                object.getPets().forEach(pet ->{
                    if(pet.getType() != null){
                        if(pet.getType().getId() == null){
                            pet.setType(petTypeService.save(pet.getType()));
                        }
                    }
                        else {
                        throw new RuntimeException("Pet Type is required");
                    }
                        if(pet.getId() == null){
                            Pet savedPet = petService.save(pet);
                            pet.setId(savedPet.getId());
                        }
                } );
            }
            return super.save( object);
        } else{
            return null;
        }

    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
