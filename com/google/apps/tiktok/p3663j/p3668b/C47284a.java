package com.google.apps.tiktok.p3663j.p3668b;

import com.google.common.base.C58833ax;
import java.util.Set;

/* renamed from: com.google.apps.tiktok.j.b.a */
/* compiled from: PG */
final class C47284a extends C47305am {

    /* renamed from: a */
    private final Set f122935a;

    /* renamed from: b */
    private final long f122936b;

    /* renamed from: c */
    private final C58833ax f122937c;

    public C47284a(Set set, long j, C58833ax axVar) {
        this.f122935a = set;
        this.f122936b = j;
        if (axVar != null) {
            this.f122937c = axVar;
            return;
        }
        throw new NullPointerException("Null deadlineToIgnoreOptionalConstraints");
    }

    /* renamed from: a */
    public final long mo51168a() {
        return this.f122936b;
    }

    /* renamed from: b */
    public final C58833ax mo51169b() {
        return this.f122937c;
    }

    /* renamed from: c */
    public final Set mo51170c() {
        return this.f122935a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C47305am) {
            C47305am amVar = (C47305am) obj;
            return this.f122935a.equals(amVar.mo51170c()) && this.f122936b == amVar.mo51168a() && this.f122937c.equals(amVar.mo51169b());
        }
    }

    public final int hashCode() {
        int hashCode = this.f122935a.hashCode();
        long j = this.f122936b;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f122937c.hashCode();
    }

    public final String toString() {
        String obj = this.f122935a.toString();
        long j = this.f122936b;
        String obj2 = this.f122937c.toString();
        return "SyncSchedule{constraints=" + obj + ", minLatencyBeforeCheckingConstraints=" + j + ", deadlineToIgnoreOptionalConstraints=" + obj2 + "}";
    }
}
