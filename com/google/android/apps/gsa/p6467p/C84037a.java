package com.google.android.apps.gsa.p6467p;

import com.google.android.apps.search.googleapp.incognito.education.p10325a.C136252b;
import com.google.apps.tiktok.account.AccountId;

/* renamed from: com.google.android.apps.gsa.p.a */
/* compiled from: PG */
final class C84037a extends C84052p {

    /* renamed from: a */
    private final AccountId f228909a;

    /* renamed from: b */
    private final C136252b f228910b;

    public C84037a(AccountId accountId, C136252b bVar) {
        if (accountId != null) {
            this.f228909a = accountId;
            if (bVar != null) {
                this.f228910b = bVar;
                return;
            }
            throw new NullPointerException("Null educationState");
        }
        throw new NullPointerException("Null accountId");
    }

    /* renamed from: a */
    public final C136252b mo77496a() {
        return this.f228910b;
    }

    /* renamed from: b */
    public final AccountId mo77497b() {
        return this.f228909a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C84052p) {
            C84052p pVar = (C84052p) obj;
            return this.f228909a.equals(pVar.mo77497b()) && this.f228910b.equals(pVar.mo77496a());
        }
    }

    public final int hashCode() {
        return ((this.f228909a.hashCode() ^ 1000003) * 1000003) ^ this.f228910b.hashCode();
    }

    public final String toString() {
        String obj = this.f228909a.toString();
        String obj2 = this.f228910b.toString();
        return "Holder{accountId=" + obj + ", educationState=" + obj2 + "}";
    }
}
