package com.google.android.apps.search.googleapp.googleappbrowser;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.omnibox.C135901b;
import com.google.android.apps.search.googleapp.googleappbrowser.p10306h.C136012b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.av */
/* compiled from: PG */
public final /* synthetic */ class C135498av implements C136012b {

    /* renamed from: a */
    public final /* synthetic */ AccountId f369125a;

    public /* synthetic */ C135498av(AccountId accountId) {
        this.f369125a = accountId;
    }

    /* renamed from: a */
    public final Fragment mo112367a() {
        AccountId accountId = this.f369125a;
        C69664n.m101061g(accountId, "accountId");
        C135901b bVar = new C135901b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        return bVar;
    }
}
