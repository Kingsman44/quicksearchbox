package com.google.android.apps.search.podcasts.player.p10597d;

import com.google.android.apps.search.podcasts.p10576l.C140509u;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.d.a */
/* compiled from: PG */
public final class C140785a {

    /* renamed from: a */
    public final String f382277a;

    /* renamed from: b */
    public final String f382278b;

    /* renamed from: c */
    public final C140509u f382279c;

    public C140785a(String str, String str2, C140509u uVar) {
        C69664n.m101061g(uVar, "autoplay");
        this.f382277a = str;
        this.f382278b = str2;
        this.f382279c = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140785a)) {
            return false;
        }
        C140785a aVar = (C140785a) obj;
        return C69664n.m101066l(this.f382277a, aVar.f382277a) && C69664n.m101066l(this.f382278b, aVar.f382278b) && this.f382279c == aVar.f382279c;
    }

    public final int hashCode() {
        return (((this.f382277a.hashCode() * 31) + this.f382278b.hashCode()) * 31) + this.f382279c.hashCode();
    }

    public final String toString() {
        String str = this.f382277a;
        String str2 = this.f382278b;
        C140509u uVar = this.f382279c;
        return "EpisodeMediaId(feedUrl=" + str + ", guid=" + str2 + ", autoplay=" + uVar + ")";
    }
}
