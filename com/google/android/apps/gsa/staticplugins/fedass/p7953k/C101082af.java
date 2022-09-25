package com.google.android.apps.gsa.staticplugins.fedass.p7953k;

import android.accounts.Account;
import com.google.android.apps.gsa.p6482q.p6483a.C84232e;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.k.af */
/* compiled from: PG */
public final /* synthetic */ class C101082af implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101092ap f282261a;

    /* renamed from: b */
    public final /* synthetic */ Account f282262b;

    public /* synthetic */ C101082af(C101092ap apVar, Account account) {
        this.f282261a = apVar;
        this.f282262b = account;
    }

    public final C60870cx apply(Object obj) {
        C101092ap apVar = this.f282261a;
        Account account = this.f282262b;
        C132798f fVar = ((C132800h) obj).f362335c;
        if (fVar == null) {
            fVar = C132798f.f362315o;
        }
        if (!fVar.f362318b) {
            return C60866ct.f164955a;
        }
        C60870cx b = ((C84232e) apVar.f282280d.get()).mo77693b(account.name);
        C101079ac acVar = new C101079ac(apVar, account);
        return C60922j.m93045h(b, C47810es.m84966f(acVar), C60826bg.f164896a);
    }
}
