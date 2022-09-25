package com.google.android.apps.gsa.staticplugins.p7816dl.p7818b;

import com.google.android.apps.gsa.nowoverlayservice.p6423b.C83465m;
import com.google.android.apps.gsa.nowoverlayservice.p6423b.C83466n;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.b.z */
/* compiled from: PG */
public final /* synthetic */ class C99675z implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C99649af f278952a;

    public /* synthetic */ C99675z(C99649af afVar) {
        this.f278952a = afVar;
    }

    public final Object apply(Object obj) {
        C99649af afVar = this.f278952a;
        C83465m mVar = (C83465m) ((C83466n) obj).toBuilder();
        String str = (String) ((C99652c) afVar.f278843a).f278888h.f63720e;
        mVar.copyOnWrite();
        C83466n nVar = (C83466n) mVar.instance;
        str.getClass();
        nVar.f227530a |= 1;
        nVar.f227531b = str;
        long b = afVar.f278853k.mo26870b();
        mVar.copyOnWrite();
        C83466n nVar2 = (C83466n) mVar.instance;
        nVar2.f227530a |= 2;
        nVar2.f227532c = b;
        return (C83466n) mVar.build();
    }
}
