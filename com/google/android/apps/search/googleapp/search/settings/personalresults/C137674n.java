package com.google.android.apps.search.googleapp.search.settings.personalresults;

import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.web.contrib.requestblock.RequestBlockMixin;
import com.google.android.libraries.web.coordinator.C43727a;
import com.google.android.libraries.web.coordinator.C43730b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.personalresults.n */
/* compiled from: PG */
public final class C137674n {

    /* renamed from: a */
    public final AccountId f374468a;

    /* renamed from: b */
    public final C137671k f374469b;

    /* renamed from: c */
    public final C28306ab f374470c;

    /* renamed from: d */
    public final C136247a f374471d;

    /* renamed from: e */
    public final RequestBlockMixin f374472e;

    /* renamed from: f */
    public final C139795f f374473f;

    public C137674n(AccountId accountId, C137671k kVar, C28306ab abVar, C136247a aVar, IncognitoLifecycleObserver incognitoLifecycleObserver, RequestBlockMixin requestBlockMixin, C139795f fVar, C43730b bVar) {
        this.f374468a = accountId;
        this.f374469b = kVar;
        this.f374472e = requestBlockMixin;
        this.f374473f = fVar;
        this.f374470c = abVar;
        this.f374471d = aVar;
        bVar.mo46766a();
        incognitoLifecycleObserver.mo112948g();
    }

    /* renamed from: a */
    public static C137671k m223742a(AccountId accountId) {
        C137671k kVar = new C137671k();
        C68324h.m98669f(kVar);
        C47247a.m84047b(kVar, accountId);
        C43727a.m77222b(kVar, C137677q.class);
        return kVar;
    }
}
