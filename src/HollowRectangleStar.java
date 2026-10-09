/**
 * <pre>
 * ********************
 * *                  *
 * *                  *
 * *                  *
 * ********************
 * </pre>
 */
public class HollowRectangleStar {
    public static int WIDTH = 5;
    public static int LENGTH = 20;

    public static void main(String[] args) {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                if((i == 0 || i == WIDTH - 1) || (j == 0 || j == LENGTH - 1)){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
