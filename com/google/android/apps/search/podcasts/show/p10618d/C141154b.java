package com.google.android.apps.search.podcasts.show.p10618d;

import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10588n.p10589a.C140651c;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.d.b */
/* compiled from: PG */
public final class C141154b implements C47388b {

    /* renamed from: a */
    public final C140646b f383235a;

    /* renamed from: b */
    public final C140651c f383236b;

    public C141154b(C140646b bVar, C140651c cVar) {
        C69664n.m101061g(bVar, "showItem");
        C69664n.m101061g(cVar, "currentSortPreferences");
        this.f383235a = bVar;
        this.f383236b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C141154b)) {
            return false;
        }
        C141154b bVar = (C141154b) obj;
        return C69664n.m101066l(this.f383235a, bVar.f383235a) && C69664n.m101066l(this.f383236b, bVar.f383236b);
    }

    public final int hashCode() {
        return (this.f383235a.hashCode() * 31) + this.f383236b.hashCode();
    }

    public final String toString() {
        C140646b bVar = this.f383235a;
        C140651c cVar = this.f383236b;
        return "ShowEpisodeSortBottomSheet(showItem=" + bVar + ", currentSortPreferences=" + cVar + ")";
    }
}
