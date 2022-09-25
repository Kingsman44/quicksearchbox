package com.google.android.apps.gsa.searchbox.client.gsa.p6951a;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.a.d */
/* compiled from: PG */
public final /* synthetic */ class C88631d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C88632e f239596a;

    public /* synthetic */ C88631d(C88632e eVar) {
        this.f239596a = eVar;
    }

    public final Object apply(Object obj) {
        C88632e eVar = this.f239596a;
        C88640m mVar = (C88640m) ((C88641n) obj).toBuilder();
        int i = eVar.f239599c;
        mVar.copyOnWrite();
        C88641n nVar = (C88641n) mVar.instance;
        int i2 = i - 1;
        if (i != 0) {
            nVar.f239633b = i2;
            nVar.f239632a |= 1;
            mVar.copyOnWrite();
            C88641n nVar2 = (C88641n) mVar.instance;
            nVar2.f239632a |= 2;
            nVar2.f239634c = false;
            return (C88641n) mVar.build();
        }
        throw null;
    }
}
