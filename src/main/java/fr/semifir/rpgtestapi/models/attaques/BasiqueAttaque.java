package fr.semifir.rpgtestapi.models.attaques;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BasiqueAttaque implements Attaque {

    private String nom;
    private int degats;

}
