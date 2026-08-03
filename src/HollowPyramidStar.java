public class HollowPyramidStar {
    public static int NB_LINES = 5;
    public static int NB_COLUMNS = 9;

    public static void main(String[] args) {
        for (int i = 0; i < NB_LINES; i++) {
            for (int j = 0; j < NB_COLUMNS; j++) {
                if(NB_COLUMNS/2 - i == j || j == NB_COLUMNS/2 + i || i == NB_LINES - 1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
