package com.example.user.adoptionanimal.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.user.adoptionanimal.R;
import com.example.user.adoptionanimal.activity.AnimalInformationActivity;
import com.example.user.adoptionanimal.model.Animal;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AdoptionAnimalRVAdapter extends RecyclerView.Adapter {
    private Context context;
    private ArrayList<Animal> list;

    public AdoptionAnimalRVAdapter(Context context, ArrayList<Animal> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, final int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_rv_animal, parent, false));
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolder) {
            ViewHolder h = (ViewHolder) holder;
            final Animal item = list.get(position);
            Picasso.with(context)
                    .load(item.getImageName())
                    .resize(350, 350)
                    .centerCrop().into(h.img);
            h.name.setText(item.getName());
            h.sex.setText(item.getSex());
            h.type.setText(item.getType());
            h.build.setText(item.getBuild());
            h.age.setText(item.getAge());
            h.itemView.findViewById(R.id.cv_item_rv_animal).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = holder.getAdapterPosition();
                    Animal animal = list.get(position);
                    Intent intent = new Intent();
                    intent.setClass(context, AnimalInformationActivity.class);
                    intent.putExtra("Animal", animal);
                    context.startActivity(intent);
                }
            });
        }
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    private class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView name;
        TextView sex;
        TextView type;
        TextView build;
        TextView age;

        public ViewHolder(View v) {
            super(v);
            img = (ImageView) v.findViewById(R.id.iv_item_rv_animal_img);
            name = (TextView) v.findViewById(R.id.tv_item_rv_animal_name);
            sex = (TextView) v.findViewById(R.id.tv_item_rv_animal_sex);
            type = (TextView) v.findViewById(R.id.tv_item_rv_animal_type);
            build = (TextView) v.findViewById(R.id.tv_item_rv_animal_build);
            age = (TextView) v.findViewById(R.id.tv_item_rv_animal_age);
        }
    }
}
