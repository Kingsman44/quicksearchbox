package com.google.android.libraries.lens.view.p2091bb;

import android.graphics.RectF;

/* renamed from: com.google.android.libraries.lens.view.bb.a */
/* compiled from: PG */
public abstract class C25687a {
    /* renamed from: a */
    public abstract RectF mo30788a();

    /* renamed from: b */
    public abstract C25688b mo30789b();

    /* renamed from: c */
    public final C25688b mo30790c() {
        RectF a = mo30788a();
        if (!a.intersect(0.0f, 0.0f, 1.0f, 1.0f)) {
            a = new RectF(0.5f, 0.5f, 0.5f, 0.5f);
        }
        mo30792e(a);
        return mo30789b();
    }

    /* renamed from: d */
    public abstract void mo30791d(boolean z);

    /* renamed from: e */
    public abstract void mo30792e(RectF rectF);
}
