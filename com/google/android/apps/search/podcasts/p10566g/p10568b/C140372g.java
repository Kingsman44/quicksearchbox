package com.google.android.apps.search.podcasts.p10566g.p10568b;

import com.google.android.apps.search.podcasts.p10600q.C140944c;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.g.b.g */
/* compiled from: PG */
public final class C140372g implements C140944c {

    /* renamed from: a */
    public final List f381319a;

    public C140372g(List list) {
        C69664n.m101061g(list, "subscriptionData");
        this.f381319a = list;
    }

    /* renamed from: a */
    public final String mo115619a() {
        return "feed_subscription_carousel_identifier";
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo115620b(C140944c cVar) {
        return C69664n.m101066l(this.f381319a, ((C140372g) cVar).f381319a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C140372g) && C69664n.m101066l(this.f381319a, ((C140372g) obj).f381319a);
    }

    public final int hashCode() {
        return this.f381319a.hashCode();
    }

    public final String toString() {
        List list = this.f381319a;
        return "FeedSubscriptionsCarouselData(subscriptionData=" + list + ")";
    }
}
