package com.google.android.apps.search.podcasts.p10565f;

import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.f.ax */
/* compiled from: PG */
public final class C140303ax implements C47388b {

    /* renamed from: a */
    public final C140646b f381155a;

    public C140303ax(C140646b bVar) {
        C69664n.m101061g(bVar, "showItem");
        this.f381155a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C140303ax) && C69664n.m101066l(this.f381155a, ((C140303ax) obj).f381155a);
    }

    public final int hashCode() {
        return this.f381155a.hashCode();
    }

    public final String toString() {
        C140646b bVar = this.f381155a;
        return "ToggleSubscriptionEvent(showItem=" + bVar + ")";
    }
}
