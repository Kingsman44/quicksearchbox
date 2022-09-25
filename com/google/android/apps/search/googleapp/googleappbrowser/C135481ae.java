package com.google.android.apps.search.googleapp.googleappbrowser;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136043aa;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.C136102t;
import com.google.android.libraries.web.contrib.p3358b.p3359a.C43393f;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.ae */
/* compiled from: PG */
public final /* synthetic */ class C135481ae implements C136043aa {

    /* renamed from: a */
    public final /* synthetic */ AccountId f369108a;

    public /* synthetic */ C135481ae(AccountId accountId) {
        this.f369108a = accountId;
    }

    /* renamed from: a */
    public final Fragment mo112368a(C136102t tVar) {
        AccountId accountId = this.f369108a;
        C69664n.m101061g(accountId, "accountId");
        C43393f fVar = new C43393f();
        C68324h.m98669f(fVar);
        C47247a.m84047b(fVar, accountId);
        return fVar;
    }
}
