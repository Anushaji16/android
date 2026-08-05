package com.example.gridcalculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    EditText   n1,n2 ;

    TextView t1,t2;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.button2);
        b2=findViewById(R.id.button3);
        b3=findViewById(R.id.button4);
        b4=findViewById(R.id.button5);


        n1=(EditText)findViewById(R.id.editTextText11);
        n2=(EditText)findViewById(R.id.editTextText12);

        t1=(TextView)findViewById(R.id.textView3);
        t2=(TextView)findViewById(R.id.textView);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

         double f1=Double.parseDouble(n1.getText().toString());
         double f2=Double.parseDouble(n2.getText().toString());

         t1.setText("addition= " +(f1+f2));

            }
                              });

            b2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view)  {

                 double f1=Double.parseDouble(n1.getText().toString());
                 double f2=Double.parseDouble(n2.getText().toString());
                 double cal= f1 - f2;
                 t1.setText("substraction= " +cal);
                }
                                  });

               b3.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {

                                             double f1 = Double.parseDouble(n1.getText().toString());
                                             double f2 = Double.parseDouble(n2.getText().toString());
                                             double cal = f1 * f2;
                                             t1.setText("multiplication= " + cal);
                                         }
                                     });
                 b4.setOnClickListener(new View.OnClickListener()

                   {
                       @Override
                       public void onClick (View view){

                       double f1 = Double.parseDouble(n1.getText().toString());
                       double f2 = Double.parseDouble(n2.getText().toString());
                        double cal = f1/f2;
                       t1.setText("division = " + cal);

                   }
                   });
               }
            }

