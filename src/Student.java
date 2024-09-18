import java.util.ArrayList;
import java.util.List;

public class Student
{
    String name;

    String id;

    List<Course> enrolledCourses = new ArrayList<>(  );

	private Integer credits;


    public Student( String name, String id )
    {
        this.name = name;
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getId()
    {
        return id;
    }

    public void setId( String id )
    {
        this.id = id;
    }
    public Integer getCredits()
    {
        return credits;
    }

    public void setCredits( Integer credits )
    {
        this.credits = credits;
    }

    public void enroll(Course course){
        enrolledCourses.add( course );
    }

    public void unEnroll(Course course){
        enrolledCourses.remove( course );
    }

    public int totalEnrolledCourses(){
        //TODO implement
        return enrolledCourses.size();
    }

    public List<Course> getEnrolledCourses()
    {
        return enrolledCourses;
    }
    public Integer getStudentCredits()
    {
        return credits;
    }

    @Override
    public String toString()
    {
        return "Student{" + "name='" + name + '\'' + ", id='" + id + '\'' + ", enrolledCourses=" + enrolledCourses
            + '}';
    }
}