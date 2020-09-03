package com.maderastra.layoutguided9618;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup = findViewById(R.id.radio_group);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                final String value = ((RadioButton)findViewById(group.getCheckedRadioButtonId())).getText().toString();
                switch (value){
                    case "Linear Layout":
                        Fragment linearFragment = new LinearFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fragment_layout, linearFragment)
                                .commit();
                        break;
                    case "Constraint Layout":
                        Fragment constraintFragment = new ConstraintFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fragment_layout, constraintFragment)
                                .commit();
                        break;
                    case "Frame Layout":
                        Fragment frameFragment = new FrameFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.fragment_layout, frameFragment)
                                .commit();
                        break;
                }
            }
        });
    }
}