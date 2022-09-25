package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* renamed from: com.google.android.material.internal.bn */
/* compiled from: PG */
public class C44742bn extends ImageButton {

    /* renamed from: f */
    public int f116606f;

    public C44742bn(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: g */
    public final void mo48051g(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f116606f = i;
        }
    }

    public final void setVisibility(int i) {
        mo48051g(i, true);
    }

    public C44742bn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C44742bn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f116606f = getVisibility();
    }
}
