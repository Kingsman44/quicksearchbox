package com.google.android.apps.search.podcasts.show.p10618d;

import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10588n.p10589a.C140649a;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.d.d */
/* compiled from: PG */
public final class C141156d implements C47388b {

    /* renamed from: a */
    public final C140646b f383239a;

    /* renamed from: b */
    public final C140649a f383240b;

    public C141156d(C140646b bVar, C140649a aVar) {
        C69664n.m101061g(bVar, "showItem");
        C69664n.m101061g(aVar, "updatedSortOrder");
        this.f383239a = bVar;
        this.f383240b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C141156d)) {
            return false;
        }
        C141156d dVar = (C141156d) obj;
        return C69664n.m101066l(this.f383239a, dVar.f383239a) && this.f383240b == dVar.f383240b;
    }

    public final int hashCode() {
        return (this.f383239a.hashCode() * 31) + this.f383240b.hashCode();
    }

    public final String toString() {
        C140646b bVar = this.f383239a;
        C140649a aVar = this.f383240b;
        return "UpdateSortOrderEvent(showItem=" + bVar + ", updatedSortOrder=" + aVar + ")";
    }
}
