public class InheritanceMemurlar extends InheritanceExample {
    int oda_numarası,maas;
    InheritanceMemurlar(String ad,String soyad,int telefon,int oda_numarası,int maas){
        super(ad,soyad,telefon);
        this.oda_numarası=oda_numarası;
        this.maas=maas;

    }
    public InheritanceMemurlar(){
        
    }
    public void bilgilerigoster( ){
        System.out.println("Adı:"+this.ad);
        System.out.println("Soyadı:"+this.soyad);
        System.out.println("oda numarası:"+this.oda_numarası);
        System.out.println("maası:"+this.maas);
        this.giris();



    }
    
}
