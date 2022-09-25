package com.google.ads.interactivemedia.p367v3.internal;

import android.view.View;

/* renamed from: com.google.ads.interactivemedia.v3.internal.e */
/* compiled from: PG */
public abstract class C6893e {
    /* renamed from: a */
    public abstract void mo15759a();

    /* renamed from: b */
    public abstract void mo15760b(View view);

    /* renamed from: c */
    public abstract void mo15761c();

    /* renamed from: d */
    public abstract void mo15762d(View view, C7055k kVar, String str);

    /* renamed from: e */
    public abstract void mo15763e();

    /* renamed from: f */
    public static C6893e m20125f(C6920f fVar, C6947g gVar) {
        if (C6839c.m19800c()) {
            C7009ih.m20724b(fVar, "AdSessionConfiguration is null");
            C7009ih.m20724b(gVar, "AdSessionContext is null");
            return new C7001i(fVar, gVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }
}
