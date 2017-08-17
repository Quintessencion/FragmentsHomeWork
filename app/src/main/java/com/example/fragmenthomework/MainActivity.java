package com.example.fragmenthomework;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.fragmenthomework.fragments.FragmentDate;
import com.example.fragmenthomework.fragments.FragmentPictures;
import com.example.fragmenthomework.fragments.FragmentTime;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Fields
    FragmentTime fragTime;
    FragmentDate fragDate;
    FragmentPictures fragPict;

    FragmentTransaction fragTrans;

    Button btnTime, btnDate, btnPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        btnTime = (Button) findViewById(R.id.btnTime);
        btnTime.setOnClickListener(this);
        btnDate = (Button) findViewById(R.id.btnDate);
        btnDate.setOnClickListener(this);
        btnPicture = (Button) findViewById(R.id.btnPicture);
        btnPicture.setOnClickListener(this);

        fragTime = new FragmentTime();
        fragDate = new FragmentDate();
        fragPict = new FragmentPictures();
    }

    @Override
    public void onClick(View v) {
        fragTrans = getFragmentManager().beginTransaction();

        switch (v.getId()) {
            case R.id.btnTime:
                fragTrans.replace(R.id.fragCont, fragTime);
                break;
            case R.id.btnDate:
                fragTrans.replace(R.id.fragCont, fragDate);
                break;
            case R.id.btnPicture:
                fragTrans.replace(R.id.fragCont, fragPict);
                break;
        }
        fragTrans.commit();
    }
}
