package br.edu.ifto.estudante.bernardcarvalhotrabalhofinalpw2.Controllers;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class ConfiguracaoSpringMVC implements WebMvcConfigurer{

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/home").setViewName("home");
    }
}