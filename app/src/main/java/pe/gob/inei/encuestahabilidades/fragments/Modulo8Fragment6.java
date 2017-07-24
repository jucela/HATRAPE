package pe.gob.inei.encuestahabilidades.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo8Fragment6 extends Fragment {
    //VARIABLES PREGUNTA 6
    private CheckBox mod8_p6_ckb1_a;
    private CheckBox mod8_p6_ckb1_b;
    private CheckBox mod8_p6_ckb1_c;
    private CheckBox mod8_p6_ckb1_d;
    private CheckBox mod8_p6_ckb1_e;
    private CheckBox mod8_p6_ckb1_f;
    private CheckBox mod8_p6_ckb2_a;
    private CheckBox mod8_p6_ckb2_b;
    private CheckBox mod8_p6_ckb2_c;
    private CheckBox mod8_p6_ckb2_d;
    private CheckBox mod8_p6_ckb2_e;
    private CheckBox mod8_p6_ckb2_f;
    private CheckBox mod8_p6_ckb3_a;
    private CheckBox mod8_p6_ckb3_b;
    private CheckBox mod8_p6_ckb3_c;
    private CheckBox mod8_p6_ckb3_d;
    private CheckBox mod8_p6_ckb3_e;
    private CheckBox mod8_p6_ckb3_f;
    private CheckBox mod8_p6_ckb4_a;
    private CheckBox mod8_p6_ckb4_b;
    private CheckBox mod8_p6_ckb4_c;
    private CheckBox mod8_p6_ckb4_d;
    private CheckBox mod8_p6_ckb4_e;
    private CheckBox mod8_p6_ckb4_f;
    private CheckBox mod8_p6_ckb5_a;
    private CheckBox mod8_p6_ckb5_b;
    private CheckBox mod8_p6_ckb5_c;
    private CheckBox mod8_p6_ckb5_d;
    private CheckBox mod8_p6_ckb5_e;
    private CheckBox mod8_p6_ckb5_f;
    private CheckBox mod8_p6_ckb6_a;
    private CheckBox mod8_p6_ckb6_b;
    private CheckBox mod8_p6_ckb6_c;
    private CheckBox mod8_p6_ckb6_d;
    private CheckBox mod8_p6_ckb6_e;
    private CheckBox mod8_p6_ckb6_f;



    public Modulo8Fragment6() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView =inflater.inflate(R.layout.fragment_modulo8_fragment6, container, false);
        //AMARRE DE VARIABLES DE modulo8_pregunta6.xml
        mod8_p6_ckb1_a = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb1_a);
        mod8_p6_ckb1_b = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb1_b);
        mod8_p6_ckb1_c = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb1_c);
        mod8_p6_ckb1_d = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb1_d);
        mod8_p6_ckb1_e= (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb1_e);
        mod8_p6_ckb1_f = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb1_f);

        mod8_p6_ckb2_a = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb2_a);
        mod8_p6_ckb2_b = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb2_b);
        mod8_p6_ckb2_c= (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb2_c);
        mod8_p6_ckb2_d = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb2_d);
        mod8_p6_ckb2_e = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb2_e);
        mod8_p6_ckb2_f = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb2_f);

        mod8_p6_ckb3_a = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb3_a);
        mod8_p6_ckb3_b = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb3_b);
        mod8_p6_ckb3_c= (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb3_c);
        mod8_p6_ckb3_d = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb3_d);
        mod8_p6_ckb3_e = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb3_e);
        mod8_p6_ckb3_f = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb3_f);

        mod8_p6_ckb4_a = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb4_a);
        mod8_p6_ckb4_b = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb4_b);
        mod8_p6_ckb4_c = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb4_c);
        mod8_p6_ckb4_d = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb4_d);
        mod8_p6_ckb4_e = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb4_e);
        mod8_p6_ckb4_f = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb4_f);

        mod8_p6_ckb5_a = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb5_a);
        mod8_p6_ckb5_b = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb5_b);
        mod8_p6_ckb5_c = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb5_c);
        mod8_p6_ckb5_d = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb5_d);
        mod8_p6_ckb5_e = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb5_e);
        mod8_p6_ckb5_f = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb5_f);

        mod8_p6_ckb6_a = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb6_a);
        mod8_p6_ckb6_b = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb6_b);
        mod8_p6_ckb6_c = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb6_c);
        mod8_p6_ckb6_d = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb6_d);
        mod8_p6_ckb6_e = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb6_e);
        mod8_p6_ckb6_f = (CheckBox) rootView.findViewById(R.id.mod8_p6_ckb6_f);


        return  rootView;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final CheckBox[] listacheck1 ={
                mod8_p6_ckb1_a,mod8_p6_ckb1_b,mod8_p6_ckb1_c,mod8_p6_ckb1_d,mod8_p6_ckb1_e
        };
        final CheckBox[] listacheck2 ={
                 mod8_p6_ckb2_a,mod8_p6_ckb2_b,mod8_p6_ckb2_c,mod8_p6_ckb2_d,mod8_p6_ckb2_e
        };
        final CheckBox[] listacheck3 ={
                 mod8_p6_ckb3_a,mod8_p6_ckb3_b,mod8_p6_ckb3_c,mod8_p6_ckb3_d,mod8_p6_ckb3_e
        };
        final CheckBox[] listacheck4 ={
                 mod8_p6_ckb4_a,mod8_p6_ckb4_b,mod8_p6_ckb4_c,mod8_p6_ckb4_d,mod8_p6_ckb4_e
        };
        final CheckBox[] listacheck5 ={
                 mod8_p6_ckb5_a,mod8_p6_ckb5_b,mod8_p6_ckb5_c,mod8_p6_ckb5_d,mod8_p6_ckb5_e
        };
        final CheckBox[] listacheck6 ={
                 mod8_p6_ckb6_a,mod8_p6_ckb6_b,mod8_p6_ckb6_c,mod8_p6_ckb6_d,mod8_p6_ckb6_e
        };
        //PREGUNTA 6.
        mod8_p6_ckb1_f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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
        //PREGUNTA 6.2
        mod8_p6_ckb2_f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    for (int i = 0; i < listacheck2.length; i++) {
                        final CheckBox checkBox = listacheck2[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);

                    }

                }
                else {
                    for (int i = 0; i < listacheck2.length; i++) {
                        final CheckBox checkBox = listacheck2[i];
                        checkBox.setEnabled(true);


                    }
                }
            }
        });
        //PREGUNTA 6.3
        mod8_p6_ckb3_f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    for (int i = 0; i < listacheck3.length; i++) {
                        final CheckBox checkBox = listacheck3[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);

                    }

                }
                else {
                    for (int i = 0; i < listacheck3.length; i++) {
                        final CheckBox checkBox = listacheck3[i];
                        checkBox.setEnabled(true);


                    }
                }
            }
        });
        //PREGUNTA 6.4
        mod8_p6_ckb4_f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    for (int i = 0; i < listacheck4.length; i++) {
                        final CheckBox checkBox = listacheck4[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);

                    }

                }
                else {
                    for (int i = 0; i < listacheck4.length; i++) {
                        final CheckBox checkBox = listacheck4[i];
                        checkBox.setEnabled(true);


                    }
                }
            }
        });
        //PREGUNTA 6.5
        mod8_p6_ckb5_f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    for (int i = 0; i < listacheck5.length; i++) {
                        final CheckBox checkBox = listacheck5[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);

                    }

                }
                else {
                    for (int i = 0; i < listacheck5.length; i++) {
                        final CheckBox checkBox = listacheck5[i];
                        checkBox.setEnabled(true);


                    }
                }
            }
        });
        //PREGUNTA 6.6
        mod8_p6_ckb6_f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    for (int i = 0; i < listacheck6.length; i++) {
                        final CheckBox checkBox = listacheck6[i];
                        checkBox.setEnabled(false);
                        checkBox.setChecked(false);

                    }

                }
                else {
                    for (int i = 0; i < listacheck6.length; i++) {
                        final CheckBox checkBox = listacheck6[i];
                        checkBox.setEnabled(true);


                    }
                }
            }
        });



    }

}
