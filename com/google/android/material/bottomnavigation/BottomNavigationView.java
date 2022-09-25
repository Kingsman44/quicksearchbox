package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.support.p033v7.widget.C0735ip;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44733be;
import com.google.android.material.internal.C44741bm;
import com.google.android.material.navigation.C44822i;
import com.google.android.material.navigation.NavigationBarView;

/* compiled from: PG */
public class BottomNavigationView extends NavigationBarView {
    public BottomNavigationView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final int mo47496a() {
        return 5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C44822i mo47497b(Context context) {
        return new C44546b(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumHeight > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 2132151246);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C0735ip b = C44733be.m79296b(getContext(), attributeSet, C44549e.f115857a, i, i2, new int[0]);
        boolean z = b.f2596b.getBoolean(1, true);
        C44546b bVar = (C44546b) this.f116865b;
        if (bVar.f115854a != z) {
            bVar.f115854a = z;
            this.f116866c.mo1546f(false);
        }
        if (b.f2596b.hasValue(0)) {
            setMinimumHeight(b.f2596b.getDimensionPixelSize(0, 0));
        }
        b.f2596b.recycle();
        C44741bm.m79313f(this, new C44547c());
    }
}
