package com.google.common.p4543n.p4550f;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4535g.C59203do;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.common.n.f.m */
/* compiled from: PG */
public final class C59440m {

    /* renamed from: a */
    private static final Pattern f157689a = Pattern.compile("([-+]?[0-9]*)\\.0+([eE][-+]?[0-9]+)?");

    /* renamed from: b */
    private static final Pattern f157690b = Pattern.compile("([-+]?[0-9]*\\.[0-9]*[1-9])0+([eE][-+]?[0-9]+)?");

    /* renamed from: c */
    private final double[] f157691c = {C59203do.f157270a, 50.0d, 100.0d};

    /* renamed from: d */
    private final String f157692d = BuildConfig.FLAVOR;

    /* renamed from: e */
    private final String f157693e = "\n";

    /* renamed from: b */
    private static String m92351b(String str, double d) {
        if (Double.isNaN(d)) {
            return "nan";
        }
        if (Double.isInfinite(d)) {
            return d < C59203do.f157270a ? "-inf" : "inf";
        }
        return String.format(str, new Object[]{Double.valueOf(d)});
    }

    /* renamed from: c */
    private static String m92352c(String str, double d) {
        String b = m92351b(str, d);
        Matcher matcher = f157689a.matcher(b);
        if (matcher.matches()) {
            return matcher.replaceFirst("$1$2");
        }
        Matcher matcher2 = f157690b.matcher(b);
        return matcher2.matches() ? matcher2.replaceFirst("$1$2") : b;
    }

