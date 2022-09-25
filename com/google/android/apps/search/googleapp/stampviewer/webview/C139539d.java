package com.google.android.apps.search.googleapp.stampviewer.webview;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.stampviewer.p10494f.C139392b;
import com.google.android.libraries.web.base.C43264o;
import com.google.apps.tiktok.account.AccountId;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.d */
/* compiled from: PG */
public final class C139539d {

    /* renamed from: a */
    public final C139392b f379374a;

    /* renamed from: b */
    public final AccountId f379375b;

    /* renamed from: c */
    public final Fragment f379376c;

    /* renamed from: d */
    public final C139505a f379377d;

    public C139539d(C139392b bVar, AccountId accountId, Fragment fragment, C139505a aVar) {
        this.f379374a = bVar;
        this.f379375b = accountId;
        this.f379376c = fragment;
        this.f379377d = aVar;
    }

    /* renamed from: a */
    public final C139618h mo115043a() {
        C43264o oVar = (C43264o) this.f379376c.getChildFragmentManager().f634a.mo671c("web-coordinator");
        if (oVar == null) {
            return null;
        }
        return (C139618h) oVar.mo17754z().mo46379a();
    }
}
