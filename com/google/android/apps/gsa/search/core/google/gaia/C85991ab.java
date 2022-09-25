package com.google.android.apps.gsa.search.core.google.gaia;

import android.accounts.Account;
import android.content.ContentResolver;
import android.os.Bundle;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.ab */
/* compiled from: PG */
public final /* synthetic */ class C85991ab implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C86013ax f232508a;

    /* renamed from: b */
    public final /* synthetic */ Account f232509b;

    /* renamed from: c */
    public final /* synthetic */ String f232510c;

    public /* synthetic */ C85991ab(C86013ax axVar, Account account, String str) {
        this.f232508a = axVar;
        this.f232509b = account;
        this.f232510c = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C86013ax axVar = this.f232508a;
        Account account = this.f232509b;
        String str = this.f232510c;
        if (!((Boolean) obj).booleanValue()) {
            return axVar.mo79692z(account, str);
        }
        Bundle bundle = new Bundle(1);
        bundle.putBoolean("expedited", true);
        ContentResolver.requestSync(account, "com.google.android.gms.auth.accountstate", bundle);
        return C60856cj.m92899h(new C86048i());
    }
}
