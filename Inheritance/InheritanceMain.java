public class InheritanceMain {
    public static void main(String[] args){
        InheritanceMemurlar memur_1=new InheritanceMemurlar("Ali","Yılmaz",053456,34,3450);
        System.out.println("1.memura ait bilgiler");
        memur_1.bilgilerigoster();
        System.out.println(memur_1.girisSayısı());
        InheritanceMemurlar memur_2=new InheritanceMemurlar();//InheritanceExample constructorı otomatik çağrıldı
        System.out.println("*****************************************************");

        InheritanceAkademisyenler akademisyen=new InheritanceAkademisyenler("Ayse", "As", 056747, "Math");
        System.out.println("Akademisyene ait bilgiler");
        akademisyen.bilgilerigoster();
        System.out.println(akademisyen.girisSayısı()+" çalışan giriş yaptı");


    }
    
}
