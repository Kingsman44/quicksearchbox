package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34120b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.aq */
/* compiled from: PG */
public final class C34234aq {

    /* renamed from: a */
    public final C34043bf f91083a;

    /* renamed from: b */
    public final C34120b f91084b;

    /* renamed from: c */
    public final Object f91085c;

    public C34234aq(C34043bf bfVar, C34120b bVar, Object obj) {
        C69664n.m101061g(bfVar, "sourceId");
        this.f91083a = bfVar;
        this.f91084b = bVar;
        this.f91085c = obj;
    }

    /* renamed from: a */
    public final Object mo39278a() {
        Object obj = this.f91085c;
        if (obj != null) {
            return obj;
        }
        throw new C34284cm(this.f91083a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34234aq)) {
            return false;
        }
        C34234aq aqVar = (C34234aq) obj;
        return this.f91083a == aqVar.f91083a && C69664n.m101066l(this.f91084b, aqVar.f91084b) && C69664n.m101066l(this.f91085c, aqVar.f91085c);
    }

    public final int hashCode() {
        int hashCode = ((this.f91083a.hashCode() * 31) + this.f91084b.hashCode()) * 31;
        Object obj = this.f91085c;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        C34043bf bfVar = this.f91083a;
        C34120b bVar = this.f91084b;
        Object obj = this.f91085c;
        return "InvocationSourcePreferredClientImpl(sourceId=" + bfVar + ", client=" + bVar + ", _configuration=" + obj + ")";
    }
}
