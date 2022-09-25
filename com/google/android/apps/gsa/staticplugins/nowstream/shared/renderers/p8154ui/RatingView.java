package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.p8154ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.ui.RatingView */
/* compiled from: PG */
public class RatingView extends LinearLayout {

    /* renamed from: b */
    public static final /* synthetic */ int f294758b = 0;

    /* renamed from: c */
    private static final int[] f294759c;

    /* renamed from: a */
    public final ImageView[] f294760a = new ImageView[5];

    static {
        int[] iArr = new int[5];
        f294759c = iArr;
        iArr[0] = R.drawable.quantum_ic_sentiment_very_dissatisfied_grey600_48;
        iArr[1] = R.drawable.quantum_ic_sentiment_dissatisfied_grey600_48;
        iArr[2] = R.drawable.quantum_ic_sentiment_neutral_grey600_48;
        iArr[3] = R.drawable.quantum_ic_sentiment_satisfied_grey600_48;
        iArr[4] = R.drawable.quantum_ic_sentiment_very_satisfied_grey600_48;
    }

    public RatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int b = (int) C91115n.m148870b(48.0f, context);
        int i = 0;
        while (i < 5) {
            ImageView imageView = new ImageView(context);
            this.f294760a[i] = imageView;
            imageView.setImageResource(f294759c[i]);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(b, b, 1.0f));
            i++;
            imageView.setContentDescription(context.getString(R.string.rating_views_content_description, new Object[]{Integer.valueOf(i)}));
            addView(imageView);
        }
    }
}
