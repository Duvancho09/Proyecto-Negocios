/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unab.sebca.comprasapi.repositorios;


import co.edu.unab.sebca.comprasapi.modelos.Transaccion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author ASUS
 */
@Repository
public interface TransaccionRepository extends CrudRepository<Transaccion, Long>{
      
    @Query(value =  "SELECT SUM(D.MENU_PRECIO) FROM transaccion E JOIN menu D ON E.ID_MENU = D.ID_MENU", nativeQuery = true)
    public String getObtenerVenta();
    
    @Query(value =  "SELECT ID_MENU, COUNT(ID_MENU) FROM transaccion GROUP BY ID_MENU ORDER BY COUNT(ID_MENU) DESC LIMIT 1", nativeQuery = true)
    public String getPlatoEscogido();
    
}
