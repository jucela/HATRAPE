package pe.gob.inei.encuestahabilidades.fragments;


import android.content.Context;
import android.graphics.Color;
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
import android.widget.AdapterView;
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
public class Modulo8Fragment1 extends Fragment {
    //Variables de informante cabezera
    private LinearLayout lytFragment;
    private CheckBox ckMismoInformante1;
    private EditText edtNombYApellidos1;
    private EditText edtEspecifiqueCargo1;
    private LinearLayout lytFondoSpinner1;
    private Spinner spCargo1;
    //VARIABLES PREGUNTA 1
    private RadioGroup mod8_p1_rgb1;
    private RadioGroup mod8_p1_rgb2;
    private RadioGroup mod8_p1_rgb3;
    private RadioGroup mod8_p1_rgb4;
    private RadioGroup mod8_p1_rgb5;
    private RadioGroup mod8_p1_rgb6;
    private RadioGroup mod8_p1_rgb1a;
    private RadioGroup mod8_p1_rgb2a;
    private RadioGroup mod8_p1_rgb3a;
    private RadioGroup mod8_p1_rgb4a;
    private RadioGroup mod8_p1_rgb5a;
    private RadioGroup mod8_p1_rgb6a;
    private LinearLayout mod8_p1_rgb1a_ly;
    private LinearLayout mod8_p1_rgb2a_ly;
    private LinearLayout mod8_p1_rgb3a_ly;
    private LinearLayout mod8_p1_rgb4a_ly;
    private LinearLayout mod8_p1_rgb5a_ly;
    private LinearLayout mod8_p1_rgb6a_ly;



