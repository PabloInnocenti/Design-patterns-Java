# Version de la Documentacion
| Author          | Fecha       | Version | Descripcion                                   |
|:--------------- |:----------- |:-------:|:--------------------------------------------- |
| Pablo Innocenti | 10/07/2017  | 1.0     | <br>Descripcion<br>Objetivos<br>Marco Teorico<br>Creational Patterns |

# Objetivo Principal

* Describir los distintos patrones de Diseño y realizar ejemplos de implementaciones en JAVA.

## Objetivos Secundarios

# Metodología del proyecto
* Desarrollo por etapas.

# Roadmap del Proyecto
* [Informacion y status del proyecto](Documentacion/project.md)
* [TODO's](Documentacion/TODO.md)

# Conceptos

:rocket: Introduction
=================

Los patrones de diseño son soluciones a problemas recurrentes; **maneras sobre cómo abordar ciertos problemas**. No son clases, paquetes o librerias que se apliquen en el diseño de una aplicación y esperar a que ocurra **magia**. Los patrones de diseño son más bien **guias** de cómo abordar ciertos problemas en ciertas situaciones.

> Design patterns are solutions to recurring problems; guidelines on how to tackle certain problems

Wikipedia:

> In software engineering, a software design pattern is a general reusable solution to a commonly occurring problem within a given context in software design. It is not a finished design that can be transformed directly into source or machine code. It is a description or template for how to solve a problem that can be used in many different situations.


Los patrones de diseño pretenden:
-----------------

- Proporcionar **catálogos de elementos** reusables en el diseño de sistemas software.
- **Evitar inventar la rueda** mediante la búsqueda de soluciones a problemas ya conocidos y solucionados anteriormente.
- Formalizar un **vocabulario común** entre diseñadores.
- **Estandarizar** el modo en que se realiza el diseño.
- **Facilitar el aprendizaje** de las nuevas generaciones de diseñadores condensando conocimiento ya existente.

:warning: Asimismo, no pretenden:
-----------------

- Imponer ciertas alternativas de diseño frente a otras.
- Eliminar la creatividad inherente al proceso de diseño.
- No es obligatorio utilizar los patrones, solo es aconsejable en el caso de tener el mismo problema o similar que soluciona el patrón, siempre teniendo en cuenta que en un caso particular puede no ser aplicable. "Abusar o forzar el uso de los patrones puede ser un error".

Tipos de Patrones de Diseño
-----------------

* [Creational](#creational-design-patterns)
* [Structural](#structural-design-patterns)
* [Behavioral](#behavioral-design-patterns)

Creational Design Patterns :hammer:
==========================

> Creational patterns are focused towards **how to instantiate an object or group of related objects**.

Wikipedia:
> In software engineering, creational design patterns are design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by somehow controlling this object creation.

 * [Simple Factory](Documentacion/Creational/SimpleFactory.md)
 * [Factory Method](Documentacion/Creational/FactoryMethod.md)
 * [Abstract Factory](Documentacion/Creational/AbstractFactory.md)
 * [Builder](Documentacion/TODO.md)
 * [Prototype](Documentacion/TODO.md)
 * [Singleton](Documentacion/TODO.md)

Structural Design Patterns
==========================

> Structural patterns are mostly concerned with **object composition** or in other words how the entities can use each other ("How to build a software component?")

Wikipedia:
> In software engineering, structural design patterns are design patterns that ease the design by identifying a simple way to realize relationships between entities.

 * [Adapter](Documentacion/TODO.md)
 * [Bridge](Documentacion/TODO.md)
 * [Composite](Documentacion/TODO.md)
 * [Decorator](Documentacion/TODO.md)
 * [Facade](Documentacion/TODO.md)
 * [Flyweight](Documentacion/TODO.md)
 * [Proxy](Documentacion/TODO.md)

Behavioral Design Patterns
==========================

> It is concerned with **assignment of responsibilities between objects**. What makes them different from structural patterns is they don't just specify the structure but also outline the patterns for message passing/communication between them ("How to run a behavior in software component?")

Wikipedia:
> In software engineering, behavioral design patterns are design patterns that identify common communication patterns between objects and realize these patterns. By doing so, these patterns increase flexibility in carrying out this communication.

* [Chain of Responsibility](Documentacion/TODO.md)
* [Iterator](Documentacion/TODO.md)
* [Command](Documentacion/TODO.md)
* [Mediator](Documentacion/TODO.md)
* [Memento](Documentacion/TODO.md)
* [Observer](Documentacion/TODO.md)
* [Strategy](Documentacion/TODO.md)
* [Visitor](Documentacion/TODO.md)
* [State](Documentacion/TODO.md)
* [Template Method](Documentacion/TODO.md)

# Bibliography
* [design-patterns-for-humans](https://github.com/kamranahmedse/design-patterns-for-humans/blob/master/README.md#-simple-factory)
* [DesignPatterns](https://github.com/OmarElGabry/DesignPatterns)
* [java-design-patterns](https://github.com/iluwatar/java-design-patterns/tree/master/abstract-factory)
* [Design Patterns CD - ADDISON - WESLEY](ISBN13 9780201634983)
* [Diseño y Arquitectura de Software (2017) - Curso](http://www.uai.edu.ar)
* [Toon Robot images](http://tooncharacters.com)
* [Abstract Factory Design Pattern Youtube](https://www.youtube.com/watch?v=xbjAsdAK4xQ#t=23.063268)
