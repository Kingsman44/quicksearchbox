package com.google.android.apps.search.googleapp.googleappbrowser;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10283i.C135710d;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136043aa;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136102t;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.ag */
/* compiled from: PG */
public final /* synthetic */ class C135483ag implements C136043aa {

    /* renamed from: a */
    public final /* synthetic */ AccountId f369110a;

    public /* synthetic */ C135483ag(AccountId accountId) {
        this.f369110a = accountId;
    }

    /* renamed from: a */
    public final Fragment mo112368a(C136102t tVar) {
        AccountId accountId = this.f369110a;
        C135710d dVar = new C135710d();
        C68324h.m98669f(dVar);
        C47247a.m84047b(dVar, accountId);
        return dVar;
    }
}
