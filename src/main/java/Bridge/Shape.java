/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author Poke
 */
public abstract class Shape {
	
        //Composición - implementador
	protected Color color;
	
	//constructor con implementador como argumento de entrada
	public Shape(Color c){
		this.color=c;
	}
	
	abstract public void applyColor();
}
