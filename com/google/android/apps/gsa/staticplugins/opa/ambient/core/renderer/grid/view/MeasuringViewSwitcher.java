package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.grid.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ViewSwitcher;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public class MeasuringViewSwitcher extends ViewSwitcher {
    public MeasuringViewSwitcher(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo95654a(int i, int i2, int i3, boolean z) {
        int i4 = 0;
        while (i4 < getChildCount()) {
            View childAt = getChildAt(i4);
            int i5 = i4 == 0 ? i2 : i;
            C58976aa aaVar = C58975e.f156826a;
            if (childAt.getMeasuredWidth() != View.MeasureSpec.getSize(i5)) {
                measureChildWithMargins(childAt, i5, 0, i3, 0);
            }
            if ((childAt instanceof MeasuringViewSwitcher) && getDisplayedChild() == i4) {
                ((MeasuringViewSwitcher) childAt).mo95654a(i5, i5, i3, z);
            }
            i4++;
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!getMeasureAllChildren()) {
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    public MeasuringViewSwitcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
