package com.google.android.apps.search.googleapp.discover.streamui.p10232h;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.h.a */
/* compiled from: PG */
public final class C134750a extends C134755f {

    /* renamed from: a */
    private final C57315dp f366919a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134750a(C57315dp dpVar) {
        super("CHANNEL_DETAIL", dpVar);
        C69664n.m101061g(dpVar, "channelToken");
        this.f366919a = dpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C134750a) && C69664n.m101066l(this.f366919a, ((C134750a) obj).f366919a);
    }

    public final int hashCode() {
        return this.f366919a.hashCode();
    }

    public final String toString() {
        C57315dp dpVar = this.f366919a;
        return "ChannelDetail(channelToken=" + dpVar + ")";
    }
}
