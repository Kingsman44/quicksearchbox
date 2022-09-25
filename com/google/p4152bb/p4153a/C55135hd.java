package com.google.p4152bb.p4153a;

import com.google.protobuf.C62936bp;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62947c;
import java.util.List;

/* renamed from: com.google.bb.a.hd */
/* compiled from: PG */
public final class C55135hd extends C62936bp implements C62938br {
    public C55135hd() {
        super(C55136he.f145130j);
    }

    /* renamed from: a */
    public final C55134hc mo54198a(int i) {
        return (C55134hc) ((C55136he) this.instance).f145138g.get(i);
    }

    /* renamed from: b */
    public final void mo54199b(Iterable iterable) {
        copyOnWrite();
        C55136he heVar = (C55136he) this.instance;
        C55136he heVar2 = C55136he.f145130j;
        heVar.mo54201a();
        C62947c.addAll(iterable, (List) heVar.f145138g);
    }

    /* renamed from: c */
    public final void mo54200c(int i, C55130gz gzVar) {
        copyOnWrite();
        C55136he heVar = (C55136he) this.instance;
        C55134hc hcVar = (C55134hc) gzVar.build();
        C55136he heVar2 = C55136he.f145130j;
        hcVar.getClass();
        heVar.mo54201a();
        heVar.f145138g.set(i, hcVar);
    }
}
