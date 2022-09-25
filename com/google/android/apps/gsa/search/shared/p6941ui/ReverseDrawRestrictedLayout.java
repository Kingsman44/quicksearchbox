package com.google.android.apps.gsa.search.shared.p6941ui;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: com.google.android.apps.gsa.search.shared.ui.ReverseDrawRestrictedLayout */
/* compiled from: PG */
public class ReverseDrawRestrictedLayout extends RestrictedWidthLayout {
    public ReverseDrawRestrictedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo82029a(boolean z) {
        setChildrenDrawingOrderEnabled(z);
    }

    /* access modifiers changed from: protected */
    public final int getChildDrawingOrder(int i, int i2) {
        return (i - i2) - 1;
    }
}
