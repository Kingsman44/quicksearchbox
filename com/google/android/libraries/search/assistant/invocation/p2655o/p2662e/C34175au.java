package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34120b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.C34354a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.au */
/* compiled from: PG */
public final class C34175au {

    /* renamed from: a */
    public final C34354a f90971a;

    /* renamed from: b */
    public final C34120b f90972b;

    public C34175au(C34354a aVar, C34120b bVar) {
        C69664n.m101061g(aVar, "connection");
        C69664n.m101061g(bVar, "clientDetailsSnapshot");
        this.f90971a = aVar;
        this.f90972b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34175au)) {
            return false;
        }
        C34175au auVar = (C34175au) obj;
        return C69664n.m101066l(this.f90971a, auVar.f90971a) && C69664n.m101066l(this.f90972b, auVar.f90972b);
    }

    public final int hashCode() {
        return (this.f90971a.hashCode() * 31) + this.f90972b.hashCode();
    }

    public final String toString() {
        String c = this.f90971a.mo39322c();
        C34120b bVar = this.f90972b;
        return "[connection=" + c + ", details=" + bVar + "]";
    }
}
