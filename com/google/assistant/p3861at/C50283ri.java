package com.google.assistant.p3861at;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import java.util.Iterator;

/* renamed from: com.google.assistant.at.ri */
/* compiled from: PG */
public final class C50283ri extends C62934bn implements C63001dt {
    public C50283ri() {
        super(C50284rj.f130766f);
    }

    /* renamed from: a */
    public final void mo53389a(Iterable iterable) {
        copyOnWrite();
        C50284rj rjVar = (C50284rj) this.instance;
        C50284rj rjVar2 = C50284rj.f130766f;
        C62961ch chVar = rjVar.f130769b;
        if (!chVar.mo58948c()) {
            rjVar.f130769b = C62942bv.mutableCopy(chVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            rjVar.f130769b.mo58916g(((C50286rl) it.next()).f130864aL);
        }
    }
}
