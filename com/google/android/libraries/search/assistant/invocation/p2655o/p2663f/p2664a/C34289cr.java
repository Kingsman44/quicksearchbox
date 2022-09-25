package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.cr */
/* compiled from: PG */
public final class C34289cr {

    /* renamed from: a */
    private final C34301k f91198a;

    public C34289cr(C34301k kVar) {
        this.f91198a = kVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C34303m mo39302a() {
        C62942bv build = this.f91198a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C34303m) build;
    }

    /* renamed from: b */
    public final void mo39303b(String str) {
        C34301k kVar = this.f91198a;
        kVar.copyOnWrite();
        C34303m mVar = (C34303m) kVar.instance;
        C34303m mVar2 = C34303m.f91223d;
        mVar.f91225a |= 1;
        mVar.f91227c = str;
    }

    /* renamed from: c */
    public final void mo39304c(C34302l lVar) {
        C69664n.m101061g(lVar, "value");
        C34301k kVar = this.f91198a;
        kVar.copyOnWrite();
        C34303m mVar = C34303m.f91223d;
        ((C34303m) kVar.instance).f91226b = lVar.getNumber();
    }
}
