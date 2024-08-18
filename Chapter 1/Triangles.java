public class Triangles {

    
    public void printPyramid(int height) {
        for (int i = 0; i < height; i++) {
            
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
           
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        Triangles triangle = new Triangles();
        int height = 5; 
        triangle.printPyramid(height);
    }
}
