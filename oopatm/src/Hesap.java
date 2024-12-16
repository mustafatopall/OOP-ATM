public class Hesap {

    private String Kullanici_adi ;
    private String Kullanici_sifre ;
    private double bakiye;


    public Hesap(String kullanici_adi, String kullanici_sifre, double bakiye) {
        Kullanici_adi = kullanici_adi;
        Kullanici_sifre = kullanici_sifre;
        this.bakiye = bakiye;
    }

    public String getKullanici_adi() {
        return Kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        Kullanici_adi = kullanici_adi;
    }

    public String getKullanici_sifre() {
        return Kullanici_sifre;
    }

    public void setKullanici_sifre(String kullanici_sifre) {
        Kullanici_sifre = kullanici_sifre;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public void parayatır(double tutar){
        bakiye += tutar;
        System.out.println("Yeni Bakiyeniz :" +bakiye);
    }

    public void paraçek(double tutar){
        if (bakiye >= tutar){
            bakiye -= tutar;
            System.out.println("Yeni Bakiyeniz :" +bakiye);
        }
        else
            System.out.println("Yeterli Bakiyeniz Yok");
    }
}
