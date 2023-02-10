package org.springframework.quoters.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.quoters.modelo.Poliza;

import java.util.Date;
import java.util.List;

public interface PolizaRepository extends JpaRepository<Poliza, Long> {

    //@Query("SELECT ")
    //public List<Poliza> obtenerPolizaRangoFechas(Date)
}
