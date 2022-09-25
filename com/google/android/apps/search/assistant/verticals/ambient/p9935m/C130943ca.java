package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.assistant.p3886c.C50818do;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.ca */
/* compiled from: PG */
public final class C130943ca extends C130937bv {

    /* renamed from: a */
    private final C50818do f358280a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C130943ca(C50818do doVar) {
        super("SUCCESS");
        C69664n.m101061g(doVar, "card");
        this.f358280a = doVar;
    }

    /* renamed from: b */
    public final C50818do mo109998b() {
        return this.f358280a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C130943ca) && C69664n.m101066l(this.f358280a, ((C130943ca) obj).f358280a);
    }

    public final int hashCode() {
        return this.f358280a.hashCode();
    }

    public final String toString() {
        C50818do doVar = this.f358280a;
        return "Success(card=" + doVar + ")";
    }
}
