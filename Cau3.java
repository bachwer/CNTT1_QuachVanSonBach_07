import java.util.Scanner;

public class Cau3 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter Str1: ");
        String str1 = input.nextLine();
        str1 = str1.toLowerCase().replaceAll("\\s+", "");

        System.out.print("Enter Str2: ");
        String str2 = input.nextLine();
        str2 = str2.toLowerCase().replaceAll("\\s+", "");

        if(str1.length() != str2.length()){
            System.out.println("Hai Chuoi Khong Phai Anagram !");
            return;
        }



        for(int i = 0; i < str1.length(); i++){
            char ch = str1.charAt(i);
            if (str1.indexOf(ch) < i) {
                continue;
            }
            int count1 = 0;
            int count2 = 0;


            for(int j = 0; j < str1.length(); j++){
                if(ch == str1.charAt(j)){
                    count1++;
                }

            }


            for (int k = 0; k < str2.length(); k++) {
                if (ch == str2.charAt(k)) {
                    count2++;
                }
            }

            if(count1 != count2){
                System.out.println("Hai Chuoi Khong Phai Anagram !");
                return;
            }

        }

        System.out.println("Hai chuoi la Anagram");

    }
}


//Dormitory
//Dirty room




//listen
//silent