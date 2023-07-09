

public class User implements Comparable <User>{
   private String firstName;
   private String secondName;
   private String phoneNumber;
   private int age;

public User(String firstName, String secondName, String phoneNumber, int age) {
      this.firstName = firstName;
      this.secondName = secondName;
      this.phoneNumber = phoneNumber;
      this.age = age;
}


   public String getFirstName() {
      return this.firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getSecondName() {
      return this.secondName;
   }

   public void setSecondName(String secondName) {
      this.secondName = secondName;
   }

   public String getPhoneNumber() {
      return this.phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public int getAge() {
      return this.age;
   }

   public void setAge(int age) {
      this.age = age;
   }
   
   @Override
   public int compareTo(User o){
       Integer age = this.age;
       return age.compareTo(o.getAge());
   }

   @Override
   public String toString() {
      return "{" +
         " firstName='" + getFirstName() + "'" +
         ", secondName='" + getSecondName() + "'" +
         ", phoneNumber='" + getPhoneNumber() + "'" +
         ", age='" + getAge() + "'" +
         "}";
   }

}
