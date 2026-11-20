package com.example.explorechina;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private CustomAdapter adapter;
    private List<Attraction> attractions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.attractions_list);
        attractions = new ArrayList<>();

        // Initialize attractions data
        initializeAttractions();

        // Create and set adapter
        adapter = new CustomAdapter(this, attractions);
        listView.setAdapter(adapter);

        // Handle list item clicks
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Attraction attraction = attractions.get(position);
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("attraction_id", attraction.getId());
            intent.putExtra("attraction_title", attraction.getTitle());
            intent.putExtra("attraction_description", attraction.getDescription());
            intent.putExtra("attraction_location", attraction.getLocation());
            intent.putExtra("attraction_ticket", attraction.getTicketPrice());
            intent.putExtra("attraction_hours", attraction.getOpeningHours());
            intent.putExtra("attraction_cultural", attraction.getCulturalInfo());
            intent.putExtra("attraction_image", attraction.getImageResId());
            startActivity(intent);
        });
    }

    private void initializeAttractions() {
        attractions.add(new Attraction(
            1,
            getString(R.string.great_wall_title),
            getString(R.string.great_wall_description),
            getString(R.string.great_wall_location),
            getString(R.string.great_wall_ticket),
            getString(R.string.great_wall_hours),
            getString(R.string.great_wall_cultural),
            R.drawable.ic_great_wall
        ));

        attractions.add(new Attraction(
            2,
            getString(R.string.forbidden_city_title),
            getString(R.string.forbidden_city_description),
            getString(R.string.forbidden_city_location),
            getString(R.string.forbidden_city_ticket),
            getString(R.string.forbidden_city_hours),
            getString(R.string.forbidden_city_cultural),
            R.drawable.ic_forbidden_city
        ));

        attractions.add(new Attraction(
            3,
            getString(R.string.summer_palace_title),
            getString(R.string.summer_palace_description),
            getString(R.string.summer_palace_location),
            getString(R.string.summer_palace_ticket),
            getString(R.string.summer_palace_hours),
            getString(R.string.summer_palace_cultural),
            R.drawable.ic_summer_palace
        ));

        attractions.add(new Attraction(
            4,
            getString(R.string.terracotta_army_title),
            getString(R.string.terracotta_army_description),
            getString(R.string.terracotta_army_location),
            getString(R.string.terracotta_army_ticket),
            getString(R.string.terracotta_army_hours),
            getString(R.string.terracotta_army_cultural),
            R.drawable.ic_terracotta_army
        ));

        attractions.add(new Attraction(
            5,
            getString(R.string.west_lake_title),
            getString(R.string.west_lake_description),
            getString(R.string.west_lake_location),
            getString(R.string.west_lake_ticket),
            getString(R.string.west_lake_hours),
            getString(R.string.west_lake_cultural),
            R.drawable.ic_west_lake
        ));

        attractions.add(new Attraction(
            6,
            getString(R.string.temple_heaven_title),
            getString(R.string.temple_heaven_description),
            getString(R.string.temple_heaven_location),
            getString(R.string.temple_heaven_ticket),
            getString(R.string.temple_heaven_hours),
            getString(R.string.temple_heaven_cultural),
            R.drawable.ic_temple_heaven
        ));

        attractions.add(new Attraction(
            7,
            getString(R.string.the_bund_title),
            getString(R.string.the_bund_description),
            getString(R.string.the_bund_location),
            getString(R.string.the_bund_ticket),
            getString(R.string.the_bund_hours),
            getString(R.string.the_bund_cultural),
            R.drawable.ic_the_bund
        ));

        attractions.add(new Attraction(
            8,
            getString(R.string.zhangjiajie_title),
            getString(R.string.zhangjiajie_description),
            getString(R.string.zhangjiajie_location),
            getString(R.string.zhangjiajie_ticket),
            getString(R.string.zhangjiajie_hours),
            getString(R.string.zhangjiajie_cultural),
            R.drawable.ic_zhangjiajie
        ));

        attractions.add(new Attraction(
            9,
            getString(R.string.potala_palace_title),
            getString(R.string.potala_palace_description),
            getString(R.string.potala_palace_location),
            getString(R.string.potala_palace_ticket),
            getString(R.string.potala_palace_hours),
            getString(R.string.potala_palace_cultural),
            R.drawable.ic_potala_palace
        ));
    }
}
