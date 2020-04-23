package guru.raduga256.sfgpetclinic.bootsrap;

import guru.raduga256.sfgpetclinic.model.Owner;
import guru.raduga256.sfgpetclinic.model.Vet;
import guru.raduga256.sfgpetclinic.services.OwnerService;
import guru.raduga256.sfgpetclinic.services.VetService;
import guru.raduga256.sfgpetclinic.services.map.OwnerServiceMap;
import guru.raduga256.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Micheal");
        owner1.setLastName("Western");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenare");

        ownerService.save(owner2);

        System.out.println("Loaded Owners .......");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("John");
        vet2.setLastName("Koojo");

        vetService.save(vet2);

        System.out.println("Loaded Vets ....");



    }
}
