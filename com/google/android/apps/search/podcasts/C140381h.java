package com.google.android.apps.search.podcasts;

import com.google.android.apps.search.podcasts.p10550b.p10553c.C140049a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.h */
/* compiled from: PG */
public final class C140381h {

    /* renamed from: a */
    public final boolean f381337a;

    /* renamed from: b */
    public final C140049a f381338b;

    public C140381h(boolean z, C140049a aVar) {
        this.f381337a = z;
        this.f381338b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140381h)) {
            return false;
        }
        C140381h hVar = (C140381h) obj;
        return this.f381337a == hVar.f381337a && C69664n.m101066l(this.f381338b, hVar.f381338b);
    }

    public final int hashCode() {
        int i = (this.f381337a ? 1 : 0) * true;
        C140049a aVar = this.f381338b;
        return i + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        boolean z = this.f381337a;
        C140049a aVar = this.f381338b;
        return "PodcastsMainData(hasMediaData=" + z + ", cleartextSourceError=" + aVar + ")";
    }
}
