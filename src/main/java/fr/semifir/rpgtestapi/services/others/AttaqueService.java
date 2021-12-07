package fr.semifir.rpgtestapi.services.others;

import fr.semifir.rpgtestapi.config.ClassesConfig;
import fr.semifir.rpgtestapi.models.Personnage;
import fr.semifir.rpgtestapi.models.attaques.Attaque;
import fr.semifir.rpgtestapi.services.impl.PersonnageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AttaqueService {

    private PersonnageService personnageService;

    public AttaqueService(PersonnageService personnageService) {
        this.personnageService = personnageService;
    }

    public List<Attaque> findByClasse(String classe) {
        return ClassesConfig.classes.get(classe).getAttaques();
    }

    public List<Attaque> findByPersonnageId(String id) {
        Personnage personnage = this.personnageService.findById(id);
        return ClassesConfig.classes.get(personnage.getClasse()).getAttaques();
    }
}
