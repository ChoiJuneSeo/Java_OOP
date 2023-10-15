import java.util.Scanner;
public class Project1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] sArr = new String[10];         //  history buffer
        String lastInst = null;
        int exit = 0;
        System.out.println("jshell> ");
        while(exit == 0)
        {
            String inst = sc.nextLine();
            for (int i = 0;i < 10;++i)          // history buffer 채우기
            {
                if (sArr[i] == null)
                {
                    sArr[i] = inst;
                    break;
                }
            }

            if(inst.charAt(0)!='/')
            {
                System.out.printf("Running '%s'\n",inst);
            }
            else
            {
                switch (inst)
                {
                    case "/help":
                        System.out.println("Type a Java language expression, statement, or declaration.");
                        System.out.println("Or type one of the following commands :");
                        System.out.println("/list: list the source you have typed.");
                        System.out.println("/exit: exit the jshell tool.");
                        System.out.println("/history: history of what you have typed.");
                        System.out.println("/! rerun last snippet.");
                        break;
                    case "/history":
                        for ( String s : sArr)
                        {
                            if(s != null )
                            {System.out.println(s);}
                        }
                        break;
                    case "/list":
                        int i = 1;
                        for ( String s : sArr)
                        {
                            if(s != null && s.charAt(0)!='/')
                            {System.out.printf("%d :%s\n",i++,s);}
                        }
                        break;
                    case "/!":
                        for ( String s : sArr)
                        {
                            if ( s != null && s.charAt(0)!='/')
                            {lastInst = s;}
                        }
                        System.out.printf("Re-running '%s'.\n",lastInst);
                        break;
                    case "/exit":
                        exit = 1;
                        System.out.println("Goodbye.");
                        break;
                    default:
                        System.out.printf("Invalid command: %s\nType /help for help.\n",inst);
                        break;
                }
                if( sArr[9]!=null)      // history buffer 초기화
                {
                    for( int i = 0; i < 10; ++i)
                    {sArr[i] = null;}
                    System.out.println("The history buffer is cleared.");
                }
            }
        }
    }
}


