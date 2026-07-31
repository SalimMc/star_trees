public class RightTriangleStar {
    public static int NB_LINES = 5;

    public static void main(String[] args) {
        for (int i = 0; i < NB_LINES; i++) {
            for (int j = 0; j < NB_LINES; j++) {
                if(j >= NB_LINES - i - 1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
                if(j == NB_LINES - 1) System.out.println();
            }
        }
    }
}
