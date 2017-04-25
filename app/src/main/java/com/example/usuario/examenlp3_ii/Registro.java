package com.example.usuario.examenlp3_ii;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.usuario.examenlp3_ii.bean.UsuarioReg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Registro extends AppCompatActivity {

    EditText edtNombre;
    EditText edtApellido;
    EditText edtUser;
    EditText edtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edtNombre = (EditText) findViewById(R.id.edtNombre);
        edtApellido = (EditText) findViewById(R.id.edtApellido);
        edtUser = (EditText) findViewById(R.id.edtUser);
        edtPass = (EditText) findViewById(R.id.edtPass);
        Button btnGuard= (Button) findViewById(R.id.btnGuard);

        Bundle parameters = getIntent().getExtras();
        final int usuarioId = (int) parameters.getInt("usuarioId");

        if(usuarioId!=0){
            UsuarioReg usuarioReg = getUserRegById(usuarioId);
            edtNombre.setText(usuarioReg.getName());
            edtApellido.setText(usuarioReg.getLastName());
            edtUser.setText(usuarioReg.getUser());
            edtPass.setText(usuarioReg.getPassword());
        }

        btnGuard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usuarioId==0){
                    Random r = new Random();
                    int usId = r.nextInt(1000)+1;
                    Usuarios.listUsers.add(new UsuarioReg(usId,edtNombre.getText().toString(),edtApellido.getText().toString(),edtUser.getText().toString(),edtPass.getText().toString()));
                    goLog();
                }else {

                    editPerson(usuarioId,edtNombre.getText().toString(),edtApellido.getText().toString(),edtUser.getText().toString(),edtPass.getText().toString());

                }
                goLog();
            }
        });
    }
    public void editPerson(int userId, String name, String lastName, String user, String pasword){

        List<UsuarioReg> lista2 = new ArrayList<UsuarioReg>();
        for (UsuarioReg usuarioReg:Usuarios.listUsers){
            if (usuarioReg.getUsuarioId()==userId){

                usuarioReg.setName(name);
                usuarioReg.setLastName(lastName);
                usuarioReg.setUser(user);
                usuarioReg.setPassword(pasword);

            }
            lista2.add(usuarioReg);
        }

        Usuarios.listUsers = lista2;

    }
    public void goLog(){
        Intent e = new Intent(this, MainActivity.class);
        startActivity(e);
    }
    public void goUser(){
        Intent i = new Intent(this, Usuarios.class);
        startActivity(i);
    }
    public UsuarioReg getUserRegById(int usuarioId){
        List<UsuarioReg> listUser = Usuarios.listUsers ;

        for (UsuarioReg usuarioReg:listUser){
            if(usuarioReg.getUsuarioId()==usuarioId){
                return usuarioReg;
            }
        }
        return null;
    }

}
