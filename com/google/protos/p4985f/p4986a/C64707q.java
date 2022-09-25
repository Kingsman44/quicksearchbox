package com.google.protos.p4985f.p4986a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.protos.f.a.q */
/* compiled from: PG */
public final class C64707q extends C62934bn implements C63001dt {
    public C64707q() {
        super(C64708r.f175399l);
    }

    /* renamed from: a */
    public final C64661ao mo59298a(int i) {
        return (C64661ao) ((C64708r) this.instance).f175411k.get(i);
    }

    /* renamed from: b */
    public final void mo59299b(Iterable iterable) {
        copyOnWrite();
        C64708r rVar = (C64708r) this.instance;
        C64708r rVar2 = C64708r.f175399l;
        rVar.mo59304b();
        C62947c.addAll(iterable, (List) rVar.f175411k);
    }

    /* renamed from: c */
    public final void mo59300c(C64648ab abVar) {
        copyOnWrite();
        C64708r rVar = (C64708r) this.instance;
        C64708r rVar2 = C64708r.f175399l;
        abVar.getClass();
        rVar.mo59303a();
        rVar.f175404d.add(abVar);
    }

    /* renamed from: d */
    public final C64648ab mo59301d() {
        return (C64648ab) ((C64708r) this.instance).f175404d.get(0);
    }

    /* renamed from: e */
    public final void mo59302e(int i, C64661ao aoVar) {
        copyOnWrite();
        C64708r rVar = (C64708r) this.instance;
        C64708r rVar2 = C64708r.f175399l;
        aoVar.getClass();
        rVar.mo59304b();
        rVar.f175411k.set(i, aoVar);
    }
}
