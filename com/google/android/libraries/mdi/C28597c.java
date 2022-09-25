package com.google.android.libraries.mdi;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.c */
/* compiled from: PG */
public final class C28597c extends C62934bn implements C63001dt {
    public C28597c() {
        super(C29690f.f80408m);
    }

    /* renamed from: a */
    public final void mo34274a(Iterable iterable) {
        copyOnWrite();
        C29690f fVar = (C29690f) this.instance;
        C29690f fVar2 = C29690f.f80408m;
        fVar.mo34847a();
        C62947c.addAll(iterable, (List) fVar.f80416g);
    }

    /* renamed from: b */
    public final void mo34275b(C28595b bVar) {
        copyOnWrite();
        C29690f fVar = (C29690f) this.instance;
        C29690f fVar2 = C29690f.f80408m;
        bVar.getClass();
        fVar.mo34847a();
        fVar.f80416g.add(bVar);
    }
}
