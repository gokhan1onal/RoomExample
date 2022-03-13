package com.example.roomexample.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.example.roomexample.dataobjects.TaskDao;
import com.example.roomexample.entitys.Task;

@Database(entities = {Task.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TaskDao taskDao();
}