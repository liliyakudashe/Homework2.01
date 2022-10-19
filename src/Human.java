import java.time.LocalDate;
import java.util.Objects;

public class Human {

    private String name;
    private int dateOfBirth;
    private String cityOfResidence;
    private String post;

    Human(String name, int age, String cityOfResidence, String post){
        this.name = name;
        if (this.name == null){
            this.name = "Информация не указана";
        }
        this.dateOfBirth = LocalDate.now().getYear() - age;
        if (dateOfBirth >= -1){
            this.dateOfBirth = LocalDate.now().getYear() - Math.abs(age);
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

    public void setName(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()){
            this.name = name;
        }

    }

    public int getAge() {
        return LocalDate.now().getYear() - dateOfBirth;
    }


    public String getCityOfResidence() {
        return cityOfResidence;
    }

    public void setCityOfResidence(String cityOfResidence) {
        if (cityOfResidence != null && !cityOfResidence.isEmpty() && !cityOfResidence.isBlank())
        this.cityOfResidence = cityOfResidence;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        if (post != null && !post.isEmpty() && !post.isBlank())
        this.post = post;
    }

    public String toString() {
        return ("Привет! Меня зовут " + name +
                ". Я из города " + cityOfResidence +
                ". Я родился в " + getAge() + " году. Я работаю на должности " + post + ". Будем знакомы!");
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
