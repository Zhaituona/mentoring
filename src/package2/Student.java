package package2;

public class Student {
    public int studentID = 12;// declare and initialize variableAndMethod int type primitive variableAndMethod
    public String studentName = "Amina";
    public char studentGrade = 'A';
   public static String studentMajor ;

    public void displayStudentName(){//not return type method

        System.out.println(studentName);
    }
    public int getStudentID(){//return type method .

        return studentID;
    }
    public static void getStudentMajor(){

        System.out.println(studentMajor);
    }

}
