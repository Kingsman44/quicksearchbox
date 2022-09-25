package com.google.p4283bv.p4287b.p4288a.p4322b;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.bv.b.a.b.g */
/* compiled from: PG */
public final class C56851g extends C62934bn implements C63001dt {
    public C56851g() {
        super(C56852h.f151675d);
    }

    /* renamed from: a */
    public final void mo54436a(Iterable iterable) {
        copyOnWrite();
        C56852h hVar = (C56852h) this.instance;
        C56852h hVar2 = C56852h.f151675d;
        C62961ch chVar = hVar.f151678b;
        if (!chVar.mo58948c()) {
            hVar.f151678b = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll(iterable, (List) hVar.f151678b);
    }
}
