package com.google.android.apps.gsa.staticplugins.p7780de.p7782b;

import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.b.r */
/* compiled from: PG */
public final /* synthetic */ class C99421r implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C99403at f278210a;

    public /* synthetic */ C99421r(C99403at atVar) {
        this.f278210a = atVar;
    }

    public final void run() {
        C99403at atVar = this.f278210a;
        C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
        afVar.copyOnWrite();
        C118472ag agVar = (C118472ag) afVar.instance;
        agVar.f328821a |= 2;
        agVar.f328823c = 10000;
        atVar.f278118m.mo103754e(C118522by.UPDATE_SEARCHNOW_BOOTSTRAP_DATA, (C118472ag) afVar.build());
    }
}
