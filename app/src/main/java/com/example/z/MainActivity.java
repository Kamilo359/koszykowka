package com.example.z;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.z.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    int punkty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        binding.textView.setText(" "+punkty);
        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punkty ++;
                binding.textView.setText(" "+punkty);
            }
        });
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punkty +=2;
                binding.textView.setText(" "+punkty);
            }
        });
        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                punkty +=3;
                binding.textView.setText(" "+punkty);
            }
        });
    }
}