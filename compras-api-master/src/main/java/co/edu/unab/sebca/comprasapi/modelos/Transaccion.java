/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unab.sebca.comprasapi.modelos;


import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "transaccion")
public class Transaccion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transaccion", unique = true, nullable = false)
    private Long id_transaccion;
    
    @Column(name = "TRANSACCION_FECHA")
    private String transaccion_fecha;
    
    @Column(name = "ID_MENU")
    private int id_menu;
    
    @Column(name = "ID_MESA")
    private String id_mesa;
    
     @Column(name = "ID_MESERO")
    private String id_mesero;

    public Long getId_transaccion() {
        return id_transaccion;
    }

    public void setId_transaccion(Long id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    public String getTransaccion_fecha() {
        return transaccion_fecha;
    }

    public void setTransaccion_fecha(String transaccion_fecha) {
        this.transaccion_fecha = transaccion_fecha;
    }

    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public String getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(String id_mesa) {
        this.id_mesa = id_mesa;
    }

    public String getId_mesero() {
        return id_mesero;
    }

    public void setId_mesero(String id_mesero) {
        this.id_mesero = id_mesero;
    }
    
     
}
