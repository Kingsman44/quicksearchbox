package com.google.android.apps.gsa.opa.smartspace.p6454c;

import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.c.a */
/* compiled from: PG */
final class C83745a extends C83750f {

    /* renamed from: a */
    private final String f228274a;

    /* renamed from: b */
    private final Duration f228275b;

    public C83745a(String str, Duration duration) {
        this.f228274a = str;
        this.f228275b = duration;
    }

    /* renamed from: a */
    public final Duration mo77072a() {
        return this.f228275b;
    }

    /* renamed from: b */
    public final String mo77073b() {
        return this.f228274a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C83750f) {
            C83750f fVar = (C83750f) obj;
            return this.f228274a.equals(fVar.mo77073b()) && this.f228275b.equals(fVar.mo77072a());
        }
    }

    public final int hashCode() {
        return ((this.f228274a.hashCode() ^ 1000003) * 1000003) ^ this.f228275b.hashCode();
    }

    public final String toString() {
        String str = this.f228274a;
        String obj = this.f228275b.toString();
        return "TimingStep{description=" + str + ", elapsedTime=" + obj + "}";
    }
}
