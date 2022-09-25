package com.google.common.p4552o;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.common.o.od */
/* compiled from: PG */
public final class C60320od extends C62934bn implements C63001dt {
    public C60320od() {
        super(C60321oe.f163224i);
    }

    /* renamed from: a */
    public final aqs mo57081a(int i) {
        return (aqs) ((C60321oe) this.instance).f163228c.get(i);
    }

    /* renamed from: b */
    public final void mo57082b(aqp aqp) {
        copyOnWrite();
        C60321oe oeVar = (C60321oe) this.instance;
        aqs aqs = (aqs) aqp.build();
        C60321oe oeVar2 = C60321oe.f163224i;
        aqs.getClass();
        oeVar.mo57085a();
        oeVar.f163228c.add(aqs);
    }

    /* renamed from: c */
    public final void mo57083c(aqs aqs) {
        copyOnWrite();
        C60321oe oeVar = (C60321oe) this.instance;
        C60321oe oeVar2 = C60321oe.f163224i;
        aqs.getClass();
        oeVar.mo57085a();
        oeVar.f163228c.add(aqs);
    }

    /* renamed from: d */
    public final void mo57084d(int i, aqs aqs) {
        copyOnWrite();
        C60321oe oeVar = (C60321oe) this.instance;
        C60321oe oeVar2 = C60321oe.f163224i;
        aqs.getClass();
        oeVar.mo57085a();
        oeVar.f163228c.set(i, aqs);
    }
}
