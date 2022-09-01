package CH04_CD_RS;
// Double for
public class CH_04_Shape {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            for (int j = 0; j < i; j++) {

                System.out.print("z");

            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------------------");

        for (int i = 0; i < 4; i++) {

            for (int j = 4; j > i; j--) {

                System.out.print("z");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------------------");

        for (int i = 2; i <= 6; i++) {

            for (int j = 0; j < i / 2; j++) {
                System.out.print("z");
            }

            System.out.println();

        }

        System.out.println("--------------------------------------------------------------------------------------");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("z");
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    System.out.print("z");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------------------------------");

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("z\n");
        }
    }
}
