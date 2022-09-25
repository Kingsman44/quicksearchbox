package com.google.android.apps.auto.p450a.p451a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.apps.auto.a.a.ay */
/* compiled from: PG */
public final class C8880ay extends C62934bn implements C63001dt {
    public C8880ay() {
        super(C8881az.f30830c);
    }

    /* renamed from: a */
    public final void mo17270a(String str) {
        copyOnWrite();
        C8881az azVar = (C8881az) this.instance;
        C8881az azVar2 = C8881az.f30830c;
        str.getClass();
        C62971cq cqVar = azVar.f30832a;
        if (!cqVar.mo58948c()) {
            azVar.f30832a = C62942bv.mutableCopy(cqVar);
        }
        azVar.f30832a.add(str);
    }
}
