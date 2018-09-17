package eu.marcinszewczyk.sfgpetclinic.services;

import eu.marcinszewczyk.sfgpetclinic.model.Owner;
import eu.marcinszewczyk.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Owner owner);
    Set<Vet> findAll();
}
