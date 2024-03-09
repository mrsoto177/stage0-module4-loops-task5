package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
    	 // Print top row
        for (int i = 0; i < length; i++) {
            System.out.print("8");
        }
        System.out.println();

        // Print middle rows
        for (int i = 2; i < height; i++) {
            System.out.print("8");
            for (int j = 2; j < length; j++) {
                System.out.print(" ");
            }
            System.out.println("8");
        }

        // Print bottom row
        for (int i = 0; i < length; i++) {
            System.out.print("8");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
    	Rectangle rectangle = new Rectangle();
    	rectangle.printRectangleFrom8s(0, 0);
    }
    
}
