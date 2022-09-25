package com.google.android.apps.search.googleapp.googleappbrowser;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10277e.C135670l;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136043aa;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136102t;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.aj */
/* compiled from: PG */
public final /* synthetic */ class C135486aj implements C136043aa {

    /* renamed from: a */
    public final /* synthetic */ AccountId f369113a;

    public /* synthetic */ C135486aj(AccountId accountId) {
        this.f369113a = accountId;
    }

    /* renamed from: a */
    public final Fragment mo112368a(C136102t tVar) {
        AccountId accountId = this.f369113a;
        C135670l lVar = new C135670l();
        C68324h.m98669f(lVar);
        C47247a.m84047b(lVar, accountId);
        return lVar;
    }
}
