package com.google.p4152bb.p4153a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.bb.a.fm */
/* compiled from: PG */
public final class C55090fm extends C62934bn implements C63001dt {
    public C55090fm() {
        super(C55093fp.f144965l);
    }

    /* renamed from: a */
    public final void mo54190a(Iterable iterable) {
        copyOnWrite();
        C55093fp fpVar = (C55093fp) this.instance;
        C55093fp fpVar2 = C55093fp.f144965l;
        fpVar.mo54193a();
        C62947c.addAll(iterable, (List) fpVar.f144969c);
    }

    /* renamed from: b */
    public final void mo54191b(C55065eo eoVar) {
        copyOnWrite();
        C55093fp fpVar = (C55093fp) this.instance;
        C55082fe feVar = (C55082fe) eoVar.build();
        C55093fp fpVar2 = C55093fp.f144965l;
        feVar.getClass();
        fpVar.mo54193a();
        fpVar.f144969c.add(feVar);
    }

    /* renamed from: c */
    public final void mo54192c(C55082fe feVar) {
        copyOnWrite();
        C55093fp fpVar = (C55093fp) this.instance;
        C55093fp fpVar2 = C55093fp.f144965l;
        feVar.getClass();
        fpVar.mo54193a();
        fpVar.f144969c.add(feVar);
    }
}
