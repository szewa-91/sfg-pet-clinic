package eu.marcinszewczyk.sfgpetclinic.bootstrap;

import eu.marcinszewczyk.sfgpetclinic.model.Owner;
import eu.marcinszewczyk.sfgpetclinic.model.Vet;
import eu.marcinszewczyk.sfgpetclinic.services.OwnerService;
import eu.marcinszewczyk.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(
            @Qualifier("ownerServiceMap") OwnerService ownerService,
            @Qualifier("vetServiceMap") VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Marcin");
        owner1.setLastName("Szewczyk");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Janek");
        owner2.setLastName("Wisniewski");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Jerzy");
        vet1.setLastName("Ziebie");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(1L);
        vet2.setFirstName("Gregory");
        vet2.setLastName("House");

        vetService.save(vet2);

        System.out.println("Saved");
    }
}
