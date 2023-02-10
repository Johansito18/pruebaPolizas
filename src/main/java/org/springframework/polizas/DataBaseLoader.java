package org.springframework.polizas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.polizas.modelo.Poliza;
import org.springframework.polizas.repositorio.PolizaRepository;

import java.util.Date;

@Configuration //Es una clase de configuracion par el framework
public class DataBaseLoader {
    //Date fecha = new Date(2020,10,10);
    @Bean// Anotación que marca los metodos para que esten disponibles para spring cuando se inicialice
    CommandLineRunner init(PolizaRepository repository){

        return args -> {
            repository.save(new Poliza(1,new Date(2020,1,10),"todo",1000,"poliza1","AAA123","ferrari",true,12345,"johan",new Date(2000,10,10),"Medellin","Itagui"));
            repository.save(new Poliza(2, new Date(2020,2,10),"todo",2000,"poliza2","BBB123","ferrari",true,12345,"andres",new Date(2000,10,10),"Medellin","Itagui"));
            repository.save(new Poliza(4, new Date(2020,3,10),"todo",3000,"poliza3","CCC123","ferrari",false,12345,"felipe",new Date(2000,10,10),"Medellin","Itagui"));
            repository.save(new Poliza(1, new Date(2020,4,10),"todo",4000,"poliza4","DDD123","ferrari",true,12345,"david",new Date(2000,10,10),"Medellin","Itagui"));
            repository.save(new Poliza(5, new Date(2020,5,10),"todo",5000,"poliza5","EEE123","ferrari",false,12345,"jorge",new Date(2000,10,10),"Medellin","Itagui"));
            repository.save(new Poliza(6, new Date(2020,6,10),"todo",5000,"poliza6","FFF123","ferrari",true,12345,"brahian",new Date(2000,10,10),"Medellin","Itagui"));
            repository.save(new Poliza(7, new Date(2020,7,10),"todo",4000,"poliza7","HHH123","ferrari",false,12345,"camilo",new Date(2000,10,10),"Medellin","Itagui"));
            repository.save(new Poliza(8, new Date(2020,8,10),"todo",6000,"poliza8","III123","ferrari",true,12345,"juan",new Date(2000,10,10),"Medellin","Itagui"));
            repository.save(new Poliza(9, new Date(2020,9,10),"todo",4000,"poliza9","JJJ123","ferrari",true,12345,"andrea",new Date(2000,10,10),"Medellin","Itagui"));
            repository.save(new Poliza(10, new Date(2020,10,10),"todo",1000,"poliza10","CDC123","ferrari",true,12345,"luz",new Date(2000,10,10),"Medellin","Itagui"));



        };
    }
}
