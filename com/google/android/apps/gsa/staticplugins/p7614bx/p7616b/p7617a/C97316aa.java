package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7617a;

import com.google.android.apps.gsa.staticplugins.p7614bx.p7621d.C97425f;
import com.google.android.apps.gsa.staticplugins.p7614bx.p7621d.C97426g;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C97316aa implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C97319ad f271776a;

    public /* synthetic */ C97316aa(C97319ad adVar) {
        this.f271776a = adVar;
    }

    public final Object apply(Object obj) {
        C97319ad adVar = this.f271776a;
        C97425f fVar = (C97425f) ((C97426g) obj).toBuilder();
        fVar.copyOnWrite();
        C97426g gVar = (C97426g) fVar.instance;
        gVar.f272071a = true;
        if (gVar.f272072b == 0) {
            long b = adVar.f271779a.f271798h.mo26870b();
            fVar.copyOnWrite();
            ((C97426g) fVar.instance).f272072b = b;
        }
        return (C97426g) fVar.build();
    }
}
