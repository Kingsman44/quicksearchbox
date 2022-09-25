package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.c.i */
/* compiled from: PG */
public final class C34419i implements C34420j {

    /* renamed from: a */
    public final C34043bf f91470a;

    public C34419i(C34043bf bfVar) {
        C69664n.m101061g(bfVar, "sourceId");
        this.f91470a = bfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34419i) && this.f91470a == ((C34419i) obj).f91470a;
    }

    public final int hashCode() {
        return this.f91470a.hashCode();
    }

    public final String toString() {
        C34043bf bfVar = this.f91470a;
        return "WhileHasPreferredClient(sourceId=" + bfVar + ")";
    }
}
