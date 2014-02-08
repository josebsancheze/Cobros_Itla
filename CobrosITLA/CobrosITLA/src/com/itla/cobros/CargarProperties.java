/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itla.cobros;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author jsanchez
 */
public class CargarProperties {

    private List database;

    public static Cuenta getCaso(String path, String name) {
        Cuenta cuenta = null;

        try {
            String file = new File(path + "//" + name).getAbsolutePath();
            //System.out.println("El archivo empresa.properties debe estar en: " + file);
            FileInputStream f = new FileInputStream(file);
            Properties p = new Properties();
            p.load(f);
            
            int noCuenta = Integer.parseInt(p.getProperty("cuenta"));
            String cedula = p.getProperty("cedula");
            String nombre = p.getProperty("nombres");
            String apellido = p.getProperty("apellidos");
            String tel1 = p.getProperty("tel1");
            String tel2 = p.getProperty("tel2");
            String dir1 = p.getProperty("dir1");
            String dir2 = p.getProperty("dir2");
            String id_zona = p.getProperty("zona");
            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
            String strFecha = p.getProperty("fechaContrato");
            Date fecha = null;
            try {
                    
            fecha = formatoDelTexto.parse(strFecha);

            } catch (ParseException ex) {

            ex.printStackTrace();

            }
            
            Date fecha_ingreso = fecha; 
            Date fecha_contrato = fecha;
            String no_contrato = p.getProperty("contrato");
            
	
            String estatus = "A";
            int id_empresa = Integer.parseInt(p.getProperty("empresa"));
            BigDecimal monto = new BigDecimal(p.getProperty("monto"));
            BigDecimal monto_deuda = monto;
            System.out.println("la cedula: " + cedula);

            cuenta = new Cuenta(noCuenta, cedula, nombre, apellido, tel1, tel2, dir1, dir2, id_zona, fecha_ingreso, no_contrato, fecha_contrato, estatus, id_empresa, monto_deuda);


        } catch (IOException e) {
            e.printStackTrace();
        }

        return cuenta;

    }

    public List getDatabase() {

        try {
            Properties p = new Properties();
            p.load(getClass().getResourceAsStream("database.properties"));

            database = new ArrayList();

            database.add(p.getProperty("port"));
            database.add(p.getProperty("db"));
            database.add(p.getProperty("user"));
            database.add(p.getProperty("pass"));
            database.add(p.getProperty("server"));
            database.add(p.getProperty("driver"));

        } catch (IOException e) {
            System.out.println("Hubo un problema al cargar los datos del properties: " + e.getMessage());
        }

        return database;

    }
}
