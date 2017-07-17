package com.example.user.adoptionanimal.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.user.adoptionanimal.R;
import com.example.user.adoptionanimal.model.Animal;

import org.w3c.dom.Text;

public class SPAdapter extends BaseAdapter {

    private Context context;
    private String[] array;

    public SPAdapter(Context context, String[] array) {
        this.context = context;
        this.array = array;
    }

    @Override
    public int getCount() {
        return array.length;
    }

    @Override
    public Object getItem(int position) {
        return array[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {
        ViewHolder h;
        if (v == null) {
            v = LayoutInflater.from(context).inflate(R.layout.item_sp, null);
            h = new ViewHolder(v);
            v.setTag(h);
        }else {
            h = (ViewHolder) v.getTag();
        }
        h.content.setText(getItem(position).toString());
        return v;
    }

    private class ViewHolder {
        TextView content;

        ViewHolder(View v) {
            content = (TextView) v.findViewById(R.id.tv_item_sp_content);
        }
    }
}
