package com.google.p5238v.p5239a;

import com.google.p5238v.p5239a.p5255j.C67723cz;
import com.google.p5238v.p5239a.p5255j.C67725da;
import com.google.p5238v.p5239a.p5255j.C67742dr;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.r */
/* compiled from: PG */
public final class C67902r {

    /* renamed from: a */
    public final C67725da f184083a;

    private C67902r(C67725da daVar) {
        this.f184083a = daVar;
    }

    /* renamed from: a */
    public static C67902r m98165a(String str, byte[] bArr, int i) {
        C67723cz czVar = (C67723cz) C67725da.f183749d.createBuilder();
        czVar.copyOnWrite();
        str.getClass();
        ((C67725da) czVar.instance).f183751a = str;
        C63088z A = C63088z.m96139A(bArr);
        czVar.copyOnWrite();
        ((C67725da) czVar.instance).f183752b = A;
        int i2 = i - 1;
        C67742dr drVar = i2 != 0 ? i2 != 1 ? C67742dr.RAW : C67742dr.LEGACY : C67742dr.TINK;
        czVar.copyOnWrite();
        ((C67725da) czVar.instance).f183753c = drVar.getNumber();
        return new C67902r((C67725da) czVar.build());
    }
}
