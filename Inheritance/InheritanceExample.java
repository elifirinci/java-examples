public class InheritanceExample{
    String ad,soyad;
    int telefon;
    static int giris_sayisi=0;
    public InheritanceExample(String ad,String soyad,int telefon){
        this.ad=ad;
        this.soyad=soyad;
        this.telefon=telefon;
    }
    public InheritanceExample(){
        System.out.println("Giriş yapıldı");

    }
    public void giris(){
        System.out.println("Çalışan giriş yaptı");
    }
    public static int girisSayısı(){
        return ++InheritanceExample.giris_sayisi;
    }
}