package pe.gob.inei.encuestahabilidades.fragments;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
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
import android.widget.Spinner;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo2Fragment1 extends Fragment {

    private CheckBox ckMismoInformante2;
    private EditText edtNombYApellidos2;
    private EditText edtEspecifiqueCargo2;
    private LinearLayout lytFondoSpinner2;
    private Spinner spCargo2;

    private EditText edtNTrabajadores;
    private EditText edtTrabMujeres;
    private EditText edtTiempoParcial;
    private EditText edtContratosTemp;

    private EditText edt1;
    private EditText edt2;
    private EditText edt3;
    private EditText edt4;
    private EditText edt5;

    private LinearLayout lytPregunta5;




    public Modulo2Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo2_fragment1, container, false);

        ckMismoInformante2 = (CheckBox) rootView.findViewById(R.id.cab_ckMismoInformante);
        edtNombYApellidos2 = (EditText)rootView.findViewById(R.id.cab_edtApeYNom);
        spCargo2 = (Spinner) rootView.findViewById(R.id.cab_spCargo);
        edtEspecifiqueCargo2 = (EditText) rootView.findViewById(R.id.cab_edtEspecifiqueCargo);
        lytFondoSpinner2 = (LinearLayout) rootView.findViewById(R.id.cab_lytFondoSpinner);

        edtNTrabajadores = (EditText) rootView.findViewById(R.id.mod2_p1_edtNTrabajadores);
        edtTrabMujeres = (EditText) rootView.findViewById(R.id.mod2_p2_edtTrabMujeres);
        edtTiempoParcial = (EditText) rootView.findViewById(R.id.mod2_p3_edtTrabTiempParcial);
        edtContratosTemp = (EditText) rootView.findViewById(R.id.mod2_p4_edtTrabContTemporales);

        lytPregunta5 = (LinearLayout) rootView.findViewById(R.id.mod2_p5_lytCheckboxs);

        edt1 = (EditText) rootView.findViewById(R.id.mod2_p5_edt1);
        edt2 = (EditText) rootView.findViewById(R.id.mod2_p5_edt2);
        edt3 = (EditText) rootView.findViewById(R.id.mod2_p5_edt3);
        edt4 = (EditText) rootView.findViewById(R.id.mod2_p5_edt4);
        edt5 = (EditText) rootView.findViewById(R.id.mod2_p5_edt5);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        EditText[] editTexts = {edtNTrabajadores, edtTrabMujeres, edtTiempoParcial, edtContratosTemp};

        for (int i = 0; i <editTexts.length ; i++) {
            final EditText editText = editTexts[i];
            editText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean conFocus) {
                    if(conFocus) {
                        editText.setBackgroundResource(R.drawable.caja_texto_enabled);
                        mostrarTeclado();
                    }
                    else if(view.isEnabled()){
                        editText.setBackgroundResource(R.drawable.cajas_de_texto);
                    }
                }
            });
            editText.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        }

        ckMismoInformante2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtNombYApellidos2.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    lytFondoSpinner2.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    spCargo2.setEnabled(false);
                    edtNombYApellidos2.setText("JULIO LAVADO");
                    spCargo2.setSelection(1);
                    edtNombYApellidos2.setEnabled(false);
                    edtNTrabajadores.requestFocus();
                }else{
                    edtNombYApellidos2.setText("");
                    spCargo2.setSelection(0);
                    edtNombYApellidos2.setBackgroundResource(R.drawable.cajas_de_texto);
                    edtNombYApellidos2.setEnabled(true);
                    lytFondoSpinner2.setBackgroundResource(R.drawable.cajas_de_texto);
                    spCargo2.setEnabled(true);
                    edtNombYApellidos2.requestFocus();
                }
            }
        });
        edtNombYApellidos2.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtNombYApellidos2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(lytFondoSpinner2);
                    lytFondoSpinner2.requestFocus();
                    return true;
                }
                return false;
            }
        });

        edtNombYApellidos2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    edtNombYApellidos2.setBackgroundResource(R.drawable.caja_texto_enabled);
                    mostrarTeclado();
                }
                else if(view.isEnabled()){
                    edtNombYApellidos2.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });

        lytFondoSpinner2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    lytFondoSpinner2.setBackgroundResource(R.drawable.caja_texto_enabled);
                    ocultarTeclado(lytFondoSpinner2);
                }
                else if(view.isEnabled()){
                    lytFondoSpinner2.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });
        edtEspecifiqueCargo2.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueCargo2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    edtEspecifiqueCargo2.setBackgroundResource(R.drawable.caja_texto_enabled);
                    mostrarTeclado();
                }
                else if(view.isEnabled()){
                    edtEspecifiqueCargo2.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });
        spCargo2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                edtEspecifiqueCargo2.setVisibility(View.GONE);
                switch (pos){
                    case 0:break;
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:
                        edtEspecifiqueCargo2.setVisibility(View.VISIBLE);
                        break;
                }
                if(pos == 4) edtEspecifiqueCargo2.requestFocus();
                else if (pos > 0 && pos <4)edtNTrabajadores.requestFocus();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        edtContratosTemp.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(edtContratosTemp);
                    lytPregunta5.requestFocus();
                    return true;
                }
                return false;
            }
        });
        lytPregunta5.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b) lytPregunta5.setBackgroundColor(Color.CYAN);
                else lytPregunta5.setBackgroundColor(Color.TRANSPARENT);
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
