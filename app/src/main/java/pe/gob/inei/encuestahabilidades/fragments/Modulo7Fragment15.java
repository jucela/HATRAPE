package pe.gob.inei.encuestahabilidades.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo7Fragment15 extends Fragment {

    private EditText edtEspecifique;

    public Modulo7Fragment15() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo7_fragment15, container, false);
        edtEspecifique = (EditText) rootView.findViewById(R.id.p39_edtEspecifique);
        edtEspecifique.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        return rootView;
    }



}
