package com.example.administrator.fragmenttalkswithactivity;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class TalkFrament extends Fragment {
    interface FragCallBack{
        void getDatafromFrag(String data);
    }
    FragCallBack  fragCallBack;
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.i("bitch", "onAttach");
        Toast.makeText(getActivity(), "fragment receives:" + getArguments().get("activity").toString(), Toast.LENGTH_LONG).show();
        fragCallBack = (FragCallBack) activity;
        fragCallBack.getDatafromFrag("hi i am fragment");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.i("bitch", "onCreateView");
        return inflater.inflate(R.layout.fragment_talks,null);
    }
}
