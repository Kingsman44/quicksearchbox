package com.google.android.libraries.p10923ac.p10925b.p10934e.p10936b;

import com.google.common.base.C58817ah;
import com.google.protobuf.C63088z;
import com.google.protos.p4895aw.p4902b.C64029cl;
import com.google.protos.p4895aw.p4902b.C64031cn;
import com.google.protos.p4895aw.p4902b.C64042cy;
import com.google.protos.p4895aw.p4902b.C64043cz;

/* renamed from: com.google.android.libraries.ac.b.e.b.am */
/* compiled from: PG */
public final /* synthetic */ class C146871am implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C146871am f396467a = new C146871am();

    private /* synthetic */ C146871am() {
    }

    public final Object apply(Object obj) {
        C64043cz czVar = (C64043cz) obj;
        C64029cl clVar = (C64029cl) C64031cn.f173137d.createBuilder();
        C63088z zVar = czVar.f173165b;
        clVar.copyOnWrite();
        C64031cn cnVar = (C64031cn) clVar.instance;
        zVar.getClass();
        int i = 1;
        cnVar.f173139a |= 1;
        cnVar.f173140b = zVar;
        int a = C64042cy.m96339a(czVar.f173166c);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            i = 2;
        } else if (i2 == 2) {
            i = 3;
        }
        clVar.copyOnWrite();
        C64031cn cnVar2 = (C64031cn) clVar.instance;
        cnVar2.f173141c = i - 1;
        cnVar2.f173139a = 2 | cnVar2.f173139a;
        return (C64031cn) clVar.build();
    }
}
