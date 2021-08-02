import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args){

    //Question A
//        int i = 5;
//        while(i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//
//  Question B
//    int i = 2;
//        do {
//            i += 2;
//            System.out.println(i);
//
//        }while (i <= 100);

     //Question B Part 2
//        int i = 100;
//        do {
//            i += -5;
//            System.out.println(i);
//
//        }while (i >= -10);
//  //Question B Part 3
//        long i = 2;
//        do {
//            i *= i;
//            System.out.println(i);
//
//        }while (i <= 10000);

    //FOR LOOP FOR PART 1
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
    //FOR LOOP FOR 2 - 100
//        for (int i = 2; i <= 100 ; i += 2) {
//            System.out.println(i);
//        }
    //FOR LOOP FOR -10 - 100
        for (int i = 100; i >= -10; i -= 5) {
            System.out.println(i);
        }


    }
}
