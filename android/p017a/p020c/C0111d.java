package android.p017a.p020c;

import android.p017a.p021d.C0112a;
import java.util.ArrayList;

/* renamed from: android.a.c.d */
/* compiled from: PG */
public final class C0111d implements Cloneable {

    /* renamed from: e */
    public static final int[] f313e = {1, 2, 3, 4, 5, 6};

    /* renamed from: h */
    private static final int f314h;

    /* renamed from: a */
    public String f315a;

    /* renamed from: b */
    public ArrayList f316b;

    /* renamed from: c */
    public ArrayList f317c;

    /* renamed from: d */
    public boolean f318d;

    /* renamed from: f */
    public final int f319f;

    /* renamed from: g */
    private boolean f320g;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    static {
        /*
            java.lang.String r0 = android.p017a.p018a.C0083b.m35a()
            int r1 = r0.hashCode()
            r2 = -413919155(0xffffffffe754184d, float:-1.00159E24)
            r3 = 1
            if (r1 == r2) goto L_0x001e
            r2 = -99796978(0xfffffffffa0d380e, float:-1.833127E35)
            if (r1 == r2) goto L_0x0014
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "DOUBLE_OPTIONAL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = 0
            goto L_0x0029
        L_0x001e:
            java.lang.String r1 = "DOUBLE_REQUIRED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = -1
        L_0x0029:
            if (r0 == 0) goto L_0x0035
            if (r0 != r3) goto L_0x002f
            r3 = 2
            goto L_0x0035
        L_0x002f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0035:
            f314h = r3
            r0 = 6
            int[] r0 = new int[r0]
            r0 = {1, 2, 3, 4, 5, 6} // fill-array
            f313e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.p017a.p020c.C0111d.<clinit>():void");
    }

    public C0111d() {
        this.f316b = new ArrayList();
        throw null;
    }

    /* renamed from: i */
    private final int m73i(int i) {
        while (i < this.f315a.length() && (((r0 = this.f315a.charAt(i)) >= '0' || "+-.".indexOf(r0) >= 0) && (r0 <= '9' || r0 == 'e' || r0 == 'E' || r0 == 8734))) {
            i++;
        }
        return i;
    }

    /* renamed from: j */
    private final String m74j() {
        return m75k(this.f315a, 0);
    }

    /* renamed from: k */
    private static String m75k(String str, int i) {
        StringBuilder sb = new StringBuilder(44);
        if (i == 0) {
            sb.append("\"");
        } else {
            sb.append("[at pattern index ");
            sb.append(i);
            sb.append("] \"");
        }
        if (str.length() - i <= 24) {
            if (i != 0) {
                str = str.substring(i);
            }
            sb.append(str);
        } else {
            int i2 = i + 20;
            int i3 = i2 - 1;
            if (true == Character.isHighSurrogate(str.charAt(i3))) {
                i2 = i3;
            }
            sb.append(str, i, i2);
            sb.append(" ...");
        }
        sb.append("\"");
        return sb.toString();
    }

    /* renamed from: l */
    private final void m76l(double d, int i, int i2) {
        int i3;
        ArrayList arrayList = this.f317c;
        if (arrayList == null) {
            this.f317c = new ArrayList();
            i3 = 0;
        } else {
            i3 = arrayList.size();
            if (i3 > 32767) {
                throw new IndexOutOfBoundsException("Too many numeric values");
            }
        }
        this.f317c.add(Double.valueOf(d));
        m82r(14, i, i2, i3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058 A[LOOP:0: B:21:0x0058->B:33:0x0076, LOOP_START, PHI: r0 r1 r3 
      PHI: (r0v3 int) = (r0v2 int), (r0v5 int) binds: [B:11:0x0030, B:33:0x0076] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r1v3 char) = (r1v2 char), (r1v6 char) binds: [B:11:0x0030, B:33:0x0076] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:11:0x0030, B:33:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m77m(int r8, int r9, boolean r10) {
        /*
            r7 = this;
            int r0 = r8 + 1
            java.lang.String r1 = r7.f315a
            char r1 = r1.charAt(r8)
            r2 = 45
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x001d
            if (r0 == r9) goto L_0x0042
            int r1 = r0 + 1
            java.lang.String r2 = r7.f315a
            char r0 = r2.charAt(r0)
            r2 = 1
        L_0x0019:
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x002e
        L_0x001d:
            r2 = 43
            if (r1 != r2) goto L_0x002d
            if (r0 == r9) goto L_0x0042
            int r1 = r0 + 1
            java.lang.String r2 = r7.f315a
            char r0 = r2.charAt(r0)
            r2 = 0
            goto L_0x0019
        L_0x002d:
            r2 = 0
        L_0x002e:
            r5 = 8734(0x221e, float:1.2239E-41)
            if (r1 != r5) goto L_0x0058
            if (r10 == 0) goto L_0x0042
            if (r0 != r9) goto L_0x0042
            if (r4 == r2) goto L_0x003b
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L_0x003d
        L_0x003b:
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
        L_0x003d:
            int r9 = r9 - r8
            r7.m76l(r0, r8, r9)
            return
        L_0x0042:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            java.lang.String r0 = r7.f315a
            java.lang.String r8 = r0.substring(r8, r9)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r9 = "Bad syntax for numeric value: "
            java.lang.String r8 = r9.concat(r8)
            r10.<init>(r8)
            throw r10
        L_0x0058:
            r10 = 48
            if (r1 < r10) goto L_0x0080
            r10 = 57
            if (r1 > r10) goto L_0x0080
            int r3 = r3 * 10
            int r1 = r1 + -48
            int r3 = r3 + r1
            int r10 = r2 + 32767
            if (r3 <= r10) goto L_0x006a
            goto L_0x0080
        L_0x006a:
            if (r0 != r9) goto L_0x0076
            int r9 = r9 - r8
            if (r2 == 0) goto L_0x0070
            int r3 = -r3
        L_0x0070:
            r10 = 13
            r7.m82r(r10, r8, r9, r3)
            return
        L_0x0076:
            int r10 = r0 + 1
            java.lang.String r1 = r7.f315a
            char r1 = r1.charAt(r0)
            r0 = r10
            goto L_0x0058
        L_0x0080:
            java.lang.String r10 = r7.f315a
            java.lang.String r10 = r10.substring(r8, r9)
            double r0 = java.lang.Double.parseDouble(r10)
            int r9 = r9 - r8
            r7.m76l(r0, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.p017a.p020c.C0111d.m77m(int, int, boolean):void");
    }

    /* renamed from: n */
    private final boolean m78n(int i) {
        return i > 0 || ((C0110c) this.f316b.get(0)).f312e == 1;
    }

    /* renamed from: o */
    private final boolean m79o(int i) {
        int i2 = i + 1;
        char charAt = this.f315a.charAt(i);
        if (charAt != 's' && charAt != 'S') {
            return false;
        }
        int i3 = i2 + 1;
        char charAt2 = this.f315a.charAt(i2);
        if (charAt2 != 'e' && charAt2 != 'E') {
            return false;
        }
        int i4 = i3 + 1;
        char charAt3 = this.f315a.charAt(i3);
        if (charAt3 != 'l' && charAt3 != 'L') {
            return false;
        }
        int i5 = i4 + 1;
        char charAt4 = this.f315a.charAt(i4);
        if (charAt4 != 'e' && charAt4 != 'E') {
            return false;
        }
        int i6 = i5 + 1;
        char charAt5 = this.f315a.charAt(i5);
        if (charAt5 != 'c' && charAt5 != 'C') {
            return false;
        }
        char charAt6 = this.f315a.charAt(i6);
        if (charAt6 == 't' || charAt6 == 'T') {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:273:0x04b9, code lost:
        throw new java.lang.IllegalArgumentException("Missing choice argument pattern in ".concat(m74j()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0669, code lost:
        if (r3 == m78n(r7)) goto L_0x06a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x066b, code lost:
        if (r1 == false) goto L_0x067d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x06a6, code lost:
        throw new java.lang.IllegalArgumentException("Missing 'other' keyword in " + android.p017a.p020c.C0108a.m69a(r5).toLowerCase(java.util.Locale.ENGLISH) + " pattern in " + m74j());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06ce, code lost:
        throw new java.lang.IllegalArgumentException("Bad " + android.p017a.p020c.C0108a.m69a(r5).toLowerCase(java.util.Locale.ENGLISH) + " pattern syntax: " + m75k(r6.f315a, r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x06f0, code lost:
        throw new java.lang.IllegalArgumentException("Bad argument syntax: ".concat(m75k(r6.f315a, r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0760, code lost:
        if (r8 != r2) goto L_0x0766;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0762, code lost:
        if (r0 != '}') goto L_0x0766;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0764, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0766, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0767, code lost:
        r10 = r13 - 1;
        m81q(r9, 2, r10, r4, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0774, code lost:
        if (r8 != 3) goto L_0x0777;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0776, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0777, code lost:
        return r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x014f, code lost:
        throw new java.lang.IndexOutOfBoundsException("Argument number too large: ".concat(m75k(r6.f315a, r3)));
     */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x05cc  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x070f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x062b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x0123 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x016b  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m80p(int r19, int r20, int r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            r0 = r19
            r1 = r20
            r7 = r21
            r8 = r22
            r2 = 32767(0x7fff, float:4.5916E-41)
            if (r7 > r2) goto L_0x07ac
            java.util.ArrayList r2 = r6.f316b
            int r9 = r2.size()
            r10 = 1
            r6.m82r(r10, r0, r1, r7)
            int r0 = r0 + r1
        L_0x0019:
            r11 = r0
        L_0x001a:
            java.lang.String r0 = r6.f315a
            int r0 = r0.length()
            java.lang.String r1 = "Unmatched '{' braces in message "
            r12 = 3
            r2 = 0
            if (r11 >= r0) goto L_0x077c
            int r13 = r11 + 1
            java.lang.String r0 = r6.f315a
            char r0 = r0.charAt(r11)
            r3 = 35
            r4 = 123(0x7b, float:1.72E-43)
            r5 = 4
            r11 = 39
            r14 = 125(0x7d, float:1.75E-43)
            r15 = 2
            if (r0 != r11) goto L_0x00a9
            java.lang.String r0 = r6.f315a
            int r0 = r0.length()
            if (r13 != r0) goto L_0x0047
            r6.m82r(r5, r13, r2, r11)
            goto L_0x0778
        L_0x0047:
            java.lang.String r0 = r6.f315a
            char r0 = r0.charAt(r13)
            if (r0 != r11) goto L_0x0055
            int r11 = r13 + 1
            r6.m82r(r12, r13, r10, r2)
            goto L_0x001a
        L_0x0055:
            int r1 = r6.f319f
            if (r1 == r15) goto L_0x0074
            if (r0 == r4) goto L_0x0074
            if (r0 == r14) goto L_0x0074
            if (r8 != r12) goto L_0x0065
            r1 = 124(0x7c, float:1.74E-43)
            if (r0 == r1) goto L_0x0074
            r1 = 3
            goto L_0x0066
        L_0x0065:
            r1 = r8
        L_0x0066:
            boolean r1 = android.p017a.p020c.C0108a.m70b(r1)
            if (r1 == 0) goto L_0x006f
            if (r0 != r3) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            r6.m82r(r5, r13, r2, r11)
            goto L_0x0778
        L_0x0074:
            int r0 = r13 + -1
            r6.m82r(r12, r0, r10, r2)
        L_0x0079:
            java.lang.String r0 = r6.f315a
            int r13 = r13 + r10
            int r0 = r0.indexOf(r11, r13)
            if (r0 < 0) goto L_0x009e
            int r13 = r0 + 1
            java.lang.String r1 = r6.f315a
            int r1 = r1.length()
            if (r13 >= r1) goto L_0x0098
            java.lang.String r1 = r6.f315a
            char r1 = r1.charAt(r13)
            if (r1 != r11) goto L_0x0098
            r6.m82r(r12, r13, r10, r2)
            goto L_0x0079
        L_0x0098:
            r6.m82r(r12, r0, r10, r2)
            r11 = r13
            goto L_0x001a
        L_0x009e:
            java.lang.String r0 = r6.f315a
            int r0 = r0.length()
            r6.m82r(r5, r0, r2, r11)
            goto L_0x0019
        L_0x00a9:
            boolean r16 = android.p017a.p020c.C0108a.m70b(r22)
            if (r16 == 0) goto L_0x00b9
            if (r0 != r3) goto L_0x00b9
            int r0 = r13 + -1
            r1 = 5
            r6.m82r(r1, r0, r10, r2)
            goto L_0x0778
        L_0x00b9:
            if (r0 != r4) goto L_0x074d
            int r13 = r13 + -1
            java.util.ArrayList r0 = r6.f316b
            int r0 = r0.size()
            r5 = 6
            r6.m82r(r5, r13, r10, r2)
            java.lang.String r3 = r6.f315a
            int r13 = r13 + r10
            int r3 = android.p017a.p018a.C0086e.m37b(r3, r13)
            java.lang.String r13 = r6.f315a
            int r13 = r13.length()
            if (r3 == r13) goto L_0x073f
            java.lang.String r13 = r6.f315a
            int r13 = android.p017a.p018a.C0086e.m36a(r13, r3)
            java.lang.String r12 = r6.f315a
            r4 = -1
            if (r3 < r13) goto L_0x00e3
        L_0x00e1:
            r12 = -2
            goto L_0x0129
        L_0x00e3:
            int r11 = r3 + 1
            char r15 = r12.charAt(r3)
            r5 = 48
            if (r15 != r5) goto L_0x00f4
            if (r11 != r13) goto L_0x00f1
            r12 = 0
            goto L_0x0129
        L_0x00f1:
            r5 = 1
            r15 = 0
            goto L_0x00ff
        L_0x00f4:
            r5 = 49
            if (r15 < r5) goto L_0x0128
            r5 = 57
            if (r15 > r5) goto L_0x0128
            int r15 = r15 + -48
            r5 = 0
        L_0x00ff:
            if (r11 >= r13) goto L_0x0123
            int r17 = r11 + 1
            char r11 = r12.charAt(r11)
            r14 = 48
            if (r11 < r14) goto L_0x0128
            r14 = 57
            if (r11 > r14) goto L_0x0128
            r14 = 214748364(0xccccccc, float:3.1554434E-31)
            if (r15 < r14) goto L_0x0116
            r14 = 0
            goto L_0x0117
        L_0x0116:
            r14 = 1
        L_0x0117:
            r14 = r14 ^ r10
            r5 = r5 | r14
            int r15 = r15 * 10
            int r11 = r11 + -48
            int r15 = r15 + r11
            r11 = r17
            r14 = 125(0x7d, float:1.75E-43)
            goto L_0x00ff
        L_0x0123:
            if (r5 == 0) goto L_0x0126
            goto L_0x00e1
        L_0x0126:
            r12 = r15
            goto L_0x0129
        L_0x0128:
            r12 = -1
        L_0x0129:
            java.lang.String r5 = "Bad argument syntax: "
            r11 = 65535(0xffff, float:9.1834E-41)
            if (r12 < 0) goto L_0x0150
            int r14 = r13 - r3
            if (r14 > r11) goto L_0x013e
            r15 = 32767(0x7fff, float:4.5916E-41)
            if (r12 > r15) goto L_0x013e
            r15 = 8
            r6.m82r(r15, r3, r14, r12)
            goto L_0x015d
        L_0x013e:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = r6.f315a
            java.lang.String r1 = m75k(r1, r3)
            java.lang.String r2 = "Argument number too large: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0150:
            if (r12 != r4) goto L_0x072f
            int r12 = r13 - r3
            if (r12 > r11) goto L_0x071d
            r6.f318d = r10
            r14 = 9
            r6.m82r(r14, r3, r12, r2)
        L_0x015d:
            java.lang.String r12 = r6.f315a
            int r12 = android.p017a.p018a.C0086e.m37b(r12, r13)
            java.lang.String r13 = r6.f315a
            int r13 = r13.length()
            if (r12 == r13) goto L_0x070f
            java.lang.String r13 = r6.f315a
            char r13 = r13.charAt(r12)
            r14 = 125(0x7d, float:1.75E-43)
            if (r13 != r14) goto L_0x0178
            r5 = 1
            goto L_0x066d
        L_0x0178:
            r14 = 44
            if (r13 != r14) goto L_0x06ff
            java.lang.String r13 = r6.f315a
            int r12 = r12 + 1
            int r12 = android.p017a.p018a.C0086e.m37b(r13, r12)
            r13 = r12
        L_0x0185:
            java.lang.String r14 = r6.f315a
            int r14 = r14.length()
            r15 = 65
            r4 = 97
            if (r13 >= r14) goto L_0x01a8
            java.lang.String r14 = r6.f315a
            char r14 = r14.charAt(r13)
            if (r14 < r4) goto L_0x019d
            r10 = 122(0x7a, float:1.71E-43)
            if (r14 <= r10) goto L_0x01a3
        L_0x019d:
            if (r14 < r15) goto L_0x01a8
            r10 = 90
            if (r14 > r10) goto L_0x01a8
        L_0x01a3:
            int r13 = r13 + 1
            r4 = -1
            r10 = 1
            goto L_0x0185
        L_0x01a8:
            int r10 = r13 - r12
            java.lang.String r14 = r6.f315a
            int r13 = android.p017a.p018a.C0086e.m37b(r14, r13)
            java.lang.String r14 = r6.f315a
            int r14 = r14.length()
            if (r13 == r14) goto L_0x06f1
            if (r10 == 0) goto L_0x06e1
            java.lang.String r14 = r6.f315a
            char r14 = r14.charAt(r13)
            r2 = 44
            if (r14 == r2) goto L_0x01ca
            r2 = 125(0x7d, float:1.75E-43)
            if (r14 != r2) goto L_0x06e1
            r14 = 125(0x7d, float:1.75E-43)
        L_0x01ca:
            if (r10 > r11) goto L_0x06cf
            r5 = 108(0x6c, float:1.51E-43)
            r11 = 6
            if (r10 != r11) goto L_0x0298
            int r11 = r12 + 1
            java.lang.String r15 = r6.f315a
            char r15 = r15.charAt(r12)
            r4 = 99
            if (r15 == r4) goto L_0x01e1
            r4 = 67
            if (r15 != r4) goto L_0x0230
        L_0x01e1:
            int r4 = r11 + 1
            java.lang.String r15 = r6.f315a
            char r15 = r15.charAt(r11)
            r2 = 104(0x68, float:1.46E-43)
            if (r15 == r2) goto L_0x01f1
            r2 = 72
            if (r15 != r2) goto L_0x0230
        L_0x01f1:
            int r2 = r4 + 1
            java.lang.String r15 = r6.f315a
            char r4 = r15.charAt(r4)
            r15 = 111(0x6f, float:1.56E-43)
            if (r4 == r15) goto L_0x0201
            r15 = 79
            if (r4 != r15) goto L_0x0230
        L_0x0201:
            int r4 = r2 + 1
            java.lang.String r15 = r6.f315a
            char r2 = r15.charAt(r2)
            r15 = 105(0x69, float:1.47E-43)
            if (r2 == r15) goto L_0x0211
            r15 = 73
            if (r2 != r15) goto L_0x0230
        L_0x0211:
            int r2 = r4 + 1
            java.lang.String r15 = r6.f315a
            char r4 = r15.charAt(r4)
            r15 = 99
            if (r4 == r15) goto L_0x0221
            r15 = 67
            if (r4 != r15) goto L_0x0230
        L_0x0221:
            java.lang.String r4 = r6.f315a
            char r2 = r4.charAt(r2)
            r4 = 101(0x65, float:1.42E-43)
            if (r2 == r4) goto L_0x0295
            r4 = 69
            if (r2 != r4) goto L_0x0230
            goto L_0x0295
        L_0x0230:
            java.lang.String r2 = r6.f315a
            char r2 = r2.charAt(r12)
            r4 = 112(0x70, float:1.57E-43)
            if (r2 == r4) goto L_0x023e
            r4 = 80
            if (r2 != r4) goto L_0x0289
        L_0x023e:
            int r2 = r11 + 1
            java.lang.String r4 = r6.f315a
            char r4 = r4.charAt(r11)
            if (r4 == r5) goto L_0x024c
            r11 = 76
            if (r4 != r11) goto L_0x0289
        L_0x024c:
            int r4 = r2 + 1
            java.lang.String r11 = r6.f315a
            char r2 = r11.charAt(r2)
            r11 = 117(0x75, float:1.64E-43)
            if (r2 == r11) goto L_0x025c
            r11 = 85
            if (r2 != r11) goto L_0x0289
        L_0x025c:
            int r2 = r4 + 1
            java.lang.String r11 = r6.f315a
            char r4 = r11.charAt(r4)
            r11 = 114(0x72, float:1.6E-43)
            if (r4 == r11) goto L_0x026c
            r11 = 82
            if (r4 != r11) goto L_0x0289
        L_0x026c:
            int r4 = r2 + 1
            java.lang.String r11 = r6.f315a
            char r2 = r11.charAt(r2)
            r11 = 97
            if (r2 == r11) goto L_0x027c
            r11 = 65
            if (r2 != r11) goto L_0x0289
        L_0x027c:
            java.lang.String r2 = r6.f315a
            char r2 = r2.charAt(r4)
            if (r2 == r5) goto L_0x0292
            r4 = 76
            if (r2 != r4) goto L_0x0289
            goto L_0x0292
        L_0x0289:
            boolean r2 = r6.m79o(r12)
            if (r2 == 0) goto L_0x0316
            r5 = 5
            goto L_0x0317
        L_0x0292:
            r5 = 4
            goto L_0x0317
        L_0x0295:
            r5 = 3
            goto L_0x0317
        L_0x0298:
            r2 = 13
            if (r10 != r2) goto L_0x0316
            boolean r4 = r6.m79o(r12)
            if (r4 == 0) goto L_0x0312
            int r4 = r12 + 6
            int r10 = r4 + 1
            java.lang.String r11 = r6.f315a
            char r4 = r11.charAt(r4)
            r11 = 111(0x6f, float:1.56E-43)
            if (r4 == r11) goto L_0x02b4
            r11 = 79
            if (r4 != r11) goto L_0x0312
        L_0x02b4:
            int r4 = r10 + 1
            java.lang.String r11 = r6.f315a
            char r10 = r11.charAt(r10)
            r11 = 114(0x72, float:1.6E-43)
            if (r10 == r11) goto L_0x02c4
            r11 = 82
            if (r10 != r11) goto L_0x0312
        L_0x02c4:
            int r10 = r4 + 1
            java.lang.String r11 = r6.f315a
            char r4 = r11.charAt(r4)
            r11 = 100
            if (r4 == r11) goto L_0x02d4
            r11 = 68
            if (r4 != r11) goto L_0x0312
        L_0x02d4:
            int r4 = r10 + 1
            java.lang.String r11 = r6.f315a
            char r10 = r11.charAt(r10)
            r11 = 105(0x69, float:1.47E-43)
            if (r10 == r11) goto L_0x02e4
            r11 = 73
            if (r10 != r11) goto L_0x0312
        L_0x02e4:
            int r10 = r4 + 1
            java.lang.String r11 = r6.f315a
            char r4 = r11.charAt(r4)
            r11 = 110(0x6e, float:1.54E-43)
            if (r4 == r11) goto L_0x02f4
            r11 = 78
            if (r4 != r11) goto L_0x0312
        L_0x02f4:
            int r4 = r10 + 1
            java.lang.String r11 = r6.f315a
            char r10 = r11.charAt(r10)
            r11 = 97
            if (r10 == r11) goto L_0x0304
            r11 = 65
            if (r10 != r11) goto L_0x0312
        L_0x0304:
            java.lang.String r10 = r6.f315a
            char r4 = r10.charAt(r4)
            if (r4 == r5) goto L_0x0310
            r5 = 76
            if (r4 != r5) goto L_0x0312
        L_0x0310:
            r5 = 6
            goto L_0x0313
        L_0x0312:
            r5 = 2
        L_0x0313:
            r10 = 13
            goto L_0x0317
        L_0x0316:
            r5 = 2
        L_0x0317:
            java.util.ArrayList r2 = r6.f316b
            java.lang.Object r2 = r2.get(r0)
            android.a.c.c r2 = (android.p017a.p020c.C0110c) r2
            int r4 = r5 + -1
            short r4 = (short) r4
            r2.f310c = r4
            r2 = 2
            if (r5 != r2) goto L_0x032d
            r4 = 10
            r11 = 0
            r6.m82r(r4, r12, r10, r11)
        L_0x032d:
            r4 = 125(0x7d, float:1.75E-43)
            if (r14 != r4) goto L_0x0348
            if (r5 != r2) goto L_0x0336
            r12 = r13
            goto L_0x066d
        L_0x0336:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.f315a
            java.lang.String r1 = m75k(r1, r3)
            java.lang.String r2 = "No style field for complex argument: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0348:
            int r13 = r13 + 1
            if (r5 != r2) goto L_0x03c1
            r3 = r13
            r2 = 0
        L_0x034e:
            java.lang.String r4 = r6.f315a
            int r4 = r4.length()
            if (r3 >= r4) goto L_0x03b3
            int r4 = r3 + 1
            java.lang.String r10 = r6.f315a
            char r3 = r10.charAt(r3)
            r10 = 39
            if (r3 != r10) goto L_0x037f
            java.lang.String r3 = r6.f315a
            int r3 = r3.indexOf(r10, r4)
            if (r3 < 0) goto L_0x036d
            int r3 = r3 + 1
            goto L_0x034e
        L_0x036d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.f315a
            java.lang.String r1 = m75k(r1, r13)
            java.lang.String r2 = "Quoted literal argument style text reaches to the end of the message: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x037f:
            r11 = 123(0x7b, float:1.72E-43)
            if (r3 != r11) goto L_0x0387
            int r2 = r2 + 1
        L_0x0385:
            r3 = r4
            goto L_0x034e
        L_0x0387:
            r11 = 125(0x7d, float:1.75E-43)
            if (r3 != r11) goto L_0x0385
            if (r2 <= 0) goto L_0x0390
            int r2 = r2 + -1
            goto L_0x0385
        L_0x0390:
            int r12 = r4 + -1
            int r1 = r12 - r13
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r1 > r2) goto L_0x03a1
            r2 = 11
            r3 = 0
            r6.m82r(r2, r13, r1, r3)
            goto L_0x066d
        L_0x03a1:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = r6.f315a
            java.lang.String r1 = m75k(r1, r13)
            java.lang.String r2 = "Argument style text too long: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x03b3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r18.m74j()
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x03c1:
            r1 = 3
            if (r5 != r1) goto L_0x04ba
            java.lang.String r1 = r6.f315a
            int r1 = android.p017a.p018a.C0086e.m37b(r1, r13)
            java.lang.String r2 = r6.f315a
            int r2 = r2.length()
            if (r1 == r2) goto L_0x04aa
            java.lang.String r2 = r6.f315a
            char r2 = r2.charAt(r1)
            r3 = 125(0x7d, float:1.75E-43)
            if (r2 == r3) goto L_0x04aa
        L_0x03dc:
            int r2 = r6.m73i(r1)
            int r3 = r2 - r1
            java.lang.String r4 = "Bad choice pattern syntax: "
            if (r3 == 0) goto L_0x049a
            r10 = 65535(0xffff, float:9.1834E-41)
            if (r3 > r10) goto L_0x0488
            r3 = 1
            r6.m77m(r1, r2, r3)
            java.lang.String r1 = r6.f315a
            int r1 = android.p017a.p018a.C0086e.m37b(r1, r2)
            java.lang.String r2 = r6.f315a
            int r2 = r2.length()
            if (r1 == r2) goto L_0x0478
            java.lang.String r2 = r6.f315a
            char r2 = r2.charAt(r1)
            r3 = 35
            if (r2 == r3) goto L_0x0432
            r10 = 60
            if (r2 == r10) goto L_0x0432
            r10 = 8804(0x2264, float:1.2337E-41)
            if (r2 != r10) goto L_0x0410
            goto L_0x0432
        L_0x0410:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.f315a
            java.lang.String r1 = m75k(r1, r13)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Expected choice separator (#<≤) instead of '"
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = "' in choice pattern "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x0432:
            r2 = 12
            r10 = 0
            r11 = 1
            r6.m82r(r2, r1, r11, r10)
            int r1 = r1 + 1
            int r2 = r7 + 1
            r11 = 3
            int r12 = r6.m80p(r1, r10, r2, r11)
            java.lang.String r1 = r6.f315a
            int r1 = r1.length()
            if (r12 != r1) goto L_0x044c
            goto L_0x066d
        L_0x044c:
            java.lang.String r1 = r6.f315a
            char r1 = r1.charAt(r12)
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x046e
            boolean r1 = r6.m78n(r7)
            if (r1 == 0) goto L_0x045e
            goto L_0x066d
        L_0x045e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.f315a
            java.lang.String r1 = m75k(r1, r13)
            java.lang.String r1 = r4.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x046e:
            java.lang.String r1 = r6.f315a
            int r12 = r12 + 1
            int r1 = android.p017a.p018a.C0086e.m37b(r1, r12)
            goto L_0x03dc
        L_0x0478:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.f315a
            java.lang.String r1 = m75k(r1, r13)
            java.lang.String r1 = r4.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0488:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = r6.f315a
            java.lang.String r1 = m75k(r2, r1)
            java.lang.String r2 = "Choice number too long: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x049a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.f315a
            java.lang.String r1 = m75k(r1, r13)
            java.lang.String r1 = r4.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x04aa:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Missing choice argument pattern in "
            java.lang.String r2 = r18.m74j()
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x04ba:
            r3 = r13
            r1 = 0
            r2 = 1
        L_0x04bd:
            java.lang.String r4 = r6.f315a
            int r12 = android.p017a.p018a.C0086e.m37b(r4, r3)
            java.lang.String r3 = r6.f315a
            int r3 = r3.length()
            if (r12 != r3) goto L_0x04cd
            r3 = 1
            goto L_0x04ce
        L_0x04cd:
            r3 = 0
        L_0x04ce:
            java.lang.String r4 = " pattern syntax: "
            java.lang.String r10 = "Bad "
            if (r3 != 0) goto L_0x0665
            java.lang.String r11 = r6.f315a
            char r11 = r11.charAt(r12)
            r14 = 125(0x7d, float:1.75E-43)
            if (r11 != r14) goto L_0x04e0
            goto L_0x0665
        L_0x04e0:
            boolean r3 = android.p017a.p020c.C0108a.m70b(r5)
            if (r3 == 0) goto L_0x0549
            java.lang.String r3 = r6.f315a
            char r3 = r3.charAt(r12)
            r11 = 61
            if (r3 != r11) goto L_0x0549
            int r2 = r12 + 1
            int r3 = r6.m73i(r2)
            int r11 = r3 - r12
            r14 = 1
            if (r11 == r14) goto L_0x0521
            r14 = 65535(0xffff, float:9.1834E-41)
            if (r11 > r14) goto L_0x050f
            r4 = 12
            r10 = 0
            r6.m82r(r4, r12, r11, r10)
            r6.m77m(r2, r3, r10)
            r2 = 65535(0xffff, float:9.1834E-41)
            r4 = 6
            goto L_0x05dd
        L_0x050f:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = r6.f315a
            java.lang.String r1 = m75k(r1, r12)
            java.lang.String r2 = "Argument selector too long: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0521:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r2 = android.p017a.p020c.C0108a.m69a(r5)
            java.lang.String r1 = r2.toLowerCase(r1)
            java.lang.String r2 = r6.f315a
            java.lang.String r2 = m75k(r2, r13)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r10)
            r3.append(r1)
            r3.append(r4)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x0549:
            java.lang.String r3 = r6.f315a
            int r3 = android.p017a.p018a.C0086e.m36a(r3, r12)
            int r11 = r3 - r12
            if (r11 == 0) goto L_0x063d
            boolean r4 = android.p017a.p020c.C0108a.m70b(r5)
            if (r4 == 0) goto L_0x05c6
            r4 = 6
            if (r11 != r4) goto L_0x05c7
            java.lang.String r10 = r6.f315a
            int r10 = r10.length()
            if (r3 >= r10) goto L_0x05c1
            java.lang.String r10 = r6.f315a
            java.lang.String r11 = "offset:"
            r14 = 7
            r15 = 0
            boolean r10 = r10.regionMatches(r12, r11, r15, r14)
            if (r10 == 0) goto L_0x05c1
            if (r2 == 0) goto L_0x05af
            java.lang.String r2 = r6.f315a
            int r3 = r3 + 1
            int r2 = android.p017a.p018a.C0086e.m37b(r2, r3)
            int r3 = r6.m73i(r2)
            if (r3 == r2) goto L_0x059d
            int r10 = r3 - r2
            r11 = 65535(0xffff, float:9.1834E-41)
            if (r10 > r11) goto L_0x058b
            r6.m77m(r2, r3, r15)
            goto L_0x05fc
        L_0x058b:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = r6.f315a
            java.lang.String r1 = m75k(r1, r2)
            java.lang.String r2 = "Plural offset value too long: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x059d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.f315a
            java.lang.String r1 = m75k(r1, r13)
            java.lang.String r2 = "Missing value for plural 'offset:' "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x05af:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.f315a
            java.lang.String r1 = m75k(r1, r13)
            java.lang.String r2 = "Plural argument 'offset:' (if present) must precede key-message pairs: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x05c1:
            r2 = 65535(0xffff, float:9.1834E-41)
            r11 = 6
            goto L_0x05ca
        L_0x05c6:
            r4 = 6
        L_0x05c7:
            r2 = 65535(0xffff, float:9.1834E-41)
        L_0x05ca:
            if (r11 > r2) goto L_0x062b
            r10 = 12
            r14 = 0
            r6.m82r(r10, r12, r11, r14)
            java.lang.String r10 = r6.f315a
            java.lang.String r15 = "other"
            boolean r10 = r10.regionMatches(r12, r15, r14, r11)
            if (r10 == 0) goto L_0x05dd
            r1 = 1
        L_0x05dd:
            java.lang.String r10 = r6.f315a
            int r3 = android.p017a.p018a.C0086e.m37b(r10, r3)
            java.lang.String r10 = r6.f315a
            int r10 = r10.length()
            if (r3 == r10) goto L_0x05ff
            java.lang.String r10 = r6.f315a
            char r10 = r10.charAt(r3)
            r11 = 123(0x7b, float:1.72E-43)
            if (r10 != r11) goto L_0x05ff
            int r10 = r7 + 1
            r12 = 1
            int r3 = r6.m80p(r3, r12, r10, r5)
        L_0x05fc:
            r2 = 0
            goto L_0x04bd
        L_0x05ff:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r2 = android.p017a.p020c.C0108a.m69a(r5)
            java.lang.String r1 = r2.toLowerCase(r1)
            java.lang.String r2 = r6.f315a
            java.lang.String r2 = m75k(r2, r12)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "No message fragment after "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " selector: "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x062b:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = r6.f315a
            java.lang.String r1 = m75k(r1, r12)
            java.lang.String r2 = "Argument selector too long: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x063d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r2 = android.p017a.p020c.C0108a.m69a(r5)
            java.lang.String r1 = r2.toLowerCase(r1)
            java.lang.String r2 = r6.f315a
            java.lang.String r2 = m75k(r2, r13)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r10)
            r3.append(r1)
            r3.append(r4)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x0665:
            boolean r2 = r6.m78n(r7)
            if (r3 == r2) goto L_0x06a7
            if (r1 == 0) goto L_0x067d
        L_0x066d:
            r2 = 7
            r4 = 1
            r1 = -1
            int r5 = r5 + r1
            r1 = r0
            r0 = r18
            r3 = r12
            r0.m81q(r1, r2, r3, r4, r5)
            r0 = 1
            int r11 = r12 + 1
            goto L_0x0779
        L_0x067d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r2 = android.p017a.p020c.C0108a.m69a(r5)
            java.lang.String r1 = r2.toLowerCase(r1)
            java.lang.String r2 = r18.m74j()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Missing 'other' keyword in "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " pattern in "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x06a7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r2 = android.p017a.p020c.C0108a.m69a(r5)
            java.lang.String r1 = r2.toLowerCase(r1)
            java.lang.String r2 = r6.f315a
            java.lang.String r2 = m75k(r2, r13)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r10)
            r3.append(r1)
            r3.append(r4)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x06cf:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = r6.f315a
            java.lang.String r1 = m75k(r1, r3)
            java.lang.String r2 = "Argument type name too long: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x06e1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.f315a
            java.lang.String r1 = m75k(r1, r3)
            java.lang.String r1 = r5.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x06f1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r18.m74j()
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x06ff:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.f315a
            java.lang.String r1 = m75k(r1, r3)
            java.lang.String r1 = r5.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x070f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r18.m74j()
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x071d:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = r6.f315a
            java.lang.String r1 = m75k(r1, r3)
            java.lang.String r2 = "Argument name too long: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x072f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r6.f315a
            java.lang.String r1 = m75k(r1, r3)
            java.lang.String r1 = r5.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x073f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r18.m74j()
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x074d:
            r1 = 125(0x7d, float:1.75E-43)
            if (r7 <= 0) goto L_0x0758
            if (r0 == r1) goto L_0x0754
            goto L_0x0758
        L_0x0754:
            r0 = 125(0x7d, float:1.75E-43)
            r2 = 3
            goto L_0x0760
        L_0x0758:
            r2 = 3
            if (r8 != r2) goto L_0x0778
            r3 = 124(0x7c, float:1.74E-43)
            if (r0 != r3) goto L_0x0778
            r8 = 3
        L_0x0760:
            if (r8 != r2) goto L_0x0766
            if (r0 != r1) goto L_0x0766
            r4 = 0
            goto L_0x0767
        L_0x0766:
            r4 = 1
        L_0x0767:
            int r10 = r13 + -1
            r2 = 2
            r0 = r18
            r1 = r9
            r3 = r10
            r5 = r21
            r0.m81q(r1, r2, r3, r4, r5)
            r0 = 3
            if (r8 != r0) goto L_0x0777
            return r10
        L_0x0777:
            return r13
        L_0x0778:
            r11 = r13
        L_0x0779:
            r10 = 1
            goto L_0x001a
        L_0x077c:
            r0 = 3
            if (r7 <= 0) goto L_0x07a0
            r2 = 1
            if (r7 != r2) goto L_0x0792
            if (r8 != r0) goto L_0x0792
            java.util.ArrayList r0 = r6.f316b
            r3 = 0
            java.lang.Object r0 = r0.get(r3)
            android.a.c.c r0 = (android.p017a.p020c.C0110c) r0
            int r0 = r0.f312e
            if (r0 == r2) goto L_0x0792
            goto L_0x07a0
        L_0x0792:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r18.m74j()
            java.lang.String r1 = r1.concat(r2)
            r0.<init>(r1)
            throw r0
        L_0x07a0:
            r2 = 2
            r4 = 0
            r0 = r18
            r1 = r9
            r3 = r11
            r5 = r21
            r0.m81q(r1, r2, r3, r4, r5)
            return r11
        L_0x07ac:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            goto L_0x07b3
        L_0x07b2:
            throw r0
        L_0x07b3:
            goto L_0x07b2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.p017a.p020c.C0111d.m80p(int, int, int, int):int");
    }

    /* renamed from: q */
    private final void m81q(int i, int i2, int i3, int i4, int i5) {
        ((C0110c) this.f316b.get(i)).f311d = this.f316b.size();
        m82r(i2, i3, i4, i5);
    }

    /* renamed from: r */
    private final void m82r(int i, int i2, int i3, int i4) {
        this.f316b.add(new C0110c(i, i2, i3, i4));
    }

    /* renamed from: a */
    public final double mo74a(C0110c cVar) {
        int i = cVar.f312e;
        if (i == 13) {
            return (double) cVar.f310c;
        }
        if (i == 14) {
            return ((Double) this.f317c.get(cVar.f310c)).doubleValue();
        }
        return -1.23456789E8d;
    }

    /* renamed from: b */
    public final int mo75b(int i) {
        int i2 = ((C0110c) this.f316b.get(i)).f311d;
        return i2 < i ? i : i2;
    }

    /* renamed from: c */
    public final C0110c mo76c(int i) {
        return (C0110c) this.f316b.get(i);
    }

    public final Object clone() {
        return mo78d();
    }

    /* renamed from: d */
    public final C0111d mo78d() {
        try {
            C0111d dVar = (C0111d) super.clone();
            dVar.f316b = (ArrayList) this.f316b.clone();
            ArrayList arrayList = this.f317c;
            if (arrayList != null) {
                dVar.f317c = (ArrayList) arrayList.clone();
            }
            dVar.f320g = false;
            return dVar;
        } catch (CloneNotSupportedException e) {
            throw new C0112a(e);
        }
    }

    /* renamed from: e */
    public final String mo79e(C0110c cVar) {
        int i = cVar.f308a;
        return this.f315a.substring(i, cVar.f309b + i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        r2 = r4.f315a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r5 == 0) goto L_0x003b
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L_0x0012
            goto L_0x003b
        L_0x0012:
            android.a.c.d r5 = (android.p017a.p020c.C0111d) r5
            int r2 = r4.f319f
            int r3 = r5.f319f
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0038
            java.lang.String r2 = r4.f315a
            if (r2 != 0) goto L_0x0025
            java.lang.String r2 = r5.f315a
            if (r2 != 0) goto L_0x0038
            goto L_0x002d
        L_0x0025:
            java.lang.String r3 = r5.f315a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0038
        L_0x002d:
            java.util.ArrayList r2 = r4.f316b
            java.util.ArrayList r5 = r5.f316b
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x0038
            return r0
        L_0x0038:
            return r1
        L_0x0039:
            r5 = 0
            throw r5
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: android.p017a.p020c.C0111d.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo81f(C0110c cVar, String str) {
        return this.f315a.regionMatches(cVar.f308a, str, 0, cVar.f309b);
    }

    /* renamed from: g */
    public final int mo82g(int i) {
        return ((C0110c) this.f316b.get(i)).f312e;
    }

    /* renamed from: h */
    public final void mo83h(String str) {
        this.f315a = str;
        this.f318d = false;
        this.f316b.clear();
        ArrayList arrayList = this.f317c;
        if (arrayList != null) {
            arrayList.clear();
        }
        m80p(0, 0, 0, 1);
    }

    public final int hashCode() {
        int i = this.f319f;
        if (i != 0) {
            int i2 = i * 37;
            String str = this.f315a;
            return ((i2 + (str != null ? str.hashCode() : 0)) * 37) + this.f316b.hashCode();
        }
        throw null;
    }

    public final String toString() {
        return this.f315a;
    }

    public C0111d(String str) {
        this.f316b = new ArrayList();
        this.f319f = f314h;
        mo83h(str);
    }
}
