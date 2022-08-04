package com.example.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.cadastro.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Formulario form;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        form = new Formulario();
        radioButton();
        spinner();

        binding.btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = binding.inputName.getText().toString();
                String phone = binding.inputPhone.getText().toString();
                String email = binding.inputEmail.getText().toString();
                Boolean ingressedListOfEmail = binding.checkBox.isChecked();
                String cidade = binding.inputCidade.getText().toString();

                form.setName(name);
                form.setIngressedListOfEmail(ingressedListOfEmail);
                form.setEmail(email);
                form.setPhone(phone);
                form.setCity(cidade);
                Toast.makeText(getApplicationContext(), form.toString() ,Toast.LENGTH_LONG).show();
            }
        });

        binding.btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.inputName.setText("");
                binding.inputEmail.setText("");
                binding.inputPhone.setText("");
                binding.inputCidade.setText("");
                if(binding.checkBox.isChecked()){
                    binding.checkBox.setChecked(false);
                }
                binding.radioGroup.setActivated(false);
            }
        });


    }

    public void spinner(){
        List<String> list = new ArrayList<>(Arrays.asList("AC","AL","AP","AM","BA","CE","DF","ES","GO","MA","MT","MS","MG","PA","PB","PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","TO"));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,list);
        binding.menu.setAdapter(adapter);
        binding.menu.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                form.setUF(adapterView.getItemAtPosition(i).toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void radioButton(){
    binding.radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            if(i == R.id.rbFem){
                form.setGenders(binding.rbFem.getText().toString());
            }else{
                form.setGenders(binding.rbMasc.getText().toString());
            }

        }
    });



    }
}