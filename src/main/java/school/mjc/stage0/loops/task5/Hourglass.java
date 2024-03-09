package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
    	  
              
              for (int ii = height; ii >= 1; ii--) {
                  for (int j = 0; j < height - ii; j++) {
                      System.out.print(" ");
                  }
                  for (int j = 0; j < 2 * ii - 1; j++) {
                      System.out.print("8");
                  }
                  System.out.println();
              }
          
    	  
    	  for (int i = 2; i <= height; i++) {
              for (int j = 0; j < height - i; j++) {
                  System.out.print(" ");
              }
              for (int j = 0; j < 2 * i - 1; j++) {
                  System.out.print("8");
              }
              System.out.println();
    	
    }}
    
    public static void main(String[] args) { 
    	Hourglass hourglass = new Hourglass();
    	hourglass.printHourglassOfGivenSize(50);
    }
    

}
