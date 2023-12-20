/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author CRISTIAN
 */

public class Venta implements Serializable {

    private String codigo;
    private String item;
    private String descripcion;
    private double precio;
    private String marca;
    private Date fechaVenta;

    // getters y setters

    // constructor sin argumentos
    public Venta() {
        this.fechaVenta = new Date(); // La fecha de venta se establece al momento de la creación de la venta
    }
}
