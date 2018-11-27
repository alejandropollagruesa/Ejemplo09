package es.alejandrogr.ejemplo09_navdrawerfragments.FRAGMENTS;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import es.alejandrogr.ejemplo09_navdrawerfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class importfrag extends Fragment {

    //Variable que sirve para guardar el contexto;
    private Context contexto;

    private ImageView imgview;
    private Button btnimg1, btnimg2;

    public importfrag() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootview =  inflater.inflate(R.layout.fragment_importfrag, container, false);

        imgview = rootview.findViewById(R.id.imgview);
        btnimg1 = rootview.findViewById(R.id.btnimg1);
        btnimg2 = rootview.findViewById(R.id.btnimg2);

        btnimg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgview.setImageResource(R.drawable.wolverine);
            }
        });

        btnimg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgview.setImageResource(R.drawable.charles);
            }
        });

        return  rootview;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        contexto = context;
    }
}
