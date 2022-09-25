package com.google.android.apps.gsa.search.core.udc;

import android.accounts.Account;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.search.core.udc.b */
/* compiled from: PG */
public final /* synthetic */ class C87206b implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C87215k f235619a;

    /* renamed from: b */
    public final /* synthetic */ Account f235620b;

    public /* synthetic */ C87206b(C87215k kVar, Account account) {
        this.f235619a = kVar;
        this.f235620b = account;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C87215k kVar = this.f235619a;
        return C60922j.m93044g(C60846c.m92879h(C60838bs.m92859i(kVar.mo80841a(this.f235620b).mo124235c()), Exception.class, new C87212h(kVar), C60826bg.f164896a), new C87213i(kVar), C60826bg.f164896a);
    }
}
