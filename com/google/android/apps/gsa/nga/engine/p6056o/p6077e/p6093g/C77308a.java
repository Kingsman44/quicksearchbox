package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6093g;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.g.a */
/* compiled from: PG */
final class C77308a extends C77348y {

    /* renamed from: a */
    private final double f213217a;

    /* renamed from: b */
    private final C58485gu f213218b;

    /* renamed from: c */
    private final String f213219c;

    public C77308a(double d, C58485gu guVar, String str) {
        this.f213217a = d;
        if (guVar != null) {
            this.f213218b = guVar;
            if (str != null) {
                this.f213219c = str;
                return;
            }
            throw new NullPointerException("Null pkg");
        }
        throw new NullPointerException("Null mids");
    }

    /* renamed from: a */
    public final double mo72515a() {
        return this.f213217a;
    }

    /* renamed from: b */
    public final C58485gu mo72516b() {
        return this.f213218b;
    }

    /* renamed from: c */
    public final String mo72517c() {
        return this.f213219c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C77348y) {
            C77348y yVar = (C77348y) obj;
            return Double.doubleToLongBits(this.f213217a) == Double.doubleToLongBits(yVar.mo72515a()) && C58597ky.m90218i(this.f213218b, yVar.mo72516b()) && this.f213219c.equals(yVar.mo72517c());
        }
    }

    public final int hashCode() {
        return this.f213219c.hashCode() ^ ((((((int) ((Double.doubleToLongBits(this.f213217a) >>> 32) ^ Double.doubleToLongBits(this.f213217a))) ^ 1000003) * 1000003) ^ this.f213218b.hashCode()) * 1000003);
    }

    public final String toString() {
        double d = this.f213217a;
        String obj = this.f213218b.toString();
        String str = this.f213219c;
        return "MidsAndAppPackage{confidence=" + d + ", mids=" + obj + ", pkg=" + str + "}";
    }
}
