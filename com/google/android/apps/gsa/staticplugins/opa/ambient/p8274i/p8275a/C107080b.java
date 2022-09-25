package com.google.android.apps.gsa.staticplugins.opa.ambient.p8274i.p8275a;

import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.i.a.b */
/* compiled from: PG */
public final class C107080b extends C107081c {

    /* renamed from: a */
    public final Optional f298134a;

    /* renamed from: b */
    public final Optional f298135b;

    /* renamed from: c */
    public final Optional f298136c;

    public C107080b(Optional optional, Optional optional2, Optional optional3) {
        this.f298134a = optional;
        this.f298135b = optional2;
        this.f298136c = optional3;
    }

    /* renamed from: a */
    public final Optional mo95777a() {
        return this.f298136c;
    }

    /* renamed from: b */
    public final Optional mo95778b() {
        return this.f298134a;
    }

    /* renamed from: c */
    public final Optional mo95779c() {
        return this.f298135b;
    }

    /* renamed from: d */
    public final boolean mo95780d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C107081c) {
            C107081c cVar = (C107081c) obj;
            return this.f298134a.equals(cVar.mo95778b()) && this.f298135b.equals(cVar.mo95779c()) && this.f298136c.equals(cVar.mo95777a()) && !cVar.mo95780d();
        }
    }

    public final int hashCode() {
        return ((((((this.f298134a.hashCode() ^ 1000003) * 1000003) ^ this.f298135b.hashCode()) * 1000003) ^ this.f298136c.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f298134a);
        String valueOf2 = String.valueOf(this.f298135b);
        String valueOf3 = String.valueOf(this.f298136c);
        return "DetailsPageStartRequest{mainUseCaseInt=" + valueOf + ", pageTitle=" + valueOf2 + ", detailsPagePayload=" + valueOf3 + ", sendFeedbackOnStart=false}";
    }
}
