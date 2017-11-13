public class Animal {

    private String name, type, race, health, sex;
    private int age;

    public
    Animal(String nazwa, String typ, String rasa, String stan_zdrowia, String plec, int wiek){
        this.name = nazwa;
        this.type = typ;
        this.race = rasa;
        this.health = stan_zdrowia;
        this.sex = plec;
        this.age = wiek;
    }
    //Getters and setters
    public String getName(){
        return name;
    }
    public void setName(String nazwa){
        this.name = nazwa;
    }
    public String getType(){
        return type;
    }
    public void setType(String typ){
        this.type = typ;
    }
    public String getRace(){
        return race;
    }
    public void setRace(String rasa){
        this.race = rasa;
    }
    public String getHealth(){
        return health;
    }
    public void setHealth(String stan_zdrowia){
        this.health = stan_zdrowia;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String plec){
        this.sex = plec;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int wiek){
        this.age = wiek;
    }
}
