import java.util.*;
public class App {
    public static void printbinary (int[] binary, int banyak){
        for(int i = banyak-1; i >= 0; i++){
            System.out.println(binary[i]+"");
        }
        System.out.println();

    }
    public static void bnum(int n){
        int [] binary = new int[100];
        int banyak = 0;

        while(n > 0)
        {
            binary[banyak++] = n%2;
            n = n/2;
        }
        printbinary(binary, banyak);
    }
    public static void bstep(int n) {
        int i = 0;
        System.out.println("The result of Binary Number");
        while(n > 0){
            System.out.println("step"+(++i)+": "+n+"/2,"+" Remainder ="+n%2+", Quotient = "+n/2);
            n = n/2;
        }
        
    }
    public static void main(String[] args) throws Exception {
        int input;
        int angka = 0;
        System.out.println("Binary Number Calculation");
        System.out.println("==================");

        Scanner baca = new Scanner (System.in);
            System.out.println("1. Binary Number");
            System.out.println("2. Binary Number with Step");
            System.out.println("3. Exit");
            do{
                System.out.println("masukkan :");
                input = baca.nextInt();
            }while(input < 1 || input > 3);

            if(input == 1){
                do{
                    try{
                        System.out.println("Input the Number [1 - 100]"+ angka);
                        angka = baca.nextInt();
                    }catch(Exception e){
                        System.out.println("Error");
                        System.out.println(e);
                    };
                }while(angka < 1 || angka > 100);
                bnum(angka);

            }
           
            if(input == 2){
                do{
                try{
                    System.out.println("Input the Number [1 - 100]");
                    angka = baca.nextInt();
                }catch(Exception e){
                    System.out.println("Error");
                    System.out.println(e);
                };
            }while(angka < 1 || angka > 100);
            bstep(angka);
            }

            if(input == 3){
                System.out.println("Thank You");
            }

    }
}
