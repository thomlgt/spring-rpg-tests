package fr.semifir.rpgtestapi.controllers;

import fr.semifir.rpgtestapi.models.Combat;
import fr.semifir.rpgtestapi.services.impl.CombatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("combats")
public class CombatController {

    @Autowired
    private CombatService service;

    @GetMapping()
    public List<Combat> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Combat findById(@PathVariable String id) {
        return this.service.findById(id);
    }

    @PostMapping()
    public Combat create(@RequestBody Combat combat) {
        return this.service.create(combat);
    }

    @PutMapping("{id}")
    public Combat update(@RequestBody Combat combat, @PathVariable String id) {
        return this.service.update(id, combat);
    }
}
