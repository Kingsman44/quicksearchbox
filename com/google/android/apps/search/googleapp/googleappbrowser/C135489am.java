package com.google.android.apps.search.googleapp.googleappbrowser;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10277e.p10279b.C135650b;
import com.google.android.apps.search.googleapp.googleappbrowser.p10306h.C136012b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.am */
/* compiled from: PG */
public final /* synthetic */ class C135489am implements C136012b {

    /* renamed from: a */
    public final /* synthetic */ AccountId f369116a;

    public /* synthetic */ C135489am(AccountId accountId) {
        this.f369116a = accountId;
    }

    /* renamed from: a */
    public final Fragment mo112367a() {
        AccountId accountId = this.f369116a;
        C69664n.m101061g(accountId, "accountId");
        C135650b bVar = new C135650b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        return bVar;
    }
}
