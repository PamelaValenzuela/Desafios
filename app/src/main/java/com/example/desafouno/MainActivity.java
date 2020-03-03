package com.example.desafouno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imagen1=findViewById(R.id.imagencora);
        Picasso.get()
                .load("https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQn5OtJY9n6r-EQ5spu7fzrzbWtJAI6xFdHMyD_d3IP7fLYHahS").into(imagen1);
        
        Button button = findViewById(R.id.button);
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "Usuario ingresado con éxito", Toast.LENGTH_SHORT).show();
    }
});

        //OnClickListener();


    }
   // public void OnClickListener()
   // {
    //    Toast.makeText(this, "Usuario ingresado con éxito", Toast.LENGTH_SHORT).show();
   // }

}


