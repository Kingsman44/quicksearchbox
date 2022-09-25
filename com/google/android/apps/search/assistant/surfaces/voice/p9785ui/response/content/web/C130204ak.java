package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.response.content.web;

import com.google.android.libraries.search.silk.web.core.C40758l;
import com.google.android.libraries.web.base.C43264o;
import com.google.apps.tiktok.account.AccountId;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.response.content.web.ak */
/* compiled from: PG */
public final class C130204ak {

    /* renamed from: a */
    public final AccountId f356962a;

    /* renamed from: b */
    public final C130201ah f356963b;

    /* renamed from: c */
    public final C40758l f356964c;

    public C130204ak(AccountId accountId, C130201ah ahVar, C40758l lVar) {
        this.f356962a = accountId;
        this.f356963b = ahVar;
        this.f356964c = lVar;
    }

    /* renamed from: a */
    public final C130222q mo109572a() {
        C43264o oVar = (C43264o) this.f356963b.getChildFragmentManager().f634a.mo671c("web_coordinator_fragment");
        if (oVar == null) {
            return null;
        }
        return (C130222q) oVar.mo17754z().mo46379a();
    }
}
