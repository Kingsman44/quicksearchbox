package com.google.android.libraries.lens.view.common;

import android.content.Context;
import android.support.p033v7.widget.AppCompatTextView;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
public final class CompactTextView extends AppCompatTextView {
    public CompactTextView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout != null && layout.getLineCount() > 1) {
            int lineCount = layout.getLineCount();
            float f = 0.0f;
            for (int i3 = 0; i3 < lineCount; i3++) {
                if (layout.getLineWidth(i3) > f) {
                    f = layout.getLineWidth(i3);
                }
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) Math.ceil((double) f)) + getCompoundPaddingLeft() + getCompoundPaddingRight(), View.MeasureSpec.getMode(i)), i2);
        }
    }

    public CompactTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CompactTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
