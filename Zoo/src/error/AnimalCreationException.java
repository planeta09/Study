package error;

public class AnimalCreationException extends RuntimeException{
    public AnimalCreationException(){
        super("Name of animal can't be empty!");
    }
}
