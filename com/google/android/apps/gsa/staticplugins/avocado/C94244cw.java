package com.google.android.apps.gsa.staticplugins.avocado;

import android.accounts.Account;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3861at.C50144me;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.p4526f.C59052c;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.cw */
/* compiled from: PG */
public final /* synthetic */ class C94244cw implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C94256dh f263356a;

    /* renamed from: b */
    public final /* synthetic */ Account f263357b;

    public /* synthetic */ C94244cw(C94256dh dhVar, Account account) {
        this.f263356a = dhVar;
        this.f263357b = account;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C94256dh dhVar = this.f263356a;
        Account account = this.f263357b;
        ((C59052c) ((C59052c) C94256dh.f263378a.mo56224b()).mo56372aa(14311)).mo56386p("Start to check status.");
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 512;
        acv.f128954j = true;
        return dhVar.f263394i.j(account, (acv) acu.build(), (C50144me) null, 2, TimeUnit.SECONDS, dhVar.getClass().getSimpleName());
    }
}
