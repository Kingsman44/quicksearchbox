package com.google.android.libraries.lens.view.session;

import android.graphics.RectF;
import com.google.android.libraries.lens.p2014e.C24227s;
import com.google.android.libraries.lens.p2014e.C24231w;

/* renamed from: com.google.android.libraries.lens.view.session.be */
/* compiled from: PG */
public abstract class C27769be {
    /* renamed from: a */
    public abstract RectF mo33247a();

    /* renamed from: b */
    public abstract C27770bf mo33248b();

    /* renamed from: c */
    public abstract void mo33249c();

    /* renamed from: d */
    public abstract void mo33250d(RectF rectF);

    /* renamed from: e */
    public abstract void mo33251e(C24231w wVar);

    /* renamed from: f */
    public abstract void mo33252f(boolean z);

    /* renamed from: g */
    public final C27770bf mo33253g() {
        RectF rectF = new RectF(mo33247a());
        rectF.intersect(C24227s.f66272a);
        mo33250d(rectF);
        return mo33248b();
    }
}
