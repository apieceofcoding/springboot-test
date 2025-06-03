package com.example.demo;

import lombok.Getter;

@Getter
public class Hello {

    private final String name;

    public Hello(String name) {
        this.name = name;
    }
}
