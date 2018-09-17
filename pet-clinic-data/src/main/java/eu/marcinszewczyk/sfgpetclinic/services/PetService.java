package eu.marcinszewczyk.sfgpetclinic.services;

import eu.marcinszewczyk.sfgpetclinic.model.Owner;
import eu.marcinszewczyk.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Owner owner);
    Set<Pet> findAll();
}
