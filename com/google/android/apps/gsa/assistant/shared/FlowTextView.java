package com.google.android.apps.gsa.assistant.shared;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: PG */
public class FlowTextView extends TextView {
    public FlowTextView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if ((getMeasuredWidthAndState() & 16777216) != 16777216) {
            Layout layout = getLayout();
            int lineCount = layout.getLineCount() - 1;
            if (lineCount != -1 && layout.getEllipsisCount(lineCount) != 0) {
                setMeasuredDimension(getMeasuredWidth() | 16777216, getMeasuredHeightAndState());
            }
        }
    }

    public FlowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FlowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FlowTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
