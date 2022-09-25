package com.google.android.apps.gsa.shared.p7148ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.shared.ui.RingProgressBar */
/* compiled from: PG */
public class RingProgressBar extends ProgressBar {
    public RingProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int min = Math.min(getMeasuredHeight(), getMeasuredWidth());
        setMeasuredDimension(min, min);
    }

    public RingProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RingProgressBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style.RingProgressBarStyle);
    }

    public RingProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
