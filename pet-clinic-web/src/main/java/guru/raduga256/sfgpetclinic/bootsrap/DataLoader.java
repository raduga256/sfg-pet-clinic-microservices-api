package guru.raduga256.sfgpetclinic.bootsrap;

import guru.raduga256.sfgpetclinic.model.Owner;
import guru.raduga256.sfgpetclinic.model.Pet;
import guru.raduga256.sfgpetclinic.model.PetType;
import guru.raduga256.sfgpetclinic.model.Vet;
import guru.raduga256.sfgpetclinic.services.OwnerService;
import guru.raduga256.sfgpetclinic.services.PetTypeService;
import guru.raduga256.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);


        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Western");
        owner1.setAddress("123 Brickel");
        owner1.setCity("Kampala");
        owner1.setTelephone("0783252525");

        Pet mikesPet = new Pet();
        mikesPet.setType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDay(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenare");
        owner2.setAddress("123 Brickel");
        owner2.setCity("Kampala");
        owner2.setTelephone("0783252525");

        Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDay(LocalDate.now());
        fionasCat.setType(savedCatPetType);
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        System.out.println("Loaded Owners .......");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("John");
        vet2.setLastName("Koojo");

        vetService.save(vet2);

        System.out.println("Loaded Vets ....");



    }
}
