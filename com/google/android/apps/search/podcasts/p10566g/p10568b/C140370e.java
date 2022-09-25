package com.google.android.apps.search.podcasts.p10566g.p10568b;

import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10600q.C140944c;
import com.google.android.apps.search.podcasts.p10601r.p10608f.C140982c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.g.b.e */
/* compiled from: PG */
public final class C140370e implements C140944c {

    /* renamed from: a */
    public final C140646b f381312a;

    /* renamed from: b */
    public final C140982c f381313b;

    /* renamed from: c */
    public final boolean f381314c;

    /* renamed from: d */
    public final boolean f381315d;

    /* renamed from: e */
    public final boolean f381316e;

    public C140370e(C140646b bVar, C140982c cVar, boolean z, boolean z2, boolean z3) {
        C69664n.m101061g(bVar, "showItem");
        this.f381312a = bVar;
        this.f381313b = cVar;
        this.f381314c = z;
        this.f381315d = z2;
        this.f381316e = z3;
    }

    /* renamed from: a */
    public final String mo115619a() {
        String str = this.f381312a.f381995a;
        C69664n.m101060f(str, "showItem.feedUrl");
        return str;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo115620b(C140944c cVar) {
        return C69664n.m101066l(this.f381312a, ((C140370e) cVar).f381312a);
    }

    /* renamed from: c */
    public final String mo115627c() {
        String str = this.f381312a.f381996b;
        C69664n.m101060f(str, "showItem.title");
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140370e)) {
            return false;
        }
        C140370e eVar = (C140370e) obj;
        return C69664n.m101066l(this.f381312a, eVar.f381312a) && C69664n.m101066l(this.f381313b, eVar.f381313b) && this.f381314c == eVar.f381314c && this.f381315d == eVar.f381315d && this.f381316e == eVar.f381316e;
    }

    public final int hashCode() {
        return (((((((this.f381312a.hashCode() * 31) + this.f381313b.hashCode()) * 31) + (this.f381314c ? 1 : 0)) * 31) + (this.f381315d ? 1 : 0)) * 31) + (this.f381316e ? 1 : 0);
    }

    public final String toString() {
        C140646b bVar = this.f381312a;
        C140982c cVar = this.f381313b;
        boolean z = this.f381314c;
        boolean z2 = this.f381315d;
        boolean z3 = this.f381316e;
        return "FeedShowData(showItem=" + bVar + ", showItemVe=" + cVar + ", includeReactionActions=" + z + ", includeShowActionMenus=" + z2 + ", includeSubscribeButton=" + z3 + ")";
    }
}
