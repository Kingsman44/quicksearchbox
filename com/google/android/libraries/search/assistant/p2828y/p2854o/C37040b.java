package com.google.android.libraries.search.assistant.p2828y.p2854o;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.search.assistant.y.o.b */
/* compiled from: PG */
final class C37040b extends C37053o {

    /* renamed from: a */
    public final double f96482a;

    /* renamed from: b */
    public final C58485gu f96483b;

    public C37040b(double d, C58485gu guVar) {
        this.f96482a = d;
        if (guVar != null) {
            this.f96483b = guVar;
            return;
        }
        throw new NullPointerException("Null propertyValueList");
    }

    /* renamed from: a */
    public final double mo40548a() {
        return this.f96482a;
    }

    /* renamed from: b */
    public final C58485gu mo40549b() {
        return this.f96483b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C37053o) {
            C37053o oVar = (C37053o) obj;
            return Double.doubleToLongBits(this.f96482a) == Double.doubleToLongBits(oVar.mo40548a()) && C58597ky.m90218i(this.f96483b, oVar.mo40549b());
        }
    }

    public final int hashCode() {
        return this.f96483b.hashCode() ^ ((((int) ((Double.doubleToLongBits(this.f96482a) >>> 32) ^ Double.doubleToLongBits(this.f96482a))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        double d = this.f96482a;
        String obj = this.f96483b.toString();
        return "ScoredPropertyValueList{score=" + d + ", propertyValueList=" + obj + "}";
    }
}
