package User;
public class User {
   private int ID;
   private String Username;
   private int password;

   public User(int ID,String Username,int password){
      this.ID=ID;
      this.Username=Username;
      this.password=password;
   }

   public int getID() {
      return ID;
   }
   public  String getUsername(){
      return Username;
   }

   public int getPassword(){
      return password;
   }

   public void setID(int ID) {
      this.ID = ID;
   }
   public void setUsername(String username){
      this.Username=username;
   }
   public void setPassword(int ID){
      this.password=password;
   }

   @Override
   public String toString() {
      return "User{" +
              "ID=" + ID +
              ", Username='" + Username + '\'' +
              ", password=" + password +
              '}';
   }
}
