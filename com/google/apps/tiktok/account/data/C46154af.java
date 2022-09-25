package com.google.apps.tiktok.account.data;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60866ct;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.account.data.af */
/* compiled from: PG */
final class C46154af implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C46155ag f121066a;

    public C46154af(C46155ag agVar) {
        this.f121066a = agVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        for (C46169au auVar : (Set) this.f121066a.f121072f.mo17428b()) {
            auVar.f121095a.mo50252a();
            C46459k.m82829b(C60866ct.f164955a, "AvailableAccountsInvalidatedObserver failed", new Object[0]);
        }
    }
}
