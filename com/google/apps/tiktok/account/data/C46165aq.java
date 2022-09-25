package com.google.apps.tiktok.account.data;

import com.google.apps.tiktok.account.AccountId;

/* renamed from: com.google.apps.tiktok.account.data.aq */
/* compiled from: PG */
public final class C46165aq extends C46217l {

    /* renamed from: a */
    public final AccountId f121090a;

    /* renamed from: b */
    public final C46215j f121091b;

    public C46165aq(AccountId accountId, C46215j jVar) {
        if (accountId != null) {
            this.f121090a = accountId;
            this.f121091b = jVar;
            return;
        }
        throw new NullPointerException("Null id");
    }

    /* renamed from: a */
    public final AccountId mo50234a() {
        return this.f121090a;
    }

    /* renamed from: b */
    public final C46215j mo50235b() {
        return this.f121091b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46217l) {
            C46217l lVar = (C46217l) obj;
            return this.f121090a.equals(lVar.mo50234a()) && this.f121091b.equals(lVar.mo50235b());
        }
    }

    public final int hashCode() {
        return ((this.f121090a.hashCode() ^ 1000003) * 1000003) ^ this.f121091b.hashCode();
    }

    public final String toString() {
        String obj = this.f121090a.toString();
        String obj2 = this.f121091b.toString();
        return "AccountContext{id=" + obj + ", info=" + obj2 + "}";
    }
}
