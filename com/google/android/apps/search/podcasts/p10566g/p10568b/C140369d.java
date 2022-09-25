package com.google.android.apps.search.podcasts.p10566g.p10568b;

import com.google.android.apps.search.podcasts.p10600q.C140944c;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.g.b.d */
/* compiled from: PG */
public final class C140369d implements C140944c {

    /* renamed from: a */
    public final String f381309a;

    /* renamed from: b */
    public final List f381310b;

    /* renamed from: c */
    public final int f381311c;

    public C140369d(String str, List list, int i) {
        C69664n.m101061g(str, "carouselTitle");
        this.f381309a = str;
        this.f381310b = list;
        this.f381311c = i;
    }

    /* renamed from: a */
    public final String mo115619a() {
        return this.f381309a;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo115620b(C140944c cVar) {
        return C69664n.m101066l(this.f381310b, ((C140369d) cVar).f381310b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C140369d)) {
            return false;
        }
        C140369d dVar = (C140369d) obj;
        return C69664n.m101066l(this.f381309a, dVar.f381309a) && C69664n.m101066l(this.f381310b, dVar.f381310b) && this.f381311c == dVar.f381311c;
    }

    public final int hashCode() {
        return (((this.f381309a.hashCode() * 31) + this.f381310b.hashCode()) * 31) + this.f381311c;
    }

    public final String toString() {
        String str = this.f381309a;
        List list = this.f381310b;
        int i = this.f381311c;
        return "FeedShowCarouselData(carouselTitle=" + str + ", showData=" + list + ", carouselVeId=" + i + ")";
    }
}
