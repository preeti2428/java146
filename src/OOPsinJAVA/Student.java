package OOPsinJAVA;
//
//public class Student{
//    String name;
//    int roll_no;
//    double percent;
//    //final String school_name=:"BPS";// hmesha same value rhegi
//   // static int numberofstudents; //  ye dabbad create hojaega jaisw name ,roll_no ye sab non static hai mtlb sirf blue print hai inke pass dibba nhi hota
//
//
//
//    public Student(String naam,int roll,double per){
//        name=naam;
//        roll_no=roll;
//        percent=per;
//        //numberofstudents++;
//
//
//    }
//
//    public int getRoll_no(){  //getter
//        return roll_no;
//    }
//
//    public void setRoll_no(int roll){
//        roll_no=roll;
//    }
//
//}

public class Student{
    private String grade;
    public int roll_no;

    public Student(String grade){
        this.grade=grade;
    }


    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade){
        this.grade=grade;
    }
}
