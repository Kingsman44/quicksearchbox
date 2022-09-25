package com.google.android.apps.search.podcasts.home.p10570a;

import com.google.android.apps.search.podcasts.p10600q.C140952k;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.home.a.h */
/* compiled from: PG */
public final class C140397h {

    /* renamed from: a */
    public final C140952k f381363a;

    /* renamed from: b */
    public final boolean f381364b;

    public C140397h(C140952k kVar, boolean z) {
        this.f381363a = kVar;
        this.f381364b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140397h)) {
            return false;
        }
        C140397h hVar = (C140397h) obj;
        return C69664n.m101066l(this.f381363a, hVar.f381363a) && this.f381364b == hVar.f381364b;
    }

    public final int hashCode() {
        return (this.f381363a.hashCode() * 31) + (this.f381364b ? 1 : 0);
    }

    public final String toString() {
        C140952k kVar = this.f381363a;
        boolean z = this.f381364b;
        return "HomeFeedViewData(recyclerViewData=" + kVar + ", showAadcDialog=" + z + ")";
    }
}
