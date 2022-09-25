package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.aj */
/* compiled from: PG */
public class C93443aj extends GridView {
    public C93443aj(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (getLayoutParams().height == -2) {
            i2 = View.MeasureSpec.makeMeasureSpec(16777215, LinearLayoutManager.INVALID_OFFSET);
        }
        super.onMeasure(i, i2);
    }

    public C93443aj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C93443aj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
