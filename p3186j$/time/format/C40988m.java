package p3186j$.time.format;

import com.evernote.android.state.BuildConfig;
import p3186j$.time.temporal.ChronoField;
import p3186j$.util.Objects;

/* renamed from: j$.time.format.m */
final class C40988m implements C40982g {

    /* renamed from: d */
    static final String[] f107352d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* renamed from: e */
    static final C40988m f107353e = new C40988m("+HH:MM:ss", "Z");

    /* renamed from: f */
    static final C40988m f107354f = new C40988m("+HH:MM:ss", "0");

    /* renamed from: a */
    private final String f107355a;

    /* renamed from: b */
    private final int f107356b;

    /* renamed from: c */
    private final int f107357c;

    C40988m(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        Objects.requireNonNull(str2, "noOffsetText");
        int i = 0;
        while (true) {
            String[] strArr = f107352d;
            if (i >= strArr.length) {
                throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
            } else if (strArr[i].equals(str)) {
                this.f107356b = i;
                this.f107357c = i % 11;
                this.f107355a = str2;
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: a */
    private static void m71415a(boolean z, int i, StringBuilder sb) {
        sb.append(z ? ":" : BuildConfig.FLAVOR);
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    /* renamed from: c */
    private static boolean m71416c(CharSequence charSequence, boolean z, int i, int[] iArr) {
        int i2;
        int i3 = iArr[0];
        if (i3 < 0) {
            return true;
        }
        if (z && i != 1) {
            int i4 = i3 + 1;
            if (i4 > charSequence.length() || charSequence.charAt(i3) != ':') {
                return false;
            }
            i3 = i4;
        }
        if (i3 + 2 > charSequence.length()) {
            return false;
        }
        int i5 = i3 + 1;
        char charAt = charSequence.charAt(i3);
        int i6 = i5 + 1;
        char charAt2 = charSequence.charAt(i5);
        if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9' || (i2 = (charAt2 - '0') + ((charAt - '0') * 10)) < 0 || i2 > 59) {
            return false;
        }
        iArr[i] = i2;
        iArr[0] = i6;
        return true;
    }

    /* renamed from: e */
    private static void m71417e(CharSequence charSequence, boolean z, int[] iArr) {
        if (!z) {
            m71419g(charSequence, 1, 2, iArr);
        } else if (!m71416c(charSequence, false, 1, iArr)) {
            iArr[0] = iArr[0] ^ -1;
        }
    }

    /* renamed from: f */
    private static void m71418f(CharSequence charSequence, boolean z, boolean z2, int[] iArr) {
        if (!m71416c(charSequence, z, 2, iArr) && z2) {
            iArr[0] = iArr[0] ^ -1;
        }
    }

    /* renamed from: g */
    private static void m71419g(CharSequence charSequence, int i, int i2, int[] iArr) {
        int i3;
        int i4 = iArr[0];
        char[] cArr = new char[i2];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i5 >= i2 || (i3 = i4 + 1) > charSequence.length()) {
                break;
            }
            char charAt = charSequence.charAt(i4);
            if (charAt < '0' || charAt > '9') {
                i4 = i3 - 1;
            } else {
                cArr[i5] = charAt;
                i6++;
                i5++;
                i4 = i3;
            }
        }
        i4 = i3 - 1;
        if (i6 < i) {
            iArr[0] = iArr[0] ^ -1;
            return;
        }
        switch (i6) {
            case 1:
                iArr[1] = cArr[0] - '0';
                break;
            case 2:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                break;
            case 3:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                break;
            case 4:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                break;
            case 5:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                iArr[3] = (cArr[4] - '0') + ((cArr[3] - '0') * 10);
                break;
            case 6:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                iArr[3] = (cArr[5] - '0') + ((cArr[4] - '0') * 10);
                break;
        }
        iArr[0] = i4;
    }

    /* renamed from: b */
    public final boolean mo43294b(C41001z zVar, StringBuilder sb) {
        String str;
        boolean z;
        boolean z2;
        Long e = zVar.mo43343e(ChronoField.OFFSET_SECONDS);
        boolean z3 = false;
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        int i = (int) longValue;
        if (longValue == ((long) i)) {
            if (i != 0) {
                int abs = Math.abs((i / 3600) % 100);
                int abs2 = Math.abs((i / 60) % 60);
                int abs3 = Math.abs(i % 60);
                int length = sb.length();
                if (i < 0) {
                    str = "-";
                } else {
                    str = "+";
                }
                sb.append(str);
                if (this.f107356b < 11) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || abs >= 10) {
                    m71415a(false, abs, sb);
                } else {
                    sb.append((char) (abs + 48));
                }
                int i2 = this.f107357c;
                if ((i2 >= 3 && i2 <= 8) || ((i2 >= 9 && abs3 > 0) || (i2 >= 1 && abs2 > 0))) {
                    if (i2 <= 0 || i2 % 2 != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    m71415a(z2, abs2, sb);
                    abs += abs2;
                    if (i2 == 7 || i2 == 8 || (i2 >= 5 && abs3 > 0)) {
                        if (i2 > 0 && i2 % 2 == 0) {
                            z3 = true;
                        }
                        m71415a(z3, abs3, sb);
                        abs += abs3;
                    }
                }
                if (abs == 0) {
                    sb.setLength(length);
                }
                return true;
            }
            sb.append(this.f107355a);
            return true;
        }
        throw new ArithmeticException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        if (r8 == r9) goto L_0x012f;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo43295d(p3186j$.time.format.C40999x r18, java.lang.CharSequence r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r8 = r20
            int r9 = r19.length()
            java.lang.String r1 = r0.f107355a
            int r10 = r1.length()
            r13 = -1
            if (r10 != 0) goto L_0x0017
            if (r8 != r9) goto L_0x0036
            goto L_0x012f
        L_0x0017:
            if (r8 != r9) goto L_0x001c
            r1 = r8 ^ -1
            return r1
        L_0x001c:
            java.lang.String r4 = r0.f107355a
            r5 = 0
            r1 = r18
            r2 = r19
            r3 = r20
            r6 = r10
            boolean r1 = r1.mo43335s(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x0036
            j$.time.temporal.ChronoField r1 = p3186j$.time.temporal.ChronoField.OFFSET_SECONDS
            int r2 = r8 + r10
            r6 = r2
            r3 = 0
            r2 = r1
            goto L_0x0135
        L_0x0036:
            char r1 = r19.charAt(r20)
            r2 = 43
            r3 = 45
            if (r1 == r2) goto L_0x0042
            if (r1 != r3) goto L_0x012d
        L_0x0042:
            r2 = 1
            if (r1 != r3) goto L_0x0047
            r1 = -1
            goto L_0x0048
        L_0x0047:
            r1 = 1
        L_0x0048:
            r3 = 2
            r4 = 0
            int r5 = r0.f107357c
            if (r5 <= 0) goto L_0x0053
            int r5 = r5 % r3
            if (r5 != 0) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            r6 = 11
            int r14 = r0.f107356b
            if (r14 >= r6) goto L_0x005c
            r15 = 1
            goto L_0x005d
        L_0x005c:
            r15 = 0
        L_0x005d:
            r11 = 4
            int[] r12 = new int[r11]
            int r16 = r8 + 1
            r12[r4] = r16
            boolean r16 = r18.mo43328l()
            if (r16 != 0) goto L_0x00a4
            r13 = 58
            if (r15 == 0) goto L_0x0085
            if (r5 != 0) goto L_0x0080
            if (r14 != 0) goto L_0x007d
            int r6 = r8 + 3
            if (r9 <= r6) goto L_0x007d
            char r6 = r7.charAt(r6)
            if (r6 != r13) goto L_0x007d
            goto L_0x0080
        L_0x007d:
            r14 = 9
            goto L_0x00a4
        L_0x0080:
            r5 = 10
            r14 = 10
            goto L_0x00a3
        L_0x0085:
            if (r5 != 0) goto L_0x009f
            if (r14 != r6) goto L_0x009c
            int r6 = r8 + 3
            if (r9 <= r6) goto L_0x009c
            int r9 = r8 + 2
            char r9 = r7.charAt(r9)
            if (r9 == r13) goto L_0x009f
            char r6 = r7.charAt(r6)
            if (r6 != r13) goto L_0x009c
            goto L_0x009f
        L_0x009c:
            r14 = 20
            goto L_0x00a4
        L_0x009f:
            r5 = 21
            r14 = 21
        L_0x00a3:
            r5 = 1
        L_0x00a4:
            r6 = 3
            r9 = 6
            switch(r14) {
                case 0: goto L_0x00f8;
                case 1: goto L_0x00f1;
                case 2: goto L_0x00f1;
                case 3: goto L_0x00ea;
                case 4: goto L_0x00ea;
                case 5: goto L_0x00df;
                case 6: goto L_0x00df;
                case 7: goto L_0x00cc;
                case 8: goto L_0x00cc;
                case 9: goto L_0x00bf;
                case 10: goto L_0x00bf;
                case 11: goto L_0x00f8;
                case 12: goto L_0x00bb;
                case 13: goto L_0x00f1;
                case 14: goto L_0x00b7;
                case 15: goto L_0x00ea;
                case 16: goto L_0x00b3;
                case 17: goto L_0x00df;
                case 18: goto L_0x00ae;
                case 19: goto L_0x00cc;
                case 20: goto L_0x00aa;
                case 21: goto L_0x00bf;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            goto L_0x00fb
        L_0x00aa:
            m71419g(r7, r2, r9, r12)
            goto L_0x00fb
        L_0x00ae:
            r5 = 5
            m71419g(r7, r5, r9, r12)
            goto L_0x00fb
        L_0x00b3:
            m71419g(r7, r6, r9, r12)
            goto L_0x00fb
        L_0x00b7:
            m71419g(r7, r6, r11, r12)
            goto L_0x00fb
        L_0x00bb:
            m71419g(r7, r2, r11, r12)
            goto L_0x00fb
        L_0x00bf:
            m71417e(r7, r15, r12)
            boolean r9 = m71416c(r7, r5, r3, r12)
            if (r9 == 0) goto L_0x00fb
            m71416c(r7, r5, r6, r12)
            goto L_0x00fb
        L_0x00cc:
            m71417e(r7, r15, r12)
            m71418f(r7, r5, r2, r12)
            boolean r5 = m71416c(r7, r5, r6, r12)
            if (r5 != 0) goto L_0x00fb
            r5 = r12[r4]
            r7 = -1
            r5 = r5 ^ r7
            r12[r4] = r5
            goto L_0x00fb
        L_0x00df:
            m71417e(r7, r15, r12)
            m71418f(r7, r5, r2, r12)
            boolean r5 = m71416c(r7, r5, r6, r12)
            goto L_0x00fb
        L_0x00ea:
            m71417e(r7, r15, r12)
            m71418f(r7, r5, r2, r12)
            goto L_0x00fb
        L_0x00f1:
            m71417e(r7, r15, r12)
            m71418f(r7, r5, r4, r12)
            goto L_0x00fb
        L_0x00f8:
            m71417e(r7, r15, r12)
        L_0x00fb:
            r4 = r12[r4]
            if (r4 <= 0) goto L_0x012d
            r2 = r12[r2]
            r5 = 23
            if (r2 > r5) goto L_0x0125
            r3 = r12[r3]
            r5 = 59
            if (r3 > r5) goto L_0x0125
            r6 = r12[r6]
            if (r6 > r5) goto L_0x0125
            long r9 = (long) r1
            long r1 = (long) r2
            r11 = 3600(0xe10, double:1.7786E-320)
            long r1 = r1 * r11
            long r11 = (long) r3
            r13 = 60
            long r11 = r11 * r13
            long r11 = r11 + r1
            long r1 = (long) r6
            long r11 = r11 + r1
            long r11 = r11 * r9
            j$.time.temporal.ChronoField r1 = p3186j$.time.temporal.ChronoField.OFFSET_SECONDS
            r2 = r1
            r6 = r4
            r3 = r11
            goto L_0x0135
        L_0x0125:
            j$.time.DateTimeException r1 = new j$.time.DateTimeException
            java.lang.String r2 = "Value out of range: Hour[0-23], Minute[0-59], Second[0-59]"
            r1.<init>(r2)
            throw r1
        L_0x012d:
            if (r10 != 0) goto L_0x013e
        L_0x012f:
            j$.time.temporal.ChronoField r1 = p3186j$.time.temporal.ChronoField.OFFSET_SECONDS
            r2 = r1
            r6 = r8
            r3 = 0
        L_0x0135:
            r1 = r18
            r5 = r20
            int r1 = r1.mo43331o(r2, r3, r5, r6)
            return r1
        L_0x013e:
            r1 = -1
            r1 = r1 ^ r8
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p3186j$.time.format.C40988m.mo43295d(j$.time.format.x, java.lang.CharSequence, int):int");
    }

    public final String toString() {
        String replace = this.f107355a.replace("'", "''");
        String str = f107352d[this.f107356b];
        return "Offset(" + str + ",'" + replace + "')";
    }
}
