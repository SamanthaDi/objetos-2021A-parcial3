package uaslp.objetos.exams;

public class Student {

    private String Name;
    private int Code;
    private int Score;
    private int Average;

    public Student(String name, int code) {
        this.Name = name;
        this.Code = code;
    }

    public String getName() {
        return Name;
    }

    public int getCode() {
        return Code;
    }

    public void setScore(int index, int score) throws InvalidPartialException{

    }

    public int getScore() {
        return Score;
    }

    public int getAverage() throws MissingScoreException {
        if (Average == 0) {
            throw new MissingScoreException;
        }

        return Average;
    }
}
