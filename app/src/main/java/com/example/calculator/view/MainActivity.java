package com.example.calculator.view;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.calculator.R;
import com.example.calculator.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;
    private TextView current;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.display.setText(R.string.zero);

        // all the event listeners for each button
        binding.ac.setOnClickListener(this);
        binding.plusMinus.setOnClickListener(this);
        binding.modulo.setOnClickListener(this);
        binding.division.setOnClickListener(this);
        binding.seven.setOnClickListener(this);
        binding.eight.setOnClickListener(this);
        binding.nine.setOnClickListener(this);
        binding.multi.setOnClickListener(this);
        binding.four.setOnClickListener(this);
        binding.five.setOnClickListener(this);
        binding.six.setOnClickListener(this);
        binding.minus.setOnClickListener(this);
        binding.one.setOnClickListener(this);
        binding.two.setOnClickListener(this);
        binding.three.setOnClickListener(this);
        binding.plus.setOnClickListener(this);
        binding.zero.setOnClickListener(this);
        binding.dot.setOnClickListener(this);
        binding.equal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        current = (TextView) binding.display;
//        String sevStr = getResources().getString(R.string.seven);

        if (id == R.id.ac) binding.display.setText(R.string.zero);
        else if (id == R.id.plusMinus) binding.display.append(getResources().getString(R.string.minus));
        else if (id == R.id.modulo) binding.display.append(getResources().getString(R.string.modulo));
        else if (id == R.id.division) binding.display.append(getResources().getString(R.string.division));
        else if (id == R.id.seven) current.append(getResources().getString(R.string.seven));
        else if (id == R.id.eight) binding.display.append(getResources().getString(R.string.eight));
        else if (id == R.id.nine) binding.display.append(getResources().getString(R.string.nine));
        else if (id == R.id.multi) binding.display.append(getResources().getString(R.string.multi));
        else if (id == R.id.four) binding.display.append(getResources().getString(R.string.four));
        else if (id == R.id.five) binding.display.append(getResources().getString(R.string.five));
        else if (id == R.id.six) binding.display.append(getResources().getString(R.string.six));
        else if (id == R.id.minus) binding.display.append(getResources().getString(R.string.minus));
        else if (id == R.id.one) binding.display.append(getResources().getString(R.string.one));
        else if (id == R.id.two) binding.display.append(getResources().getString(R.string.two));
        else if (id == R.id.three) binding.display.append(getResources().getString(R.string.three));
        else if (id == R.id.plus) binding.display.append(getResources().getString(R.string.plus));
        else if (id == R.id.zero) binding.display.append(getResources().getString(R.string.zero));
        else if (id == R.id.dot) binding.display.append(getResources().getString(R.string.dot));
        else if (id == R.id.equal) binding.display.append(getResources().getString(R.string.equal));
    }
}