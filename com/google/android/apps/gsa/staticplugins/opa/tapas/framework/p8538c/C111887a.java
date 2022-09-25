package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.a */
/* compiled from: PG */
class C111887a extends C111970bk {

    /* renamed from: a */
    public final C58881cr f310897a;

    /* renamed from: b */
    private final C60870cx f310898b;

    /* renamed from: c */
    private final long f310899c;

    /* renamed from: d */
    private final long f310900d;

    /* renamed from: e */
    private final C60870cx f310901e;

    public C111887a(C60870cx cxVar, C58881cr crVar, long j, long j2, C60870cx cxVar2) {
        this.f310898b = cxVar;
        this.f310897a = crVar;
        this.f310899c = j;
        this.f310900d = j2;
        if (cxVar2 != null) {
            this.f310901e = cxVar2;
            return;
        }
        throw new NullPointerException("Null fetchLatency");
    }

    /* renamed from: a */
    public final long mo99275a() {
        return this.f310899c;
    }

    /* renamed from: b */
    public final long mo99276b() {
        return this.f310900d;
    }

    /* renamed from: c */
    public final C58881cr mo99277c() {
        return this.f310897a;
    }

    /* renamed from: d */
    public final C60870cx mo99278d() {
        return this.f310898b;
    }

    /* renamed from: e */
    public final C60870cx mo99279e() {
        return this.f310901e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C111970bk) {
            C111970bk bkVar = (C111970bk) obj;
            return this.f310898b.equals(bkVar.mo99278d()) && this.f310897a.equals(bkVar.mo99277c()) && this.f310899c == bkVar.mo99275a() && this.f310900d == bkVar.mo99276b() && this.f310901e.equals(bkVar.mo99279e());
        }
    }

    public final int hashCode() {
        int hashCode = this.f310898b.hashCode();
        int hashCode2 = this.f310897a.hashCode();
        long j = this.f310899c;
        long j2 = this.f310900d;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f310901e.hashCode();
    }

    public final String toString() {
        String obj = this.f310898b.toString();
        String obj2 = this.f310897a.toString();
        long j = this.f310899c;
        long j2 = this.f310900d;
        String obj3 = this.f310901e.toString();
        return "FetchInfo{candidates=" + obj + ", ranker=" + obj2 + ", fetchTime=" + j + ", refreshTime=" + j2 + ", fetchLatency=" + obj3 + "}";
    }
}
