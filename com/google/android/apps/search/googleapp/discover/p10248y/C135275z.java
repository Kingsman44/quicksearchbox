package com.google.android.apps.search.googleapp.discover.p10248y;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.y.z */
/* compiled from: PG */
public final class C135275z extends C135213aa {

    /* renamed from: a */
    private final C135270u f368524a;

    public C135275z(C135270u uVar) {
        C69664n.m101061g(uVar, "failureReason");
        this.f368524a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C135275z) && this.f368524a == ((C135275z) obj).f368524a;
    }

    public final int hashCode() {
        return this.f368524a.hashCode();
    }

    public final String toString() {
        C135270u uVar = this.f368524a;
        return "TerminallyFailedSession(failureReason=" + uVar + ")";
    }
}
