package com.google.android.apps.gsa.search.core;

import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.k */
/* compiled from: PG */
public final class C86140k {

    /* renamed from: a */
    private final C68214a f232816a;

    public C86140k(C68214a aVar) {
        this.f232816a = aVar;
    }

    /* renamed from: a */
    public final void mo79786a(long j) {
        C118522by byVar = C118522by.FETCH_LOCATION_REPORTING_STATE;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 1;
        agVar.f328822b = j;
        ((C118561t) this.f232816a.mo27525b()).mo103754e(byVar, (C118472ag) afVar.build());
    }
}
