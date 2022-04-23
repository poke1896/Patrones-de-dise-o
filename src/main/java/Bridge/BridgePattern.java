/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

//El patrón de diseño de puente se puede usar cuando tanto la abstracción 
//como la implementación pueden tener diferentes jerarquías de forma
//independiente y queremos ocultar la implementación de la aplicación cliente.

//Patrones de creación Bridge

public class BridgePattern {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		
		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}

}
