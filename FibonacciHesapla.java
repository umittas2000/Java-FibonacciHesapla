import java.util.Scanner;
public class FibonacciHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,n1=0,n2=1,n3=0;

        System.out.print("Fibonacci uzunlugu icin bir sayi girin: ");
        sayi = input.nextInt();

        System.out.print("0 ");
        System.out.print("1 ");

        for(int i=2;i<=sayi;++i)
        {
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
