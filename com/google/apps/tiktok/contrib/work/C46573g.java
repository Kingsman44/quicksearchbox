package com.google.apps.tiktok.contrib.work;

import java.util.concurrent.TimeUnit;

/* renamed from: com.google.apps.tiktok.contrib.work.g */
/* compiled from: PG */
public final class C46573g extends C46584r {

    /* renamed from: a */
    private final long f121770a;

    /* renamed from: b */
    private final TimeUnit f121771b;

    public C46573g(long j, TimeUnit timeUnit) {
        this.f121770a = j;
        if (timeUnit != null) {
            this.f121771b = timeUnit;
            return;
        }
        throw new NullPointerException("Null timeUnit");
    }

    /* renamed from: a */
    public final long mo50581a() {
        return this.f121770a;
    }

    /* renamed from: b */
    public final TimeUnit mo50582b() {
        return this.f121771b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C46584r) {
            C46584r rVar = (C46584r) obj;
            return this.f121770a == rVar.mo50581a() && this.f121771b.equals(rVar.mo50582b());
        }
    }

    public final int hashCode() {
        long j = this.f121770a;
        return this.f121771b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f121770a;
        String obj = this.f121771b.toString();
        return "TimeUnitPair{duration=" + j + ", timeUnit=" + obj + "}";
    }
}
