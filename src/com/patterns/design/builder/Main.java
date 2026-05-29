package com.patterns.design.builder;

public class Main {
    public static void main(String[] args) {
//        User user1=new User();

        User user2=User.builder()
                .name("Shreyash gurav")
                .id(1L)
                .email("guravshreyash2005@gmail.com")
                .age(21)
                .build();
        System.out.println(user2);

        User user3=User.builder()
                .name("Virat Kohali")
                .id(2L)
                .email("vk@gmail.com")
                .age(38)
                .build();
        System.out.println(user3);


    }
}
