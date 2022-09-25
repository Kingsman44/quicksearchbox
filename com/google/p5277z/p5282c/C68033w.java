package com.google.p5277z.p5282c;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.z.c.w */
/* compiled from: PG */
public final class C68033w extends C62934bn implements C63001dt {
    public C68033w() {
        super(C68036z.f184326f);
    }

    /* renamed from: a */
    public final void mo60080a(int i) {
        copyOnWrite();
        C68036z zVar = (C68036z) this.instance;
        C68036z zVar2 = C68036z.f184326f;
        C62961ch chVar = zVar.f184331d;
        if (!chVar.mo58948c()) {
            zVar.f184331d = C62942bv.mutableCopy(chVar);
        }
        zVar.f184331d.mo58916g(i - 1);
    }
}
