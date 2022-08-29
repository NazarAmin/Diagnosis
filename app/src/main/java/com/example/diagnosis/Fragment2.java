package com.example.diagnosis;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

public class Fragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_2, container, false);

        CheckBox p11=(CheckBox)v.findViewById(R.id.p11);
        CheckBox p12=(CheckBox)v.findViewById(R.id.p12);
        CheckBox p13=(CheckBox)v.findViewById(R.id.p13);
        CheckBox p14=(CheckBox)v.findViewById(R.id.p14);
        CheckBox p15=(CheckBox)v.findViewById(R.id.p15);
        CheckBox p16=(CheckBox)v.findViewById(R.id.p16);
        CheckBox p17=(CheckBox)v.findViewById(R.id.p17);
        CheckBox p18=(CheckBox)v.findViewById(R.id.p18);
        CheckBox p19=(CheckBox)v.findViewById(R.id.p19);
        CheckBox p20=(CheckBox)v.findViewById(R.id.p20);

        p11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p11.isChecked()) { GlobalClass.f11 = true;}}});

        p12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p12.isChecked()) { GlobalClass.f12 = true;}}});

        p13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p13.isChecked()) { GlobalClass.f13 = true;}}});

        p14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p14.isChecked()) { GlobalClass.f14 = true;}}});

        p15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p15.isChecked()) { GlobalClass.f15 = true;}}});

        p16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p16.isChecked()) { GlobalClass.f16 = true;}}});

        p17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p17.isChecked()) { GlobalClass.f17 = true;}}});

        p18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p18.isChecked()) { GlobalClass.f18 = true;}}});

        p19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p19.isChecked()) { GlobalClass.f19 = true;}}});

        p20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { if(p20.isChecked()) { GlobalClass.f20 = true;}}});
        // Inflate the layout for this fragment
        return v;
    }

}