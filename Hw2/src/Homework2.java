import javax.naming.Name;
import java.util.IdentityHashMap;
import java.util.Scanner;

public class Homework2
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요:");
        s1.setId(sc.nextInt());
        s1.setName(sc.next());
        s1.setMajor(sc.next());
        s1.setHp(sc.next());

         s2.setId(sc.nextInt());
         s2.setName(sc.next());
         s2.setMajor(sc.next());
         s2.setHp(sc.next());

         s3.setId(sc.nextInt());
         s3.setName(sc.next());
         s3.setMajor(sc.next());
         s3.setHp(sc.next());

        System.out.println("입력된 학생들의 정보는 다음과 같습니다.\n");
        System.out.printf("첫번째 학생: %d %s %s %s\n",s1.getId(),s1.getName(),s1.getMajor(),s1.getHp());
        System.out.printf("두번째 학생:  %d %s %s %s\n",s2.getId(),s2.getName(),s2.getMajor(),s2.getHp());
        System.out.printf("세번째 학생:  %d %s %s %s\n",s3.getId(),s3.getName(),s3.getMajor(),s3.getHp());



    }
}

class Student
{
    private String major;
    private String name ;
    private int id;
    private int hp;

    public void setMajor(String major){this.major = major;}
    public void setName(String name){this.name = name;}
    public void setHp(String hp){this.hp = Integer.parseInt(hp);}
    public void setId(int id){this.id = id;}

    String getMajor(){return major;}
    String getName(){return name;}
    int getId(){return id;}
    String getHp()
    {
        String strHp = '0' + Integer.toString(hp);
        return strHp.substring(0,3)+'-'+strHp.substring(3,7)+'-'+strHp.substring(7,11);
    }






}