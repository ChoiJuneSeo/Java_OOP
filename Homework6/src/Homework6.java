public class Homework6 {
    public static void main(String[] args)
    {
        OfflineCourse course1 = new OfflineCourse("HAEA9201","Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012","C Programming 1");
        System.out.println(course1);
        System.out.println(course2);
    }
}

class Course
{
    protected String code,name;
    public Course(String _code, String _name)
    {
        this.code = _code;
        this.name = _name;
    }

    public String getCode() {return code;}

    public String getName() {return name;}
}
class OnlineCourse extends Course {
    public OnlineCourse(String _code, String _name) {
        super(_code, _name);
    }

    @Override
    public String toString() {
        String msg = "Code: " + code + ", Name: " + name + ", Type: Online";
        return msg;
    }
}
class OfflineCourse extends Course
{
    public OfflineCourse(String _code,String _name) {super(_code,_name);}
    @Override
    public String toString()
    {
        String msg = "Code: "+ code + ", Name: "+name+", Type: Offline";
        return msg;
    }
}