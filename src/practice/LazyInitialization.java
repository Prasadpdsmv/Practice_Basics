package practice;

public class LazyInitialization {

    // when we use New key word object is created
    /*// object cretion steps >Jvm load class
            >memory allocation heap memory
            >instance variable assigns like 0, null
            >constructor executed
            >reference obj is assigned to reference memory stack
    * */
    private static LazyInitialization InstanceCreationVariable;

    public static LazyInitialization getInstance(){
        if (InstanceCreationVariable == null){
            InstanceCreationVariable = new LazyInitialization();
        }
        return InstanceCreationVariable;
    }
    public static void main(String[] args) {
        LazyInitialization obj;//= new LazyInitialization();
       // obj=LazyInitialization.getInstance();

       // System.out.println(obj);


    }
}
