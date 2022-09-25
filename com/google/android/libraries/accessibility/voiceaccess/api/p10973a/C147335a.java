package com.google.android.libraries.accessibility.voiceaccess.api.p10973a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.libraries.accessibility.voiceaccess.api.a.a */
/* compiled from: PG */
public final class C147335a extends C62934bn implements C63001dt {
    public C147335a() {
        super(C147336b.f397726f);
    }

    /* renamed from: a */
    public final void mo124107a(String str) {
        copyOnWrite();
        C147336b bVar = (C147336b) this.instance;
        C147336b bVar2 = C147336b.f397726f;
        str.getClass();
        C62971cq cqVar = bVar.f397730c;
        if (!cqVar.mo58948c()) {
            bVar.f397730c = C62942bv.mutableCopy(cqVar);
        }
        bVar.f397730c.add(str);
    }
}
