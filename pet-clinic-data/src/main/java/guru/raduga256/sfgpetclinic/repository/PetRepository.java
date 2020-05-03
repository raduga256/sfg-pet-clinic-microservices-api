package guru.raduga256.sfgpetclinic.repository;

import guru.raduga256.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
