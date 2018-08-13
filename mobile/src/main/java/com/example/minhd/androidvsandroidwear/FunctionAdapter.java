package com.example.minhd.androidvsandroidwear;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FunctionAdapter extends RecyclerView.Adapter<FunctionAdapter.ViewHolder>{

    ArrayList<Function> mFunctions;
    Context context;

    public FunctionAdapter(ArrayList<Function> mFunctions, Context context) {
        this.mFunctions = mFunctions;
        this.context = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View itemView=layoutInflater.inflate(R.layout.item_function,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txtFunctionName.setText(mFunctions.get(position).getFunctionName());
        holder.imgFunctionImage.setImageResource(mFunctions.get(position).getFunctionImage());
    }

    @Override
    public int getItemCount() {
        return mFunctions.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtFunctionName;
        ImageView imgFunctionImage;
        public ViewHolder(View itemView) {
            super(itemView);
            txtFunctionName=(TextView)itemView.findViewById(R.id.txt_functionName);
            imgFunctionImage=(ImageView)itemView.findViewById(R.id.img_functionImage);
        }
    }
}
