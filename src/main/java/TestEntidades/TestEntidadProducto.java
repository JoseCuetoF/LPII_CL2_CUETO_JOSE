package TestEntidades;

import Dao.ClassProductoImp;
import model.TblProductocl2;

public class TestEntidadProducto {

	public static void main(String[] args) {
		
		TblProductocl2 producto = new TblProductocl2();
		ClassProductoImp crud = new ClassProductoImp();
		
		//asigamos valores
		
		producto.setNombrecl2("Jabon SPA");
		producto.setPreciocompcl2(4);
		producto.setPrecioventacl2(5);
		producto.setEstadocl2("Nuevo");
		producto.setDescripcl2("Jabon de cara");
	
		
		//invocamos al metodo registrar . .
		
		crud.RegistrarProducto(producto);
		
		

	}

}
