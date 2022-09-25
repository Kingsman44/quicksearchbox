package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2676a;

import com.google.apps.tiktok.account.AccountId;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.a.s */
/* compiled from: PG */
public final class C34485s {

    /* renamed from: a */
    public final AccountId f91640a;

    /* renamed from: b */
    public final String f91641b;

    /* renamed from: c */
    public final C34462ae f91642c;

    /* renamed from: d */
    public final boolean f91643d;

    public C34485s(AccountId accountId, String str, C34462ae aeVar, boolean z) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(str, "locale");
        C69664n.m101061g(aeVar, "voiceMatchConfig");
        this.f91640a = accountId;
        this.f91641b = str;
        this.f91642c = aeVar;
        this.f91643d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34485s)) {
            return false;
        }
        C34485s sVar = (C34485s) obj;
        return C69664n.m101066l(this.f91640a, sVar.f91640a) && C69664n.m101066l(this.f91641b, sVar.f91641b) && C69664n.m101066l(this.f91642c, sVar.f91642c) && this.f91643d == sVar.f91643d;
    }

    public final int hashCode() {
        return (((((this.f91640a.hashCode() * 31) + this.f91641b.hashCode()) * 31) + this.f91642c.hashCode()) * 31) + (this.f91643d ? 1 : 0);
    }

    public final String toString() {
        AccountId accountId = this.f91640a;
        String str = this.f91641b;
        C34462ae aeVar = this.f91642c;
        boolean z = this.f91643d;
        return "LegacyExternalHotwordConsumerConfiguration(accountId=" + accountId + ", locale=" + str + ", voiceMatchConfig=" + aeVar + ", inEnrollmentStatus=" + z + ")";
    }
}
