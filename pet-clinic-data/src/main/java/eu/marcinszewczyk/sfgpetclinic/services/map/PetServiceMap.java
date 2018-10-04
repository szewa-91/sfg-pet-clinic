package eu.marcinszewczyk.sfgpetclinic.services.map;

import eu.marcinszewczyk.sfgpetclinic.model.Pet;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
