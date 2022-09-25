package com.google.android.apps.search.podcasts.explore.p10564a;

import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.explore.a.a */
/* compiled from: PG */
public final class C140248a {

    /* renamed from: a */
    public final List f381017a;

    public C140248a(List list) {
        C69664n.m101061g(list, "tabs");
        this.f381017a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C140248a) && C69664n.m101066l(this.f381017a, ((C140248a) obj).f381017a);
    }

    public final int hashCode() {
        return this.f381017a.hashCode();
    }

    public final String toString() {
        List list = this.f381017a;
        return "DiscoverTabs(tabs=" + list + ")";
    }
}
