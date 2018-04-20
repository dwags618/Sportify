package com.example.dylan.navigationdrawerwithtabbedactivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class UpdatesFragment extends Fragment {

    public static UpdatesFragment newInstance() {
        UpdatesFragment fragment = new UpdatesFragment();
        return fragment;
    }

    public UpdatesFragment() {
    }

    ImageView Game1Away;
    ImageView Game1Home;
    ImageView Game2Away;
    ImageView Game2Home;
    ImageView Game3Away;
    ImageView Game3Home;
    ImageView Game4Away;
    ImageView Game4Home;
    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.updates_fragment, container, false);

        Game1Away = (ImageView) rootView.findViewById(R.id.Game1Away);
        Game1Home = (ImageView) rootView.findViewById(R.id.Game1Home);
        Game2Away = (ImageView) rootView.findViewById(R.id.Game2Away);
        Game2Home = (ImageView) rootView.findViewById(R.id.Game2Home);
        Game3Away = (ImageView) rootView.findViewById(R.id.Game3Away);
        Game3Home = (ImageView) rootView.findViewById(R.id.Game3Home);
        Game4Away = (ImageView) rootView.findViewById(R.id.Game4Away);
        Game4Home = (ImageView) rootView.findViewById(R.id.Game4Home);

        tv = (TextView) rootView.findViewById(R.id.textView2);

        Game1Away.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Game1Away.setImageResource(R.drawable.bluecheese);
                Game1Home.setImageResource(R.drawable.cheese);
            }
        });

        Game1Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Game1Home.setImageResource(R.drawable.bluecheese);
                Game1Away.setImageResource(R.drawable.cheese);
            }
        });

        Game2Away.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Game2Away.setImageResource(R.drawable.bluecheese);
                Game2Home.setImageResource(R.drawable.cheese);
            }
        });

        Game2Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Game2Home.setImageResource(R.drawable.bluecheese);
                Game2Away.setImageResource(R.drawable.cheese);
            }
        });
        Game3Away.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Game3Away.setImageResource(R.drawable.bluecheese);
                Game3Home.setImageResource(R.drawable.cheese);
            }
        });

        Game3Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Game3Home.setImageResource(R.drawable.bluecheese);
                Game3Away.setImageResource(R.drawable.cheese);
            }
        });
        Game4Away.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Game4Away.setImageResource(R.drawable.bluecheese);
                Game4Home.setImageResource(R.drawable.cheese);
            }
        });

        Game4Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Game4Home.setImageResource(R.drawable.bluecheese);
                Game4Away.setImageResource(R.drawable.cheese);
            }
        });
        return rootView;
    }
}
