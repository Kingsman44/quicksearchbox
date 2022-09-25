package com.google.android.apps.gsa.staticplugins.opa.p8592ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ui.ListViewPager */
/* compiled from: PG */
public class ListViewPager extends ViewPager {
    public ListViewPager(Context context) {
        super(context);
    }

    /* renamed from: y */
    private static final int m188265y(View view, int i) {
        view.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
        return View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824);
    }

    public final void onMeasure(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt instanceof TabLayout) {
                i4 = m188265y(childAt, i);
                if (i3 != 0) {
                    break;
                }
                i3 = 0;
            } else if (childAt instanceof LinearLayout) {
                i3 = m188265y(childAt, i);
                if (i4 != 0) {
                    break;
                }
                i4 = 0;
            } else {
                continue;
            }
        }
        super.onMeasure(i, i3 + i4);
    }

    public ListViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
