package com.example.group2_capstone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    TextView text1;
    Button btn1;
    RecyclerView recView;
    String s1[], s2[];
    int images[] = {R.drawable.put_iamge,R.drawable.put_iamge,R.drawable.put_iamge,R.drawable.put_iamge,
            R.drawable.put_iamge,R.drawable.put_iamge,R.drawable.put_iamge,
            R.drawable.put_iamge,R.drawable.put_iamge};

    Typeface boldTypeface = Typeface.defaultFromStyle(Typeface.BOLD);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button2);
        btn1.setOnClickListener(this);

        text1 = findViewById(R.id.menu1);
        text1.setTypeface(boldTypeface);

        s1 = getResources().getStringArray(R.array.item_sale);
        s2 = getResources().getStringArray(R.array.item_desc);

    }

    @Override
    public void onClick(View view) {
        setContentView(R.layout.second_screen);
        recView = findViewById(R.id.recyclerView);
        Adapter adapter = new Adapter(this, s1, s2, images);
        recView.setAdapter(adapter);
        recView.setLayoutManager(new LinearLayoutManager(this));
    }
}