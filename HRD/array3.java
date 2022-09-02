public class Array3 {
    public static void main(String[] args) {

        int[] push = new int[20];

        for (int i = 0; i < push.length; i++) {

            push[i] = i+1;
            // int a = 0;
            // push[i] = a;
            // a++;
            System.out.print(push[i] + " ");
            
        }
        System.out.println();

        for (int i = 0; i < push.length; i++) {
            System.out.print(push[i] + " ");   
        }
        System.out.println();
System.out.println("-------------------------------------------------------------");   

        int[] zzz = new int[30];
        
        int sum = 0;
        for (int i = 0; i < zzz.length; i++) {
            zzz[i] = i+1;
            System.out.print(zzz[i] + " "); //배열세팅

            sum += zzz[i]; //합구하기
        }

        System.out.println(sum);

System.out.println("-------------------------------------------------------------");   

        int jpTest[] = {50,60,70,80,90};

        int sum1 = 0;
        int avg1 = 0;
        for (int i = 0; i < jpTest.length; i++) {
            sum1 += jpTest[i];
            avg1 = sum1/(jpTest.length);
        }

        System.out.println(sum1);
        System.out.println(avg1);

        int sum2 = 0;
        int avg2 = 0;
        for (int jpScore : jpTest) {
            sum2 += jpScore;   
            avg2 = sum2/(jpTest.length);
        }

        System.out.println(sum2);
        System.out.println(avg2);
    }
}
