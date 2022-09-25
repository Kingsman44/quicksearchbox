package com.google.android.libraries.assistant.p1594s.p1599c;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.libraries.assistant.s.c.i */
/* compiled from: PG */
public final class C19207i extends C62934bn implements C63001dt {
    public C19207i() {
        super(C19208j.f53782h);
    }

    /* renamed from: a */
    public final void mo24316a(String str) {
        copyOnWrite();
        C19208j jVar = (C19208j) this.instance;
        C19208j jVar2 = C19208j.f53782h;
        C62971cq cqVar = jVar.f53786c;
        if (!cqVar.mo58948c()) {
            jVar.f53786c = C62942bv.mutableCopy(cqVar);
        }
        jVar.f53786c.add(str);
    }
}
