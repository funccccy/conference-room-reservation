package com.conference.entity;

import lombok.Data;

@Data
public class EmployeeTokenResponse {
    private String token;
    private Employee employee;

    // 构造方法、getter/setter 省略
    public EmployeeTokenResponse(String token, Employee employee) {
        this.token = token;
        this.employee = employee;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
