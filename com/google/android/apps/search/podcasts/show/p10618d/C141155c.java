package com.google.android.apps.search.podcasts.show.p10618d;

import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.d.c */
/* compiled from: PG */
public final class C141155c implements C47388b {

    /* renamed from: a */
    public final C140646b f383237a;

    /* renamed from: b */
    public final boolean f383238b;

    public C141155c(C140646b bVar, boolean z) {
        C69664n.m101061g(bVar, "showItem");
        this.f383237a = bVar;
        this.f383238b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C141155c)) {
            return false;
        }
        C141155c cVar = (C141155c) obj;
        return C69664n.m101066l(this.f383237a, cVar.f383237a) && this.f383238b == cVar.f383238b;
    }

    public final int hashCode() {
        return (this.f383237a.hashCode() * 31) + (this.f383238b ? 1 : 0);
    }

    public final String toString() {
        C140646b bVar = this.f383237a;
        boolean z = this.f383238b;
        return "UpdateEpisodeFiltersEvent(showItem=" + bVar + ", hideCompleted=" + z + ")";
    }
}
