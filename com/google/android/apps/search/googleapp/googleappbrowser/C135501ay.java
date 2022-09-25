package com.google.android.apps.search.googleapp.googleappbrowser;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10300n.C135895b;
import com.google.android.apps.search.googleapp.googleappbrowser.p10306h.C136012b;
import com.google.android.libraries.web.contrib.p3390j.p3396d.C43664l;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.ay */
/* compiled from: PG */
public final /* synthetic */ class C135501ay implements C136012b {

    /* renamed from: a */
    public final /* synthetic */ AccountId f369128a;

    /* renamed from: b */
    public final /* synthetic */ C43664l f369129b;

    public /* synthetic */ C135501ay(AccountId accountId, C43664l lVar) {
        this.f369128a = accountId;
        this.f369129b = lVar;
    }

    /* renamed from: a */
    public final Fragment mo112367a() {
        AccountId accountId = this.f369128a;
        C43664l lVar = this.f369129b;
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(lVar, "urlBarFragmentArgument");
        C135895b bVar = new C135895b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        C47243l.m84039a(bVar, lVar);
        return bVar;
    }
}
