package pe.gob.inei.encuestahabilidades.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.lang.reflect.Field;

import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo8Fragment3 extends Fragment {

    private LinearLayout lytFragment;

    private LinearLayout lytInteligencia;
    private CheckBox ckInteligencia1;
    private CheckBox ckInteligencia2;
    private CheckBox ckInteligencia3;
    private CheckBox ckInteligencia4;
    private CheckBox ckInteligencia5;
    private CheckBox ckInteligencia6;
    private EditText edtInteligencia;

    private LinearLayout lytAprendizaje;
    private CheckBox ckAprendizaje1;
    private CheckBox ckAprendizaje2;
    private CheckBox ckAprendizaje3;
    private CheckBox ckAprendizaje4;
    private CheckBox ckAprendizaje5;
    private CheckBox ckAprendizaje6;
    private EditText edtAprendizaje;

    private LinearLayout lytRobotica;
    private CheckBox ckRobotica1;
    private CheckBox ckRobotica2;
    private CheckBox ckRobotica3;
    private CheckBox ckRobotica4;
    private CheckBox ckRobotica5;
    private CheckBox ckRobotica6;
    private EditText edtRobotica;

    private LinearLayout lytTransporte;
    private CheckBox ckTransporte1;
    private CheckBox ckTransporte2;
    private CheckBox ckTransporte3;
    private CheckBox ckTransporte4;
    private CheckBox ckTransporte5;
    private CheckBox ckTransporte6;
    private EditText edtTransporte;

    private LinearLayout lytManufactura;
    private CheckBox ckManufactura1;
    private CheckBox ckManufactura2;
    private CheckBox ckManufactura3;
    private CheckBox ckManufactura4;
    private CheckBox ckManufactura5;
    private CheckBox ckManufactura6;
    private EditText edtManufactura;

    private LinearLayout lytProduccion;
    private CheckBox ckProduccion1;
    private CheckBox ckProduccion2;
    private CheckBox ckProduccion3;
    private CheckBox ckProduccion4;
    private CheckBox ckProduccion5;
    private CheckBox ckProduccion6;
    private EditText edtProduccion;


    public Modulo8Fragment3() {
        // Required empty public constructor
        //prueba2 :V
        //prueba46
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo8_fragment3, container, false);

        lytFragment = (LinearLayout) rootView.findViewById(R.id.mod8_layoutFragment3);

        lytInteligencia = (LinearLayout) rootView.findViewById(R.id.mod8_p3_lytInteligencia);
        ckInteligencia1 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckInteligencia1);
        ckInteligencia2 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckInteligencia2);
        ckInteligencia3 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckInteligencia3);
        ckInteligencia4 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckInteligencia4);
        ckInteligencia5 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckInteligencia5);
        ckInteligencia6 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckInteligencia6);
        edtInteligencia = (EditText) rootView.findViewById(R.id.mod8_p3_edtInteligencia);

        lytAprendizaje = (LinearLayout) rootView.findViewById(R.id.mod8_p3_lytAprendizaje);
        ckAprendizaje1 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckAprendizaje1);
        ckAprendizaje2 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckAprendizaje2);
        ckAprendizaje3 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckAprendizaje3);
        ckAprendizaje4 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckAprendizaje4);
        ckAprendizaje5 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckAprendizaje5);
        ckAprendizaje6 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckAprendizaje6);
        edtAprendizaje = (EditText) rootView.findViewById(R.id.mod8_p3_edtAprendizaje);

        lytRobotica = (LinearLayout) rootView.findViewById(R.id.mod8_p3_lytRobotica);
        ckRobotica1 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckRobotica1);
        ckRobotica2 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckRobotica2);
        ckRobotica3 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckRobotica3);
        ckRobotica4 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckRobotica4);
        ckRobotica5 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckRobotica5);
        ckRobotica6 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckRobotica6);
        edtRobotica = (EditText) rootView.findViewById(R.id.mod8_p3_edtRobotica);

        lytTransporte = (LinearLayout) rootView.findViewById(R.id.mod8_p3_lytTransporte);
        ckTransporte1 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckTransporte1);
        ckTransporte2 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckTransporte2);
        ckTransporte3 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckTransporte3);
        ckTransporte4 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckTransporte4);
        ckTransporte5 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckTransporte5);
        ckTransporte6 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckTransporte6);
        edtTransporte = (EditText) rootView.findViewById(R.id.mod8_p3_edtTransporte);

        lytManufactura = (LinearLayout) rootView.findViewById(R.id.mod8_p3_lytManufactura);
        ckManufactura1 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckManufactura1);
        ckManufactura2 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckManufactura2);
        ckManufactura3 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckManufactura3);
        ckManufactura4 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckManufactura4);
        ckManufactura5 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckManufactura5);
        ckManufactura6 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckManufactura6);
        edtManufactura = (EditText) rootView.findViewById(R.id.mod8_p3_edtManufactura);

        lytProduccion = (LinearLayout) rootView.findViewById(R.id.mod8_p3_lytProduccion);
        ckProduccion1 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckProduccion1);
        ckProduccion2 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckProduccion2);
        ckProduccion3 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckProduccion3);
        ckProduccion4 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckProduccion4);
        ckProduccion5 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckProduccion5);
        ckProduccion6 = (CheckBox) rootView.findViewById(R.id.mod8_p3_ckProduccion6);
        edtProduccion = (EditText) rootView.findViewById(R.id.mod8_p3_edtProduccion);

        return rootView;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lytFragment.requestFocus();

        final EditText[] cajasDeTexto = {edtInteligencia, edtAprendizaje, edtRobotica,
                edtTransporte,edtManufactura,edtProduccion};

        CheckBox[] checkEventos = {ckInteligencia6, ckAprendizaje6, ckRobotica6,
                ckTransporte6,ckManufactura6,ckProduccion6};

        for (final EditText editText: cajasDeTexto) {
            editText.setVisibility(View.GONE);
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
        }

        for (int i = 0; i < checkEventos.length; i++){
            final int posicion= i;
            checkEventos[posicion].setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (b) {
                        cajasDeTexto[posicion].setVisibility(View.VISIBLE);
                        cajasDeTexto[posicion].requestFocus();
                    }else{
                        cajasDeTexto[posicion].setText("");
                        cajasDeTexto[posicion].setVisibility(View.GONE);
                    }
                }
            });
        }

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
