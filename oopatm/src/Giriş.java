import java.util.Scanner;

public class Giriş {

    public boolean Giriş(Hesap hesap)
    {

        Scanner sc = new Scanner(System.in);
        String kullaciadı;
        String parola;

        System.out.println("Kullanıcı Adı :");
        kullaciadı = sc.nextLine();
        System.out.println("Parola :");
        parola = sc.nextLine();

        if (hesap.getKullanici_adi().equals(kullaciadı) && hesap.getKullanici_sifre().equals(parola))
        {
        return true;
        }

        else
            return false;


    }

}
