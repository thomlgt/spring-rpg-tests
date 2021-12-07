package fr.semifir.rpgtestapi.services.impl;

import fr.semifir.rpgtestapi.models.Personnage;
import fr.semifir.rpgtestapi.models.attaques.Attaque;
import fr.semifir.rpgtestapi.repositories.PersonnageRepository;
import fr.semifir.rpgtestapi.services.GenericService;

import java.util.List;

public class PersonnageService implements GenericService<Personnage> {

    private PersonnageRepository repository;

    public PersonnageService(PersonnageRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Personnage> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Personnage findById(String id) {
        return this.repository.findById(id).get();
    }

    @Override
    public Personnage create(Personnage entity) {
        return this.repository.save(entity);
    }

    @Override
    public Personnage update(String id, Personnage entity) {
        return this.repository.save(entity);
    }

    @Override
    public void delete(String id) {
        this.repository.deleteById(id);
    }
}
