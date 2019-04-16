package com.example.placeholder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ViewDatabase extends AppCompatActivity {

    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_database);

        output = findViewById(R.id.outputview);

        //click the output textfield (the whole screen basically) to display the tables in the database
        output.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //calls showCustomers which displays the tables
                showCustomers(v);
            }
        });

    }

    //method displays tables in the output textbox using the loadHandler in DatabaseHelper
    public void showCustomers(View view) {
        DatabaseHelper dbHandler = new DatabaseHelper(this);
        output.setText(dbHandler.loadHandler());
    }
}