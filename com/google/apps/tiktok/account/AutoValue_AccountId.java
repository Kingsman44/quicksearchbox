package com.google.apps.tiktok.account;

/* compiled from: PG */
public final class AutoValue_AccountId extends AccountId {

    /* renamed from: a */
    public final int f120739a;

    public AutoValue_AccountId(int i) {
        this.f120739a = i;
    }

    @Deprecated
    /* renamed from: a */
    public final int mo50068a() {
        return this.f120739a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof AccountId) && this.f120739a == ((AccountId) obj).mo50068a();
    }

    public final int hashCode() {
        return this.f120739a ^ 1000003;
    }

    public final String toString() {
        int i = this.f120739a;
        return "AccountId{id=" + i + "}";
    }
}
