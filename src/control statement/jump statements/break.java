class Main
{
    public static void main(String[] args)
    {
        Student a1 = new Student("Yuvraj" , "Singh");
        System.out.println("Person's name:"+ a1.getName() + Student.age + a1.lName + a1.age );
        a1.setName("Yuvi");
        System.out.println(a1.getName());
        Student a2 = new Student("YASHU" , "KUMARI");
        System.out.println(a2.getName());
    }
}
class Student
{
    private String name; // we create getter and setter to get a value or update a value for private variable
    public String lName;
    public static int age = 22;
    
    public Student(String f , String l)
    {
        this.name = f;
        this.lName = l;
    }
    //getter for name
    public String getName()
    {
        return this.name;
    } 
    //setter for name
    public void setName(String x)
    {
        this.name = x;
    }
}
