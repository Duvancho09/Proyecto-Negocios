/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unab.sebca.comprasapi.servicios;


import co.edu.unab.sebca.comprasapi.modelos.Puntuacion;
import co.edu.unab.sebca.comprasapi.modelos.Transaccion;
import co.edu.unab.sebca.comprasapi.repositorios.PuntuacionRepository;
import co.edu.unab.sebca.comprasapi.repositorios.TransaccionRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author ASUS
 */
@Service
public class PuntuacionService {
    
    @Autowired
    private PuntuacionRepository puntuacionRepository;
    
    public Optional<Puntuacion> getPorId(Long id){
        
        return puntuacionRepository.findById(id);
        
    }
    
    public Puntuacion registrar(Puntuacion miPuntuacion){
        
        return puntuacionRepository.save(miPuntuacion);
    }
    
    public String Puntuacion(){
        return puntuacionRepository.getPuntuacion();
    }
    
}
