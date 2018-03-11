package com.cse.sabbir.tutorialpoint;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;


public class DisplayContact extends Activity {
    int from_Where_I_Am_Coming = 0;
    private DBHelper mydb ;

    TextView ct1 ;
    TextView ct2;
    TextView ct3;
    TextView ct4;
    TextView days;
    TextView exam;
    TextView present;
    TextView roll;

    TextView ct1_2 ;
    TextView ct2_2;
    TextView ct3_2;
    TextView ct4_2;
    TextView days_2;
    TextView exam_2;
    TextView present_2;

    TextView ct1_3 ;
    TextView ct2_3;
    TextView ct3_3;
    TextView ct4_3;
    TextView days_3;
    TextView exam_3;
    TextView present_3;

    TextView ct1_4 ;
    TextView ct2_4;
    TextView ct3_4;
    TextView ct4_4;
    TextView days_4;
    TextView exam_4;
    TextView present_4;


    TextView ct1_5 ;
    TextView ct2_5;
    TextView ct3_5;
    TextView ct4_5;
    TextView days_5;
    TextView exam_5;
    TextView present_5;





    Double dct1,dct2,dct3,dct4,ddays,dpresent,dexam,roll_1,total;
    Double dct1_2,dct2_2,dct3_2,dct4_2,ddays_2,dpresent_2,dexam_2;
    Double dct1_3,dct2_3,dct3_3,dct4_3,ddays_3,dpresent_3,dexam_3;
    Double dct1_4,dct2_4,dct3_4,dct4_4,ddays_4,dpresent_4,dexam_4;
    Double dct1_5,dct2_5,dct3_5,dct4_5,ddays_5,dpresent_5,dexam_5;
    String cg,stest;

