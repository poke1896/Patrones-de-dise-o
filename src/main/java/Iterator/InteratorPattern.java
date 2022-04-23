package Iterator;
import java.util.Iterator;
 // Patron de comportamiento interator
 
// Class 1
 

// Clase de automóvil que implementa la interfaz iterable, por lo que
// que podemos implementar el método iterador y
// agrega nuestra propia implementación
 
public class InteratorPattern implements Iterable<String> {
  private String[] cars;
  private int index;
 
  // Default Constructor
  public InteratorPattern() {
    cars = new String[10];
    index = 0;
  }
 
  // Method 1
  // Agregando método para agregar Autos
  public void addCar(String car) {
    if (index == cars.length) {
      String[] largerCars = new String[cars.length + 5];
      System.arraycopy(cars, 0, largerCars, 0, cars.length);
      cars = largerCars;
      largerCars = null;
    }
    cars[index] = car;
    index++;
  }
 
  // Method 2
  // Implementando el método iterador y
  // agregando su propia implementación
  @Override
  public Iterator<String> iterator() {
    Iterator<String> it = new Iterator<String>() {
 
      private int currentIndex = 0;
 
      // Method 3
      // Encontrar si durante la iteración si
      // hay siguiente elemento o no
      @Override
      public boolean hasNext() {
        return currentIndex < cars.length && cars[currentIndex] != null;
      }
 
      // Method 4
      // Voy a agarrar cada elemento del auto uno por uno
      // según el índice
      @Override
      public String next() {
        return cars[currentIndex++];
      }
 
      // Method 5
      @Override
      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
 
    return it;
  }
 
  // Method 6
 // Método del controlador principal
  public static void main(String[] args) {
 
    // Instanciando el objeto InteratorPattern
    InteratorPattern cars = new InteratorPattern();
 
    
// Agregando autos a la Matriz
    cars.addCar("Dodge");
    cars.addCar("Ferrari");
    cars.addCar("Sedan");
 
    
// Creando un iterador y apuntando el cursor
    // al índice justo antes del primer elemento en coches
    Iterator<String> carIterator = cars.iterator();
 
    // Comprobando si el siguiente elemento está disponible o no
    while (carIterator.hasNext()) {
      System.out.println(carIterator.next());
    }
  }
}
