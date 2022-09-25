package com.google.android.apps.search.googleapp.incognito.p10319a;

import com.google.android.apps.search.googleapp.incognito.p10320b.C136236f;
import com.google.android.apps.search.googleapp.incognito.p10320b.C136240j;
import com.google.apps.tiktok.account.api.controller.C45966ad;
import com.google.apps.tiktok.account.data.C46165aq;
import com.google.apps.tiktok.account.data.C46217l;
import com.google.apps.tiktok.account.data.C46319n;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.incognito.a.a */
/* compiled from: PG */
public final class C136227a implements C46319n {

    /* renamed from: a */
    private final C45966ad f371005a;

    /* renamed from: b */
    private final C136240j f371006b;

    public C136227a(C45966ad adVar, C136240j jVar) {
        this.f371005a = adVar;
        this.f371006b = jVar;
    }

    /* renamed from: a */
    public final C60870cx mo22504a(C46217l lVar) {
        if (!"incognito".equals(((C46165aq) lVar).f121091b.f121165j)) {
            return C60866ct.f164955a;
        }
        this.f371005a.mo50117a();
        C136240j jVar = this.f371006b;
        return jVar.f371025a.mo46039a(new C136236f(jVar), C60826bg.f164896a);
    }
}
