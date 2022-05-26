/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
 * @author sebca
 */
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente", unique = true, nullable = false)
    private Long id_cliente;
    
    @Column(name = "CLI_CIUDAD")
    private String cli_ciudad;
    
    @Column(name = "TELEFONO")
    private int telefono;
    
    @Column(name = "CLI_NOMBRE")
    private String cli_nombre;
    
     @Column(name = "ESTADO")
    private String estado;
     
     @Column(name = "CONTRASENA")
    private int contrasena;   

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getCli_ciudad() {
        return cli_ciudad;
    }

    public void setCli_ciudad(String cli_ciudad) {
        this.cli_ciudad = cli_ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCli_nombre() {
        return cli_nombre;
    }

    public void setCli_nombre(String cli_nombre) {
        this.cli_nombre = cli_nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getContrasena() {
        return contrasena;
    }

    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }
    
}
