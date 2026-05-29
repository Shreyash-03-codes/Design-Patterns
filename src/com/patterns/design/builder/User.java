package com.patterns.design.builder;

public class User {

    private final Long id;
    private final String name;
    private final String email;
    private final int age;

    private User(UserBuilder builder){
        this.id=builder.id;
        this.name=builder.name;
        this.email=builder.email;
        this.age=builder.age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public static UserBuilder builder(){
        return new UserBuilder();
    }

    public static class UserBuilder{
        private Long id;
        private String name;
        private String email;
        private int age;

        public UserBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    @Override
    public String toString(){
        return this.id+", "+this.name+", "+this.email+", "+this.age;
    }
}
