package com.google.android.libraries.assistant.assistantactions.p619a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.libraries.assistant.assistantactions.a.c */
/* compiled from: PG */
public final class C11052c extends C62934bn implements C63001dt {
    public C11052c() {
        super(C11053d.f36295b);
    }

    /* renamed from: a */
    public final void mo19519a(C11050a aVar) {
        copyOnWrite();
        C11053d dVar = (C11053d) this.instance;
        C11051b bVar = (C11051b) aVar.build();
        C11053d dVar2 = C11053d.f36295b;
        bVar.getClass();
        C62971cq cqVar = dVar.f36297a;
        if (!cqVar.mo58948c()) {
            dVar.f36297a = C62942bv.mutableCopy(cqVar);
        }
        dVar.f36297a.add(bVar);
    }
}
