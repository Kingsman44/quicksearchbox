package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.bv.e.b.c.a.au */
/* compiled from: PG */
public final class C57239au {

    /* renamed from: a */
    private final C57240av f152800a;

    public C57239au(C57240av avVar) {
        this.f152800a = avVar;
    }

    /* renamed from: a */
    public final C57244az mo54450a() {
        C57244az azVar = ((C57246ba) this.f152800a.instance).f152823c;
        if (azVar == null) {
            azVar = C57244az.f152807g;
        }
        C69664n.m101060f(azVar, "_builder.getClientData()");
        return azVar;
    }

    /* renamed from: b */
    public final /* synthetic */ C57246ba mo54451b() {
        C62942bv build = this.f152800a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C57246ba) build;
    }

    /* renamed from: c */
    public final void mo54452c(C57299d dVar) {
        C69664n.m101061g(dVar, "value");
        C57240av avVar = this.f152800a;
        avVar.copyOnWrite();
        C57246ba baVar = (C57246ba) avVar.instance;
        C57246ba baVar2 = C57246ba.f152819d;
        dVar.getClass();
        baVar.f152822b = dVar;
        baVar.f152821a |= 1;
    }

    /* renamed from: d */
    public final void mo54453d(C57244az azVar) {
        C69664n.m101061g(azVar, "value");
        C57240av avVar = this.f152800a;
        avVar.copyOnWrite();
        C57246ba baVar = (C57246ba) avVar.instance;
        C57246ba baVar2 = C57246ba.f152819d;
        azVar.getClass();
        baVar.f152823c = azVar;
        baVar.f152821a |= 2;
    }
}
