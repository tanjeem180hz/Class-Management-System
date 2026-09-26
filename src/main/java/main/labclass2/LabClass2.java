
package main.labclass2;
public class LabClass2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Student student1 = new Student();
        student1.read();
        student1.name= "Muhammad Tanjeem";
        student1.id = "252-15-817";
        student1.section = "69_I";
        student1.address = "Mirpur 10";
        student1.displayInfo();
        
        Student student2 = new Student();
        student2.name = "Deloyear Hossain";
        student2.id = "No id";
        student2.section= "No section";
        student2.address = "Mirpur 10";
        student2.displayInfo();
        
        Section i_69 = new Section();
        i_69.showDisplayInfo();
        
    }
}
class Student{
    String name;
    String id;
    String section;
    String address;
    void read(){
        System.out.println("Student is reading.");
    }
    void displayInfo(){
        System.out.println("Name\t:"+name);
        System.out.println("ID\t:"+id);
        System.out.println("Section\t:"+section);
        System.out.println("Address\t:"+address);
    }
}
