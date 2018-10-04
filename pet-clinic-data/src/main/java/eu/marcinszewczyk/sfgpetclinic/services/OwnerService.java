package eu.marcinszewczyk.sfgpetclinic.services;

import eu.marcinszewczyk.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
