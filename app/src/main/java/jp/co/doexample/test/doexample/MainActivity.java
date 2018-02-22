package jp.co.doexample.test.doexample;

import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;

import java.util.logging.Logger;

public class MainActivity extends FragmentActivity implements TopFragment.OnFragmentInteractionListener, MainFragment.OnFragmentInteractionListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        if (savedInstanceState == null) {

            TopFragment fragmentTop = TopFragment.newInstance("PARAM1", "PARAM2");
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.add(R.id.top_bar_container, fragmentTop, "TopBarFragment");

            MainFragment mainFragment = MainFragment.newInstance("PARAM1", "PARAM2");
            fragmentTransaction.add(R.id.main_container, mainFragment, "MainFragment");
            fragmentTransaction.commit();
        }

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        if (outState.isEmpty()) {
            outState = new Bundle();
        }
        super.onSaveInstanceState(outState);
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
