package fr.semifir.rpgtestapi.config;

import fr.semifir.rpgtestapi.models.attaques.Attaque;
import fr.semifir.rpgtestapi.models.attaques.BasiqueAttaque;
import fr.semifir.rpgtestapi.models.attaques.CritiqueAttaque;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

public class AttaquesConfig {

    public static List<Attaque> mageAttaques = new ArrayList() {{
        add(new BasiqueAttaque("Boule de feu", 10));
        add(new CritiqueAttaque("Pluie d'étincelles", 20, 20, 20));
    }};

    public static List<Attaque> naturologueAttaques = new ArrayList() {{
        add(new BasiqueAttaque("Ronce", 10));
        add(new CritiqueAttaque("Encerclement", 20, 20, 20));
    }};

    public static List<Attaque> bagarreurAttaques = new ArrayList() {{
        add(new BasiqueAttaque("Droite du gauche", 10));
        add(new CritiqueAttaque("Uppercut", 20, 20, 20));
    }};


}
