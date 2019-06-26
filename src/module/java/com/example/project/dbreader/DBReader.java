package com.example.project.module;

import java.io.File;

public class DBReader {
    File db;

    public DBReader() {
        db = new File(getClass().getClassLoader().getResource("src/module/resources/database.txt").getFile());
    }

    public boolean canRead(){
        return db.canRead();
    }
}