    public Modulo8Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo8_fragment1, container, false);
        //AMARRE DE VARIABLES DE cabezera_informante.xml

        lytFragment = (LinearLayout) rootView.findViewById(R.id.mod1_layoutFragment1);
        ckMismoInformante1 = (CheckBox) rootView.findViewById(R.id.cab_ckMismoInformante);
        edtNombYApellidos1 = (EditText)rootView.findViewById(R.id.cab_edtApeYNom);
        spCargo1 = (Spinner) rootView.findViewById(R.id.cab_spCargo);
        edtEspecifiqueCargo1 = (EditText) rootView.findViewById(R.id.cab_edtEspecifiqueCargo);
        lytFondoSpinner1 = (LinearLayout) rootView.findViewById(R.id.cab_lytFondoSpinner);

        //AMARRE DE VARIABLES DE fragment_modulo8_fragment1.xml

        mod8_p1_rgb1 = (RadioGroup) rootView.findViewById(R.id.mod8_p1_rgb1);
        mod8_p1_rgb2 = (RadioGroup) rootView.findViewById(R.id.mod8_p1_rgb2);
        mod8_p1_rgb3 = (RadioGroup) rootView.findViewById(R.id.mod8_p1_rgb3);
        mod8_p1_rgb4 = (RadioGroup) rootView.findViewById(R.id.mod8_p1_rgb4);
        mod8_p1_rgb5 = (RadioGroup) rootView.findViewById(R.id.mod8_p1_rgb5);
        mod8_p1_rgb6 = (RadioGroup) rootView.findViewById(R.id.mod8_p1_rgb6);
        mod8_p1_rgb1a = (RadioGroup) rootView.findViewById(R.id.mod8_p1_rgb1a);
        mod8_p1_rgb2a = (RadioGroup) rootView.findViewById(R.id.mod8_p1_rgb2a);
        mod8_p1_rgb3a = (RadioGroup) rootView.findViewById(R.id.mod8_p1_rgb3a);
        mod8_p1_rgb4a = (RadioGroup) rootView.findViewById(R.id.mod8_p1_rgb4a);
        mod8_p1_rgb5a = (RadioGroup) rootView.findViewById(R.id.mod8_p1_rgb5a);
        mod8_p1_rgb6a = (RadioGroup) rootView.findViewById(R.id.mod8_p1_rgb6a);
        mod8_p1_rgb1a_ly = (LinearLayout) rootView.findViewById(R.id.mod8_p1_rgb1a_ly);
        mod8_p1_rgb2a_ly = (LinearLayout) rootView.findViewById(R.id.mod8_p1_rgb2a_ly);
        mod8_p1_rgb3a_ly = (LinearLayout) rootView.findViewById(R.id.mod8_p1_rgb3a_ly);
        mod8_p1_rgb4a_ly = (LinearLayout) rootView.findViewById(R.id.mod8_p1_rgb4a_ly);
        mod8_p1_rgb5a_ly = (LinearLayout) rootView.findViewById(R.id.mod8_p1_rgb5a_ly);
        mod8_p1_rgb6a_ly = (LinearLayout) rootView.findViewById(R.id.mod8_p1_rgb6a_ly);


        return rootView;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ckMismoInformante1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtNombYApellidos1.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    lytFondoSpinner1.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    spCargo1.setEnabled(false);
                    edtNombYApellidos1.setText("JULIO LAVADO");
                    spCargo1.setSelection(1);
                    edtNombYApellidos1.setEnabled(false);
                    //edtActividadPrimaria.requestFocus();
                }else{
                    edtNombYApellidos1.setText("");
                    spCargo1.setSelection(0);
                    edtNombYApellidos1.setBackgroundResource(R.drawable.cajas_de_texto);
                    edtNombYApellidos1.setEnabled(true);
                    lytFondoSpinner1.setBackgroundResource(R.drawable.cajas_de_texto);
                    spCargo1.setEnabled(true);
                    edtNombYApellidos1.requestFocus();
                }
            }
        });
        edtNombYApellidos1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtNombYApellidos1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    //ocultarTeclado(lytFondoSpinner1);
                    lytFondoSpinner1.requestFocus();
                    return true;
                }
                return false;
            }
        });


        edtNombYApellidos1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    edtNombYApellidos1.setBackgroundResource(R.drawable.caja_texto_enabled);
                    mostrarTeclado();
                }
                else if(view.isEnabled()){
                    edtNombYApellidos1.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });

        lytFondoSpinner1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    lytFondoSpinner1.setBackgroundResource(R.drawable.caja_texto_enabled);
                    ocultarTeclado(lytFondoSpinner1);
                }
                else if(view.isEnabled()){
                    lytFondoSpinner1.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });
        edtEspecifiqueCargo1.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueCargo1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    edtEspecifiqueCargo1.setBackgroundResource(R.drawable.caja_texto_enabled);
                    mostrarTeclado();
                }
                else if(view.isEnabled()){
                    edtEspecifiqueCargo1.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });
        spCargo1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                edtEspecifiqueCargo1.setVisibility(View.GONE);
                switch (pos){
                    case 0:break;
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:
                        edtEspecifiqueCargo1.setVisibility(View.VISIBLE);
                        break;
                }
                if(pos == 4) edtEspecifiqueCargo1.requestFocus();
                else if (pos > 0 && pos <4)
                    mod8_p1_rgb1.requestFocus();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //PREGUNTA 1-
        RadioGroup[] radioGroups = {
                mod8_p1_rgb1,mod8_p1_rgb2,mod8_p1_rgb3,
                mod8_p1_rgb4,mod8_p1_rgb5,mod8_p1_rgb6,
                mod8_p1_rgb1a,mod8_p1_rgb2a,mod8_p1_rgb3a,
                mod8_p1_rgb4a,mod8_p1_rgb5a,mod8_p1_rgb6a,
        };
        for (int i = 0; i < radioGroups.length; i++) {
            final RadioGroup radioGroup = radioGroups[i];
            radioGroup.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean conFocus) {
                    if(conFocus) {
                        ocultarTeclado(radioGroup);
                        radioGroup.setBackgroundColor(Color.CYAN);
                    }
                    else if(view.isEnabled()){
                        radioGroup.setBackgroundColor(Color.TRANSPARENT);
                    }
                }
            });
        }
        //PREGUNTA 1.1
        mod8_p1_rgb1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod8_p1_rb1_SI:
                        mod8_p1_rgb1a_ly.setVisibility(View.VISIBLE);
                        mod8_p1_rgb1a.requestFocus();
                        break;
                    case R.id.mod8_p1_rb1_NO:
                        mod8_p1_rgb1a.clearCheck();
                        mod8_p1_rgb1a_ly.setVisibility(View.GONE);
                        mod8_p1_rgb2.requestFocus();
                        break;
                }
            }
        });
        mod8_p1_rgb1a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod8_p1_rb1a_1:
                        break;
                    case R.id.mod8_p1_rb1a_2:
                        break;
                    case R.id.mod8_p1_rb1a_3:
                        break;
                }
                mod8_p1_rgb2.requestFocus();
            }
        });
        //PREGUNTA 1.2
        mod8_p1_rgb2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod8_p1_rb2_SI:
                        mod8_p1_rgb2a_ly.setVisibility(View.VISIBLE);
                        mod8_p1_rgb2a.requestFocus();
                        break;
                    case R.id.mod8_p1_rb2_NO:
                        mod8_p1_rgb2a.clearCheck();
                        mod8_p1_rgb2a_ly.setVisibility(View.GONE);
                        mod8_p1_rgb3.requestFocus();
                        break;
                }
            }
        });
        mod8_p1_rgb2a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod8_p1_rb2a_1:
                        break;
                    case R.id.mod8_p1_rb2a_2:
                        break;
                    case R.id.mod8_p1_rb2a_3:
                        break;
                }
                mod8_p1_rgb3.requestFocus();
            }
        });
        //PREGUNTA 1.3
        mod8_p1_rgb3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod8_p1_rb3_SI:
                        mod8_p1_rgb3a_ly.setVisibility(View.VISIBLE);
                        mod8_p1_rgb3a.requestFocus();
                        break;
                    case R.id.mod8_p1_rb3_NO:
                        mod8_p1_rgb3a.clearCheck();
                        mod8_p1_rgb3a_ly.setVisibility(View.GONE);
                        mod8_p1_rgb4.requestFocus();
                        break;
                }
            }
        });
        mod8_p1_rgb3a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod8_p1_rb3a_1:
                        break;
                    case R.id.mod8_p1_rb3a_2:
                        break;
                    case R.id.mod8_p1_rb3a_3:
                        break;
                }
                mod8_p1_rgb4.requestFocus();
            }
        });
        //PREGUNTA 1.4
        mod8_p1_rgb4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod8_p1_rb4_SI:
                        mod8_p1_rgb4a_ly.setVisibility(View.VISIBLE);
                        mod8_p1_rgb4a.requestFocus();
                        break;
                    case R.id.mod8_p1_rb4_NO:
                        mod8_p1_rgb4a.clearCheck();
                        mod8_p1_rgb4a_ly.setVisibility(View.GONE);
                        mod8_p1_rgb5.requestFocus();
                        break;
                }
            }
        });
        mod8_p1_rgb4a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod8_p1_rb4a_1:
                        break;
                    case R.id.mod8_p1_rb4a_2:
                        break;
                    case R.id.mod8_p1_rb4a_3:
                        break;
                }
                mod8_p1_rgb5.requestFocus();
            }
        });
        //PREGUNTA 1.
        mod8_p1_rgb5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod8_p1_rb5_SI:
                        mod8_p1_rgb5a_ly.setVisibility(View.VISIBLE);
                        mod8_p1_rgb5a.requestFocus();
                        break;
                    case R.id.mod8_p1_rb5_NO:
                        mod8_p1_rgb5a.clearCheck();
                        mod8_p1_rgb5a_ly.setVisibility(View.GONE);
                        mod8_p1_rgb6.requestFocus();
                        break;
                }
            }
        });
        mod8_p1_rgb5a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod8_p1_rb5a_1:
                        break;
                    case R.id.mod8_p1_rb5a_2:
                        break;
                    case R.id.mod8_p1_rb5a_3:
                        break;
                }
                mod8_p1_rgb6.requestFocus();
            }
        });
        //PREGUNTA 1.6
        mod8_p1_rgb6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod8_p1_rb6_SI:
                        mod8_p1_rgb6a_ly.setVisibility(View.VISIBLE);
                        mod8_p1_rgb6a.requestFocus();
                        break;
                    case R.id.mod8_p1_rb6_NO:
                        mod8_p1_rgb6a.clearCheck();
                        mod8_p1_rgb6a_ly.setVisibility(View.GONE);
                        //mod8_p1_rgb.requestFocus();
                        break;
                }
            }
        });
        mod8_p1_rgb6a.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod8_p1_rb6a_1:
                        break;
                    case R.id.mod8_p1_rb6a_2:
                        break;
                    case R.id.mod8_p1_rb6a_3:
                        break;
                }
                //mod8_p1_rgb.requestFocus();
            }
        });








    }
    //METODOS
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
