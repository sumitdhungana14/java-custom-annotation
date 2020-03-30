public class MyClass {

    public static void main(String[] args) {
    
        Game myGame = new Game("Football", "outdoor", true);
        JsonSerializer serializer = new JsonSerializer();
        try{
            serializer.serialize(myGame);
        }catch(JsonSerializeException e){
            System.out.println(e.getMessage());
        }
    }
}