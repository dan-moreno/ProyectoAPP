package com.example.proyectoapp;

public class ListElement {
    public String name;
    public String professor;
    public String grade;

    public ListElement(String name, String professor, String grade) {
        this.name = name;
        this.professor = professor;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
