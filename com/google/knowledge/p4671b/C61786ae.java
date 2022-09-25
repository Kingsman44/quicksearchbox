package com.google.knowledge.p4671b;

import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.knowledge.b.ae */
/* compiled from: PG */
public final class C61786ae {

    /* renamed from: a */
    public final C61789ah f166892a;

    public C61786ae(C61789ah ahVar) {
        this.f166892a = ahVar;
    }

    /* renamed from: a */
    public final C61814g mo58190a() {
        C61814g gVar = ((C61790ai) this.f166892a.instance).f166903d;
        if (gVar == null) {
            gVar = C61814g.f166984j;
        }
        C69664n.m101060f(gVar, "_builder.getAppContext()");
        return gVar;
    }

    /* renamed from: b */
    public final /* synthetic */ C61790ai mo58191b() {
        C62942bv build = this.f166892a.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C61790ai) build;
    }

    /* renamed from: c */
    public final void mo58192c(C61814g gVar) {
        C69664n.m101061g(gVar, "value");
        C61789ah ahVar = this.f166892a;
        ahVar.copyOnWrite();
        C61790ai aiVar = (C61790ai) ahVar.instance;
        C61790ai aiVar2 = C61790ai.f166898o;
        gVar.getClass();
        aiVar.f166903d = gVar;
        aiVar.f166900a |= 16;
    }
}
