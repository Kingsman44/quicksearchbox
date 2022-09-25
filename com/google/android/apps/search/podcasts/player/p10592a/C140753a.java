package com.google.android.apps.search.podcasts.player.p10592a;

import com.google.android.apps.search.podcasts.p10576l.C140509u;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.a.a */
/* compiled from: PG */
public final class C140753a {

    /* renamed from: a */
    public final C140641b f382213a;

    /* renamed from: b */
    public final C140509u f382214b;

    public C140753a(C140641b bVar, C140509u uVar) {
        C69664n.m101061g(uVar, "autoplay");
        this.f382213a = bVar;
        this.f382214b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140753a)) {
            return false;
        }
        C140753a aVar = (C140753a) obj;
        return C69664n.m101066l(this.f382213a, aVar.f382213a) && this.f382214b == aVar.f382214b;
    }

    public final int hashCode() {
        C140641b bVar = this.f382213a;
        return ((bVar == null ? 0 : bVar.hashCode()) * 31) + this.f382214b.hashCode();
    }

    public final String toString() {
        C140641b bVar = this.f382213a;
        C140509u uVar = this.f382214b;
        return "NextEpisode(episode=" + bVar + ", autoplay=" + uVar + ")";
    }
}
