package com.google.android.apps.gsa.search.core.p6507ag.p6510c;

import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.search.core.ag.c.d */
/* compiled from: PG */
public final /* synthetic */ class C84491d implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C84492e f229953a;

    public /* synthetic */ C84491d(C84492e eVar) {
        this.f229953a = eVar;
    }

    public final void run() {
        C84492e eVar = this.f229953a;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 1;
        agVar.f328822b = 10000;
        afVar.copyOnWrite();
        C118472ag agVar2 = (C118472ag) afVar.instance;
        agVar2.f328821a |= 2;
        agVar2.f328823c = 10000;
        eVar.f229954a.mo103754e(C118522by.UPDATE_SEARCHNOW_BOOTSTRAP_DATA, (C118472ag) afVar.build());
    }
}
