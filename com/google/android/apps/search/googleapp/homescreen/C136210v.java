package com.google.android.apps.search.googleapp.homescreen;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.p10527u.C139770k;
import com.google.android.apps.search.googleapp.p10527u.C139771l;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.v */
/* compiled from: PG */
public final /* synthetic */ class C136210v implements C139771l {

    /* renamed from: a */
    public final /* synthetic */ AccountId f370948a;

    public /* synthetic */ C136210v(AccountId accountId) {
        this.f370948a = accountId;
    }

    /* renamed from: a */
    public final Fragment mo111217a(C139770k kVar) {
        C136149c cVar;
        AccountId accountId = this.f370948a;
        if (kVar.f379884a == 1) {
            cVar = (C136149c) kVar.f379885b;
        } else {
            cVar = C136149c.f370793c;
        }
        HomeScreenFragment homeScreenFragment = new HomeScreenFragment();
        C68324h.m98669f(homeScreenFragment);
        C47247a.m84047b(homeScreenFragment, accountId);
        C47243l.m84039a(homeScreenFragment, cVar);
        return homeScreenFragment;
    }
}
