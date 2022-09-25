package p3186j$.time.format;

import com.google.android.libraries.p579ar.sceneviewer.p589ui.SimpleSnackbar;
import p3186j$.time.DateTimeException;
import p3186j$.time.LocalDate;
import p3186j$.time.chrono.C40959b;
import p3186j$.time.chrono.C40963f;
import p3186j$.time.chrono.ChronoLocalDate;
import p3186j$.time.temporal.TemporalField;
import p3186j$.util.Objects;

/* renamed from: j$.time.format.r */
final class C40993r extends C40987l {

    /* renamed from: i */
    static final LocalDate f107371i = LocalDate.m71157of(SimpleSnackbar.LENGTH_SHORT, 1, 1);

    /* renamed from: g */
    private final int f107372g;

    /* renamed from: h */
    private final ChronoLocalDate f107373h;

    private C40993r(TemporalField temporalField, int i, int i2, int i3, ChronoLocalDate chronoLocalDate, int i4) {
        super(temporalField, i, i2, C40973F.NOT_NEGATIVE, i4);
        this.f107372g = i3;
        this.f107373h = chronoLocalDate;
    }

    C40993r(TemporalField temporalField, LocalDate localDate) {
        this(temporalField, 2, 2, 0, localDate, 0);
        if (localDate == null) {
            long j = (long) 0;
            if (!temporalField.range().mo43371g(j)) {
                throw new IllegalArgumentException("The base value must be within the range of the field");
            } else if (j + C40987l.f107346f[2] > 2147483647L) {
                throw new DateTimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
            }
        }
    }

    /* synthetic */ C40993r(TemporalField temporalField, LocalDate localDate, int i) {
        this(temporalField, 2, 2, 0, localDate, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final long mo43306c(C41001z zVar, long j) {
        int i;
        long abs = Math.abs(j);
        ChronoLocalDate chronoLocalDate = this.f107373h;
        if (chronoLocalDate != null) {
            ((C40963f) C40959b.m71322b(zVar.mo43342d())).getClass();
            i = LocalDate.m71156o(chronoLocalDate).get(this.f107347a);
        } else {
            i = this.f107372g;
        }
        long j2 = (long) i;
        long[] jArr = C40987l.f107346f;
        if (j >= j2) {
            long j3 = jArr[this.f107348b];
            if (j < j2 + j3) {
                return abs % j3;
            }
        }
        return abs % jArr[this.f107349c];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo43299e(C40999x xVar) {
        if (!xVar.mo43328l()) {
            return false;
        }
        return super.mo43299e(xVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo43307f(C40999x xVar, long j, int i, int i2) {
        int i3;
        long j2;
        ChronoLocalDate chronoLocalDate = this.f107373h;
        if (chronoLocalDate != null) {
            ((C40963f) xVar.mo43324h()).getClass();
            i3 = LocalDate.m71156o(chronoLocalDate).get(this.f107347a);
            xVar.mo43319a(new C40992q(this, xVar, j, i, i2));
        } else {
            i3 = this.f107372g;
        }
        int i4 = i2 - i;
        int i5 = this.f107348b;
        if (i4 == i5 && j >= 0) {
            long j3 = C40987l.f107346f[i5];
            long j4 = (long) i3;
            long j5 = j4 - (j4 % j3);
            if (i3 > 0) {
                j2 = j5 + j;
            } else {
                j2 = j5 - j;
            }
            j = j2;
            if (j < j4) {
                j += j3;
            }
        }
        return xVar.mo43331o(this.f107347a, j, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C40987l mo43300g() {
        return this.f107351e == -1 ? this : new C40993r(this.f107347a, this.f107348b, this.f107349c, this.f107372g, this.f107373h, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C40987l mo43301h(int i) {
        return new C40993r(this.f107347a, this.f107348b, this.f107349c, this.f107372g, this.f107373h, this.f107351e + i);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f107347a);
        String valueOf2 = String.valueOf(Objects.requireNonNullElse(this.f107373h, Integer.valueOf(this.f107372g)));
        return "ReducedValue(" + valueOf + "," + this.f107348b + "," + this.f107349c + "," + valueOf2 + ")";
    }
}
