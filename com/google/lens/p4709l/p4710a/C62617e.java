package com.google.lens.p4709l.p4710a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.lens.l.a.e */
/* compiled from: PG */
public final class C62617e extends C62934bn implements C63001dt {
    public C62617e() {
        super(C62621i.f169069i);
    }

    /* renamed from: a */
    public final void mo58508a(Iterable iterable) {
        copyOnWrite();
        C62621i iVar = (C62621i) this.instance;
        C62621i iVar2 = C62621i.f169069i;
        iVar.mo58514a();
        C62947c.addAll(iterable, (List) iVar.f169074d);
    }

    /* renamed from: b */
    public final void mo58509b() {
        copyOnWrite();
        C62621i iVar = (C62621i) this.instance;
        C62621i iVar2 = C62621i.f169069i;
        C62971cq cqVar = iVar.f169075e;
        if (!cqVar.mo58948c()) {
            iVar.f169075e = C62942bv.mutableCopy(cqVar);
        }
        iVar.f169075e.add("vi");
    }

    /* renamed from: c */
    public final void mo58510c(C62615c cVar) {
        copyOnWrite();
        C62621i iVar = (C62621i) this.instance;
        C62616d dVar = (C62616d) cVar.build();
        C62621i iVar2 = C62621i.f169069i;
        dVar.getClass();
        C62971cq cqVar = iVar.f169072b;
        if (!cqVar.mo58948c()) {
            iVar.f169072b = C62942bv.mutableCopy(cqVar);
        }
        iVar.f169072b.add(dVar);
    }

    /* renamed from: d */
    public final void mo58511d() {
        copyOnWrite();
        C62621i iVar = (C62621i) this.instance;
        C62621i iVar2 = C62621i.f169069i;
        iVar.mo58514a();
        iVar.f169074d.add("Latn");
    }

    /* renamed from: e */
    public final void mo58512e(String str, C62620h hVar) {
        hVar.getClass();
        copyOnWrite();
        C62621i iVar = (C62621i) this.instance;
        C62621i iVar2 = C62621i.f169069i;
        C62995dn dnVar = iVar.f169073c;
        if (!dnVar.f170058b) {
            iVar.f169073c = dnVar.mo58980a();
        }
        iVar.f169073c.put(str, hVar);
    }
}
