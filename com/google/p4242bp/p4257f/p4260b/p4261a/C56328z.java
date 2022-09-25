package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.bp.f.b.a.z */
/* compiled from: PG */
public final class C56328z extends C62934bn implements C63001dt {
    public C56328z() {
        super(C56220aa.f149748b);
    }

    /* renamed from: a */
    public final void mo54356a(Iterable iterable) {
        copyOnWrite();
        C56220aa aaVar = (C56220aa) this.instance;
        C56220aa aaVar2 = C56220aa.f149748b;
        aaVar.mo54334a();
        C62947c.addAll(iterable, (List) aaVar.f149750a);
    }

    /* renamed from: b */
    public final void mo54357b(C56327y yVar) {
        copyOnWrite();
        C56220aa aaVar = (C56220aa) this.instance;
        C56220aa aaVar2 = C56220aa.f149748b;
        yVar.getClass();
        aaVar.mo54334a();
        aaVar.f149750a.add(yVar);
    }

    /* renamed from: c */
    public final void mo54358c(int i, C56219a aVar) {
        copyOnWrite();
        C56220aa aaVar = (C56220aa) this.instance;
        C56327y yVar = (C56327y) aVar.build();
        C56220aa aaVar2 = C56220aa.f149748b;
        yVar.getClass();
        aaVar.mo54334a();
        aaVar.f149750a.set(i, yVar);
    }
}
