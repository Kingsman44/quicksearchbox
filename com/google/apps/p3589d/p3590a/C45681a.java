package com.google.apps.p3589d.p3590a;

import com.google.apps.p3589d.p3600k.C45944i;
import com.google.apps.p3589d.p3600k.C45946k;

/* renamed from: com.google.apps.d.a.a */
/* compiled from: PG */
public final class C45681a extends C45699p {

    /* renamed from: a */
    public final C45944i f120165a;

    /* renamed from: b */
    public final double f120166b;

    /* renamed from: c */
    public final C45946k f120167c;

    public C45681a(C45944i iVar, double d, C45946k kVar) {
        if (iVar != null) {
            this.f120165a = iVar;
            this.f120166b = d;
            if (kVar != null) {
                this.f120167c = kVar;
                return;
            }
            throw new NullPointerException("Null selection");
        }
        throw new NullPointerException("Null bottomPosition");
    }

    /* renamed from: a */
    public final double mo49731a() {
        return this.f120166b;
    }

    /* renamed from: b */
    public final C45944i mo49732b() {
        return this.f120165a;
    }

    /* renamed from: c */
    public final C45946k mo49733c() {
        return this.f120167c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C45699p) {
            C45699p pVar = (C45699p) obj;
            return this.f120165a.equals(pVar.mo49732b()) && Double.doubleToLongBits(this.f120166b) == Double.doubleToLongBits(pVar.mo49731a()) && this.f120167c.equals(pVar.mo49733c());
        }
    }

    public final int hashCode() {
        return ((((this.f120165a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.f120166b) >>> 32) ^ Double.doubleToLongBits(this.f120166b)))) * 1000003) ^ this.f120167c.hashCode();
    }

    public final String toString() {
        String obj = this.f120165a.toString();
        double d = this.f120166b;
        String obj2 = this.f120167c.toString();
        return "CursorData{bottomPosition=" + obj + ", height=" + d + ", selection=" + obj2 + "}";
    }
}
