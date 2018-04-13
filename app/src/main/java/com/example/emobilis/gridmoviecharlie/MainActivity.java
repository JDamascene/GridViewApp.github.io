package com.example.emobilis.gridmoviecharlie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView mGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGrid = findViewById(R.id.grid);

        ImageAdapter adapter = new ImageAdapter(this);
        mGrid.setAdapter(adapter);

        mGrid.setOnItemClickListener(new AdapterView.OnItemClickListener( ) {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
               //Intent to the details page
                //pass the info
                Intent details = new Intent(getApplicationContext(),DetailsActivity.class);
                details.putExtra("data",position);
                startActivity(details);
            }
        });
    }
}
