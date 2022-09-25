package com.google.android.apps.gsa.staticplugins.opa.apa.migration;

import android.util.Pair;
import com.google.android.apps.gsa.staticplugins.opa.apa.migration.C107224k;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.apa.migration.j */
/* compiled from: PG */
public final /* synthetic */ class C107223j implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C107224k f298421a;

    public /* synthetic */ C107223j(C107224k kVar) {
        this.f298421a = kVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        AccountId accountId = (AccountId) obj;
        return new Pair(accountId, ((C107224k.C107225a) C47245e.m84045a(this.f298421a.f298424c, C107224k.C107225a.class, accountId)).mo95834jq());
    }
}
