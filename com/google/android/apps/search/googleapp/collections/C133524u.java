package com.google.android.apps.search.googleapp.collections;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.p10527u.C139770k;
import com.google.android.apps.search.googleapp.p10527u.C139771l;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.collections.u */
/* compiled from: PG */
public final /* synthetic */ class C133524u implements C139771l {

    /* renamed from: a */
    public final /* synthetic */ AccountId f363814a;

    public /* synthetic */ C133524u(AccountId accountId) {
        this.f363814a = accountId;
    }

    /* renamed from: a */
    public final Fragment mo111217a(C139770k kVar) {
        C133514l lVar;
        AccountId accountId = this.f363814a;
        if (kVar.f379884a == 3) {
            lVar = (C133514l) kVar.f379885b;
        } else {
            lVar = C133514l.f363786c;
        }
        CollectionsTabFragment collectionsTabFragment = new CollectionsTabFragment();
        C68324h.m98669f(collectionsTabFragment);
        C47247a.m84047b(collectionsTabFragment, accountId);
        C47243l.m84039a(collectionsTabFragment, lVar);
        return collectionsTabFragment;
    }
}
