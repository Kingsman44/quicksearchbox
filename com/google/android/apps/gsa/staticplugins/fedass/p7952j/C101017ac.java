package com.google.android.apps.gsa.staticplugins.fedass.p7952j;

import android.accounts.Account;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.j.ac */
/* compiled from: PG */
public final /* synthetic */ class C101017ac implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C101019ae f282120a;

    /* renamed from: b */
    public final /* synthetic */ Account f282121b;

    public /* synthetic */ C101017ac(C101019ae aeVar, Account account) {
        this.f282120a = aeVar;
        this.f282121b = account;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C101019ae aeVar = this.f282120a;
        Account account = this.f282121b;
        Optional optional = (Optional) aeVar.f282125c.mo17428b();
        if (!optional.isPresent()) {
            return C60856cj.m92899h(new IllegalStateException("TrainingCacheEntryPoint cannot be absent"));
        }
        return C100742h.m166943a(new C101074y(aeVar, account)).mo92035e(new C101075z(account, optional)).mo92035e(new C101015aa(aeVar, account)).f281631a;
    }
}
