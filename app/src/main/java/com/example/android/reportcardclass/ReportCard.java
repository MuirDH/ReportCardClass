package com.example.android.reportcardclass;

// A simple Java class which represents an American Report Card
// Made by Muir Halleron on 4th May 2017

import java.util.Arrays;

public class ReportCard {

    // Letter Grades of each subject
    private char mGradeLetters[];

    // Subjects the student has taken
    private String mSubjects[];

    // Student name
    private String mStudent;

    // School name. static final (constant) as this will never change from one student to the next
    private static final String SCHOOL_NAME = "School";

    public ReportCard (char[] gradeLetters, String[] subjects, String student) {

        this.mGradeLetters = gradeLetters;
        this.mSubjects = subjects;
        this.mStudent = student;
    }

    public char[] getGradeLetters(){

       return mGradeLetters;
    }

    public void setGradeLetters(char[] gradeLetters){

        this.mGradeLetters = gradeLetters;
    }

    public String[] getSubjects(){

        return mSubjects;
    }

    public void setSubjects(String[] subjects){

        this.mSubjects = subjects;
    }

    public String getStudent(){

        return mStudent;
    }

    public void setStudent(String student){

        this.mStudent = student;
    }

    // Would have used a StringBuilder here, but the rubric specifically says to use a toString() method
    @Override
    public String toString(){

        return "School: " + SCHOOL_NAME + "\n"
                + "Student: " + mStudent + "\n"
                + "Subjects: " + Arrays.toString(mSubjects) + " " + "Grade: " + Arrays.toString(mGradeLetters);
    }

}
