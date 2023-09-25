import java.util.Scanner;

public class Homework2
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setter();
        s2.setter();
        s3.setter();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.\n");
        System.out.print("첫번째 학생: ");
        s1.getter();
        System.out.print("두번째 학생: ");
        s2.getter();
        System.out.print("세번째 학생: ");
        s3.getter();


    }
}

class Student
{
    String major  = "major";
    String name = "name";
    int id = 0;
    int hp=0;

    void setter()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요:");
        id= sc.nextInt();
        name = sc.next();
        major = sc.next();
        String temp = sc.next();
        StringBuilder sb = new StringBuilder(temp);
        sb.deleteCharAt(0);
        temp = String.valueOf(sb);
        hp = Integer.parseInt(temp);

    }

    void getter()
    {
        String tChar;
        tChar = Integer.toString(hp);
        StringBuilder sb = new StringBuilder(tChar);
        sb.insert(2,"-");
        sb.insert(7,"-");
        sb.insert(0,"0");

        System.out.println( id+" "+ name+" "+ major+" " + sb);
    }
}