package com.google.frameworks.client.data.android.p4632a.p4633a;

import android.accounts.Account;

/* renamed from: com.google.frameworks.client.data.android.a.a.f */
/* compiled from: PG */
final class C61339f extends C61337d {

    /* renamed from: a */
    public final Account f165883a;

    /* renamed from: b */
    public final String f165884b;

    public C61339f(Account account, String str) {
        this.f165883a = account;
        this.f165884b = str;
    }

    /* renamed from: a */
    public final Account mo57909a() {
        return this.f165883a;
    }

    /* renamed from: b */
    public final String mo57910b() {
        return this.f165884b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C61337d) {
            C61337d dVar = (C61337d) obj;
            return this.f165883a.equals(dVar.mo57909a()) && this.f165884b.equals(dVar.mo57910b());
        }
    }

    public final int hashCode() {
        return ((this.f165883a.hashCode() ^ 1000003) * 1000003) ^ this.f165884b.hashCode();
    }

    public final String toString() {
        String obj = this.f165883a.toString();
        String str = this.f165884b;
        return "AccountAndScope{account=" + obj + ", scope=" + str + "}";
    }
}
