package com.google.android.apps.search.googleapp.googleappbrowser;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10304c.C135926b;
import com.google.android.apps.search.googleapp.googleappbrowser.p10306h.C136012b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.ap */
/* compiled from: PG */
public final /* synthetic */ class C135492ap implements C136012b {

    /* renamed from: a */
    public final /* synthetic */ AccountId f369119a;

    public /* synthetic */ C135492ap(AccountId accountId) {
        this.f369119a = accountId;
    }

    /* renamed from: a */
    public final Fragment mo112367a() {
        AccountId accountId = this.f369119a;
        C135926b bVar = new C135926b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        return bVar;
    }
}
