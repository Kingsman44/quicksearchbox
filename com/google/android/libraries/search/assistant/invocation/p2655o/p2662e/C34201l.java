package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34014ad;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34090cz;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34119a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2659c.C34120b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.l */
/* compiled from: PG */
public final class C34201l {

    /* renamed from: a */
    public final C34175au f91020a;

    /* renamed from: b */
    public final C34119a f91021b;

    /* renamed from: c */
    private final C34090cz f91022c;

    public C34201l(C34175au auVar) {
        C69664n.m101061g(auVar, "route");
        this.f91020a = auVar;
        C34120b bVar = auVar.f90972b;
        this.f91021b = bVar.f90872a;
        C34090cz czVar = ((C34014ad) bVar.f90873b).f90669e;
        czVar = czVar == null ? C34090cz.f90823c : czVar;
        C69664n.m101060f(czVar, "route.clientDetailsSnaps…tion.surfaceConfiguration");
        this.f91022c = czVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34201l) && C69664n.m101066l(this.f91020a, ((C34201l) obj).f91020a);
    }

    public final int hashCode() {
        return this.f91020a.hashCode();
    }

    public final String toString() {
        C34119a aVar = this.f91021b;
        C34090cz czVar = this.f91022c;
        return "[client=" + aVar + ", configuration=" + czVar + "]";
    }
}
