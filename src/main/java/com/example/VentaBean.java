/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.example;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CRISTIAN
 */
@ManagedBean
@RequestScoped
public class VentaBean implements Serializable {
    
    private List<Venta> ventas;
    private Venta venta;

    /**
     * Creates a new instance of VentaBean
     */
    public VentaBean() {
        ventas = new ArrayList<>();
        venta = new Venta();
    }
    
    // Métodos CRUD

    public void agregarVenta() {
        ventas.add(venta);
        venta = new Venta(); // Limpiar para una nueva venta
    }

    public void editarVenta(Venta venta) {
        this.venta = venta;
    }

    public void eliminarVenta(Venta venta) {
        ventas.remove(venta);
    } 
    
}
