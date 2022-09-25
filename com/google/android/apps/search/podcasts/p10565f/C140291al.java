package com.google.android.apps.search.podcasts.p10565f;

import com.google.android.apps.search.podcasts.p10576l.C140509u;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.al */
/* compiled from: PG */
public final class C140291al implements C47388b {

    /* renamed from: a */
    public final C140641b f381143a;

    /* renamed from: b */
    public final C140509u f381144b;

    public C140291al(C140641b bVar, C140509u uVar) {
        C69664n.m101061g(bVar, "episodeItem");
        C69664n.m101061g(uVar, "autoplayContext");
        this.f381143a = bVar;
        this.f381144b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140291al)) {
            return false;
        }
        C140291al alVar = (C140291al) obj;
        return C69664n.m101066l(this.f381143a, alVar.f381143a) && this.f381144b == alVar.f381144b;
    }

    public final int hashCode() {
        return (this.f381143a.hashCode() * 31) + this.f381144b.hashCode();
    }

    public final String toString() {
        C140641b bVar = this.f381143a;
        C140509u uVar = this.f381144b;
        return "PlayEpisodeEvent(episodeItem=" + bVar + ", autoplayContext=" + uVar + ")";
    }
}
