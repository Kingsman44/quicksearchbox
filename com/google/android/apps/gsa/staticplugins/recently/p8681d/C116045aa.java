package com.google.android.apps.gsa.staticplugins.recently.p8681d;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.google.gaia.C86052m;
import com.google.android.apps.search.googleapp.p10117aa.C133106ax;
import com.google.android.apps.search.googleapp.p10117aa.C133111ba;
import com.google.android.apps.search.googleapp.p10117aa.C133112bb;
import com.google.android.apps.search.googleapp.p10117aa.C133113bc;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.d.aa */
/* compiled from: PG */
public final class C116045aa extends C86052m {

    /* renamed from: a */
    private final C133113bc f321790a;

    /* renamed from: b */
    private Account f321791b;

    public C116045aa(C133113bc bcVar) {
        this.f321790a = bcVar;
    }

    /* renamed from: iQ */
    public final void mo17551iQ(Account account) {
        if (account != null && this.f321791b == null) {
            C133113bc bcVar = this.f321790a;
            C60870cx e = bcVar.f362904c.mo50248e();
            C133111ba baVar = C133111ba.f362900a;
            C60870cx g = C60922j.m93044g(e, C47810es.m84963c(baVar), bcVar.f362905d);
            C133106ax axVar = new C133106ax(bcVar);
            C60870cx h = C60922j.m93045h(g, C47810es.m84966f(axVar), bcVar.f362905d);
            C133112bb bbVar = new C133112bb();
            C60856cj.m92911t(h, C47810es.m84974n(bbVar), C60826bg.f164896a);
        }
        this.f321791b = account;
    }
}
