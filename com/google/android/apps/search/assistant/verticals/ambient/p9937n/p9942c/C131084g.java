package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9942c;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.c.g */
/* compiled from: PG */
public final class C131084g extends C131081d {

    /* renamed from: a */
    private final C58485gu f358544a;

    /* renamed from: b */
    private final long f358545b;

    /* renamed from: c */
    private final Duration f358546c;

    /* renamed from: d */
    private final C58485gu f358547d;

    /* renamed from: e */
    private final Instant f358548e;

    /* renamed from: f */
    private final Instant f358549f;

    public C131084g(C58485gu guVar, long j, Duration duration, C58485gu guVar2, Instant instant, Instant instant2) {
        this.f358544a = guVar;
        this.f358545b = j;
        this.f358546c = duration;
        this.f358547d = guVar2;
        this.f358548e = instant;
        this.f358549f = instant2;
    }

    /* renamed from: a */
    public final long mo110046a() {
        return this.f358545b;
    }

    /* renamed from: b */
    public final C58485gu mo110047b() {
        return this.f358544a;
    }

    /* renamed from: c */
    public final C58485gu mo110048c() {
        return this.f358547d;
    }

    /* renamed from: d */
    public final Duration mo110049d() {
        return this.f358546c;
    }

    /* renamed from: e */
    public final Instant mo110050e() {
        return this.f358548e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C131081d) {
            C131081d dVar = (C131081d) obj;
            return C58597ky.m90218i(this.f358544a, dVar.mo110047b()) && this.f358545b == dVar.mo110046a() && this.f358546c.equals(dVar.mo110049d()) && C58597ky.m90218i(this.f358547d, dVar.mo110048c()) && this.f358548e.equals(dVar.mo110050e()) && this.f358549f.equals(dVar.mo110051f());
        }
    }

    /* renamed from: f */
    public final Instant mo110051f() {
        return this.f358549f;
    }

    public final int hashCode() {
        int hashCode = this.f358544a.hashCode();
        long j = this.f358545b;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f358546c.hashCode()) * 1000003) ^ this.f358547d.hashCode()) * 1000003) ^ this.f358548e.hashCode()) * 1000003) ^ this.f358549f.hashCode();
    }

    public final String toString() {
        String obj = this.f358544a.toString();
        long j = this.f358545b;
        String obj2 = this.f358546c.toString();
        String obj3 = this.f358547d.toString();
        String obj4 = this.f358548e.toString();
        String obj5 = this.f358549f.toString();
        return "AppEventsAggregates{appEventSummaries=" + obj + ", connectionsCount=" + j + ", headphoneDuration=" + obj2 + ", headphoneConnectionStats=" + obj3 + ", firstConnectionTime=" + obj4 + ", lastDisconnectionTime=" + obj5 + "}";
    }
}
