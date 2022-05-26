/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unab.sebca.comprasapi.controladores;


import co.edu.unab.sebca.comprasapi.modelos.Puntuacion;
import co.edu.unab.sebca.comprasapi.servicios.PuntuacionService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author ASUS
 */
@RestController
@CrossOrigin
@RequestMapping("/puntuacion")
public class PuntuacionController {
    
    @Autowired
    private PuntuacionService puntuacionService;
    
    @GetMapping( path = "/{id}")
    public Optional<Puntuacion> getPorId(@PathVariable("id") Long id){
        return puntuacionService.getPorId(id);
    }
   /* 
    @PostMapping(path = "/validar")
    public Cliente validar(@RequestBody Cliente miCliente){
        return clienteService.validar(miCliente.getUsuario(), miCliente.getPassword());
    }
    */
    @PostMapping()
    public Puntuacion registrar(@RequestBody Puntuacion miPuntuacion){
        return puntuacionService.registrar(miPuntuacion);
    }
    
    @GetMapping( path = "/obtener")
    public String getPuntuacion(){
        return puntuacionService.Puntuacion();
    }
    
}
