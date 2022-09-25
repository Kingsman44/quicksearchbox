package com.google.android.apps.gsa.search.core.p6805i;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.i.f */
/* compiled from: PG */
public final class C86110f extends C62934bn implements C63001dt {
    public C86110f() {
        super(C86111g.f232741g);
    }

    /* renamed from: a */
    public final void mo79729a(Iterable iterable) {
        copyOnWrite();
        C86111g gVar = (C86111g) this.instance;
        C86111g gVar2 = C86111g.f232741g;
        C62961ch chVar = gVar.f232746d;
        if (!chVar.mo58948c()) {
            gVar.f232746d = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll(iterable, (List) gVar.f232746d);
    }

    /* renamed from: b */
    public final void mo79730b(Iterable iterable) {
        copyOnWrite();
        C86111g gVar = (C86111g) this.instance;
        C86111g gVar2 = C86111g.f232741g;
        gVar.mo79732a();
        C62947c.addAll(iterable, (List) gVar.f232744b);
    }

    /* renamed from: c */
    public final void mo79731c(Iterable iterable) {
        copyOnWrite();
        C86111g gVar = (C86111g) this.instance;
        C86111g gVar2 = C86111g.f232741g;
        C62961ch chVar = gVar.f232747e;
        if (!chVar.mo58948c()) {
            gVar.f232747e = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll(iterable, (List) gVar.f232747e);
    }
}
