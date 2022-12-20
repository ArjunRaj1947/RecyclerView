package com.devroid.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recView;
    ArrayList<ContactModel> arrContacts=new ArrayList<>();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recView=findViewById(R.id.rec_view);
        recView.setLayoutManager(new LinearLayoutManager(this) );

        arrContacts.add(new ContactModel(R.drawable.boy_2 ,"Amit","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.girl_4,"Pooja","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.girl_1,"Nidhi","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.rohit ,"Sonu","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.girl_2,"Shurbhi","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.girl_3,"Somya","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.boy_6 ,"Monu","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.boy_1 ,"Suraj","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.girl_1 ,"Payal","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.boy_2 ,"Parkash","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.girl_5,"Sakhshi","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.girl_4,"Komal","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.kohli,"Chandan","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.girl_5,"Preeti","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.girl_5,"Surbhi","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.rohit,"Deepak","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.dhoni,"Kunal","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.kohli,"Rahul","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.boy_5,"Jitu","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.girl_2,"Anchal","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.boy_2,"Pawan","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.boy_1,"Sajeev","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.boy_6,"Sumit","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.boy_3,"Nagender","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.boy_5 ,"Ravi","522612")) ;
        arrContacts.add(new ContactModel(R.drawable.boy_6,"Aman","522612")) ;

        RecycleContactAdapter adapter=new RecycleContactAdapter(this,arrContacts);
        recView.setAdapter(adapter);



    }
}