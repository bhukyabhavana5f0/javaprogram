/******************************************************************************

                          
class student
{
    int id;//attributes 
    String name;//method are used for calling block f code repeatedly
    public void details()
    {
        System.out.println("my id is :" + id);
        System.out.println("my name is :" + name);
    }
}
public class Main{
    public static void main(String[] args)
    {
        System.out.println(" creating custom class");
        student s1=new student();//creating a student object
        student s2=new student();
        
        s1.id=22;
        s1.name="sanjana";
        s2.id=90;
        s2.name="sathvika";
        s1.details();
        s2.details();
        //printing attributes
       // System.out.println(s.id);
       // System.out.println(s.name);
    //    s.id=22;
      //  s.name="sanjana";
        
    }
    
}