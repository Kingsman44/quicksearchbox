package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.WrapContentHeightViewPager */
/* compiled from: PG */
public final class WrapContentHeightViewPager extends ViewPager {
    public WrapContentHeightViewPager(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null && layoutParams.height == -2 && getChildCount() != 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                i3 = Math.max(i3, childAt.getMeasuredHeight());
            }
            setMeasuredDimension(View.MeasureSpec.getSize(i), i3);
        }
    }

    public WrapContentHeightViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
