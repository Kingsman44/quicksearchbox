package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.assistant.p3781ad.p3789d.p3791b.C48667ab;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.assistant.s.b.aa */
/* compiled from: PG */
public final class C19140aa extends C62934bn implements C63001dt {
    public C19140aa() {
        super(C19141ab.f53614i);
    }

    /* renamed from: a */
    public final void mo24297a(Iterable iterable) {
        copyOnWrite();
        C19141ab abVar = (C19141ab) this.instance;
        C62962ci ciVar = C19141ab.f53613f;
        C62961ch chVar = abVar.f53620e;
        if (!chVar.mo58948c()) {
            abVar.f53620e = C62942bv.mutableCopy(chVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abVar.f53620e.mo58916g(((C48667ab) it.next()).f125795r);
        }
    }
}
