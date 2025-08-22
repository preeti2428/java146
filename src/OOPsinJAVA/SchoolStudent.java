package OOPsinJAVA;

public class SchoolStudent extends Person {
    public String course;

    public SchoolStudent(String address,String course){
        super(address);
        this.course=course;
    }
    public void getcourse(){
        System.out.println("Course"+course);
    }

}
