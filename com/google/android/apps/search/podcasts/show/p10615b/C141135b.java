package com.google.android.apps.search.podcasts.show.p10615b;

import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10600q.C140944c;
import com.google.android.apps.search.podcasts.p10601r.C140976e;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.b.b */
/* compiled from: PG */
public final class C141135b implements C140944c {

    /* renamed from: a */
    public final C140641b f383186a;

    /* renamed from: b */
    private final C69613f f383187b = new C69747m(new C141134a(this));

    public C141135b(C140641b bVar) {
        C69664n.m101061g(bVar, "episodeItem");
        this.f383186a = bVar;
    }

    /* renamed from: a */
    public final String mo115619a() {
        return (String) this.f383187b.mo5768a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo115620b(C140944c cVar) {
        return C140976e.m228930c(this.f383186a, ((C141135b) cVar).f383186a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C141135b) && C69664n.m101066l(this.f383186a, ((C141135b) obj).f383186a);
    }

    public final int hashCode() {
        return this.f383186a.hashCode();
    }

    public final String toString() {
        C140641b bVar = this.f383186a;
        return "ShowEpisodeData(episodeItem=" + bVar + ")";
    }
}
