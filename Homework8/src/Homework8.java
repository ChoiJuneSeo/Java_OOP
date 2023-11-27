import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Homework8
{

    static boolean searchID(String s, Map<String,String> m)
    {
        if(m.containsKey(s))
        {return true;}
        return false;
    }
    static boolean searchPw(String id,String pw, Map<String,String> m)
    {
        if(m.get(id).equals(pw))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Map<String,String> m = new HashMap<>();
        m.put("myId","myPass");
        m.put("myId2","myPass2");
        m.put("myId3","myPass3");

        do
        {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            String inputID = sc.next().trim();
            if(!searchID(inputID,m))
            {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }
            System.out.print("password: ");
            String inputPassword = sc.next().trim();
            if(!searchPw(inputID,inputPassword,m))
            {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }
            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }while(true);




    }
}