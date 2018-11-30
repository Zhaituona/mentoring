package package1;
import package2.Student;


import static package2.Student.getStudentMajor;

public class TestCar {
    public static void main(String[] args) {
        Car myCar = new Car();
       Student st1 = new Student();
       st1.getStudentID();
       st1.displayStudentName();
       Student.getStudentMajor();
        Student.getStudentMajor();






       MordenCar car2 = new MordenCar();
       // car2.getCarPrice();

        myCar.displayCarModel();
        myCar.displayCarYear();

        System.out.println("The price of my new car  : "+ myCar.getCarPrice());
        System.out.println("The make of my car is  : " + myCar.getMake());
        System.out.println(car2.carName  + " " + car2.carPrice);
        System.out.println(car2.displayCarName());
    }
}
// 5+5 = 10;

// 5+1= 6;
