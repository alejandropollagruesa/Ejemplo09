package es.alejandrogr.ejemplo09_navdrawerfragments.FRAGMENTS;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import es.alejandrogr.ejemplo09_navdrawerfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class galleryfrag extends Fragment {

    private Context contexto;

    public galleryfrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_galleryfrag, container, false);


        return rootview;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        contexto = context;
    }
}
