package com.google.p4184bj;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.bj.i */
/* compiled from: PG */
public final class C56033i extends C62934bn implements C63001dt {
    public C56033i() {
        super(C56034j.f149219g);
    }

    /* renamed from: a */
    public final void mo54316a(Iterable iterable) {
        copyOnWrite();
        C56034j jVar = (C56034j) this.instance;
        C56034j jVar2 = C56034j.f149219g;
        C62961ch chVar = jVar.f149225e;
        if (!chVar.mo58948c()) {
            jVar.f149225e = C62942bv.mutableCopy(chVar);
        }
        C62947c.addAll(iterable, (List) jVar.f149225e);
    }
}
