package com.google.apps.tiktok.inject.p3660e.p3662b;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.C46059b;
import com.google.apps.tiktok.tracing.C47561bl;
import com.google.apps.tiktok.tracing.C47562bm;
import com.google.apps.tiktok.tracing.C47563bn;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.inject.e.b.a */
/* compiled from: PG */
public final class C47256a {
    /* renamed from: a */
    public static Set m84059a(AccountId accountId) {
        if (accountId == null) {
            return Collections.emptySet();
        }
        C47561bl b = C47562bm.f123426a.mo51423b();
        C46059b.m82278a(b, accountId);
        return Collections.singleton(((C47563bn) b).mo51424e());
    }
}
