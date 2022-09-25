package com.google.android.apps.search.podcasts.p10565f;

import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.ah */
/* compiled from: PG */
public final class C140287ah implements C47388b {

    /* renamed from: a */
    public final C140641b f381132a;

    public C140287ah(C140641b bVar) {
        C69664n.m101061g(bVar, "episodeItem");
        this.f381132a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C140287ah) && C69664n.m101066l(this.f381132a, ((C140287ah) obj).f381132a);
    }

    public final int hashCode() {
        return this.f381132a.hashCode();
    }

    public final String toString() {
        C140641b bVar = this.f381132a;
        return "MarkAsPlayed(episodeItem=" + bVar + ")";
    }
}
