package com.google.android.apps.search.podcasts.p10565f;

import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.ao */
/* compiled from: PG */
public final class C140294ao implements C47388b {

    /* renamed from: a */
    public final List f381147a;

    public C140294ao(List list) {
        this.f381147a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C140294ao) && C69664n.m101066l(this.f381147a, ((C140294ao) obj).f381147a);
    }

    public final int hashCode() {
        return this.f381147a.hashCode();
    }

    public final String toString() {
        List list = this.f381147a;
        return "RemoveFromQueueEvent(episodeItems=" + list + ")";
    }
}
