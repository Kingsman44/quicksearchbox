package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import java.util.Iterator;

/* renamed from: com.google.bv.f.a.a.ai */
/* compiled from: PG */
public final class C57565ai extends C62934bn implements C63001dt {
    public C57565ai() {
        super(C57566aj.f153791e);
    }

    /* renamed from: a */
    public final void mo54516a(Iterable iterable) {
        copyOnWrite();
        C57566aj ajVar = (C57566aj) this.instance;
        C62962ci ciVar = C57566aj.f153790d;
        ajVar.mo54518a();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ajVar.f153795c.mo58916g(((C57665z) it.next()).getNumber());
        }
    }

    /* renamed from: b */
    public final void mo54517b(C57665z zVar) {
        copyOnWrite();
        C57566aj ajVar = (C57566aj) this.instance;
        C62962ci ciVar = C57566aj.f153790d;
        zVar.getClass();
        ajVar.mo54518a();
        ajVar.f153795c.mo58916g(zVar.getNumber());
    }
}
