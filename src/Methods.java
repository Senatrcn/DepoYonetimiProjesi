import java.util.*;

public class Methods {

    static Scanner scan = new Scanner(System.in);
    static Map<Integer,Urun> urunListesi=new HashMap<>();
    static List<Integer> rafListesi=new ArrayList<>(Arrays.asList(1,2,3));


    public static void girisEkrani(){

        System.out.println("Lütfen yapmak istediğiniz işlemi seçin\n"
                + "Ürün tanımlama : 1\n"
                + "Ürün listeleme : 2\n"
                + "Ürün girişi :3\n"
                + "Ürün rafa koyma : 4\n"
                + "Ürün çıkışı : 5\n"
                + "İşlemi bitirme : 6");

        String secim = scan.nextLine();

        switch (secim) {
            case "1":
                urunTanimla();
                break;
            case "2":
                urunListele();
                break;
            case "3":
                urunGirisi();
                break;
            case "4":
                urunRafaKoy();
                break;
            case "5":
                urunCikis();
                break;
            case "6":
                bitir();
                break;
            default:
                System.out.println("Hatalı giriş yaptınız. Tekrar deneyin");
                break;
        }
        girisEkrani();

    }


    public static void urunTanimla(){

        System.out.println("Ürün ismini girin");
        String urunIsmi=scan.nextLine().toUpperCase();
        System.out.println("Üretici bilgisini girin");
        String uretici=scan.nextLine().toUpperCase();
        System.out.println("Birim bilgisini girin");
        String birim=scan.nextLine().toUpperCase();
        System.out.println("Birim bilgisini girin");
        int urunId=scan.nextInt();
        scan.nextLine();
        Urun urun = new Urun(urunId,urunIsmi,uretici,birim);

        urunListesi.put(urun.getId(),urun);

        System.out.println("Ürün kaydı tamamlandı");

    }
    public static void urunListele(){

        System.out.println("burası erkam beyin branchinden gelecek");



    }
    public static void urunGirisi(){

        System.out.println("burası furkan beyin branchinden gelecek");

    }
    public static void urunRafaKoy(){

        System.out.println("burası erkam beyin branchinden gelecek");

    }
    public static void urunCikis(){

        System.out.println("burası furkan beyin branchinden gelecek");

    }
    private static void bitir() {
        System.out.println("Yine bekleriz :)");
        System.exit(0);
    }

}
