package exception;

public class MusicNotFoundExcep extends RuntimeException{
   public MusicNotFoundExcep(){
       super("Music not found");
   }
   public MusicNotFoundExcep(String message){
       super(message);
   }
}
