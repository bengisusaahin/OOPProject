package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User myUser = new User("Atil", "Instructor");
        System.out.println(myUser.name);

        //Encapsulation
        Musician james = new Musician("James","Guitar",50);
        //james.age = 60;
        //System.out.println(james.age);
        System.out.println(james.getName());
        james.setAge(60,"Atil");
        System.out.println(james.getAge());
    }
}