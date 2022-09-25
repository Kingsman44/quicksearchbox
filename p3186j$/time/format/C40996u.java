package p3186j$.time.format;

import java.util.Locale;
import p3186j$.time.temporal.TemporalField;
import p3186j$.time.temporal.WeekFields;

/* renamed from: j$.time.format.u */
final class C40996u extends C40987l {

    /* renamed from: g */
    private char f107379g;

    /* renamed from: h */
    private int f107380h;

    C40996u(char c, int i, int i2, int i3) {
        this(c, i, i2, i3, 0);
    }

    C40996u(char c, int i, int i2, int i3, int i4) {
        super((TemporalField) null, i2, i3, C40973F.NOT_NEGATIVE, i4);
        this.f107379g = c;
        this.f107380h = i;
    }

    /* renamed from: i */
    private C40987l m71444i(Locale locale) {
        TemporalField temporalField;
        WeekFields of = WeekFields.m71525of(locale);
        char c = this.f107379g;
        if (c == 'W') {
            temporalField = of.mo43380h();
        } else if (c == 'Y') {
            TemporalField g = of.mo43379g();
            int i = this.f107380h;
            if (i == 2) {
                return new C40993r(g, C40993r.f107371i, this.f107351e);
            }
            return new C40987l(g, i, 19, i < 4 ? C40973F.NORMAL : C40973F.EXCEEDS_PAD, this.f107351e);
        } else if (c == 'c' || c == 'e') {
            temporalField = of.dayOfWeek();
        } else if (c == 'w') {
            temporalField = of.mo43382i();
        } else {
            throw new IllegalStateException("unreachable");
        }
        return new C40987l(temporalField, this.f107348b, this.f107349c, C40973F.NOT_NEGATIVE, this.f107351e);
    }

    /* renamed from: b */
    public final boolean mo43294b(C41001z zVar, StringBuilder sb) {
        return m71444i(zVar.mo43341c()).mo43294b(zVar, sb);
    }

    /* renamed from: d */
    public final int mo43295d(C40999x xVar, CharSequence charSequence, int i) {
        return m71444i(xVar.mo43325i()).mo43295d(xVar, charSequence, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C40987l mo43300g() {
        return this.f107351e == -1 ? this : new C40996u(this.f107379g, this.f107380h, this.f107348b, this.f107349c, -1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final C40987l mo43301h(int i) {
        return new C40996u(this.f107379g, this.f107380h, this.f107348b, this.f107349c, this.f107351e + i);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        char c = this.f107379g;
        if (c == 'Y') {
            int i = this.f107380h;
            if (i == 1) {
                str2 = "WeekBasedYear";
            } else if (i == 2) {
                str2 = "ReducedValue(WeekBasedYear,2,2,2000-01-01)";
            } else {
                sb.append("WeekBasedYear,");
                sb.append(this.f107380h);
                sb.append(",19,");
                sb.append(this.f107380h < 4 ? C40973F.NORMAL : C40973F.EXCEEDS_PAD);
            }
            sb.append(str2);
        } else {
            if (c == 'W') {
                str = "WeekOfMonth";
            } else if (c == 'c' || c == 'e') {
                str = "DayOfWeek";
            } else {
                if (c == 'w') {
                    str = "WeekOfWeekBasedYear";
                }
                sb.append(",");
                sb.append(this.f107380h);
            }
            sb.append(str);
            sb.append(",");
            sb.append(this.f107380h);
        }
        sb.append(")");
        return sb.toString();
    }
}
