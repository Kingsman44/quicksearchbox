package com.google.android.apps.search.podcasts.p10565f;

import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.at */
/* compiled from: PG */
public final class C140299at implements C47388b {

    /* renamed from: a */
    public final C140646b f381152a;

    /* renamed from: b */
    public final boolean f381153b;

    public C140299at(C140646b bVar, boolean z) {
        C69664n.m101061g(bVar, "showItem");
        this.f381152a = bVar;
        this.f381153b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140299at)) {
            return false;
        }
        C140299at atVar = (C140299at) obj;
        return C69664n.m101066l(this.f381152a, atVar.f381152a) && this.f381153b == atVar.f381153b;
    }

    public final int hashCode() {
        return (this.f381152a.hashCode() * 31) + (this.f381153b ? 1 : 0);
    }

    public final String toString() {
        C140646b bVar = this.f381152a;
        boolean z = this.f381153b;
        return "ShowNewEpisodeNotificationsEvent(showItem=" + bVar + ", enable=" + z + ")";
    }
}
