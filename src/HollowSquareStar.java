public class HollowSquareStar {
    public static int SIDE_LENGTH = 5;

    public static void main(String[] args) {
        for (int i = 0; i < SIDE_LENGTH; i++) {
            for (int j = 0; j < SIDE_LENGTH; j++) {
                if((i == 0 || i == SIDE_LENGTH - 1) || (j == 0 || j == SIDE_LENGTH - 1)){
                    System.out.print("+");
                } else{
                    System.out.print(" ");
                }
                if(j == SIDE_LENGTH - 1) System.out.println();
            }
        }
    }
}
