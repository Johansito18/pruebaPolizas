package org.springframework.polizas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.polizas.modelo.Poliza;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface PolizaRepository extends JpaRepository<Poliza, Integer> {

    //@Query("SELECT ")
    //public List<Poliza> obtenerPolizaRangoFechas(Date)

    //@Query(value = "SELECT * FROM Poliza WHERE idPoliza=%:idpoliza% OR placaAuto=%:placa%;",nativeQuery = true)

    //List<Poliza> findByDate
    Optional<Poliza> findByIdPoliza(Integer idPoliza);
    Optional<Poliza> findByPlacaAuto(String placaAuto);




}
