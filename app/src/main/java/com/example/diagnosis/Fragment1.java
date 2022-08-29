package com.example.diagnosis;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

public class Fragment1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment1, container, false);

        CheckBox p1=(CheckBox)v.findViewById(R.id.p1);
        CheckBox p2=(CheckBox)v.findViewById(R.id.p2);
        CheckBox p3=(CheckBox)v.findViewById(R.id.p3);
        CheckBox p4=(CheckBox)v.findViewById(R.id.p4);
        CheckBox p5=(CheckBox)v.findViewById(R.id.p5);
        CheckBox p6=(CheckBox)v.findViewById(R.id.p6);
        CheckBox p7=(CheckBox)v.findViewById(R.id.p7);
        CheckBox p8=(CheckBox)v.findViewById(R.id.p8);
        CheckBox p9=(CheckBox)v.findViewById(R.id.p9);
        CheckBox p10=(CheckBox)v.findViewById(R.id.p10);

        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p1.isChecked()) { GlobalClass.f1 = true;}}});

        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p2.isChecked()) { GlobalClass.f2 = true;}}});

        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p3.isChecked()) { GlobalClass.f3 = true;}}});

        p4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p4.isChecked()) { GlobalClass.f4 = true;}}});

        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p5.isChecked()) { GlobalClass.f5 = true;}}});

        p6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p6.isChecked()) { GlobalClass.f6 = true;}}});

        p7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p7.isChecked()) { GlobalClass.f7 = true;}}});

        p8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p8.isChecked()) { GlobalClass.f8 = true;}}});

        p9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p9.isChecked()) { GlobalClass.f9 = true;}}});

        p10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p10.isChecked()) { GlobalClass.f10 = true;}}});
        // Inflate the layout for this fragment
        return v;



    }

}