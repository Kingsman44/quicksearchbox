package com.google.android.apps.gsa.staticplugins.fedass.p7953k;

import android.accounts.Account;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.k.ad */
/* compiled from: PG */
public final /* synthetic */ class C101080ad implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101092ap f282257a;

    /* renamed from: b */
    public final /* synthetic */ Account f282258b;

    public /* synthetic */ C101080ad(C101092ap apVar, Account account) {
        this.f282257a = apVar;
        this.f282258b = account;
    }

    public final C60870cx apply(Object obj) {
        C101092ap apVar = this.f282257a;
        Account account = this.f282258b;
        Void voidR = (Void) obj;
        if (apVar.f282280d.isEmpty()) {
            ((C59052c) ((C59052c) C101092ap.f282277a.mo56225c()).mo56372aa(19800)).mo56386p("!fedAssSettingsCallback.isPresent");
            return C60866ct.f164955a;
        }
        C60870cx e = apVar.f282279c.mo92021e(account.name);
        C101084ah ahVar = new C101084ah(apVar, account);
        return C60922j.m93045h(e, C47810es.m84966f(ahVar), C60826bg.f164896a);
    }
}
