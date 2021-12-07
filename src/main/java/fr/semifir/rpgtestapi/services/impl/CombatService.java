package fr.semifir.rpgtestapi.services.impl;

import fr.semifir.rpgtestapi.models.Combat;
import fr.semifir.rpgtestapi.repositories.CombatRepository;
import fr.semifir.rpgtestapi.services.GenericService;

import java.util.Date;
import java.util.List;

public class CombatService implements GenericService<Combat> {

    private CombatRepository combatRepository;
    private PersonnageService personnageService;

    public CombatService(CombatRepository combatRepository, PersonnageService personnageService) {
        this.combatRepository = combatRepository;
        this.personnageService = personnageService;
    }

    @Override
    public List<Combat> findAll() {
        return this.combatRepository.findAll();
    }

    @Override
    public Combat findById(String id) {
        return this.combatRepository.findById(id).get();
    }

    @Override
    public Combat create(Combat entity) {
        entity.setDateDebut(new Date());
        entity.setAttaquant(this.personnageService.findById(entity.getAttaquant().getId()));
        entity.setDefenseur(this.personnageService.findById(entity.getDefenseur().getId()));
        entity.setPdvAttaquant(entity.getAttaquant().getPdv());
        entity.setPdvDefenseur(entity.getDefenseur().getPdv());
        return this.combatRepository.save(entity);
    }

    @Override
    public Combat update(String id, Combat entity) {
        entity.setId(id);
        return this.combatRepository.save(entity);
    }

    @Override
    public void delete(String id) {
        this.combatRepository.deleteById(id);
    }
}
