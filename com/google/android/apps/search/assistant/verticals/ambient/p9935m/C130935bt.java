package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.assistant.p3886c.C50818do;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.bt */
/* compiled from: PG */
public final class C130935bt extends C130937bv {

    /* renamed from: a */
    private final C50818do f358272a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C130935bt(C50818do doVar) {
        super("DISCONNECT");
        C69664n.m101061g(doVar, "card");
        this.f358272a = doVar;
    }

    /* renamed from: b */
    public final C50818do mo109998b() {
        return this.f358272a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C130935bt) && C69664n.m101066l(this.f358272a, ((C130935bt) obj).f358272a);
    }

    public final int hashCode() {
        return this.f358272a.hashCode();
    }

    public final String toString() {
        C50818do doVar = this.f358272a;
        return "Disconnect(card=" + doVar + ")";
    }
}
