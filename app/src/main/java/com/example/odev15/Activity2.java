package com.example.odev15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import com.example.odev15.databinding.Activity2Binding;



public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = Activity2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Intent intent = getIntent();
        Bilgiler bilgiler = (Bilgiler) intent.getSerializableExtra("bilgiler");
        binding.textViewAdiSoyadi.setText(bilgiler.getAdiSoyadi());
        binding.textViewTelefonNo.setText(bilgiler.getTelefonNo());
        binding.textViewEmail.setText(bilgiler.geteMail());
    }

    public Activity2Binding binding;
}