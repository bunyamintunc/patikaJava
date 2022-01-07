import java.util.Scanner;

public class NotOrtalama {

    public static  void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("1.siniav : ");
        int birinciSinav=scanner.nextInt();

        System.out.print("2.siniav : ");
        int ikinciSinav=scanner.nextInt();

        System.out.print("3.siniav : ");
        int ucuncuSinav=scanner.nextInt();

        System.out.print("4.siniav : ");
        int dorduncuSinav=scanner.nextInt();

        System.out.print("5.siniav : ");
        int besinciSinav=scanner.nextInt();

        System.out.print("6.siniav : ");
        int alticiSinav=scanner.nextInt();

        int toplam=(birinciSinav+ikinciSinav+ucuncuSinav+dorduncuSinav+besinciSinav+alticiSinav);
        double sinavOrtalama=toplam/6.0;
        boolean ortalama=(sinavOrtalama>50);
        String sonuc=ortalama ? "gecti":"kaldi";

        System.out.println(sonuc);


    }
}
