import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Bir sayi giriniz : ");
            int sayi=input.nextInt();
            int i;
            int c=-1;
            int sum=0;

            for(i=0; i<=sayi; i++){
                if(i%3==0&&i%4==0){sum+=i;c++;}
            }
            System.out.println("3 ve 4 e bolunen sayilarin ortalamasi : "+sum/c);
        }
    }
    
}
