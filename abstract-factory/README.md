# Abstract factory

### intent 
provide an interface for creating families of related or dependent objects without specifying their concrete classes

### Applicability
Use the Abstract Factory pattern when

- a system should be independent of how its products are created, composed and represented.
- a system should be configured with one of multiple families of products
- a family of related product objects is designed to be used together, and you need to enforce this constraint
- you want to provide a class library of products, and you want to reveal yous their interface, not their implementation

### Participants 

- AbstractFactory
- ConcreteFactory
- AbstractProduct
- ConcreteProduct
- Client

### Consequences

- It isolates concrete classes
- It makes exchanging product families easy
- It promotes consistency among products
- Supporting new kinds of products is difficult

```mermaid
classDiagram

class AbastractFactoy{
    createProductA()
    createProductB()
}
class ConcreteFactory1{
    createProductA()
    createProductB()
}
class ConcreteFactory2{
    createProductA()
    createProductB()
}
AbastractFactoy -- ConcreteFactory1
AbastractFactoy -- ConcreteFactory2
Client --|> AbastractFactoy
Client --|> AbstractProductA
Client --|> AbstractProductB
AbstractProductA -- ProductA2
AbstractProductA -- ProductA1
AbstractProductB -- ProductB2
AbstractProductB -- ProductB1
ProductA2 .. ConcreteFactory2
ProductB2 .. ConcreteFactory2
ProductA1 .. ConcreteFactory1
ProductB1 .. ConcreteFactory1
```