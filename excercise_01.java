public class excercise_01 {
    public static void main(String[] args) {

    }
    public static void loop1() {
        int k = 4;
        for (int i = 1; i <= 5; i++) {
            int last_count = 0;
            for (int j = 0; j < k; j++) {
                System.out.print("*");
                last_count = j;
            }
            for (int a = last_count+1; ((a < 5) || ((k==0) && (a==5))); ++a) {
                if (i%2 == 0) {
                    System.out.print("E");
                } else {
                    System.out.print("O");
                }
            }
            k--;
            System.out.println();
        }
    }
    public static void loop2() {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
               if(i%2==0) {
                   if ((j == 0) || (j == 5)) {
                       System.out.print(" ");
                   } else {
                       System.out.print("*");
                   }
               } else {
                   System.out.print("*");
               }
            }
            System.out.println();
        }
    }
    public static void loop3() {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i%2!=0) {
                    if ((j<2) || (j>3)) {
                        System.out.print("O");
                    } else {
                        System.out.print("*");
                    }
                } else {
                    if ((j > 1) && (j < 4)) {
                        System.out.print("E");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
