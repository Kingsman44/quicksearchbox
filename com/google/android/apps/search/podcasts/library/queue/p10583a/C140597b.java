package com.google.android.apps.search.podcasts.library.queue.p10583a;

import com.google.android.apps.search.podcasts.p10600q.C140952k;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.queue.a.b */
/* compiled from: PG */
public final class C140597b {

    /* renamed from: a */
    public final C140952k f381850a;

    public C140597b(C140952k kVar) {
        this.f381850a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C140597b) && C69664n.m101066l(this.f381850a, ((C140597b) obj).f381850a);
    }

    public final int hashCode() {
        return this.f381850a.hashCode();
    }

    public final String toString() {
        C140952k kVar = this.f381850a;
        return "QueueData(recyclerViewData=" + kVar + ")";
    }
}
