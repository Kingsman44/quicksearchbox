package com.google.p4653i.p4654a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.i.a.av */
/* compiled from: PG */
public final class C61681av extends C62934bn implements C63001dt {
    public C61681av() {
        super(C61682aw.f166628d);
    }

    /* renamed from: a */
    public final void mo58170a(int i) {
        copyOnWrite();
        C61682aw awVar = (C61682aw) this.instance;
        C61682aw awVar2 = C61682aw.f166628d;
        if (i != 0) {
            C62961ch chVar = awVar.f166632c;
            if (!chVar.mo58948c()) {
                awVar.f166632c = C62942bv.mutableCopy(chVar);
            }
            awVar.f166632c.mo58916g(i);
            return;
        }
        throw null;
    }
}
