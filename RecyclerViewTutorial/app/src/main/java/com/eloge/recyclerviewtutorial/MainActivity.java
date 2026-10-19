
package com.eloge.recyclerviewtutorial;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        String[] names = {
                "Alice",
                "Bob",
                "Claire",
                "David",
                "Emma",
                "Paul"
        };

        recyclerView.setLayoutManager(
                new LinearLayoutManager(this)
        );

        adapter = new MyAdapter(names);

        recyclerView.setAdapter(adapter);
    }
}
