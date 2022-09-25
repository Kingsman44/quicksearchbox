package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.assistant.p3897e.p3929l.p3930a.C52692ay;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.m */
/* compiled from: PG */
public final class C94326m extends C62934bn implements C63001dt {
    public C94326m() {
        super(C94327n.f263598g);
    }

    /* renamed from: a */
    public final void mo88461a(Iterable iterable) {
        copyOnWrite();
        C94327n nVar = (C94327n) this.instance;
        C62962ci ciVar = C94327n.f263597c;
        C62961ch chVar = nVar.f263601b;
        if (!chVar.mo58948c()) {
            nVar.f263601b = C62942bv.mutableCopy(chVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            nVar.f263601b.mo58916g(((C52692ay) it.next()).f138334n);
        }
    }
}
