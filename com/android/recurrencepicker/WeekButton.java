package com.android.recurrencepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ToggleButton;

/* compiled from: PG */
public class WeekButton extends ToggleButton {

    /* renamed from: a */
    public static final /* synthetic */ int f16612a = 0;

    public WeekButton(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        if (measuredHeight > 0 && measuredWidth > 0) {
            if (measuredWidth < measuredHeight) {
                if (View.MeasureSpec.getMode(getMeasuredHeightAndState()) != 1073741824) {
                    measuredHeight = measuredWidth;
                    setMeasuredDimension(measuredHeight, measuredWidth);
                }
            } else if (measuredHeight < measuredWidth && View.MeasureSpec.getMode(getMeasuredWidthAndState()) != 1073741824) {
                measuredWidth = measuredHeight;
                setMeasuredDimension(measuredHeight, measuredWidth);
            }
        }
        int i3 = measuredWidth;
        measuredWidth = measuredHeight;
        measuredHeight = i3;
        setMeasuredDimension(measuredHeight, measuredWidth);
    }

    public WeekButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WeekButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
