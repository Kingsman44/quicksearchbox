package com.google.p4583d.p4584a.p4588d;

import com.google.common.p4535g.C59203do;
import com.google.p4583d.p4584a.C61012g;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.d.a.d.f */
/* compiled from: PG */
public final class C60979f implements C60987n {

    /* renamed from: a */
    public final Double f165106a;

    public C60979f(Double d) {
        if (d == null) {
            this.f165106a = Double.valueOf(Double.NaN);
        } else {
            this.f165106a = d;
        }
    }

    /* renamed from: d */
    public final C60987n mo57468d() {
        return new C60979f(this.f165106a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C60979f)) {
            return false;
        }
        return this.f165106a.equals(((C60979f) obj).f165106a);
    }

    /* renamed from: fK */
    public final C60987n mo57452fK(String str, C61012g gVar, List list) {
        if ("toString".equals(str)) {
            return new C60991r(mo57475i());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{mo57475i(), str}));
    }

    /* renamed from: g */
    public final Boolean mo57472g() {
        boolean z = false;
        if (!Double.isNaN(this.f165106a.doubleValue()) && this.f165106a.doubleValue() != C59203do.f157270a) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: h */
    public final Double mo57473h() {
        return this.f165106a;
    }

    public final int hashCode() {
        return this.f165106a.hashCode();
    }

    /* renamed from: i */
    public final String mo57475i() {
        int i;
        if (Double.isNaN(this.f165106a.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f165106a.doubleValue())) {
            return this.f165106a.doubleValue() > C59203do.f157270a ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f165106a.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            i = stripTrailingZeros.precision();
        } else {
            i = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(i - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf <= 0) {
            return format;
        }
        int parseInt = Integer.parseInt(format.substring(indexOf + 1));
        if ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) {
            return format.replace("E-", "e-").replace("E", "e+");
        }
        return stripTrailingZeros.toPlainString();
    }

    /* renamed from: l */
    public final Iterator mo57479l() {
        return null;
    }

    public final String toString() {
        return mo57475i();
    }
}
