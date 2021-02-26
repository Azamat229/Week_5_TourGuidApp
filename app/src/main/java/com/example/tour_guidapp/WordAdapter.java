package com.example.tour_guidapp;
import android.content.Context;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private Context context;


    private int mColorResourceId;


    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
        this.context = context;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);


        }


        Word currentWord = getItem(position);

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslationId());


        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.text_phone);
        phoneTextView.setText(currentWord.getPhoneResourceId());


        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslationId());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }


        ImageButton button_for_hide = (ImageButton) listItemView.findViewById(R.id.button_for_hide);
        LinearLayout linearLayout1 = (LinearLayout) listItemView.findViewById(R.id.liner1);
        LinearLayout linearLayout2 = (LinearLayout) listItemView.findViewById(R.id.liner2);
        LinearLayout linearLayout3 = (LinearLayout) listItemView.findViewById(R.id.liner3);


        button_for_hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (linearLayout1.getVisibility() == View.VISIBLE) {
                    linearLayout1.setVisibility(View.GONE);
                    linearLayout2.setVisibility(View.GONE);
                    linearLayout3.setVisibility(View.GONE);
                } else if (linearLayout1.getVisibility() == View.GONE) {
                    linearLayout1.setVisibility(View.VISIBLE);
                    linearLayout2.setVisibility(View.VISIBLE);
                    linearLayout3.setVisibility(View.VISIBLE);

                }


            }
        });
        TextView t2 = (TextView) listItemView.findViewById(R.id.default_text_view2);
        t2.setText(Html.fromHtml(
                "Location " +
                        "<a href=\"https://www.google.com/maps/place/Tokmok/@42.8169153,75.2239817,12z/data=!3m1!4b1!4m5!3m4!1s0x389bf59a31a24119:0xb84831fb5ca4a513!8m2!3d42.8257618!4d75.2901807\">" +
                        "Kyrgyzstan, Tokmok" +
                        "</a>"));
        t2.setMovementMethod(LinkMovementMethod.getInstance());


        return listItemView;


    }
}