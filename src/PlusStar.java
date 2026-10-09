/**
 * <pre>
 *     *
 *     *
 * *********
 *     *
 *     *
 * </pre>
 */
public class PlusStar {
    public static int NB_LINES = 5;
    public static int NB_COLUMNS = 9;

    public static void main(String[] args) {
        for (int i = 0; i < NB_LINES; i++) {
            for (int j = 0; j < NB_COLUMNS; j++) {
                if(i == NB_LINES/2 || j == NB_COLUMNS/2){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
