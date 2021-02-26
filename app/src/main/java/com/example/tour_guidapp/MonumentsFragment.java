
package com.example.tour_guidapp;

import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;


import androidx.fragment.app.Fragment;

import java.util.ArrayList;


/**
 * {@link Fragment} that displays a list of number vocabulary words.
 */
public class MonumentsFragment extends Fragment {


    public MonumentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word(R.string.number_one, R.string.Ata_Turk, R.drawable.mon_1, R.string.phone_numbers_1));

        words.add(new Word(R.string.killed_in_GPW, R.string.killed_in_GPW_text, R.drawable.mon_2, R.string.phone_numbers_1));

        words.add(new Word(R.string.patriotic_war_text, R.string.patriotic_war_text, R.drawable.mon_3, R.string.phone_numbers_1));



        words.add(new Word(R.string.baken_kydykeyeva_text, R.string.baken_kydykeyeva, R.drawable.mon_5, R.string.phone_numbers_1));

        words.add(new Word(R.string.legendary_text, R.string.legendary, R.drawable.mon_6, R.string.phone_numbers_1));

        words.add(new Word(R.string.iuca_text, R.string.iuca, R.drawable.mon_7, R.string.phone_numbers_1));

        words.add(new Word(R.string.tokmok_text, R.string.tokmok,
                R.drawable.mon_8, R.string.phone_numbers_1));

        words.add(new Word(R.string.tokmok_text, R.string.tokmok,
                R.drawable.mon_9, R.string.phone_numbers_1));

        words.add(new Word(R.string.burana_text, R.string.burana,
                R.drawable.mon_10, R.string.phone_numbers_1));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.tan_background);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        LinearLayout ll1 = (LinearLayout) rootView.findViewById(R.id.liner1);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                ll1.setVisibility(View.VISIBLE);
            }
        });

        // Set a click listener to play the audio when the list item is clicked on


        return rootView;
    }


}
