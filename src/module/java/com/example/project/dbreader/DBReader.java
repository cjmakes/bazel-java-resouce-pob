package com.example.project.module;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

public class DBReader {
    File db;

    public DBReader() {
        db = new File(getClass().getClassLoader().getResource("databse.txt").getFile());
    }

    public boolean canRead(){
        return db.canRead();
    }
}
