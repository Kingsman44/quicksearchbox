package com.google.android.libraries.lens.view.session;

import android.graphics.RectF;
import com.google.android.libraries.lens.p2014e.C24227s;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.lens.view.session.bi */
/* compiled from: PG */
public abstract class C27773bi {
    /* renamed from: a */
    public abstract RectF mo33273a();

    /* renamed from: b */
    public abstract C27774bj mo33274b();

    /* renamed from: c */
    public abstract void mo33275c(RectF rectF);

    /* renamed from: d */
    public abstract void mo33276d(C24231w wVar);

    /* renamed from: e */
    public abstract void mo33277e(C58485gu guVar);

    /* renamed from: f */
    public abstract void mo33278f(int i);

    /* renamed from: g */
    public final C27774bj mo33279g() {
        RectF rectF = new RectF(mo33273a());
        rectF.intersect(C24227s.f66272a);
        mo33275c(rectF);
        return mo33274b();
    }
}
