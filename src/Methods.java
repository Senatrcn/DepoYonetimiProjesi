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

        System.out.println("burası sena dan gelecek");

    }


    public static void urunListele(){
            System.out.printf("%-7s %-14s %-25s %-15s %-14s %-5s\n", "Id", " İsim", " Üretici", " Miktar","Birim","Raf");
            System.out.println("-------------------------------------------------------------------------------------");
            Collection<Urun> valueSet = urunListesi.values();
            for (Urun u:valueSet){
                System.out.printf("%-8d %-14s %-25s %-14s %-14s %-5d",u.getId(),u.getUrunIsmi(),u.getUretici(),u.getMiktar(),u.getBirim(),u.getRaf());
                System.out.println();
            }
            System.out.println();
    }
    public static void urunGirisi(){

        System.out.println("burası furkan beyin branchinden gelecek");

    }
    public static void urunRafaKoy(){
        urunListele();
        System.out.println("Rafa yerlestirmek istediginiz ürün id bilgisini girin");
        int urunId=0;
    }
    public static void urunCikis(){

        System.out.println("burası furkan beyin branchinden gelecek");

    }
    private static void bitir() {
        System.out.println("Yine bekleriz :)");
        System.exit(0);
    }

}
