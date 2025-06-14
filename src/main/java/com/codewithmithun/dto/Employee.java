package com.codewithmithun.dto;

public class Employee {
    private String EmployeeID;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Gender;
    private String NewJoiner;
    private String LearningPending;
    private String Salary;
    private String Rating;

    public Employee(String employeeID, String firstName, String lastName, String email, String gender, String newJoiner, String learningPending, String salary, String rating) {
        EmployeeID = employeeID;
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Gender = gender;
        NewJoiner = newJoiner;
        LearningPending = learningPending;
        Salary = salary;
        Rating = rating;
    }

    public Employee() {
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getNewJoiner() {
        return NewJoiner;
    }

    public void setNewJoiner(String newJoiner) {
        NewJoiner = newJoiner;
    }

    public String getLearningPending() {
        return LearningPending;
    }

    public void setLearningPending(String learningPending) {
        LearningPending = learningPending;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }
}

