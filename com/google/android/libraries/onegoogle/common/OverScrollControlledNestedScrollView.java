package com.google.android.libraries.onegoogle.common;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;

/* compiled from: PG */
public final class OverScrollControlledNestedScrollView extends NestedScrollView {

    /* renamed from: e */
    public boolean f83312e;

    public OverScrollControlledNestedScrollView(Context context) {
        super(context);
    }

    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        if (this.f83312e) {
            super.onOverScrolled(i, i2, z, z2);
        }
    }

    public OverScrollControlledNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OverScrollControlledNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
