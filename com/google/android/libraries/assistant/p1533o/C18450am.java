package com.google.android.libraries.assistant.p1533o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63088z;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.o.am */
/* compiled from: PG */
public final class C18450am extends C62934bn implements C63001dt {
    public C18450am() {
        super(C18451an.f52363e);
    }

    /* renamed from: a */
    public final void mo23990a(Iterable iterable) {
        copyOnWrite();
        C18451an anVar = (C18451an) this.instance;
        C18451an anVar2 = C18451an.f52363e;
        anVar.mo23992a();
        C62947c.addAll(iterable, (List) anVar.f52365a);
    }

    /* renamed from: b */
    public final void mo23991b(C63088z zVar) {
        copyOnWrite();
        C18451an anVar = (C18451an) this.instance;
        C18451an anVar2 = C18451an.f52363e;
        zVar.getClass();
        C62971cq cqVar = anVar.f52366b;
        if (!cqVar.mo58948c()) {
            anVar.f52366b = C62942bv.mutableCopy(cqVar);
        }
        anVar.f52366b.add(zVar);
    }
}
