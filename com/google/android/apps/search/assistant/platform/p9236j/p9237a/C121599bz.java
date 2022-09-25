package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33883a;
import kotlinx.coroutines.C71807q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.bz */
/* compiled from: PG */
public final class C121599bz {

    /* renamed from: a */
    public final C71807q f337383a;

    /* renamed from: b */
    public final C33883a f337384b;

    public C121599bz(C71807q qVar, C33883a aVar) {
        this.f337383a = qVar;
        this.f337384b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C121599bz)) {
            return false;
        }
        C121599bz bzVar = (C121599bz) obj;
        return C69664n.m101066l(this.f337383a, bzVar.f337383a) && C69664n.m101066l(this.f337384b, bzVar.f337384b);
    }

    public final int hashCode() {
        return (this.f337383a.hashCode() * 31) + this.f337384b.hashCode();
    }

    public final String toString() {
        C71807q qVar = this.f337383a;
        C33883a aVar = this.f337384b;
        return "OnDirectActionsInvalidatedSubscription(completer=" + qVar + ", listener=" + aVar + ")";
    }
}
