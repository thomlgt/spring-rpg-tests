package fr.semifir.rpgtestapi.models;

import com.mongodb.lang.Nullable;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@AllArgsConstructor
@Data
public class Combat {

    @Id
    private String id;
    @Nullable
    private Date dateDebut;
    @Nullable
    private Date dateFin;
    @DBRef
    private Personnage attaquant;
    @DBRef
    private Personnage defenseur;
    @Nullable
    private int pdvAttaquant;
    @Nullable
    private int pdvDefenseur;
    @Nullable
    private int nbTour;
}
