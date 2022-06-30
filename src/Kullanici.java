import java.util.Scanner;
public class Kullanici {
    public static void main(String[] args) {
        String userName, password, change, code, yeniSifre;

        Scanner inp = new Scanner(System.in);
        System.out.println(" Kullanici Adi: ");
        userName = inp.nextLine();
        System.out.println("Sifreniz: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giris Yaptiniz!");
        } else {
            System.out.print("Hatali Giris Yaptiniz!!");
            System.out.println(" Sifrenizi degistirmek ister misiniz ? ");
            change = inp.nextLine();
            if (change.equals("Evet")) {
                System.out.println("Lutfen Email adresinizi kontrol edin. Sifre sifirlamak icin Email gonderilmistir.");
                System.out.println("Lutfen gonderilen 4 haneli kodu yaziniz: ");
                code = inp.nextLine();
                if (code.equals("1234")) {
                    System.out.println("Yeni sifre girebilirsiniz.");
                    yeniSifre = inp.nextLine();
                    if (yeniSifre.equals("java123")) {
                        System.out.println("Yeni sifre eskisi ile ayni olamaz.Tekrar deneyiniz!!");

                    } else {
                        System.out.println(" Yeni sifreniz kaydedilmistir.");
                    }
                } else {
                    System.out.println("Yanlis kod girdiniz!!");
                }
            }
        }

    }}

