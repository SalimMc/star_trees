public class HollowDiamondStar {
    public static int NB_LINES = 6;
    public static int NB_COLUMNS = 11;

    public static void main(String[] args) {
        for (int i = 0; i < NB_LINES; i++) {
            for (int j = 0; j < NB_COLUMNS; j++) {
                if(NB_COLUMNS/2 - i == j || j == NB_COLUMNS/2 + i){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < NB_LINES; i++) {
            for (int j = 0; j < NB_COLUMNS; j++) {
                if(i == j || j == NB_COLUMNS - i - 1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
