package com.google.android.apps.gsa.shared.p7148ui;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: com.google.android.apps.gsa.shared.ui.MultiChildPaddingLayout */
/* compiled from: PG */
public class MultiChildPaddingLayout extends C90697i {
    public MultiChildPaddingLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo84832a(int i) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            m148088b(getChildAt(i2), i);
        }
    }

    public MultiChildPaddingLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MultiChildPaddingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
