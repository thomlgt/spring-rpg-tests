package fr.semifir.rpgtestapi.repositories;

import fr.semifir.rpgtestapi.models.Personnage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonnageRepository extends MongoRepository<Personnage, String> {
}
