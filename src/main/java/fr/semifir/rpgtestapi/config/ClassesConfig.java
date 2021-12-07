package fr.semifir.rpgtestapi.config;

import fr.semifir.rpgtestapi.models.Classe;
import fr.semifir.rpgtestapi.models.attaques.Attaque;
import fr.semifir.rpgtestapi.models.attaques.BasiqueAttaque;
import fr.semifir.rpgtestapi.models.attaques.CritiqueAttaque;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClassesConfig {

    public static HashMap<String, Classe> classes = new HashMap() {{
        put("mage", new Classe("Mage", AttaquesConfig.mageAttaques));
        put("naturologue", new Classe("Naturologue", AttaquesConfig.naturologueAttaques));
        put("bagarreur", new Classe("Bagarreur", AttaquesConfig.bagarreurAttaques));
    }};
}
