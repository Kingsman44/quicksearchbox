package com.google.android.apps.search.podcasts.p10565f;

import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.ar */
/* compiled from: PG */
public final class C140297ar implements C47388b {

    /* renamed from: a */
    public final C140646b f381149a;

    public C140297ar(C140646b bVar) {
        C69664n.m101061g(bVar, "showItem");
        this.f381149a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C140297ar) && C69664n.m101066l(this.f381149a, ((C140297ar) obj).f381149a);
    }

    public final int hashCode() {
        return this.f381149a.hashCode();
    }

    public final String toString() {
        C140646b bVar = this.f381149a;
        return "ShareShowEvent(showItem=" + bVar + ")";
    }
}
