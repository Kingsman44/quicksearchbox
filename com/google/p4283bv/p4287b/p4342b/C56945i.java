package com.google.p4283bv.p4287b.p4342b;

import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.bv.b.b.i */
/* compiled from: PG */
public final class C56945i {

    /* renamed from: a */
    public final C56942f f151989a;

    public C56945i(C56942f fVar) {
        this.f151989a = fVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C56943g mo54438a() {
        C62942bv build = this.f151989a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C56943g) build;
    }

    /* renamed from: b */
    public final void mo54439b(String str) {
        C69664n.m101061g(str, "value");
        C56942f fVar = this.f151989a;
        fVar.copyOnWrite();
        C56943g gVar = (C56943g) fVar.instance;
        C56943g gVar2 = C56943g.f151982f;
        str.getClass();
        gVar.f151984a |= 1;
        gVar.f151985b = str;
    }

    /* renamed from: c */
    public final void mo54440c(C56941e eVar) {
        C69664n.m101061g(eVar, "value");
        C56942f fVar = this.f151989a;
        fVar.copyOnWrite();
        C56943g gVar = (C56943g) fVar.instance;
        C56943g gVar2 = C56943g.f151982f;
        gVar.f151987d = eVar.f151981e;
        gVar.f151984a |= 4;
    }

    /* renamed from: d */
    public final void mo54441d() {
        C56942f fVar = this.f151989a;
        fVar.copyOnWrite();
        C56943g gVar = (C56943g) fVar.instance;
        C56943g gVar2 = C56943g.f151982f;
        gVar.f151984a |= 8;
        gVar.f151988e = true;
    }
}
