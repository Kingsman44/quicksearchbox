package com.google.android.libraries.elements.p1708c.p1710b;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: com.google.android.libraries.elements.c.b.b */
/* compiled from: PG */
public final class C20748b {

    /* renamed from: a */
    public final PointF f58070a = new PointF();

    /* renamed from: b */
    public final float f58071b;

    /* renamed from: c */
    public final View f58072c;

    public C20748b(View view) {
        this.f58071b = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f58072c = view;
    }
}
