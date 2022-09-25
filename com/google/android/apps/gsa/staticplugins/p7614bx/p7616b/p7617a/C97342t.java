package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7617a;

import android.accounts.Account;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.a.t */
/* compiled from: PG */
public final /* synthetic */ class C97342t implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C97344v f271870a;

    /* renamed from: b */
    public final /* synthetic */ Account f271871b;

    public /* synthetic */ C97342t(C97344v vVar, Account account) {
        this.f271870a = vVar;
        this.f271871b = account;
    }

    public final void run() {
        C97344v vVar = this.f271870a;
        Account account = this.f271871b;
        ((C23251a) vVar.f271873a.f271793c.mo90638k()).mo28730f(C58833ax.m90833j(account).mo56106b(C97343u.f271872a), false);
        C23251a aVar = (C23251a) vVar.f271873a.f271793c.mo90629b();
        boolean z = true;
        if (account != null && vVar.f271873a.f271803m.f(account)) {
            z = false;
        }
        aVar.mo28730f(Boolean.valueOf(z), false);
    }
}
