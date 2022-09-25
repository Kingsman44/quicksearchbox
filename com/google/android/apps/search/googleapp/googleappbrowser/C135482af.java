package com.google.android.apps.search.googleapp.googleappbrowser;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g.C135830e;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136043aa;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136102t;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.af */
/* compiled from: PG */
public final /* synthetic */ class C135482af implements C136043aa {

    /* renamed from: a */
    public final /* synthetic */ AccountId f369109a;

    public /* synthetic */ C135482af(AccountId accountId) {
        this.f369109a = accountId;
    }

    /* renamed from: a */
    public final Fragment mo112368a(C136102t tVar) {
        AccountId accountId = this.f369109a;
        C135830e eVar = new C135830e();
        C68324h.m98669f(eVar);
        C47247a.m84047b(eVar, accountId);
        return eVar;
    }
}
