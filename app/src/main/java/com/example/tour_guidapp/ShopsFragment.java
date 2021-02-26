/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.tour_guidapp;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of family vocabulary words.
 */
public class ShopsFragment extends Fragment {

    /** Handles playback of all the sound files */
    private MediaPlayer mMediaPlayer;

    /** Handles audio focus when playing a sound file */
    private AudioManager mAudioManager;


    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
        }
    };

    public ShopsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create and setup the {@link AudioManager} to request audio focus
        mAudioManager = (AudioManager) getActivity().getSystemService(Context.AUDIO_SERVICE);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(R.string.shop_1_desc, R.string.shop_1_globus, R.drawable.shop_1_gl, R.string.phone_numbers_1));

        words.add(new Word(R.string.shop_2_desc, R.string.shop_2_frunze, R.drawable.shop_2_fr, R.string.phone_numbers_2));

        words.add(new Word(R.string.shop_3_desc, R.string.shop_3_narodnyi, R.drawable.shop_3_nar, R.string.phone_numbers_3));

        words.add(new Word(R.string.shop_3_desc, R.string.shop_4_jyraf, R.drawable.shop_4_jir, R.string.phone_numbers_4));

        words.add(new Word(R.string.shop_4_desc, R.string.shop_5_kovchek, R.drawable.shop_5_kov, R.string.phone_numbers_5));

        words.add(new Word(R.string.shop_5_desc, R.string.shop_6_kovchek, R.drawable.shop_5_kov, R.string.phone_numbers_6));

        words.add(new Word(R.string.shop_6_desc, R.string.shop_6_kovchek, R.drawable.shop_5_kov, R.string.phone_numbers_7));

        words.add(new Word(R.string.shop_7_desc, R.string.shop_6_kovchek, R.drawable.shop_5_kov, R.string.phone_numbers_8));

        words.add(new Word(R.string.shop_1_desc, R.string.shop_6_kovchek, R.drawable.shop_5_kov, R.string.phone_numbers_8));

        words.add(new Word(R.string.shop_6_desc, R.string.shop_6_kovchek, R.drawable.shop_5_kov, R.string.phone_numbers_8));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on


        return rootView;
    }

    @Override
    public void onStop() {
        super.onStop();

    }
}
