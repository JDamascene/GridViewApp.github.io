package com.example.emobilis.gridmoviecharlie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    ImageView imgPoster;
    TextView txtTitle,txtYear,txtDescription;

    int[] images = {
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4,
            R.drawable.img_5,
            R.drawable.img_6,
            R.drawable.img_7,
            R.drawable.img_8,
            R.drawable.img_9,
            R.drawable.img_10,
            R.drawable.img_11,
            R.drawable.img_12,
            R.drawable.img_13,
            R.drawable.img_14,
            R.drawable.img_15,
            R.drawable.img_17,
            R.drawable.img_18,
            R.drawable.img_19,
            R.drawable.img_20
    };

    String[] MovieDescription = {
            "Awesome thriller film of the year",
            "Cool drama movie and fun too",
            "Oooo The action in this stuff",
            "One of the best Si-Fi's of all time",
            "I mean who doesn't like the lord of the rings maan...",
            "For the business heads",
            "Geeky stuff and cool action",
            "The old stuff love classics",
            "And the legendary star wars",
            "Morgan just gives life to this epic movie",
            "MK Ultra sort of thing",
            "A glass for the clasics",
            "Hate crime",
            "Another DC super hero",
            "No comments",
            "Detectivy stuff",
            "Awesome oldies",
            "Cool classicals",
            "Teens, they never seize to impress",
            "The ring stuff, again! :-("

    };

    String[] MovieYear = {"2001", "2005", "2010", "2009", "2016", "1998", "2017", "1879", "1773", "2000", "2001", "2005", "2011", "2005", "2018", "1668", "2018", "1999", "1973", "2005"};
    String[] MovieTitles = {"The Shaw Shank", "Godfather", "Dark Night", "12 Angry men", "Schindler", "Lord of The Rings", "The Good, Bad And Ugly", "Fight Club", "Lord Of Rings", "Forest gump", "Empire Strikes Back", "Inception", "Lord Of The Rings II", "Good Fellas", "The Matrix", "China", "Start", "Seven","The Silence Of Lambs","City Of GOD"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgPoster = findViewById(R.id.imgMoviePic);
        txtTitle = findViewById(R.id.txtMovieName);
        txtYear = findViewById(R.id.txtMoviePrice);
        txtDescription = findViewById(R.id.txtDecription);

        //Receiving Intent info
        int position = getIntent().getIntExtra("data",0);
        imgPoster.setImageResource(images[position]);
        txtTitle.setText(MovieTitles[position]);
        txtYear.setText(MovieYear[position]);
        txtDescription.setText(MovieDescription[position]);



    }
}
