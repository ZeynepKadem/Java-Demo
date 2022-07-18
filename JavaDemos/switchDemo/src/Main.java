public class Main {

    public static void main(String[] args) {
	// switch bloklarıyla dallandırma yapıyoruz.
        //case-> durum
        // grade-> not
        char grade='C';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
                System.out.println("Güzel : Geçtiniz");
                break;
            case 'C':
            case 'D':
                System.out.println("Ortalama : Geçtiniz");
                break;
            case 'F':
                System.out.println("Kötü : Kaldınız");
                break;
                // default bunların dışında başka bir not girerse
            default:
                System.out.println("Geçersiz not girdiniz.");

        }
    }
}
