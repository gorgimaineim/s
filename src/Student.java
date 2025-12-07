public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    static int amount;

    public Student(){}

    public Student(String firstName, String lastName, int age, String gender) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setGender(gender);
        amount++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 6 && age < 19){
            this.age = age;
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString(){
        return "firstname";
    }

}
