package com.google.android.apps.gsa.search.core.udc;

import android.accounts.Account;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.search.core.udc.e */
/* compiled from: PG */
public final /* synthetic */ class C87209e implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C87215k f235623a;

    /* renamed from: b */
    public final /* synthetic */ Account f235624b;

    public /* synthetic */ C87209e(C87215k kVar, Account account) {
        this.f235623a = kVar;
        this.f235624b = account;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C87215k kVar = this.f235623a;
        return C60922j.m93044g(C60846c.m92879h(C60838bs.m92859i(kVar.mo80841a(this.f235624b).mo124239g()), Exception.class, new C87210f(kVar), C60826bg.f164896a), new C87211g(kVar), C60826bg.f164896a);
    }
}