    int id_To_Update = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_contact);
        roll = (TextView) findViewById(R.id.data_roll);
        ct1 = (TextView) findViewById(R.id.data_ct1);
        ct2 = (TextView) findViewById(R.id.data_ct2);
        ct3 = (TextView) findViewById(R.id.data_ct3);
        ct4 = (TextView) findViewById(R.id.data_ct4);
        days = (TextView) findViewById(R.id.data_days);
        present = (TextView) findViewById(R.id.data_presents);
        exam = (TextView) findViewById(R.id.data_exam);



        ct1_2 = (TextView) findViewById(R.id.data2_ct1);
        ct2_2 = (TextView) findViewById(R.id.data2_ct2);
        ct3_2 = (TextView) findViewById(R.id.data2_ct3);
        ct4_2 = (TextView) findViewById(R.id.data2_ct4);
        days_2 = (TextView) findViewById(R.id.data2_days);
        present_2 = (TextView) findViewById(R.id.data2_presents);
        exam_2 = (TextView) findViewById(R.id.data2_exam);



        ct1_3 = (TextView) findViewById(R.id.data3_ct1);
        ct2_3 = (TextView) findViewById(R.id.data3_ct2);
        ct3_3 = (TextView) findViewById(R.id.data3_ct3);
        ct4_3 = (TextView) findViewById(R.id.data3_ct4);
        days_3 = (TextView) findViewById(R.id.data3_days);
        present_3 = (TextView) findViewById(R.id.data3_presents);
        exam_3 = (TextView) findViewById(R.id.data3_exam);


        ct1_4 = (TextView) findViewById(R.id.data4_ct1);
        ct2_4 = (TextView) findViewById(R.id.data4_ct2);
        ct3_4 = (TextView) findViewById(R.id.data4_ct3);
        ct4_4 = (TextView) findViewById(R.id.data4_ct4);
        days_4 = (TextView) findViewById(R.id.data4_days);
        present_4 = (TextView) findViewById(R.id.data4_presents);
        exam_4 = (TextView) findViewById(R.id.data4_exam);


        ct1_5 = (TextView) findViewById(R.id.data5_ct1);
        ct2_5 = (TextView) findViewById(R.id.data5_ct2);
        ct3_5 = (TextView) findViewById(R.id.data5_ct3);
        ct4_5 = (TextView) findViewById(R.id.data5_ct4);
        days_5 = (TextView) findViewById(R.id.data5_days);
        present_5 = (TextView) findViewById(R.id.data5_presents);
        exam_5 = (TextView) findViewById(R.id.data5_exam);





        mydb = new DBHelper(this);

        Bundle extras = getIntent().getExtras();
        if(extras !=null)
        {
            int Value = extras.getInt("id");

            if(Value>0){
                //means this is the view part not the add contact part.
                Cursor rs = mydb.getData(Value);
                id_To_Update = Value;
                rs.moveToFirst();

                String sroll = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_ROLL));
                String sct1 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_CT1));
                String sct2 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_CT2));
                String sct3 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_CT3));
                String sct4 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_CT4));
                String sdays = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_DAYS));
                String spresent = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_PRESENTS));
                String sexam = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_EXAM));



                String sct1_2 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_CT1_2));
                String sct2_2 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_CT2_2));
                String sct3_2 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_CT3_2));
                String sct4_2 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_CT4_2));
                String sdays_2 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_DAYS_2));
                String spresent_2 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_PRESENTS_2));
                String sexam_2 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_EXAM_2));



                String sct1_3 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_CT1_3));
                String sct2_3 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_CT2_3));
                String sct3_3 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_CT3_3));
                String sct4_3 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_CT4_3));
                String sdays_3 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_DAYS_3));
                String spresent_3 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_PRESENTS_3));
                String sexam_3 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_EXAM_3));



                String sct1_4 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_CT1_4));
                String sct2_4 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_CT2_4));
                String sct3_4 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_CT3_4));
                String sct4_4 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_CT4_4));
                String sdays_4 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_DAYS_4));
                String spresent_4 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_PRESENTS_4));
                String sexam_4 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_EXAM_4));



                String sct1_5 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_CT1_5));
                String sct2_5 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_CT2_5));
                String sct3_5 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_CT3_5));
                String sct4_5 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_CT4_5));
                String sdays_5 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_DAYS_5));
                String spresent_5 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_PRESENTS_5));
                String sexam_5 = rs.getString(rs.getColumnIndex(DBHelper.CONTACTS_COLUMN_EXAM_5));





                dct1 = Double.parseDouble(sct1);
                dct2 = Double.parseDouble(sct2);
                dct3 = Double.parseDouble(sct3);
                dct4 = Double.parseDouble(sct4);
                ddays = Double.parseDouble(sdays);
                dpresent = Double.parseDouble(spresent);
                dexam= Double.parseDouble(sexam);


                dct1_2 = Double.parseDouble(sct1_2);
                dct2_2 = Double.parseDouble(sct2_2);
                dct3_2 = Double.parseDouble(sct3_2);
                dct4_2 = Double.parseDouble(sct4_2);
                ddays_2 = Double.parseDouble(sdays_2);
                dpresent_2 = Double.parseDouble(spresent_2);
                dexam_2= Double.parseDouble(sexam_2);

                dct1_3 = Double.parseDouble(sct1_3);
                dct2_3 = Double.parseDouble(sct2_3);
                dct3_3 = Double.parseDouble(sct3_3);
                dct4_3 = Double.parseDouble(sct4_3);
                ddays_3 = Double.parseDouble(sdays_3);
                dpresent_3 = Double.parseDouble(spresent_3);
                dexam_3= Double.parseDouble(sexam_3);


                dct1_4 = Double.parseDouble(sct1_4);
                dct2_4 = Double.parseDouble(sct2_4);
                dct3_4 = Double.parseDouble(sct3_4);
                dct4_4 = Double.parseDouble(sct4_4);
                ddays_4 = Double.parseDouble(sdays_4);
                dpresent_4 = Double.parseDouble(spresent_4);
                dexam_4= Double.parseDouble(sexam_4);

                dct1_5 = Double.parseDouble(sct1_5);
                dct2_5= Double.parseDouble(sct2_5);
                dct3_5 = Double.parseDouble(sct3_5);
                dct4_5 = Double.parseDouble(sct4_5);
                ddays_5 = Double.parseDouble(sdays_5);
                dpresent_5 = Double.parseDouble(spresent_5);
                dexam_5= Double.parseDouble(sexam_5);


                if (!rs.isClosed())
                {
                    rs.close();
                }
                Button b = (Button)findViewById(R.id.save);
                b.setVisibility(View.INVISIBLE);

                roll.setText((CharSequence)sroll);
                roll.setFocusable(false);
                roll.setClickable(false);

                ct1.setText((CharSequence)sct1);
                ct1.setFocusable(false);
                ct1.setClickable(false);

                ct2.setText((CharSequence)sct2);
                ct2.setFocusable(false);
                ct2.setClickable(false);

                ct3.setText((CharSequence)sct3);
                ct3.setFocusable(false);
                ct3.setClickable(false);

                ct4.setText((CharSequence)sct4);
                ct4.setFocusable(false);
                ct4.setClickable(false);


                days.setText((CharSequence)sdays);
                days.setFocusable(false);
                days.setClickable(false);

                present.setText((CharSequence)spresent);
                present.setFocusable(false);
                present.setClickable(false);

                exam.setText((CharSequence)sexam);
                exam.setFocusable(false);
                exam.setClickable(false);




                ct1_2.setText((CharSequence)sct1_2);
                ct1_2.setFocusable(false);
                ct1_2.setClickable(false);

                ct2_2.setText((CharSequence)sct2_2);
                ct2_2.setFocusable(false);
                ct2_2.setClickable(false);

                ct3_2.setText((CharSequence)sct3_2);
                ct3_2.setFocusable(false);
                ct3_2.setClickable(false);

                ct4_2.setText((CharSequence)sct4_2);
                ct4_2.setFocusable(false);
                ct4_2.setClickable(false);


                days_2.setText((CharSequence)sdays_2);
                days_2.setFocusable(false);
                days_2.setClickable(false);

                present_2.setText((CharSequence)spresent_2);
                present_2.setFocusable(false);
                present_2.setClickable(false);

                exam_2.setText((CharSequence)sexam_2);
                exam_2.setFocusable(false);
                exam_2.setClickable(false);




                ct1_3.setText((CharSequence)sct1_3);
                ct1_3.setFocusable(false);
                ct1.setClickable(false);

                ct2_3.setText((CharSequence)sct2_3);
                ct2_3.setFocusable(false);
                ct2_3.setClickable(false);

                ct3_3.setText((CharSequence)sct3_3);
                ct3_3.setFocusable(false);
                ct3_3.setClickable(false);

                ct4_3.setText((CharSequence)sct4_3);
                ct4_3.setFocusable(false);
                ct4_3.setClickable(false);


                days_3.setText((CharSequence)sdays_3);
                days_3.setFocusable(false);
                days_3.setClickable(false);

                present_3.setText((CharSequence)spresent_3);
                present_3.setFocusable(false);
                present_3.setClickable(false);

                exam_3.setText((CharSequence)sexam_3);
                exam_3.setFocusable(false);
                exam_3.setClickable(false);



                ct1_4.setText((CharSequence)sct1_4);
                ct1_4.setFocusable(false);
                ct1_4.setClickable(false);

                ct2_4.setText((CharSequence)sct2_4);
                ct2_4.setFocusable(false);
                ct2_4.setClickable(false);

                ct3_4.setText((CharSequence)sct3_4);
                ct3_4.setFocusable(false);
                ct3_4.setClickable(false);

                ct4_4.setText((CharSequence)sct4_4);
                ct4_4.setFocusable(false);
                ct4_4.setClickable(false);


                days_4.setText((CharSequence)sdays_4);
                days_4.setFocusable(false);
                days_4.setClickable(false);

                present_4.setText((CharSequence)spresent_4);
                present_4.setFocusable(false);
                present_4.setClickable(false);

                exam_4.setText((CharSequence)sexam_4);
                exam_4.setFocusable(false);
                exam_4.setClickable(false);




                ct1_5.setText((CharSequence)sct1_5);
                ct1_5.setFocusable(false);
                ct1_5.setClickable(false);

                ct2_5.setText((CharSequence)sct2_5);
                ct2_5.setFocusable(false);
                ct2_5.setClickable(false);

                ct3_5.setText((CharSequence)sct3_5);
                ct3_5.setFocusable(false);
                ct3_5.setClickable(false);

                ct4_5.setText((CharSequence)sct4_5);
                ct4_5.setFocusable(false);
                ct4_5.setClickable(false);


                days_5.setText((CharSequence)sdays_5);
                days_5.setFocusable(false);
                days_5.setClickable(false);

                present_5.setText((CharSequence)spresent_5);
                present_5.setFocusable(false);
                present_5.setClickable(false);

                exam_5.setText((CharSequence)sexam_5);
                exam_5.setFocusable(false);
                exam_5.setClickable(false);






            }
        }
    }

    public void CGPA(View view) {
        TextView txt= (TextView)findViewById(R.id.data_cgpa);

        Double mark=0.0,val = 0.0,cgpa=0.0,pre=0.0,data[] = {dct1,dct2,dct3,dct4};
        Integer i;
        Arrays.sort(data);
        for (i=1;i<4;i++) {
            val+=data[i];
        }
        val=val/3.0;
        dpresent=(dpresent*100)/ddays;
        if(dpresent>=90.0)pre=8.0;
        if(dpresent>=80.0 && dpresent <90.0)pre=7.0;
        if(dpresent>=70.0 && dpresent <80.0)pre=6.0;
        if(dpresent>=60.0 && dpresent <70.0)pre=5.0;
        if(dpresent>=50.0 && dpresent <60.0)pre=4.0;
        if(dpresent<50.0)pre=0.0;
        mark=val+dexam+pre;

        if(mark>=80.0)cgpa= 4.00;
        if(mark>=75.0 && mark <80.0)cgpa= 3.75;
        if(mark>=70.0 && mark <75.0)cgpa= 3.50;
        if(mark>=65.0 && mark <70.0)cgpa= 3.25;
        if(mark>=60.0 && mark <65.0)cgpa= 3.00;
        if(mark>=55.0 && mark <60.0)cgpa= 2.75;
        if(mark>=50.0 && mark <55.0)cgpa= 2.50;
        if(mark>=45.0 && mark <50.0)cgpa= 2.25;
        if(mark>=40.0 && mark <45.0)cgpa= 2.00;
        if(mark<40.0)cgpa= 0.00;



        Double mark_2=0.0,val_2 = 0.0,cgpa_2=0.0,pre_2=0.0,data_2[] = {dct1_2,dct2_2,dct3_2,dct4_2};

        Arrays.sort(data_2);
        for (i=1;i<4;i++) {
            val_2+=data_2[i];
        }
        val_2=val_2/3.0;
        dpresent_2=(dpresent_2*100)/ddays_2;
        if(dpresent_2>=90.0)pre_2=8.0;
        if(dpresent_2>=80.0 && dpresent_2 <90.0)pre_2=7.0;
        if(dpresent_2>=70.0 && dpresent_2 <80.0)pre_2=6.0;
        if(dpresent_2>=60.0 && dpresent_2 <70.0)pre_2=5.0;
        if(dpresent_2>=50.0 && dpresent_2 <60.0)pre_2=4.0;
        if(dpresent_2<50.0)pre_2=0.0;
        mark_2=val_2+dexam_2+pre_2;

        if(mark_2>=80.0)cgpa_2= 4.00;
        if(mark_2>=75.0 && mark_2 <80.0)cgpa_2= 3.75;
        if(mark_2>=70.0 && mark_2 <75.0)cgpa_2= 3.50;
        if(mark_2>=65.0 && mark_2 <70.0)cgpa_2= 3.25;
        if(mark_2>=60.0 && mark_2 <65.0)cgpa_2= 3.00;
        if(mark_2>=55.0 && mark_2 <60.0)cgpa_2= 2.75;
        if(mark_2>=50.0 && mark_2 <55.0)cgpa_2= 2.50;
        if(mark_2>=45.0 && mark_2 <50.0)cgpa_2= 2.25;
        if(mark_2>=40.0 && mark_2 <45.0)cgpa_2= 2.00;
        if(mark_2<40.0)cgpa_2= 0.00;



        Double mark_3=0.0,val_3 = 0.0,cgpa_3=0.0,pre_3=0.0,data_3[] = {dct1_3,dct2_3,dct3_3,dct4_3};

        Arrays.sort(data_3);
        for (i=1;i<4;i++) {
            val_3+=data_3[i];
        }
        val_3=val_3/3.0;
        dpresent_3=(dpresent_3*100)/ddays_3;
        if(dpresent_3>=90.0)pre_3=8.0;
        if(dpresent_3>=80.0 && dpresent_3 <90.0)pre_3=7.0;
        if(dpresent_3>=70.0 && dpresent_3 <80.0)pre_3=6.0;
        if(dpresent_3>=60.0 && dpresent_3 <70.0)pre_3=5.0;
        if(dpresent_3>=50.0 && dpresent_3 <60.0)pre_3=4.0;
        if(dpresent_3<50.0)pre_3=0.0;
        mark_3=val_3+dexam_3+pre_3;

        if(mark_3>=80.0)cgpa_3= 4.00;
        if(mark_3>=75.0 && mark_3 <80.0)cgpa_3= 3.75;
        if(mark_3>=70.0 && mark_3 <75.0)cgpa_3= 3.50;
        if(mark_3>=65.0 && mark_3 <70.0)cgpa_3= 3.25;
        if(mark_3>=60.0 && mark_3 <65.0)cgpa_3= 3.00;
        if(mark_3>=55.0 && mark_3 <60.0)cgpa_3= 2.75;
        if(mark_3>=50.0 && mark_3 <55.0)cgpa_3= 2.50;
        if(mark_3>=45.0 && mark_3 <50.0)cgpa_3= 2.25;
        if(mark_3>=40.0 && mark_3 <45.0)cgpa_3= 2.00;
        if(mark_3<40.0)cgpa_3= 0.00;


        Double mark_4=0.0,val_4 = 0.0,cgpa_4=0.0,pre_4=0.0,data_4[] = {dct1_4,dct2_4,dct3_4,dct4_4};

        Arrays.sort(data_4);
        for (i=1;i<4;i++) {
            val_4+=data_4[i];
        }
        val_4=val_4/3.0;
        dpresent_4=(dpresent_4*100)/ddays_4;
        if(dpresent_4>=90.0)pre_4=8.0;
        if(dpresent_4>=80.0 && dpresent_4 <90.0)pre_4=7.0;
        if(dpresent_4>=70.0 && dpresent_4 <80.0)pre_4=6.0;
        if(dpresent_4>=60.0 && dpresent_4 <70.0)pre_4=5.0;
        if(dpresent_4>=50.0 && dpresent_4 <60.0)pre_4=4.0;
        if(dpresent_4<50.0)pre_4=0.0;
        mark_4=val_4+dexam_4+pre_4;

        if(mark_4>=80.0)cgpa_4= 4.00;
        if(mark_4>=75.0 && mark_4 <80.0)cgpa_4= 3.75;
        if(mark_4>=70.0 && mark_4 <75.0)cgpa_4= 3.50;
        if(mark_4>=65.0 && mark_4 <70.0)cgpa_4= 3.25;
        if(mark_4>=60.0 && mark_4 <65.0)cgpa_4= 3.00;
        if(mark_4>=55.0 && mark_4 <60.0)cgpa_4= 2.75;
        if(mark_4>=50.0 && mark_4 <55.0)cgpa_4= 2.50;
        if(mark_4>=45.0 && mark_4 <50.0)cgpa_4= 2.25;
        if(mark_4>=40.0 && mark_4 <45.0)cgpa_4= 2.00;
        if(mark_4<40.0)cgpa_4= 0.00;


        Double mark_5=0.0,val_5 = 0.0,cgpa_5=0.0,pre_5=0.0,data_5[] = {dct1_5,dct2_5,dct3_5,dct4_5};

        Arrays.sort(data_5);
        for (i=1;i<4;i++) {
            val_5+=data_5[i];
        }
        val_5=val_5/3.0;
        dpresent_5=(dpresent_5*100)/ddays_5;
        if(dpresent_5>=90.0)pre_5=8.0;
        if(dpresent_5>=80.0 && dpresent_5 <90.0)pre_5=7.0;
        if(dpresent_5>=70.0 && dpresent_5 <80.0)pre_5=6.0;
        if(dpresent_5>=60.0 && dpresent_5<70.0)pre_5=5.0;
        if(dpresent_5>=50.0 && dpresent_5 <60.0)pre_5=4.0;
        if(dpresent_5<50.0)pre_5=0.0;
        mark_5=val_5+dexam_5+pre_5;

        if(mark_5>=80.0)cgpa_5= 4.00;
        if(mark_5>=75.0 && mark_5 <80.0)cgpa_5= 3.75;
        if(mark_5>=70.0 && mark_5 <75.0)cgpa_5= 3.50;
        if(mark_5>=65.0 && mark_5 <70.0)cgpa_5= 3.25;
        if(mark_5>=60.0 && mark_5 <65.0)cgpa_5= 3.00;
        if(mark_5>=55.0 && mark_5 <60.0)cgpa_5= 2.75;
        if(mark_5>=50.0 && mark_5 <55.0)cgpa_5= 2.50;
        if(mark_5>=45.0 && mark_5 <50.0)cgpa_5= 2.25;
        if(mark_5>=40.0 && mark_5 <45.0)cgpa_5= 2.00;
        if(mark_5<40.0)cgpa_5= 0.00;


        total=cgpa+cgpa_2+cgpa_3+cgpa_4+cgpa_5;
        cgpa=total/5.0;

        cg = Double.toString(cgpa);
        txt.setText(cg);


    }


    public void run(View view)
    {

        int f=0;

        try{
            stest=roll.getText().toString();
            roll_1= Double.parseDouble(stest);

            stest=ct1.getText().toString();
            dct1 = Double.parseDouble(stest);




            if(dct1>20.0)f=1;
            if(dct1>20.0)Toast.makeText(getApplicationContext(), "Discrete Math CT1 marks must be less then 20", Toast.LENGTH_LONG).show();
            stest=ct2.getText().toString();
            dct2 = Double.parseDouble(stest);
            if(dct2>20.0)f=1;
            if(dct2>20.0)Toast.makeText(getApplicationContext(), "Discrete Math CT2 marks must be less then 20", Toast.LENGTH_LONG).show();
            stest=ct3.getText().toString();
            dct3 = Double.parseDouble(stest);
            if(dct3>20.0)f=1;
            if(dct3>20.0)Toast.makeText(getApplicationContext(), "Discrete Math CT3 marks must be less then 20", Toast.LENGTH_LONG).show();
            stest=ct4.getText().toString();
            dct4 = Double.parseDouble(stest);
            if(dct4>20.0)f=1;
            if(dct4>20.0)Toast.makeText(getApplicationContext(), "Discrete Math CT4 marks must be less then 20", Toast.LENGTH_LONG).show();
            stest=days.getText().toString();
            ddays = Double.parseDouble(stest);
            stest=present.getText().toString();
            dpresent = Double.parseDouble(stest);
            if(ddays<dpresent)f=1;
            if(ddays<dpresent)Toast.makeText(getApplicationContext(), "Discrete Math Present days must be less then Total Days", Toast.LENGTH_LONG).show();
            stest=exam.getText().toString();
            dexam = Double.parseDouble(stest);
            if(dexam>72.0)f=1;
            if(dexam>72.0)Toast.makeText(getApplicationContext(), "Discrete Math Final exam marks must be less then 72", Toast.LENGTH_LONG).show();



            stest=ct1_2.getText().toString();
            dct1_2 = Double.parseDouble(stest);
            if(dct1_2>20.0)f=1;
            if(dct1_2>20.0)Toast.makeText(getApplicationContext(), "Numerical Methods CT1 marks must be less then 20", Toast.LENGTH_LONG).show();
            stest=ct2_2.getText().toString();
            dct2_2 = Double.parseDouble(stest);
            if(dct2_2>20.0)f=1;
            if(dct2_2>20.0)Toast.makeText(getApplicationContext(), "Numerical Methods CT2 marks must be less then 20", Toast.LENGTH_LONG).show();
            stest=ct3_2.getText().toString();
            dct3_2 = Double.parseDouble(stest);
            if(dct3_2>20.0)f=1;
            if(dct3_2>20.0)Toast.makeText(getApplicationContext(), "Numerical Methods CT3 marks must be less then 20", Toast.LENGTH_LONG).show();
            stest=ct4_2.getText().toString();
            dct4_2 = Double.parseDouble(stest);
            if(dct4_2>20.0)f=1;
            if(dct4_2>20.0)Toast.makeText(getApplicationContext(), "Numerical Methods CT4 marks must be less then 20", Toast.LENGTH_LONG).show();
            stest=days_2.getText().toString();
            ddays_2 = Double.parseDouble(stest);
            stest=present_2.getText().toString();
            dpresent_2 = Double.parseDouble(stest);
            stest=exam_2.getText().toString();
            dexam_2 = Double.parseDouble(stest);
            if(dexam_2>72.0)f=1;
            if(dexam_2>72.0)Toast.makeText(getApplicationContext(), "Numerical Methods Final exam marks must be less then 72", Toast.LENGTH_LONG).show();
            if(ddays_2<dpresent_2)f=1;
            if(ddays_2<dpresent_2)Toast.makeText(getApplicationContext(), "Numerical Present days must be less then Total Days", Toast.LENGTH_LONG).show();


            stest=ct1_3.getText().toString();
            dct1_3 = Double.parseDouble(stest);
            if(dct1_3>20.0)f=1;
            if(dct1_3>20.0)Toast.makeText(getApplicationContext(), "EEE CT1 marks must be less then 20", Toast.LENGTH_LONG).show();
            stest=ct2_3.getText().toString();
            dct2_3 = Double.parseDouble(stest);
            if(dct2_3>20.0)f=1;
            if(dct2_3>20.0)Toast.makeText(getApplicationContext(), "EEE CT2 marks must be less then 20", Toast.LENGTH_LONG).show();
            stest=ct3_3.getText().toString();
            dct3_3 = Double.parseDouble(stest);
            if(dct3_3>20.0)f=1;
            if(dct3_3>20.0)Toast.makeText(getApplicationContext(), "EEE CT3 marks must be less then 20", Toast.LENGTH_LONG).show();
            stest=ct4_3.getText().toString();
            dct4_3 = Double.parseDouble(stest);
            if(dct4_3>20.0)f=1;
            if(dct4_3>20.0)Toast.makeText(getApplicationContext(), "EEE CT4 marks must be less then 20", Toast.LENGTH_LONG).show();
            stest=days_3.getText().toString();
            ddays_3 = Double.parseDouble(stest);
            stest=present_3.getText().toString();
            dpresent_3 = Double.parseDouble(stest);
            stest=exam_3.getText().toString();
            dexam_3 = Double.parseDouble(stest);
            if(dexam_3>72.0)f=1;
            if(dexam_3>72.0)Toast.makeText(getApplicationContext(), "EEE Final exam marks must be less then 72", Toast.LENGTH_LONG).show();
            if(ddays_3<dpresent_3)f=1;
            if(ddays_3<dpresent_3)Toast.makeText(getApplicationContext(), "EEE Present days must be less then Total Days", Toast.LENGTH_LONG).show();


            stest=ct1_4.getText().toString();
            dct1_4 = Double.parseDouble(stest);
            if(dct1_4>20.0)f=1;
            if(dct1_4>20.0)Toast.makeText(getApplicationContext(), "Math CT1 marks must be less then 20", Toast.LENGTH_LONG).show();
            stest=ct2_4.getText().toString();
            dct2_4 = Double.parseDouble(stest);
            if(dct2_4>20.0)f=1;
            if(dct2_4>20.0)Toast.makeText(getApplicationContext(), "Math CT2 marks must be less then 20", Toast.LENGTH_LONG).show();
            stest=ct3_4.getText().toString();
            dct3_4 = Double.parseDouble(stest);
            if(dct3_4>20.0)f=1;
            if(dct3_4>20.0)Toast.makeText(getApplicationContext(), "Math CT3 marks must be less then 20", Toast.LENGTH_LONG).show();
            stest=ct4_4.getText().toString();
            dct4_4= Double.parseDouble(stest);
            if(dct4_4>20.0)f=1;
            if(dct4_4>20.0)Toast.makeText(getApplicationContext(), "Math CT4 marks must be less then 20", Toast.LENGTH_LONG).show();
            stest=days_4.getText().toString();
            ddays_4 = Double.parseDouble(stest);
            stest=present_4.getText().toString();
            dpresent_4 = Double.parseDouble(stest);
            stest=exam_4.getText().toString();
            dexam_4 = Double.parseDouble(stest);
            if(dexam_4>72.0)f=1;
            if(dexam_4>72.0)Toast.makeText(getApplicationContext(), "Math Final exam marks must be less then 72", Toast.LENGTH_LONG).show();
            if(ddays_4<dpresent_4)f=1;
            if(ddays_4<dpresent_4)Toast.makeText(getApplicationContext(), "Math Present days must be less then Total Days", Toast.LENGTH_LONG).show();




            stest=ct1_5.getText().toString();
            dct1_5 = Double.parseDouble(stest);
            if(dct1_5>20.0)f=1;
            if(dct1_5>20.0)Toast.makeText(getApplicationContext(), "Accounting CT1 marks must be less then 20", Toast.LENGTH_LONG).show();
            stest=ct2_5.getText().toString();
            dct2_5 = Double.parseDouble(stest);
            if(dct2_5>20.0)f=1;
            if(dct2_5>20.0)Toast.makeText(getApplicationContext(), "Accounting CT2 marks must be less then 20", Toast.LENGTH_LONG).show();
            stest=ct3_5.getText().toString();
            dct3_5 = Double.parseDouble(stest);
            if(dct3_5>20.0)f=1;
            if(dct3_5>20.0)Toast.makeText(getApplicationContext(), "Accounting CT3 marks must be less then 20", Toast.LENGTH_LONG).show();
            stest=ct4_5.getText().toString();
            dct4_5= Double.parseDouble(stest);
            if(dct4_5>20.0)f=1;
            if(dct4_5>20.0)Toast.makeText(getApplicationContext(), "Accounting CT4 marks must be less then 20", Toast.LENGTH_LONG).show();
            stest=days_5.getText().toString();
            ddays_5 = Double.parseDouble(stest);
            stest=present_5.getText().toString();
            dpresent_5 = Double.parseDouble(stest);
            stest=exam_5.getText().toString();
            dexam_5 = Double.parseDouble(stest);
            if(dexam_5>72.0)f=1;
            if(dexam_5>72.0)Toast.makeText(getApplicationContext(), "Accounting Final exam marks must be less then 72", Toast.LENGTH_LONG).show();

            if(ddays_5<dpresent_5)f=1;
            if(ddays_5<dpresent_5)Toast.makeText(getApplicationContext(), "Accounting Present days must be less then Total Days", Toast.LENGTH_LONG).show();




        if(f==0){


            Bundle extras = getIntent().getExtras();
        if(extras !=null)
        {
            int Value = extras.getInt("id");
            if(Value>0){
                if(mydb.updateContact(id_To_Update,roll.getText().toString(), ct1.getText().toString(), ct2.getText().toString(), ct3.getText().toString(), ct4.getText().toString(), days.getText().toString(), present.getText().toString(), exam.getText().toString(), ct1_2.getText().toString(), ct2_2.getText().toString(), ct3_2.getText().toString(), ct4_2.getText().toString(), days_2.getText().toString(), present_2.getText().toString(), exam_2.getText().toString(), ct1_3.getText().toString(), ct2_3.getText().toString(), ct3_3.getText().toString(), ct4_3.getText().toString(), days_3.getText().toString(), present_3.getText().toString(), exam_3.getText().toString(), ct1_4.getText().toString(), ct2_4.getText().toString(), ct3_4.getText().toString(), ct4_4.getText().toString(), days_4.getText().toString(), present_4.getText().toString(), exam_4.getText().toString(), ct1_5.getText().toString(), ct2_5.getText().toString(), ct3_5.getText().toString(), ct4_5.getText().toString(), days_5.getText().toString(), present_5.getText().toString(), exam_5.getText().toString())){
                    Toast.makeText(getApplicationContext(), "Updated", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "not Updated", Toast.LENGTH_SHORT).show();
                }
            }
            else{
                if(mydb.insertContact(roll.getText().toString(), ct1.getText().toString(), ct2.getText().toString(), ct3.getText().toString(), ct4.getText().toString(), days.getText().toString(), present.getText().toString(), exam.getText().toString(), ct1_2.getText().toString(), ct2_2.getText().toString(), ct3_2.getText().toString(), ct4_2.getText().toString(), days_2.getText().toString(), present_2.getText().toString(), exam_2.getText().toString(), ct1_3.getText().toString(), ct2_3.getText().toString(), ct3_3.getText().toString(), ct4_3.getText().toString(), days_3.getText().toString(), present_3.getText().toString(), exam_3.getText().toString(), ct1_4.getText().toString(), ct2_4.getText().toString(), ct3_4.getText().toString(), ct4_4.getText().toString(), days_4.getText().toString(), present_4.getText().toString(), exam_4.getText().toString(), ct1_5.getText().toString(), ct2_5.getText().toString(), ct3_5.getText().toString(), ct4_5.getText().toString(), days_5.getText().toString(), present_5.getText().toString(), exam_5.getText().toString())){
                    Toast.makeText(getApplicationContext(), "done", Toast.LENGTH_SHORT).show();
                }

                else{
                    Toast.makeText(getApplicationContext(), "not done", Toast.LENGTH_SHORT).show();
                }
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        }}}


        catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(), "Error found!! Please check input data!!", Toast.LENGTH_LONG).show();
        }



    }


    public void edit(View view) {
        Button b = (Button)findViewById(R.id.save);
        b.setVisibility(View.VISIBLE);
        roll.setEnabled(true);
        roll.setFocusableInTouchMode(true);
        roll.setClickable(true);

        ct1.setEnabled(true);
        ct1.setFocusableInTouchMode(true);
        ct1.setClickable(true);

       ct2.setEnabled(true);
        ct2.setFocusableInTouchMode(true);
        ct2.setClickable(true);

        ct3.setEnabled(true);
        ct3.setFocusableInTouchMode(true);
        ct3.setClickable(true);

        ct4.setEnabled(true);
        ct4.setFocusableInTouchMode(true);
        ct4.setClickable(true);

        days.setEnabled(true);
        days.setFocusableInTouchMode(true);
        days.setClickable(true);

        present.setEnabled(true);
        present.setFocusableInTouchMode(true);
        present.setClickable(true);

        exam.setEnabled(true);
        exam.setFocusableInTouchMode(true);
        exam.setClickable(true);




        ct1_2.setEnabled(true);
        ct1_2.setFocusableInTouchMode(true);
        ct1_2.setClickable(true);

        ct2_2.setEnabled(true);
        ct2_2.setFocusableInTouchMode(true);
        ct2_2.setClickable(true);

        ct3_2.setEnabled(true);
        ct3_2.setFocusableInTouchMode(true);
        ct3_2.setClickable(true);

        ct4_2.setEnabled(true);
        ct4_2.setFocusableInTouchMode(true);
        ct4_2.setClickable(true);

        days_2.setEnabled(true);
        days_2.setFocusableInTouchMode(true);
        days_2.setClickable(true);

        present_2.setEnabled(true);
        present_2.setFocusableInTouchMode(true);
        present_2.setClickable(true);

        exam_2.setEnabled(true);
        exam_2.setFocusableInTouchMode(true);
        exam_2.setClickable(true);





        ct1_3.setEnabled(true);
        ct1_3.setFocusableInTouchMode(true);
        ct1_3.setClickable(true);

        ct2_3.setEnabled(true);
        ct2_3.setFocusableInTouchMode(true);
        ct2_3.setClickable(true);

        ct3_3.setEnabled(true);
        ct3_3.setFocusableInTouchMode(true);
        ct3_3.setClickable(true);

        ct4_3.setEnabled(true);
        ct4_3.setFocusableInTouchMode(true);
        ct4_3.setClickable(true);

        days_3.setEnabled(true);
        days_3.setFocusableInTouchMode(true);
        days_3.setClickable(true);

        present_3.setEnabled(true);
        present_3.setFocusableInTouchMode(true);
        present_3.setClickable(true);

        exam_3.setEnabled(true);
        exam_3.setFocusableInTouchMode(true);
        exam_3.setClickable(true);




        ct1_4.setEnabled(true);
        ct1_4.setFocusableInTouchMode(true);
        ct1_4.setClickable(true);

        ct2_4.setEnabled(true);
        ct2_4.setFocusableInTouchMode(true);
        ct2_4.setClickable(true);

        ct3_4.setEnabled(true);
        ct3_4.setFocusableInTouchMode(true);
        ct3_4.setClickable(true);

        ct4_4.setEnabled(true);
        ct4_4.setFocusableInTouchMode(true);
        ct4_4.setClickable(true);

        days_4.setEnabled(true);
        days_4.setFocusableInTouchMode(true);
        days_4.setClickable(true);

        present_4.setEnabled(true);
        present_4.setFocusableInTouchMode(true);
        present_4.setClickable(true);

        exam_4.setEnabled(true);
        exam_4.setFocusableInTouchMode(true);
        exam_4.setClickable(true);



        ct1_5.setEnabled(true);
        ct1_5.setFocusableInTouchMode(true);
        ct1_5.setClickable(true);

        ct2_5.setEnabled(true);
        ct2_5.setFocusableInTouchMode(true);
        ct2_5.setClickable(true);

        ct3_5.setEnabled(true);
        ct3_5.setFocusableInTouchMode(true);
        ct3_5.setClickable(true);

        ct4_5.setEnabled(true);
        ct4_5.setFocusableInTouchMode(true);
        ct4_5.setClickable(true);

        days_5.setEnabled(true);
        days_5.setFocusableInTouchMode(true);
        days_5.setClickable(true);

        present_5.setEnabled(true);
        present_5.setFocusableInTouchMode(true);
        present_5.setClickable(true);

        exam_5.setEnabled(true);
        exam_5.setFocusableInTouchMode(true);
        exam_5.setClickable(true);




    }



    public void back(View v) {
        Intent MainActivityIntent = new Intent(DisplayContact.this,MainActivity.class);
        startActivity(MainActivityIntent);
        super.onBackPressed();

    }
}


