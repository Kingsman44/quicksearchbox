package com.google.android.apps.search.googleapp.googleappbrowser;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.googleappbrowser.p10260a.C135462h;
import com.google.android.apps.search.googleapp.p10527u.C139770k;
import com.google.android.apps.search.googleapp.p10527u.C139771l;
import com.google.apps.tiktok.account.AccountId;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.ac */
/* compiled from: PG */
public final /* synthetic */ class C135479ac implements C139771l {

    /* renamed from: a */
    public final /* synthetic */ AccountId f369106a;

    public /* synthetic */ C135479ac(AccountId accountId) {
        this.f369106a = accountId;
    }

    /* renamed from: a */
    public final Fragment mo111217a(C139770k kVar) {
        C135462h hVar;
        AccountId accountId = this.f369106a;
        if (kVar.f379884a == 4) {
            hVar = (C135462h) kVar.f379885b;
        } else {
            hVar = C135462h.f369059n;
        }
        return GoogleAppBrowserCoordinatorFragment.m219623a(accountId, hVar);
    }
}
