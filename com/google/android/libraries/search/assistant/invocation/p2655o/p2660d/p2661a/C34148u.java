package com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a;

import com.google.frameworks.client.p4624a.p4625a.C61284a;
import com.google.frameworks.client.p4624a.p4625a.C61303d;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

@C61303d(mo57901a = C61284a.f165754a)
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.d.a.u */
/* compiled from: PG */
public final class C34148u {

    /* renamed from: a */
    public final C34134g f90914a;

    /* renamed from: b */
    public final Set f90915b;

    public C34148u(C34134g gVar, Set set) {
        C69664n.m101061g(gVar, "architecture");
        C69664n.m101061g(set, "enablers");
        this.f90914a = gVar;
        this.f90915b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34148u)) {
            return false;
        }
        C34148u uVar = (C34148u) obj;
        return this.f90914a == uVar.f90914a && C69664n.m101066l(this.f90915b, uVar.f90915b);
    }

    public final int hashCode() {
        return (this.f90914a.hashCode() * 31) + this.f90915b.hashCode();
    }

    public final String toString() {
        String name = this.f90914a.name();
        Set set = this.f90915b;
        return "HotwordArchitectureDetails(" + name + ", enablers=" + set + ")";
    }
}
