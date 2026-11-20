package com.example.explorechina;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    private ImageView attractionImage;
    private TextView attractionTitle, attractionDescription, attractionLocation;
    private TextView attractionTicket, attractionHours, attractionCultural;
    private RatingBar ratingBar;
    private Button backButton;
    // No video support: only image and text
    private SharedPreferences sharedPreferences;
    private int attractionId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Initialize views
        attractionImage = findViewById(R.id.detail_attraction_image);
        attractionTitle = findViewById(R.id.detail_attraction_title);
        attractionDescription = findViewById(R.id.detail_attraction_description);
        attractionLocation = findViewById(R.id.detail_attraction_location);
        attractionTicket = findViewById(R.id.detail_attraction_ticket);
        attractionHours = findViewById(R.id.detail_attraction_hours);
        attractionCultural = findViewById(R.id.detail_attraction_cultural);
        ratingBar = findViewById(R.id.detail_rating_bar);
        backButton = findViewById(R.id.detail_back_button);
        // No video handling required

        sharedPreferences = getSharedPreferences("AttractionRatings", MODE_PRIVATE);

        // Get data from intent
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            attractionId = extras.getInt("attraction_id");
            String title = extras.getString("attraction_title");
            String description = extras.getString("attraction_description");
            String location = extras.getString("attraction_location");
            String ticket = extras.getString("attraction_ticket");
            String hours = extras.getString("attraction_hours");
            String cultural = extras.getString("attraction_cultural");
            int imageId = extras.getInt("attraction_image");

            // Set data to views
            attractionImage.setImageResource(imageId);
            attractionTitle.setText(title);
            attractionDescription.setText(description);
            attractionLocation.setText(getString(R.string.location_label) + ": " + location);
            attractionTicket.setText(getString(R.string.ticket_label) + ": " + ticket);
            attractionHours.setText(getString(R.string.hours_label) + ": " + hours);
            attractionCultural.setText(cultural);

            // No video handling required

            // Load saved rating
            float savedRating = sharedPreferences.getFloat("attraction_" + attractionId, 0f);
            ratingBar.setRating(savedRating);
        }

        // Save rating when user changes it
        ratingBar.setOnRatingBarChangeListener((ratingBar, rating, fromUser) -> {
            if (fromUser) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putFloat("attraction_" + attractionId, rating);
                editor.apply();
            }
        });

        // Back button
        backButton.setOnClickListener(v -> finish());
    }
}
