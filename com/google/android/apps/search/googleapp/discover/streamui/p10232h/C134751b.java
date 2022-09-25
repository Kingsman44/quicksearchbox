package com.google.android.apps.search.googleapp.discover.streamui.p10232h;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.h.b */
/* compiled from: PG */
public final class C134751b extends C134755f {

    /* renamed from: a */
    private final C57315dp f366920a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134751b(C57315dp dpVar) {
        super("FULL_COVERAGE", dpVar);
        C69664n.m101061g(dpVar, "fullCoverageToken");
        this.f366920a = dpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C134751b) && C69664n.m101066l(this.f366920a, ((C134751b) obj).f366920a);
    }

    public final int hashCode() {
        return this.f366920a.hashCode();
    }

    public final String toString() {
        C57315dp dpVar = this.f366920a;
        return "FullCoverage(fullCoverageToken=" + dpVar + ")";
    }
}
