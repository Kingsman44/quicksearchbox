package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34119a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.m */
/* compiled from: PG */
final class C34202m {

    /* renamed from: a */
    public final String f91023a;

    /* renamed from: b */
    public final C34119a f91024b;

    public C34202m(String str, C34119a aVar) {
        C69664n.m101061g(str, "connectionId");
        C69664n.m101061g(aVar, "client");
        this.f91023a = str;
        this.f91024b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34202m)) {
            return false;
        }
        C34202m mVar = (C34202m) obj;
        return C69664n.m101066l(this.f91023a, mVar.f91023a) && C69664n.m101066l(this.f91024b, mVar.f91024b);
    }

    public final int hashCode() {
        return (this.f91023a.hashCode() * 31) + this.f91024b.hashCode();
    }

    public final String toString() {
        String str = this.f91023a;
        C34119a aVar = this.f91024b;
        return "RouteDebugRecord(connectionId=" + str + ", client=" + aVar + ")";
    }
}
