package com.google.android.apps.search.googleapp.discover.streamui.p10232h;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.h.d */
/* compiled from: PG */
public final class C134753d extends C134755f {

    /* renamed from: a */
    private final C57315dp f366922a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134753d(C57315dp dpVar) {
        super("MORE_STORIES", dpVar);
        C69664n.m101061g(dpVar, "secondaryScreenToken");
        this.f366922a = dpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C134753d) && C69664n.m101066l(this.f366922a, ((C134753d) obj).f366922a);
    }

    public final int hashCode() {
        return this.f366922a.hashCode();
    }

    public final String toString() {
        C57315dp dpVar = this.f366922a;
        return "MoreStories(secondaryScreenToken=" + dpVar + ")";
    }
}
