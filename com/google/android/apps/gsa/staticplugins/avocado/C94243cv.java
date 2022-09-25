package com.google.android.apps.gsa.staticplugins.avocado;

import android.accounts.Account;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58839bc;
import com.google.common.p4543n.p4546c.C59407o;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.cv */
/* compiled from: PG */
public final /* synthetic */ class C94243cv implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C94256dh f263352a;

    /* renamed from: b */
    public final /* synthetic */ Account f263353b;

    /* renamed from: c */
    public final /* synthetic */ C83923j f263354c;

    /* renamed from: d */
    public final /* synthetic */ C58839bc f263355d;

    public /* synthetic */ C94243cv(C94256dh dhVar, Account account, C83923j jVar, C58839bc bcVar) {
        this.f263352a = dhVar;
        this.f263353b = account;
        this.f263354c = jVar;
        this.f263355d = bcVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C94256dh dhVar = this.f263352a;
        Account account = this.f263353b;
        C83923j jVar = this.f263354c;
        C58839bc bcVar = this.f263355d;
        C60870cx b = dhVar.mo88408b(account, jVar);
        dhVar.f263388c = (int) dhVar.f263389d.mo79743a(C90082eg.f249907aW);
        Duration ofMillis = Duration.ofMillis(1000);
        dhVar.f263408w = C59407o.m92309e(C59407o.m92308d(ofMillis), dhVar.f263388c);
        return dhVar.f263392g.mo28210j(b, "check status", new C94235cn(dhVar, account, bcVar));
    }
}
