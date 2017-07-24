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
public class Modulo7Fragment1 extends Fragment {
    //Variables de informante cabezera
    private LinearLayout lytFragment;
    private CheckBox ckMismoInformante1;
    private EditText edtNombYApellidos1;
    private EditText edtEspecifiqueCargo1;
    private LinearLayout lytFondoSpinner1;
    private Spinner spCargo1;

    //VARIABLES PREGUNTA 1
    private RadioGroup mod7_p1_rgb;
    private RadioGroup mod7_p2_rgb;
    private EditText   mod7_p3_edt;


    public Modulo7Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_modulo7_fragment1, container, false);
        //AMARRE DE VARIABLES DE cabezera_informante.xml

        lytFragment = (LinearLayout) rootView.findViewById(R.id.mod1_layoutFragment1);
        ckMismoInformante1 = (CheckBox) rootView.findViewById(R.id.cab_ckMismoInformante);
        edtNombYApellidos1 = (EditText)rootView.findViewById(R.id.cab_edtApeYNom);
        spCargo1 = (Spinner) rootView.findViewById(R.id.cab_spCargo);
        edtEspecifiqueCargo1 = (EditText) rootView.findViewById(R.id.cab_edtEspecifiqueCargo);
        lytFondoSpinner1 = (LinearLayout) rootView.findViewById(R.id.cab_lytFondoSpinner);

        mod7_p1_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p1_rgb);
        mod7_p2_rgb = (RadioGroup) rootView.findViewById(R.id.mod7_p2_rgb);
        mod7_p3_edt = (EditText)rootView.findViewById(R.id.mod7_p3_edt);;
        
        return  rootView;


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
                    mod7_p1_rgb.requestFocus();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        //PREGUNTA 1-
        RadioGroup[] radioGroups = {
                mod7_p1_rgb,mod7_p2_rgb
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
        mod7_p1_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod7_p1_rb_1:
                        break;
                    case R.id.mod7_p1_rb_2:
                        break;
                    case R.id.mod7_p1_rb_3:
                        break;


                }
                mod7_p2_rgb.requestFocus();
            }
        });
        mod7_p2_rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod7_p2_rb_1:
                        break;
                    case R.id.mod7_p2_rb_2:
                        break;


                }
                mod7_p3_edt.requestFocus();
                mod7_p3_edt.setBackgroundResource(R.drawable.caja_texto_enabled);
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
