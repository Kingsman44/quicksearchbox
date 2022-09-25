package com.google.android.apps.search.podcasts.searchresults.p10611a;

import com.google.android.apps.search.podcasts.p10600q.C140952k;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.searchresults.a.b */
/* compiled from: PG */
public final class C141027b {

    /* renamed from: a */
    public final C140952k f382866a;

    /* renamed from: b */
    public final boolean f382867b;

    public C141027b(C140952k kVar, boolean z) {
        this.f382866a = kVar;
        this.f382867b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C141027b)) {
            return false;
        }
        C141027b bVar = (C141027b) obj;
        return C69664n.m101066l(this.f382866a, bVar.f382866a) && this.f382867b == bVar.f382867b;
    }

    public final int hashCode() {
        return (this.f382866a.hashCode() * 31) + (this.f382867b ? 1 : 0);
    }

    public final String toString() {
        C140952k kVar = this.f382866a;
        boolean z = this.f382867b;
        return "SearchResultViewData(recyclerViewData=" + kVar + ", showAadcDialog=" + z + ")";
    }
}
