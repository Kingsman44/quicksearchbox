package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a.p7973a;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3861at.C50144me;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.a.ag */
/* compiled from: PG */
public final /* synthetic */ class C101512ag implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C101515aj f283304a;

    public /* synthetic */ C101512ag(C101515aj ajVar) {
        this.f283304a = ajVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C101515aj ajVar = this.f283304a;
        ((C59052c) ((C59052c) C101515aj.f283310b.mo56224b()).mo56372aa(20318)).mo56386p("Start to check enrollment status.");
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 512;
        acv.f128954j = true;
        return ajVar.f283311c.j(ajVar.f283314f.mo79689w(ajVar.f283313e), (acv) acu.build(), (C50144me) null, 2, TimeUnit.SECONDS, ajVar.getClass().getSimpleName());
    }
}
