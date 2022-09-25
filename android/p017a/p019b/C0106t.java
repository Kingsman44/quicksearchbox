package android.p017a.p019b;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: android.a.b.t */
/* compiled from: PG */
public final class C0106t implements Serializable {

    /* renamed from: a */
    public static final C0106t f293a;

    /* renamed from: b */
    static final Pattern f294b = Pattern.compile("\\s*\\Q\\E@\\s*");

    /* renamed from: c */
    static final Pattern f295c = Pattern.compile("\\s*or\\s*");

    /* renamed from: d */
    static final Pattern f296d = Pattern.compile("\\s*and\\s*");

    /* renamed from: e */
    static final Pattern f297e = Pattern.compile("\\s*,\\s*");

    /* renamed from: f */
    static final Pattern f298f = Pattern.compile("\\s*~\\s*");

    /* renamed from: g */
    static final Pattern f299g = Pattern.compile("\\s*;\\s*");

    /* renamed from: i */
    private static final C0097k f300i;

    /* renamed from: j */
    private static final C0104r f301j;
    private static final long serialVersionUID = 1;

    /* renamed from: h */
    public final C0105s f302h;

    static {
        C0094h hVar = new C0094h();
        f300i = hVar;
        C0104r rVar = new C0104r("other", hVar, (C0101o) null, (C0101o) null);
        f301j = rVar;
        C0105s sVar = new C0105s();
        sVar.mo63a(rVar);
        f293a = new C0106t(sVar);
        Pattern.compile("\\s*\\Q..\\E\\s*");
    }

