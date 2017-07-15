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
public enum ShapeType {

  CIRCLE("CIRCLE"), TRIANGLE("TRIANGLE"), SQUARE("SQUARE"), UNDEFINED("");

  private final String tipo;

  ShapeType(String title) {
    this.tipo = title;
  }

  @Override
  public String toString() {
    return tipo;
  }
}
