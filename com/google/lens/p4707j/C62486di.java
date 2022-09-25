package com.google.lens.p4707j;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.lens.j.di */
/* compiled from: PG */
public final class C62486di extends C62934bn implements C63001dt {
    public C62486di() {
        super(C62491dn.f168710e);
    }

    /* renamed from: a */
    public final void mo58498a(Iterable iterable) {
        copyOnWrite();
        C62491dn dnVar = (C62491dn) this.instance;
        C62491dn dnVar2 = C62491dn.f168710e;
        dnVar.mo58502a();
        C62947c.addAll(iterable, (List) dnVar.f168713b);
    }

    /* renamed from: b */
    public final void mo58499b(C62487dj djVar) {
        copyOnWrite();
        C62491dn dnVar = (C62491dn) this.instance;
        C62488dk dkVar = (C62488dk) djVar.build();
        C62491dn dnVar2 = C62491dn.f168710e;
        dkVar.getClass();
        dnVar.mo58502a();
        dnVar.f168713b.add(dkVar);
    }

    /* renamed from: c */
    public final void mo58500c(C62488dk dkVar) {
        copyOnWrite();
        C62491dn dnVar = (C62491dn) this.instance;
        C62491dn dnVar2 = C62491dn.f168710e;
        dkVar.getClass();
        dnVar.mo58502a();
        dnVar.f168713b.add(dkVar);
    }
}
