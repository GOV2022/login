package org.example.dto;

import java.util.Objects;

public class RegDTO {
    private String login;
    private String password;
    private String name;
    private String birthday;
    private String datereg;
    private String role;

    public RegDTO(String login, String password, String name, String birthday,
                  String datereg, String role) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.birthday = birthday;
        this.datereg = datereg;
        this.role = role;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDatereg() {
        return datereg;
    }

    public void setDatereg(String datereg) {
        this.datereg = datereg;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegDTO regDTO = (RegDTO) o;
        return Objects.equals(login, regDTO.login) && Objects.equals(password, regDTO.password) && Objects.equals(name, regDTO.name) && Objects.equals(birthday, regDTO.birthday) && Objects.equals(datereg, regDTO.datereg) && Objects.equals(role, regDTO.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, name, birthday, datereg, role);
    }

    @Override
    public String toString() {
        return "RegDTO{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", datereg='" + datereg + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
