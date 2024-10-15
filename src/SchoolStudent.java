import java.util.ArrayList;
import java.util.List;

abstract class SchoolStudent implements SchoolPeople{
    private String grade;
    protected List<Person> students= new ArrayList<>();
    public SchoolStudent(String grade) {
        this.grade = grade;
    }
    @Override
    public void printJobDescription(){
        System.out.println("student grade: "+ grade);
    }
    @Override
    public void addPerson(Person person){
        students.add(person);
    }
    @Override
    public void removePerson(Person person){
        students.remove(person);
    }
}
