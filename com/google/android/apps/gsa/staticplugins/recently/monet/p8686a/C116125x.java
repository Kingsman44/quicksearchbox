package com.google.android.apps.gsa.staticplugins.recently.monet.p8686a;

import android.accounts.Account;
import com.google.android.apps.gsa.staticplugins.recently.monet.shared.C116132e;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58831av;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.a.x */
/* compiled from: PG */
public final /* synthetic */ class C116125x implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C116126y f322023a;

    /* renamed from: b */
    public final /* synthetic */ Account f322024b;

    /* renamed from: c */
    public final /* synthetic */ C116132e f322025c;

    public /* synthetic */ C116125x(C116126y yVar, Account account, C116132e eVar) {
        this.f322023a = yVar;
        this.f322024b = account;
        this.f322025c = eVar;
    }

    public final void run() {
        C116126y yVar = this.f322023a;
        Account account = this.f322024b;
        C116132e eVar = this.f322025c;
        String str = account != null ? account.name : null;
        ((C23251a) eVar.mo102503b()).mo28730f((String) C58831av.m90830c(str, "notLoggedIn"), false);
        yVar.f322028c.mo102492i(str);
    }
}
