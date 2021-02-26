
package com.example.tour_guidapp;

public class Word {


    private int mDefaultTranslationId;

    private int mMiwokTranslationId;

    private int mPhoneResourceId;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;



    public Word(int defaultTranslationId, int miwokTranslationId, int imageResourceId, int phoneResourceId) {
        mDefaultTranslationId = defaultTranslationId;
        mMiwokTranslationId = miwokTranslationId;
        mImageResourceId = imageResourceId;
        mPhoneResourceId = phoneResourceId;
    }


    public int getDefaultTranslationId() {
        return mDefaultTranslationId;
    }

    public int getMiwokTranslationId() {
        return mMiwokTranslationId;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }


    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


    public int getPhoneResourceId() {
        return mPhoneResourceId;
    }
}