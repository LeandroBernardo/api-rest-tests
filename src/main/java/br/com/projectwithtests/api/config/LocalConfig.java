package br.com.projectwithtests.api.config;

import br.com.projectwithtests.api.domain.User;
import br.com.projectwithtests.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB() {
        User u1 = new User(null, "Leandro", "leandro.bernardos@gmail.com", "123");
        User u2 = new User(null, "Felipe", "pipe.bernardos@gmail.com", "123");

        repository.saveAll(List.of(u1, u2));
    }
}
