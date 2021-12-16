package com.company;

import java.util.*;

public class Student {
    private String surname;

    private List<Grade> grades;

    static LinkedHashMap<String, Double> diary = new LinkedHashMap<>();

    public Student(String surname) {
        this.surname = surname;
        grades = new ArrayList<>();
        diary.put(surname, average());
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    public double average() {
        if (grades.size() == 0) return 0;
        int sum = 0;
        for (Grade grade : grades) {
            sum += grade.grade;
        }
        return (double) sum / grades.size();
    }

    public void displayDiaryByName() {
        System.out.println("Nazwisko: " + surname);

        for(Map.Entry<String, Double> subject : diary.entrySet()) {
            System.out.println("Przedmiot " + subject.getKey() + ", " + subject.getValue());
        }
    }

    public void displayAvarageOfStudent(String s) {
        System.out.println(surname);
        int sum = 0;
        int ilosc = 0;
        for (Grade grade : grades) {
            if(s.equals(surname))
                sum += grade.grade;
                ilosc++;
            }

        System.out.println("Średnia " + (double) sum/ilosc);
    }

    public String getSurname() {
        return surname;
    }


}