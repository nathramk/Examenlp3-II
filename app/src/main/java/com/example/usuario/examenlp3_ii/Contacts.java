package com.example.usuario.examenlp3_ii;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

import com.example.usuario.examenlp3_ii.bean.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usuario on 25/04/2017.
 */

public class Contacts extends Fragment{

    public static List<Person> listPerson = new ArrayList<Person>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.tab02, container, false);

        ListView listView=(ListView)view.findViewById(R.id.listViews);

        listPerson.add(new Person(1,"Omar","Calsin","Curo","www.ocalsin.com","Av: Manuel Nuñez B. 212 - Juliaca","holas","cddd","ccd","sss","ss",R.drawable.descarga));
        listPerson.add(new Person(2,"Juan","Perez","Perez","www.ocalsin.com","Av: Manuel Nuñez B. 212 - Juliaca","holas","cddd","ccd","sss","ss",R.drawable.descarga));
        listPerson.add(new Person(3,"Lesly","Aguilar","Chaguares","www.ocalsin.com","Av: Manuel Nuñez B. 212 - Juliaca","holas","cddd","ccd","sss","ss",R.drawable.descarga));
        listPerson.add(new Person(4,"Jose Manuel","Limachi","Chavez","www.ocalsin.com","Av: Manuel Nuñez B. 212 - Juliaca","holas","cddd","ccd","sss","ss",R.drawable.descarga));

        PersonListAdapter adapter = new PersonListAdapter(getActivity(),listPerson);

        listView.setAdapter(adapter);
        Button btnIngresar = (Button) view.findViewById(R.id.btnIngresar);



        return view;

    }

    public void goRegistro(View view){
        Intent i = new Intent(getActivity(), RegistroPerson.class);
        startActivity(i);
    }
}
