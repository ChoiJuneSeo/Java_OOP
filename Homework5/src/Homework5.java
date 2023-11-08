public class Homework5 {
    public static void main(String[] args)
    {
        Monitor m = new Monitor();
        Computer c = new Computer();
        PersonalComputer pc = new PersonalComputer();

        c.setCpu("Core i7");
        c.setMemory("16GB");
        c.setHd("2TB");
        c.setColor("White");
        c.setPower("500W");

        m.setColor("Black");
        m.setPower("45W");
        m.setMonitorSize("24 inch");

        pc.setComputer(c);
        pc.setMonitor(m);

        pc.turnOn();
        pc.printInfo();


    }
}
class PersonalComputer
{
    private Computer computer;
    private Monitor monitor;
    public void turnOn(){
        this.computer.turnOn();
        this.monitor.turnOn();
    }
    public void printInfo()
    {
        this.computer.printInfo();
        this.monitor.printInfo();
    }
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
class Monitor
{
    private String monitorSize;
    private String color;
    private String power;
    public void turnOn()
    {
        System.out.println("Turning on the monitor.");
    }
    public void printInfo()
    {
        System.out.println("The spec of the monitor");
        System.out.printf("Size: %s\n",getMonitorSize());
        System.out.printf("Color: %s\n",getColor());
        System.out.printf("Power: %s\n",getPower());
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setMonitorSize(String monitorSize) {
        this.monitorSize = monitorSize;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public String getMonitorSize() {
        return monitorSize;
    }

    public String getPower() {
        return power;
    }
}
class Computer
{
    private String cpu,memory,hd,color,power;
    public void turnOn()
    {
        System.out.println("Turning on the computer.");
    }
    public void printInfo()
    {
        System.out.println("The spec of the computer");
        System.out.printf("CPU: %s\n",getCpu());
        System.out.printf("Memory: %s\n",getMemory());
        System.out.printf("HDD: %s\n",getHd());
        System.out.printf("Color: %s\n",getColor());
        System.out.printf("Power: %s\n",getPower());
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public String getPower() {
        return power;
    }

    public String getCpu() {
        return cpu;
    }

    public String getHd() {
        return hd;
    }

    public String getMemory() {
        return memory;
    }
}