import java.util.Scanner;

public class Homework3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        System.out.print("몇 개의 정수를 입력하시겠습니까? ");
        int num = sc.nextInt();
        int[] iArr = new int[num];
        System.out.print("정수를 입력해주세요. ");
        for ( int  i = 0; i < num ; ++i)
        {
            iArr[i] = sc.nextInt();
        }

        int max = iArr[0];
        int min = iArr[0];
        for (int i = 0 ; i < num;++i)
        {
            if(iArr[i] > max)
            {
                max = iArr[i];
            }
            if(iArr[i] < min)
            {
                min = iArr[i];
            }
        }

        System.out.printf("입력된 정수들 중 최소값은 %d, 최대값은 %d 입니다.\n",min,max);

    }
}