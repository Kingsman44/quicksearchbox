package com.google.android.libraries.web.p3343a.p3344a;

import com.google.android.libraries.web.p3353c.C43377v;
import com.google.android.libraries.web.shared.p3444d.C44095g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.web.a.a.e */
/* compiled from: PG */
public final class C43225e {

    /* renamed from: a */
    public final C43223c f112957a;

    /* renamed from: b */
    public final C43377v f112958b;

    /* renamed from: c */
    private final C60888db f112959c;

    public C43225e(C44095g gVar, C43377v vVar, C60888db dbVar) {
        this.f112957a = (C43223c) gVar.mo47064a(C43223c.class);
        this.f112958b = vVar;
        this.f112959c = dbVar;
    }

    /* renamed from: a */
    public final C60870cx mo46277a(TimeUnit timeUnit) {
        C43224d dVar = new C43224d(this, this.f112958b.mo46468a().f113329b);
        return C60856cj.m92902k(C47810es.m84965e(dVar), 2000, timeUnit, this.f112959c);
    }
}
