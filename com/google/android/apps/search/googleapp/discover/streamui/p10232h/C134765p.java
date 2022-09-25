package com.google.android.apps.search.googleapp.discover.streamui.p10232h;

import com.google.android.apps.search.googleapp.discover.streamui.C134699b;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.h.p */
/* compiled from: PG */
public final class C134765p extends C134766q {

    /* renamed from: a */
    public final C57315dp f366951a;

    /* renamed from: h */
    private final C134699b f366952h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134765p(C57315dp dpVar, C134699b bVar) {
        super(C134756g.SECONDARY_SCREEN, new C134753d(dpVar));
        C69664n.m101061g(dpVar, "secondaryScreenToken");
        C69664n.m101061g(bVar, "clearcutEventType");
        this.f366951a = dpVar;
        this.f366952h = bVar;
    }

    /* renamed from: a */
    public final C134699b mo111973a() {
        return this.f366952h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134765p)) {
            return false;
        }
        C134765p pVar = (C134765p) obj;
        return C69664n.m101066l(this.f366951a, pVar.f366951a) && this.f366952h == pVar.f366952h;
    }

    public final int hashCode() {
        return (this.f366951a.hashCode() * 31) + this.f366952h.hashCode();
    }

    public final String toString() {
        int hashCode = this.f366951a.hashCode();
        return "SecondaryScreen(" + hashCode + ")";
    }
}
