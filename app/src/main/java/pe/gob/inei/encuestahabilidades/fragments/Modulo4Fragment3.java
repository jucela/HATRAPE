package pe.gob.inei.encuestahabilidades.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;

import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo4Fragment3 extends Fragment {

    private LinearLayout lytPregunta8;
    private LinearLayout lytPregunta9;
    private LinearLayout lytPregunta10;

    private CheckBox ckObstaculo1;
    private CheckBox ckObstaculo2;
    private CheckBox ckObstaculo3;
    private CheckBox ckObstaculo4;
    private CheckBox ckObstaculo5;
    private CheckBox ckObstaculo6;
    private CheckBox ckObstaculo7;
    private CheckBox ckObstaculo8;
    private CheckBox ckObstaculo9;
    private CheckBox ckObstaculo10;
    private CheckBox ckObstaculo11;
    private CheckBox ckObstaculo12;
    private CheckBox ckObstaculo13;
    private CheckBox ckObstaculo14;
    private CheckBox ckObstaculo15;
    private CheckBox ckObstaculo16;
    private CheckBox ckObstaculo17;
    private CheckBox ckObstaculo18;

    private CheckBox ckInnovacion1;
    private CheckBox ckInnovacion2;
    private CheckBox ckInnovacion3;


    private Spinner spImportancia1;
    private Spinner spImportancia2;
    private Spinner spImportancia3;
    private Spinner spImportancia4;
    private Spinner spImportancia5;
    private Spinner spImportancia6;
    private Spinner spImportancia7;
    private Spinner spImportancia8;
    private Spinner spImportancia9;
    private Spinner spImportancia10;
    private Spinner spImportancia11;
    private Spinner spImportancia12;
    private Spinner spImportancia13;
    private Spinner spImportancia14;
    private Spinner spImportancia15;
    private Spinner spImportancia16;
    private Spinner spImportancia17;
    private Spinner spImportancia18;

    private LinearLayout lyImportancia1;
    private LinearLayout lyImportancia2;
    private LinearLayout lyImportancia3;
    private LinearLayout lyImportancia4;
    private LinearLayout lyImportancia5;
    private LinearLayout lyImportancia6;
    private LinearLayout lyImportancia7;
    private LinearLayout lyImportancia8;
    private LinearLayout lyImportancia9;
    private LinearLayout lyImportancia10;
    private LinearLayout lyImportancia11;
    private LinearLayout lyImportancia12;
    private LinearLayout lyImportancia13;
    private LinearLayout lyImportancia14;
    private LinearLayout lyImportancia15;
    private LinearLayout lyImportancia16;
    private LinearLayout lyImportancia17;

    private EditText edtEspecificar17;

    private RadioGroup rgp10;

    public Modulo4Fragment3() {
        // RequickObstaculo1red empt;y public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo4_fragment3, container, false);
        lytPregunta8 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_lytPregunta8);

        ckObstaculo1 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ckObstaculo1);
        ckObstaculo2 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ckObstaculo2);
        ckObstaculo3 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ckObstaculo3);
        ckObstaculo4 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ckObstaculo4);
        ckObstaculo5 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ckObstaculo5);
        ckObstaculo6 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ckObstaculo6);
        ckObstaculo7 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ckObstaculo7);
        ckObstaculo8 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ckObstaculo8);
        ckObstaculo9 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ckObstaculo9);
        ckObstaculo10 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ckObstaculo10);
        ckObstaculo11 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ckObstaculo11);
        ckObstaculo12 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ckObstaculo12);
        ckObstaculo13 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ckObstaculo13);
        ckObstaculo14 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ckObstaculo14);
        ckObstaculo15 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ckObstaculo15);
        ckObstaculo16 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ckObstaculo16);
        ckObstaculo17 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ckObstaculo17);
        ckObstaculo18 = (CheckBox) rootView.findViewById(R.id.mod4_p8_ckObstaculo18);

        spImportancia1 = (Spinner) rootView.findViewById(R.id.mod4_p8_spImportancia1);
        spImportancia2 = (Spinner) rootView.findViewById(R.id.mod4_p8_spImportancia2);
        spImportancia3 = (Spinner) rootView.findViewById(R.id.mod4_p8_spImportancia3);
        spImportancia4 = (Spinner) rootView.findViewById(R.id.mod4_p8_spImportancia4);
        spImportancia5 = (Spinner) rootView.findViewById(R.id.mod4_p8_spImportancia5);
        spImportancia6 = (Spinner) rootView.findViewById(R.id.mod4_p8_spImportancia6);
        spImportancia7 = (Spinner) rootView.findViewById(R.id.mod4_p8_spImportancia7);
        spImportancia8 = (Spinner) rootView.findViewById(R.id.mod4_p8_spImportancia8);
        spImportancia9 = (Spinner) rootView.findViewById(R.id.mod4_p8_spImportancia9);
        spImportancia10 = (Spinner) rootView.findViewById(R.id.mod4_p8_spImportancia10);
        spImportancia11 = (Spinner) rootView.findViewById(R.id.mod4_p8_spImportancia11);
        spImportancia12 = (Spinner) rootView.findViewById(R.id.mod4_p8_spImportancia12);
        spImportancia13 = (Spinner) rootView.findViewById(R.id.mod4_p8_spImportancia13);
        spImportancia14 = (Spinner) rootView.findViewById(R.id.mod4_p8_spImportancia14);
        spImportancia15 = (Spinner) rootView.findViewById(R.id.mod4_p8_spImportancia15);
        spImportancia16 = (Spinner) rootView.findViewById(R.id.mod4_p8_spImportancia16);
        spImportancia17 = (Spinner) rootView.findViewById(R.id.mod4_p8_spImportancia17);
        edtEspecificar17 = (EditText) rootView.findViewById(R.id.mod4_p8_edtEspecificar17);

        //spImportancia18 = (Spinner) rootView.findViewById(R.id.mod4_p8_spImportancia18);

     lyImportancia1 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_lyImportancia1);
     lyImportancia2 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_lyImportancia2);
     lyImportancia3 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_lyImportancia3);
     lyImportancia4 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_lyImportancia4);
     lyImportancia5 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_lyImportancia5);
     lyImportancia6 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_lyImportancia6);
     lyImportancia7 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_lyImportancia7);
     lyImportancia8 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_lyImportancia8);
     lyImportancia9 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_lyImportancia9);
     lyImportancia10 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_lyImportancia10);
     lyImportancia11 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_lyImportancia11);
     lyImportancia12 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_lyImportancia12);
     lyImportancia13 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_lyImportancia13);
     lyImportancia14 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_lyImportancia14);
     lyImportancia15 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_lyImportancia15);
     lyImportancia16 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_lyImportancia16);
     lyImportancia17 = (LinearLayout) rootView.findViewById(R.id.mod4_p8_lyImportancia17);


        edtEspecificar17 = (EditText) rootView.findViewById(R.id.mod4_p8_edtEspecificar17);

        lytPregunta9 = (LinearLayout) rootView.findViewById(R.id.mod4_p9_lytPregunta9);

        ckInnovacion1 = (CheckBox) rootView.findViewById(R.id.mod4_p9_ckInnovacion1);
        ckInnovacion2 = (CheckBox) rootView.findViewById(R.id.mod4_p9_ckInnovacion2);
        ckInnovacion3 = (CheckBox) rootView.findViewById(R.id.mod4_p9_ckInnovacion3);

        lytPregunta10 = (LinearLayout) rootView.findViewById(R.id.mod4_p10_lytPregunta10);

        rgp10 = (RadioGroup) rootView.findViewById(R.id.mod4_p10_rgp10);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        lytPregunta8.requestFocus();

        lyImportancia1.setBackgroundResource(R.drawable.spinner_disabled);
        lyImportancia1.setEnabled(false);
        ckObstaculo1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    lyImportancia1.setEnabled(true);
                    spImportancia1.setSelection(0);
                    lyImportancia1.setBackgroundResource(R.drawable.spinner_enabled);

                }else{
                    lyImportancia1.setBackgroundResource(R.drawable.spinner_disabled);
                    lyImportancia1.setEnabled(false);
                    spImportancia1.setSelection(0);

                }
            }
        });

        lyImportancia2.setBackgroundResource(R.drawable.spinner_disabled);
        lyImportancia2.setEnabled(false);
        ckObstaculo2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    lyImportancia2.setEnabled(true);
                    spImportancia2.setSelection(0);
                    lyImportancia2.setBackgroundResource(R.drawable.spinner_enabled);

                }else{

                    lyImportancia2.setBackgroundResource(R.drawable.spinner_disabled);
                    lyImportancia2.setEnabled(false);
                    spImportancia2.setSelection(0);

                }
            }
        });

        lyImportancia3.setBackgroundResource(R.drawable.spinner_disabled);
        lyImportancia3.setEnabled(false);
        ckObstaculo3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    lyImportancia3.setEnabled(true);
                    spImportancia3.setSelection(0);
                    lyImportancia3.setBackgroundResource(R.drawable.spinner_enabled);
                }else{

                    lyImportancia3.setBackgroundResource(R.drawable.spinner_disabled);
                    lyImportancia3.setEnabled(false);
                    spImportancia3.setSelection(0);
                }
            }
        });

        lyImportancia4.setBackgroundResource(R.drawable.spinner_disabled);
        lyImportancia4.setEnabled(false);
        ckObstaculo4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    lyImportancia4.setEnabled(true);
                    spImportancia4.setSelection(0);
                    lyImportancia4.setBackgroundResource(R.drawable.spinner_enabled);

                }else{
                    lyImportancia4.setBackgroundResource(R.drawable.spinner_disabled);
                    lyImportancia4.setEnabled(false);
                    spImportancia4.setSelection(0);

                }
            }
        });

        lyImportancia5.setBackgroundResource(R.drawable.spinner_disabled);
        lyImportancia5.setEnabled(false);
        ckObstaculo5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    lyImportancia5.setEnabled(true);
                    spImportancia5.setSelection(0);
                    lyImportancia5.setBackgroundResource(R.drawable.spinner_enabled);

                }else{

                    lyImportancia5.setBackgroundResource(R.drawable.spinner_disabled);
                    spImportancia5.setSelection(0);
                    lyImportancia5.setEnabled(false);


                }
            }
        });

        lyImportancia6.setBackgroundResource(R.drawable.spinner_disabled);
        lyImportancia6.setEnabled(false);
        ckObstaculo6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    lyImportancia6.setEnabled(true);
                    spImportancia6.setSelection(0);
                    lyImportancia6.setBackgroundResource(R.drawable.spinner_enabled);
                }else{

                    lyImportancia6.setBackgroundResource(R.drawable.spinner_disabled);
                    lyImportancia6.setEnabled(false);
                    spImportancia6.setSelection(0);
                }
            }
        });

        lyImportancia7.setBackgroundResource(R.drawable.spinner_disabled);
        lyImportancia7.setEnabled(false);
        ckObstaculo7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    lyImportancia7.setEnabled(true);
                    spImportancia7.setSelection(0);
                    lyImportancia7.setBackgroundResource(R.drawable.spinner_enabled);

                }else{
                    lyImportancia7.setBackgroundResource(R.drawable.spinner_disabled);
                    lyImportancia7.setEnabled(false);
                    spImportancia7.setSelection(0);

                }
            }
        });

        lyImportancia8.setBackgroundResource(R.drawable.spinner_disabled);
        lyImportancia8.setEnabled(false);
        ckObstaculo8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    lyImportancia8.setEnabled(true);
                    spImportancia8.setSelection(0);
                    lyImportancia8.setBackgroundResource(R.drawable.spinner_enabled);

                }else{

                    lyImportancia8.setBackgroundResource(R.drawable.spinner_disabled);
                    lyImportancia8.setEnabled(false);
                    spImportancia8.setSelection(0);

                }
            }
        });

        lyImportancia9.setBackgroundResource(R.drawable.spinner_disabled);
        lyImportancia9.setEnabled(false);
        ckObstaculo9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    lyImportancia9.setEnabled(true);
                    spImportancia9.setSelection(0);
                    lyImportancia9.setBackgroundResource(R.drawable.spinner_enabled);
                }else{

                    lyImportancia9.setBackgroundResource(R.drawable.spinner_disabled);
                    lyImportancia9.setEnabled(false);
                    spImportancia9.setSelection(0);
                }
            }
        });

        lyImportancia10.setBackgroundResource(R.drawable.spinner_disabled);
        lyImportancia10.setEnabled(false);
        ckObstaculo10.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    lyImportancia10.setEnabled(true);
                    spImportancia10.setSelection(0);
                    lyImportancia10.setBackgroundResource(R.drawable.spinner_enabled);

                }else{
                    lyImportancia10.setBackgroundResource(R.drawable.spinner_disabled);
                    lyImportancia10.setEnabled(false);
                    spImportancia10.setSelection(0);

                }
            }
        });

        lyImportancia11.setBackgroundResource(R.drawable.spinner_disabled);
        lyImportancia11.setEnabled(false);
        ckObstaculo11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    lyImportancia11.setEnabled(true);
                    spImportancia11.setSelection(0);
                    lyImportancia11.setBackgroundResource(R.drawable.spinner_enabled);

                }else{

                    lyImportancia11.setBackgroundResource(R.drawable.spinner_disabled);
                    lyImportancia11.setEnabled(false);
                    spImportancia11.setSelection(0);

                }
            }
        });

        lyImportancia12.setBackgroundResource(R.drawable.spinner_disabled);
        lyImportancia12.setEnabled(false);
        ckObstaculo12.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    lyImportancia12.setEnabled(true);
                    spImportancia12.setSelection(0);
                    lyImportancia12.setBackgroundResource(R.drawable.spinner_enabled);
                }else{

                    lyImportancia12.setBackgroundResource(R.drawable.spinner_disabled);
                    lyImportancia12.setEnabled(false);
                    spImportancia12.setSelection(0);
                }
            }
        });

        lyImportancia13.setBackgroundResource(R.drawable.spinner_disabled);
        lyImportancia13.setEnabled(false);
        ckObstaculo13.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    lyImportancia13.setEnabled(true);
                    spImportancia13.setSelection(0);
                    lyImportancia13.setBackgroundResource(R.drawable.spinner_enabled);

                }else{
                    lyImportancia13.setBackgroundResource(R.drawable.spinner_disabled);
                    lyImportancia13.setEnabled(false);
                    spImportancia13.setSelection(0);

                }
            }
        });

        lyImportancia14.setBackgroundResource(R.drawable.spinner_disabled);
        lyImportancia14.setEnabled(false);
        ckObstaculo14.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    lyImportancia14.setEnabled(true);
                    spImportancia14.setSelection(0);
                    lyImportancia14.setBackgroundResource(R.drawable.spinner_enabled);

                }else{

                    lyImportancia14.setBackgroundResource(R.drawable.spinner_disabled);
                    lyImportancia14.setEnabled(false);
                    spImportancia14.setSelection(0);

                }
            }
        });
        lyImportancia15.setBackgroundResource(R.drawable.spinner_disabled);
        lyImportancia15.setEnabled(false);
        ckObstaculo15.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    lyImportancia15.setEnabled(true);
                    spImportancia15.setSelection(0);
                    lyImportancia15.setBackgroundResource(R.drawable.spinner_enabled);
                }else{

                    lyImportancia15.setBackgroundResource(R.drawable.spinner_disabled);
                    lyImportancia15.setEnabled(false);
                    spImportancia15.setSelection(0);
                }
            }
        });
        lyImportancia16.setBackgroundResource(R.drawable.spinner_disabled);
        lyImportancia16.setEnabled(false);
        ckObstaculo16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    lyImportancia16.setBackgroundResource(R.drawable.spinner_enabled);
                    lyImportancia16.setEnabled(true);
                    spImportancia16.setSelection(0);

                }else{

                    lyImportancia16.setEnabled(false);
                    spImportancia16.setSelection(0);
                    lyImportancia16.setBackgroundResource(R.drawable.spinner_disabled);
                }
            }
        });

        edtEspecificar17.setVisibility(View.GONE);
        edtEspecificar17.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecificar17.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtEspecificar17);
                    lyImportancia17.setEnabled(true);
                    lyImportancia17.setBackgroundResource(R.drawable.spinner_enabled);
                    lyImportancia17.requestFocus();
                    return true;
                }
                return false;
            }
        });
        lyImportancia17.setBackgroundResource(R.drawable.spinner_disabled);
        lyImportancia17.setEnabled(false);
        ckObstaculo17.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {

                    edtEspecificar17.setVisibility(View.VISIBLE);
                    edtEspecificar17.setBackgroundResource(R.drawable.spinner_enabled);
                    lyImportancia17.setEnabled(false);
                    if (edtEspecificar17.equals("")){
                        lyImportancia17.setEnabled(false);
                        lyImportancia17.setBackgroundResource(R.drawable.spinner_disabled);

                    }
                    else{
                       // spImportancia17.setBackgroundResource(R.drawable.spinner);
                        spImportancia17.setSelection(0);
                        lyImportancia17.setEnabled(true);

                    }


                }else{

                    edtEspecificar17.setVisibility(View.GONE);
                    edtEspecificar17.setBackgroundResource(R.drawable.spinner_disabled);
                    lyImportancia17.setBackgroundResource(R.drawable.spinner_disabled);
                    lyImportancia17.setEnabled(false);
                    spImportancia17.setSelection(0);

                }
            }
        });

        //spImportancia18.setBackgroundResource(R.drawable.spinner_disabled);
        //spImportancia18.setEnabled(false);

        final CheckBox[] listacheck ={ckObstaculo1,ckObstaculo2,ckObstaculo3,ckObstaculo4,
                ckObstaculo5,ckObstaculo6,ckObstaculo7,ckObstaculo8,ckObstaculo9,
                ckObstaculo10,ckObstaculo11,ckObstaculo12,ckObstaculo13,ckObstaculo14
                ,ckObstaculo15,ckObstaculo16,ckObstaculo17};

        ckObstaculo18.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override

            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                for (int i = 0; i < listacheck.length; i++) {
                    final CheckBox checkBox = listacheck[i];
                    checkBox.setEnabled(false);
                    checkBox.setChecked(false);

                }

                }
                else {
                    for (int i = 0; i < listacheck.length; i++) {
                        final CheckBox checkBox = listacheck[i];
                        checkBox.setEnabled(true);


                    }
                }
            }
        });



        rgp10. setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                lytPregunta10.setVisibility(View.VISIBLE);
                switch (i){
                    case R.id.mod4_p10_rb1: break;
                    case R.id.mod4_p10_rb2: break;
                    case R.id.mod4_p10_rb3:
                        lytPregunta10.setVisibility(View.VISIBLE);
                        // edtEspecifiqueOrg.requestFocus();a
                        break;
                }
            }
        });

    }
    public void ocultarTeclado(View view){
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
    public void mostrarTeclado(){
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(getActivity().INPUT_METHOD_SERVICE);
        if (!imm.isAcceptingText()) {
            imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
        }
    }

}
