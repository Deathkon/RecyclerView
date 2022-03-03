package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;


public class ItemDetails extends AppCompatActivity {
    ImageView imageView;
    TextView name,price,tvDescription;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);
        imageView = findViewbyId(R.id.itemImageD);
        name = findViewbyId(R.id.itemNameD);
        price = findViewbyId(R.id.itemPriceD);
        description = findViewbyId(R.id.itemDescrD);
        
        }
}
