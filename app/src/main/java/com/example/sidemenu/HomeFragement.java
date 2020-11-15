package com.example.sidemenu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class HomeFragement extends Fragment {
    @Nullable
    Button bt1 , bt2;
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,container,false);

        bt1 = view.findViewById(R.id.btn1);
        bt2 = view.findViewById(R.id.btn2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             FragmentTransaction fr = getFragmentManager().beginTransaction();
             fr.replace(R.id.frameLyout,new Login());
             fr.commit();
            }
        });


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.frameLyout,new SignUp());
                fr.commit();
            }
        });
        return view;
    }
}
