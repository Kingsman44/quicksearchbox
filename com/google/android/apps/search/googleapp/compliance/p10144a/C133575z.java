package com.google.android.apps.search.googleapp.compliance.p10144a;

import com.google.common.base.C58817ah;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;

/* renamed from: com.google.android.apps.search.googleapp.compliance.a.z */
/* compiled from: PG */
public final /* synthetic */ class C133575z implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C133543al f363917a;

    public /* synthetic */ C133575z(C133543al alVar) {
        this.f363917a = alVar;
    }

    public final Object apply(Object obj) {
        C133543al alVar = this.f363917a;
        C133545an anVar = (C133545an) ((C133546ao) obj).toBuilder();
        anVar.copyOnWrite();
        C133546ao aoVar = (C133546ao) anVar.instance;
        aoVar.f363861a |= 1;
        aoVar.f363862b = true;
        C63042fg b = C62950b.m95471b(alVar.f363853f);
        anVar.copyOnWrite();
        C133546ao aoVar2 = (C133546ao) anVar.instance;
        b.getClass();
        aoVar2.f363865e = b;
        aoVar2.f363861a |= 8;
        return (C133546ao) anVar.build();
    }
}
