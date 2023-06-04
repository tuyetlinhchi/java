import java.util.*;

class Person{
    protected String name;
    protected String address;
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    String getName(){   return name;    }
    String getAddress(){    return address; }
    void setAddress(String address){   this.address = address;    }
    public String toString(){
        return "Person[name=" + name + ", address=" + address + "]";}

}

class Student extends Person{
    String Program;
    int year;
    double fee ;
    Student(String name, String address, String Program, int year, double fee){
        super(name, address);
        this.Program = Program;
        this.year = year;
        this.fee = fee;
    }
    String getProgram(){    return Program; }
    void setProgram(String Program){    this.Program = Program; }
    int getYear(){  return year; }
    void setYear(int year){ this.year = year; }
    double getFee(){    return fee ; }
    void setFee(double fee){    this.fee = fee; }
    public String toString(){
        return "Student[Person[name=" + name + ", address=" + address + "], program=" + Program + ", year=" + year + ", fee=" + String.format("%.2f", fee) + "]";
    }
}

class Staff extends Person{
    String school;
    double pay;
    Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }
    String getSchool(){ return school; }
    void setSchool(String school){  this.school = school; }
    double getPay(){    return pay; }
    void setPay(double pay){    this.pay = pay; }
    public String toString(){
        return "Staff[Person[name=" + name + ", address=" + address + "], school=" + school + ", pay=" + String.format("%.2f", pay) + "]";
    }
}
public class ExtendsPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(sc.hasNextLine()){
            String type = sc.nextLine();
            switch (type){
                case "P":
                    String name = sc.nextLine();
                    String address = sc.nextLine();
                    Person p = new Person(name, address);
                    System.out.println(p.toString());
                    break;
                case "St":
                    name = sc.nextLine();
                    address = sc.nextLine();
                    String program = sc.nextLine();
                    int year = sc.nextInt();
                    double fee = sc.nextDouble();
                    sc.nextLine();
                    Student s = new Student(name, address, program, year, fee);
                    System.out.println(s.toString());
                    break;
                case "Sf":
                    name = sc.nextLine();
                    address = sc.nextLine();
                    String school = sc.nextLine();
                    double pay = sc.nextDouble();
                    sc.nextLine();
                    Staff st = new Staff(name, address, school, pay);
                    System.out.println(st.toString());
                    break;
            }
        }
    }
}