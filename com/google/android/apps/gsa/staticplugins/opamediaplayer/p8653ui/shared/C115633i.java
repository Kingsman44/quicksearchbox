package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.shared;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.shared.i */
/* compiled from: PG */
public final class C115633i {

    /* renamed from: a */
    public final BigDecimal f320784a;

    public C115633i(Float f) {
        this.f320784a = new BigDecimal((double) f.floatValue()).setScale(4, RoundingMode.HALF_UP);
    }

    /* renamed from: a */
    public final String mo102151a() {
        return String.format(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(this.f320784a.floatValue())});
    }

    /* renamed from: b */
    public final String mo102152b() {
        return String.format(Locale.getDefault(), "%.1fx", new Object[]{Float.valueOf(this.f320784a.floatValue())});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C115633i) {
            return this.f320784a.equals(((C115633i) obj).f320784a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f320784a.hashCode();
    }
}
