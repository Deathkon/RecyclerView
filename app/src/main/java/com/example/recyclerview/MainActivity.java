package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView myRecycler;
    RecyclerView.LayoutManager layoutManager;
    List<String> mList = new ArrayList<>();
    MyRecAdapter myRecAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRecycler=findViewById(R.id.myRecycler);
        myRecAdapter =new MyRecAdapter(this,mList);

        mList.add("Samsung");
        mList.add("iPhone");
        mList.add("Nokia");
        mList.add("Tecno");
        mList.add("Infinix");
        layoutManager= new LinearLayoutManager(this);
        myRecycler.setLayoutManager(layoutManager);
        myRecycler.setAdapter(myRecAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mnuView:
                //call activity containing custom recycler view
                startActivity(new Intent(MainActivity.this, RecylerActivity.class));
                break;
            case R.id.mnuAdd:
                //
                break;
            case R.id.mnuLocation:
https://youtu.be/W0xf1MWoQ7Y 
            case R.id.mnuUpload:
                break;
        }
        return super.onOptionsItemSelected(item);
}
}