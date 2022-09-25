package com.google.android.apps.search.googleapp.p10117aa;

import com.google.android.apps.search.googleapp.p10117aa.C133113bc;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.aa.ax */
/* compiled from: PG */
public final /* synthetic */ class C133106ax implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133113bc f362890a;

    public /* synthetic */ C133106ax(C133113bc bcVar) {
        this.f362890a = bcVar;
    }

    public final C60870cx apply(Object obj) {
        C133113bc bcVar = this.f362890a;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            return ((C133113bc.C133114a) C47245e.m84045a(bcVar.f362903b, C133113bc.C133114a.class, (AccountId) optional.get())).mo110980cU().mo110973b();
        }
        return C60866ct.f164955a;
    }
}
