package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.common.o.aj */
/* compiled from: PG */
public final class C59582aj extends C62934bn implements C63001dt {
    public C59582aj() {
        super(C59687cb.f160034bf);
    }

    /* renamed from: a */
    public final void mo57004a(Iterable iterable) {
        copyOnWrite();
        C59687cb cbVar = (C59687cb) this.instance;
        C59687cb cbVar2 = C59687cb.f160034bf;
        cbVar.mo57043b();
        C62947c.addAll(iterable, (List) cbVar.f160101am);
    }

    /* renamed from: b */
    public final void mo57005b(Iterable iterable) {
        copyOnWrite();
        C59687cb cbVar = (C59687cb) this.instance;
        C59687cb cbVar2 = C59687cb.f160034bf;
        C62971cq cqVar = cbVar.f160105aq;
        if (!cqVar.mo58948c()) {
            cbVar.f160105aq = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) cbVar.f160105aq);
    }

    /* renamed from: c */
    public final void mo57006c(Iterable iterable) {
        copyOnWrite();
        C59687cb cbVar = (C59687cb) this.instance;
        C59687cb cbVar2 = C59687cb.f160034bf;
        cbVar.mo57042a();
        C62947c.addAll(iterable, (List) cbVar.f160125f);
    }

    /* renamed from: d */
    public final void mo57007d(Iterable iterable) {
        copyOnWrite();
        C59687cb cbVar = (C59687cb) this.instance;
        C59687cb cbVar2 = C59687cb.f160034bf;
        cbVar.mo57044c();
        C62947c.addAll(iterable, (List) cbVar.f160066aD);
    }

    /* renamed from: e */
    public final void mo57008e(C59770f fVar) {
        copyOnWrite();
        C59687cb cbVar = (C59687cb) this.instance;
        C59687cb cbVar2 = C59687cb.f160034bf;
        fVar.getClass();
        cbVar.mo57042a();
        cbVar.f160125f.add(fVar);
    }

    /* renamed from: f */
    public final void mo57009f(String str) {
        copyOnWrite();
        C59687cb cbVar = (C59687cb) this.instance;
        C59687cb cbVar2 = C59687cb.f160034bf;
        str.getClass();
        cbVar.mo57044c();
        cbVar.f160066aD.add(str);
    }

    /* renamed from: g */
    public final void mo57010g(C59651be beVar) {
        C59651be beVar2;
        copyOnWrite();
        C59687cb cbVar = (C59687cb) this.instance;
        C59687cb cbVar2 = C59687cb.f160034bf;
        beVar.getClass();
        C59651be beVar3 = cbVar.f160100al;
        if (!(beVar3 == null || beVar3 == (beVar2 = C59651be.f159929E))) {
            C59601ay ayVar = (C59601ay) beVar2.createBuilder(beVar3);
            ayVar.mergeFrom(beVar);
            beVar = (C59651be) ayVar.buildPartial();
        }
        cbVar.f160100al = beVar;
        cbVar.f160122c |= 16;
    }
}
