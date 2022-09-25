package com.google.android.apps.gsa.staticplugins.opa;

import com.google.assistant.p3897e.p3921j.p3926e.C51893d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.y */
/* compiled from: PG */
final class C114528y extends C109735ni {

    /* renamed from: a */
    private final long f317609a;

    /* renamed from: b */
    private final C51893d f317610b;

    public C114528y(long j, C51893d dVar) {
        this.f317609a = j;
        this.f317610b = dVar;
    }

    /* renamed from: a */
    public final long mo98055a() {
        return this.f317609a;
    }

    /* renamed from: b */
    public final C51893d mo98056b() {
        return this.f317610b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C109735ni) {
            C109735ni niVar = (C109735ni) obj;
            return this.f317609a == niVar.mo98055a() && this.f317610b.equals(niVar.mo98056b());
        }
    }

    public final int hashCode() {
        long j = this.f317609a;
        return this.f317610b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f317609a;
        String obj = this.f317610b.toString();
        return "QueryDismissMode{requestId=" + j + ", dismissArgs=" + obj + "}";
    }
}
