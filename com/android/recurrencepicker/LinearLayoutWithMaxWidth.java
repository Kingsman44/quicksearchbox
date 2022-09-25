package com.android.recurrencepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: PG */
public class LinearLayoutWithMaxWidth extends LinearLayout {
    public LinearLayoutWithMaxWidth(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        View.MeasureSpec.getSize(i);
        int i3 = WeekButton.f16612a;
        super.onMeasure(i, i2);
    }

    public LinearLayoutWithMaxWidth(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LinearLayoutWithMaxWidth(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
