package com.google.android.apps.search.podcasts.explore.p10564a;

import com.google.android.apps.search.podcasts.p10600q.C140952k;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.explore.a.b */
/* compiled from: PG */
public final class C140249b {

    /* renamed from: a */
    public final C140952k f381018a;

    /* renamed from: b */
    public final boolean f381019b;

    public C140249b(C140952k kVar, boolean z) {
        this.f381018a = kVar;
        this.f381019b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140249b)) {
            return false;
        }
        C140249b bVar = (C140249b) obj;
        return C69664n.m101066l(this.f381018a, bVar.f381018a) && this.f381019b == bVar.f381019b;
    }

    public final int hashCode() {
        return (this.f381018a.hashCode() * 31) + (this.f381019b ? 1 : 0);
    }

    public final String toString() {
        C140952k kVar = this.f381018a;
        boolean z = this.f381019b;
        return "ExploreFeed(feed=" + kVar + ", showAadcModal=" + z + ")";
    }
}
