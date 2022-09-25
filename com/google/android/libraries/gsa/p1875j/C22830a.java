package com.google.android.libraries.gsa.p1875j;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.j.a */
/* compiled from: PG */
public final class C22830a extends C62934bn implements C63001dt {
    public C22830a() {
        super(C22831b.f62860b);
    }

    /* renamed from: a */
    public final void mo28194a(Iterable iterable) {
        copyOnWrite();
        C22831b bVar = (C22831b) this.instance;
        C22831b bVar2 = C22831b.f62860b;
        bVar.mo28197a();
        C62947c.addAll(iterable, (List) bVar.f62862a);
    }

    /* renamed from: b */
    public final void mo28195b(C22845p pVar) {
        copyOnWrite();
        C22831b bVar = (C22831b) this.instance;
        C22831b bVar2 = C22831b.f62860b;
        pVar.getClass();
        bVar.mo28197a();
        bVar.f62862a.add(pVar);
    }

    /* renamed from: c */
    public final void mo28196c(int i) {
        copyOnWrite();
        C22831b bVar = (C22831b) this.instance;
        C22831b bVar2 = C22831b.f62860b;
        bVar.mo28197a();
        bVar.f62862a.remove(i);
    }
}
