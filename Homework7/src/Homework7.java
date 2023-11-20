public class Homework7
{
    public static void main(String[] args)
    {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}

abstract class Printer
{
    protected String model;
    protected int printedCount, availableCount;
    abstract public boolean print();
    Printer(String m, int num)
    {
        this.model = m;
        this.availableCount = num;
        this.printedCount = 0;
    }


}

class InkjetPrinter extends Printer
{
    InkjetPrinter(String s,int num)
    {
        super(s,num);
    }

    @Override
    public boolean print()
    {
      if(availableCount == 0)
      {
          System.out.printf("%s: %d매째 인쇄 실패 - 잉크 부족.\n",model,printedCount+1);
          return false;
      }
      else if (availableCount >= 1)
      {
          printedCount++;
          availableCount--;
          return true;
      }
      else
      {
          System.out.println("Error");
          return false;
      }
    }
}
class LaserPrinter extends Printer
{
    LaserPrinter(String s, int num)
    {
        super(s, num);
    }

    @Override
    public boolean print() {
        if (availableCount == 0)
        {
            System.out.printf("%s: %d매째 인쇄 실패 - 토너 부족.\n", model, printedCount + 1);
            return false;
        }
        else if (availableCount >= 1)
        {
            printedCount++;
            availableCount--;
            return true;
        }
        else
        {
            System.out.println("Error");
            return false;
        }
    }
}