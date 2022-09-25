package com.google.android.apps.search.podcasts.p10600q;

import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.q.k */
/* compiled from: PG */
public final class C140952k {

    /* renamed from: a */
    public final List f382708a;

    /* renamed from: b */
    public final Integer f382709b;

    public C140952k(List list, Integer num) {
        C69664n.m101061g(list, "listItems");
        this.f382708a = list;
        this.f382709b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140952k)) {
            return false;
        }
        C140952k kVar = (C140952k) obj;
        return C69664n.m101066l(this.f382708a, kVar.f382708a) && C69664n.m101066l(this.f382709b, kVar.f382709b);
    }

    public final int hashCode() {
        int hashCode = this.f382708a.hashCode() * 31;
        Integer num = this.f382709b;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        List list = this.f382708a;
        Integer num = this.f382709b;
        return "RecyclerViewData(listItems=" + list + ", scrollTo=" + num + ")";
    }
}
