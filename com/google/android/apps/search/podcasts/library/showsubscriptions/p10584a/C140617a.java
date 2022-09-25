package com.google.android.apps.search.podcasts.library.showsubscriptions.p10584a;

import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.library.showsubscriptions.a.a */
/* compiled from: PG */
public final class C140617a {

    /* renamed from: a */
    public final List f381905a;

    /* renamed from: b */
    public final boolean f381906b;

    public C140617a(List list, boolean z) {
        C69664n.m101061g(list, "subscriptionItems");
        this.f381905a = list;
        this.f381906b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140617a)) {
            return false;
        }
        C140617a aVar = (C140617a) obj;
        return C69664n.m101066l(this.f381905a, aVar.f381905a) && this.f381906b == aVar.f381906b;
    }

    public final int hashCode() {
        return (this.f381905a.hashCode() * 31) + (this.f381906b ? 1 : 0);
    }

    public final String toString() {
        List list = this.f381905a;
        boolean z = this.f381906b;
        return "ShowSubscriptionsData(subscriptionItems=" + list + ", signedIn=" + z + ")";
    }
}
