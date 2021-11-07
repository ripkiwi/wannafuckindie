package org.tensorflow.lite.examples.classification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
        btnReturn = findViewById(R.id.btnReturn);
        imgBeer = findViewById(R.id.imgDetails);

        btnReturn.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        Intent beerIntent = getIntent(); // get the previous intent (this activity is only accessible by that intent)
        String beer = beerIntent.getStringExtra("beer"); // will return which beer was scanned

        switch(beer){
            case "leffe":
                beerName = "Leffe";
                beerBrewery = "AB InBev";
                beerInfo = "Leffe is een Belgisch abdijbier dat gebrouwen wordt door AB InBev. Het biermerk is vernoemd naar de in Dinant gelegen abdij van Leffe.";
                beerPercentage = "6.6";
                beerYear = "1240";
                imgBeer.setImageResource(R.drawable.leffe);
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
                beerName = "Duvel";
                beerBrewery = "Duvel Moortgat";
                beerInfo = "Duvel is een Belgisch blond speciaalbier gebaseerd op de duivel van Brouwerij Duvel Moortgat uit Puurs-Sint-Amands. Het heeft een hoge gisting en wordt nog eens hergist op fles. Het alcoholpercentage bedraagt 8,5%.";
                beerPercentage = "8.5";
                beerYear = "1871";
                imgBeer.setImageResource(R.drawable.duvel);
                break;
            case "tripel karmeliet":
                beerName = "Tripel Karmeliet";
                beerBrewery = "Brouwerij Bosteels";
                beerInfo = "Tripel Karmeliet is een Belgisch bier dat in 1996 op de markt werd gebracht. Het is een tripel (8,4% in volume) waarin behalve gerst ook tarwe en haver zijn verwerkt.";
                beerPercentage = "8.4";
                beerYear = "1996";
                imgBeer.setImageResource(R.drawable.tripel_karmeliet);
                break;
            case "jupiler":
                beerName = "Jupiler";
                beerBrewery = "Piedboeuf";
                beerInfo = "Jupiler is een Belgisch pilsbier met een marktaandeel van zo'n 40% (2019) in het eigen land. Het bier wordt gebrouwen door brouwerij Piedbœuf (onderdeel van Anheuser-Busch InBev) in het plaatsje Jupille-sur-Meuse, een deelgemeente van Luik. Het complex ligt aan beide zijden van de spoorlijn Maastricht-Luik.\n" +
                        "\n" +
                        "De naam Jupiler is in 1966 gevormd met het achtervoegsel -er bij de plaatsnaam (zoals in het Duits en soms in het Nederlands een adjectief voor plaatsnamen gevormd wordt, zoals in Aachener of Maastrichter).\n" +
                        "\n" +
                        "Het embleem van Jupiler is altijd al een stier geweest. In 2006 werden zowel de glazen, als de flesjes van Jupiler vernieuwd. Het uiterlijk van het embleem en de lay-out werd lichtjes veranderd (de stier staat nu op zijn 4 poten in plaats van enkel op zijn achterste poten) en de tekst \"Jupiler\" staat nu verticaal op het drinkglas. De flesjes zijn bruin, deze kleur wordt gebruikt door de brouwer om de nadelige invloed van zonlicht op de kwaliteit van het bier te beperken.\n" +
                        "\n" +
                        "De slogan van Jupiler is \"Mannen weten waarom\".";
                beerPercentage = "5.2";
                beerYear = "1966";
                imgBeer.setImageResource(R.drawable.jupiler);
                break;
            case "cara":
                beerName = "Cara Pils";
                beerBrewery = "Wisselend";
                beerInfo = "Cara Pils is een merk Belgisch bier, dat door de supermarktketen Colruyt op de markt wordt gebracht. Het is een blond bier met een alcoholpercentage variërend van 4,4% tot 5,2%, dat zich uitdrukkelijk positioneert in het ondersegment van de markt.";
                beerPercentage = "4.4-5.2";
                beerYear = "1985";
                imgBeer.setImageResource(R.drawable.cara);
                break;
        }

        txtBeer.setText(beerName);
        txtBrewery.setText(beerBrewery);
        txtAlcohol.setText(beerPercentage);
        txtYear.setText(beerYear);
    }
}