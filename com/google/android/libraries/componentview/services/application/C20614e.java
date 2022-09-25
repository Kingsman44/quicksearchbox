package com.google.android.libraries.componentview.services.application;

import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;

/* renamed from: com.google.android.libraries.componentview.services.application.e */
/* compiled from: PG */
public final class C20614e extends C20598by {

    /* renamed from: a */
    public Throwable f57821a;

    /* renamed from: b */
    public String f57822b;

    /* renamed from: c */
    public String f57823c;

    /* renamed from: d */
    public String f57824d;

    /* renamed from: e */
    public String f57825e;

    /* renamed from: f */
    private C19742a f57826f;

    public C20614e() {
    }

    public C20614e(C20599bz bzVar) {
        C20615f fVar = (C20615f) bzVar;
        this.f57821a = fVar.f57827a;
        this.f57822b = fVar.f57828b;
        this.f57823c = fVar.f57829c;
        this.f57824d = fVar.f57830d;
        this.f57825e = fVar.f57831e;
        this.f57826f = fVar.f57832f;
    }

    /* renamed from: a */
    public final C20599bz mo25531a() {
        C19742a aVar = this.f57826f;
        if (aVar != null) {
            return new C20615f(this.f57821a, this.f57822b, this.f57823c, this.f57824d, this.f57825e, aVar);
        }
        throw new IllegalStateException("Missing required properties: errorCode");
    }

    /* renamed from: b */
    public final void mo25532b(Throwable th) {
        this.f57821a = th;
    }

    /* renamed from: c */
    public final void mo25533c(String str) {
        this.f57824d = str;
    }

    /* renamed from: d */
    public final void mo25534d(String str) {
        this.f57825e = str;
    }

    /* renamed from: e */
    public final void mo25535e(C19742a aVar) {
        if (aVar != null) {
            this.f57826f = aVar;
            return;
        }
        throw new NullPointerException("Null errorCode");
    }

    /* renamed from: f */
    public final void mo25536f(String str) {
        this.f57822b = str;
    }
}
