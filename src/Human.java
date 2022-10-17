import java.util.Objects;

public class Human {

    private String name;
    private int dateOfBirth;
    private String cityOfResidence;
    private String post;

    Human(String name, int dateOfBirth, String cityOfResidence, String post){
        this.name = name;
        if (this.name == null){
            this.name = "Информация не указана";
        }
        this.dateOfBirth = dateOfBirth;
        if (dateOfBirth >= -1){
            this.dateOfBirth = Math.abs(dateOfBirth);
        }
        this.cityOfResidence = cityOfResidence;
        if (this.cityOfResidence == null){
            this.cityOfResidence = "Информация не указана";
        }
        this.post = post;
        if (this.post == null){
            this.post = "Информация не указана";
        }
    }

    public String getName() {
        return name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCityOfResidence() {
        return cityOfResidence;
    }

    public String getPost() {
        return post;
    }

    public String toString() {
        return ("Привет! Меня зовут " + name +
                ". Я из города " + cityOfResidence +
                ". Я родился в " + dateOfBirth + " году. Я работаю на должности " + post + ". Будем знакомы!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return dateOfBirth == human.dateOfBirth && Objects.equals(name, human.name) && Objects.equals(cityOfResidence, human.cityOfResidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dateOfBirth, cityOfResidence);
    }
}
