package fr.semifir.rpgtestapi.config;

import fr.semifir.rpgtestapi.repositories.CombatRepository;
import fr.semifir.rpgtestapi.repositories.PersonnageRepository;
import fr.semifir.rpgtestapi.services.impl.CombatService;
import fr.semifir.rpgtestapi.services.impl.PersonnageService;
import fr.semifir.rpgtestapi.services.others.AttaqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigService {

    @Autowired
    private PersonnageRepository personnageRepository;
    @Autowired
    private CombatRepository combatRepository;

    @Bean
    public PersonnageService personnageServiceFactory() {
        return new PersonnageService(personnageRepository);
    }

    @Bean
    public CombatService combatServiceFactory() {
        return new CombatService(combatRepository, personnageServiceFactory());
    }

    @Bean
    public AttaqueService attaqueServiceFactory() {
        return new AttaqueService(personnageServiceFactory());
    }
}
