package com.google.apps.tiktok.account.data;

import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.AutoValue_AccountId;

/* renamed from: com.google.apps.tiktok.account.data.ap */
/* compiled from: PG */
public final class C46164ap extends C46108a {

    /* renamed from: a */
    public final C46215j f121087a;

    /* renamed from: b */
    private final AccountId f121088b;

    /* renamed from: c */
    private final int f121089c;

    public C46164ap(AccountId accountId, C46215j jVar, int i) {
        this.f121088b = accountId;
        if (jVar != null) {
            this.f121087a = jVar;
            this.f121089c = i;
            return;
        }
        throw new NullPointerException("Null info");
    }

    /* renamed from: a */
    public final AccountId mo50209a() {
        return this.f121088b;
    }

    /* renamed from: b */
    public final C46215j mo50210b() {
        return this.f121087a;
    }

    /* renamed from: c */
    public final int mo50211c() {
        return this.f121089c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46108a) {
            C46108a aVar = (C46108a) obj;
            return this.f121088b.equals(aVar.mo50209a()) && this.f121087a.equals(aVar.mo50210b()) && this.f121089c == aVar.mo50211c();
        }
    }

    public final int hashCode() {
        return (((((AutoValue_AccountId) this.f121088b).f120739a * 1000003) ^ this.f121087a.hashCode()) * 1000003) ^ this.f121089c;
    }

    public final String toString() {
        String obj = this.f121088b.toString();
        String obj2 = this.f121087a.toString();
        String num = Integer.toString(this.f121089c - 1);
        return "Account{id=" + obj + ", info=" + obj2 + ", state=" + num + "}";
    }
}
