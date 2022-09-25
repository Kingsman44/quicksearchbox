package com.google.android.apps.gsa.nga.engine.understanding;

import com.google.android.apps.gsa.nga.engine.p5891ab.p5892a.C74757n;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.d */
/* compiled from: PG */
final class C79044d extends C78981ah {

    /* renamed from: a */
    public final C74757n f217373a;

    /* renamed from: b */
    public final Optional f217374b;

    public C79044d(C74757n nVar, Optional optional) {
        this.f217373a = nVar;
        this.f217374b = optional;
    }

    /* renamed from: a */
    public final C74757n mo73741a() {
        return this.f217373a;
    }

    /* renamed from: b */
    public final C78980ag mo73742b() {
        return new C79008c(this);
    }

    /* renamed from: c */
    public final Optional mo73743c() {
        return this.f217374b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78981ah) {
            C78981ah ahVar = (C78981ah) obj;
            return this.f217373a.equals(ahVar.mo73741a()) && this.f217374b.equals(ahVar.mo73743c());
        }
    }

    public final int hashCode() {
        return ((this.f217373a.hashCode() ^ 1000003) * 1000003) ^ this.f217374b.hashCode();
    }

    public final String toString() {
        String obj = this.f217373a.toString();
        String valueOf = String.valueOf(this.f217374b);
        return "QueryRewritingResult{query=" + obj + ", interpretation=" + valueOf + "}";
    }
}
