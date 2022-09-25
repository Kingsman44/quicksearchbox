package com.google.android.libraries.p10923ac.p10925b.p10944k;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.ac.b.k.b */
/* compiled from: PG */
final class C147142b extends C147131af {

    /* renamed from: a */
    public final long f397254a;

    /* renamed from: b */
    public final long f397255b;

    /* renamed from: c */
    public final C58495hd f397256c;

    public C147142b(long j, long j2, C58495hd hdVar) {
        this.f397254a = j;
        this.f397255b = j2;
        this.f397256c = hdVar;
    }

    /* renamed from: a */
    public final long mo123951a() {
        return this.f397254a;
    }

    /* renamed from: b */
    public final long mo123952b() {
        return this.f397255b;
    }

    /* renamed from: c */
    public final C147130ae mo123953c() {
        return new C147125a(this);
    }

    /* renamed from: d */
    public final C58495hd mo123954d() {
        return this.f397256c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C147131af) {
            C147131af afVar = (C147131af) obj;
            return this.f397254a == afVar.mo123951a() && this.f397255b == afVar.mo123952b() && this.f397256c.equals(afVar.mo123954d());
        }
    }

    public final int hashCode() {
        long j = this.f397254a;
        long j2 = this.f397255b;
        return C58758qx.m90643a(this.f397256c.entrySet()) ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        long j = this.f397254a;
        long j2 = this.f397255b;
        String obj = this.f397256c.toString();
        return "DirtyCounters{read=" + j + ", write=" + j2 + ", triggers=" + obj + "}";
    }
}
