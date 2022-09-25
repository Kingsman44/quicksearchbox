package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8456g;

import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3886c.C50843o;
import com.google.assistant.p3886c.C50844p;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.g.d */
/* compiled from: PG */
public final /* synthetic */ class C110689d implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C50843o f308431a;

    public /* synthetic */ C110689d(C50843o oVar) {
        this.f308431a = oVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C50843o oVar = this.f308431a;
        byte[] bArr = (byte[]) obj;
        if (bArr != null && bArr.length > 0) {
            C63088z A = C63088z.m96139A(bArr);
            oVar.copyOnWrite();
            C50844p pVar = (C50844p) oVar.instance;
            C50844p pVar2 = C50844p.f132387m;
            pVar.f132389a |= 8;
            pVar.f132393e = A;
        }
        return (C50844p) oVar.build();
    }
}
