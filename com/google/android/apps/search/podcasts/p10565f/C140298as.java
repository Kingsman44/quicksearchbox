package com.google.android.apps.search.podcasts.p10565f;

import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.as */
/* compiled from: PG */
public final class C140298as implements C47388b {

    /* renamed from: a */
    public final C140646b f381150a;

    /* renamed from: b */
    public final boolean f381151b;

    public C140298as(C140646b bVar, boolean z) {
        C69664n.m101061g(bVar, "showItem");
        this.f381150a = bVar;
        this.f381151b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140298as)) {
            return false;
        }
        C140298as asVar = (C140298as) obj;
        return C69664n.m101066l(this.f381150a, asVar.f381150a) && this.f381151b == asVar.f381151b;
    }

    public final int hashCode() {
        return (this.f381150a.hashCode() * 31) + (this.f381151b ? 1 : 0);
    }

    public final String toString() {
        C140646b bVar = this.f381150a;
        boolean z = this.f381151b;
        return "ShowAutoDownloadNewEpisodesEvent(showItem=" + bVar + ", enable=" + z + ")";
    }
}
