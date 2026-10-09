/**
 * <pre>
 * *****
 * ****
 * ***
 * **
 * *
 * **
 * ***
 * ****
 * *****
 * </pre>
 */
public class ReverseHalfDiamondStar {
    public static int NB_LINES = 5;

    public static void main(String[] args) {
        for (int i = 0; i < NB_LINES; i++) {
            for (int j = 0; j < NB_LINES - i; j++) {
                System.out.print("*");
                if(j == NB_LINES - i - 1) System.out.println();
            }
        }
        for (int i = 1; i < NB_LINES; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
                if(j == i) System.out.println();
            }
        }

    }
}
