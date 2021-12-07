package fr.semifir.rpgtestapi.models.attaques;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@Data
public class CritiqueAttaque {

    private String nom;
    private int degats;
    private int chanceCritique; //Ne peut pas être supérieur à 100
    private int chanceEchec; //Ne peut pas être supérieur à 100
}
