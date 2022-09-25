package com.google.android.apps.search.googleapp.discover.p10248y;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.y.y */
/* compiled from: PG */
public final class C135274y extends C135213aa {

    /* renamed from: a */
    public final String f368523a;

    public C135274y(String str) {
        C69664n.m101061g(str, "sessionId");
        this.f368523a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C135274y) && C69664n.m101066l(this.f368523a, ((C135274y) obj).f368523a);
    }

    public final int hashCode() {
        return this.f368523a.hashCode();
    }

    public final String toString() {
        String str = this.f368523a;
        return "ServerBackedSession(sessionId=" + str + ")";
    }
}
