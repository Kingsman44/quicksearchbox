package com.google.android.apps.search.podcasts.p10565f;

import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.aw */
/* compiled from: PG */
public final class C140302aw implements C47388b {

    /* renamed from: a */
    public final C140641b f381154a;

    public C140302aw(C140641b bVar) {
        C69664n.m101061g(bVar, "episodeItem");
        this.f381154a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C140302aw) && C69664n.m101066l(this.f381154a, ((C140302aw) obj).f381154a);
    }

    public final int hashCode() {
        return this.f381154a.hashCode();
    }

    public final String toString() {
        C140641b bVar = this.f381154a;
        return "ToggleQueueEvent(episodeItem=" + bVar + ")";
    }
}
