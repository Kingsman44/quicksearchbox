package com.google.p4152bb.p4153a;

import com.google.protobuf.C62936bp;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62947c;
import java.util.List;

/* renamed from: com.google.bb.a.kv */
/* compiled from: PG */
public final class C55234kv extends C62936bp implements C62938br {
    public C55234kv() {
        super(C55235kw.f145426i);
    }

    /* renamed from: a */
    public final C55247lh mo54209a(int i) {
        return (C55247lh) ((C55235kw) this.instance).f145431c.get(i);
    }

    /* renamed from: b */
    public final C55029df mo54210b(int i) {
        return (C55029df) ((C55235kw) this.instance).f145434f.get(i);
    }

    /* renamed from: c */
    public final void mo54211c(Iterable iterable) {
        copyOnWrite();
        C55235kw kwVar = (C55235kw) this.instance;
        C55235kw kwVar2 = C55235kw.f145426i;
        kwVar.mo54214b();
        C62947c.addAll(iterable, (List) kwVar.f145434f);
    }

    /* renamed from: d */
    public final void mo54212d(C55247lh lhVar) {
        copyOnWrite();
        C55235kw kwVar = (C55235kw) this.instance;
        C55235kw kwVar2 = C55235kw.f145426i;
        lhVar.getClass();
        kwVar.mo54213a();
        kwVar.f145431c.add(lhVar);
    }
}
