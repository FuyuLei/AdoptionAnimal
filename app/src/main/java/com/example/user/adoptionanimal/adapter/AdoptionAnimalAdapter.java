package com.example.user.adoptionanimal.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.user.adoptionanimal.R;
import com.example.user.adoptionanimal.model.Adoption;
import com.example.user.adoptionanimal.model.Animal;

import java.util.ArrayList;

public class AdoptionAnimalAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Animal> list;

    public AdoptionAnimalAdapter(Context context, ArrayList<Animal> list) {
        this.context = context;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
        ViewHolder h;
        if (v == null) {
            v = LayoutInflater.from(context).inflate(R.layout.item_rv_animal, null);
            h = new ViewHolder();
            v.setTag(h);
        } else {
            h = (ViewHolder) v.getTag();
        }
        final Animal item = (Animal) getItem(position);
        h.
    }

    private class ViewHolder {

    }
}
