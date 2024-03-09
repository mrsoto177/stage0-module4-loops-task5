package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
    	
    	  for (int i = 0; i < sideLength; i++) { //iterar sobre las filas
              for (int j = 0; j < sideLength; j++) { //iterar en columnas del cuadrado
                  if ( j == sideLength / 2  || i == sideLength /2) {//se verificca que la primer y ultima fila esten llenas nadamas, si no es asi se imprime un espacio en blanco
                      System.out.print("8");
                  } else {
                      System.out.print(" ");
                  }
              }
              System.out.println();
          }
    }
    
    public static void main(String[] args) {
    	Cross cross = new Cross();
    	cross.printCross(5);
    }
}
