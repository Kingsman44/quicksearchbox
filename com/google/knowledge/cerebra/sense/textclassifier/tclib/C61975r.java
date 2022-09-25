package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import java.util.Locale;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.r */
/* compiled from: PG */
final class C61975r extends C61953di {

    /* renamed from: a */
    private final Locale f167495a;

    /* renamed from: b */
    private final float f167496b;

    public C61975r(Locale locale, float f) {
        this.f167495a = locale;
        this.f167496b = f;
    }

    /* renamed from: a */
    public final float mo58414a() {
        return this.f167496b;
    }

    /* renamed from: b */
    public final Locale mo58415b() {
        return this.f167495a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C61953di) {
            C61953di diVar = (C61953di) obj;
            return this.f167495a.equals(diVar.mo58415b()) && Float.floatToIntBits(this.f167496b) == Float.floatToIntBits(diVar.mo58414a());
        }
    }

    public final int hashCode() {
        return ((this.f167495a.hashCode() ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.f167496b);
    }

    public final String toString() {
        String obj = this.f167495a.toString();
        float f = this.f167496b;
        return "LocaleConfidence{locale=" + obj + ", confidence=" + f + "}";
    }
}
