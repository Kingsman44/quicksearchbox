package com.google.android.apps.search.podcasts.p10565f;

import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.p4017at.p4082j.p4083a.C54458w;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.ay */
/* compiled from: PG */
public final class C140304ay implements C47388b {

    /* renamed from: a */
    public final C140641b f381156a;

    /* renamed from: b */
    public final C54458w f381157b;

    public C140304ay(C140641b bVar, C54458w wVar) {
        C69664n.m101061g(bVar, "episodeItem");
        C69664n.m101061g(wVar, "reactionType");
        this.f381156a = bVar;
        this.f381157b = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140304ay)) {
            return false;
        }
        C140304ay ayVar = (C140304ay) obj;
        return C69664n.m101066l(this.f381156a, ayVar.f381156a) && this.f381157b == ayVar.f381157b;
    }

    public final int hashCode() {
        return (this.f381156a.hashCode() * 31) + this.f381157b.hashCode();
    }

    public final String toString() {
        C140641b bVar = this.f381156a;
        C54458w wVar = this.f381157b;
        return "UpdateEpisodeReactionEvent(episodeItem=" + bVar + ", reactionType=" + wVar + ")";
    }
}
