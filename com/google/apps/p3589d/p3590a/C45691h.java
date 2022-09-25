package com.google.apps.p3589d.p3590a;

import com.google.apps.p3589d.p3600k.C45941f;
import com.google.apps.p3589d.p3600k.C45944i;

/* renamed from: com.google.apps.d.a.h */
/* compiled from: PG */
public final class C45691h extends C45709z {

    /* renamed from: a */
    private final C45944i f120194a;

    /* renamed from: b */
    private final C45944i f120195b;

    /* renamed from: c */
    private final C45941f f120196c;

    /* renamed from: d */
    private final double f120197d;

    public C45691h(C45944i iVar, C45944i iVar2, C45941f fVar, double d) {
        this.f120194a = iVar;
        this.f120195b = iVar2;
        if (fVar != null) {
            this.f120196c = fVar;
            this.f120197d = d;
            return;
        }
        throw new NullPointerException("Null color");
    }

    /* renamed from: a */
    public final double mo49778a() {
        return this.f120197d;
    }

    /* renamed from: b */
    public final C45941f mo49779b() {
        return this.f120196c;
    }

    /* renamed from: c */
    public final C45944i mo49780c() {
        return this.f120194a;
    }

    /* renamed from: d */
    public final C45944i mo49781d() {
        return this.f120195b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45709z) {
            C45709z zVar = (C45709z) obj;
            return this.f120194a.equals(zVar.mo49780c()) && this.f120195b.equals(zVar.mo49781d()) && this.f120196c.equals(zVar.mo49779b()) && Double.doubleToLongBits(this.f120197d) == Double.doubleToLongBits(zVar.mo49778a());
        }
    }

    public final int hashCode() {
        return ((((((this.f120194a.hashCode() ^ 1000003) * 1000003) ^ this.f120195b.hashCode()) * 1000003) ^ this.f120196c.hashCode()) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f120197d) >>> 32) ^ Double.doubleToLongBits(this.f120197d)));
    }

    public final String toString() {
        String obj = this.f120194a.toString();
        String obj2 = this.f120195b.toString();
        String obj3 = this.f120196c.toString();
        double d = this.f120197d;
        return "LineData{from=" + obj + ", to=" + obj2 + ", color=" + obj3 + ", thickness=" + d + "}";
    }
}
