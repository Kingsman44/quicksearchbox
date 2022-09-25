package com.google.android.apps.search.podcasts.p10566g.p10568b;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97925o;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10600q.C140944c;
import com.google.android.apps.search.podcasts.p10601r.C140976e;
import p5462h.C69613f;
import p5462h.C69747m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.g.b.b */
/* compiled from: PG */
public final class C140367b implements C140944c {

    /* renamed from: a */
    public final C140641b f381305a;

    /* renamed from: b */
    public final C97925o f381306b;

    /* renamed from: c */
    public final boolean f381307c;

    /* renamed from: d */
    private final C69613f f381308d = new C69747m(new C140366a(this));

    public C140367b(C140641b bVar, C97925o oVar, boolean z) {
        C69664n.m101061g(bVar, "data");
        C69664n.m101061g(oVar, "episodeItemVe");
        this.f381305a = bVar;
        this.f381306b = oVar;
        this.f381307c = z;
    }

    /* renamed from: a */
    public final String mo115619a() {
        return (String) this.f381308d.mo5768a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo115620b(C140944c cVar) {
        return C140976e.m228930c(this.f381305a, ((C140367b) cVar).f381305a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140367b)) {
            return false;
        }
        C140367b bVar = (C140367b) obj;
        return C69664n.m101066l(this.f381305a, bVar.f381305a) && C69664n.m101066l(this.f381306b, bVar.f381306b) && this.f381307c == bVar.f381307c;
    }

    public final int hashCode() {
        return (((this.f381305a.hashCode() * 31) + this.f381306b.hashCode()) * 31) + (this.f381307c ? 1 : 0);
    }

    public final String toString() {
        C140641b bVar = this.f381305a;
        C97925o oVar = this.f381306b;
        boolean z = this.f381307c;
        return "FeedEpisodeData(data=" + bVar + ", episodeItemVe=" + oVar + ", includeReactionActions=" + z + ")";
    }
}
