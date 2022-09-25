package com.google.p4152bb.p4153a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import java.util.Iterator;

/* renamed from: com.google.bb.a.fk */
/* compiled from: PG */
public final class C55088fk extends C62934bn implements C63001dt {
    public C55088fk() {
        super(C55089fl.f144954j);
    }

    /* renamed from: a */
    public final void mo54186a(Iterable iterable) {
        copyOnWrite();
        C55089fl flVar = (C55089fl) this.instance;
        C62962ci ciVar = C55089fl.f144953f;
        flVar.mo54189b();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            flVar.f144960e.mo58916g(((C55084fg) it.next()).f144948h);
        }
    }

    /* renamed from: b */
    public final void mo54187b(String str) {
        copyOnWrite();
        C55089fl flVar = (C55089fl) this.instance;
        C62962ci ciVar = C55089fl.f144953f;
        str.getClass();
        flVar.mo54188a();
        flVar.f144957b.add(str);
    }
}
