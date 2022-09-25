package com.google.android.apps.search.podcasts.p10566g.p10568b;

import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10588n.C140666ao;
import com.google.android.apps.search.podcasts.p10600q.C140944c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.g.b.f */
/* compiled from: PG */
public final class C140371f implements C140374i {

    /* renamed from: a */
    public final C140666ao f381317a;

    /* renamed from: b */
    public final C140646b f381318b;

    public C140371f(C140666ao aoVar) {
        C69664n.m101061g(aoVar, "subscriptionItem");
        this.f381317a = aoVar;
        this.f381318b = aoVar.f382044a;
    }

    /* renamed from: a */
    public final String mo115619a() {
        String str = this.f381317a.f382044a.f381995a;
        C69664n.m101060f(str, "subscriptionItem.showItem.feedUrl");
        return str;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo115620b(C140944c cVar) {
        C140374i iVar = (C140374i) cVar;
        return (iVar instanceof C140371f) && C69664n.m101066l(this.f381317a, ((C140371f) iVar).f381317a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C140371f) && C69664n.m101066l(this.f381317a, ((C140371f) obj).f381317a);
    }

    public final int hashCode() {
        return this.f381317a.hashCode();
    }

    public final String toString() {
        C140666ao aoVar = this.f381317a;
        return "FeedShowSubscriptionData(subscriptionItem=" + aoVar + ")";
    }
}
