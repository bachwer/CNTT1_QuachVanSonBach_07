import java.util.Scanner;

public class Cau2_Phan2 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n =  input.nextInt();

        int[] arr =  new int[n];

        System.out.print("Nhập arr: ");
        for(int i = 0 ; i < n; i++){
            arr[i] = input.nextInt();
        }

        int count = 0;

        int index = 0;

        for (int i = 0; i < n; i++) {
            int checkCount = 1;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[j - 1] + 1) {
                    checkCount++;
                } else {
                    break;
                }
            }

            if (checkCount > count) {
                count = checkCount;
                index = i;
            }
        }
        System.out.println("Độ Dài: "+ count);
        System.out.print("Dãy: ");
        for (int i = index; i < index + count; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}


//1 2 3 2 3 4 5 1