    private C0106t(C0105s sVar) {
        this.f302h = sVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C0104r rVar : sVar.f292b) {
            linkedHashSet.add(rVar.f287a);
        }
        Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x01de A[SYNTHETIC, Splitter:B:124:0x01de] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0444  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.p017a.p019b.C0104r m60a(java.lang.String r40) {
        /*
            int r0 = r40.length()
            if (r0 != 0) goto L_0x0009
            android.a.b.r r0 = f301j
            return r0
        L_0x0009:
            java.util.Locale r0 = java.util.Locale.ENGLISH
            r1 = r40
            java.lang.String r0 = r1.toLowerCase(r0)
            r1 = 58
            int r1 = r0.indexOf(r1)
            r2 = -1
            r3 = 0
            if (r1 == r2) goto L_0x04b2
            java.lang.String r4 = r0.substring(r3, r1)
            java.lang.String r4 = r4.trim()
            r5 = 0
        L_0x0024:
            int r6 = r4.length()
            if (r5 >= r6) goto L_0x0052
            char r6 = r4.charAt(r5)
            r7 = 97
            if (r6 < r7) goto L_0x0039
            r7 = 122(0x7a, float:1.71E-43)
            if (r6 > r7) goto L_0x0039
            int r5 = r5 + 1
            goto L_0x0024
        L_0x0039:
            java.text.ParseException r0 = new java.text.ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "keyword '"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = " is not valid"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r3)
            throw r0
        L_0x0052:
            r5 = 1
            int r1 = r1 + r5
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r0 = r0.trim()
            java.util.regex.Pattern r1 = f294b
            java.lang.String[] r1 = r1.split(r0)
            int r6 = r1.length
            r7 = 3
            r9 = 2
            if (r6 == r5) goto L_0x00ad
            if (r6 == r9) goto L_0x00a0
            if (r6 != r7) goto L_0x0090
            r6 = r1[r5]
            android.a.b.o r6 = android.p017a.p019b.C0101o.m55a(r6)
            r10 = r1[r9]
            android.a.b.o r10 = android.p017a.p019b.C0101o.m55a(r10)
            int r11 = r6.f279c
            if (r11 != r5) goto L_0x0080
            int r11 = r10.f279c
            if (r11 != r9) goto L_0x0080
            goto L_0x00af
        L_0x0080:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Must have @integer then @decimal in "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L_0x0090:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Too many samples in "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L_0x00a0:
            r0 = r1[r5]
            android.a.b.o r6 = android.p017a.p019b.C0101o.m55a(r0)
            int r0 = r6.f279c
            if (r0 != r9) goto L_0x00ae
            r10 = r6
            r6 = 0
            goto L_0x00af
        L_0x00ad:
            r6 = 0
        L_0x00ae:
            r10 = 0
        L_0x00af:
            java.lang.String r0 = "other"
            boolean r0 = r4.equals(r0)
            r11 = r1[r3]
            int r11 = r11.length()
            if (r11 == 0) goto L_0x00bf
            r11 = 0
            goto L_0x00c0
        L_0x00bf:
            r11 = 1
        L_0x00c0:
            if (r0 != r11) goto L_0x04aa
            if (r0 == 0) goto L_0x00ce
            android.a.b.k r0 = f300i
            r30 = r4
            r34 = r6
            r33 = r10
            goto L_0x049e
        L_0x00ce:
            r0 = r1[r3]
            java.util.regex.Pattern r1 = f295c
            java.lang.String[] r0 = r1.split(r0)
            r1 = 0
            r11 = 0
        L_0x00d8:
            int r12 = r0.length
            if (r11 >= r12) goto L_0x0497
            java.util.regex.Pattern r12 = f296d
            r13 = r0[r11]
            java.lang.String[] r12 = r12.split(r13)
            r13 = 0
            r14 = 0
        L_0x00e5:
            int r15 = r12.length
            if (r13 >= r15) goto L_0x046c
            android.a.b.k r15 = f300i
            r16 = r12[r13]
            java.lang.String r2 = r16.trim()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r7 = 0
            r9 = -1
        L_0x00f7:
            int r5 = r2.length()
            if (r7 >= r5) goto L_0x0156
            char r5 = r2.charAt(r7)
            r3 = 32
            if (r5 > r3) goto L_0x0122
            if (r5 == r3) goto L_0x0117
            r3 = 9
            if (r5 == r3) goto L_0x0117
            r3 = 10
            if (r5 == r3) goto L_0x0117
            r3 = 12
            if (r5 == r3) goto L_0x0117
            r3 = 13
            if (r5 != r3) goto L_0x0122
        L_0x0117:
            if (r9 < 0) goto L_0x0152
            java.lang.String r3 = r2.substring(r9, r7)
            r8.add(r3)
        L_0x0120:
            r9 = -1
            goto L_0x0152
        L_0x0122:
            r3 = 61
            if (r5 > r3) goto L_0x014f
            r3 = 33
            if (r5 < r3) goto L_0x014f
            if (r5 == r3) goto L_0x013c
            r3 = 37
            if (r5 == r3) goto L_0x013c
            r3 = 44
            if (r5 == r3) goto L_0x013c
            r3 = 46
            if (r5 == r3) goto L_0x013c
            r3 = 61
            if (r5 != r3) goto L_0x014f
        L_0x013c:
            if (r9 < 0) goto L_0x0145
            java.lang.String r3 = r2.substring(r9, r7)
            r8.add(r3)
        L_0x0145:
            int r3 = r7 + 1
            java.lang.String r3 = r2.substring(r7, r3)
            r8.add(r3)
            goto L_0x0120
        L_0x014f:
            if (r9 >= 0) goto L_0x0152
            r9 = r7
        L_0x0152:
            int r7 = r7 + 1
            r3 = 0
            goto L_0x00f7
        L_0x0156:
            if (r9 < 0) goto L_0x015f
            java.lang.String r3 = r2.substring(r9)
            r8.add(r3)
        L_0x015f:
            int r3 = r8.size()
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r3 = r8.toArray(r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            r5 = 0
            r7 = r3[r5]
            int r5 = r7.hashCode()     // Catch:{ Exception -> 0x0467 }
            r8 = 102(0x66, float:1.43E-43)
            r9 = 5
            r18 = 6
            r19 = 4
            if (r5 == r8) goto L_0x01d0
            r8 = 110(0x6e, float:1.54E-43)
            if (r5 == r8) goto L_0x01c6
            r8 = 116(0x74, float:1.63E-43)
            if (r5 == r8) goto L_0x01bc
            r8 = 105(0x69, float:1.47E-43)
            if (r5 == r8) goto L_0x01b2
            r8 = 106(0x6a, float:1.49E-43)
            if (r5 == r8) goto L_0x01a8
            r8 = 118(0x76, float:1.65E-43)
            if (r5 == r8) goto L_0x019e
            r8 = 119(0x77, float:1.67E-43)
            if (r5 == r8) goto L_0x0194
            goto L_0x01da
        L_0x0194:
            java.lang.String r5 = "w"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x01da
            r5 = 5
            goto L_0x01db
        L_0x019e:
            java.lang.String r5 = "v"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x01da
            r5 = 4
            goto L_0x01db
        L_0x01a8:
            java.lang.String r5 = "j"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x01da
            r5 = 6
            goto L_0x01db
        L_0x01b2:
            java.lang.String r5 = "i"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x01da
            r5 = 1
            goto L_0x01db
        L_0x01bc:
            java.lang.String r5 = "t"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x01da
            r5 = 3
            goto L_0x01db
        L_0x01c6:
            java.lang.String r5 = "n"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x01da
            r5 = 0
            goto L_0x01db
        L_0x01d0:
            java.lang.String r5 = "f"
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x01da
            r5 = 2
            goto L_0x01db
        L_0x01da:
            r5 = -1
        L_0x01db:
            switch(r5) {
                case 0: goto L_0x01f5;
                case 1: goto L_0x01f2;
                case 2: goto L_0x01ef;
                case 3: goto L_0x01ec;
                case 4: goto L_0x01e9;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01e2;
                default: goto L_0x01de;
            }
        L_0x01de:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0467 }
            goto L_0x0463
        L_0x01e2:
            r5 = 7
            r23 = 7
            goto L_0x01f7
        L_0x01e6:
            r23 = 6
            goto L_0x01f7
        L_0x01e9:
            r23 = 5
            goto L_0x01f7
        L_0x01ec:
            r23 = 4
            goto L_0x01f7
        L_0x01ef:
            r23 = 3
            goto L_0x01f7
        L_0x01f2:
            r23 = 2
            goto L_0x01f7
        L_0x01f5:
            r23 = 1
        L_0x01f7:
            int r5 = r3.length
            r8 = 1
            if (r5 <= r8) goto L_0x042d
            r5 = r3[r8]
            java.lang.String r7 = "mod"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L_0x0212
            java.lang.String r7 = "%"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x020e
            goto L_0x0212
        L_0x020e:
            r7 = 2
            r9 = 3
            r15 = 0
            goto L_0x0221
        L_0x0212:
            r5 = 2
            r7 = r3[r5]
            int r5 = java.lang.Integer.parseInt(r7)
            r9 = 3
            java.lang.String r7 = m65f(r3, r9, r2)
            r15 = r5
            r5 = r7
            r7 = 4
        L_0x0221:
            java.lang.String r8 = "not"
            boolean r17 = r8.equals(r5)
            java.lang.String r9 = "="
            if (r17 == 0) goto L_0x0247
            int r5 = r7 + 1
            java.lang.String r7 = m65f(r3, r7, r2)
            boolean r17 = r9.equals(r7)
            if (r17 != 0) goto L_0x0242
            r17 = r0
            r19 = r12
            r0 = 0
            r37 = r7
            r7 = r5
            r5 = r37
            goto L_0x026a
        L_0x0242:
            java.text.ParseException r0 = m66g(r7, r2)
            throw r0
        L_0x0247:
            r17 = r0
            java.lang.String r0 = "!"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0267
            int r0 = r7 + 1
            java.lang.String r5 = m65f(r3, r7, r2)
            boolean r7 = r9.equals(r5)
            if (r7 == 0) goto L_0x0262
            r7 = r0
            r19 = r12
            r0 = 0
            goto L_0x026a
        L_0x0262:
            java.text.ParseException r0 = m66g(r5, r2)
            throw r0
        L_0x0267:
            r19 = r12
            r0 = 1
        L_0x026a:
            java.lang.String r12 = "is"
            boolean r20 = r12.equals(r5)
            r30 = r4
            if (r20 != 0) goto L_0x029a
            java.lang.String r4 = "in"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x029a
            boolean r4 = r9.equals(r5)
            if (r4 == 0) goto L_0x0283
            goto L_0x029a
        L_0x0283:
            java.lang.String r4 = "within"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0295
            int r4 = r7 + 1
            java.lang.String r5 = m65f(r3, r7, r2)
            r7 = 0
            r24 = 0
            goto L_0x02b6
        L_0x0295:
            java.text.ParseException r0 = m66g(r5, r2)
            throw r0
        L_0x029a:
            boolean r4 = r12.equals(r5)
            if (r4 == 0) goto L_0x02a8
            if (r0 == 0) goto L_0x02a3
            goto L_0x02a8
        L_0x02a3:
            java.text.ParseException r0 = m66g(r5, r2)
            throw r0
        L_0x02a8:
            int r5 = r7 + 1
            java.lang.String r7 = m65f(r3, r7, r2)
            r24 = 1
            r37 = r7
            r7 = r4
            r4 = r5
            r5 = r37
        L_0x02b6:
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L_0x02d6
            if (r7 != 0) goto L_0x02c6
            if (r0 == 0) goto L_0x02c1
            goto L_0x02c6
        L_0x02c1:
            java.text.ParseException r0 = m66g(r5, r2)
            throw r0
        L_0x02c6:
            r0 = r0 ^ 1
            int r5 = r4 + 1
            java.lang.String r4 = m65f(r3, r4, r2)
            r22 = r0
            r37 = r5
            r5 = r4
            r4 = r37
            goto L_0x02d8
        L_0x02d6:
            r22 = r0
        L_0x02d8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            r20 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            r33 = r10
            r31 = r11
            r32 = r13
            r10 = r20
        L_0x02e9:
            long r12 = java.lang.Long.parseLong(r5)
            r20 = r5
            int r5 = r3.length
            r34 = r6
            java.lang.String r6 = ","
            if (r4 >= r5) goto L_0x0360
            r35 = r1
            int r1 = r4 + 1
            java.lang.String r4 = m65f(r3, r4, r2)
            r36 = r14
            java.lang.String r14 = "."
            boolean r20 = r4.equals(r14)
            if (r20 == 0) goto L_0x034b
            int r4 = r1 + 1
            java.lang.String r1 = m65f(r3, r1, r2)
            boolean r14 = r1.equals(r14)
            if (r14 == 0) goto L_0x0346
            int r1 = r4 + 1
            java.lang.String r4 = m65f(r3, r4, r2)
            long r20 = java.lang.Long.parseLong(r4)
            if (r1 >= r5) goto L_0x0339
            int r4 = r1 + 1
            java.lang.String r1 = m65f(r3, r1, r2)
            boolean r14 = r1.equals(r6)
            if (r14 == 0) goto L_0x0334
            r14 = r7
            r37 = r20
            r20 = r6
            r6 = r37
            goto L_0x036a
        L_0x0334:
            java.text.ParseException r0 = m66g(r1, r2)
            throw r0
        L_0x0339:
            r14 = r7
            r37 = r4
            r4 = r1
            r1 = r37
            r38 = r20
            r20 = r6
            r6 = r38
            goto L_0x036a
        L_0x0346:
            java.text.ParseException r0 = m66g(r1, r2)
            throw r0
        L_0x034b:
            boolean r14 = r4.equals(r6)
            if (r14 == 0) goto L_0x035b
            r20 = r6
            r14 = r7
            r6 = r12
            r37 = r4
            r4 = r1
            r1 = r37
            goto L_0x036a
        L_0x035b:
            java.text.ParseException r0 = m66g(r4, r2)
            throw r0
        L_0x0360:
            r35 = r1
            r36 = r14
            r14 = r7
            r1 = r20
            r20 = r6
            r6 = r12
        L_0x036a:
            int r21 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r21 > 0) goto L_0x0414
            r21 = r3
            r25 = r4
            if (r15 == 0) goto L_0x0393
            long r3 = (long) r15
            int r26 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r26 >= 0) goto L_0x037a
            goto L_0x0393
        L_0x037a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r1 = ">mod="
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.text.ParseException r0 = m66g(r0, r2)
            throw r0
        L_0x0393:
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            r0.add(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r0.add(r3)
            double r3 = (double) r12
            double r8 = java.lang.Math.min(r8, r3)
            double r3 = (double) r6
            double r10 = java.lang.Math.max(r10, r3)
            r4 = r25
            if (r4 < r5) goto L_0x03ff
            r3 = r20
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x03fa
            int r1 = r0.size()
            r3 = 2
            if (r1 != r3) goto L_0x03c1
            r29 = 0
            goto L_0x03db
        L_0x03c1:
            int r1 = r0.size()
            long[] r4 = new long[r1]
            r5 = 0
        L_0x03c8:
            if (r5 >= r1) goto L_0x03d9
            java.lang.Object r6 = r0.get(r5)
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x03c8
        L_0x03d9:
            r29 = r4
        L_0x03db:
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x03eb
            if (r14 == 0) goto L_0x03eb
            if (r22 == 0) goto L_0x03e4
            goto L_0x03eb
        L_0x03e4:
            java.lang.String r0 = "is not <range>"
            java.text.ParseException r0 = m66g(r0, r2)
            throw r0
        L_0x03eb:
            android.a.b.q r0 = new android.a.b.q
            r20 = r0
            r21 = r15
            r25 = r8
            r27 = r10
            r20.<init>(r21, r22, r23, r24, r25, r27, r29)
            r15 = r0
            goto L_0x0440
        L_0x03fa:
            java.text.ParseException r0 = m66g(r1, r2)
            throw r0
        L_0x03ff:
            r3 = 2
            int r1 = r4 + 1
            r5 = r21
            java.lang.String r4 = m65f(r5, r4, r2)
            r3 = r5
            r7 = r14
            r6 = r34
            r14 = r36
            r5 = r4
            r4 = r1
            r1 = r35
            goto L_0x02e9
        L_0x0414:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            java.lang.String r1 = "~"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.text.ParseException r0 = m66g(r0, r2)
            throw r0
        L_0x042d:
            r17 = r0
            r35 = r1
            r30 = r4
            r34 = r6
            r33 = r10
            r31 = r11
            r19 = r12
            r32 = r13
            r36 = r14
            r3 = 2
        L_0x0440:
            if (r36 != 0) goto L_0x0444
            r14 = r15
            goto L_0x044c
        L_0x0444:
            android.a.b.i r0 = new android.a.b.i
            r8 = r36
            r0.<init>(r8, r15)
            r14 = r0
        L_0x044c:
            int r13 = r32 + 1
            r0 = r17
            r12 = r19
            r4 = r30
            r11 = r31
            r10 = r33
            r6 = r34
            r1 = r35
            r2 = -1
            r3 = 0
            r5 = 1
            r7 = 3
            r9 = 2
            goto L_0x00e5
        L_0x0463:
            r0.<init>()     // Catch:{ Exception -> 0x0467 }
            throw r0     // Catch:{ Exception -> 0x0467 }
        L_0x0467:
            java.text.ParseException r0 = m66g(r7, r2)
            throw r0
        L_0x046c:
            r17 = r0
            r35 = r1
            r30 = r4
            r34 = r6
            r33 = r10
            r31 = r11
            r8 = r14
            r3 = 2
            if (r35 != 0) goto L_0x047e
            r1 = r8
            goto L_0x0486
        L_0x047e:
            android.a.b.p r0 = new android.a.b.p
            r1 = r35
            r0.<init>(r1, r8)
            r1 = r0
        L_0x0486:
            int r11 = r31 + 1
            r0 = r17
            r4 = r30
            r10 = r33
            r6 = r34
            r2 = -1
            r3 = 0
            r5 = 1
            r7 = 3
            r9 = 2
            goto L_0x00d8
        L_0x0497:
            r30 = r4
            r34 = r6
            r33 = r10
            r0 = r1
        L_0x049e:
            android.a.b.r r1 = new android.a.b.r
            r2 = r30
            r8 = r33
            r6 = r34
            r1.<init>(r2, r0, r6, r8)
            return r1
        L_0x04aa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The keyword 'other' must have no constraints, just samples."
            r0.<init>(r1)
            throw r0
        L_0x04b2:
            java.text.ParseException r1 = new java.text.ParseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "missing ':' in rule description '"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = "'"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 0
            r1.<init>(r0, r2)
            goto L_0x04cd
        L_0x04cc:
            throw r1
        L_0x04cd:
            goto L_0x04cc
        */
        throw new UnsupportedOperationException("Method not decompiled: android.p017a.p019b.C0106t.m60a(java.lang.String):android.a.b.r");
    }

