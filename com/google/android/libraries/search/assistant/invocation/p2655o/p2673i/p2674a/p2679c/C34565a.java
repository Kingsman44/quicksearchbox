package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34119a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34120b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2678b.C34554c;
import com.google.apps.tiktok.account.AccountId;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.c.a */
/* compiled from: PG */
public final class C34565a implements C34576l {

    /* renamed from: a */
    public final C34120b f91837a;

    /* renamed from: b */
    public final C34554c f91838b;

    /* renamed from: c */
    public final AccountId f91839c;

    public C34565a(C34120b bVar, C34554c cVar) {
        C69664n.m101061g(cVar, "configuration");
        this.f91837a = bVar;
        this.f91838b = cVar;
        C34119a aVar = bVar.f90872a;
        this.f91839c = aVar.f90870b;
        String str = aVar.f90871c;
    }

    /* renamed from: a */
    public final C34554c mo39417a() {
        return this.f91838b;
    }

    /* renamed from: b */
    public final AccountId mo39418b() {
        return this.f91839c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34565a)) {
            return false;
        }
        C34565a aVar = (C34565a) obj;
        return C69664n.m101066l(this.f91837a, aVar.f91837a) && C69664n.m101066l(this.f91838b, aVar.f91838b);
    }

    public final int hashCode() {
        return (this.f91837a.hashCode() * 31) + this.f91838b.hashCode();
    }

    public final String toString() {
        C34119a aVar = this.f91837a.f90872a;
        return "ApaOnDeviceHotwordConsumer(client=" + aVar + ")";
    }
}
