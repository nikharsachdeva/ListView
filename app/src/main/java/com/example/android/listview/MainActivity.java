package com.example.android.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView myFriends = findViewById(R.id.myFriends);

        final ArrayList<String> myFriendsList = new ArrayList<String>();

        myFriendsList.add("Suraj");
        myFriendsList.add("Mannu");
        myFriendsList.add("Shivansh");
        myFriendsList.add("Akash");
        myFriendsList.add("Avnish");
        myFriendsList.add("Ayush");
        myFriendsList.add("Goyal");
        myFriendsList.add("Arjun");
        myFriendsList.add("Mukund");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myFriendsList);

        myFriends.setAdapter(arrayAdapter);

        myFriends.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(),myFriendsList.get(i),Toast.LENGTH_LONG).show();
            }
        });



    }
}
