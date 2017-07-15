/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.edu.factorymethod;

/**
 *
 * @author pablo
 */
public class FactoryPatternMain {
    
   private static ShapeFactory shapeFactory;

   public static void main(String[] args) {
       shapeFactory = new ShapeFactory();

      //Obtiene una instancia de la clase Circle.
      Shape shape1 = shapeFactory.getShape("CIRCLE");
      shape1.draw();

      //Obtiene una instancia de la clase Triangle.
      Shape shape2 = shapeFactory.getShape("TRIANGLE");
      shape2.draw();

      //Obtiene una instancia de la clase Square.
      Shape shape3 = shapeFactory.getShape("SQUARE");
      shape3.draw();
   }
}