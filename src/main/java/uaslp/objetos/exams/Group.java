package uaslp.objetos.exams;

import java.util.LinkedList;
import java.util.List;

public class Group{
    private int capacity;
    private int availability;
    List<Student> students = new LinkedList<>();
    private double average;


    public Group(int capacity) {
        this.capacity = capacity;
        this.availability = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getAvailability() {
        return availability;
    }


    public void addStudent(Student student){
        if(students.size() > capacity){
            throw new GroupIsFullException();
        }
        students.add(student);
        availability--;
    }

    public List<Student> getStudents() {
        return students;
    }


    public double getAverage() {

        double prom = 0;
        for(int i=0; i <students.size(); i++){
            prom =+ students.get(i).getAverage();
        }
        average = prom/3;
        return average;
    }
}
