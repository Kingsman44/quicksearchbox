package com.google.android.apps.search.googleapp.googleappbrowser;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.p10527u.C139770k;
import com.google.android.apps.search.googleapp.p10527u.C139771l;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.ab */
/* compiled from: PG */
public final /* synthetic */ class C135478ab implements C139771l {

    /* renamed from: a */
    public final /* synthetic */ AccountId f369105a;

    public /* synthetic */ C135478ab(AccountId accountId) {
        this.f369105a = accountId;
    }

    /* renamed from: a */
    public final Fragment mo111217a(C139770k kVar) {
        C135462h hVar;
        AccountId accountId = this.f369105a;
        if (kVar.f379884a == 4) {
            hVar = (C135462h) kVar.f379885b;
        } else {
            hVar = C135462h.f369059n;
        }
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(hVar, "params");
        GoogleAppBrowserNavigationRootFragment googleAppBrowserNavigationRootFragment = new GoogleAppBrowserNavigationRootFragment();
        C68324h.m98669f(googleAppBrowserNavigationRootFragment);
        C47247a.m84047b(googleAppBrowserNavigationRootFragment, accountId);
        C47243l.m84039a(googleAppBrowserNavigationRootFragment, hVar);
        return googleAppBrowserNavigationRootFragment;
    }
}
