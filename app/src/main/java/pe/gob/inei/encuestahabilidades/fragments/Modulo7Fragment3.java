package pe.gob.inei.encuestahabilidades.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;

import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo7Fragment3 extends Fragment {
    //Variables
    private CheckBox mod7_p8_ck1;
    private CheckBox mod7_p8_ck2;
    private CheckBox mod7_p8_ck3;
    private CheckBox mod7_p8_ck4;
    private CheckBox mod7_p8_ck5;
    private CheckBox mod7_p8_ck6;
    private CheckBox mod7_p8_ck7;
    private CheckBox mod7_p8_ck8;
    private CheckBox mod7_p8_ck9;
    private CheckBox mod7_p8_ck10;
    private CheckBox mod7_p8_ck11;
    private CheckBox mod7_p8_ck12;
    private CheckBox mod7_p8_ck13;
    private CheckBox mod7_p8_ck14;
    private CheckBox mod7_p8_ck15;
    private CheckBox mod7_p8_ck16;
    private CheckBox mod7_p8_ck17;
    private CheckBox mod7_p8_ck18;
    private CheckBox mod7_p8_ck19;
    private CheckBox mod7_p8_ck20;
    private EditText mod7_p8_edt19;


    public Modulo7Fragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo7_fragment3, container, false);
        mod7_p8_ck1 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck1);
        mod7_p8_ck2 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck2);
        mod7_p8_ck3 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck3);
        mod7_p8_ck4 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck4);
        mod7_p8_ck5 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck5);
        mod7_p8_ck6 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck6);
        mod7_p8_ck7 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck7);
        mod7_p8_ck8 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck8);
        mod7_p8_ck9 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck9);
        mod7_p8_ck10 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck10);
        mod7_p8_ck11 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck11);
        mod7_p8_ck12 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck12);
        mod7_p8_ck13 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck13);
        mod7_p8_ck14 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck14);
        mod7_p8_ck15 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck15);
        mod7_p8_ck16 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck16);
        mod7_p8_ck17 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck17);
        mod7_p8_ck18 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck18);
        mod7_p8_ck19 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck19);
        mod7_p8_ck20 = (CheckBox) rootView.findViewById(R.id.mod7_p8_ck20);
        mod7_p8_edt19 = (EditText)rootView.findViewById(R.id.mod7_p8_edt19);

        return rootView;

    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final CheckBox[] listacheck1 ={
                mod7_p8_ck1,mod7_p8_ck2,mod7_p8_ck3,mod7_p8_ck4,
                mod7_p8_ck5,mod7_p8_ck6,mod7_p8_ck7,mod7_p8_ck8,
                mod7_p8_ck9,mod7_p8_ck10,mod7_p8_ck11,mod7_p8_ck12,
                mod7_p8_ck13,mod7_p8_ck14,mod7_p8_ck15,mod7_p8_ck16,
                mod7_p8_ck17,mod7_p8_ck18,mod7_p8_ck19

        };
         //PREGUNTA 19
        mod7_p8_ck19.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mod7_p8_edt19.setVisibility(View.VISIBLE);
                    mod7_p8_edt19.requestFocus();
                    mod7_p8_edt19.setBackgroundResource(R.drawable.caja_texto_enabled);

                } else {
                    mod7_p8_edt19.setVisibility(View.GONE);

                }
            }
        });

        //PREGUNTA 20
        mod7_p8_ck20.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    for (int i = 0; i < listacheck1.length; i++) {
                        final CheckBox checkBox = listacheck1[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);

                    }

                }
                else {
                    for (int i = 0; i < listacheck1.length; i++) {
                        final CheckBox checkBox = listacheck1[i];
                        checkBox.setEnabled(true);


                    }
                }
            }
        });


    }

}
