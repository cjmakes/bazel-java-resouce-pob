package com.example.project.core;

import com.example.project.module.DBReader;

public class core{
    public static void main(String args[]){
        System.out.println(new DBReader().canRead());
    }
}