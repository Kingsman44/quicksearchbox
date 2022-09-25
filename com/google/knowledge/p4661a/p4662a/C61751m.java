package com.google.knowledge.p4661a.p4662a;

import com.google.protobuf.C62936bp;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62947c;
import java.util.List;

/* renamed from: com.google.knowledge.a.a.m */
/* compiled from: PG */
public final class C61751m extends C62936bp implements C62938br {
    public C61751m() {
        super(C61752n.f166808f);
    }

    /* renamed from: a */
    public final C61746h mo58182a(int i) {
        return (C61746h) ((C61752n) this.instance).f166812c.get(i);
    }

    /* renamed from: b */
    public final void mo58183b(Iterable iterable) {
        copyOnWrite();
        C61752n nVar = (C61752n) this.instance;
        C61752n nVar2 = C61752n.f166808f;
        nVar.mo58189a();
        C62947c.addAll(iterable, (List) nVar.f166812c);
    }

    /* renamed from: c */
    public final void mo58184c(C61745g gVar) {
        copyOnWrite();
        C61752n nVar = (C61752n) this.instance;
        C61746h hVar = (C61746h) gVar.build();
        C61752n nVar2 = C61752n.f166808f;
        hVar.getClass();
        nVar.mo58189a();
        nVar.f166812c.add(hVar);
    }

    /* renamed from: d */
    public final void mo58185d(C61746h hVar) {
        copyOnWrite();
        C61752n nVar = (C61752n) this.instance;
        C61752n nVar2 = C61752n.f166808f;
        hVar.getClass();
        nVar.mo58189a();
        nVar.f166812c.add(hVar);
    }

    /* renamed from: e */
    public final void mo58186e(C61754p pVar) {
        C61754p pVar2;
        copyOnWrite();
        C61752n nVar = (C61752n) this.instance;
        C61752n nVar2 = C61752n.f166808f;
        pVar.getClass();
        C61754p pVar3 = nVar.f166813d;
        if (!(pVar3 == null || pVar3 == (pVar2 = C61754p.f166816a))) {
            C61753o oVar = (C61753o) pVar2.createBuilder(pVar3);
            oVar.mergeFrom(pVar);
            pVar = (C61754p) oVar.buildPartial();
        }
        nVar.f166813d = pVar;
        nVar.f166810a |= 8;
    }

    /* renamed from: f */
    public final void mo58187f(int i, C61745g gVar) {
        copyOnWrite();
        C61752n nVar = (C61752n) this.instance;
        C61746h hVar = (C61746h) gVar.build();
        C61752n nVar2 = C61752n.f166808f;
        hVar.getClass();
        nVar.mo58189a();
        nVar.f166812c.set(i, hVar);
    }

    /* renamed from: g */
    public final void mo58188g(int i, C61746h hVar) {
        copyOnWrite();
        C61752n nVar = (C61752n) this.instance;
        C61752n nVar2 = C61752n.f166808f;
        hVar.getClass();
        nVar.mo58189a();
        nVar.f166812c.set(i, hVar);
    }
}