    /* renamed from: d */
    private static String m92353d(String str, double d) {
        String c = m92352c("%g", d);
        return str + ": " + c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0071, code lost:
        if (r17 < (r11 * com.google.common.p4543n.p4550f.C59429b.f157651a)) goto L_0x0058;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo56957a(com.google.common.p4543n.p4550f.C59429b r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.f157692d
            r2.append(r3)
            double r3 = r1.f157657g
            java.lang.String r5 = "%.12g"
            java.lang.String r3 = m92352c(r5, r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Count: "
            java.lang.String r3 = r4.concat(r3)
            r2.append(r3)
            boolean r3 = r24.mo56932b()
            java.lang.String r4 = "%"
            r9 = 0
            if (r3 == 0) goto L_0x0034
            java.lang.String r3 = r0.f157693e
            r2.append(r3)
            goto L_0x00e8
        L_0x0034:
            java.lang.String r3 = "  "
            r2.append(r3)
            boolean r11 = r24.mo56932b()
            if (r11 == 0) goto L_0x0041
            r11 = r9
            goto L_0x0046
        L_0x0041:
            double r11 = r1.f157658h
            double r13 = r1.f157657g
            double r11 = r11 / r13
        L_0x0046:
            java.lang.String r13 = "Average"
            java.lang.String r11 = m92353d(r13, r11)
            r2.append(r11)
            r2.append(r3)
            boolean r11 = r24.mo56932b()
            if (r11 == 0) goto L_0x005b
        L_0x0058:
            r17 = r9
            goto L_0x0074
        L_0x005b:
            double r11 = r1.f157659i
            double r13 = r1.f157657g
            double r6 = r1.f157658h
            double r17 = r11 * r13
            double r6 = r6 * r6
            double r17 = r17 - r6
            double r13 = r13 * r13
            double r17 = r17 / r13
            double r6 = com.google.common.p4543n.p4550f.C59429b.f157651a
            double r11 = r11 * r6
            int r6 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r6 >= 0) goto L_0x0074
            goto L_0x0058
        L_0x0074:
            java.lang.String r6 = "StdDev"
            double r11 = java.lang.Math.sqrt(r17)
            java.lang.String r6 = m92353d(r6, r11)
            r2.append(r6)
            java.lang.String r6 = r0.f157693e
            r2.append(r6)
            r6 = 0
        L_0x0087:
            r7 = 3
            if (r6 >= r7) goto L_0x00e3
            if (r6 != 0) goto L_0x0093
            java.lang.String r6 = r0.f157692d
            r2.append(r6)
            r6 = 0
            goto L_0x0096
        L_0x0093:
            r2.append(r3)
        L_0x0096:
            double[] r7 = r0.f157691c
            r11 = r7[r6]
            double r13 = r1.mo56931a(r11)
            java.lang.String r7 = "%g"
            int r17 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r17 != 0) goto L_0x00a7
            java.lang.String r11 = "Min"
            goto L_0x00c5
        L_0x00a7:
            r15 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r17 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r17 != 0) goto L_0x00b0
            java.lang.String r11 = "Max"
            goto L_0x00c5
        L_0x00b0:
            r17 = 4632233691727265792(0x4049000000000000, double:50.0)
            int r19 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r19 != 0) goto L_0x00b9
            java.lang.String r11 = "Median"
            goto L_0x00c5
        L_0x00b9:
            java.lang.String r11 = m92352c(r7, r11)
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r11 = r11.concat(r4)
        L_0x00c5:
            java.lang.String r7 = m92352c(r7, r13)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = ": "
            r12.append(r11)
            r12.append(r7)
            java.lang.String r7 = r12.toString()
            r2.append(r7)
            int r6 = r6 + 1
            goto L_0x0087
        L_0x00e3:
            java.lang.String r3 = r0.f157693e
            r2.append(r3)
        L_0x00e8:
            boolean r3 = r24.mo56932b()
            if (r3 == 0) goto L_0x00f0
            goto L_0x032f
        L_0x00f0:
            boolean r3 = r24.mo56932b()
            if (r3 == 0) goto L_0x00f8
            r6 = r9
            goto L_0x00fe
        L_0x00f8:
            double r6 = r1.f157657g
            r11 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r6 = r11 / r6
        L_0x00fe:
            double r11 = r1.f157655e
            com.google.common.n.f.i r3 = r1.f157653c
            com.google.common.n.f.g r3 = r3.f157680a
            int r3 = r3.mo56945a(r11)
            double r11 = r1.f157656f
            com.google.common.n.f.i r13 = r1.f157653c
            com.google.common.n.f.g r13 = r13.f157680a
            int r11 = r13.mo56945a(r11)
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = r11 - r3
            r14 = 1
            int r13 = r13 + r14
            r12.<init>(r13)
        L_0x011b:
            if (r3 > r11) goto L_0x017a
            com.google.common.n.f.j r13 = new com.google.common.n.f.j
            r13.<init>()
            if (r3 < 0) goto L_0x0156
            com.google.common.n.f.i r15 = r1.f157653c
            com.google.common.n.f.g r15 = r15.f157680a
            int r15 = r15.mo56946b()
            if (r3 >= r15) goto L_0x0156
            double[] r15 = r1.f157654d
            int r8 = r15.length
            if (r3 >= r8) goto L_0x0138
            r17 = r15[r3]
            r14 = r17
            goto L_0x0139
        L_0x0138:
            r14 = r9
        L_0x0139:
            r13.f157684c = r14
            int r17 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r17 == 0) goto L_0x0152
            com.google.common.n.f.i r14 = r1.f157653c
            double r14 = r14.mo56953b(r3)
            r13.f157682a = r14
            com.google.common.n.f.i r14 = r1.f157653c
            double r14 = r14.mo56952a(r3)
            r13.f157683b = r14
            r12.add(r13)
        L_0x0152:
            int r3 = r3 + 1
            r14 = 1
            goto L_0x011b
        L_0x0156:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            com.google.common.n.f.i r1 = r1.f157653c
            com.google.common.n.f.g r1 = r1.f157680a
            int r1 = r1.mo56946b()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Bucket index "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = "out of range, number of buckets: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.<init>(r1)
            throw r2
        L_0x017a:
            java.util.Iterator r1 = r12.iterator()
            r13 = r9
        L_0x017f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x019b
            java.lang.Object r3 = r1.next()
            com.google.common.n.f.j r3 = (com.google.common.p4543n.p4550f.C59437j) r3
            double r8 = r3.f157684c
            int r3 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r3 <= 0) goto L_0x0198
            r19 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            int r3 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x0198
            r13 = r8
        L_0x0198:
            r9 = 0
            goto L_0x017f
        L_0x019b:
            r8 = 4622945017495814144(0x4028000000000000, double:12.0)
            r17 = 0
            int r1 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r1 != 0) goto L_0x01a6
            r13 = 0
            goto L_0x01a8
        L_0x01a6:
            double r13 = r8 / r13
        L_0x01a8:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r11 = ""
            r10 = 1
            com.google.common.p4543n.p4550f.C59439l.m92350b(r11, r10, r11, r1)
            java.lang.String r15 = "[ "
            java.lang.String r8 = ","
            r9 = 2
            com.google.common.p4543n.p4550f.C59439l.m92350b(r15, r9, r8, r1)
            java.lang.String r8 = ")"
            java.lang.String r15 = " "
            com.google.common.p4543n.p4550f.C59439l.m92350b(r15, r9, r8, r1)
            com.google.common.p4543n.p4550f.C59439l.m92350b(r15, r9, r11, r1)
            com.google.common.p4543n.p4550f.C59439l.m92350b(r15, r9, r4, r1)
            com.google.common.p4543n.p4550f.C59439l.m92350b(r15, r9, r4, r1)
            com.google.common.p4543n.p4550f.C59439l.m92350b(r11, r10, r11, r1)
            r8 = 4622945017495814144(0x4028000000000000, double:12.0)
            java.util.Iterator r10 = r12.iterator()
            r19 = 0
        L_0x01db:
            boolean r12 = r10.hasNext()
            r15 = 32
            if (r12 == 0) goto L_0x0274
            java.lang.Object r12 = r10.next()
            com.google.common.n.f.j r12 = (com.google.common.p4543n.p4550f.C59437j) r12
            double r8 = r12.f157684c
            double r19 = r19 + r8
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r3.add(r8)
            java.lang.String r8 = r0.f157692d
            com.google.common.p4543n.p4550f.C59439l.m92349a(r8, r1, r3)
            double r8 = r12.f157682a
            java.lang.String r8 = m92352c(r5, r8)
            com.google.common.p4543n.p4550f.C59439l.m92349a(r8, r1, r3)
            double r8 = r12.f157683b
            java.lang.String r8 = m92352c(r5, r8)
            com.google.common.p4543n.p4550f.C59439l.m92349a(r8, r1, r3)
            double r8 = r12.f157684c
            java.lang.String r8 = m92352c(r5, r8)
            com.google.common.p4543n.p4550f.C59439l.m92349a(r8, r1, r3)
            double r8 = r12.f157684c
            double r8 = r8 * r6
            java.lang.String r4 = "%.3f"
            java.lang.String r8 = m92351b(r4, r8)
            com.google.common.p4543n.p4550f.C59439l.m92349a(r8, r1, r3)
            double r8 = r19 * r6
            java.lang.String r4 = m92351b(r4, r8)
            com.google.common.p4543n.p4550f.C59439l.m92349a(r4, r1, r3)
            double r8 = r12.f157684c
            double r8 = r8 * r13
            r21 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r8 = r8 + r21
            double r8 = java.lang.Math.floor(r8)
            boolean r4 = java.lang.Double.isNaN(r8)
            if (r4 == 0) goto L_0x0243
            r12 = r5
            r4 = 4622945017495814144(0x4028000000000000, double:12.0)
            r8 = 0
            goto L_0x0250
        L_0x0243:
            r12 = r5
            r4 = 0
            double r8 = java.lang.Math.max(r8, r4)
            r4 = 4622945017495814144(0x4028000000000000, double:12.0)
            double r8 = java.lang.Math.min(r8, r4)
        L_0x0250:
            int r8 = (int) r8
            if (r8 == 0) goto L_0x026f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r4 = r8 + 1
            r9.<init>(r4)
            r9.append(r15)
            r4 = 0
        L_0x025e:
            if (r4 >= r8) goto L_0x0268
            r5 = 35
            r9.append(r5)
            int r4 = r4 + 1
            goto L_0x025e
        L_0x0268:
            java.lang.String r4 = r9.toString()
            com.google.common.p4543n.p4550f.C59439l.m92349a(r4, r1, r3)
        L_0x026f:
            r5 = r12
            r8 = 4622945017495814144(0x4028000000000000, double:12.0)
            goto L_0x01db
        L_0x0274:
            java.lang.String r4 = r0.f157692d
            r2.append(r4)
            java.util.Iterator r4 = r1.iterator()
            r5 = 0
        L_0x027e:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x029c
            java.lang.Object r6 = r4.next()
            com.google.common.n.f.k r6 = (com.google.common.p4543n.p4550f.C59438k) r6
            java.lang.String r7 = r6.f157685a
            int r7 = r7.length()
            int r8 = r6.f157687c
            int r7 = r7 + r8
            java.lang.String r6 = r6.f157686b
            int r6 = r6.length()
            int r7 = r7 + r6
            int r5 = r5 + r7
            goto L_0x027e
        L_0x029c:
            java.lang.String r4 = r0.f157692d
            int r4 = r4.length()
        L_0x02a2:
            if (r4 >= r5) goto L_0x02ac
            r6 = 45
            r2.append(r6)
            int r4 = r4 + 1
            goto L_0x02a2
        L_0x02ac:
            java.lang.String r4 = r0.f157693e
            r2.append(r4)
            java.util.Iterator r3 = r3.iterator()
        L_0x02b5:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x032f
            java.lang.Object r4 = r3.next()
            java.util.List r4 = (java.util.List) r4
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L_0x0327
            r5 = 0
        L_0x02c8:
            int r6 = r1.size()
            if (r5 >= r6) goto L_0x0327
            java.lang.Object r6 = r1.get(r5)
            com.google.common.n.f.k r6 = (com.google.common.p4543n.p4550f.C59438k) r6
            int r7 = r6.f157687c
            int r8 = r4.size()
            if (r5 >= r8) goto L_0x02e3
            java.lang.Object r8 = r4.get(r5)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x02e4
        L_0x02e3:
            r8 = r11
        L_0x02e4:
            java.lang.String r9 = r6.f157685a
            r2.append(r9)
            int r9 = r6.f157688d
            r10 = 2
            if (r9 != r10) goto L_0x02fa
            int r9 = r8.length()
        L_0x02f2:
            if (r9 >= r7) goto L_0x02fa
            r2.append(r15)
            int r9 = r9 + 1
            goto L_0x02f2
        L_0x02fa:
            r2.append(r8)
            int r9 = r1.size()
            int r9 = r9 + -1
            if (r5 != r9) goto L_0x030e
            java.lang.String r9 = r6.f157686b
            int r9 = r9.length()
            if (r9 != 0) goto L_0x030e
            goto L_0x0328
        L_0x030e:
            int r9 = r6.f157688d
            r12 = 1
            if (r9 != r12) goto L_0x031f
            int r8 = r8.length()
        L_0x0317:
            if (r8 >= r7) goto L_0x031f
            r2.append(r15)
            int r8 = r8 + 1
            goto L_0x0317
        L_0x031f:
            java.lang.String r6 = r6.f157686b
            r2.append(r6)
            int r5 = r5 + 1
            goto L_0x02c8
        L_0x0327:
            r10 = 2
        L_0x0328:
            r12 = 1
            java.lang.String r4 = "\n"
            r2.append(r4)
            goto L_0x02b5
        L_0x032f:
            java.lang.String r1 = r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4543n.p4550f.C59440m.mo56957a(com.google.common.n.f.b):java.lang.String");
    }
}
