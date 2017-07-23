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
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo6Fragment1 extends Fragment {


    private LinearLayout lytFragment;
    //general
    //private LinearLayout layoutFragment1;
    //ejecuta

    private LinearLayout lytPregunta2;
    private LinearLayout lytPregunta3;

    private CheckBox ckMismoInformante;
    private EditText edtApeYNom;
    private Spinner spCargo;
    private EditText edtEspecifiqueCargo;


    private LinearLayout lytPregunta1;
    private RadioGroup rgb;
    private RadioButton rgb1;
    private RadioButton rgb2;
    private RadioButton rgb3;

    private LinearLayout lytSpUno;
    private RadioGroup rgbp2rgp2;
    private RadioButton rgp2b1;
    private RadioButton rgp2b2;

    private EditText edtEspecificarNroTrabajadores;
    private EditText edtEspecificarPorcentajeTrabajadores;

    private LinearLayout lytrgb;
    private RadioGroup rgp3;
    private RadioButton rgp3p1;
    private RadioButton rgp3p2;

    private CheckBox ckGerentes;
    private EditText edtNroDeComponentes1;
    private EditText edtPorcentajeDeComponentes1;
    private LinearLayout lytCk_1;

    private CheckBox ckProfesionales;
    private EditText edtNroDeComponentes2;
    private EditText edtPorcentajeDeComponentes2;
    private LinearLayout lytCk_2;

    private CheckBox ckTecnicos;
    private EditText edtNroDeComponentes3;
    private EditText edtPorcentajeDeComponentes3;
    private LinearLayout lytCk_3;

    private CheckBox ckPersonalApoyoAdministrativo;
    private EditText edtNroDeComponentes4;
    private EditText edtPorcentajeDeComponentes4;
    private LinearLayout lytCk_4;

    private CheckBox ckPersonalServicio;
    private EditText edtNroDeComponentes5;
    private EditText edtPorcentajeDeComponentes5;
    private LinearLayout lytCk_5;

    private CheckBox ckTrabajadoresCalificados;
    private EditText edtNroDeComponentes6;
    private EditText edtPorcentajeDeComponentes6;
    private LinearLayout lytCk_6;

    private CheckBox ckOficiales;
    private EditText edtNroDeComponentes7;
    private EditText edtPorcentajeDeComponentes7;
    private LinearLayout lytCk_7;

    private CheckBox ckOperadores;
    private EditText edtNroDeComponentes8;
    private EditText edtPorcentajeDeComponentes8;
    private LinearLayout lytCk_8;

    private CheckBox ckOcupaciones;
    private EditText edtNroDeComponentes9;
    private EditText edtPorcentajeDeComponentes9;
    private LinearLayout lytCk_9;

    private EditText edtTotalPersonasOcupadas;
    private EditText edtTotalPorcentajeComponentes;

    private LinearLayout layout_cabecera;
    public Modulo6Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

    View rootView = inflater.inflate(R.layout.fragment_modulo6_fragment1, container, false);

    lytFragment = (LinearLayout) rootView.findViewById(R.id.mod6_layoutFragment1);
    //  layoutFragment1 = (LinearLayout) rootView.findViewById(R.id.mod6_layoutFragment1);

    layout_cabecera = (LinearLayout) rootView.findViewById(R.id.layout_cabecera);


    ckMismoInformante = (CheckBox) rootView.findViewById(R.id.mod6_cab_ckMismoInformante);
    edtApeYNom = (EditText)rootView.findViewById(R.id.mod6_cab_edtApeYNom);
    spCargo = (Spinner) rootView.findViewById(R.id.mod6_cab_spCargo);
    edtEspecifiqueCargo = (EditText)rootView.findViewById(R.id.mod6_cab_edtEspecifiqueCargo);


    lytPregunta1 = (LinearLayout) rootView.findViewById(R.id.mod6_p1_lytPregunta1);
    rgb = (RadioGroup) rootView.findViewById(R.id.mod6_p1_rgb);
    rgb1 = (RadioButton) rootView.findViewById(R.id.mod6_p1_rgb1);
    rgb2 = (RadioButton) rootView.findViewById(R.id.mod6_p1_rgb2);
    rgb3 = (RadioButton) rootView.findViewById(R.id.mod6_p1_rgb3);


    lytPregunta2 = (LinearLayout) rootView.findViewById(R.id.mod6_p2_lytPregunta2);
    lytSpUno = (LinearLayout) rootView.findViewById(R.id.mod6_p2_lytSpUno);
    rgbp2rgp2 = (RadioGroup) rootView.findViewById(R.id.mod6_p2_rgbp2);
    rgp2b1 = (RadioButton) rootView.findViewById(R.id.mod6_p2_rgp2b1);
    rgp2b2= (RadioButton) rootView.findViewById(R.id.mod6_p2_rgp2b2);
    edtEspecificarNroTrabajadores = (EditText)rootView.findViewById(R.id.mod6_p2_edtEspecificarNroTrabajadores);
    edtEspecificarPorcentajeTrabajadores = (EditText)rootView.findViewById(R.id.mod6_p2_edtEspecificarPorcentajeTrabajadores);


    lytPregunta3 = (LinearLayout) rootView.findViewById(R.id.mod6_p3_lytPregunta3);
    lytrgb = (LinearLayout) rootView.findViewById(R.id.mod6_p3_lytrgb);
    rgp3 = (RadioGroup) rootView.findViewById(R.id.mod6_p3_rgp3);
    rgp3p1 = (RadioButton) rootView.findViewById(R.id.mod6_p3_rgp3b1);
    rgp3p2 = (RadioButton) rootView.findViewById(R.id.mod6_p3_rgp3p2);


    ckGerentes = (CheckBox) rootView.findViewById(R.id.mod6_p3_ckGerentes);
    edtNroDeComponentes1 = (EditText)rootView.findViewById(R.id.mod6_p3_edtNroDeComponentes1);
    edtPorcentajeDeComponentes1 = (EditText)rootView.findViewById(R.id.mod6_p3_edtPorcentajeDeComponentes1);
    lytCk_1 = (LinearLayout) rootView.findViewById(R.id.mod6_p3_lytCk_1);

    ckProfesionales = (CheckBox) rootView.findViewById(R.id.mod6_p3_ckProfesionales);
    edtNroDeComponentes2 = (EditText)rootView.findViewById(R.id.mod6_p3_edtNroDeComponentes2);
    edtPorcentajeDeComponentes2 = (EditText)rootView.findViewById(R.id.mod6_p3_edtPorcentajeDeComponentes2);
    lytCk_2 = (LinearLayout) rootView.findViewById(R.id.mod6_p3_lytCk_2);

    ckTecnicos = (CheckBox) rootView.findViewById(R.id.mod6_p3_ckTecnicos);
    edtNroDeComponentes3 = (EditText)rootView.findViewById(R.id.mod6_p3_edtNroDeComponentes3);
    edtPorcentajeDeComponentes3 = (EditText)rootView.findViewById(R.id.mod6_p3_edtPorcentajeDeComponentes3);
    lytCk_3 = (LinearLayout) rootView.findViewById(R.id.mod6_p3_lytCk_3);

    ckPersonalApoyoAdministrativo = (CheckBox) rootView.findViewById(R.id.mod6_p3_ckPersonalApoyoAdministrativo);
    edtNroDeComponentes4 = (EditText)rootView.findViewById(R.id.mod6_p3_edtNroDeComponentes4);
    edtPorcentajeDeComponentes4 = (EditText)rootView.findViewById(R.id.mod6_p3_edtPorcentajeDeComponentes4);
    lytCk_4 = (LinearLayout) rootView.findViewById(R.id.mod6_p3_lytCk_4);

    ckPersonalServicio = (CheckBox) rootView.findViewById(R.id.mod6_p3_ckPersonalServicio);
    edtNroDeComponentes5 = (EditText)rootView.findViewById(R.id.mod6_p3_edtNroDeComponentes5);
    edtPorcentajeDeComponentes5 = (EditText)rootView.findViewById(R.id.mod6_p3_edtPorcentajeDeComponentes5);
    lytCk_5 = (LinearLayout) rootView.findViewById(R.id.mod6_p3_lytCk_5);

    ckTrabajadoresCalificados = (CheckBox) rootView.findViewById(R.id.mod6_p3_ckTrabajadoresCalificados);
    edtNroDeComponentes6 = (EditText)rootView.findViewById(R.id.mod6_p3_edtNroDeComponentes6);
    edtPorcentajeDeComponentes6 = (EditText)rootView.findViewById(R.id.mod6_p3_edtPorcentajeDeComponentes6);
    lytCk_6 = (LinearLayout) rootView.findViewById(R.id.mod6_p3_lytCk_6);

    ckOficiales = (CheckBox) rootView.findViewById(R.id.mod6_p3_ckOficiales);
    edtNroDeComponentes7 = (EditText)rootView.findViewById(R.id.mod6_p3_edtNroDeComponentes7);
    edtPorcentajeDeComponentes7 = (EditText)rootView.findViewById(R.id.mod6_p3_edtPorcentajeDeComponentes7);
    lytCk_7 = (LinearLayout) rootView.findViewById(R.id.mod6_p3_lytCk_7);

    ckOperadores = (CheckBox) rootView.findViewById(R.id.mod6_p3_ckOperadores);
    edtNroDeComponentes8 = (EditText)rootView.findViewById(R.id.mod6_p3_edtNroDeComponentes8);
    edtPorcentajeDeComponentes8 = (EditText)rootView.findViewById(R.id.mod6_p3_edtPorcentajeDeComponentes8);
    lytCk_8 = (LinearLayout) rootView.findViewById(R.id.mod6_p3_lytCk_8);

    ckOcupaciones = (CheckBox) rootView.findViewById(R.id.mod6_p3_ckOcupaciones);
    edtNroDeComponentes9 = (EditText)rootView.findViewById(R.id.mod6_p3_edtNroDeComponentes9);
    edtPorcentajeDeComponentes9 = (EditText)rootView.findViewById(R.id.mod6_p3_edtPorcentajeDeComponentes9);
    lytCk_9 = (LinearLayout) rootView.findViewById(R.id.mod6_p3_lytCk_9);

    edtTotalPersonasOcupadas = (EditText)rootView.findViewById(R.id.mod6_p3_edtTotalPersonasOcupadas);
    edtTotalPorcentajeComponentes = (EditText)rootView.findViewById(R.id.mod6_p3_edtTotalPorcentajeComponentes);


        return rootView;
}

    @Override
    public void onViewCreated (View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        EditText[] cajasDeTexto = {edtApeYNom, edtEspecifiqueCargo, edtEspecificarNroTrabajadores,
                edtEspecificarPorcentajeTrabajadores,edtNroDeComponentes1,edtNroDeComponentes2, edtNroDeComponentes3,
                edtNroDeComponentes4,edtNroDeComponentes5,edtNroDeComponentes6,edtNroDeComponentes7,edtNroDeComponentes8,
                edtNroDeComponentes9,edtTotalPersonasOcupadas,edtTotalPorcentajeComponentes,edtPorcentajeDeComponentes1,
                edtPorcentajeDeComponentes2,edtPorcentajeDeComponentes3,edtPorcentajeDeComponentes4,edtPorcentajeDeComponentes5,
                edtPorcentajeDeComponentes6,edtPorcentajeDeComponentes7,edtPorcentajeDeComponentes8,edtPorcentajeDeComponentes9};
        RadioGroup[] radioGroups = {rgb,rgbp2rgp2,rgp3};
        //
        RadioButton[] radioButton = {rgp2b1,rgp2b2};


        for (int i = 0; i < cajasDeTexto.length; i++) {
            final EditText editText = cajasDeTexto[i];
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




        lytFragment.requestFocus();


        ckMismoInformante.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    edtApeYNom.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    spCargo.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    edtEspecifiqueCargo.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    layout_cabecera.setBackgroundResource(R.drawable.cajas_de_texto_disabled);
                    spCargo.setEnabled(false);
                    edtApeYNom.setText("JULIO LAVADO");
                    spCargo.setSelection(1);
                    edtApeYNom.setEnabled(false);
                    edtEspecifiqueCargo.setEnabled(false);
                    //  edtEspecifiqueCargo.requestFocus();
                    rgb.setBackgroundColor(Color.CYAN);
                }else{
                    edtApeYNom.setText("");
                    spCargo.setSelection(0);
                    edtApeYNom.setBackgroundResource(R.drawable.cajas_de_texto);
                    spCargo.setBackgroundResource(R.drawable.cajas_de_texto);
                    edtEspecifiqueCargo.setBackgroundResource(R.drawable.cajas_de_texto);
                    edtApeYNom.setEnabled(true);
                    layout_cabecera.setBackgroundResource(R.drawable.cajas_de_texto);
                    spCargo.setEnabled(true);
                    edtEspecifiqueCargo.setEnabled(true);
                    edtApeYNom.requestFocus();
                }
            }
        });

        edtApeYNom.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtApeYNom.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado(lytSpUno);
                    lytSpUno.requestFocus();
                    // lytSpUno.setBackgroundColor(Color.CYAN);
                    return true;
                }
                return false;
            }
        });

        edtApeYNom.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    edtApeYNom.setBackgroundResource(R.drawable.caja_texto_enabled);
                    mostrarTeclado();
                }
                else if(view.isEnabled()){
                    edtApeYNom.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });

        spCargo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
                edtEspecifiqueCargo.setVisibility(View.GONE);
                switch (pos){
                    case 0:break;
                    case 1:break;
                    case 2:break;
                    case 3:break;
                    case 4:
                        edtEspecifiqueCargo.setVisibility(View.VISIBLE);
                        break;
                }
                if(pos == 4) edtEspecifiqueCargo.requestFocus();
                else if (pos > 0 && pos <4)
                    //      edtEspecificarNroTrabajadores.requestFocus();
                   rgb.setBackgroundColor(Color.CYAN);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        edtEspecifiqueCargo.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
        edtEspecifiqueCargo.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean conFocus) {
                if(conFocus) {
                    edtEspecifiqueCargo.setBackgroundResource(R.drawable.caja_texto_enabled);
                    mostrarTeclado();
                }
                else if(view.isEnabled()){
                    edtEspecifiqueCargo.setBackgroundResource(R.drawable.cajas_de_texto);
                }
            }
        });



        rgb.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch(i){
                    case R.id.mod6_p1_rgb1: break;
                    case R.id.mod6_p1_rgb2: break;
                    case R.id.mod6_p1_rgb3: break;
                }

                rgb.setBackgroundColor(Color.TRANSPARENT);
                rgbp2rgp2.setBackgroundColor(Color.CYAN);
            }
        });


        lytSpUno.setVisibility(View.GONE);
        rgp3.setBackgroundColor(Color.TRANSPARENT);
        rgbp2rgp2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch(i){
                    case R.id.mod6_p2_rgp2b1:

                     //   edtEspecificarNroTrabajadores.setBackgroundColor(Color.CYAN);
                     //   lytrgb.setBackgroundColor(Color.TRANSPARENT);
                        break;

                    case R.id.mod6_p2_rgp2b2:
                      //  lytrgb.setBackgroundColor(Color.TRANSPARENT);
                        rgp3.setBackgroundColor(Color.CYAN);

                        break;


                }
                rgb.setBackgroundColor(Color.TRANSPARENT);
                rgbp2rgp2.setBackgroundColor(Color.TRANSPARENT);


            }
        });


        rgbp2rgp2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod6_p2_rgp2b1:
                        lytSpUno.setVisibility(View.VISIBLE);
                        edtEspecificarNroTrabajadores.setBackgroundColor(Color.CYAN);
                        edtEspecificarNroTrabajadores.requestFocus();
                        break;
                    case R.id.mod6_p2_rgp2b2:
                        //  rgp1.clearCheck();
                        lytSpUno.setVisibility(View.GONE);
                        rgp3.requestFocus();
                        break;
                }

               rgbp2rgp2.setBackgroundColor(Color.TRANSPARENT);
            }
        });

        rgbp2rgp2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(b) rgbp2rgp2.setBackgroundColor(Color.CYAN);
                else rgbp2rgp2.setBackgroundColor(Color.TRANSPARENT);
            }
        });

        rgp3.setBackgroundColor(Color.TRANSPARENT);
        edtEspecificarNroTrabajadores.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    lytSpUno.requestFocus();
                    edtEspecificarPorcentajeTrabajadores.setBackgroundColor(Color.CYAN);
                    rgp3.setBackgroundColor(Color.TRANSPARENT);
                    mostrarTeclado();


                    return true;
                }
                return false;
            }
        });

        edtEspecificarPorcentajeTrabajadores.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    edtEspecificarPorcentajeTrabajadores.requestFocus();
                    rgp3.setBackgroundColor(Color.CYAN);
                    //  edtEspecificarPorcentajeTrabajadores.requestFocus();
                    mostrarTeclado();
                    return true;
                }
                return false;
            }
        });



        rgp3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch(i){
                    case R.id.mod6_p3_rgp3b1: break;
                    case R.id.mod6_p3_rgp3p2: break;
                }
                rgp3.setBackgroundColor(Color.TRANSPARENT);
                ckGerentes.setBackgroundColor(Color.CYAN);
            }
        });


        lytCk_1.setVisibility(View.GONE);
        ckGerentes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    lytCk_1.setVisibility(View.VISIBLE);
                    ckGerentes.setBackgroundColor(Color.TRANSPARENT);
                    edtNroDeComponentes1.setBackgroundColor(Color.CYAN);
                    //lytPregunta3.requestFocus();
                    // ocultarTeclado();
                } else {
                    lytCk_1.setVisibility(View.GONE);
                    edtNroDeComponentes1.setText("");
                    edtPorcentajeDeComponentes1.setText("");
                    edtNroDeComponentes1.requestFocus();
                    ckProfesionales.setBackgroundColor(Color.CYAN);

                }
            }

        });


        edtNroDeComponentes1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    edtPorcentajeDeComponentes1.setBackgroundColor(Color.CYAN);
                    return true;
                }
                return false;
            }
        });

        edtPorcentajeDeComponentes1.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                       ckProfesionales.setBackgroundColor(Color.CYAN);

                    return true;
                }
                return false;
            }
        });


        lytCk_2.setVisibility(View.GONE);
        ckProfesionales.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    lytCk_2.setVisibility(View.VISIBLE);
                    ckProfesionales.setBackgroundColor(Color.TRANSPARENT);
                    edtNroDeComponentes2.setBackgroundColor(Color.CYAN);
                    // ocultarTeclado();

                } else {
                    lytCk_2.setVisibility(View.GONE);
                    edtNroDeComponentes2.setText("");
                    edtPorcentajeDeComponentes2.setText("");
                    edtNroDeComponentes2.requestFocus();
                    ckTecnicos.setBackgroundColor(Color.CYAN);

                }
            }
        });

        edtNroDeComponentes2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    edtPorcentajeDeComponentes2.setBackgroundColor(Color.CYAN);
                    return true;
                }
                return false;
            }
        });

        edtPorcentajeDeComponentes2.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ckTecnicos.setBackgroundColor(Color.CYAN);

                    return true;
                }
                return false;
            }
        });

        lytCk_3.setVisibility(View.GONE);
        ckTecnicos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    lytCk_3.setVisibility(View.VISIBLE);
                    ckTecnicos.setBackgroundColor(Color.TRANSPARENT);
                    edtNroDeComponentes3.setBackgroundColor(Color.CYAN);
                    // lytPregunta3.requestFocus();
                    // ocultarTeclado();
                } else {
                    lytCk_3.setVisibility(View.GONE);
                    edtNroDeComponentes3.setText("");
                    edtPorcentajeDeComponentes3.setText("");
                    edtNroDeComponentes3.requestFocus();
                    ckPersonalApoyoAdministrativo.setBackgroundColor(Color.CYAN);

                }
            }
        });

        edtNroDeComponentes3.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    edtPorcentajeDeComponentes3.setBackgroundColor(Color.CYAN);
                    return true;
                }
                return false;
            }
        });

        edtPorcentajeDeComponentes3.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ckPersonalApoyoAdministrativo.setBackgroundColor(Color.CYAN);

                    return true;
                }
                return false;
            }
        });

        lytCk_4.setVisibility(View.GONE);
        ckPersonalApoyoAdministrativo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    lytCk_4.setVisibility(View.VISIBLE);
                    // lytPregunta3.requestFocus();
                    // ocultarTeclado();
                } else {
                    lytCk_4.setVisibility(View.GONE);
                    edtNroDeComponentes4.setText("");
                    edtPorcentajeDeComponentes4.setText("");
                    edtNroDeComponentes4.requestFocus();
                }
            }
        });


        edtNroDeComponentes4.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    edtPorcentajeDeComponentes4.setBackgroundColor(Color.CYAN);
                    return true;
                }
                return false;
            }
        });

        edtPorcentajeDeComponentes4.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ckPersonalServicio.setBackgroundColor(Color.CYAN);

                    return true;
                }
                return false;
            }
        });

        lytCk_5.setVisibility(View.GONE);
        ckPersonalServicio.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    lytCk_5.setVisibility(View.VISIBLE);
                    //  lytPregunta3.requestFocus();
                    // ocultarTeclado();
                } else {
                    lytCk_5.setVisibility(View.GONE);
                    edtNroDeComponentes5.setText("");
                    edtPorcentajeDeComponentes5.setText("");
                    edtNroDeComponentes5.requestFocus();
                }
            }
        });

        lytCk_6.setVisibility(View.GONE);
        ckTrabajadoresCalificados.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    lytCk_6.setVisibility(View.VISIBLE);
                    //  lytPregunta3.requestFocus();
                    // ocultarTeclado();
                } else {
                    lytCk_6.setVisibility(View.GONE);
                    edtNroDeComponentes6.setText("");
                    edtPorcentajeDeComponentes6.setText("");
                    edtNroDeComponentes6.requestFocus();
                }
            }
        });

        lytCk_7.setVisibility(View.GONE);
        ckOficiales.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    lytCk_7.setVisibility(View.VISIBLE);
                    //  lytPregunta3.requestFocus();
                    // ocultarTeclado();
                } else {
                    lytCk_7.setVisibility(View.GONE);
                    edtNroDeComponentes7.setText("");
                    edtPorcentajeDeComponentes7.setText("");
                    edtNroDeComponentes7.requestFocus();
                }
            }
        });

        lytCk_8.setVisibility(View.GONE);
        ckOperadores.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    lytCk_8.setVisibility(View.VISIBLE);
                    //  lytPregunta3.requestFocus();
                    // ocultarTeclado();
                } else {
                    lytCk_8.setVisibility(View.GONE);
                    edtNroDeComponentes8.setText("");
                    edtPorcentajeDeComponentes8.setText("");
                    edtNroDeComponentes8.requestFocus();
                }
            }
        });

        lytCk_9.setVisibility(View.GONE);
        ckOcupaciones.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    lytCk_9.setVisibility(View.VISIBLE);
                    //  lytPregunta3.requestFocus();
                    // ocultarTeclado();
                } else {
                    lytCk_9.setVisibility(View.GONE);
                    edtNroDeComponentes9.setText("");
                    edtPorcentajeDeComponentes9.setText("");
                    edtNroDeComponentes9.requestFocus();
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
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
    }
}
