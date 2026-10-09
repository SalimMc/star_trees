/**
 * <pre>
 * ***********
 *  *       *
 *   *     *
 *    *   *
 *     * *
 *      *
 * </pre>
 */
public class ReverseHollowPyramidStar {
    public static int NB_LINES = 6;
    public static int NB_COLUMNS = 11;

    public static void main(String[] args) {
        for (int i = 0; i < NB_LINES; i++) {
            for (int j = 0; j < NB_COLUMNS; j++) {
                if(i == j || j == NB_COLUMNS - i - 1 || i == 0){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
