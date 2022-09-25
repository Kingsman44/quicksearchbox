package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ay */
/* compiled from: PG */
public final class C14214ay extends C62934bn implements C63001dt {
    public C14214ay() {
        super(C14215az.f43002c);
    }

    /* renamed from: a */
    public final void mo21539a(Iterable iterable) {
        copyOnWrite();
        C14215az azVar = (C14215az) this.instance;
        C14215az azVar2 = C14215az.f43002c;
        C62971cq cqVar = azVar.f43004a;
        if (!cqVar.mo58948c()) {
            azVar.f43004a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) azVar.f43004a);
    }
}
