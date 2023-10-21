package day01;

import java.util.Scanner;

public class HavaEtkinlik {
    public static void main(String[] args) {

        System.out.println("sıcaklık değerini giriniz: ");
        System.out.println("1-)5 dereceden küçük\n2-)5 ile 15 derece arası\n3-)15 ile 25 derece arasında\n4-)25 dereceden büyük ");
        Scanner input= new Scanner(System.in);
        
        int sicaklik=input.nextInt();
        switch    (sicaklik){

            case (1) :
                System.out.println("kayak yapabilirsiniz.");
                break;

            case 2:
                System.out.println("sinemaya gidebilirsiniz.");
                break;

            case 3:
                System.out.println("pikniğe gidebilirsiniz.");
                break;

            case 4:
                System.out.println("yüzmeye gidebilirsiniz.");
                break;

            default:
                System.out.println("hatalı giriş yaptınız.");
                break;

        }

    }
}
