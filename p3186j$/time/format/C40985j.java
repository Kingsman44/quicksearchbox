package p3186j$.time.format;

import p3186j$.time.temporal.ChronoField;

/* renamed from: j$.time.format.j */
final class C40985j implements C40982g {

    /* renamed from: a */
    public final /* synthetic */ int f107341a;

    /* renamed from: b */
    private final Object f107342b;

    public /* synthetic */ C40985j(int i, Object obj) {
        this.f107341a = i;
        this.f107342b = obj;
    }

    /* renamed from: a */
    private static void m71400a(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    /* renamed from: c */
    static int m71401c(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if (charAt < '0' || charAt > '9') {
            return -1;
        }
        return charAt - '0';
    }

    /* renamed from: b */
    public final boolean mo43294b(C41001z zVar, StringBuilder sb) {
        String str;
        int i = this.f107341a;
        Object obj = this.f107342b;
        switch (i) {
            case 0:
                Long e = zVar.mo43343e(ChronoField.OFFSET_SECONDS);
                if (e == null) {
                    return false;
                }
                sb.append("GMT");
                long longValue = e.longValue();
                int i2 = (int) longValue;
                if (longValue != ((long) i2)) {
                    throw new ArithmeticException();
                } else if (i2 == 0) {
                    return true;
                } else {
                    int abs = Math.abs((i2 / 3600) % 100);
                    int abs2 = Math.abs((i2 / 60) % 60);
                    int abs3 = Math.abs(i2 % 60);
                    if (i2 < 0) {
                        str = "-";
                    } else {
                        str = "+";
                    }
                    sb.append(str);
                    if (((C40974G) obj) == C40974G.FULL) {
                        m71400a(sb, abs);
                        sb.append(':');
                        m71400a(sb, abs2);
                        if (abs3 == 0) {
                            return true;
                        }
                    } else {
                        if (abs >= 10) {
                            sb.append((char) ((abs / 10) + 48));
                        }
                        sb.append((char) ((abs % 10) + 48));
                        if (abs2 == 0 && abs3 == 0) {
                            return true;
                        }
                        sb.append(':');
                        m71400a(sb, abs2);
                        if (abs3 == 0) {
                            return true;
                        }
                    }
                    sb.append(':');
                    m71400a(sb, abs3);
                    return true;
                }
            default:
                sb.append((String) obj);
                return true;
        }
    }

    /* renamed from: d */
    public final int mo43295d(C40999x xVar, CharSequence charSequence, int i) {
        int i2;
        long j;
        ChronoField chronoField;
        int i3;
        int i4;
        int i5;
        int i6;
        CharSequence charSequence2 = charSequence;
        int i7 = i;
        int i8 = this.f107341a;
        Object obj = this.f107342b;
        switch (i8) {
            case 0:
                int length = charSequence.length();
                if (xVar.mo43335s(charSequence, i, "GMT", 0, 3)) {
                    int i9 = i7 + 3;
                    if (i9 != length) {
                        char charAt = charSequence2.charAt(i9);
                        if (charAt == '+') {
                            i3 = 1;
                        } else if (charAt == '-') {
                            i3 = -1;
                        }
                        int i10 = i9 + 1;
                        int i11 = 0;
                        if (((C40974G) obj) == C40974G.FULL) {
                            int i12 = i10 + 1;
                            int c = m71401c(charSequence2, i10);
                            int i13 = i12 + 1;
                            int c2 = m71401c(charSequence2, i12);
                            if (c >= 0 && c2 >= 0) {
                                int i14 = i13 + 1;
                                if (charSequence2.charAt(i13) == ':') {
                                    i6 = (c * 10) + c2;
                                    int i15 = i14 + 1;
                                    int c3 = m71401c(charSequence2, i14);
                                    i4 = i15 + 1;
                                    int c4 = m71401c(charSequence2, i15);
                                    if (c3 >= 0 && c4 >= 0) {
                                        int i16 = (c3 * 10) + c4;
                                        int i17 = i4 + 2;
                                        if (i17 < length && charSequence2.charAt(i4) == ':') {
                                            int c5 = m71401c(charSequence2, i4 + 1);
                                            int c6 = m71401c(charSequence2, i17);
                                            if (c5 >= 0 && c6 >= 0) {
                                                i11 = (c5 * 10) + c6;
                                                i4 += 3;
                                            }
                                        }
                                        i5 = i11;
                                        i11 = i16;
                                    }
                                }
                            }
                        } else {
                            int i18 = i10 + 1;
                            i6 = m71401c(charSequence2, i10);
                            if (i6 >= 0) {
                                if (i18 < length) {
                                    int c7 = m71401c(charSequence2, i18);
                                    if (c7 >= 0) {
                                        i6 = (i6 * 10) + c7;
                                        i18++;
                                    }
                                    int i19 = i18 + 2;
                                    if (i19 < length && charSequence2.charAt(i18) == ':' && i19 < length && charSequence2.charAt(i18) == ':') {
                                        int c8 = m71401c(charSequence2, i18 + 1);
                                        int c9 = m71401c(charSequence2, i19);
                                        if (c8 >= 0 && c9 >= 0) {
                                            int i20 = (c8 * 10) + c9;
                                            int i21 = i18 + 3;
                                            int i22 = i21 + 2;
                                            if (i22 < length && charSequence2.charAt(i21) == ':') {
                                                int c10 = m71401c(charSequence2, i21 + 1);
                                                int c11 = m71401c(charSequence2, i22);
                                                if (c10 >= 0 && c11 >= 0) {
                                                    i11 = (c10 * 10) + c11;
                                                    i21 += 3;
                                                }
                                            }
                                            i4 = i21;
                                            i5 = i11;
                                            i11 = i20;
                                        }
                                    }
                                }
                                i4 = i18;
                                i5 = 0;
                            }
                        }
                        chronoField = ChronoField.OFFSET_SECONDS;
                        i2 = i4;
                        j = ((((long) i11) * 60) + (((long) i6) * 3600) + ((long) i5)) * ((long) i3);
                        return xVar.mo43331o(chronoField, j, i, i2);
                    }
                    chronoField = ChronoField.OFFSET_SECONDS;
                    j = 0;
                    i2 = i9;
                    return xVar.mo43331o(chronoField, j, i, i2);
                }
                return i7 ^ -1;
            default:
                if (i7 > charSequence.length() || i7 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                String str = (String) obj;
                if (!xVar.mo43335s(charSequence, i, str, 0, str.length())) {
                    return i7 ^ -1;
                }
                return str.length() + i7;
        }
    }

    public final String toString() {
        int i = this.f107341a;
        Object obj = this.f107342b;
        switch (i) {
            case 0:
                String valueOf = String.valueOf((C40974G) obj);
                return "LocalizedOffset(" + valueOf + ")";
            default:
                String replace = ((String) obj).replace("'", "''");
                return "'" + replace + "'";
        }
    }
}
