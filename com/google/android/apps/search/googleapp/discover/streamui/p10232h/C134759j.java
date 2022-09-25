package com.google.android.apps.search.googleapp.discover.streamui.p10232h;

import com.google.android.apps.search.googleapp.discover.streamui.C134699b;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.h.j */
/* compiled from: PG */
public final class C134759j extends C134766q {

    /* renamed from: a */
    public final C57315dp f366941a;

    /* renamed from: h */
    private final C134699b f366942h = C134699b.MAIN_FEED;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134759j(C57315dp dpVar) {
        super(C134756g.FULL_COVERAGE, new C134751b(dpVar));
        C69664n.m101061g(dpVar, "fullCoverageToken");
        this.f366941a = dpVar;
    }

    /* renamed from: a */
    public final C134699b mo111973a() {
        return this.f366942h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C134759j) && C69664n.m101066l(this.f366941a, ((C134759j) obj).f366941a);
    }

    public final int hashCode() {
        return this.f366941a.hashCode();
    }

    public final String toString() {
        int hashCode = this.f366941a.hashCode();
        return "FullCoverage(" + hashCode + ")";
    }
}
