package com.google.protos.p4850an;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.protos.an.y */
/* compiled from: PG */
public final class C63641y extends C62934bn implements C63001dt {
    public C63641y() {
        super(C63642z.f172112e);
    }

    /* renamed from: a */
    public final C63634r mo59224a(int i) {
        return (C63634r) ((C63642z) this.instance).f172117d.get(i);
    }

    /* renamed from: b */
    public final void mo59225b(Iterable iterable) {
        copyOnWrite();
        C63642z zVar = (C63642z) this.instance;
        C63642z zVar2 = C63642z.f172112e;
        zVar.mo59228a();
        C62947c.addAll(iterable, (List) zVar.f172117d);
    }

    /* renamed from: c */
    public final void mo59226c(C63634r rVar) {
        copyOnWrite();
        C63642z zVar = (C63642z) this.instance;
        C63642z zVar2 = C63642z.f172112e;
        rVar.getClass();
        zVar.mo59228a();
        zVar.f172117d.add(rVar);
    }

    /* renamed from: d */
    public final void mo59227d(int i, C63634r rVar) {
        copyOnWrite();
        C63642z zVar = (C63642z) this.instance;
        C63642z zVar2 = C63642z.f172112e;
        rVar.getClass();
        zVar.mo59228a();
        zVar.f172117d.set(i, rVar);
    }
}
