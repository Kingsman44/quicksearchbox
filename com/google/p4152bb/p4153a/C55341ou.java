package com.google.p4152bb.p4153a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.bb.a.ou */
/* compiled from: PG */
public final class C55341ou extends C62934bn implements C63001dt {
    public C55341ou() {
        super(C55342ov.f145806b);
    }

    /* renamed from: a */
    public final void mo54245a(Iterable iterable) {
        copyOnWrite();
        C55342ov ovVar = (C55342ov) this.instance;
        C55342ov ovVar2 = C55342ov.f145806b;
        ovVar.mo54247a();
        C62947c.addAll(iterable, (List) ovVar.f145809a);
    }

    /* renamed from: b */
    public final void mo54246b(String str) {
        copyOnWrite();
        C55342ov ovVar = (C55342ov) this.instance;
        C55342ov ovVar2 = C55342ov.f145806b;
        str.getClass();
        ovVar.mo54247a();
        ovVar.f145809a.add(str);
    }
}
