package com.google.android.apps.search.googleapp.launcher.minusone;

import android.os.Build;
import com.google.android.apps.search.googleapp.launcher.minusone.p10354b.C136593a;
import com.google.apps.tiktok.account.AccountId;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.ap */
/* compiled from: PG */
public final class C136581ap {

    /* renamed from: a */
    public final AccountId f371820a;

    /* renamed from: b */
    public final C136593a f371821b;

    /* renamed from: c */
    public final boolean f371822c;

    public C136581ap(boolean z, AccountId accountId, C136593a aVar) {
        this.f371822c = z;
        this.f371820a = accountId;
        this.f371821b = aVar;
    }

    /* renamed from: a */
    public static boolean m221977a() {
        return Build.VERSION.SDK_INT >= 31;
    }
}
