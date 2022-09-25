package com.google.assistant.p4008y.p4009a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import java.util.Iterator;

/* renamed from: com.google.assistant.y.a.ai */
/* compiled from: PG */
public final class C53549ai extends C62934bn implements C63001dt {
    public C53549ai() {
        super(C53550aj.f140536b);
    }

    /* renamed from: a */
    public final void mo53996a(Iterable iterable) {
        copyOnWrite();
        C53550aj ajVar = (C53550aj) this.instance;
        C53550aj ajVar2 = C53550aj.f140536b;
        C62961ch chVar = ajVar.f140538a;
        if (!chVar.mo58948c()) {
            ajVar.f140538a = C62942bv.mutableCopy(chVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ajVar.f140538a.mo58916g(((C53556ap) it.next()).f140559j);
        }
    }
}
