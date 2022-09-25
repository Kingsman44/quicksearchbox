package com.google.android.apps.gsa.staticplugins.fedass.p7953k;

import android.accounts.Account;
import com.google.android.apps.gsa.p6482q.p6483a.C84231d;
import com.google.android.apps.gsa.p6482q.p6483a.C84232e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.k.ac */
/* compiled from: PG */
public final /* synthetic */ class C101079ac implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101092ap f282255a;

    /* renamed from: b */
    public final /* synthetic */ Account f282256b;

    public /* synthetic */ C101079ac(C101092ap apVar, Account account) {
        this.f282255a = apVar;
        this.f282256b = account;
    }

    public final C60870cx apply(Object obj) {
        C101092ap apVar = this.f282255a;
        Account account = this.f282256b;
        if ((((C84231d) obj).mo77687b().f130407a & 4) != 0) {
            return C60866ct.f164955a;
        }
        C60870cx e = ((C84232e) apVar.f282280d.get()).mo77696e(account);
        C101090an anVar = new C101090an(apVar);
        return C60922j.m93045h(e, C47810es.m84966f(anVar), C60826bg.f164896a);
    }
}
