package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a */
/* compiled from: PG */
public final class C34455a {

    /* renamed from: a */
    public final List f91557a;

    /* renamed from: b */
    public final boolean f91558b;

    public C34455a(List list, boolean z) {
        C69664n.m101061g(list, "records");
        this.f91557a = list;
        this.f91558b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34455a)) {
            return false;
        }
        C34455a aVar = (C34455a) obj;
        return C69664n.m101066l(this.f91557a, aVar.f91557a) && this.f91558b == aVar.f91558b;
    }

    public final int hashCode() {
        return (this.f91557a.hashCode() * 31) + (this.f91558b ? 1 : 0);
    }

    public final String toString() {
        List list = this.f91557a;
        boolean z = this.f91558b;
        return "DebugDataStoreState(records=" + list + ", isDataTrimmed=" + z + ")";
    }
}
