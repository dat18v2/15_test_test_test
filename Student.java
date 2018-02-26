 public class Student{

   private String name;
   private String phone;
   private int age;
   
   //constructors
   public Student(){
   
   }
   
   public Student(String name, String phone, int age){
      this.name = name;
      this.phone = phone;
      this.age = age;
   }
   
   //set
   public void setStudent(String name, String phone, int age){
      this.name = name;
      this.phone = phone;
      this.age = age;
   }
   
   public void setStudentName(String name){
      this.name = name;
   }
   
   public void setStudentPhone(String phone){
      this.phone = phone;
   }
   
   public void setStudentAge(int age){
      this.age = age;
   }
   
   //printStudentInfo()
   public void printInfo(){
      System.out.println("Student name: " + name);
      System.out.println("Student phone: " + phone);
      System.out.println("Student age: " + age);
      //check alder for SU-berettigelse
      if (age<18){
         System.out.println("Mor og far betaler - eller få et job");
      }
      else if (18<=age && age<70){
         System.out.println("Potentielt SU-berettiget");
      }
      else{
         System.out.println("Pensionist");
      }
      
      System.out.println();
   } 
   
}