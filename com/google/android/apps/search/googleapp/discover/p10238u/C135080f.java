package com.google.android.apps.search.googleapp.discover.p10238u;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.f */
/* compiled from: PG */
public final class C135080f extends C135109h {

    /* renamed from: a */
    public final String f367901a;

    public C135080f(String str) {
        C69664n.m101061g(str, "authToken");
        this.f367901a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C135080f) && C69664n.m101066l(this.f367901a, ((C135080f) obj).f367901a);
    }

    public final int hashCode() {
        return this.f367901a.hashCode();
    }

    public final String toString() {
        String str = this.f367901a;
        return "SignedIn(authToken=" + str + ")";
    }
}
