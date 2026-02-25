import java.util.Scanner;

public class Cau1_Phan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập Chuỗi: ");
        String str = input.nextLine();

        if (str.isEmpty()) {
            System.out.println("Noi Dung Nhap Rong");
        } else {

            String emailRegex = "^[a-zA-Z0-9._]+@gmail\\.com$";

            if (str.matches(emailRegex)) {
                System.out.println("Email hop le");
            } else {
                System.out.println("Email khong hop le");
            }
        }
    }
}
