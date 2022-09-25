package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.support.p033v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
public class SelectionBadge extends AppCompatCheckBox {
    public SelectionBadge(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.max(getSuggestedMinimumWidth(), View.MeasureSpec.getSize(i)), mode), View.MeasureSpec.makeMeasureSpec(Math.max(getSuggestedMinimumHeight(), View.MeasureSpec.getSize(i2)), mode2));
    }
}
