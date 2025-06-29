import java.util.Random;
import java.util.Scanner;

class Search {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        final int n = 12;
        int[] a = new int[n];
        
        for (int j = 0; j < n; j++)
            a[j] = rand.nextInt(10);
        
        System.out.print("配列aの全要素の値\n{ "); // 配列の全要素を表示
        for (int j = 0; j < n; j++)
            System.out.print(a[j] + " ");
        System.out.println("}");
        
        System.out.print("探す数値：");
        int key = stdIn.nextInt();
        
        int i;
        for (i = 11; i >= 0; i--)
            if (a[i] == key)
                break;
            
        if (i < n)        
            System.out.println("それはa[" + i + "]にあります。");
        else
            System.out.println("それはありません。");

        int count = 0;
        for (int j = 0; j < n; j++)
            if (a[j] == key) count++;
        
        System.out.println("その数は " + count + " 回出現します。");
    }
}