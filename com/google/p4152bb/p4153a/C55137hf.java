package com.google.p4152bb.p4153a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.bb.a.hf */
/* compiled from: PG */
public final class C55137hf extends C62934bn implements C63001dt {
    public C55137hf() {
        super(C55138hg.f145142g);
    }

    /* renamed from: a */
    public final String mo54202a(int i) {
        return (String) ((C55138hg) this.instance).f145149f.get(i);
    }

    /* renamed from: b */
    public final void mo54203b(int i, String str) {
        copyOnWrite();
        C55138hg hgVar = (C55138hg) this.instance;
        C55138hg hgVar2 = C55138hg.f145142g;
        C62971cq cqVar = hgVar.f145149f;
        if (!cqVar.mo58948c()) {
            hgVar.f145149f = C62942bv.mutableCopy(cqVar);
        }
        hgVar.f145149f.set(i, str);
    }
}
