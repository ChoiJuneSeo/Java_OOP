import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.print("두 수를 입력하세요.");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.printf("두 수의 최대공약수는 %d입니다.(재귀함수)\n",gcd(m,n));
        System.out.printf("두 수의 최대공약수는 %d입니다.(반복문)\n",forgcd(m,n));

    }
    static int gcd(int a, int b)
    {
        if( a == 0 )
        {
            return a;
        }
        if(a % b == 0)
        {
            return b;
        }
        int temp = a%b;
        a = b;
        b = temp;
        return gcd(a,b);
    }
    static int forgcd(int a, int b)
    {
        for (int i = 0;;++i)
        {
            if( a == 0 )
            {
                return a;
            }
            if(a % b == 0)
            {
                return b;
            }
            int temp = a%b;
            a = b;
            b = temp;
        }
    }
}