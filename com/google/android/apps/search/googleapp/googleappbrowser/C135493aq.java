package com.google.android.apps.search.googleapp.googleappbrowser;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10281g.C135696c;
import com.google.android.apps.search.googleapp.googleappbrowser.p10306h.C136012b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.aq */
/* compiled from: PG */
public final /* synthetic */ class C135493aq implements C136012b {

    /* renamed from: a */
    public final /* synthetic */ AccountId f369120a;

    public /* synthetic */ C135493aq(AccountId accountId) {
        this.f369120a = accountId;
    }

    /* renamed from: a */
    public final Fragment mo112367a() {
        AccountId accountId = this.f369120a;
        C69664n.m101061g(accountId, "accountId");
        C135696c cVar = new C135696c();
        C68324h.m98669f(cVar);
        C47247a.m84047b(cVar, accountId);
        return cVar;
    }
}
