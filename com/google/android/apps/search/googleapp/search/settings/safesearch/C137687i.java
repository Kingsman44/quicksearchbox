package com.google.android.apps.search.googleapp.search.settings.safesearch;

import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.apps.search.googleapp.p10165d.C133933a;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.web.coordinator.C43727a;
import com.google.android.libraries.web.coordinator.C43730b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.safesearch.i */
/* compiled from: PG */
public final class C137687i {

    /* renamed from: a */
    public final AccountId f374498a;

    /* renamed from: b */
    public final C137686h f374499b;

    /* renamed from: c */
    public final C133933a f374500c;

    /* renamed from: d */
    public final C28306ab f374501d;

    /* renamed from: e */
    public final C136247a f374502e;

    public C137687i(AccountId accountId, C137686h hVar, C133933a aVar, C28306ab abVar, C136247a aVar2, IncognitoLifecycleObserver incognitoLifecycleObserver, C43730b bVar) {
        this.f374498a = accountId;
        this.f374499b = hVar;
        this.f374500c = aVar;
        this.f374501d = abVar;
        this.f374502e = aVar2;
        bVar.mo46766a();
        incognitoLifecycleObserver.mo112948g();
    }

    /* renamed from: a */
    public static C137686h m223784a(AccountId accountId) {
        C137686h hVar = new C137686h();
        C68324h.m98669f(hVar);
        C47247a.m84047b(hVar, accountId);
        C43727a.m77222b(hVar, C137690l.class);
        return hVar;
    }
}
