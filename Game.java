public class Game{

    @JsonField
    private String name;

    @JsonField
    private String type;

    @JsonField
    private boolean isPopular;

    public Game(String name, String type, boolean isPopular){
        this.name = name;
        this.type = type;
        this.isPopular = isPopular;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public boolean getIsPopular(){
        return isPopular;
    }

    public void setIsPopular(boolean isPopular){
        this.isPopular = isPopular;
    }
}
