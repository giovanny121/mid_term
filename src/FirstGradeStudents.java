abstract class FirstGradeStudents extends SchoolStudent{
    public FirstGradeStudents(){
        super("First grade");
    }
    @Override
    public void executeJob(){
        System.out.println("First grade");
    }
}
