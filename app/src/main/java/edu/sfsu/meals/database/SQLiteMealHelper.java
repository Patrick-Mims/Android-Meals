package edu.sfsu.meals.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SQLiteMealHelper extends SQLiteOpenHelper {

    // private static final String DB_NAME = "meals";
    // a blank DB_NAME
    private static final String DB_NAME = "";
    private static final int DB_VERSION = 1;

    public SQLiteMealHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    public SQLiteMealHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version, @Nullable DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    public SQLiteMealHelper(@Nullable Context context, @Nullable String name, int version, @NonNull SQLiteDatabase.OpenParams openParams) {
        super(context, name, version, openParams);
    }

    /* When the database is created, the onCreate() method in the SQLiteHelper is Called.*/
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE MEAL ("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT, "
                + "DESCRIPTION TEXT, "
                + "IMAGE_RESOURCE_ID INTEGER);");
        insertMeal(sqLiteDatabase, "Pizza", "");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        newVersion = 2;
        if(oldVersion == 1) {
            Log.v("LOG", "DATABASE VERSION => " + oldVersion);
        }

        if(oldVersion == 2) {
            Log.v("LOG", "DATABASE VERSION => " + newVersion);
        }
    }

    public void onDownGrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    private static void insertMeal(SQLiteDatabase db, String name, String description) {

        ContentValues mealValues = new ContentValues();

        mealValues.put("NAME", name);
        mealValues.put("DESCRIPTION", description);
//       mealValues.put("IMAGE_RESOURCE_ID", resourceId);

        db.insert("MEAL", null, mealValues);
    }

    private void updateMyDatabase(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        if(oldVersion < 1) {
            sqLiteDatabase.execSQL("CREATE TABLE MEAL ("
                    + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "NAME TEXT, "
                    + "DESCRIPTION TEXT);");
                    //+ "IMAGE_RESOURCE_ID INTEGER);");
            insertMeal(sqLiteDatabase, "Steak", "The best pizza in Oakland");
            insertMeal(sqLiteDatabase, "Salad", "Salad world");
            insertMeal(sqLiteDatabase, "Chicken", "Kentucky Fried Chicken");
        }
    }
}
