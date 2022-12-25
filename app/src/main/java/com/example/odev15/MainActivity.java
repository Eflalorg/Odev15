package com.example.odev15;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import com.example.odev15.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

    }

    public void digerActivity(View view) {
        String adiSoyadi = binding.editTextTextAdiSoyadi.getText().toString();
        String eMail = binding.editTextTextTelefon.getText().toString();
        String telefonNo = binding.editTextTextEMail.getText().toString();
        Bilgiler bilgilerSerializable = new Bilgiler(adiSoyadi,eMail,telefonNo);
        Intent intent = new Intent(this.getApplicationContext(), Activity2.class);
        intent.putExtra("bilgiler", bilgilerSerializable);
        startActivity(intent);
    }

    private ActivityMainBinding binding;
}