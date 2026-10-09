/**
 * <pre>
 * ********************
 * ********************
 * ********************
 * ********************
 * ********************
 * </pre>
 */
public class RectangleStar {
    public static int WIDTH = 5;
    public static int LENGTH = 20;

    public static void main(String[] args) {
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < LENGTH; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
