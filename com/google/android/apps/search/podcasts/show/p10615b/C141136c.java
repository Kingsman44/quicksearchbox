package com.google.android.apps.search.podcasts.show.p10615b;

import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10588n.p10589a.C140651c;
import com.google.android.apps.search.podcasts.p10600q.C140944c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.b.c */
/* compiled from: PG */
public final class C141136c implements C140944c {

    /* renamed from: a */
    public final C140646b f383188a;

    /* renamed from: b */
    public final int f383189b;

    /* renamed from: c */
    public final C140651c f383190c;

    /* renamed from: d */
    public final boolean f383191d;

    public C141136c(C140646b bVar, int i, C140651c cVar, boolean z) {
        C69664n.m101061g(bVar, "showItem");
        C69664n.m101061g(cVar, "sortPreferences");
        this.f383188a = bVar;
        this.f383189b = i;
        this.f383190c = cVar;
        this.f383191d = z;
    }

    /* renamed from: a */
    public final String mo115619a() {
        return "ShowHeaderIdentifier";
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo115620b(C140944c cVar) {
        C141136c cVar2 = (C141136c) cVar;
        return C69664n.m101066l(this.f383188a, cVar2.f383188a) && this.f383189b == cVar2.f383189b && C69664n.m101066l(this.f383190c, cVar2.f383190c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C141136c)) {
            return false;
        }
        C141136c cVar = (C141136c) obj;
        return C69664n.m101066l(this.f383188a, cVar.f383188a) && this.f383189b == cVar.f383189b && C69664n.m101066l(this.f383190c, cVar.f383190c) && this.f383191d == cVar.f383191d;
    }

    public final int hashCode() {
        return (((((this.f383188a.hashCode() * 31) + this.f383189b) * 31) + this.f383190c.hashCode()) * 31) + (this.f383191d ? 1 : 0);
    }

    public final String toString() {
        C140646b bVar = this.f383188a;
        int i = this.f383189b;
        C140651c cVar = this.f383190c;
        boolean z = this.f383191d;
        return "ShowHeaderData(showItem=" + bVar + ", numOfEpisodes=" + i + ", sortPreferences=" + cVar + ", signedIn=" + z + ")";
    }
}
