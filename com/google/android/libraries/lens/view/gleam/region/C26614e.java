package com.google.android.libraries.lens.view.gleam.region;

import android.graphics.RectF;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.lens.view.gleam.region.e */
/* compiled from: PG */
public abstract class C26614e {

    /* renamed from: a */
    public static final C26614e f72579a = m49159f(new RectF()).mo31892a();

    /* renamed from: f */
    public static C26613d m49159f(RectF rectF) {
        C26611b bVar = new C26611b();
        if (rectF != null) {
            bVar.f72568a = rectF;
            bVar.f72570c = 1;
            bVar.mo31894c(true);
            bVar.f72569b = C58836b.f156633a;
            bVar.mo31893b(false);
            return bVar;
        }
        throw new NullPointerException("Null rect");
    }

    /* renamed from: a */
    public abstract RectF mo31895a();

    /* renamed from: b */
    public abstract C58833ax mo31896b();

    /* renamed from: c */
    public abstract boolean mo31897c();

    /* renamed from: d */
    public abstract boolean mo31898d();

    /* renamed from: e */
    public abstract int mo31899e();
}
