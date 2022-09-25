package com.google.android.apps.search.podcasts.p10565f;

import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.ag */
/* compiled from: PG */
public final class C140286ag implements C47388b {

    /* renamed from: a */
    public final C140641b f381131a;

    public C140286ag(C140641b bVar) {
        C69664n.m101061g(bVar, "episodeItem");
        this.f381131a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C140286ag) && C69664n.m101066l(this.f381131a, ((C140286ag) obj).f381131a);
    }

    public final int hashCode() {
        return this.f381131a.hashCode();
    }

    public final String toString() {
        C140641b bVar = this.f381131a;
        return "MarkAsNotPlayed(episodeItem=" + bVar + ")";
    }
}
