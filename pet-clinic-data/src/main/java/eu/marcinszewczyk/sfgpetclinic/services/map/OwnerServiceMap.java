package eu.marcinszewczyk.sfgpetclinic.services.map;

import eu.marcinszewczyk.sfgpetclinic.model.Owner;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
