package com.google.android.libraries.assistant.p1594s.p1599c;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.libraries.assistant.s.c.e */
/* compiled from: PG */
public final class C19203e extends C62934bn implements C63001dt {
    public C19203e() {
        super(C19204f.f53768f);
    }

    /* renamed from: a */
    public final void mo24314a(String str) {
        copyOnWrite();
        C19204f fVar = (C19204f) this.instance;
        C19204f fVar2 = C19204f.f53768f;
        str.getClass();
        C62971cq cqVar = fVar.f53774e;
        if (!cqVar.mo58948c()) {
            fVar.f53774e = C62942bv.mutableCopy(cqVar);
        }
        fVar.f53774e.add(str);
    }
}
