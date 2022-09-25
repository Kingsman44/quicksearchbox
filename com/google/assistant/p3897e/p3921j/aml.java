package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.assistant.e.j.aml */
/* compiled from: PG */
public final class aml {

    /* renamed from: a */
    private final amm f135377a;

    public aml(amm amm) {
        this.f135377a = amm;
    }

    /* renamed from: a */
    public final /* synthetic */ C51682amp mo53706a() {
        C62942bv build = this.f135377a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C51682amp) build;
    }

    /* renamed from: b */
    public final void mo53707b(amo amo) {
        C69664n.m101061g(amo, "value");
        amm amm = this.f135377a;
        amm.copyOnWrite();
        C51682amp amp = (C51682amp) amm.instance;
        C51682amp amp2 = C51682amp.f135384d;
        amp.f135388c = amo.f135383d;
        amp.f135386a |= 2;
    }

    /* renamed from: c */
    public final void mo53708c(String str) {
        C69664n.m101061g(str, "value");
        amm amm = this.f135377a;
        amm.copyOnWrite();
        C51682amp amp = (C51682amp) amm.instance;
        C51682amp amp2 = C51682amp.f135384d;
        str.getClass();
        amp.f135386a |= 1;
        amp.f135387b = str;
    }
}
