import java.util.Arrays;
import java.util.Scanner;

public class Cau1_Phan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập Chuỗi: ");
        String str = input.nextLine();


        if (str == null || str.trim().isEmpty()) {
            System.out.println("Noi Dung Nhap Rong");
            return;
        }


        str = str.trim().toLowerCase();


        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                char c = Character.toUpperCase(words[i].charAt(0));
                words[i] = c + words[i].substring(1);
            }
        }

        String result = String.join(" ", words);
        System.out.println(result);








    }
}