package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

//TODO FIX STYLE
public class DetailsActivity extends AppCompatActivity {

    private TextView txtYear;
    private TextView txtAlcohol;
    private TextView txtBrewery;
    private TextView txtBeer;
    private TextView txtInfo;
    private ImageView imgBeer;
    private Button btnReturn;
    private String beerName;
    private String beerYear;
    private String beerBrewery;
    private String beerPercentage;
    private String beerInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        txtYear = findViewById(R.id.txtDetailsJaar);
        txtAlcohol = findViewById(R.id.txtDetailsPercent);
        txtBrewery = findViewById(R.id.txtDetailsBrouwerij);
        txtBeer = findViewById(R.id.txtDetails);
        txtInfo = findViewById(R.id.txtDetailsInfo);
        //TODO PROGRAM BUTTON -> JUST GOES BACK TO MAIN ACTIVITY ITS SO DANG EASY
        btnReturn = findViewById(R.id.btnReturn);
        imgBeer = findViewById(R.id.imgDetails);

        Intent beerIntent = getIntent(); // get the previous intent (this activity is only accessible by that intent)
        String beer = beerIntent.getStringExtra("beer"); // will return which beer was scanned

        switch(beer){
            case "leffe":
                beerName = "Leffe";
                beerBrewery = "AB InBev";
                beerInfo = "Leffe is een Belgisch abdijbier dat gebrouwen wordt door AB InBev. Het biermerk is vernoemd naar de in Dinant gelegen abdij van Leffe.";
                beerPercentage = "6.6";
                beerYear = "1240";
                break;
            case "stella artois":
                beerName = "Stella Artois";
                beerBrewery = "AB InBev";
                beerInfo = "Stella Artois is een Belgische pils van het concern AB InBev. Het bier, met een alcoholpercentage van 5,2 %, wordt gebrouwen op een tiental plaatsen in de wereld, waaronder Leuven en Jupille.";
                beerPercentage = "5.2";
                beerYear = "1366/1926";
                imgBeer.setImageResource(R.drawable.stella);
                break;
            case "duvel":
                //TODO FILL
                beerName = "";
                beerBrewery = "";
                beerInfo = "";
                beerPercentage = "";
                beerYear = "";
                break;
            case "tripel karmeliet":
                //TODO FILL
                beerName = "";
                beerBrewery = "";
                beerInfo = "";
                beerPercentage = "";
                beerYear = "";
                break;
            case "jupiler":
                //TODO FILL
                beerName = "";
                beerBrewery = "";
                beerInfo = "";
                beerPercentage = "";
                beerYear = "";
                break;
            case "cara":
                //TODO FILL
                beerName = "";
                beerBrewery = "";
                beerInfo = "";
                beerPercentage = "";
                beerYear = "";
                break;
        }

        txtBeer.setText(beerName);
        txtBrewery.setText(beerBrewery);
        txtAlcohol.setText(beerPercentage);
        txtYear.setText(beerYear);
    }
}