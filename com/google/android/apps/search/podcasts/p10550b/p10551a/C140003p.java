package com.google.android.apps.search.podcasts.p10550b.p10551a;

import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.b.a.p */
/* compiled from: PG */
public final class C140003p {

    /* renamed from: a */
    public final Map f380525a;

    /* renamed from: b */
    public final Map f380526b;

    public C140003p(Map map, Map map2) {
        this.f380525a = map;
        this.f380526b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140003p)) {
            return false;
        }
        C140003p pVar = (C140003p) obj;
        return C69664n.m101066l(this.f380525a, pVar.f380525a) && C69664n.m101066l(this.f380526b, pVar.f380526b);
    }

    public final int hashCode() {
        return (this.f380525a.hashCode() * 31) + this.f380526b.hashCode();
    }

    public final String toString() {
        Map map = this.f380525a;
        Map map2 = this.f380526b;
        return "Results(unfulfilledRequests=" + map + ", feedUrlUpdates=" + map2 + ")";
    }
}
