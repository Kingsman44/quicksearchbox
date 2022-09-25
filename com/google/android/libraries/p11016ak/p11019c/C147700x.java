package com.google.android.libraries.p11016ak.p11019c;

import com.google.android.libraries.p11016ak.C147732n;
import com.google.android.libraries.p11016ak.C147734p;
import com.google.common.base.C58817ah;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.ak.c.x */
/* compiled from: PG */
public final /* synthetic */ class C147700x implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ int f398606a;

    public /* synthetic */ C147700x(int i) {
        this.f398606a = i;
    }

    public final Object apply(Object obj) {
        int i = this.f398606a;
        C147734p pVar = (C147734p) obj;
        C147732n nVar = pVar.f398653a;
        if (nVar == null) {
            nVar = C147732n.f398646d;
        }
        if (i >= nVar.f398648a.mo59031d()) {
            return C63088z.f170246b;
        }
        C147732n nVar2 = pVar.f398653a;
        if (nVar2 == null) {
            nVar2 = C147732n.f398646d;
        }
        C63088z zVar = nVar2.f398648a;
        return zVar.mo59039k(i, zVar.mo59031d());
    }
}
