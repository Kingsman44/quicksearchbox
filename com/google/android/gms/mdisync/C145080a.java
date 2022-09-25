package com.google.android.gms.mdisync;

import android.accounts.Account;

/* renamed from: com.google.android.gms.mdisync.a */
/* compiled from: PG */
public final class C145080a extends C145084e {

    /* renamed from: a */
    private final Account f392143a;

    public C145080a(Account account) {
        if (account != null) {
            this.f392143a = account;
            return;
        }
        throw new NullPointerException("Null account");
    }

    /* renamed from: a */
    public final Account mo119108a() {
        return this.f392143a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C145084e) {
            return this.f392143a.equals(((C145084e) obj).mo119108a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f392143a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f392143a.toString();
        return "MdiSyncClientOptions{account=" + obj + "}";
    }
}
