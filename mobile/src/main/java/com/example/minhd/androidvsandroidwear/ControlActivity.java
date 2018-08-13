package com.example.minhd.androidvsandroidwear;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class ControlActivity extends AppCompatActivity {

    RecyclerView rvFunction;
    TextView txtGreeting,txtUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        initView();

        txtGreeting=(TextView)findViewById(R.id.txt_greeting);
        txtUserName=(TextView)findViewById(R.id.txt_userName);
    }

    public void initView(){

        ArrayList<Function> arrayList=new ArrayList<>();
        arrayList.add(new Function(R.drawable.ic_launcher_background,"ABC"));
        arrayList.add(new Function(R.drawable.ic_launcher_background,"XYZ"));
        arrayList.add(new Function(R.drawable.ic_launcher_background,"QWE"));
        arrayList.add(new Function(R.drawable.ic_launcher_background,"ASD"));
        arrayList.add(new Function(R.drawable.ic_launcher_background,"ZXC"));

        rvFunction=(RecyclerView)findViewById(R.id.rv_function);
        rvFunction.setHasFixedSize(true);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        rvFunction.setLayoutManager(layoutManager);

        FunctionAdapter functionAdapter=new FunctionAdapter(arrayList,getApplicationContext());
        rvFunction.setAdapter(functionAdapter);

    }

}
