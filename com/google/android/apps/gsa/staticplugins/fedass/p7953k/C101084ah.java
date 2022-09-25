package com.google.android.apps.gsa.staticplugins.fedass.p7953k;

import android.accounts.Account;
import com.google.android.apps.gsa.p6482q.p6483a.C84232e;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.k.ah */
/* compiled from: PG */
public final /* synthetic */ class C101084ah implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101092ap f282265a;

    /* renamed from: b */
    public final /* synthetic */ Account f282266b;

    public /* synthetic */ C101084ah(C101092ap apVar, Account account) {
        this.f282265a = apVar;
        this.f282266b = account;
    }

    public final C60870cx apply(Object obj) {
        C101092ap apVar = this.f282265a;
        Account account = this.f282266b;
        C60870cx b = ((C84232e) apVar.f282280d.get()).mo77693b(account.name);
        C101089am amVar = new C101089am(apVar, account, (C132800h) obj);
        return C60922j.m93045h(b, C47810es.m84966f(amVar), C60826bg.f164896a);
    }
}
