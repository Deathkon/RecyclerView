package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecylerActivity extends AppCompatActivity {
    RecyclerView customRecycler;
    RecyclerView.LayoutManager layoutManager;
    custom_Adapter mycustomAdapter;
    List<Item> itemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyler);
        customRecycler = findViewById(R.id.myRecycler);
        layoutManager = new LinearLayoutManager(this);
        customRecycler.setLayoutManager(layoutManager);
        itemList = new ArrayList<>();
        itemList = fillTheList();
        mycustomAdapter = new custom_Adapter(this, itemList);
        customRecycler.setAdapter(mycustomAdapter);
        
    }

    private List<Item> fillTheList() {
     List<Item> itemList = new ArrayList<>();
     itemList.add(new Item(R.drawable.bible, "Bible", 2000, "Red Apple are rich on vitamins, proteins and fats"));
     itemList.add(new Item(R.drawable.dice, "Dice", 3000,"We have yellow bananas"));
     itemList.add(new Item(R.drawable.bg, "Background", 2000, "Cherry are rich on vitamins, proteins and fats"));
     itemList.add(new Item(R.drawable.linux, "Linux OS", 5000,"Grapes are full of important vitamins and zinc"));
     itemList.add(new Item(R.drawable.toys, "Iron Man Toy", 5000,"Grapes are full of important vitamins and zinc"));
     itemList.add(new Item(R.drawable.bg1, "Background 2", 5000,"Grapes are full of important vitamins and zinc"));

     return itemList;
    }
}