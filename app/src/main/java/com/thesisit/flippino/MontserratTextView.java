package com.thesisit.flippino;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Carlos on 28/03/2016.
 */
public class MontserratTextView extends TextView {

    public MontserratTextView(Context context) {
        super(context);

        applyCustomFont(context);
    }

    public MontserratTextView(Context context, AttributeSet attrs) {
        super(context, attrs);

        applyCustomFont(context);
    }

    public MontserratTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("fonts/montserrat_black.otf", context);
        setTypeface(customFont);
    }
}