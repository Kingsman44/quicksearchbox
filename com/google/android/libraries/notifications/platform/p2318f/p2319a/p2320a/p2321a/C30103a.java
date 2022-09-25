package com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a.p2321a;

import android.accounts.Account;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.notifications.platform.f.a.a.a.a */
/* compiled from: PG */
final class C30103a {

    /* renamed from: a */
    public final Account f81437a;

    /* renamed from: b */
    public final String f81438b;

    public C30103a(Account account, String str) {
        C69664n.m101061g(str, "scope");
        this.f81437a = account;
        this.f81438b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30103a)) {
            return false;
        }
        C30103a aVar = (C30103a) obj;
        return C69664n.m101066l(this.f81437a, aVar.f81437a) && C69664n.m101066l(this.f81438b, aVar.f81438b);
    }

    public final int hashCode() {
        return (this.f81437a.hashCode() * 31) + this.f81438b.hashCode();
    }

    public final String toString() {
        Account account = this.f81437a;
        String str = this.f81438b;
        return "AccountAndScope(account=" + account + ", scope=" + str + ")";
    }
}
