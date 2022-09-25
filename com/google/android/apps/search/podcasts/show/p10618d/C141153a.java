package com.google.android.apps.search.podcasts.show.p10618d;

import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.d.a */
/* compiled from: PG */
public final class C141153a implements C47388b {

    /* renamed from: a */
    public final C140646b f383234a;

    public C141153a(C140646b bVar) {
        C69664n.m101061g(bVar, "showItem");
        this.f383234a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C141153a) && C69664n.m101066l(this.f383234a, ((C141153a) obj).f383234a);
    }

    public final int hashCode() {
        return this.f383234a.hashCode();
    }

    public final String toString() {
        C140646b bVar = this.f383234a;
        return "GoToPublisherEvent(showItem=" + bVar + ")";
    }
}
