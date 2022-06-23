package com.e.displaylistofmobiles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  ListView dm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dm=findViewById(R.id.dm);
        dm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Position : "+i+"\nItem : "+
                        ((TextView)view).getText() , Toast.LENGTH_SHORT).show();

                // Asus ---- Asus Activity must be open with mobile photo and about company

                //when i click on asus --- asus passing to next activity

            }
        });
    }
}