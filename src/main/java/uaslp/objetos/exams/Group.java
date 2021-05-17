package uaslp.objetos.exams;

public class Group<Student>{
    private int size;
    private int capacity;
    private boolean Availability;


    private Object Students[];
    public Group(Integer size) {this.Students = new Object[size]; }

    public void addStudent(Student Student) throws GroupIsFullException {
        if (size >= Students.length) {
            throw new GroupIsFullException;
        }
        this.Students[size] = Student;
        size++;
    }

    public Student getStudents(int size){
        /*if(index <0 || index >= size){
            throw new MyArrayIndexOutOfBoundsException();
        }*/
        return (Student) Students[size];
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean getAvailability() {
        if(capacity > size)
            return false;
        else
            return true;
    }

    public double getAverage() {
        return;
    }


}
