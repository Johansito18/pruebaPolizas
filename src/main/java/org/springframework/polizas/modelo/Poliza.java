package org.springframework.quoters.modelo;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Poliza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPoliza;
    @Column(nullable = false)
    private Date fechaPoliza;
    @Column(nullable = false)
    private String coberturasPoliza;
    @Column(nullable = false)
    private Integer valorMaximoPoliza;
    @Column(nullable = false)
    private String nombrePlanPoliza;

    @Column(nullable = false)
    private String placaAuto;
    @Column(nullable = false)
    private String modeloAuto;
    @Column(nullable = false)
    private boolean inspeccionAuto;

    private Long idCliente;
    @Column(nullable = false)
    private String nombreCliente;
    @Column(nullable = false)
    private Date fechaNacimiento;
    @Column(nullable = false)
    private  String ciudadCliente;
    @Column(nullable = false)
    private String direccionCliente;

    public Poliza() {

    }

    public Poliza(Long idPoliza, Date fechaPoliza, String coberturasPoliza, Integer valorMaximoPoliza, String nombrePlanPoliza, String placaAuto, String modeloAuto, boolean inspeccionAuto, Long idCliente, String nombreCliente, Date fechaNacimiento, String ciudadCliente, String direccionCliente) {
        this.idPoliza = idPoliza;
        this.fechaPoliza = fechaPoliza;
        this.coberturasPoliza = coberturasPoliza;
        this.valorMaximoPoliza = valorMaximoPoliza;
        this.nombrePlanPoliza = nombrePlanPoliza;
        this.placaAuto = placaAuto;
        this.modeloAuto = modeloAuto;
        this.inspeccionAuto = inspeccionAuto;
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudadCliente = ciudadCliente;
        this.direccionCliente = direccionCliente;
    }

    public Long getIdPoliza() {
        return idPoliza;
    }

    public void setIdPoliza(Long idPoliza) {
        this.idPoliza = idPoliza;
    }

    public Date getFechaPoliza() {
        return fechaPoliza;
    }

    public void setFechaPoliza(Date fechaPoliza) {
        this.fechaPoliza = fechaPoliza;
    }

    public String getCoberturasPoliza() {
        return coberturasPoliza;
    }

    public void setCoberturasPoliza(String coberturasPoliza) {
        this.coberturasPoliza = coberturasPoliza;
    }

    public Integer getValorMaximoPoliza() {
        return valorMaximoPoliza;
    }

    public void setValorMaximoPoliza(Integer valorMaximoPoliza) {
        this.valorMaximoPoliza = valorMaximoPoliza;
    }

    public String getNombrePlanPoliza() {
        return nombrePlanPoliza;
    }

    public void setNombrePlanPoliza(String nombrePlanPoliza) {
        this.nombrePlanPoliza = nombrePlanPoliza;
    }

    public String getPlacaAuto() {
        return placaAuto;
    }

    public void setPlacaAuto(String placaAuto) {
        this.placaAuto = placaAuto;
    }

    public String getModeloAuto() {
        return modeloAuto;
    }

    public void setModeloAuto(String modeloAuto) {
        this.modeloAuto = modeloAuto;
    }

    public boolean isInspeccionAuto() {
        return inspeccionAuto;
    }

    public void setInspeccionAuto(boolean inspeccionAuto) {
        this.inspeccionAuto = inspeccionAuto;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudadCliente() {
        return ciudadCliente;
    }

    public void setCiudadCliente(String ciudadCliente) {
        this.ciudadCliente = ciudadCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poliza poliza = (Poliza) o;
        return inspeccionAuto == poliza.inspeccionAuto && Objects.equals(idPoliza, poliza.idPoliza) && Objects.equals(fechaPoliza, poliza.fechaPoliza) && Objects.equals(coberturasPoliza, poliza.coberturasPoliza) && Objects.equals(valorMaximoPoliza, poliza.valorMaximoPoliza) && Objects.equals(nombrePlanPoliza, poliza.nombrePlanPoliza) && Objects.equals(placaAuto, poliza.placaAuto) && Objects.equals(modeloAuto, poliza.modeloAuto) && Objects.equals(idCliente, poliza.idCliente) && Objects.equals(nombreCliente, poliza.nombreCliente) && Objects.equals(fechaNacimiento, poliza.fechaNacimiento) && Objects.equals(ciudadCliente, poliza.ciudadCliente) && Objects.equals(direccionCliente, poliza.direccionCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPoliza, fechaPoliza, coberturasPoliza, valorMaximoPoliza, nombrePlanPoliza, placaAuto, modeloAuto, inspeccionAuto, idCliente, nombreCliente, fechaNacimiento, ciudadCliente, direccionCliente);
    }

    @Override
    public String toString() {
        return "Poliza{" +
                "idPoliza=" + idPoliza +
                ", fechaPoliza=" + fechaPoliza +
                ", coberturasPoliza='" + coberturasPoliza + '\'' +
                ", valorMaximoPoliza=" + valorMaximoPoliza +
                ", nombrePlanPoliza='" + nombrePlanPoliza + '\'' +
                ", placaAuto='" + placaAuto + '\'' +
                ", modeloAuto='" + modeloAuto + '\'' +
                ", inspeccionAuto=" + inspeccionAuto +
                ", idCliente=" + idCliente +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", ciudadCliente='" + ciudadCliente + '\'' +
                ", direccionCliente='" + direccionCliente + '\'' +
                '}';
    }
}
