package com.tym.insttakeout.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="customer")
public class Customer implements Serializable {
    private static final long serialVersionUID = 2652327633296064143L;
    @Id
    private String email;
    private  String firstName;
    private  String lastName;
    private String password;
    private boolean enabled;

    private Customer(CustomerBuilder builder) {
        this.email = builder.email;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.password = builder.password;
        this.enabled = builder.enabled;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public static class CustomerBuilder{
        private String email;
        private String firstName;
        private String lastName;
        private String password;
        private boolean enabled;

        public CustomerBuilder email(String email) {
            this.email = email;
            return this;
        }
        public CustomerBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public CustomerBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public CustomerBuilder password(String password) {
            this.password = password;
            return this;
        }
        public CustomerBuilder enabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Customer build() {
            if (email == null || firstName == null || lastName == null) {
                throw new IllegalArgumentException("required fields are not set!");
            }
            return new Customer(this);
        }
    }
}
