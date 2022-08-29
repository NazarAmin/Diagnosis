package com.example.diagnosis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    //private FirebaseAuth mAuth;

    EditText email, password;
    String pass_check;
    String email_check;
    Button login;
    TextView register;
    ProgressBar progressBar;
    TextInputLayout emailError, passError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mAuth = FirebaseAuth.getInstance();
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        register = (TextView) findViewById(R.id.register);
        emailError = (TextInputLayout) findViewById(R.id.emailError);
        passError = (TextInputLayout) findViewById(R.id.passError);
        progressBar = (ProgressBar) findViewById(R.id.progressbar);
        progressBar.setVisibility(View.INVISIBLE);
        email_check = email.getText().toString().trim();
        pass_check = password.getText().toString().trim();


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                SetValidation();
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Register.class);
                startActivity(intent);
                //Toast.makeText(getApplicationContext(), "Please call admin (0123495541 Nasreldein) for adding new user", Toast.LENGTH_SHORT).show();
            }

        });
    }

    public void SetValidation() {

        email_check = email.getText().toString().trim();
        pass_check = password.getText().toString().trim();

      //  int iend = email_check.indexOf("@");
        //GlobalClass.user_name_string = email_check.substring(0 , iend);

        if (email_check.equals("user1")) {
           //GlobalClass.actual_user_name = user.getUser();
            progressBar.setVisibility(View.GONE);
            Toast.makeText(getApplicationContext(), "Logged on as user 1 Successfully", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(MainActivity.this, Diagnosis55.class));
        }else{
            progressBar.setVisibility(View.GONE);

            Toast.makeText(getApplicationContext(), "Failed! Please check credentials", Toast.LENGTH_SHORT).show();
        }

    }
}
/**
        mAuth.signInWithEmailAndPassword(email_check, pass_check).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

                    DatabaseReference ref3 = firebaseDatabase.getReference(GlobalClass.database + "/users");
                    ref3.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                            if (dataSnapshot.hasChildren()) {
                                for (DataSnapshot mydatasnapshot : dataSnapshot.getChildren()) {
                                    Users user = mydatasnapshot.getValue(Users.class);
                                    if (user.getEmail().equals(email_check)) {
                                        GlobalClass.actual_user_name = user.getUser();
                                        progressBar.setVisibility(View.GONE);
                                        Toast.makeText(getApplicationContext(), "Logged on as " + user.getUser() + " Successfully", Toast.LENGTH_SHORT).show();
                                        startActivity(new Intent(MainActivity.this, Blocks.class));
                                    }

                                }
                            }
                        }
                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {

                        }
                    });


                }else{
                    progressBar.setVisibility(View.GONE);

                    Toast.makeText(getApplicationContext(), "Failed! Please check credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
 **/