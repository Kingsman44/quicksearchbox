package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.assistant.shared.n.p;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ae */
/* compiled from: PG */
public final /* synthetic */ class C96074ae implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C96082am f268987a;

    /* renamed from: b */
    public final /* synthetic */ Account f268988b;

    /* renamed from: c */
    public final /* synthetic */ String f268989c;

    /* renamed from: d */
    public final /* synthetic */ Duration f268990d;

    public /* synthetic */ C96074ae(C96082am amVar, Account account, String str, Duration duration) {
        this.f268987a = amVar;
        this.f268988b = account;
        this.f268989c = str;
        this.f268990d = duration;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C96082am amVar = this.f268987a;
        Account account = this.f268988b;
        String str = this.f268989c;
        Duration duration = this.f268990d;
        p pVar = new p();
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 128;
        acv.f128952h = true;
        pVar.e((acv) acu.build());
        return C60846c.m92879h(C60922j.m93044g(C60838bs.m92859i(((l) amVar.f269006d.mo27525b()).a(pVar, duration.toMillis(), TimeUnit.MILLISECONDS)), C96079aj.f268998a, C60826bg.f164896a), Throwable.class, new C96080ak(amVar, account, str, duration), amVar.f269007e.mo85211d("bisto"));
    }
}
