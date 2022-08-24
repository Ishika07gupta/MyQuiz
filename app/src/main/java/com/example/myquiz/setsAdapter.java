package com.example.myquiz;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class setsAdapter extends BaseAdapter {

    private int numOfSets;

    public setsAdapter(int numOfSets) {
        this.numOfSets = numOfSets;
    }


    @Override
    public int getCount() {
        return numOfSets;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {

        View v;
        if(convertview==null)
        {
            v= LayoutInflater.from(parent.getContext()).inflate(R.layout.set_item_layout,parent, false);
        }
        else
        {
            v=convertview;
        }

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(parent.getContext(),Ques_Activity.class);
                intent.putExtra("SETNO",position+1);
                parent.getContext().startActivity(intent);
            }
        });

        ((TextView) v.findViewById(R.id.set_number)).setText(String.valueOf(position+1));

        return v;
    }
}
