package com.google.android.apps.gsa.search.core.p6519al.p6725ds;

import com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8709h.C116498a;

/* renamed from: com.google.android.apps.gsa.search.core.al.ds.a */
/* compiled from: PG */
public final class C85424a extends C85452b {

    /* renamed from: a */
    public final long f231230a;

    /* renamed from: b */
    public final C116498a f231231b;

    public C85424a(long j, C116498a aVar) {
        this.f231230a = j;
        if (aVar != null) {
            this.f231231b = aVar;
            return;
        }
        throw new NullPointerException("Null callbacks");
    }

    /* renamed from: a */
    public final long mo78953a() {
        return this.f231230a;
    }

    /* renamed from: b */
    public final C116498a mo78954b() {
        return this.f231231b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C85452b) {
            C85452b bVar = (C85452b) obj;
            return this.f231230a == bVar.mo78953a() && this.f231231b.equals(bVar.mo78954b());
        }
    }

    public final int hashCode() {
        long j = this.f231230a;
        return this.f231231b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f231230a;
        String obj = this.f231231b.toString();
        return "WebViewConfig{id=" + j + ", callbacks=" + obj + "}";
    }
}
