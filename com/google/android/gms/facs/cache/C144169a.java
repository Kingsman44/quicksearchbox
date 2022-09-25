package com.google.android.gms.facs.cache;

import android.accounts.Account;

/* renamed from: com.google.android.gms.facs.cache.a */
/* compiled from: PG */
public final class C144169a extends C144174b {

    /* renamed from: a */
    private final Account f390486a;

    public C144169a(Account account) {
        if (account != null) {
            this.f390486a = account;
            return;
        }
        throw new NullPointerException("Null account");
    }

    /* renamed from: a */
    public final Account mo119108a() {
        return this.f390486a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C144174b) {
            return this.f390486a.equals(((C144174b) obj).mo119108a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f390486a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f390486a.toString();
        return "FacsCacheOptions{account=" + obj + "}";
    }
}
