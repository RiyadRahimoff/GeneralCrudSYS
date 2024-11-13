package User;
public class User {
   private int id;
   private String Username;
   private int password;

   public User(int ID,String Username,int password){
      this.id =ID;
      this.Username=Username;
      this.password=password;
   }

   public int getId() {
      return id;
   }
   public  String getUsername(){
      return Username;
   }

   public int getPassword(){
      return password;
   }

   public void setId(int id) {
      this.id = id;
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
              "id=" + id +
              ", Username='" + Username + '\'' +
              ", password=" + password +
              '}';
   }
}
