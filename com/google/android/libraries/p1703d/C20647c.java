package com.google.android.libraries.p1703d;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58758qx;

/* renamed from: com.google.android.libraries.d.c */
/* compiled from: PG */
public final class C20647c extends C20646b {

    /* renamed from: a */
    public final C20636a f57885a;

    /* renamed from: b */
    public final long f57886b;

    /* renamed from: c */
    public final C58495hd f57887c;

    public C20647c(C20636a aVar, long j, C58495hd hdVar) {
        this.f57885a = aVar;
        this.f57886b = j;
        this.f57887c = hdVar;
    }

    /* renamed from: a */
    public final long mo25602a() {
        return this.f57886b;
    }

    /* renamed from: b */
    public final C20636a mo25603b() {
        return this.f57885a;
    }

    /* renamed from: d */
    public final C58495hd mo25604d() {
        return this.f57887c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C20646b) {
            C20646b bVar = (C20646b) obj;
            return this.f57885a.equals(bVar.mo25603b()) && this.f57886b == bVar.mo25602a() && C58662ni.m90356o(this.f57887c, bVar.mo25604d());
        }
    }

    public final int hashCode() {
        int hashCode = this.f57885a.hashCode();
        long j = this.f57886b;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ C58758qx.m90643a(this.f57887c.entrySet());
    }

    public final String toString() {
        String obj = this.f57885a.toString();
        long j = this.f57886b;
        String i = C58662ni.m90350i(this.f57887c);
        return "AgsaExperimentParamsResult{status=" + obj + ", lastUpdateTimeMs=" + j + ", agsaParameters=" + i + "}";
    }
}
