package com.google.android.libraries.p10923ac.p10925b.p10946m;

import android.accounts.Account;

/* renamed from: com.google.android.libraries.ac.b.m.a */
/* compiled from: PG */
final class C147183a extends C147185c {

    /* renamed from: a */
    private final Account f397371a;

    /* renamed from: b */
    private final String f397372b;

    public C147183a(Account account, String str) {
        if (account != null) {
            this.f397371a = account;
            if (str != null) {
                this.f397372b = str;
                return;
            }
            throw new NullPointerException("Null channelKey");
        }
        throw new NullPointerException("Null account");
    }

    /* renamed from: a */
    public final Account mo124005a() {
        return this.f397371a;
    }

    /* renamed from: b */
    public final String mo124006b() {
        return this.f397372b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147185c) {
            C147185c cVar = (C147185c) obj;
            return this.f397371a.equals(cVar.mo124005a()) && this.f397372b.equals(cVar.mo124006b());
        }
    }

    public final int hashCode() {
        return ((this.f397371a.hashCode() ^ 1000003) * 1000003) ^ this.f397372b.hashCode();
    }

    public final String toString() {
        String obj = this.f397371a.toString();
        String str = this.f397372b;
        return "AccountChannelKey{account=" + obj + ", channelKey=" + str + "}";
    }
}
