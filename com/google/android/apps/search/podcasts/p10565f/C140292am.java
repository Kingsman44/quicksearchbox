package com.google.android.apps.search.podcasts.p10565f;

import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.am */
/* compiled from: PG */
public final class C140292am implements C47388b {

    /* renamed from: a */
    public final C140641b f381145a;

    public C140292am(C140641b bVar) {
        this.f381145a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C140292am) && C69664n.m101066l(this.f381145a, ((C140292am) obj).f381145a);
    }

    public final int hashCode() {
        return this.f381145a.hashCode();
    }

    public final String toString() {
        C140641b bVar = this.f381145a;
        return "PlayNextInQueueEvent(episodeItem=" + bVar + ")";
    }
}
