public class Array4_Test {
    public static void main(String[] args) {
        int aa[] = { 100, 200, 300, 400 };
        int[] bb = { 100, 200, 300 };
        int cc[];
        cc = new int[] { 100, 200 };
        int dd[] = new int[1];
        dd[0] = 100;

        for (int i = 1; i < 5; i++) {

            switch (i) {
                case 1:
                    for (int j = 0; j < aa.length; j++) {
                        System.out.printf("aa[%d] = %d ", j, aa[j]);
                    }
                    System.out.println();
                    break;

                case 2:
                    for (int j = 0; j < bb.length; j++) {
                        System.out.printf("bb[%d] = %d ", j, aa[j]);
                    }
                    System.out.println();
                    break;

                case 3:
                    for (int j = 0; j < cc.length; j++) {
                        System.out.printf("cc[%d] = %d ", j, aa[j]);
                    }
                    System.out.println();
                    break;

                case 4:
                    for (int j = 0; j < dd.length; j++) {
                        System.out.printf("dd[%d] = %d ", j, aa[j]);
                    }
                    break;
            }

        }

    }
}
