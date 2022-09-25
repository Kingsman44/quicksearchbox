package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10460a;

import android.accounts.Account;
import com.google.android.libraries.mdi.download.C28804cs;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29663j;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.a.c */
/* compiled from: PG */
public final /* synthetic */ class C138370c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138372e f376438a;

    public /* synthetic */ C138370c(C138372e eVar) {
        this.f376438a = eVar;
    }

    public final C60870cx apply(Object obj) {
        C29409fd fdVar = this.f376438a.f376447h;
        C28804cs f = C28805ct.m53747f();
        C29663j jVar = (C29663j) f;
        jVar.f80313a = "apa_head_suggest";
        jVar.f80314b = C58833ax.m90834k((Account) obj);
        return fdVar.mo34717f(f.mo34447a());
    }
}
