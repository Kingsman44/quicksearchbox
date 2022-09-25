package com.google.android.apps.search.googleapp.googleappbrowser;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10274b.C135622d;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136043aa;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136102t;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.ad */
/* compiled from: PG */
public final /* synthetic */ class C135480ad implements C136043aa {

    /* renamed from: a */
    public final /* synthetic */ AccountId f369107a;

    public /* synthetic */ C135480ad(AccountId accountId) {
        this.f369107a = accountId;
    }

    /* renamed from: a */
    public final Fragment mo112368a(C136102t tVar) {
        AccountId accountId = this.f369107a;
        C135622d dVar = new C135622d();
        C68324h.m98669f(dVar);
        C47247a.m84047b(dVar, accountId);
        return dVar;
    }
}
