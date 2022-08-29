package com.example.diagnosis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends AppCompatActivity {

    Button save, new_case;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String t = "مرض التوحد";
        String e = "مرض فرط الحركة";

        save = (Button) findViewById(R.id.save);
        new_case = (Button) findViewById(R.id.new_case);
        result = (TextView) findViewById(R.id.result);

        if (GlobalClass.f1 && GlobalClass.f2 && GlobalClass.f3){result.setText(t);
        }else if(GlobalClass.f4 && GlobalClass.f5 && GlobalClass.f6){result.setText(t);
        }else if(GlobalClass.f7 && GlobalClass.f8){result.setText(t);
        }else if(GlobalClass.f9 && GlobalClass.f10 && GlobalClass.f11){result.setText(t);
        }else if(GlobalClass.f12 && GlobalClass.f13){result.setText(t);
        }else if(GlobalClass.f14 && GlobalClass.f15 && GlobalClass.f16){result.setText(t);
        }else if(GlobalClass.f17 && GlobalClass.f18 && GlobalClass.f19 && GlobalClass.f20 && GlobalClass.f21){result.setText(e);
        }else if(GlobalClass.f22 && GlobalClass.f23 && GlobalClass.f24){result.setText(e);
        }else if(GlobalClass.f25 && GlobalClass.f26 && GlobalClass.f27){result.setText(e);
        }else if(GlobalClass.f28 && GlobalClass.f29){result.setText(e);

        }else if(GlobalClass.f29 && GlobalClass.f15 && GlobalClass.f1 && GlobalClass.f2 && GlobalClass.f3){result.setText(t);
        }else if(GlobalClass.f25 && GlobalClass.f24 && GlobalClass.f20 && GlobalClass.f8){result.setText(e);
        }else if(GlobalClass.f17 && GlobalClass.f5 && GlobalClass.f20 && GlobalClass.f11){result.setText(t);
        }else if(GlobalClass.f15 && GlobalClass.f9 && GlobalClass.f21 && GlobalClass.f28 && GlobalClass.f19){result.setText(e);

        }else if(GlobalClass.f6 && GlobalClass.f8 && GlobalClass.f18 && GlobalClass.f4){result.setText(t);
        }else if(GlobalClass.f19 && GlobalClass.f23 && GlobalClass.f22 && GlobalClass.f16){result.setText(e);

        }else if(GlobalClass.f29 && GlobalClass.f26 && GlobalClass.f25 && GlobalClass.f5){result.setText(e);
        }else if(GlobalClass.f11 && GlobalClass.f17 && GlobalClass.f20 && GlobalClass.f12){result.setText(t);
        }else if(GlobalClass.f9 && GlobalClass.f10 && GlobalClass.f13 && GlobalClass.f27){result.setText(t);
        }

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "database save in the later stages", Toast.LENGTH_SHORT).show();
            }
        });
        new_case.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Result.this, Diagnosis55.class));

            }
        });

    }
}