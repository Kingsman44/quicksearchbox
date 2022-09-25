package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2678b.C34554c;
import com.google.apps.tiktok.account.AccountId;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.c.c */
/* compiled from: PG */
public final class C34567c implements C34569e, C34566b {

    /* renamed from: a */
    private final AccountId f91840a;

    /* renamed from: b */
    private final String f91841b;

    /* renamed from: c */
    private final C34554c f91842c;

    public C34567c(AccountId accountId, String str, C34554c cVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(str, "accountType");
        C69664n.m101061g(cVar, "configuration");
        this.f91840a = accountId;
        this.f91841b = str;
        this.f91842c = cVar;
    }

    /* renamed from: a */
    public final C34554c mo39417a() {
        return this.f91842c;
    }

    /* renamed from: b */
    public final AccountId mo39418b() {
        return this.f91840a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34567c)) {
            return false;
        }
        C34567c cVar = (C34567c) obj;
        return C69664n.m101066l(this.f91840a, cVar.f91840a) && C69664n.m101066l(this.f91841b, cVar.f91841b) && C69664n.m101066l(this.f91842c, cVar.f91842c);
    }

    public final int hashCode() {
        return (((this.f91840a.hashCode() * 31) + this.f91841b.hashCode()) * 31) + this.f91842c.hashCode();
    }

    public final String toString() {
        int a = this.f91840a.mo50068a();
        String str = this.f91841b;
        return "ExternalHotwordConsumer(accountId=" + a + " (" + str + "))";
    }
}
