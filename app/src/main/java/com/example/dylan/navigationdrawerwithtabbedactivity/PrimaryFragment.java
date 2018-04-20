package com.example.dylan.navigationdrawerwithtabbedactivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PrimaryFragment extends Fragment {

    public static PrimaryFragment newInstance() {
        PrimaryFragment fragment = new PrimaryFragment();
        return fragment;
    }

    public PrimaryFragment() {
    }

    ImageView Game1Away;
    ImageView Game1Home;
    ImageView Game2Away;
    ImageView Game2Home;
    ImageView Game3Away;
    ImageView Game3Home;
    ImageView Game4Away;
    ImageView Game4Home;

    ImageView Game5Away;
    ImageView Game5Home;
    ImageView Game6Away;
    ImageView Game6Home;
    ImageView Game7Away;
    ImageView Game7Home;
    ImageView Game8Away;
    ImageView Game8Home;

    ImageView Game9Away;
    ImageView Game9Home;
    ImageView Game10Away;
    ImageView Game10Home;
    ImageView Game11Away;
    ImageView Game11Home;
    ImageView Game12Away;
    ImageView Game12Home;

    ImageView Game13Away;
    ImageView Game13Home;
    ImageView Game14Away;
    ImageView Game14Home;
    ImageView Game15Away;
    ImageView Game15Home;
    ImageView Game16Away;
    ImageView Game16Home;
    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.primary_fragment, container, false);

        Game1Away = (ImageView) rootView.findViewById(R.id.Game1Away);
        Game1Home = (ImageView) rootView.findViewById(R.id.Game1Home);
        Game2Away = (ImageView) rootView.findViewById(R.id.Game2Away);
        Game2Home = (ImageView) rootView.findViewById(R.id.Game2Home);
        Game3Away = (ImageView) rootView.findViewById(R.id.Game3Away);
        Game3Home = (ImageView) rootView.findViewById(R.id.Game3Home);
        Game4Away = (ImageView) rootView.findViewById(R.id.Game4Away);
        Game4Home = (ImageView) rootView.findViewById(R.id.Game4Home);

        Game5Away = (ImageView) rootView.findViewById(R.id.Game5Away);
        Game5Home = (ImageView) rootView.findViewById(R.id.Game5Home);
        Game6Away = (ImageView) rootView.findViewById(R.id.Game6Away);
        Game6Home = (ImageView) rootView.findViewById(R.id.Game6Home);
        Game7Away = (ImageView) rootView.findViewById(R.id.Game7Away);
        Game7Home = (ImageView) rootView.findViewById(R.id.Game7Home);
        Game8Away = (ImageView) rootView.findViewById(R.id.Game8Away);
        Game8Home = (ImageView) rootView.findViewById(R.id.Game8Home);

        Game9Away = (ImageView) rootView.findViewById(R.id.Game9Away);
        Game9Home = (ImageView) rootView.findViewById(R.id.Game9Home);
        Game10Away = (ImageView) rootView.findViewById(R.id.Game10Away);
        Game10Home = (ImageView) rootView.findViewById(R.id.Game10Home);
        Game11Away = (ImageView) rootView.findViewById(R.id.Game11Away);
        Game11Home = (ImageView) rootView.findViewById(R.id.Game11Home);
        Game12Away = (ImageView) rootView.findViewById(R.id.Game12Away);
        Game12Home = (ImageView) rootView.findViewById(R.id.Game12Home);

        Game13Away = (ImageView) rootView.findViewById(R.id.Game13Away);
        Game13Home = (ImageView) rootView.findViewById(R.id.Game13Home);
        Game14Away = (ImageView) rootView.findViewById(R.id.Game14Away);
        Game14Home = (ImageView) rootView.findViewById(R.id.Game14Home);
        Game15Away = (ImageView) rootView.findViewById(R.id.Game15Away);
        Game15Home = (ImageView) rootView.findViewById(R.id.Game15Home);
        Game16Away = (ImageView) rootView.findViewById(R.id.Game16Away);
        Game16Home = (ImageView) rootView.findViewById(R.id.Game16Home);

        tv = (TextView) rootView.findViewById(R.id.textView2);

        Game1Away.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Game1Away.setImageResource(R.drawable.icon_panthers_2);
                Game1Home.setImageResource(R.drawable.icon_broncos_1);
            }
        });

        Game1Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Game1Away.setImageResource(R.drawable.icon_panthers_1);
                Game1Home.setImageResource(R.drawable.icon_broncos_2);;
            }
        });

        Game2Away.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Game2Away.setImageResource(R.drawable.icon_vikings_2);
                Game2Home.setImageResource(R.drawable.icon_titans_1);
            }
        });

        Game2Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Game2Away.setImageResource(R.drawable.icon_vikings_1);
                Game2Home.setImageResource(R.drawable.icon_titans_2);
            }
        });
        Game3Away.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Game3Away.setImageResource(R.drawable.icon_bears_2);
                Game3Home.setImageResource(R.drawable.icon_texans_1);
            }
        });

        Game3Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Game3Away.setImageResource(R.drawable.icon_bears_1);
                Game3Home.setImageResource(R.drawable.icon_texans_2);
            }
        });
        Game4Away.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Game4Away.setImageResource(R.drawable.icon_browns_2);
                Game4Home.setImageResource(R.drawable.icon_eagles_1);
            }
        });

        Game4Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Game4Away.setImageResource(R.drawable.icon_browns_1);
                Game4Home.setImageResource(R.drawable.icon_eagles_2);
            }
        });

        Game5Away.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Game5Away.setImageResource(R.drawable.icon_buffalos_2);
                Game5Home.setImageResource(R.drawable.icon_ravens_1);
            }
        });

        Game5Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Game5Away.setImageResource(R.drawable.icon_buffalos_1);
                Game5Home.setImageResource(R.drawable.icon_ravens_2);
            }
        });

        Game6Away.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Game6Away.setImageResource(R.drawable.icon_chargers_2);
                Game6Home.setImageResource(R.drawable.icon_chiefs_1);
            }
        });

        Game6Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Game6Away.setImageResource(R.drawable.icon_chargers_1);
                Game6Home.setImageResource(R.drawable.icon_chiefs_2);
            }
        });

        Game7Away.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Game7Away.setImageResource(R.drawable.icon_raiders_2);
                Game7Home.setImageResource(R.drawable.icon_saints_1);
            }
        });

        Game7Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Game7Away.setImageResource(R.drawable.icon_raiders_1);
                Game7Home.setImageResource(R.drawable.icon_saints_2);
            }
        });

        Game8Away.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Game8Away.setImageResource(R.drawable.icon_braccaneers_2);
                Game8Home.setImageResource(R.drawable.icon_falcons_1);
            }
        });

        Game8Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Game8Away.setImageResource(R.drawable.icon_braccaneers_1);
                Game8Home.setImageResource(R.drawable.icon_falcons_2);
            }
        });

        Game9Away.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Game9Away.setImageResource(R.drawable.icon_bengals_2);
                Game9Home.setImageResource(R.drawable.icon_jets_1);
            }
        });

        Game9Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Game9Away.setImageResource(R.drawable.icon_bengals_1);
                Game9Home.setImageResource(R.drawable.icon_jets_2);
            }
        });

        Game10Away.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Game10Away.setImageResource(R.drawable.icon_packers_2);
                Game10Home.setImageResource(R.drawable.icon_jaguars_1);
            }
        });

        Game10Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Game10Away.setImageResource(R.drawable.icon_packers_1);
                Game10Home.setImageResource(R.drawable.icon_jaguars_2);
            }
        });


        Game11Away.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Game11Away.setImageResource(R.drawable.icon_dolphins_2);
                Game11Home.setImageResource(R.drawable.icon_seahawks_1);
            }
        });

        Game11Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Game11Away.setImageResource(R.drawable.icon_dolphins_1);
                Game11Home.setImageResource(R.drawable.icon_seahawks_2);
            }
        });

        Game12Away.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Game12Away.setImageResource(R.drawable.icon_giants_2);
                Game12Home.setImageResource(R.drawable.icon_cowboys_1);
            }
        });

        Game12Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Game12Away.setImageResource(R.drawable.icon_giants_1);
                Game12Home.setImageResource(R.drawable.icon_cowboys_2);
            }
        });

        Game13Away.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Game13Away.setImageResource(R.drawable.icon_lions_2);
                Game13Home.setImageResource(R.drawable.icon_colts_1);
            }
        });

        Game13Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Game13Away.setImageResource(R.drawable.icon_lions_1);
                Game13Home.setImageResource(R.drawable.icon_colts_2);
            }
        });

        Game14Away.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Game14Away.setImageResource(R.drawable.icon_patriots_2);
                Game14Home.setImageResource(R.drawable.icon_cardinals_1);
            }
        });

        Game14Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Game14Away.setImageResource(R.drawable.icon_patriots_1);
                Game14Home.setImageResource(R.drawable.icon_cardinals_2);
            }
        });

        Game15Away.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Game15Away.setImageResource(R.drawable.icon_steelers_2);
                Game15Home.setImageResource(R.drawable.icon_redskins_1);
            }
        });

        Game15Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Game15Away.setImageResource(R.drawable.icon_steelers_1);
                Game15Home.setImageResource(R.drawable.icon_redskins_2);
            }
        });

        Game16Away.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Game16Away.setImageResource(R.drawable.icon_rams_2);
                Game16Home.setImageResource(R.drawable.icon_49ers_1);
            }
        });

        Game16Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Game16Away.setImageResource(R.drawable.icon_rams_1);
                Game16Home.setImageResource(R.drawable.icon_49ers_2);
            }
        });
        return rootView;
    }
}
