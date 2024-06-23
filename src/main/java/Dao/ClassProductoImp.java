package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProductocl2;

public class ClassProductoImp implements IProducto {

	
	public void RegistrarProducto(TblProductocl2 producto) {
		// establecer conexion  con la unidad de persistencia . . . 
		EntityManagerFactory pro= Persistence.createEntityManagerFactory("LPII_CL2_CUETO_JOSE");
				 
		//permite gestionar entidades
		EntityManager em=pro.createEntityManager();
		//iniciamos transaccion
		em.getTransaction().begin();
		
		//registramos
		em.persist(producto);
		
		//confirmamos
		em.getTransaction().commit();
		
		//imprimmos
		
		System.out.println("Producto registrado correctanmente en la BD");
		
		//cerramos transaccion
		
		em.close();
		
		
		
		
		
		
	} // FIN DE METODO REGISTRAR

	public List<TblProductocl2> ListadoProducto() {
		
		 //establecer la conexion con la unidad de persistencia
        EntityManagerFactory em= Persistence.createEntityManagerFactory("LPII_CL2_CUETO_JOSE");
        //gestionar las entidades
        EntityManager emanager= em.createEntityManager();
        //inicar la transaccion
        emanager.getTransaction().begin();
        //recuperamos el listado de productos de la base de datos
        List<TblProductocl2> listado= emanager.createQuery("select c from TblProductocl2 c",TblProductocl2.class).getResultList();
        //confirmamos 
        emanager.getTransaction().commit();
        //cerramos
        emanager.close();
        return listado;
	} // FIN DE METODO LISTA

}
