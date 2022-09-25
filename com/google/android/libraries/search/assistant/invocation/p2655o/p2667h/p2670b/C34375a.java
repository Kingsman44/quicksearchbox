package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.C34354a;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.b.a */
/* compiled from: PG */
final class C34375a {

    /* renamed from: a */
    public final C34354a f91385a;

    /* renamed from: b */
    public final C69585o f91386b;

    public C34375a(C34354a aVar, C69585o oVar) {
        C69664n.m101061g(aVar, "connection");
        this.f91385a = aVar;
        this.f91386b = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34375a)) {
            return false;
        }
        C34375a aVar = (C34375a) obj;
        return C69664n.m101066l(this.f91385a, aVar.f91385a) && C69664n.m101066l(this.f91386b, aVar.f91386b);
    }

    public final int hashCode() {
        return (this.f91385a.hashCode() * 31) + this.f91386b.hashCode();
    }

    public final String toString() {
        C34354a aVar = this.f91385a;
        C69585o oVar = this.f91386b;
        return "TriggeringConnectionDebugDataTracker(connection=" + aVar + ", context=" + oVar + ")";
    }
}
