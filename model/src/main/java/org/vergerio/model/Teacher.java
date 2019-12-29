package org.vergerio.model;

import java.util.Objects;

public class Teacher {
    private String name;
    private String email;

    public Teacher(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Teacher)) {
            return false;
        }

        Teacher other = (Teacher) obj;

        return Objects.equals(other.email, this.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.email);
    }
}
