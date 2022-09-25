package com.google.audio.p4107b.p4108a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.audio.b.a.e */
/* compiled from: PG */
public final class C54582e extends C62934bn implements C63001dt {
    public C54582e() {
        super(C54584g.f143307f);
    }

    /* renamed from: a */
    public final void mo54135a(int i) {
        copyOnWrite();
        C54584g gVar = (C54584g) this.instance;
        C54584g gVar2 = C54584g.f143307f;
        C62961ch chVar = gVar.f143310b;
        if (!chVar.mo58948c()) {
            gVar.f143310b = C62942bv.mutableCopy(chVar);
        }
        gVar.f143310b.mo58916g(i - 1);
    }
}
