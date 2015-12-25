package com.example.administrator.fragmenttalkswithactivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements TalkFrament.FragCallBack{
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        TalkFrament talkFrament = new TalkFrament();
        Bundle data = new Bundle();
        data.putString("activity","hello i am activity!");
        talkFrament.setArguments(data);
        fragmentTransaction.add(R.id.ll_forreplace, talkFrament,"talksfrag");
        fragmentTransaction.commit();
    }

    @Override
    public void getDatafromFrag(String data) {
        Toast.makeText(this, "activity receives:" + data, Toast.LENGTH_LONG).show();
    }
}
