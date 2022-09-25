package com.google.android.setupdesign.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;

/* compiled from: PG */
public class BottomScrollView extends ScrollView {

    /* renamed from: a */
    public int f118404a;

    /* renamed from: b */
    private final Runnable f118405b = new C45321a();

    public BottomScrollView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            this.f118404a = Math.max(0, ((childAt.getMeasuredHeight() - i4) + i2) - getPaddingBottom());
        }
        if (i4 - i2 > 0) {
            post(this.f118405b);
        }
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
    }

    public BottomScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
