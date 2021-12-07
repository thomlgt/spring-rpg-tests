package fr.semifir.rpgtestapi.repositories;

import fr.semifir.rpgtestapi.models.Combat;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CombatRepository extends MongoRepository<Combat, String> {
}
