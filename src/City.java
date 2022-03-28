public class City {
    private int id;
    private String name;
    private int population;
    public  City(int id, String name, int population){
        this.id = id;
        this.name = name;
        this.population = population;
    }
    public  void setId(int id){
        id = id;
    }
    public  int getId(){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public  String getName(){
        return name;
    }
    public  void setPopulation(int p){
        population = p;
    }
    public int getPopulation(){
        return population;
    }
    
}
