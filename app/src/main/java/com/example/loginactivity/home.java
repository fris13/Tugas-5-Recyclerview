package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView recyclerView = findViewById(R.id.pahlawan);

        List<itemdata> items = new ArrayList<itemdata>();
        items.add(new itemdata("Lionel messi", "Argentina",R.drawable.leo));
        items.add(new itemdata("Frengki de Jong", "Belanda",R.drawable.dejong));
        items.add(new itemdata("Neymar Jr", "Brazil",R.drawable.ney));
        items.add(new itemdata("Gerarad pique", "Spain",R.drawable.pique));
        items.add(new itemdata("Xavi Hernandes", "Spain",R.drawable.xavi));
        items.add(new itemdata("Terstegen", "Jerman",R.drawable.ters));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new adapterdata(getApplicationContext(),items));
    }
}