package uaslp.objetos.exams;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Student {
    private String name;
    private int code;
    private Integer score[];

    private double average;

    public Student(String name, int code) {
        this.name = name;
        this.code = code;
        score = new Integer[3];
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
        this.score[partial-1] = score;
    }


    public double getAverage(){

        double prom = 0;
        for(int i=0; i <3; i++){
            if(score[i] == null){
                throw new MissingScoreException("Missing partial " + (i+1));
            }
            prom = prom + score[i];
        }
        average = prom / 3;
        return average;
    }

}
