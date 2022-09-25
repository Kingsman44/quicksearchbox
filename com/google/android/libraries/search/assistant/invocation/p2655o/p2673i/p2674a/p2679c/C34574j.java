package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2678b.C34554c;
import com.google.apps.tiktok.account.AccountId;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.c.j */
/* compiled from: PG */
public final class C34574j implements C34576l {

    /* renamed from: a */
    public final boolean f91852a;

    /* renamed from: b */
    private final AccountId f91853b;

    /* renamed from: c */
    private final String f91854c;

    /* renamed from: d */
    private final C34554c f91855d;

    public C34574j(AccountId accountId, String str, C34554c cVar, boolean z) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(str, "accountType");
        C69664n.m101061g(cVar, "configuration");
        this.f91853b = accountId;
        this.f91854c = str;
        this.f91855d = cVar;
        this.f91852a = z;
    }

    /* renamed from: a */
    public final C34554c mo39417a() {
        return this.f91855d;
    }

    /* renamed from: b */
    public final AccountId mo39418b() {
        return this.f91853b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34574j)) {
            return false;
        }
        C34574j jVar = (C34574j) obj;
        return C69664n.m101066l(this.f91853b, jVar.f91853b) && C69664n.m101066l(this.f91854c, jVar.f91854c) && C69664n.m101066l(this.f91855d, jVar.f91855d) && this.f91852a == jVar.f91852a;
    }

    public final int hashCode() {
        return (((((this.f91853b.hashCode() * 31) + this.f91854c.hashCode()) * 31) + this.f91855d.hashCode()) * 31) + (this.f91852a ? 1 : 0);
    }

    public final String toString() {
        int a = this.f91853b.mo50068a();
        String str = this.f91854c;
        boolean z = this.f91852a;
        return "LegacyOnDeviceHotwordConsumer(accountId=" + a + " (" + str + "), navigation=" + z + ")";
    }
}
