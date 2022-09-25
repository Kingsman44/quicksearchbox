package com.google.android.libraries.gsa.imageviewer.reviewstars;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import java.util.Locale;

/* compiled from: PG */
public class ReviewStarsView extends LinearLayout {
    public ReviewStarsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo28190a(float f) {
        int i;
        int i2 = 0;
        int min = Math.min(10, Math.max(0, (int) (f + f + 0.5f)));
        while (true) {
            i = min / 2;
            if (i2 >= i) {
                break;
            }
            ((ImageView) getChildAt(i2)).setImageResource(R.drawable.review_star_orange);
            i2++;
        }
        if (min % 2 == 1) {
            ImageView imageView = (ImageView) getChildAt(i);
            imageView.setImageResource(R.drawable.review_star_half);
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                imageView.setScaleX(-1.0f);
            }
        }
        for (int i3 = (min + 1) / 2; i3 < 5; i3++) {
            ((ImageView) getChildAt(i3)).setImageResource(R.drawable.review_star_gray);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        post(new C22829a(this));
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        setOrientation(0);
        setGravity(17);
        for (int i = 0; i < 5; i++) {
            ImageView imageView = new ImageView(getContext());
            imageView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            imageView.setImageResource(R.drawable.review_star_gray);
            addView(imageView);
        }
    }
}
