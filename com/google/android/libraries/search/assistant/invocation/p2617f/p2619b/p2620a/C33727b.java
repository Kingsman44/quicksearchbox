package com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2620a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.b.a.b */
/* compiled from: PG */
public final class C33727b {

    /* renamed from: a */
    public final C33726a f90076a;

    /* renamed from: b */
    public final C34053bp f90077b;

    public C33727b(C33726a aVar, C34053bp bpVar) {
        C69664n.m101061g(aVar, "micState");
        C69664n.m101061g(bpVar, "invocationToken");
        this.f90076a = aVar;
        this.f90077b = bpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33727b)) {
            return false;
        }
        C33727b bVar = (C33727b) obj;
        return this.f90076a == bVar.f90076a && C69664n.m101066l(this.f90077b, bVar.f90077b);
    }

    public final int hashCode() {
        return (this.f90076a.hashCode() * 31) + this.f90077b.hashCode();
    }

    public final String toString() {
        C33726a aVar = this.f90076a;
        C34053bp bpVar = this.f90077b;
        return "MicStateUpdate(micState=" + aVar + ", invocationToken=" + bpVar + ")";
    }
}
