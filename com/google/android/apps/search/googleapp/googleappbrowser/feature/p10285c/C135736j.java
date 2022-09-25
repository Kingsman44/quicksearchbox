package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10285c;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.googleappbrowser.p10306h.C136012b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.c.j */
/* compiled from: PG */
public final class C135736j implements C136012b {

    /* renamed from: a */
    final /* synthetic */ AccountId f369720a;

    public C135736j(AccountId accountId) {
        this.f369720a = accountId;
    }

    /* renamed from: a */
    public final Fragment mo112367a() {
        AccountId accountId = this.f369720a;
        C135727b bVar = new C135727b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        return bVar;
    }
}
