package fr.semifir.rpgtestapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@Data
public class Personnage {

    @Id
    private String id;
    private String nom;
    private int pdv;
    private String classe;

}
