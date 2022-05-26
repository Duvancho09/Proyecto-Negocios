/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unab.sebca.comprasapi.repositorios;


import co.edu.unab.sebca.comprasapi.modelos.Puntuacion;
import co.edu.unab.sebca.comprasapi.modelos.Transaccion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author ASUS
 */
@Repository
public interface PuntuacionRepository extends CrudRepository<Puntuacion, Long>{
      
    @Query(value =  "select count(*) puntuacion_valor FROM puntuacion WHERE puntuacion_valor = 5;", nativeQuery = true)
    public String getPuntuacion();
    
}
