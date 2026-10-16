
package myoop;

public class OOP {

    String name,bloodgroup,section;
    int phone;
    
    OOP(String name, String bloodgroup, String section, int phone){
        this.name = name;
        this.bloodgroup = bloodgroup;
        this.section = section;
        this.phone = phone;
}
    void displayInformation(){
        System.out.println("Name\t\t: "+name);
        System.out.println("Blood Group\t: "+bloodgroup);
        System.out.println("Section\t\t: "+section);
        System.out.println("Phone\t\t: 0"+phone);
        System.out.println("\n");
    }
    
}
