package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import com.google.android.libraries.search.assistant.invocation.p2641k.C33914a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2679c.C34566b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.e */
/* compiled from: PG */
public final class C34588e {

    /* renamed from: a */
    public final C34646m f91891a;

    /* renamed from: b */
    private final C34566b f91892b;

    public C34588e(C34566b bVar, C34646m mVar) {
        C69664n.m101061g(bVar, "consumer");
        this.f91892b = bVar;
        this.f91891a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34588e)) {
            return false;
        }
        C34588e eVar = (C34588e) obj;
        return C69664n.m101066l(this.f91892b, eVar.f91892b) && C69664n.m101066l(this.f91891a, eVar.f91891a);
    }

    public final int hashCode() {
        return (this.f91892b.hashCode() * 31) + this.f91891a.hashCode();
    }

    public final String toString() {
        String a = C33914a.m62566a(this);
        C34566b bVar = this.f91892b;
        C34646m mVar = this.f91891a;
        return "(@" + a + ", consumer=" + bVar + ", config=" + mVar + ")";
    }
}
