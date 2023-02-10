package org.springframework.quoters;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.quoters.modelo.Poliza;

@Configuration //Es una clase de configuracion par el framework
public class DataBaseLoader {

    @Bean// Anotación que marca los metodos para que esten disponibles para spring cuando se inicialice
    CommandLineRunner init(QuoteRepository repository){

        return args -> {
            repository.save(new Poliza("Working with Spring Boot is like pair-programming with the Spring developers."));
            repository.save(new Poliza("With Boot you deploy everywhere you can find a JVM basically."));
            repository.save(new Poliza("Spring has come quite a ways in addressing developer enjoyment and "
                    + "ease of use since the last time I built an application using it."));
            repository.save(new Poliza(
                    "Previous to Spring Boot, I remember XML hell, confusing set up, and " + "many hours of frustration."));
            repository.save(new Poliza("Spring Boot solves this problem. It gets rid of XML and wires up "
                    + "common components for me, so I don't have to spend hours scratching my "
                    + "head just to figure out how it's all pieced together."));
            repository.save(new Poliza("It embraces " + "convention over configuration, providing an experience on par with "
                    + "frameworks that excel at early stage development, such as Ruby on " + "Rails."));
            repository.save(new Poliza("The real benefit of Boot, however, is that it's just Spring. That "
                    + "means any direction the code takes, regardless of complexity, I know " + "it's a safe bet."));
            repository.save(new Poliza("I don't worry about my code scaling. Boot allows the "
                    + "developer to peel back the layers and customize when it's appropriate "
                    + "while keeping the conventions that just work."));
            repository.save(new Poliza("So easy it is to switch container in #springboot."));
            repository.save(new Poliza("Really loving Spring Boot, makes stand alone Spring apps easy."));
            repository.save(new Poliza("I have two hours today to build an app from scratch. @springboot to the rescue!"));
            repository.save(new Poliza("@springboot with @springframework is pure productivity! Who said in #java one has "
                    + "to write double the code than in other langs? #newFavLib"));
        };
    }
}