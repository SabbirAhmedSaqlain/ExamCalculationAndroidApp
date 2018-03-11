package com.cse.sabbir.tutorialpoint;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "MyDBName.db";
    public static final String CONTACTS_TABLE_NAME = "contacts";
    public static final String CONTACTS_COLUMN_ID = "id";
    public static final String CONTACTS_COLUMN_ROLL = "roll";
    public static final String CONTACTS_COLUMN_CT1 = "ct1";
    public static final String CONTACTS_COLUMN_CT2 = "ct2";
    public static final String CONTACTS_COLUMN_CT3 = "ct3";
    public static final String CONTACTS_COLUMN_CT4= "ct4";
    public static final String CONTACTS_COLUMN_DAYS = "days";
    public static final String CONTACTS_COLUMN_PRESENTS= "present";
    public static final String CONTACTS_COLUMN_EXAM= "exam";


    public static final String CONTACTS_COLUMN_CT1_2 = "ct1_2";
    public static final String CONTACTS_COLUMN_CT2_2 = "ct2_2";
    public static final String CONTACTS_COLUMN_CT3_2 = "ct3_2";
    public static final String CONTACTS_COLUMN_CT4_2= "ct4_2";
    public static final String CONTACTS_COLUMN_DAYS_2 = "days_2";
    public static final String CONTACTS_COLUMN_PRESENTS_2= "present_2";
    public static final String CONTACTS_COLUMN_EXAM_2= "exam_2";


    public static final String CONTACTS_COLUMN_CT1_3 = "ct1_3";
    public static final String CONTACTS_COLUMN_CT2_3 = "ct2_3";
    public static final String CONTACTS_COLUMN_CT3_3 = "ct3_3";
    public static final String CONTACTS_COLUMN_CT4_3= "ct4_3";
    public static final String CONTACTS_COLUMN_DAYS_3 = "days_3";
    public static final String CONTACTS_COLUMN_PRESENTS_3= "present_3";
    public static final String CONTACTS_COLUMN_EXAM_3= "exam_3";


    public static final String CONTACTS_COLUMN_CT1_4 = "ct1_4";
    public static final String CONTACTS_COLUMN_CT2_4 = "ct2_4";
    public static final String CONTACTS_COLUMN_CT3_4 = "ct3_4";
    public static final String CONTACTS_COLUMN_CT4_4= "ct4_4";
    public static final String CONTACTS_COLUMN_DAYS_4 = "days_4";
    public static final String CONTACTS_COLUMN_PRESENTS_4= "present_4";
    public static final String CONTACTS_COLUMN_EXAM_4= "exam_4";


    public static final String CONTACTS_COLUMN_CT1_5 = "ct1_5";
    public static final String CONTACTS_COLUMN_CT2_5= "ct2_5";
    public static final String CONTACTS_COLUMN_CT3_5 = "ct3_5";
    public static final String CONTACTS_COLUMN_CT4_5= "ct4_5";
    public static final String CONTACTS_COLUMN_DAYS_5 = "days_5";
    public static final String CONTACTS_COLUMN_PRESENTS_5= "present_5";
    public static final String CONTACTS_COLUMN_EXAM_5= "exam_5";




    private HashMap hp;

    public DBHelper(Context context)
    {
        super(context, DATABASE_NAME , null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        db.execSQL(
                "create table contacts " +
                        "(id integer primary key, roll text,ct1 text,ct2 text, ct3 text,ct4 text,days text, present text,exam text,ct1_2 text,ct2_2 text, ct3_2 text,ct4_2 text,days_2 text, present_2 text,exam_2 text,ct1_3 text,ct2_3 text, ct3_3 text,ct4_3 text,days_3 text, present_3 text,exam_3 text,ct1_4 text,ct2_4 text, ct3_4 text,ct4_4 text,days_4 text, present_4 text,exam_4 text,ct1_5 text,ct2_5 text, ct3_5 text,ct4_5 text,days_5 text, present_5 text,exam_5 text)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
        db.execSQL("DROP TABLE IF EXISTS contacts");
        onCreate(db);
    }


    public boolean insertContact  (String roll, String ct1, String ct2, String ct3,String ct4, String days, String present, String exam , String ct1_2, String ct2_2, String ct3_2,String ct4_2, String days_2, String present_2, String exam_2, String ct1_3, String ct2_3, String ct3_3,String ct4_3, String days_3, String present_3, String exam_3, String ct1_4, String ct2_4, String ct3_4,String ct4_4, String days_4, String present_4, String exam_4, String ct1_5, String ct2_5, String ct3_5,String ct4_5, String days_5, String present_5, String exam_5)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
      //  contentValues.put("id", id);
        contentValues.put("roll", roll);
        contentValues.put("ct1", ct1);
        contentValues.put("ct2", ct2);
        contentValues.put("ct3", ct3);
        contentValues.put("ct4", ct4);
        contentValues.put("days", days);
        contentValues.put("present", present);
        contentValues.put("exam", exam);


        contentValues.put("ct1_2", ct1_2);
        contentValues.put("ct2_2", ct2_2);
        contentValues.put("ct3_2", ct3_2);
        contentValues.put("ct4_2", ct4_2);
        contentValues.put("days_2", days_2);
        contentValues.put("present_2", present_2);
        contentValues.put("exam_2", exam_2);


        contentValues.put("ct1_3", ct1_3);
        contentValues.put("ct2_3", ct2_3);
        contentValues.put("ct3_3", ct3_3);
        contentValues.put("ct4_3", ct4_3);
        contentValues.put("days_3", days_3);
        contentValues.put("present_3", present_3);
        contentValues.put("exam_3", exam_3);



        contentValues.put("ct1_4", ct1_4);
        contentValues.put("ct2_4", ct2_4);
        contentValues.put("ct3_4", ct3_4);
        contentValues.put("ct4_4", ct4_4);
        contentValues.put("days_4", days_4);
        contentValues.put("present_4", present_4);
        contentValues.put("exam_4", exam_4);



        contentValues.put("ct1_5", ct1_5);
        contentValues.put("ct2_5", ct2_5);
        contentValues.put("ct3_5", ct3_5);
        contentValues.put("ct4_5", ct4_5);
        contentValues.put("days_5", days_5);
        contentValues.put("present_5", present_5);
        contentValues.put("exam_5", exam_5);




        db.insert("contacts", null, contentValues);
        return true;
    }

    public Cursor getData(int id){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from contacts where id="+id+"", null );
        return res;
    }

    public int numberOfRows(){
        SQLiteDatabase db = this.getReadableDatabase();
        int numRows = (int) DatabaseUtils.queryNumEntries(db, CONTACTS_TABLE_NAME);
        return numRows;
    }

    public boolean updateContact (Integer id,String roll, String ct1, String ct2, String ct3,String ct4, String days, String present, String exam, String ct1_2, String ct2_2, String ct3_2,String ct4_2, String days_2, String present_2, String exam_2, String ct1_3, String ct2_3, String ct3_3,String ct4_3, String days_3, String present_3, String exam_3, String ct1_4, String ct2_4, String ct3_4,String ct4_4, String days_4, String present_4, String exam_4, String ct1_5, String ct2_5, String ct3_5,String ct4_5, String days_5, String present_5, String exam_5)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("roll", roll);
        contentValues.put("ct1", ct1);
        contentValues.put("ct2", ct2);
        contentValues.put("ct3", ct3);
        contentValues.put("ct4", ct4);
        contentValues.put("days", days);
        contentValues.put("present", present);
        contentValues.put("exam", exam);


        contentValues.put("ct1_2", ct1_2);
        contentValues.put("ct2_2", ct2_2);
        contentValues.put("ct3_2", ct3_2);
        contentValues.put("ct4_2", ct4_2);
        contentValues.put("days_2", days_2);
        contentValues.put("present_2", present_2);
        contentValues.put("exam_2", exam_2);


        contentValues.put("ct1_3", ct1_3);
        contentValues.put("ct2_3", ct2_3);
        contentValues.put("ct3_3", ct3_3);
        contentValues.put("ct4_3", ct4_3);
        contentValues.put("days_3", days_3);
        contentValues.put("present_3", present_3);
        contentValues.put("exam_3", exam_3);



        contentValues.put("ct1_4", ct1_4);
        contentValues.put("ct2_4", ct2_4);
        contentValues.put("ct3_4", ct3_4);
        contentValues.put("ct4_4", ct4_4);
        contentValues.put("days_4", days_4);
        contentValues.put("present_4", present_4);
        contentValues.put("exam_4", exam_4);



        contentValues.put("ct1_5", ct1_5);
        contentValues.put("ct2_5", ct2_5);
        contentValues.put("ct3_5", ct3_5);
        contentValues.put("ct4_5", ct4_5);
        contentValues.put("days_5", days_5);
        contentValues.put("present_5", present_5);
        contentValues.put("exam_5", exam_5);




        db.update("contacts", contentValues, "id = ? ", new String[] { Integer.toString(id) } );
        return true;
    }

    public Integer deleteContact (Integer id)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete("contacts",
                "id = ? ",
                new String[] { Integer.toString(id) });
    }

    public ArrayList<String> getAllCotacts()
    {
        ArrayList<String> array_list = new ArrayList<String>();

        //hp = new HashMap();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from contacts", null );
        res.moveToFirst();

        while(res.isAfterLast() == false){
            array_list.add(res.getString(res.getColumnIndex(CONTACTS_COLUMN_ROLL)));
            res.moveToNext();
        }
        return array_list;
    }
}