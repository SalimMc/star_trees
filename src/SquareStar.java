/**
 * <pre>
 * *****
 * *****
 * *****
 * *****
 * *****
 * </pre>
 */
public class SquareStar {
    public static int SIDE_LENGTH = 5;

    public static void main(String[] args) {
        for (int i = 0; i < SIDE_LENGTH; i++) {
            for (int j = 0; j < SIDE_LENGTH; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
