public class City {
    private int id;
    private String name;
    private int population;
    private String countryCode;
    public  City(int id, String name, int population, String countryCode){
        this.id = id;
        this.name = name;
        this.population = population;
        this.countryCode = countryCode;
    }
    public void setId(int id){
        id = id;
    }
    public  int getId(){
        return id;
    }
    public  void setName(String n){
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
    public void setCountryCode(String c){
        countryCode = c;
    }
    public  String getCountryCode(){
        return  countryCode;
    }
}
