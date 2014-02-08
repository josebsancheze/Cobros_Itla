/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.cobros;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author esantiago
 */
public class Cuenta {
    
    private int         id_cuenta;
    private String      cedula;
    private String      nombre;
    private String      apellido;
    private String      tel1;
    private String      tel2;
    private String      dir1;
    private String      dir2;
    private String      id_zona;
    private Date        fecha_ingreso;
    private String      no_contrato;
    private Date        fecha_contrato;
    private String      estatus;
    private int         id_empresa;
    private BigDecimal  monto_deuda;

    public Cuenta(int id_cuenta, String cedula, String nombre, String apellido, String tel1, String tel2, String dir1, String dir2, String id_zona, Date fecha_ingreso, String no_contrato, Date fecha_contrato, String estatus, int id_empresa, BigDecimal monto_deuda) {
        this.id_cuenta = id_cuenta;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.dir1 = dir1;
        this.dir2 = dir2;
        this.id_zona = id_zona;
        this.fecha_ingreso = fecha_ingreso;
        this.no_contrato = no_contrato;
        this.fecha_contrato = fecha_contrato;
        this.estatus = estatus;
        this.id_empresa = id_empresa;
        this.monto_deuda = monto_deuda;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getDir1() {
        return dir1;
    }

    public void setDir1(String dir1) {
        this.dir1 = dir1;
    }

    public String getDir2() {
        return dir2;
    }

    public void setDir2(String dir2) {
        this.dir2 = dir2;
    }

    public String getId_zona() {
        return id_zona;
    }

    public void setId_zona(String id_zona) {
        this.id_zona = id_zona;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getNo_contrato() {
        return no_contrato;
    }

    public void setNo_contrato(String no_contrato) {
        this.no_contrato = no_contrato;
    }

    public Date getFecha_contrato() {
        return fecha_contrato;
    }

    public void setFecha_contrato(Date fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public BigDecimal getMonto_deuda() {
        return monto_deuda;
    }

    public void setMonto_deuda(BigDecimal monto_deuda) {
        this.monto_deuda = monto_deuda;
    }
    
    
    
    
    
}
