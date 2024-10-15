import java.util.ArrayList;
import java.util.List;

abstract class SchoolWorker implements SchoolPeople {
    private String jobTitle;
    protected List<Person> workers = new ArrayList<>();

    public SchoolWorker(String jobTitle){
        this.jobTitle = jobTitle;
    }

    @Override
    public void printJobDescription(String jobTitle){
        System.out.println("Job Description: " + jobTitle);
    }
    @Override
  public  void printPeople(){
        for (Person person : workers){
            System.out.println(person);
        }
    }
    @Override
    public void addPerson(Person person){
        workers.add(person);
    }

    @Override
    public void removePerson(Person person){
        workers.remove(person);
    }
}
