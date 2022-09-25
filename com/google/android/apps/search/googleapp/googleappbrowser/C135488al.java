package com.google.android.apps.search.googleapp.googleappbrowser;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10280f.C135681b;
import com.google.android.apps.search.googleapp.googleappbrowser.p10306h.C136012b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.al */
/* compiled from: PG */
public final /* synthetic */ class C135488al implements C136012b {

    /* renamed from: a */
    public final /* synthetic */ AccountId f369115a;

    public /* synthetic */ C135488al(AccountId accountId) {
        this.f369115a = accountId;
    }

    /* renamed from: a */
    public final Fragment mo112367a() {
        AccountId accountId = this.f369115a;
        C135681b bVar = new C135681b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        return bVar;
    }
}
