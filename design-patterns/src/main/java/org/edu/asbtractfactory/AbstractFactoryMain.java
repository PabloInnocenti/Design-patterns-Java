/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edu.asbtractfactory;

/**
 *
 * @author pablo
 */
public class AbstractFactoryMain {
    
    private static AbstractFactory abstractFactory;
    
   public static void main(String[] args) {

      //get shape factory
      abstractFactory = FactoryProducer.getFactory("SHAPE");

      //get an object of Shape Circle
      Shape shape1 = abstractFactory.getShape("CIRCLE");

      //call draw method of Shape Circle
      shape1.draw();

      //get an object of Shape Rectangle
      Shape shape2 = abstractFactory.getShape("RECTANGLE");

      //call draw method of Shape Rectangle
      shape2.draw();
      
      //get an object of Shape Square 
      Shape shape3 = abstractFactory.getShape("SQUARE");

      //call draw method of Shape Square
      shape3.draw();

      //get color factory
      abstractFactory = FactoryProducer.getFactory("COLOR");

      //get an object of Color Red
      Color color1 = abstractFactory.getColor("RED");

      //call fill method of Red
      color1.fill();

      //get an object of Color Green
      Color color2 = abstractFactory.getColor("Green");

      //call fill method of Green
      color2.fill();

      //get an object of Color Blue
      Color color3 = abstractFactory.getColor("BLUE");

      //call fill method of Color Blue
      color3.fill();
   }
}
