package com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;

/* compiled from: PG */
public final class MaxHeightScrollView extends ScrollView {

    /* renamed from: a */
    public int f109702a;

    public MaxHeightScrollView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3 = this.f109702a;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, LinearLayoutManager.INVALID_OFFSET);
        }
        super.onMeasure(i, i2);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
