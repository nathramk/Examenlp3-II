package com.example.usuario.examenlp3_ii;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.usuario.examenlp3_ii.bean.UsuarioReg;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usuario on 25/04/2017.
 */

public class Usuarios extends Fragment{

    public static List<UsuarioReg> listUsers = new ArrayList<UsuarioReg>();
    public int usuarioId = 0;

    public static int layout = android.R.layout.simple_list_item_1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.tab01, container, false);

        ListView listUser = (ListView) view.findViewById(R.id.listUser);
        ArrayAdapter<UsuarioReg> arrayAdapter = new ArrayAdapter<UsuarioReg>(getActivity(), layout, listUsers);
        listUser.setAdapter(arrayAdapter);

        listUser.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                UsuarioReg usuariosReg = (UsuarioReg) parent.getItemAtPosition(position);
                usuarioId = usuariosReg.getUsuarioId();
                Toast.makeText(getActivity(), usuariosReg.getUsuarioId()+usuariosReg.getName(),Toast.LENGTH_SHORT).show();
            }
        });

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.flotEdit);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), Registro.class);
                i.putExtra("usuarioId", usuarioId);
                startActivity(i);
            }
        });
        FloatingActionButton floDelt = (FloatingActionButton) view.findViewById(R.id.floDelt);
        floDelt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                deltePerson();
                Intent e=new Intent(getActivity(),Usuarios.class);
                startActivity(e);
            }
        });

        return view;
    }

    public void deltePerson(){

        List<UsuarioReg> lista2 = new ArrayList<UsuarioReg>();
        for (UsuarioReg usuarioReg:Usuarios.listUsers){
            if (usuarioReg.getUsuarioId()!=usuarioId){

                lista2.add(usuarioReg);

            }
        }

        Usuarios.listUsers=lista2;

    }

}
