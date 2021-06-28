package com.example.recyclerviewdemo;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private LayoutInflater layoutInflater;
    private List<String>data;
    private View View;
    private Object ViewGroup;
    private boolean attachToRoot;


    Adapter(Context context,List<String>data){
        this.layoutInflater= LayoutInflater.from(context);
        this.data = data;

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.custom_view, ViewGroup, attachToRoot  :false );

        return new ViewHolder(View);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder ViewHolder, int i) {
        // bind the textview with data recived
        String name = data.get(i);
        ViewHolder.textname.setText(name);
        //simalary you can set new image for each card and descryption

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textname,textdescryption,price;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            textname = itemView.findViewById(R.id.textname);
            textdescryption= itemView.findViewById(R.id.textdesc);
            price=itemView.findViewById(R.id.textprice);
        }
    }
}
