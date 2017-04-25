package com.example.usuario.examenlp3_ii;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

import com.example.usuario.examenlp3_ii.bean.Person;

/**
 * Created by Usuario on 25/04/2017.
 */

public class PersonListAdapter extends ArrayAdapter<Person> {



    private class ViewHolder{
        TextView name;
        TextView lastName;
        TextView numberPhone;
        TextView txtSex;
        TextView txtStatus;
        ImageView photo;
        Context contextGeneral;
    }

    public PersonListAdapter(Context context, List<Person> rowItem) {
        super(context, R.layout.list_person, rowItem);
    }

    public View getView(int position, View contentView, ViewGroup parent){

        Person person = getItem(position);

        ViewHolder viewHolder;
        if(contentView==null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater=LayoutInflater.from(getContext());
            contentView = inflater.inflate(R.layout.list_person,null);
            viewHolder.name = (TextView)contentView.findViewById(R.id.name);
            viewHolder.lastName = (TextView)contentView.findViewById(R.id.lastName);
            viewHolder.numberPhone = (TextView)contentView.findViewById(R.id.numberPhone);
            viewHolder.txtSex = (TextView)contentView.findViewById(R.id.txtSex);
            viewHolder.txtStatus = (TextView)contentView.findViewById(R.id.txtStatus);
            viewHolder.photo = (ImageView)contentView.findViewById(R.id.photo);
            contentView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder)contentView.getTag();
        }
        viewHolder.name.setText(person.getName());
        viewHolder.lastName.setText(person.getLastName());
        viewHolder.numberPhone.setText(person.getNumberPhone());

        viewHolder.txtSex.setText(person.getSex());
        viewHolder.txtStatus.setText(person.getStatus());
        viewHolder.photo.setImageResource(person.getPhoto());

        return contentView;
    }

}
