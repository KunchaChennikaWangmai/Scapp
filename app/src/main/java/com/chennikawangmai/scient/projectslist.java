package com.chennikawangmai.scient;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class projectslist extends Fragment {
    String ts;
    ArrayAdapter arrayAdapter;
    private ListView listView;
    private String[] kd;
    public projectslist() {
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {listView=getView().findViewById(R.id.listView);
    kd=new String[5];
kd[0]="PSI Mirage";
kd[1]="Vrex -80";
kd[2]="Exhaust Filter";
kd[3]="Dual Power Washing machine";
kd[4]="+ New Project";
//kd[5]="";
        arrayAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1,kd);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(),Specificproject.class);
                Bundle c=new Bundle();
                c.putString("id",listView.getItemAtPosition(position).toString());
                intent.putExtras(c);
                startActivity(intent);
            }
        });

        listView.setAdapter(arrayAdapter);


        super.onViewCreated(view, savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.activity_projectslist,container,false);

        return (view);
    }


}
