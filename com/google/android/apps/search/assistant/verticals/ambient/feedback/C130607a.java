package com.google.android.apps.search.assistant.verticals.ambient.feedback;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.a */
/* compiled from: PG */
final class C130607a extends C130655n {

    /* renamed from: a */
    private final double f357714a;

    /* renamed from: b */
    private final C58485gu f357715b;

    public C130607a(double d, C58485gu guVar) {
        this.f357714a = d;
        if (guVar != null) {
            this.f357715b = guVar;
            return;
        }
        throw new NullPointerException("Null places");
    }

    /* renamed from: a */
    public final double mo109748a() {
        return this.f357714a;
    }

    /* renamed from: b */
    public final C58485gu mo109749b() {
        return this.f357715b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C130655n) {
            C130655n nVar = (C130655n) obj;
            return Double.doubleToLongBits(this.f357714a) == Double.doubleToLongBits(nVar.mo109748a()) && C58597ky.m90218i(this.f357715b, nVar.mo109749b());
        }
    }

    public final int hashCode() {
        return this.f357715b.hashCode() ^ ((((int) ((Double.doubleToLongBits(this.f357714a) >>> 32) ^ Double.doubleToLongBits(this.f357714a))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        double d = this.f357714a;
        String obj = this.f357715b.toString();
        return "GroupedScoredPlaces{score=" + d + ", places=" + obj + "}";
    }
}
