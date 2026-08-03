public class ReverseLeftTriangleStar {
    public static int NB_LINES = 5;

    public static void main(String[] args) {
        for (int i = 0; i < NB_LINES; i++) {
            for (int j = 0; j < NB_LINES - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
