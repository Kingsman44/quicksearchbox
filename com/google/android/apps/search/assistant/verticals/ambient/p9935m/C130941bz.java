package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.assistant.p3886c.C50818do;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.bz */
/* compiled from: PG */
public final class C130941bz extends C130937bv {

    /* renamed from: a */
    private final C50818do f358276a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C130941bz(C50818do doVar) {
        super("QUOTA_REACHED");
        C69664n.m101061g(doVar, "card");
        this.f358276a = doVar;
    }

    /* renamed from: b */
    public final C50818do mo109998b() {
        return this.f358276a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C130941bz) && C69664n.m101066l(this.f358276a, ((C130941bz) obj).f358276a);
    }

    public final int hashCode() {
        return this.f358276a.hashCode();
    }

    public final String toString() {
        C50818do doVar = this.f358276a;
        return "QuotaReached(card=" + doVar + ")";
    }
}
