package com.google.frameworks.client.p4624a.p4625a.p4626a.p4627a;

import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.p4624a.p4629b.C61310g;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.frameworks.client.a.a.a.a.a */
/* compiled from: PG */
final class C61286a extends C61297l {

    /* renamed from: a */
    public final long f165762a;

    /* renamed from: b */
    private final C61310g f165763b;

    /* renamed from: c */
    private final C60870cx f165764c;

    /* renamed from: d */
    private final AtomicLong f165765d;

    public C61286a(C61310g gVar, C60870cx cxVar, long j, AtomicLong atomicLong) {
        this.f165763b = gVar;
        this.f165764c = cxVar;
        this.f165762a = j;
        this.f165765d = atomicLong;
    }

    /* renamed from: a */
    public final long mo57889a() {
        return this.f165762a;
    }

    /* renamed from: b */
    public final C60870cx mo57890b() {
        return this.f165764c;
    }

    /* renamed from: c */
    public final C61310g mo57891c() {
        return this.f165763b;
    }

    /* renamed from: d */
    public final AtomicLong mo57892d() {
        return this.f165765d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C61297l) {
            C61297l lVar = (C61297l) obj;
            return this.f165763b.equals(lVar.mo57891c()) && this.f165764c.equals(lVar.mo57890b()) && this.f165762a == lVar.mo57889a() && this.f165765d.equals(lVar.mo57892d());
        }
    }

    public final int hashCode() {
        int hashCode = this.f165763b.hashCode();
        int hashCode2 = this.f165764c.hashCode();
        long j = this.f165762a;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f165765d.hashCode();
    }

    public final String toString() {
        String obj = this.f165763b.toString();
        String obj2 = this.f165764c.toString();
        long j = this.f165762a;
        String obj3 = this.f165765d.toString();
        return "LogStat{eventBuilder=" + obj + ", account=" + obj2 + ", timestampNanos=" + j + ", count=" + obj3 + "}";
    }
}
