/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unab.sebca.comprasapi.servicios;


import co.edu.unab.sebca.comprasapi.modelos.Transaccion;
import co.edu.unab.sebca.comprasapi.repositorios.TransaccionRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author ASUS
 */
@Service
public class TransaccionService {
    
    @Autowired
    private TransaccionRepository transaccionRepository;
    
    public Optional<Transaccion> getPorId(Long id){
        
        return transaccionRepository.findById(id);
        
    }
    
    public Transaccion registrar(Transaccion miTransaccion){
        
        return transaccionRepository.save(miTransaccion);
    }
    
    public String ObtenerVenta(){
        return transaccionRepository.getObtenerVenta();
    }
    
    public String PlatoEscogido(){
        return transaccionRepository.getPlatoEscogido();
    }
    
}