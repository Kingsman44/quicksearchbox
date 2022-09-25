package com.google.p4283bv.p4287b.p4288a.p4322b;

import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.bv.b.a.b.f */
/* compiled from: PG */
public final class C56850f {

    /* renamed from: a */
    private final C56847c f151674a;

    public C56850f(C56847c cVar) {
        this.f151674a = cVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C56848d mo54433a() {
        C62942bv build = this.f151674a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C56848d) build;
    }

    /* renamed from: b */
    public final void mo54434b(String str) {
        C69664n.m101061g(str, "value");
        C56847c cVar = this.f151674a;
        cVar.copyOnWrite();
        C56848d dVar = (C56848d) cVar.instance;
        C56848d dVar2 = C56848d.f151669d;
        str.getClass();
        dVar.f151671a |= 2;
        dVar.f151673c = str;
    }

    /* renamed from: c */
    public final void mo54435c(String str) {
        C56847c cVar = this.f151674a;
        cVar.copyOnWrite();
        C56848d dVar = (C56848d) cVar.instance;
        C56848d dVar2 = C56848d.f151669d;
        dVar.f151671a |= 1;
        dVar.f151672b = str;
    }
}
