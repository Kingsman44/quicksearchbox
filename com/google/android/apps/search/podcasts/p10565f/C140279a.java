package com.google.android.apps.search.podcasts.p10565f;

import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97917g;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.a */
/* compiled from: PG */
public final class C140279a implements C47388b {

    /* renamed from: a */
    public final C140641b f381102a;

    /* renamed from: b */
    public final C97917g f381103b;

    public C140279a(C140641b bVar, C97917g gVar) {
        C69664n.m101061g(bVar, "episodeItem");
        C69664n.m101061g(gVar, "downloadRequestType");
        this.f381102a = bVar;
        this.f381103b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140279a)) {
            return false;
        }
        C140279a aVar = (C140279a) obj;
        return C69664n.m101066l(this.f381102a, aVar.f381102a) && this.f381103b == aVar.f381103b;
    }

    public final int hashCode() {
        return (this.f381102a.hashCode() * 31) + this.f381103b.hashCode();
    }

    public final String toString() {
        C140641b bVar = this.f381102a;
        C97917g gVar = this.f381103b;
        return "DownloadEpisodeEvent(episodeItem=" + bVar + ", downloadRequestType=" + gVar + ")";
    }
}
