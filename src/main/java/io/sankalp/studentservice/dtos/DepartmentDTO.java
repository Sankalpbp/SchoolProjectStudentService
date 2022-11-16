package io.sankalp.studentservice.dtos;

public class DepartmentDTO {
    private String name;
    private String headOfDepartment;
    private Integer numberOfStaffMembers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(String headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    public Integer getNumberOfStaffMembers() {
        return numberOfStaffMembers;
    }

    public void setNumberOfStaffMembers(Integer numberOfStaffMembers) {
        this.numberOfStaffMembers = numberOfStaffMembers;
    }
}
