package com.google.android.libraries.assistant.p1535p.p1536a.p1538b;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.assistant.p.a.b.f */
/* compiled from: PG */
public final class C18518f extends C62934bn implements C63001dt {
    public C18518f() {
        super(C18519g.f52480e);
    }

    /* renamed from: a */
    public final void mo24029a(Iterable iterable) {
        copyOnWrite();
        C18519g gVar = (C18519g) this.instance;
        C62962ci ciVar = C18519g.f52479c;
        C62961ch chVar = gVar.f52483b;
        if (!chVar.mo58948c()) {
            gVar.f52483b = C62942bv.mutableCopy(chVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            gVar.f52483b.mo58916g(((C79570b) it.next()).f218339o);
        }
    }
}
