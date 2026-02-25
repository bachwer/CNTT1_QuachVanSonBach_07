import java.util.Scanner;

public class Cau2_Phan1 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n =  input.nextInt();

        int[] arr =  new int[n];

        System.out.print("Nhập arr: ");
        for(int i = 0 ; i < n; i++){
            arr[i] = input.nextInt();
        }

        boolean[] visited = new boolean[n];
        System.out.print("Mảng sau khi bỏ các số trùng lặp: ");

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            System.out.print(arr[i] + " ");

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                }
            }
        }
    }
}
