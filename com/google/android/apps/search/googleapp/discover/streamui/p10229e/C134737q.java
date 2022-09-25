package com.google.android.apps.search.googleapp.discover.streamui.p10229e;

import com.google.android.apps.search.googleapp.discover.p10181d.C134218g;
import com.google.android.apps.search.googleapp.discover.p10181d.C134221j;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.e.q */
/* compiled from: PG */
public final class C134737q extends C134740t {

    /* renamed from: a */
    public final C134218g f366890a;

    /* renamed from: b */
    private final C134221j f366891b;

    public C134737q(C134218g gVar, C134221j jVar) {
        C69664n.m101061g(gVar, "result");
        this.f366890a = gVar;
        this.f366891b = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134737q)) {
            return false;
        }
        C134737q qVar = (C134737q) obj;
        return this.f366890a == qVar.f366890a && this.f366891b == qVar.f366891b;
    }

    public final int hashCode() {
        int hashCode = this.f366890a.hashCode() * 31;
        C134221j jVar = this.f366891b;
        return hashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public final String toString() {
        String name = this.f366890a.name();
        C134221j jVar = this.f366891b;
        String name2 = jVar != null ? jVar.name() : null;
        return "Finished(result=" + name + ", error=" + name2 + ")";
    }
}
