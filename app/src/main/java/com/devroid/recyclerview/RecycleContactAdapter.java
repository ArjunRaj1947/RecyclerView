package com.devroid.recyclerview;

import android.content.Context;
import android.content.pm.LabeledIntent;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleContactAdapter extends RecyclerView.Adapter<RecycleContactAdapter.ViewHolder>{
    ArrayList<ContactModel> arrContacts;
    Context context;
    RecycleContactAdapter(Context context,ArrayList<ContactModel> arrContacts){
        this.context=context;
        this.arrContacts=arrContacts;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         View view=LayoutInflater.from(context).inflate(R.layout.contact_row,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgContact.setImageResource(arrContacts.get(position).img);
       holder.txtname.setText(arrContacts.get(position).name);
       holder.txtNubmer.setText(arrContacts.get(position).number);
    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtname,txtNubmer;
        ImageView imgContact;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtname=itemView.findViewById(R.id.txtName);
            txtNubmer=itemView.findViewById(R.id.txtNumber);
            imgContact=itemView.findViewById(R.id.imgContact);


        }
    }
}



