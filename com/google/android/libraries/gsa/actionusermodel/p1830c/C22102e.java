package com.google.android.libraries.gsa.actionusermodel.p1830c;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.c.e */
/* compiled from: PG */
public final class C22102e extends C62934bn implements C63001dt {
    public C22102e() {
        super(C22104g.f60920i);
    }

    /* renamed from: a */
    public final C22101d mo27354a(int i) {
        return (C22101d) ((C22104g) this.instance).f60927f.get(i);
    }

    /* renamed from: b */
    public final void mo27355b(Iterable iterable) {
        copyOnWrite();
        C22104g gVar = (C22104g) this.instance;
        C22104g gVar2 = C22104g.f60920i;
        gVar.mo27358a();
        C62947c.addAll(iterable, (List) gVar.f60927f);
    }

    /* renamed from: c */
    public final void mo27356c(C22101d dVar) {
        copyOnWrite();
        C22104g gVar = (C22104g) this.instance;
        C22104g gVar2 = C22104g.f60920i;
        dVar.getClass();
        gVar.mo27358a();
        gVar.f60927f.add(dVar);
    }

    /* renamed from: d */
    public final void mo27357d(int i, C22101d dVar) {
        copyOnWrite();
        C22104g gVar = (C22104g) this.instance;
        C22104g gVar2 = C22104g.f60920i;
        dVar.getClass();
        gVar.mo27358a();
        gVar.f60927f.set(i, dVar);
    }
}
