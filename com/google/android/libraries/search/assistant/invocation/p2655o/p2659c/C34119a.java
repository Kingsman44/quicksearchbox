package com.google.android.libraries.search.assistant.invocation.p2655o.p2659c;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.apps.tiktok.account.AccountId;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.c.a */
/* compiled from: PG */
public final class C34119a {

    /* renamed from: a */
    public final C34037b f90869a;

    /* renamed from: b */
    public final AccountId f90870b;

    /* renamed from: c */
    public final String f90871c;

    public C34119a(C34037b bVar, AccountId accountId, String str) {
        C69664n.m101061g(bVar, "apaClient");
        C69664n.m101061g(accountId, "accountId");
        this.f90869a = bVar;
        this.f90870b = accountId;
        this.f90871c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34119a)) {
            return false;
        }
        C34119a aVar = (C34119a) obj;
        return this.f90869a == aVar.f90869a && C69664n.m101066l(this.f90870b, aVar.f90870b) && C69664n.m101066l(this.f90871c, aVar.f90871c);
    }

    public final int hashCode() {
        int hashCode = ((this.f90869a.hashCode() * 31) + this.f90870b.hashCode()) * 31;
        String str = this.f90871c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String name = this.f90869a.name();
        int a = this.f90870b.mo50068a();
        String str = this.f90871c;
        if (str == null) {
            str = "N/A";
        }
        return "[" + name + ", accountId=" + a + " (" + str + ")]";
    }
}
