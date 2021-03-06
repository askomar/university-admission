package com.solvd.university;

public enum EmployeePosition {
    TEACHER("Teacher"), MANAGER("Manager");

    private final String position;

    EmployeePosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
