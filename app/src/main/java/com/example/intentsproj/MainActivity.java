package com.example.intentsproj;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    String v1, v2;
    EditText e1, e2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText2);
    }
   @Override
    protected  void onResume() {
       super.onResume();

       btn.setOnClickListener(new View.OnClickListener(){

           @Override
           public void onClick(View v){


               Context context = getApplicationContext();
               CharSequence message = "You just clicked OK";
               int duration = Toast.LENGTH_SHORT;
               Toast toast = Toast.makeText(context,message,duration);
               toast.show();

               v1 = e1.getText().toString();
               v2 = e2.getText().toString();
               Intent intent = new Intent(MainActivity.this,SecondActivity.class);

               intent.putExtra("Value1", v1);
               intent.putExtra("Value2", v2);

               startActivity(intent);

           }
       });


   }


}



