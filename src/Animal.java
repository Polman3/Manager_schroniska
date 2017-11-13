public class Animal {
    private
    String name, type, race, health, sex;
    int age;

    public
    Animal(String nazwa, String typ, String rasa, String stan_zdrowia, String plec, int wiek){
        this.name = nazwa;
        this.type = typ;
        this.race = rasa;
        this.health = stan_zdrowia;
        this.sex = plec;
        this.age = wiek;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public String getRace(){
        return race;
    }

    public String getHealth(){
        return health;
    }

    public String getSex(){
        return sex;
    }

    public int getAge() {
        return age;
    }
}
