package com.example;

import java.io.Serializable;
import java.util.Date;

public class Venta implements Serializable {

    private String codigo;
    private String item;
    private String descripcion;
    private double precio;
    private String marca;
    private Date fechaVenta;

    // Constructor sin argumentos
    public Venta() {
        this.fechaVenta = new Date(); // La fecha de venta se establece al momento de la creación de la venta
    }

    // Getter para el código
    public String getCodigo() {
        return codigo; 
    }

    // Setter para el código
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Getter para el ítem
    public String getItem() {
        return item;
    }

    // Setter para el ítem
    public void setItem(String item) {
        this.item = item;
    }

    // Getter para la descripción
    public String getDescripcion() {
        return descripcion;
    }

    // Setter para la descripción
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getter para el precio
    public double getPrecio() {
        return precio;
    }

    // Setter para el precio
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Getter para la marca
    public String getMarca() { 
        return marca;
    }

    // Setter para la marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter para la fecha de venta
    public Date getFechaVenta() {
        return fechaVenta;
    }

    // Setter para la fecha de venta (no se proporciona un setter para la fecha de venta ya que debería establecerse solo al crear la venta)
}
