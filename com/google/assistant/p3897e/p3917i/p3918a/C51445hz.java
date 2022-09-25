package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import java.util.Iterator;

/* renamed from: com.google.assistant.e.i.a.hz */
/* compiled from: PG */
public final class C51445hz extends C62934bn implements C63001dt {
    public C51445hz() {
        super(C51447ia.f133979i);
    }

    /* renamed from: a */
    public final void mo53620a(Iterable iterable) {
        copyOnWrite();
        C51447ia iaVar = (C51447ia) this.instance;
        C51447ia iaVar2 = C51447ia.f133979i;
        C62961ch chVar = iaVar.f133984d;
        if (!chVar.mo58948c()) {
            iaVar.f133984d = C62942bv.mutableCopy(chVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            iaVar.f133984d.mo58916g(((C51454ih) it.next()).f134036r);
        }
    }
}
