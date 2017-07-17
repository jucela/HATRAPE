package pe.gob.inei.encuestahabilidades.fragments;


import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Spinner;

import pe.gob.inei.encuestahabilidades.NumericKeyBoardTransformationMethod;
import pe.gob.inei.encuestahabilidades.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Modulo1Fragment3 extends Fragment {

    private EditText edtNEstablecimientos;

    private LinearLayout lytPregunta10;
    private RadioGroup rgEstablecimientos;

    private RadioGroup rgAnio;
    private EditText edtAnio;
    private EditText edtMes;
    private LinearLayout lytEdit1;
    private LinearLayout lytEdit2;

    private Spinner spEstablecimientos;

    public Modulo1Fragment3() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_modulo1_fragment3, container, false);
        edtNEstablecimientos = (EditText) rootView.findViewById(R.id.mod1_p9_edtEstablecimientos);

        lytPregunta10 = (LinearLayout) rootView.findViewById(R.id.mod1_p10_lytPregunta10);
        rgEstablecimientos = (RadioGroup) rootView.findViewById(R.id.mod1_p10_rgEstablecimiento);

        rgAnio = (RadioGroup) rootView.findViewById(R.id.mod1_p11_rgAnio);
        edtAnio = (EditText) rootView.findViewById(R.id.mod1_p11_edt1);
        edtMes = (EditText) rootView.findViewById(R.id.mod1_p11_edt2);
        lytEdit1 = (LinearLayout) rootView.findViewById(R.id.mod1_p11_lytEdit1);
        lytEdit2 = (LinearLayout) rootView.findViewById(R.id.mod1_p11_lytEdit2);

        spEstablecimientos = (Spinner) rootView.findViewById(R.id.mod1_p12_sp);

        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        edtNEstablecimientos.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edtNEstablecimientos.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado();
                    lytPregunta10.requestFocus();
                    return true;
                }
                return false;
            }
        });

        rgAnio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                switch (i){
                    case R.id.mod1_p11_rbSi:
                        lytEdit1.setVisibility(View.VISIBLE);
                        lytEdit2.setVisibility(View.GONE);
                        break;
                    case R.id.mod1_p11_rbNo:
                        lytEdit2.setVisibility(View.VISIBLE);
                        lytEdit1.setVisibility(View.GONE);
                        break;
                }
            }
        });

        edtAnio.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edtAnio.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado();
                    spEstablecimientos.requestFocus();
                    return true;
                }
                return false;
            }
        });
        edtMes.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        edtMes.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent keyEvent) {
                if ((keyEvent.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    ocultarTeclado();
                    spEstablecimientos.requestFocus();
                    return true;
                }
                return false;
            }
        });


    }

    public void ocultarTeclado(){
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(getActivity().INPUT_METHOD_SERVICE);
        if (imm.isAcceptingText()) {
            imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
        }

    }

    public void mostrarTeclado(){
        InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(getActivity().INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
    }
}
