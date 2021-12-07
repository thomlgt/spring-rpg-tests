package fr.semifir.rpgtestapi.models;

import fr.semifir.rpgtestapi.models.attaques.Attaque;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@AllArgsConstructor
@Data
public class Classe {

    private String nom;
    private List<Attaque> attaques;

}
