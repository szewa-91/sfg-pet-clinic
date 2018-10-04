package eu.marcinszewczyk.sfgpetclinic.services.map;

import eu.marcinszewczyk.sfgpetclinic.model.Vet;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findByID(Long id) {
        return super.findByID(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}