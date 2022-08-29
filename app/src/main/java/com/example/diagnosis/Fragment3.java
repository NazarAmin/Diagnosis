package com.example.diagnosis;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;


public class Fragment3 extends Fragment {


    Button check;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_3, container, false);

        check = (Button) v.findViewById(R.id.check);

        CheckBox p21=(CheckBox)v.findViewById(R.id.p21);
        CheckBox p22=(CheckBox)v.findViewById(R.id.p22);
        CheckBox p23=(CheckBox)v.findViewById(R.id.p23);
        CheckBox p24=(CheckBox)v.findViewById(R.id.p24);
        CheckBox p25=(CheckBox)v.findViewById(R.id.p25);
        CheckBox p26=(CheckBox)v.findViewById(R.id.p26);
        CheckBox p27=(CheckBox)v.findViewById(R.id.p27);
        CheckBox p28=(CheckBox)v.findViewById(R.id.p28);
        CheckBox p29=(CheckBox)v.findViewById(R.id.p29);


        p21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p21.isChecked()) { GlobalClass.f21 = true;}}});

        p22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p22.isChecked()) { GlobalClass.f22 = true;}}});

        p23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p23.isChecked()) { GlobalClass.f23 = true;}}});

        p24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p24.isChecked()) { GlobalClass.f24 = true;}}});

        p25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p25.isChecked()) { GlobalClass.f25 = true;}}});

        p26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p26.isChecked()) { GlobalClass.f26 = true;}}});

        p27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p27.isChecked()) { GlobalClass.f27 = true;}}});

        p28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p28.isChecked()) { GlobalClass.f28 = true;}}});

        p29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p29.isChecked()) { GlobalClass.f29 = true;}}});



        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), Result.class));
            }
        });


        return v;


    }



}