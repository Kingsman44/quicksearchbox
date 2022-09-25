package com.google.android.apps.search.googleapp.search.settings.p10430f;

import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.web.coordinator.C43727a;
import com.google.android.libraries.web.coordinator.C43730b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.f.g */
/* compiled from: PG */
public final class C137635g {

    /* renamed from: a */
    public final AccountId f374376a;

    /* renamed from: b */
    public final C137634f f374377b;

    /* renamed from: c */
    public final C28306ab f374378c;

    public C137635g(AccountId accountId, C137634f fVar, C28306ab abVar, C43730b bVar) {
        this.f374376a = accountId;
        this.f374377b = fVar;
        this.f374378c = abVar;
        bVar.mo46766a();
    }

    /* renamed from: a */
    public static C137634f m223634a(AccountId accountId) {
        C137634f fVar = new C137634f();
        C68324h.m98669f(fVar);
        C47247a.m84047b(fVar, accountId);
        C43727a.m77222b(fVar, C137637i.class);
        return fVar;
    }
}
