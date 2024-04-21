package com.aditya.database.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.aditya.database.Params.Params;
public class MyDbHandler extends SQLiteOpenHelper {

    //we will override SQLiteOpenHandler functions

    //constructor
    public MyDbHandler(Context context){
        super(context,Params.DB_NAME,null,Params.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String create="CREATE TABLE"+Params.TABLE_NAME+"("+Params.KEY_ID+" INTEGER PRIMARY KEY, "+Params.KEY_NAME+ " TEXT, "+ Params.KEY_PHONE+" TEXT"+")";
        Log.d("DBAditya","Query being run is "+create);
        db.execSQL(create);   //line to create a databse


    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){

    }
}
