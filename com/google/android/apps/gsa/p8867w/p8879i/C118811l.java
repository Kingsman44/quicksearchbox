package com.google.android.apps.gsa.p8867w.p8879i;

import com.google.android.apps.gsa.shared.p6995aq.C89260c;
import com.google.android.apps.gsa.shared.p6995aq.C89261d;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.w.i.l */
/* compiled from: PG */
public final /* synthetic */ class C118811l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ long f331383a;

    public /* synthetic */ C118811l(long j) {
        this.f331383a = j;
    }

    public final Object apply(Object obj) {
        long j = this.f331383a;
        C89261d dVar = (C89261d) obj;
        if (j < 0) {
            C89260c cVar = (C89260c) dVar.toBuilder();
            cVar.copyOnWrite();
            C89261d dVar2 = (C89261d) cVar.instance;
            dVar2.f242035a &= -2;
            dVar2.f242036b = 0;
            return (C89261d) cVar.build();
        }
        C89260c cVar2 = (C89260c) dVar.toBuilder();
        cVar2.copyOnWrite();
        C89261d dVar3 = (C89261d) cVar2.instance;
        dVar3.f242035a |= 1;
        dVar3.f242036b = j;
        return (C89261d) cVar2.build();
    }
}
