package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.p10848a.C145161j;
import com.google.common.p4535g.C59203do;
import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: com.google.android.gms.measurement.internal.u */
/* compiled from: PG */
abstract class C145505u {

    /* renamed from: b */
    final String f393417b;

    /* renamed from: c */
    final int f393418c;

    /* renamed from: d */
    Boolean f393419d;

    /* renamed from: e */
    Boolean f393420e;

    /* renamed from: f */
    Long f393421f;

    /* renamed from: g */
    Long f393422g;

    public C145505u(String str, int i) {
        this.f393417b = str;
        this.f393418c = i;
    }

    /* renamed from: d */
    private static Boolean m236553d(String str, int i, boolean z, String str2, List list, String str3, C145325dx dxVar) {
        if (i == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && i != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (dxVar != null) {
                        dxVar.f392798f.mo120895b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if ((r0 & 4) != 0) goto L_0x002e;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Boolean m236554e(java.math.BigDecimal r9, com.google.android.gms.measurement.p10848a.C145161j r10, double r11) {
        /*
            com.google.android.gms.common.internal.C143919bh.m233958a(r10)
            int r0 = r10.f392353a
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x010d
            int r1 = r10.f392354b
            int r3 = com.google.android.gms.measurement.p10848a.C145160i.m235831a(r1)
            if (r3 != 0) goto L_0x0014
            goto L_0x010d
        L_0x0014:
            r4 = 1
            if (r3 == r4) goto L_0x010d
            int r3 = com.google.android.gms.measurement.p10848a.C145160i.m235831a(r1)
            r5 = 4
            r6 = 5
            if (r3 != 0) goto L_0x0020
            goto L_0x002b
        L_0x0020:
            if (r3 != r6) goto L_0x002b
            r3 = r0 & 8
            if (r3 == 0) goto L_0x002a
            r0 = r0 & 16
            if (r0 != 0) goto L_0x002e
        L_0x002a:
            return r2
        L_0x002b:
            r0 = r0 & r5
            if (r0 == 0) goto L_0x010d
        L_0x002e:
            int r0 = com.google.android.gms.measurement.p10848a.C145160i.m235831a(r1)
            if (r0 != 0) goto L_0x0035
            r0 = 1
        L_0x0035:
            int r1 = com.google.android.gms.measurement.p10848a.C145160i.m235831a(r1)
            if (r1 != 0) goto L_0x003c
            goto L_0x0061
        L_0x003c:
            if (r1 != r6) goto L_0x0061
            java.lang.String r1 = r10.f392357e
            boolean r1 = com.google.android.gms.measurement.internal.C145491ka.m236461v(r1)
            if (r1 == 0) goto L_0x0060
            java.lang.String r1 = r10.f392358f
            boolean r1 = com.google.android.gms.measurement.internal.C145491ka.m236461v(r1)
            if (r1 != 0) goto L_0x004f
            goto L_0x0060
        L_0x004f:
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0060 }
            java.lang.String r3 = r10.f392357e     // Catch:{ NumberFormatException -> 0x0060 }
            r1.<init>(r3)     // Catch:{ NumberFormatException -> 0x0060 }
            java.math.BigDecimal r3 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0060 }
            java.lang.String r10 = r10.f392358f     // Catch:{ NumberFormatException -> 0x0060 }
            r3.<init>(r10)     // Catch:{ NumberFormatException -> 0x0060 }
            r10 = r1
            r1 = r2
            goto L_0x0073
        L_0x0060:
            return r2
        L_0x0061:
            java.lang.String r1 = r10.f392356d
            boolean r1 = com.google.android.gms.measurement.internal.C145491ka.m236461v(r1)
            if (r1 != 0) goto L_0x006a
            return r2
        L_0x006a:
            java.math.BigDecimal r1 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x010d }
            java.lang.String r10 = r10.f392356d     // Catch:{ NumberFormatException -> 0x010d }
            r1.<init>(r10)     // Catch:{ NumberFormatException -> 0x010d }
            r10 = r2
            r3 = r10
        L_0x0073:
            if (r0 != r6) goto L_0x0078
            if (r10 == 0) goto L_0x00ff
            goto L_0x007c
        L_0x0078:
            if (r1 != 0) goto L_0x007c
            goto L_0x00ff
        L_0x007c:
            int r0 = r0 + -1
            r6 = 0
            if (r0 == r4) goto L_0x00fd
            r7 = 2
            if (r0 == r7) goto L_0x00ed
            r8 = 3
            if (r0 == r8) goto L_0x00a0
            if (r0 == r5) goto L_0x008b
            goto L_0x00ff
        L_0x008b:
            if (r10 == 0) goto L_0x00ff
            int r10 = r9.compareTo(r10)
            if (r10 < 0) goto L_0x009a
            int r9 = r9.compareTo(r3)
            if (r9 > 0) goto L_0x009a
            goto L_0x009b
        L_0x009a:
            r4 = 0
        L_0x009b:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            goto L_0x00ff
        L_0x00a0:
            if (r1 != 0) goto L_0x00a3
            goto L_0x00ff
        L_0x00a3:
            r2 = 0
            int r10 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r10 == 0) goto L_0x00e0
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r0)
            java.math.BigDecimal r10 = r1.subtract(r10)
            int r10 = r9.compareTo(r10)
            if (r10 <= 0) goto L_0x00da
            java.math.BigDecimal r10 = new java.math.BigDecimal
            r10.<init>(r11)
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r7)
            java.math.BigDecimal r10 = r10.multiply(r11)
            java.math.BigDecimal r10 = r1.add(r10)
            int r9 = r9.compareTo(r10)
            if (r9 >= 0) goto L_0x00da
            goto L_0x00db
        L_0x00da:
            r4 = 0
        L_0x00db:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            goto L_0x00ff
        L_0x00e0:
            int r9 = r9.compareTo(r1)
            if (r9 != 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r4 = 0
        L_0x00e8:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            goto L_0x00ff
        L_0x00ed:
            if (r1 != 0) goto L_0x00f0
            goto L_0x00ff
        L_0x00f0:
            int r9 = r9.compareTo(r1)
            if (r9 <= 0) goto L_0x00f7
            goto L_0x00f8
        L_0x00f7:
            r4 = 0
        L_0x00f8:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)
            return r9
        L_0x00fd:
            if (r1 != 0) goto L_0x0100
        L_0x00ff:
            return r2
        L_0x0100:
            int r9 = r9.compareTo(r1)
            if (r9 >= 0) goto L_0x0107
            goto L_0x0108
        L_0x0107:
            r4 = 0
        L_0x0108:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)
            return r9
        L_0x010d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145505u.m236554e(java.math.BigDecimal, com.google.android.gms.measurement.a.j, double):java.lang.Boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if ((r1 & 2) != 0) goto L_0x0031;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Boolean m236555f(java.lang.String r13, com.google.android.gms.measurement.p10848a.C145167p r14, com.google.android.gms.measurement.internal.C145325dx r15) {
        /*
            com.google.android.gms.common.internal.C143919bh.m233958a(r14)
            r0 = 0
            if (r13 != 0) goto L_0x0007
            return r0
        L_0x0007:
            int r1 = r14.f392371a
            r2 = r1 & 1
            if (r2 == 0) goto L_0x0093
            int r2 = r14.f392372b
            int r3 = com.google.android.gms.measurement.p10848a.C145166o.m235832a(r2)
            if (r3 != 0) goto L_0x0017
            goto L_0x0093
        L_0x0017:
            r4 = 1
            if (r3 == r4) goto L_0x0093
            int r2 = com.google.android.gms.measurement.p10848a.C145166o.m235832a(r2)
            r3 = 7
            r5 = 2
            if (r2 != 0) goto L_0x0023
            goto L_0x002e
        L_0x0023:
            if (r2 != r3) goto L_0x002e
            com.google.protobuf.cq r1 = r14.f392375e
            int r1 = r1.size()
            if (r1 != 0) goto L_0x0031
            return r0
        L_0x002e:
            r1 = r1 & r5
            if (r1 == 0) goto L_0x0093
        L_0x0031:
            int r1 = r14.f392372b
            int r1 = com.google.android.gms.measurement.p10848a.C145166o.m235832a(r1)
            if (r1 != 0) goto L_0x003b
            r7 = 1
            goto L_0x003c
        L_0x003b:
            r7 = r1
        L_0x003c:
            boolean r8 = r14.f392374d
            if (r8 != 0) goto L_0x004e
            if (r7 == r5) goto L_0x004e
            if (r7 != r3) goto L_0x0045
            goto L_0x004e
        L_0x0045:
            java.lang.String r1 = r14.f392373c
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r1 = r1.toUpperCase(r2)
            goto L_0x0050
        L_0x004e:
            java.lang.String r1 = r14.f392373c
        L_0x0050:
            r9 = r1
            com.google.protobuf.cq r1 = r14.f392375e
            int r1 = r1.size()
            if (r1 != 0) goto L_0x005b
            r10 = r0
            goto L_0x0087
        L_0x005b:
            com.google.protobuf.cq r14 = r14.f392375e
            if (r8 != 0) goto L_0x0086
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r14.size()
            r1.<init>(r2)
            java.util.Iterator r14 = r14.iterator()
        L_0x006c:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L_0x0082
            java.lang.Object r2 = r14.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Locale r3 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toUpperCase(r3)
            r1.add(r2)
            goto L_0x006c
        L_0x0082:
            java.util.List r14 = java.util.Collections.unmodifiableList(r1)
        L_0x0086:
            r10 = r14
        L_0x0087:
            if (r7 != r5) goto L_0x008b
            r11 = r9
            goto L_0x008c
        L_0x008b:
            r11 = r0
        L_0x008c:
            r6 = r13
            r12 = r15
            java.lang.Boolean r13 = m236553d(r6, r7, r8, r9, r10, r11, r12)
            return r13
        L_0x0093:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145505u.m236555f(java.lang.String, com.google.android.gms.measurement.a.p, com.google.android.gms.measurement.internal.dx):java.lang.Boolean");
    }

    /* renamed from: g */
    static Boolean m236556g(double d, C145161j jVar) {
        try {
            return m236554e(new BigDecimal(d), jVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: h */
    static Boolean m236557h(long j, C145161j jVar) {
        try {
            return m236554e(new BigDecimal(j), jVar, C59203do.f157270a);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: i */
    static Boolean m236558i(String str, C145161j jVar) {
        if (!C145491ka.m236461v(str)) {
            return null;
        }
        try {
            return m236554e(new BigDecimal(str), jVar, C59203do.f157270a);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: j */
    static Boolean m236559j(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* renamed from: a */
    public abstract int mo121304a();

    /* renamed from: b */
    public abstract boolean mo121305b();

    /* renamed from: c */
    public abstract boolean mo121306c();
}
