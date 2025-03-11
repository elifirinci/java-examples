public class InheritanceAkademisyenler extends InheritanceExample {
    String ders_adi;

    public InheritanceAkademisyenler(String ad, String soyad, int telefon, String ders_adi) {
        super(ad, soyad, telefon);
        this.ders_adi = ders_adi;
    }

    
    public void bilgilerigoster( ){
        System.out.println("Adı:"+this.ad);
        System.out.println("Soyadı:"+this.soyad);
        System.out.println("ders adı:"+this.ders_adi);
        this.giris();



    }
    
}
