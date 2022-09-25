package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import android.accounts.Account;
import android.util.Pair;
import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.an */
/* compiled from: PG */
public final /* synthetic */ class C102905an implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ Account f287363a;

    public /* synthetic */ C102905an(Account account) {
        this.f287363a = account;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Account account = this.f287363a;
        Throwable th = (Throwable) obj;
        return new Pair(account.name, Boolean.valueOf(!account.name.endsWith("@gmail.com")));
    }
}
