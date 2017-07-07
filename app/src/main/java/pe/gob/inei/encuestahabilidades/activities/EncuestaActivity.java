package pe.gob.inei.encuestahabilidades.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import pe.gob.inei.encuestahabilidades.R;
import pe.gob.inei.encuestahabilidades.fragments.CaratulaFragment;
import pe.gob.inei.encuestahabilidades.fragments.InicioFragment;
import pe.gob.inei.encuestahabilidades.fragments.Modulo1Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo1Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo1Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment4;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment5;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment6;
import pe.gob.inei.encuestahabilidades.fragments.Modulo2Fragment7;
import pe.gob.inei.encuestahabilidades.fragments.Modulo3Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo3Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo3Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.Modulo4Fragment1;
import pe.gob.inei.encuestahabilidades.fragments.Modulo4Fragment2;
import pe.gob.inei.encuestahabilidades.fragments.Modulo4Fragment3;
import pe.gob.inei.encuestahabilidades.fragments.VisitaFragment;

public class EncuestaActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawerLayout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("ENCUESTA HABILIDADES AL TRABAJO EN EL PERÚ");
        setSupportActionBar(toolbar);
        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_encuesta);
        navigationView = (NavigationView)findViewById(R.id.navigation_view_encuesta);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.isChecked()) item.setChecked(false);
                else item.setChecked(true);
                drawerLayout.closeDrawers();
                switch(item.getItemId()){
                    case R.id.opcion_1:
                        setFragment(0);
                        break;
                    case R.id.opcion_2:
                        setFragment(1);
                        break;
                    case R.id.opcion_3:
                        setFragment(2);
                        break;
                    case R.id.opcion_4:
                        setFragment(3);
                        break;
                    case R.id.opcion_5:
                        setFragment(4);
                        break;
                    case R.id.opcion_6:
                        setFragment(5);
                        break;
                    case R.id.opcion_7:
                        setFragment(6);
                        break;
                    case R.id.opcion_8:
                        setFragment(7);
                        break;
                    case R.id.opcion_9:
                        setFragment(8);
                        break;
                    case R.id.opcion_10:
                        setFragment(9);
                        break;
                    case R.id.opcion_11:
                        setFragment(10);
                        break;
                    case R.id.opcion_12:
                        setFragment(11);
                        break;
                    case R.id.opcion_13:
                        setFragment(12);
                        break;
                    case R.id.opcion_14:
                        setFragment(13);
                        break;
                    case R.id.opcion_15:
                        setFragment(14);
                        break;
                    case R.id.opcion_16:
                        setFragment(15);
                        break;
                    case R.id.opcion_17:
                        setFragment(16);
                        break;
                    case R.id.opcion_18:
                        setFragment(17);
                        break;
                    case R.id.opcion_19:
                        setFragment(18);
                        break;
                }
                return false;
            }
        });
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close){
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }
        };

        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        setFragment(0);
    }
    public void setFragment(int pos){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (pos){
            case 0:
                CaratulaFragment caratulaFragment = new CaratulaFragment();
                fragmentTransaction.replace(R.id.container_encuesta, caratulaFragment);
                break;
            case 1:
                VisitaFragment visitaFragment = new VisitaFragment();
                fragmentTransaction.replace(R.id.container_encuesta, visitaFragment);
                break;
            case 2:
                InicioFragment inicioFragment = new InicioFragment();
                fragmentTransaction.replace(R.id.container_encuesta, inicioFragment);
                break;
            case 3:
                Modulo1Fragment1 modulo1Fragment1 = new Modulo1Fragment1();
                fragmentTransaction.replace(R.id.container_encuesta, modulo1Fragment1);
                break;
            case 4:
                Modulo1Fragment2 modulo1Fragment2= new Modulo1Fragment2();
                fragmentTransaction.replace(R.id.container_encuesta, modulo1Fragment2);
                break;
            case 5:
                Modulo1Fragment3 modulo1Fragment3= new Modulo1Fragment3();
                fragmentTransaction.replace(R.id.container_encuesta, modulo1Fragment3);
                break;
            case 6:
                Modulo2Fragment1 modulo2Fragment1= new Modulo2Fragment1();
                fragmentTransaction.replace(R.id.container_encuesta, modulo2Fragment1);
                break;
            case 7:
                Modulo2Fragment2 modulo2Fragment2 = new Modulo2Fragment2();
                fragmentTransaction.replace(R.id.container_encuesta, modulo2Fragment2);
                break;
            case 8:
                Modulo2Fragment3 modulo2Fragment3 = new Modulo2Fragment3();
                fragmentTransaction.replace(R.id.container_encuesta, modulo2Fragment3);
                break;
            case 9:
                Modulo2Fragment4 modulo2Fragment4 = new Modulo2Fragment4();
                fragmentTransaction.replace(R.id.container_encuesta, modulo2Fragment4);
                break;
            case 10:
                Modulo2Fragment5 modulo2Fragment5 = new Modulo2Fragment5();
                fragmentTransaction.replace(R.id.container_encuesta, modulo2Fragment5);
                break;
            case 11:
                Modulo2Fragment6 modulo2Fragment6 = new Modulo2Fragment6();
                fragmentTransaction.replace(R.id.container_encuesta, modulo2Fragment6);
                break;
            case 12:
                Modulo2Fragment7 modulo2Fragment7 = new Modulo2Fragment7();
                fragmentTransaction.replace(R.id.container_encuesta, modulo2Fragment7);
                break;
            case 13:
                Modulo3Fragment1 modulo3Fragment1 = new Modulo3Fragment1();
                fragmentTransaction.replace(R.id.container_encuesta, modulo3Fragment1);
                break;
            case 14:
                Modulo3Fragment2 modulo3Fragment2 = new Modulo3Fragment2();
                fragmentTransaction.replace(R.id.container_encuesta, modulo3Fragment2);
                break;
            case 15:
                Modulo3Fragment3 modulo3Fragment3 = new Modulo3Fragment3();
                fragmentTransaction.replace(R.id.container_encuesta, modulo3Fragment3);
                break;
            case 16:
                Modulo4Fragment1 modulo4Fragment1 = new Modulo4Fragment1();
                fragmentTransaction.replace(R.id.container_encuesta, modulo4Fragment1);
                break;
            case 17:
                Modulo4Fragment2 modulo4Fragment2 = new Modulo4Fragment2();
                fragmentTransaction.replace(R.id.container_encuesta, modulo4Fragment2);
                break;
            case 18:
                Modulo4Fragment3 modulo4Fragment3 = new Modulo4Fragment3();
                fragmentTransaction.replace(R.id.container_encuesta, modulo4Fragment3);
                break;
        }
        fragmentTransaction.commit();
    }
}
