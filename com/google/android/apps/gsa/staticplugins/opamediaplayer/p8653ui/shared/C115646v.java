package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.v */
/* compiled from: PG */
public final class C115646v {

    /* renamed from: a */
    public final BigDecimal f320820a;

    public C115646v(float f) {
        this.f320820a = new BigDecimal((double) f).setScale(4, RoundingMode.HALF_UP);
    }

    /* renamed from: a */
    public final Float mo102171a() {
        return Float.valueOf(this.f320820a.floatValue());
    }

    /* renamed from: b */
    public final String mo102172b() {
        return String.format(Locale.getDefault(), "%.1fx", new Object[]{Float.valueOf(this.f320820a.floatValue())});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C115646v) {
            return this.f320820a.equals(((C115646v) obj).f320820a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f320820a.hashCode();
    }
}
