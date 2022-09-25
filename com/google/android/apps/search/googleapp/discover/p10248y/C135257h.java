package com.google.android.apps.search.googleapp.discover.p10248y;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.y.h */
/* compiled from: PG */
public final class C135257h {

    /* renamed from: a */
    public final C135270u f368480a;

    /* renamed from: b */
    public final C135268s f368481b;

    public C135257h(C135270u uVar, C135268s sVar) {
        C69664n.m101061g(uVar, "failureReason");
        this.f368480a = uVar;
        this.f368481b = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135257h)) {
            return false;
        }
        C135257h hVar = (C135257h) obj;
        return this.f368480a == hVar.f368480a && C69664n.m101066l(this.f368481b, hVar.f368481b);
    }

    public final int hashCode() {
        return (this.f368480a.hashCode() * 31) + ((C135264o) this.f368481b).f368493a.hashCode();
    }

    public final String toString() {
        C135270u uVar = this.f368480a;
        C135268s sVar = this.f368481b;
        return "FailureInfo(failureReason=" + uVar + ", failureSlice=" + sVar + ")";
    }
}
