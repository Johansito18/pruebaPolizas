package org.springframework.polizas.modelo;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Poliza {

    @Id
    @GeneratedValue
    private Integer idPoliza;

    private Date fechaPoliza;

    private String coberturasPoliza;

    private Integer valorMaximoPoliza;

    private String nombrePlanPoliza;

    private String placaAuto;

    private String modeloAuto;

    private boolean inspeccionAuto;

    private Integer idCliente;

    private String nombreCliente;

    private Date fechaNacimiento;

    private  String ciudadCliente;

    private String direccionCliente;

    public Poliza() {

    }

    /*public Poliza(Integer idPoliza, String nombrePlanPoliza, String placaAuto, String nombreCliente) {
        this.idPoliza = idPoliza;
        this.nombrePlanPoliza = nombrePlanPoliza;
        this.placaAuto = placaAuto;
        this.nombreCliente = nombreCliente;
    }*/

    public Poliza(Integer idPoliza, Date fechaPoliza, String coberturasPoliza, Integer valorMaximoPoliza, String nombrePlanPoliza, String placaAuto, String modeloAuto, boolean inspeccionAuto, Integer idCliente, String nombreCliente, Date fechaNacimiento, String ciudadCliente, String direccionCliente) {
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

    public Integer getIdPoliza() {
        return idPoliza;
    }

    public void setIdPoliza(Integer idPoliza) {
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

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
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
