package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10270a;

import android.support.p031v4.app.C0260w;
import com.google.android.libraries.web.contrib.contextmenu.C43440b;
import com.google.android.libraries.web.contrib.contextmenu.p3363b.C43446f;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.a.a */
/* compiled from: PG */
public final class C135588a implements C43440b {

    /* renamed from: a */
    private final AccountId f369327a;

    public C135588a(AccountId accountId) {
        this.f369327a = accountId;
    }

    /* renamed from: a */
    public final C0260w mo46525a(C43446f fVar) {
        AccountId accountId = this.f369327a;
        C135610c cVar = new C135610c();
        C68324h.m98669f(cVar);
        C47247a.m84047b(cVar, accountId);
        C47243l.m84039a(cVar, fVar);
        return cVar;
    }
}
