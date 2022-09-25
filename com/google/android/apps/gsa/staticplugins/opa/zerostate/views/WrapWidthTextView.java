package com.google.android.apps.gsa.staticplugins.opa.zerostate.views;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: PG */
public class WrapWidthTextView extends TextView {
    public WrapWidthTextView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout != null) {
            int lineCount = layout.getLineCount();
            float f = 0.0f;
            for (int i3 = 0; i3 < lineCount; i3++) {
                if (layout.getLineWidth(i3) > f) {
                    f = layout.getLineWidth(i3);
                }
            }
            setMeasuredDimension(((int) Math.ceil((double) f)) + getCompoundPaddingLeft() + getCompoundPaddingRight(), getMeasuredHeight());
        }
    }

    public WrapWidthTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
