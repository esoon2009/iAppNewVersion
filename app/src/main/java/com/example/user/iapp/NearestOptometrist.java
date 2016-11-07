package com.example.user.iapp;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;
import java.util.Locale;


public class NearestOptometrist extends AppCompatActivity implements OnMapReadyCallback {

    Geocoder geocoder;
    List<Address> addresses;


    private GoogleMap mMap;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearest_optometrist);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.


        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        setUpMapIfNeeded();


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

       geocoder = new Geocoder(this, Locale.getDefault());
        final LatLng NUS = new LatLng(1.2956,103.776);
        LatLng kjOptometrist = new LatLng(1.322454, 103.902630);
        try {
            addresses = geocoder.getFromLocation(NUS.latitude,NUS.longitude,1);
            int numAddresses = addresses.size();
            for(int a=0;a<numAddresses;a++){
                int maxAddressLineIndex = addresses.get(a).getMaxAddressLineIndex();

                for(int b=0;b<maxAddressLineIndex;b++){
                    String address = addresses.get(a).getAddressLine(b);
                    String city = addresses.get(a).getLocality();
                    String state = addresses.get(a).getAdminArea();
                    String country = addresses.get(a).getCountryName();
                    String postalCode = addresses.get(a).getPostalCode();
                    String knownName = addresses.get(a).getFeatureName();

                }
            }

        } catch (IOException e) {
            //e.printStackTrace();
            Log.e("Getting Address:","Error",e);
        }



    }


    @Override
    public void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }



        public void onZoom (View view)
        {
            if (view.getId() == R.id.Bzoomin) {
                mMap.animateCamera(CameraUpdateFactory.zoomIn());
            }
            if (view.getId() == R.id.Bzoomout) {
                mMap.animateCamera(CameraUpdateFactory.zoomOut());
            }
        }

        public void changeType (View view)
        {
            if (mMap.getMapType() == GoogleMap.MAP_TYPE_NORMAL) {
                mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
            } else
                mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        }

        protected void setUpMapIfNeeded () {
            // Do a null check to confirm that we have not already instantiated the map.
            /*if (mMap == null) {
                // Try to obtain the map from the SupportMapFragment.
                ;
                mMap = ((SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map)).getMapAsync(this);

                // Check if we were successful in obtaining the map.
                if (mMap != null) {
                    setUpMap();
                }
            }*/

        }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        setUpMap();

        LatLng sing = new LatLng(1.290270, 103.851959);
        mMap.addMarker(new MarkerOptions().position(sing).title("This is Singapore!"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sing));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            return;
        }
        mMap.setMyLocationEnabled(true);


        LatLng kjOptometrist = new LatLng(1.322454, 103.902630);
        Marker markerKJOptometrist = mMap.addMarker(new MarkerOptions().position(kjOptometrist).title("KJ Optometrist").snippet("This is KJ Optometrist"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kjOptometrist));

        LatLng eyeChampOptometrists = new LatLng(1.377329, 103.849121);
        Marker markerEyeChampOptometrists = mMap.addMarker(new MarkerOptions().position(eyeChampOptometrists).title("Eye Champ Optometrist").snippet("This is Eye Champ Optometrist"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(eyeChampOptometrists));

        LatLng saVisionOptometrists = new LatLng(1.312389, 103.792499);
        Marker markerSaVisionOptometrists = mMap.addMarker(new MarkerOptions().position(saVisionOptometrists).title("Sa Vision Optometrist").snippet("This is Sa Vision Optometrist"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(saVisionOptometrists));

        LatLng eyeCarePeople = new LatLng(1.314669, 103.793954);
        Marker markerEyeCarePeople = mMap.addMarker(new MarkerOptions().position(eyeCarePeople).title("Eyecare People").snippet("This is EyeCare People Optometrist"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(eyeCarePeople));

        LatLng northernOpticians = new LatLng(1.321226, 103.853474);
        Marker markerNorthernOpticians = mMap.addMarker(new MarkerOptions().position(northernOpticians).title("Northern Opticians").snippet("This is Northern Optician"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(northernOpticians));

        LatLng eyeChampOptometristsHeadquarters = new LatLng(1.387027, 103.848071);
        Marker markerEyeChampOptometristsHeadquarters = mMap.addMarker(new MarkerOptions().position(eyeChampOptometristsHeadquarters).title("Eye Champ Optometrists Headquarters").snippet("This is Eye Champ Optometrist Headquarters"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(eyeChampOptometristsHeadquarters));

        LatLng unitedEyeCare = new LatLng(1.325093, 103.843135);
        Marker markerUnitedEyeCare = mMap.addMarker(new MarkerOptions().position(unitedEyeCare).title("United EyeCare(Novena) LLP Optometrist").snippet("This is United Eyecare(Novena)LLP"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(unitedEyeCare));

        LatLng twentyTwentyVisionOptometrists = new LatLng(1.445125, 103.785932);
        Marker markerTwentyTwentyVisionOptometrists = mMap.addMarker(new MarkerOptions().position(twentyTwentyVisionOptometrists).title("20/20 Vision Optometrists").snippet("This is 20/20 Vision Optometrists"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(twentyTwentyVisionOptometrists));

        LatLng twentyTwentyVisionOptometristsAtChoaChuKang = new LatLng(1.385646, 103.745625);
        Marker markerTwentyTwentyVisionOptometristsAtChoaChuKang = mMap.addMarker(new MarkerOptions().position(twentyTwentyVisionOptometristsAtChoaChuKang).title("20/20 Vision Optometrists").snippet("This is 20/20 Vision Optometrist"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(twentyTwentyVisionOptometristsAtChoaChuKang));

        LatLng optometristAtWork = new LatLng(1.292810, 103.803437);
        Marker markerOptometristAtWork = mMap.addMarker(new MarkerOptions().position(optometristAtWork).title("Optometrist @ Work").snippet("This is Optometrist @ Work"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(optometristAtWork));

        LatLng northernOpticiansJurongPoint = new LatLng(1.345525, 103.707494);
        Marker markerNorthernOpticiansJurongPoint = mMap.addMarker(new MarkerOptions().position(northernOpticiansJurongPoint).title("Northern Opticians").snippet("This is Northern Optician"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(northernOpticiansJurongPoint));

    }


        protected void setUpMap () {

            //mMap.addMarker(new MarkerOptions().position(new LatLng(1.290270, 103.851959)).title("This is Singapore!"));
            //mMap.getMapAsync(this);

            mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
            mMap.setMyLocationEnabled(true);
            mMap.setTrafficEnabled(true);
            mMap.setIndoorEnabled(true);
            mMap.setBuildingsEnabled(true);
            mMap.getUiSettings().setZoomControlsEnabled(true);


        }




    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    /*LatLng NUS = new LatLng(1.2956, 103.776);
    LatLng OrchardRd = new LatLng(1.3051, 103.831);

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng kjOptometrist = new LatLng(1.322454, 103.902630);
        Marker markerKJOptometrist = mMap.addMarker(new MarkerOptions().position(kjOptometrist).title("KJ Optometrist").snippet("This is KJ Optometrist"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(kjOptometrist));

        LatLng eyeChampOptometrists = new LatLng(1.377329, 103.849121);
        Marker markerEyeChampOptometrists = mMap.addMarker(new MarkerOptions().position(eyeChampOptometrists).title("Eye Champ Optometrist").snippet("This is Eye Champ Optometrist"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(eyeChampOptometrists));

        LatLng saVisionOptometrists = new LatLng(1.312389, 103.792499);
        Marker markerSaVisionOptometrists = mMap.addMarker(new MarkerOptions().position(saVisionOptometrists).title("Sa Vision Optometrist").snippet("This is Sa Vision Optometrist"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(saVisionOptometrists));

        LatLng eyeCarePeople = new LatLng(1.314669, 103.793954);
        Marker markerEyeCarePeople = mMap.addMarker(new MarkerOptions().position(eyeCarePeople).title("Eyecare People").snippet("This is EyeCare People Optometrist"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(eyeCarePeople));

        LatLng northernOpticians = new LatLng(1.321226, 103.853474);
        Marker markerNorthernOpticians = mMap.addMarker(new MarkerOptions().position(northernOpticians).title("Northern Opticians").snippet("This is Northern Optician"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(northernOpticians));

        LatLng eyeChampOptometristsHeadquarters = new LatLng(1.387027, 103.848071);
        Marker markerEyeChampOptometristsHeadquarters = mMap.addMarker(new MarkerOptions().position(eyeChampOptometristsHeadquarters).title("Eye Champ Optometrists Headquarters").snippet("This is Eye Champ Optometrist Headquarters"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(eyeChampOptometristsHeadquarters));

        LatLng unitedEyeCare = new LatLng(1.325093, 103.843135);
        Marker markerUnitedEyeCare = mMap.addMarker(new MarkerOptions().position(unitedEyeCare).title("United EyeCare(Novena) LLP Optometrist").snippet("This is United Eyecare(Novena)LLP"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(unitedEyeCare));

        LatLng twentyTwentyVisionOptometrists = new LatLng(1.445125, 103.785932);
        Marker markerTwentyTwentyVisionOptometrists = mMap.addMarker(new MarkerOptions().position(twentyTwentyVisionOptometrists).title("20/20 Vision Optometrists").snippet("This is 20/20 Vision Optometrists"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(twentyTwentyVisionOptometrists));

        LatLng twentyTwentyVisionOptometristsAtChoaChuKang = new LatLng(1.385646, 103.745625);
        Marker markerTwentyTwentyVisionOptometristsAtChoaChuKang = mMap.addMarker(new MarkerOptions().position(twentyTwentyVisionOptometristsAtChoaChuKang).title("20/20 Vision Optometrists").snippet("This is 20/20 Vision Optometrist"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(twentyTwentyVisionOptometristsAtChoaChuKang));

        LatLng optometristAtWork = new LatLng(1.292810, 103.803437);
        Marker markerOptometristAtWork = mMap.addMarker(new MarkerOptions().position(optometristAtWork).title("Optometrist @ Work").snippet("This is Optometrist @ Work"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(optometristAtWork));

        LatLng northernOpticiansJurongPoint = new LatLng(1.345525, 103.707494);
        Marker markerNorthernOpticiansJurongPoint = mMap.addMarker(new MarkerOptions().position(northernOpticiansJurongPoint).title("Northern Opticians").snippet("This is Northern Optician"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(northernOpticiansJurongPoint));


        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(-34, 151);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "NearestOptometrist Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.user.iapp/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "NearestOptometrist Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.user.iapp/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }*/
}
