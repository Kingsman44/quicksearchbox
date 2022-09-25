package org.p5633c.p5634a.p5639e;

import java.util.Locale;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72288l;

/* renamed from: org.c.a.e.n */
/* compiled from: PG */
final class C72257n implements C72265v, C72261r {

    /* renamed from: a */
    private final String f192259a;

    /* renamed from: b */
    private final String f192260b;

    /* renamed from: c */
    private final boolean f192261c;

    /* renamed from: d */
    private final int f192262d;

    /* renamed from: e */
    private final int f192263e;

    public C72257n(String str, String str2, boolean z, int i, int i2) {
        this.f192259a = str;
        this.f192260b = str2;
        this.f192261c = z;
        if (i2 >= i) {
            this.f192262d = i;
            this.f192263e = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: f */
    private static final int m106618f(String str, int i, int i2) {
        int i3 = 0;
        for (int min = Math.min(str.length() - i, i2); min > 0; min--) {
            char charAt = str.charAt(i + i3);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i3++;
        }
        return i3;
    }

    /* renamed from: a */
    public final int mo63604a() {
        return mo63605b();
    }

    /* renamed from: b */
    public final int mo63605b() {
        int i = this.f192262d;
        int i2 = i + 1;
        int i3 = i2 + i2;
        if (this.f192261c) {
            i3 += i - 1;
        }
        String str = this.f192259a;
        return (str == null || str.length() <= i3) ? i3 : str.length();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00cb, code lost:
        if (r5 == false) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00ff, code lost:
        if (r5 == false) goto L_0x0130;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo63606c(org.p5633c.p5634a.p5639e.C72264u r13, java.lang.String r14, int r15) {
        /*
            r12 = this;
            int r0 = r14.length()
            int r0 = r0 - r15
            java.lang.String r4 = r12.f192260b
            r7 = 43
            r8 = 45
            r9 = 0
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            if (r4 == 0) goto L_0x0043
            int r1 = r4.length()
            if (r1 != 0) goto L_0x0029
            if (r0 <= 0) goto L_0x0024
            char r1 = r14.charAt(r15)
            if (r1 == r8) goto L_0x0043
            if (r1 != r7) goto L_0x0024
            goto L_0x0043
        L_0x0024:
            r13.f192285h = r9
            r13.f192280c = r11
            return r15
        L_0x0029:
            r2 = 1
            r5 = 0
            int r6 = r4.length()
            r1 = r14
            r3 = r15
            boolean r1 = r1.regionMatches(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x0043
            r13.f192285h = r9
            r13.f192280c = r11
            java.lang.String r13 = r12.f192260b
            int r13 = r13.length()
            int r15 = r15 + r13
            return r15
        L_0x0043:
            r1 = 1
            if (r0 > r1) goto L_0x0049
            r13 = r15 ^ -1
            return r13
        L_0x0049:
            char r2 = r14.charAt(r15)
            if (r2 != r8) goto L_0x0051
            r2 = 1
            goto L_0x0054
        L_0x0051:
            if (r2 != r7) goto L_0x013c
            r2 = 0
        L_0x0054:
            int r15 = r15 + r1
            r3 = 2
            int r4 = m106618f(r14, r15, r3)
            if (r4 >= r3) goto L_0x005f
            r13 = r15 ^ -1
            return r13
        L_0x005f:
            int r4 = org.p5633c.p5634a.p5639e.C72266w.m106674b(r14, r15)
            r5 = 23
            if (r4 <= r5) goto L_0x006a
            r13 = r15 ^ -1
            return r13
        L_0x006a:
            r5 = 3600000(0x36ee80, float:5.044674E-39)
            int r4 = r4 * r5
            int r0 = r0 + -3
            int r15 = r15 + r3
            if (r0 > 0) goto L_0x0076
            goto L_0x0130
        L_0x0076:
            char r5 = r14.charAt(r15)
            r6 = 58
            if (r5 != r6) goto L_0x0084
            int r0 = r0 + -1
            int r15 = r15 + 1
            r5 = 1
            goto L_0x008d
        L_0x0084:
            r7 = 48
            if (r5 < r7) goto L_0x0130
            r7 = 57
            if (r5 > r7) goto L_0x0130
            r5 = 0
        L_0x008d:
            int r7 = m106618f(r14, r15, r3)
            if (r7 != 0) goto L_0x0099
            if (r5 != 0) goto L_0x0097
            goto L_0x0130
        L_0x0097:
            r5 = 1
            r7 = 0
        L_0x0099:
            if (r7 >= r3) goto L_0x009e
            r13 = r15 ^ -1
            return r13
        L_0x009e:
            int r7 = org.p5633c.p5634a.p5639e.C72266w.m106674b(r14, r15)
            r8 = 59
            if (r7 <= r8) goto L_0x00a9
            r13 = r15 ^ -1
            return r13
        L_0x00a9:
            r11 = 60000(0xea60, float:8.4078E-41)
            int r7 = r7 * r11
            int r4 = r4 + r7
            int r0 = r0 + -2
            int r15 = r15 + 2
            if (r0 > 0) goto L_0x00b7
            goto L_0x0130
        L_0x00b7:
            if (r5 == 0) goto L_0x00c5
            char r7 = r14.charAt(r15)
            if (r7 == r6) goto L_0x00c1
            goto L_0x0130
        L_0x00c1:
            int r0 = r0 + -1
            int r15 = r15 + 1
        L_0x00c5:
            int r6 = m106618f(r14, r15, r3)
            if (r6 != 0) goto L_0x00ce
            if (r5 != 0) goto L_0x012d
            goto L_0x0130
        L_0x00ce:
            if (r6 < r3) goto L_0x012d
            int r6 = org.p5633c.p5634a.p5639e.C72266w.m106674b(r14, r15)
            if (r6 <= r8) goto L_0x00d9
            r13 = r15 ^ -1
            return r13
        L_0x00d9:
            int r6 = r6 * 1000
            int r4 = r4 + r6
            int r15 = r15 + 2
            int r0 = r0 + -2
            if (r0 > 0) goto L_0x00e3
            goto L_0x0130
        L_0x00e3:
            if (r5 == 0) goto L_0x00f8
            char r0 = r14.charAt(r15)
            r6 = 46
            if (r0 == r6) goto L_0x00f6
            char r0 = r14.charAt(r15)
            r6 = 44
            if (r0 == r6) goto L_0x00f6
            goto L_0x0130
        L_0x00f6:
            int r15 = r15 + 1
        L_0x00f8:
            r0 = 3
            int r0 = m106618f(r14, r15, r0)
            if (r0 != 0) goto L_0x0102
            if (r5 != 0) goto L_0x0103
            goto L_0x0130
        L_0x0102:
            r10 = r0
        L_0x0103:
            if (r10 > 0) goto L_0x0108
            r13 = r15 ^ -1
            return r13
        L_0x0108:
            int r0 = r15 + 1
            char r15 = r14.charAt(r15)
            int r15 = r15 + -48
            int r15 = r15 * 100
            int r4 = r4 + r15
            if (r10 <= r1) goto L_0x012b
            int r15 = r0 + 1
            char r0 = r14.charAt(r0)
            int r0 = r0 + -48
            int r0 = r0 * 10
            int r4 = r4 + r0
            if (r10 <= r3) goto L_0x0130
            int r0 = r15 + 1
            char r14 = r14.charAt(r15)
            int r14 = r14 + -48
            int r4 = r4 + r14
        L_0x012b:
            r15 = r0
            goto L_0x0130
        L_0x012d:
            r13 = r15 ^ -1
            return r13
        L_0x0130:
            if (r2 == 0) goto L_0x0133
            int r4 = -r4
        L_0x0133:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            r13.f192285h = r9
            r13.f192280c = r14
            return r15
        L_0x013c:
            r13 = r15 ^ -1
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5633c.p5634a.p5639e.C72257n.mo63606c(org.c.a.e.u, java.lang.String, int):int");
    }

    /* renamed from: d */
    public final void mo63607d(StringBuffer stringBuffer, C72151ai aiVar, Locale locale) {
    }

    /* renamed from: e */
    public final void mo63608e(StringBuffer stringBuffer, long j, C72132a aVar, int i, C72288l lVar, Locale locale) {
        int i2;
        int i3;
        if (lVar != null) {
            int i4 = 0;
            if (i == 0) {
                String str = this.f192259a;
                if (str == null) {
                    i = 0;
                } else {
                    stringBuffer.append(str);
                    return;
                }
            }
            if (i >= 0) {
                stringBuffer.append('+');
            } else {
                stringBuffer.append('-');
                i = -i;
            }
            int i5 = i / 3600000;
            C72266w.m106676d(stringBuffer, i5, 2);
            if (this.f192263e != 1) {
                int i6 = i - (i5 * 3600000);
                if (i6 != 0) {
                    i4 = i6;
                } else if (this.f192262d <= 1) {
                    return;
                }
                int i7 = i4 / 60000;
                if (this.f192261c) {
                    stringBuffer.append(':');
                }
                C72266w.m106676d(stringBuffer, i7, 2);
                if (this.f192263e != 2 && (i2 = i4 - (i7 * 60000)) != 0) {
                    int i8 = i2 / 1000;
                    if (this.f192261c) {
                        stringBuffer.append(':');
                    }
                    C72266w.m106676d(stringBuffer, i8, 2);
                    if (this.f192263e != 3 && (i3 = i2 - (i8 * 1000)) != 0) {
                        if (this.f192261c) {
                            stringBuffer.append('.');
                        }
                        C72266w.m106676d(stringBuffer, i3, 3);
                    }
                }
            }
        }
    }
}
