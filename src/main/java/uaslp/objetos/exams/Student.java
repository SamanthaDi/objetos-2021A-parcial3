package uaslp.objetos.exams;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student {
    private String name;
    private int code;
    List<Integer> scores = new ArrayList<>();

    private double average;

    public Student(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setScore(int partial, int score) throws InvalidPartialException{
        if(partial < 1 || partial > 3){
            throw new InvalidPartialException();
        }
        scores.add(score);
    }


    public double getAverage() throws MissingScoreException {

        double prom = 0;
        for(int i=0; i <scores.size(); i++){
            if(scores.get(i) == null){
                throw new MissingScoreException();
            }
            prom =+ scores.get(i);
        }
        average = prom/3;
        return average;
    }

}
