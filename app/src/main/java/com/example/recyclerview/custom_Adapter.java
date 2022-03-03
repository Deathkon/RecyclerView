package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class custom_Adapter  extends RecyclerView.Adapter <custom_Adapter.VH>{
    Context context;
    List<Item> itemList;

    public custom_Adapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.custom_row_item,parent, false);
        return new VH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        Item item = itemList.get(position);
        holder.imageView.setImageResource(item.getFilename());
        holder.tvName.setText(item.getItemName());
        holder.tvPrice.setText(" "+item.getItemPrice());
        holder.tvDescription.setText(item.getDescr());
        holder.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ItemDetails.class);
                intent.putExtra("image", item.getFilename());
                intent.putExtra("Name", item.getItemName());
                intent.putExtra("Price", item.getItemPrice());
                intent.putExtra("Description", item.getDescr());
                context.startActivity(intent);
                // Toast.makeText(context, ""+item.getItemName()+"\n"+item.getItemPrice(), Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class VH extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView tvName, tvPrice, tvDescription;

        public VH(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.myImage);
            tvName = itemView.findViewById(R.id.tvName);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvDescription = itemView.findViewById(R.id.tvDescription);
        }
    }
}
