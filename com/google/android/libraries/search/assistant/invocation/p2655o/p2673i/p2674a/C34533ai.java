package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.ai */
/* compiled from: PG */
final class C34533ai implements C34564c {

    /* renamed from: a */
    private final C34588e f91770a;

    public C34533ai(C34588e eVar) {
        this.f91770a = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C34533ai) && C69664n.m101066l(this.f91770a, ((C34533ai) obj).f91770a);
    }

    public final int hashCode() {
        C34588e eVar = this.f91770a;
        if (eVar == null) {
            return 0;
        }
        return eVar.hashCode();
    }

    public final String toString() {
        C34588e eVar = this.f91770a;
        return "On consumer change: " + eVar + ".";
    }
}
