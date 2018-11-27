package es.alejandrogr.ejemplo09_navdrawerfragments.FRAGMENTS;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import es.alejandrogr.ejemplo09_navdrawerfragments.MainActivity;
import es.alejandrogr.ejemplo09_navdrawerfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class loginfrag extends Fragment {

    private Context contexto;

    private EditText edtxtusuario, edtxtpass;
    private Button btnlogin;

    public loginfrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootview = inflater.inflate(R.layout.fragment_loginfrag, container, false);

        edtxtusuario = rootview.findViewById(R.id.edtxtusuario);
        edtxtpass = rootview.findViewById(R.id.edtxtpass);
        btnlogin = rootview.findViewById(R.id.btnlogin);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edtxtusuario.getText().toString().equals("progresa@progresa.com")){
                    if (edtxtpass.getText().toString().equals("progresa")){

                    } else {
                        Toast.makeText(contexto, "Compruebe si sus credenciales son Correctos", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(contexto, "Compruebe si sus credenciales son Correctos", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return rootview;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        contexto = context;
    }
}
