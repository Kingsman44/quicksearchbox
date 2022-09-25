package com.google.android.apps.search.googleapp.discover.streamui.p10232h;

import com.google.android.apps.search.googleapp.discover.streamui.C134699b;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.h.h */
/* compiled from: PG */
public final class C134757h extends C134766q {

    /* renamed from: a */
    public final C57315dp f366939a;

    /* renamed from: h */
    private final C134699b f366940h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134757h(C57315dp dpVar, C134699b bVar) {
        super(C134756g.CHANNEL_DETAIL, new C134750a(dpVar));
        C69664n.m101061g(dpVar, "channelToken");
        C69664n.m101061g(bVar, "clearcutEventType");
        this.f366939a = dpVar;
        this.f366940h = bVar;
    }

    /* renamed from: a */
    public final C134699b mo111973a() {
        return this.f366940h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C134757h)) {
            return false;
        }
        C134757h hVar = (C134757h) obj;
        return C69664n.m101066l(this.f366939a, hVar.f366939a) && this.f366940h == hVar.f366940h;
    }

    public final int hashCode() {
        return (this.f366939a.hashCode() * 31) + this.f366940h.hashCode();
    }

    public final String toString() {
        int hashCode = this.f366939a.hashCode();
        return "ChannelDetail(" + hashCode + ")";
    }
}
