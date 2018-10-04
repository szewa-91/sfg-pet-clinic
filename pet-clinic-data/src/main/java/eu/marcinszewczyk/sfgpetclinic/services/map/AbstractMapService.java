package eu.marcinszewczyk.sfgpetclinic.services.map;

import eu.marcinszewczyk.sfgpetclinic.services.CrudService;

import java.util.Set;

public class AbstractMapService<T, ID> implements CrudService<T, ID> {
    @Override
    public Set<T> findAll() {
        return null;
    }

    @Override
    public T findByID(ID aLong) {
        return null;
    }

    @Override
    public T save(T object) {
        return null;
    }

    @Override
    public void delete(T object) {

    }

    @Override
    public void deleteById(ID aLong) {

    }
}