    /* renamed from: b */
    public static C0106t m61b(String str) {
        String trim = str.trim();
        if (trim.length() == 0) {
            return f293a;
        }
        C0105s sVar = new C0105s();
        if (trim.endsWith(";")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String[] split = f299g.split(trim);
        for (String trim2 : split) {
            C0104r a = m60a(trim2.trim());
            boolean z = sVar.f291a;
            boolean z2 = true;
            if (a.f289c == null && a.f290d == null) {
                z2 = false;
            }
            sVar.f291a = z | z2;
            sVar.mo63a(a);
        }
        Iterator it = sVar.f292b.iterator();
        C0104r rVar = null;
        while (it.hasNext()) {
            C0104r rVar2 = (C0104r) it.next();
            if ("other".equals(rVar2.f287a)) {
                it.remove();
                rVar = rVar2;
            }
        }
        if (rVar == null) {
            rVar = m60a("other:");
        }
        sVar.f292b.add(rVar);
        return new C0106t(sVar);
    }

    /* renamed from: c */
    public static void m62c(StringBuilder sb, double d, double d2, boolean z) {
        if (z) {
            sb.append(",");
        }
        if (d == d2) {
            sb.append(m64e(d));
            return;
        }
        String e = m64e(d);
        String e2 = m64e(d2);
        sb.append(e + ".." + e2);
    }

    /* renamed from: d */
    public static C0106t m63d(Locale locale, int i) {
        C0107u uVar = C0107u.f303a;
        uVar.mo69b();
        String str = (String) (i == 1 ? uVar.f305b : uVar.f306c).get(locale.getLanguage());
        if (str == null || str.trim().length() == 0) {
            return f293a;
        }
        C0106t a = uVar.mo68a(str);
        if (a == null) {
            return f293a;
        }
        return a;
    }

    /* renamed from: e */
    private static String m64e(double d) {
        long j = (long) d;
        return d == ((double) j) ? String.valueOf(j) : String.valueOf(d);
    }

    /* renamed from: f */
    private static String m65f(String[] strArr, int i, String str) {
        if (i < strArr.length) {
            return strArr[i];
        }
        throw new ParseException("missing token at end of '" + str + "'", -1);
    }

    /* renamed from: g */
    private static ParseException m66g(String str, String str2) {
        return new ParseException("unexpected token '" + str + "' in '" + str2 + "'", -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (android.p017a.p019b.C0106t) r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof android.p017a.p019b.C0106t
            if (r0 == 0) goto L_0x001c
            android.a.b.t r2 = (android.p017a.p019b.C0106t) r2
            if (r2 == 0) goto L_0x001c
            android.a.b.s r0 = r1.f302h
            java.lang.String r0 = r0.toString()
            android.a.b.s r2 = r2.f302h
            java.lang.String r2 = r2.toString()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x001c
            r2 = 1
            return r2
        L_0x001c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.p017a.p019b.C0106t.equals(java.lang.Object):boolean");
    }

    @Deprecated
    public final int hashCode() {
        return this.f302h.hashCode();
    }

    public final String toString() {
        return this.f302h.toString();
    }
}
