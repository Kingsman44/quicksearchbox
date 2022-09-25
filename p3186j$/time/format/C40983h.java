package p3186j$.time.format;

import com.evernote.android.state.BuildConfig;
import java.math.BigDecimal;
import java.math.RoundingMode;
import p3186j$.time.temporal.ChronoField;
import p3186j$.time.temporal.TemporalField;
import p3186j$.time.temporal.ValueRange;
import p3186j$.util.Objects;

/* renamed from: j$.time.format.h */
final class C40983h extends C40987l {

    /* renamed from: g */
    private final boolean f107340g;

    C40983h(ChronoField chronoField, int i, int i2, boolean z) {
        this(chronoField, i, i2, z, 0);
        Objects.requireNonNull(chronoField, "field");
        if (!chronoField.range().mo43368e()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: ".concat(String.valueOf(chronoField)));
        } else if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
        } else if (i2 < 1 || i2 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
        } else if (i2 < i) {
            throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
        }
    }

    C40983h(TemporalField temporalField, int i, int i2, boolean z, int i3) {
        super(temporalField, i, i2, C40973F.NOT_NEGATIVE, i3);
        this.f107340g = z;
    }

    /* renamed from: b */
    public final boolean mo43294b(C41001z zVar, StringBuilder sb) {
        BigDecimal bigDecimal;
        TemporalField temporalField = this.f107347a;
        Long e = zVar.mo43343e(temporalField);
        if (e == null) {
            return false;
        }
        C40970C b = zVar.mo43340b();
        long longValue = e.longValue();
        ValueRange range = temporalField.range();
        range.mo43366b(temporalField, longValue);
        BigDecimal valueOf = BigDecimal.valueOf(range.getMinimum());
        BigDecimal divide = BigDecimal.valueOf(longValue).subtract(valueOf).divide(BigDecimal.valueOf(range.mo43367d()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        if (divide.compareTo(BigDecimal.ZERO) == 0) {
            bigDecimal = BigDecimal.ZERO;
        } else {
            bigDecimal = divide.stripTrailingZeros();
        }
        int scale = bigDecimal.scale();
        boolean z = this.f107340g;
        int i = this.f107348b;
        if (scale != 0) {
            String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.f107349c), RoundingMode.FLOOR).toPlainString().substring(2);
            b.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(substring);
            return true;
        } else if (i <= 0) {
            return true;
        } else {
            if (z) {
                b.getClass();
                sb.append('.');
            }
            for (int i2 = 0; i2 < i; i2++) {
                b.getClass();
                sb.append('0');
            }
            return true;
        }
    }

    /* renamed from: d */
    public final int mo43295d(C40999x xVar, CharSequence charSequence, int i) {
        int i2;
        int i3;
        int i4;
        if (xVar.mo43328l() || mo43299e(xVar)) {
            i2 = this.f107348b;
        } else {
            i2 = 0;
        }
        if (xVar.mo43328l() || mo43299e(xVar)) {
            i3 = this.f107349c;
        } else {
            i3 = 9;
        }
        int length = charSequence.length();
        if (i != length) {
            if (this.f107340g) {
                char charAt = charSequence.charAt(i);
                xVar.mo43323g().getClass();
                if (charAt == '.') {
                    i++;
                } else if (i2 > 0) {
                    return i ^ -1;
                } else {
                    return i;
                }
            }
            int i5 = i;
            int i6 = i2 + i5;
            if (i6 > length) {
                return i5 ^ -1;
            }
            int min = Math.min(i3 + i5, length);
            int i7 = i5;
            int i8 = 0;
            while (true) {
                if (i7 >= min) {
                    i4 = i7;
                    break;
                }
                int i9 = i7 + 1;
                int a = xVar.mo43323g().mo43252a(charSequence.charAt(i7));
                if (a >= 0) {
                    i8 = (i8 * 10) + a;
                    i7 = i9;
                } else if (i9 < i6) {
                    return i5 ^ -1;
                } else {
                    i4 = i9 - 1;
                }
            }
            BigDecimal movePointLeft = new BigDecimal(i8).movePointLeft(i4 - i5);
            ValueRange range = this.f107347a.range();
            BigDecimal valueOf = BigDecimal.valueOf(range.getMinimum());
            return xVar.mo43331o(this.f107347a, movePointLeft.multiply(BigDecimal.valueOf(range.mo43367d()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact(), i5, i4);
        } else if (i2 > 0) {
            return i ^ -1;
        } else {
            return i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo43299e(C40999x xVar) {
        return xVar.mo43328l() && this.f107348b == this.f107349c && !this.f107340g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C40987l mo43300g() {
        return this.f107351e == -1 ? this : new C40983h(this.f107347a, this.f107348b, this.f107349c, this.f107340g, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C40987l mo43301h(int i) {
        return new C40983h(this.f107347a, this.f107348b, this.f107349c, this.f107340g, this.f107351e + i);
    }

    public final String toString() {
        String str = this.f107340g ? ",DecimalPoint" : BuildConfig.FLAVOR;
        String valueOf = String.valueOf(this.f107347a);
        return "Fraction(" + valueOf + "," + this.f107348b + "," + this.f107349c + str + ")";
    }
}
