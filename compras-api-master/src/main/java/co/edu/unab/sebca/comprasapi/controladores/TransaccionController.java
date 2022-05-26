/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unab.sebca.comprasapi.controladores;


import co.edu.unab.sebca.comprasapi.modelos.Transaccion;
import co.edu.unab.sebca.comprasapi.servicios.TransaccionService;
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
@RequestMapping("/transaccion")
public class TransaccionController {
    
    @Autowired
    private TransaccionService transaccionService;
    
    @GetMapping( path = "/{id}")
    public Optional<Transaccion> getPorId(@PathVariable("id") Long id){
        return transaccionService.getPorId(id);
    }
   /* 
    @PostMapping(path = "/validar")
    public Cliente validar(@RequestBody Cliente miCliente){
        return clienteService.validar(miCliente.getUsuario(), miCliente.getPassword());
    }
    */
    @PostMapping()
    public Transaccion registrar(@RequestBody Transaccion miTransaccion){
        return transaccionService.registrar(miTransaccion);
    }
    
    @GetMapping( path = "/ventas")
    public String getObtenerVenta(){
        return transaccionService.ObtenerVenta();
    }
    
    @GetMapping( path = "/plato")
    public String PlatoEscogido(){
        return transaccionService.PlatoEscogido();
    }
    
}