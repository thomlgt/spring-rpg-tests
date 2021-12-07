package fr.semifir.rpgtestapi.controllers;

import fr.semifir.rpgtestapi.models.attaques.Attaque;
import fr.semifir.rpgtestapi.services.others.AttaqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("attaques")
public class AttaqueController {

    @Autowired
    private AttaqueService service;

    @GetMapping("classe/{classe}")
    public List<Attaque> findByClasse(@PathVariable String classe) {
        return this.service.findByClasse(classe);
    }

    @GetMapping("personnage/{id}")
    public List<Attaque> findByPersonageId(@PathVariable String id) {
        return this.service.findByPersonnageId(id);
    }
}
