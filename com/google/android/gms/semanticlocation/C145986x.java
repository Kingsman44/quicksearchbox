package com.google.android.gms.semanticlocation;

import android.accounts.Account;
import com.google.android.gms.common.util.C144015o;

/* renamed from: com.google.android.gms.semanticlocation.x */
/* compiled from: PG */
public final class C145986x {

    /* renamed from: a */
    public String f394661a;

    /* renamed from: b */
    private Account f394662b;

    /* renamed from: a */
    public final C145987y mo122457a() {
        if (!C144015o.m234195a(this.f394661a)) {
            return new C145987y(this.f394662b, this.f394661a);
        }
        throw new IllegalArgumentException("Missing a client identifier");
    }

    /* renamed from: b */
    public final void mo122458b(Account account) {
        if (!C144015o.m234195a(account.name)) {
            this.f394662b = account;
            return;
        }
        throw new IllegalArgumentException("Invalid account name used : ".concat(String.valueOf(account.name)));
    }
}
