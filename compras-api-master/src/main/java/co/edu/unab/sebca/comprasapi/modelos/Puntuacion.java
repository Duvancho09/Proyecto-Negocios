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
@Table(name = "puntuacion")
public class Puntuacion implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_puntuacion", unique = true, nullable = false)
    private Long id_puntuacion;
    
    @Column(name = "PUNTUACION_VALOR")
    private String puntuacion_valor;
    
    @Column(name = "ID_TRANSACCION")
    private int id_transaccion;

    public Long getId_puntuacion() {
        return id_puntuacion;
    }

    public void setId_puntuacion(Long id_puntuacion) {
        this.id_puntuacion = id_puntuacion;
    }

    public String getPuntuacion_valor() {
        return puntuacion_valor;
    }

    public void setPuntuacion_valor(String puntuacion_valor) {
        this.puntuacion_valor = puntuacion_valor;
    }

    public int getId_transaccion() {
        return id_transaccion;
    }

    public void setId_transaccion(int id_transaccion) {
        this.id_transaccion = id_transaccion;
    }
     
}
