package com.google.android.apps.search.googleapp.accounts.p10125c;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.accounts.p10123a.C133151b;
import com.google.android.libraries.silk.p3205a.p3236y.C41740a;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.accounts.c.a */
/* compiled from: PG */
public final class C133161a implements C41740a {

    /* renamed from: a */
    private final AccountId f362979a;

    /* renamed from: b */
    private final Fragment f362980b;

    public C133161a(AccountId accountId, Fragment fragment) {
        this.f362979a = accountId;
        this.f362980b = fragment;
    }

    /* renamed from: a */
    public final C60870cx mo44332a() {
        Fragment fragment = this.f362980b;
        C47709i.m84861a(fragment, C133151b.m216105a(fragment.requireContext(), this.f362979a));
        return C60866ct.f164955a;
    }
}
