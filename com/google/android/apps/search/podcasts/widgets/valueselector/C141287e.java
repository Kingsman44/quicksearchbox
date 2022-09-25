package com.google.android.apps.search.podcasts.widgets.valueselector;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.podcasts.widgets.valueselector.e */
/* compiled from: PG */
public final class C141287e implements C141288f {

    /* renamed from: a */
    private final BigDecimal f383585a;

    public C141287e(float f) {
        this.f383585a = new BigDecimal((double) f).setScale(4, RoundingMode.HALF_UP);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo115955a() {
        return Float.valueOf(this.f383585a.floatValue());
    }

    /* renamed from: b */
    public final String mo115956b() {
        return String.format(Locale.US, "%.1f", new Object[]{Float.valueOf(this.f383585a.floatValue())});
    }

    /* renamed from: c */
    public final String mo115957c() {
        return String.format(Locale.US, "%.1fx", new Object[]{Float.valueOf(this.f383585a.floatValue())});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C141287e) {
            return this.f383585a.equals(((C141287e) obj).f383585a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f383585a.hashCode();
    }

    public final String toString() {
        return mo115956b();
    }
}
