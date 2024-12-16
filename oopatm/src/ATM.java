import java.util.Scanner;

public class ATM
{
    Scanner sc = new Scanner(System.in);
    public void çalıştır(Hesap hesap){

    Giriş login = new Giriş();

    System.out.println("X Bankamıza Hoşgeldiniz");
    System.out.println("**********************");
    System.out.println("Müşteri girişi");
    System.out.println("**********************");
    int giriş_hakkı= 3;


    while(true) {

        if (login.Giriş(hesap)){
            System.out.println("Giriş Başarılı");
        break;
    }
         else {
            System.out.println("Giriş Başarısız");
            giriş_hakkı--;
            System.out.println("Kalan Giriş Hakkınız :"+giriş_hakkı);

            if (giriş_hakkı == 0)
            {
                System.out.println("Giriş Hakkınız Bitti");
                return;
            }
        }
    }

        System.out.println("İŞLEMLER");
        System.out.println("**********************");
        String işlemler = "1 PARA YATIRMA\n"
                          +"2 PARA ÇEKME\n"
                          +"3 BAKİYE ÖĞRENME\n"
                          +"ÇIKIŞ İÇİN q YA BASIN";
        System.out.println(işlemler);

        while(true) {
            System.out.println("işlem seçin");
            String işlem = sc.nextLine();

            if (işlem.equals("q"))
            {
                break;
            }
            else if (işlem.equals("1"))
            {
                System.out.println("Yatırmak İstediğiniz Tutarı Girin");
                int tutar = sc.nextInt();
                sc.nextLine();
                hesap.parayatır(tutar);
            }
            else if (işlem.equals("2"))
            {
                System.out.println("Çekmek istediğiniz Tutarı Girin");
                int tutar = sc.nextInt();
                sc.nextLine();
                hesap.paraçek(tutar);
            }
            else if (işlem.equals("3"))
                System.out.println("BAKİYENİZ : "+hesap.getBakiye());

            else
            {
                System.out.println("Geçersiz İşlem");
            }
        }












    }
}
