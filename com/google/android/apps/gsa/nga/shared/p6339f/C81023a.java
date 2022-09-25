package com.google.android.apps.gsa.nga.shared.p6339f;

import com.google.android.apps.gsa.nga.shared.p6339f.p6340a.C81026c;
import com.google.android.apps.gsa.nga.shared.p6339f.p6342c.C81052j;
import com.google.android.libraries.search.p2904c.C37500dg;
import com.google.android.libraries.search.p2904c.C37672hs;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.a */
/* compiled from: PG */
public final class C81023a extends C81066e {

    /* renamed from: a */
    public final C81052j f222082a;

    /* renamed from: b */
    public final C81026c f222083b;

    /* renamed from: c */
    private final C37672hs f222084c;

    /* renamed from: d */
    private final C37500dg f222085d;

    public C81023a(C37672hs hsVar, C37500dg dgVar, C81052j jVar, C81026c cVar) {
        this.f222084c = hsVar;
        this.f222085d = dgVar;
        this.f222082a = jVar;
        this.f222083b = cVar;
    }

    /* renamed from: a */
    public final C81026c mo74805a() {
        return this.f222083b;
    }

    /* renamed from: b */
    public final C81052j mo74806b() {
        return this.f222082a;
    }

    /* renamed from: c */
    public final C37500dg mo74807c() {
        return this.f222085d;
    }

    /* renamed from: d */
    public final C37672hs mo74808d() {
        return this.f222084c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C81066e) {
            C81066e eVar = (C81066e) obj;
            return this.f222084c.equals(eVar.mo74808d()) && this.f222085d.equals(eVar.mo74807c()) && this.f222082a.equals(eVar.mo74806b()) && this.f222083b.equals(eVar.mo74805a());
        }
    }

    public final int hashCode() {
        return ((((((this.f222084c.hashCode() ^ 1000003) * 1000003) ^ this.f222085d.hashCode()) * 1000003) ^ this.f222082a.hashCode()) * 1000003) ^ this.f222083b.hashCode();
    }

    public final String toString() {
        String obj = this.f222084c.toString();
        String obj2 = this.f222085d.toString();
        String obj3 = this.f222082a.toString();
        String obj4 = this.f222083b.toString();
        return "ClientHotwordInvocation{invocationToken=" + obj + ", precachedBufferId=" + obj2 + ", hotwordVerificationParams=" + obj3 + ", callback=" + obj4 + "}";
    }
}
