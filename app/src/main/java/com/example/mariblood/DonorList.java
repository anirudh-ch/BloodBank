package com.example.mariblood;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class DonorList extends ArrayAdapter {

    private Activity context;
    private List<Donor> donorList;


    public DonorList(Activity context, List<Donor> donorList){
        super(context,R.layout.list_layout,donorList);
        this.context = context;
        this.donorList = donorList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.list_layout,null,true);

        TextView textViewHospitalName = (TextView) listViewItem.findViewById(R.id.textViewHospitalName);
        TextView textViewHospitalNumber = (TextView) listViewItem.findViewById(R.id.textViewHospitalNumber);
        TextView textViewDonorName = (TextView) listViewItem.findViewById(R.id.textViewDonorName);
        TextView textViewDonorAge = (TextView) listViewItem.findViewById(R.id.textViewDonorAge);
        TextView textViewDonorDate = (TextView) listViewItem.findViewById(R.id.textViewDonorDate);
        TextView textViewBloodType = (TextView) listViewItem.findViewById(R.id.textViewBloodType);

        Donor donor = donorList.get(position);
        textViewHospitalName.setText(donor.getHospitalName());
        textViewHospitalNumber.setText(donor.getHospitalNumber());
        textViewDonorName.setText(donor.getDonorName());
        textViewDonorAge.setText(donor.getDonorAge());
        textViewDonorDate.setText(donor.getDonorDate());
        textViewBloodType.setText(donor.getBloodType());

        return listViewItem;

    }
}
