package com.google.protobuf;

import com.evernote.android.state.BuildConfig;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.PrivateKeyType;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.dv */
/* compiled from: PG */
final class C63003dv implements C63022en {

    /* renamed from: b */
    private static final int[] f170061b = new int[0];

    /* renamed from: c */
    private static final Unsafe f170062c = C63054fs.m95965d();

    /* renamed from: a */
    public final MessageLite f170063a;

    /* renamed from: d */
    private final int[] f170064d;

    /* renamed from: e */
    private final Object[] f170065e;

    /* renamed from: f */
    private final int f170066f;

    /* renamed from: g */
    private final int f170067g;

    /* renamed from: h */
    private final boolean f170068h;

    /* renamed from: i */
    private final boolean f170069i;

    /* renamed from: j */
    private final boolean f170070j;

    /* renamed from: k */
    private final boolean f170071k;

    /* renamed from: l */
    private final int[] f170072l;

    /* renamed from: m */
    private final int f170073m;

    /* renamed from: n */
    private final int f170074n;

    /* renamed from: o */
    private final C62986de f170075o;

    /* renamed from: p */
    private final C63044fi f170076p;

    /* renamed from: q */
    private final C62922bb f170077q;

    private C63003dv(int[] iArr, Object[] objArr, int i, int i2, MessageLite messageLite, boolean z, boolean z2, int[] iArr2, int i3, int i4, C62986de deVar, C63044fi fiVar, C62922bb bbVar) {
        this.f170064d = iArr;
        this.f170065e = objArr;
        this.f170066f = i;
        this.f170067g = i2;
        this.f170069i = messageLite instanceof C62942bv;
        this.f170070j = z;
        boolean z3 = false;
        if (bbVar != null && bbVar.mo58841i(messageLite)) {
            z3 = true;
        }
        this.f170068h = z3;
        this.f170071k = z2;
        this.f170072l = iArr2;
        this.f170073m = i3;
        this.f170074n = i4;
        this.f170075o = deVar;
        this.f170076p = fiVar;
        this.f170077q = bbVar;
        this.f170063a = messageLite;
    }

    /* renamed from: A */
    private static int m95615A(int i) {
        return (i >>> 20) & PrivateKeyType.INVALID;
    }

    /* renamed from: B */
    private final int m95616B(int i) {
        return this.f170064d[i + 1];
    }

    /* renamed from: C */
    private static long m95617C(Object obj, long j) {
        return ((Long) C63054fs.f170169a.mo59138p(obj, j)).longValue();
    }

    /* renamed from: D */
    private final C62959cf m95618D(int i) {
        int i2 = i / 3;
        return (C62959cf) this.f170065e[i2 + i2 + 1];
    }

    /* renamed from: E */
    private final C63022en m95619E(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        C63022en enVar = (C63022en) this.f170065e[i3];
        if (enVar != null) {
            return enVar;
        }
        C63022en a = C63013ee.f170090a.mo59017a((Class) this.f170065e[i3 + 1]);
        this.f170065e[i3] = a;
        return a;
    }

    /* renamed from: F */
    private final Object m95620F(Object obj, int i, Object obj2, C63044fi fiVar) {
        C62959cf D;
        int i2 = this.f170064d[i];
        Object p = C63054fs.f170169a.mo59138p(obj, (long) (m95616B(i) & 1048575));
        if (p == null || (D = m95618D(i)) == null) {
            return obj2;
        }
        C62993dl dlVar = ((C62994dm) m95621G(i)).f170056a;
        Iterator it = ((C62995dn) p).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!D.isInRange(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = fiVar.mo59091f();
                }
                int a = C62994dm.m95599a(dlVar, entry.getKey(), entry.getValue());
                C63088z zVar = C63088z.f170246b;
                byte[] bArr = new byte[a];
                C62906an Q = C62906an.m95324Q(bArr);
                try {
                    C62994dm.m95600b(Q, dlVar, entry.getKey(), entry.getValue());
                    fiVar.mo59096k(obj2, i2, C63084v.m96114a(Q, bArr));
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj2;
    }

    /* renamed from: G */
    private final Object m95621G(int i) {
        int i2 = i / 3;
        return this.f170065e[i2 + i2];
    }

    /* renamed from: H */
    private static Field m95622H(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: I */
    private final void m95623I(Object obj, Object obj2, int i) {
        long B = (long) (m95616B(i) & 1048575);
        if (m95630P(obj2, i)) {
            Object p = C63054fs.f170169a.mo59138p(obj, B);
            Object p2 = C63054fs.f170169a.mo59138p(obj2, B);
            if (p != null && p2 != null) {
                C63054fs.f170169a.mo59141s(obj, B, C62972cr.m95545e(p, p2));
                m95626L(obj, i);
            } else if (p2 != null) {
                C63054fs.f170169a.mo59141s(obj, B, p2);
                m95626L(obj, i);
            }
        }
    }

    /* renamed from: J */
    private final void m95624J(Object obj, Object obj2, int i) {
        int B = m95616B(i);
        int i2 = this.f170064d[i];
        long j = (long) (B & 1048575);
        if (m95633S(obj2, i2, i)) {
            Object p = m95633S(obj, i2, i) ? C63054fs.f170169a.mo59138p(obj, j) : null;
            Object p2 = C63054fs.f170169a.mo59138p(obj2, j);
            if (p != null && p2 != null) {
                C63054fs.f170169a.mo59141s(obj, j, C62972cr.m95545e(p, p2));
                m95627M(obj, i2, i);
            } else if (p2 != null) {
                C63054fs.f170169a.mo59141s(obj, j, p2);
                m95627M(obj, i2, i);
            }
        }
    }

    /* renamed from: K */
    private final void m95625K(Object obj, int i, C63016eh ehVar) {
        if (m95629O(i)) {
            C63054fs.f170169a.mo59141s(obj, (long) (i & 1048575), ehVar.mo58750x());
        } else if (this.f170069i) {
            C63054fs.f170169a.mo59141s(obj, (long) (i & 1048575), ehVar.mo58748v());
        } else {
            C63054fs.f170169a.mo59141s(obj, (long) (i & 1048575), ehVar.mo58743q());
        }
    }

    /* renamed from: L */
    private final void m95626L(Object obj, int i) {
        int y = m95653y(i);
        long j = (long) (1048575 & y);
        if (j != 1048575) {
            C63054fs.f170169a.mo59139q(obj, j, (1 << (y >>> 20)) | C63054fs.f170169a.mo59135m(obj, j));
        }
    }

    /* renamed from: M */
    private final void m95627M(Object obj, int i, int i2) {
        C63054fs.f170169a.mo59139q(obj, (long) (m95653y(i2) & 1048575), i);
    }

    /* renamed from: N */
    private final boolean m95628N(Object obj, Object obj2, int i) {
        return m95630P(obj, i) == m95630P(obj2, i);
    }

    /* renamed from: O */
    private static boolean m95629O(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: P */
    private final boolean m95630P(Object obj, int i) {
        int y = m95653y(i);
        long j = (long) (y & 1048575);
        if (j != 1048575) {
            return (C63054fs.f170169a.mo59135m(obj, j) & (1 << (y >>> 20))) != 0;
        }
        int B = m95616B(i);
        long j2 = (long) (B & 1048575);
        switch (m95615A(B)) {
            case 0:
                return Double.doubleToRawLongBits(C63054fs.f170169a.mo59124b(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(C63054fs.f170169a.mo59125c(obj, j2)) != 0;
            case 2:
                return C63054fs.f170169a.mo59136n(obj, j2) != 0;
            case 3:
                return C63054fs.f170169a.mo59136n(obj, j2) != 0;
            case 4:
                return C63054fs.f170169a.mo59135m(obj, j2) != 0;
            case 5:
                return C63054fs.f170169a.mo59136n(obj, j2) != 0;
            case 6:
                return C63054fs.f170169a.mo59135m(obj, j2) != 0;
            case 7:
                return C63054fs.f170169a.mo59133k(obj, j2);
            case 8:
                Object p = C63054fs.f170169a.mo59138p(obj, j2);
                if (p instanceof String) {
                    return !((String) p).isEmpty();
                }
                if (p instanceof C63088z) {
                    return !C63088z.f170246b.equals(p);
                }
                throw new IllegalArgumentException();
            case 9:
                return C63054fs.f170169a.mo59138p(obj, j2) != null;
            case 10:
                return !C63088z.f170246b.equals(C63054fs.f170169a.mo59138p(obj, j2));
            case 11:
                return C63054fs.f170169a.mo59135m(obj, j2) != 0;
            case 12:
                return C63054fs.f170169a.mo59135m(obj, j2) != 0;
            case 13:
                return C63054fs.f170169a.mo59135m(obj, j2) != 0;
            case 14:
                return C63054fs.f170169a.mo59136n(obj, j2) != 0;
            case 15:
                return C63054fs.f170169a.mo59135m(obj, j2) != 0;
            case 16:
                return C63054fs.f170169a.mo59136n(obj, j2) != 0;
            case 17:
                return C63054fs.f170169a.mo59138p(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* renamed from: Q */
    private final boolean m95631Q(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m95630P(obj, i);
        }
        return (i3 & i4) != 0;
    }

    /* renamed from: R */
    private static boolean m95632R(Object obj, int i, C63022en enVar) {
        return enVar.mo59001k(C63054fs.f170169a.mo59138p(obj, (long) (i & 1048575)));
    }

    /* renamed from: S */
    private final boolean m95633S(Object obj, int i, int i2) {
        return C63054fs.f170169a.mo59135m(obj, (long) (m95653y(i2) & 1048575)) == i;
    }

    /* renamed from: T */
    private static boolean m95634T(Object obj, long j) {
        return ((Boolean) C63054fs.f170169a.mo59138p(obj, j)).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return r2 + 4;
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final int m95635U(byte[] r1, int r2, int r3, com.google.protobuf.C63066gd r4, java.lang.Class r5, com.google.protobuf.C63071i r6) {
        /*
            com.google.protobuf.gd r0 = com.google.protobuf.C63066gd.DOUBLE
            int r4 = r4.ordinal()
            switch(r4) {
                case 0: goto L_0x00a3;
                case 1: goto L_0x0092;
                case 2: goto L_0x0085;
                case 3: goto L_0x0085;
                case 4: goto L_0x0078;
                case 5: goto L_0x006d;
                case 6: goto L_0x0062;
                case 7: goto L_0x004c;
                case 8: goto L_0x0047;
                case 9: goto L_0x0009;
                case 10: goto L_0x003b;
                case 11: goto L_0x0035;
                case 12: goto L_0x0078;
                case 13: goto L_0x0078;
                case 14: goto L_0x0062;
                case 15: goto L_0x006d;
                case 16: goto L_0x0023;
                case 17: goto L_0x0011;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported field type."
            r1.<init>(r2)
            throw r1
        L_0x0011:
            int r1 = com.google.protobuf.C63072j.m96032u(r1, r2, r6)
            long r2 = r6.f170220b
            long r2 = com.google.protobuf.C62897ae.m95109K(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.f170221c = r2
            goto L_0x00b3
        L_0x0023:
            int r1 = com.google.protobuf.C63072j.m96029r(r1, r2, r6)
            int r2 = r6.f170219a
            int r2 = com.google.protobuf.C62897ae.m95107I(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.f170221c = r2
            goto L_0x00b3
        L_0x0035:
            int r1 = com.google.protobuf.C63072j.m96012a(r1, r2, r6)
            goto L_0x00b3
        L_0x003b:
            com.google.protobuf.ee r4 = com.google.protobuf.C63013ee.f170090a
            com.google.protobuf.en r4 = r4.mo59017a(r5)
            int r1 = com.google.protobuf.C63072j.m96015d(r4, r1, r2, r3, r6)
            goto L_0x00b3
        L_0x0047:
            int r1 = com.google.protobuf.C63072j.m96027p(r1, r2, r6)
            goto L_0x00b3
        L_0x004c:
            int r1 = com.google.protobuf.C63072j.m96032u(r1, r2, r6)
            long r2 = r6.f170220b
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x005a
            r2 = 1
            goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r6.f170221c = r2
            goto L_0x00b3
        L_0x0062:
            int r1 = com.google.protobuf.C63072j.m96013b(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.f170221c = r1
            goto L_0x00a0
        L_0x006d:
            long r3 = com.google.protobuf.C63072j.m96034w(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.f170221c = r1
            goto L_0x00b1
        L_0x0078:
            int r1 = com.google.protobuf.C63072j.m96029r(r1, r2, r6)
            int r2 = r6.f170219a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.f170221c = r2
            goto L_0x00b3
        L_0x0085:
            int r1 = com.google.protobuf.C63072j.m96032u(r1, r2, r6)
            long r2 = r6.f170220b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.f170221c = r2
            goto L_0x00b3
        L_0x0092:
            int r1 = com.google.protobuf.C63072j.m96013b(r1, r2)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6.f170221c = r1
        L_0x00a0:
            int r1 = r2 + 4
            goto L_0x00b3
        L_0x00a3:
            long r3 = com.google.protobuf.C63072j.m96034w(r1, r2)
            double r3 = java.lang.Double.longBitsToDouble(r3)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
            r6.f170221c = r1
        L_0x00b1:
            int r1 = r2 + 8
        L_0x00b3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C63003dv.m95635U(byte[], int, int, com.google.protobuf.gd, java.lang.Class, com.google.protobuf.i):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02db, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x030b, code lost:
        if (r0 != r14) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x032d, code lost:
        if (r0 != r14) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0101, code lost:
        r6 = r6 | r22;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ab, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e4, code lost:
        r6 = r6 | r22;
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0226, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0228, code lost:
        r6 = r6 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x022b, code lost:
        r2 = r8;
        r28 = r9;
        r24 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02c0, code lost:
        if (r0 != r32) goto L_0x02c2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: V */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m95636V(java.lang.Object r30, byte[] r31, int r32, int r33, com.google.protobuf.C63071i r34) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            sun.misc.Unsafe r9 = f170062c
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r16 = 0
            r8 = -1
            r0 = r32
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x0356
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.protobuf.C63072j.m96030s(r0, r12, r3, r11)
            int r3 = r11.f170219a
            r4 = r0
            r17 = r3
            goto L_0x002f
        L_0x002c:
            r17 = r0
            r4 = r3
        L_0x002f:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003c
            int r2 = r2 / 3
            int r0 = r15.m95652x(r5, r2)
            goto L_0x0040
        L_0x003c:
            int r0 = r15.m95651w(r5)
        L_0x0040:
            r2 = r0
            if (r2 != r8) goto L_0x004e
            r2 = r4
            r21 = r5
            r28 = r9
            r18 = -1
            r24 = 0
            goto L_0x0330
        L_0x004e:
            int[] r0 = r15.f170064d
            int r1 = r2 + 1
            r1 = r0[r1]
            int r8 = m95615A(r1)
            r32 = r5
            r5 = r1 & r10
            long r10 = (long) r5
            r5 = 17
            r20 = r10
            if (r8 > r5) goto L_0x0234
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r11 = 1
            int r22 = r11 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            if (r0 == r7) goto L_0x0080
            if (r7 == r5) goto L_0x0078
            long r10 = (long) r7
            r9.putInt(r14, r10, r6)
        L_0x0078:
            if (r0 == r5) goto L_0x007f
            long r6 = (long) r0
            int r6 = r9.getInt(r14, r6)
        L_0x007f:
            r7 = r0
        L_0x0080:
            r0 = 5
            switch(r8) {
                case 0: goto L_0x0206;
                case 1: goto L_0x01e9;
                case 2: goto L_0x01c6;
                case 3: goto L_0x01c6;
                case 4: goto L_0x01ae;
                case 5: goto L_0x018e;
                case 6: goto L_0x0177;
                case 7: goto L_0x0155;
                case 8: goto L_0x0131;
                case 9: goto L_0x0106;
                case 10: goto L_0x00eb;
                case 11: goto L_0x01ae;
                case 12: goto L_0x00d5;
                case 13: goto L_0x0177;
                case 14: goto L_0x018e;
                case 15: goto L_0x00bb;
                case 16: goto L_0x008f;
                default: goto L_0x0084;
            }
        L_0x0084:
            r21 = r32
            r11 = r34
            r10 = r2
            r8 = r4
            r24 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x022b
        L_0x008f:
            if (r3 != 0) goto L_0x00b1
            r11 = r34
            r0 = r20
            int r8 = com.google.protobuf.C63072j.m96032u(r12, r4, r11)
            long r3 = r11.f170220b
            long r19 = com.google.protobuf.C62897ae.m95109K(r3)
            r3 = r0
            r0 = r9
            r1 = r30
            r10 = r2
            r2 = r3
            r21 = r32
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r19
            r0.putLong(r1, r2, r4)
            goto L_0x01e4
        L_0x00b1:
            r21 = r32
            r11 = r34
            r10 = r2
            r24 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x01ab
        L_0x00bb:
            r11 = r34
            r10 = r2
            r0 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r32
            if (r3 != 0) goto L_0x01ab
            int r2 = com.google.protobuf.C63072j.m96029r(r12, r4, r11)
            int r3 = r11.f170219a
            int r3 = com.google.protobuf.C62897ae.m95107I(r3)
            r9.putInt(r14, r0, r3)
            goto L_0x0101
        L_0x00d5:
            r11 = r34
            r10 = r2
            r0 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r32
            if (r3 != 0) goto L_0x01ab
            int r2 = com.google.protobuf.C63072j.m96029r(r12, r4, r11)
            int r3 = r11.f170219a
            r9.putInt(r14, r0, r3)
            goto L_0x0101
        L_0x00eb:
            r11 = r34
            r10 = r2
            r0 = r20
            r2 = 2
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r32
            if (r3 != r2) goto L_0x01ab
            int r2 = com.google.protobuf.C63072j.m96012a(r12, r4, r11)
            java.lang.Object r3 = r11.f170221c
            r9.putObject(r14, r0, r3)
        L_0x0101:
            r6 = r6 | r22
            r0 = r2
            goto L_0x0277
        L_0x0106:
            r11 = r34
            r10 = r2
            r0 = r20
            r2 = 2
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r32
            if (r3 != r2) goto L_0x01ab
            com.google.protobuf.en r2 = r15.m95619E(r10)
            int r2 = com.google.protobuf.C63072j.m96015d(r2, r12, r4, r13, r11)
            java.lang.Object r3 = r9.getObject(r14, r0)
            if (r3 != 0) goto L_0x0127
            java.lang.Object r3 = r11.f170221c
            r9.putObject(r14, r0, r3)
            goto L_0x0101
        L_0x0127:
            java.lang.Object r4 = r11.f170221c
            java.lang.Object r3 = com.google.protobuf.C62972cr.m95545e(r3, r4)
            r9.putObject(r14, r0, r3)
            goto L_0x0101
        L_0x0131:
            r11 = r34
            r10 = r2
            r25 = r20
            r0 = 2
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r32
            if (r3 != r0) goto L_0x01ab
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0148
            int r0 = com.google.protobuf.C63072j.m96026o(r12, r4, r11)
            goto L_0x014c
        L_0x0148:
            int r0 = com.google.protobuf.C63072j.m96027p(r12, r4, r11)
        L_0x014c:
            java.lang.Object r1 = r11.f170221c
            r2 = r25
            r9.putObject(r14, r2, r1)
            goto L_0x0228
        L_0x0155:
            r11 = r34
            r10 = r2
            r1 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r32
            if (r3 != 0) goto L_0x01ab
            int r0 = com.google.protobuf.C63072j.m96032u(r12, r4, r11)
            long r3 = r11.f170220b
            r19 = 0
            int r5 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r5 == 0) goto L_0x016f
            r3 = 1
            goto L_0x0170
        L_0x016f:
            r3 = 0
        L_0x0170:
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            r4.mo59128f(r14, r1, r3)
            goto L_0x0228
        L_0x0177:
            r11 = r34
            r10 = r2
            r1 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r32
            if (r3 != r0) goto L_0x01ab
            int r0 = com.google.protobuf.C63072j.m96013b(r12, r4)
            r9.putInt(r14, r1, r0)
            int r0 = r4 + 4
            goto L_0x0228
        L_0x018e:
            r11 = r34
            r10 = r2
            r1 = r20
            r0 = 1
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r32
            if (r3 != r0) goto L_0x01ab
            long r19 = com.google.protobuf.C63072j.m96034w(r12, r4)
            r0 = r9
            r2 = r1
            r1 = r30
            r8 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            goto L_0x0226
        L_0x01ab:
            r8 = r4
            goto L_0x022b
        L_0x01ae:
            r11 = r34
            r10 = r2
            r8 = r4
            r4 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r32
            if (r3 != 0) goto L_0x022b
            int r0 = com.google.protobuf.C63072j.m96029r(r12, r8, r11)
            int r1 = r11.f170219a
            r9.putInt(r14, r4, r1)
            goto L_0x0228
        L_0x01c6:
            r11 = r34
            r10 = r2
            r8 = r4
            r4 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r32
            if (r3 != 0) goto L_0x022b
            int r8 = com.google.protobuf.C63072j.m96032u(r12, r8, r11)
            long r2 = r11.f170220b
            r0 = r9
            r1 = r30
            r19 = r2
            r2 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
        L_0x01e4:
            r6 = r6 | r22
            r0 = r8
            goto L_0x0277
        L_0x01e9:
            r11 = r34
            r10 = r2
            r8 = r4
            r4 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r32
            if (r3 != r0) goto L_0x022b
            int r0 = com.google.protobuf.C63072j.m96013b(r12, r8)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            r1.mo59132j(r14, r4, r0)
            int r0 = r8 + 4
            goto L_0x0228
        L_0x0206:
            r11 = r34
            r10 = r2
            r8 = r4
            r4 = r20
            r0 = 1
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r32
            if (r3 != r0) goto L_0x022b
            long r0 = com.google.protobuf.C63072j.m96034w(r12, r8)
            double r19 = java.lang.Double.longBitsToDouble(r0)
            com.google.protobuf.fr r0 = com.google.protobuf.C63054fs.f170169a
            r1 = r30
            r2 = r4
            r4 = r19
            r0.mo59131i(r1, r2, r4)
        L_0x0226:
            int r0 = r8 + 8
        L_0x0228:
            r6 = r6 | r22
            goto L_0x0277
        L_0x022b:
            r2 = r8
            r28 = r9
            r24 = r10
            r18 = -1
            goto L_0x0330
        L_0x0234:
            r11 = r34
            r10 = r2
            r2 = r4
            r4 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r32
            r0 = 27
            if (r8 != r0) goto L_0x0288
            r0 = 2
            if (r3 != r0) goto L_0x027c
            java.lang.Object r0 = r9.getObject(r14, r4)
            com.google.protobuf.cq r0 = (com.google.protobuf.C62971cq) r0
            boolean r1 = r0.mo58948c()
            if (r1 != 0) goto L_0x0263
            int r1 = r0.size()
            if (r1 != 0) goto L_0x025b
            r1 = 10
            goto L_0x025c
        L_0x025b:
            int r1 = r1 + r1
        L_0x025c:
            com.google.protobuf.cq r0 = r0.mo58798e(r1)
            r9.putObject(r14, r4, r0)
        L_0x0263:
            r5 = r0
            com.google.protobuf.en r0 = r15.m95619E(r10)
            r1 = r17
            r3 = r2
            r2 = r31
            r4 = r33
            r8 = r6
            r6 = r34
            int r0 = com.google.protobuf.C63072j.m96016e(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
        L_0x0277:
            r2 = r10
            r1 = r21
            goto L_0x0350
        L_0x027c:
            r14 = r2
            r23 = r6
            r15 = r7
            r28 = r9
            r24 = r10
            r18 = -1
            goto L_0x030e
        L_0x0288:
            r0 = 49
            if (r8 > r0) goto L_0x02dd
            long r0 = (long) r1
            r19 = r0
            r0 = r29
            r1 = r30
            r32 = r2
            r2 = r31
            r22 = r3
            r3 = r32
            r25 = r4
            r4 = r33
            r5 = r17
            r15 = r6
            r6 = r21
            r23 = r15
            r15 = r7
            r7 = r22
            r27 = r8
            r18 = -1
            r8 = r10
            r28 = r9
            r24 = r10
            r9 = r19
            r11 = r27
            r12 = r25
            r14 = r34
            int r0 = r0.m95650v(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r32
            if (r0 == r14) goto L_0x02db
        L_0x02c2:
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r7 = r15
            r1 = r21
            r6 = r23
            r2 = r24
            r9 = r28
            r8 = -1
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r15 = r29
            goto L_0x001a
        L_0x02db:
            r2 = r0
            goto L_0x030f
        L_0x02dd:
            r14 = r2
            r22 = r3
            r25 = r4
            r23 = r6
            r15 = r7
            r27 = r8
            r28 = r9
            r24 = r10
            r18 = -1
            r0 = 50
            r9 = r27
            if (r9 != r0) goto L_0x0313
            r7 = r22
            r0 = 2
            if (r7 != r0) goto L_0x030e
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r14
            r4 = r33
            r5 = r24
            r6 = r25
            r8 = r34
            int r0 = r0.m95648t(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r14) goto L_0x02db
            goto L_0x02c2
        L_0x030e:
            r2 = r14
        L_0x030f:
            r7 = r15
            r6 = r23
            goto L_0x0330
        L_0x0313:
            r7 = r22
            r0 = r29
            r8 = r1
            r1 = r30
            r2 = r31
            r3 = r14
            r4 = r33
            r5 = r17
            r6 = r21
            r10 = r25
            r12 = r24
            r13 = r34
            int r0 = r0.m95649u(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x02db
            goto L_0x02c2
        L_0x0330:
            com.google.protobuf.fj r4 = m95640d(r30)
            r0 = r17
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = com.google.protobuf.C63072j.m96028q(r0, r1, r2, r3, r4, r5)
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r1 = r21
            r2 = r24
            r9 = r28
        L_0x0350:
            r8 = -1
            r10 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x001a
        L_0x0356:
            r23 = r6
            r15 = r7
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r15 == r1) goto L_0x036a
            long r1 = (long) r15
            r3 = r30
            r6 = r23
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x036a:
            r1 = r33
            if (r0 != r1) goto L_0x036f
            return
        L_0x036f:
            com.google.protobuf.ct r0 = com.google.protobuf.C62974ct.m95556f()
            goto L_0x0375
        L_0x0374:
            throw r0
        L_0x0375:
            goto L_0x0374
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C63003dv.m95636V(java.lang.Object, byte[], int, int, com.google.protobuf.i):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04fc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m95637W(java.lang.Object r20, com.google.protobuf.C62907ao r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r0.f170068h
            if (r3 == 0) goto L_0x0023
            com.google.protobuf.bb r3 = r0.f170077q
            com.google.protobuf.bf r3 = r3.mo58834b(r1)
            com.google.protobuf.ew r5 = r3.f169888b
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.mo58847e()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0025
        L_0x0023:
            r3 = 0
            r5 = 0
        L_0x0025:
            int[] r6 = r0.f170064d
            int r6 = r6.length
            sun.misc.Unsafe r7 = f170062c
            r10 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x002f:
            if (r10 >= r6) goto L_0x04fa
            int r13 = r0.m95616B(r10)
            int[] r14 = r0.f170064d
            r15 = r14[r10]
            int r4 = m95615A(r13)
            r9 = 17
            if (r4 > r9) goto L_0x0058
            int r9 = r10 + 2
            r9 = r14[r9]
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r9 & r14
            if (r8 == r11) goto L_0x0052
            long r11 = (long) r8
            int r12 = r7.getInt(r1, r11)
            r11 = r8
        L_0x0052:
            int r8 = r9 >>> 20
            r9 = 1
            int r8 = r9 << r8
            goto L_0x0059
        L_0x0058:
            r8 = 0
        L_0x0059:
            if (r5 == 0) goto L_0x0077
            com.google.protobuf.bb r9 = r0.f170077q
            int r9 = r9.mo58833a(r5)
            if (r9 > r15) goto L_0x0077
            com.google.protobuf.bb r9 = r0.f170077q
            r9.mo58842j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0075
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0059
        L_0x0075:
            r5 = 0
            goto L_0x0059
        L_0x0077:
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r13 & r9
            long r13 = (long) r13
            r16 = 63
            switch(r4) {
                case 0: goto L_0x04e3;
                case 1: goto L_0x04cf;
                case 2: goto L_0x04c1;
                case 3: goto L_0x04b3;
                case 4: goto L_0x04a5;
                case 5: goto L_0x0497;
                case 6: goto L_0x0489;
                case 7: goto L_0x0478;
                case 8: goto L_0x046b;
                case 9: goto L_0x045a;
                case 10: goto L_0x0449;
                case 11: goto L_0x043a;
                case 12: goto L_0x042b;
                case 13: goto L_0x041c;
                case 14: goto L_0x040d;
                case 15: goto L_0x03f9;
                case 16: goto L_0x03e4;
                case 17: goto L_0x03d3;
                case 18: goto L_0x03c3;
                case 19: goto L_0x03b3;
                case 20: goto L_0x03a3;
                case 21: goto L_0x0393;
                case 22: goto L_0x0383;
                case 23: goto L_0x0373;
                case 24: goto L_0x0363;
                case 25: goto L_0x0353;
                case 26: goto L_0x0344;
                case 27: goto L_0x0331;
                case 28: goto L_0x0322;
                case 29: goto L_0x0312;
                case 30: goto L_0x0302;
                case 31: goto L_0x02f2;
                case 32: goto L_0x02e2;
                case 33: goto L_0x02d2;
                case 34: goto L_0x02c2;
                case 35: goto L_0x02b2;
                case 36: goto L_0x02a2;
                case 37: goto L_0x0292;
                case 38: goto L_0x0282;
                case 39: goto L_0x0272;
                case 40: goto L_0x0262;
                case 41: goto L_0x0252;
                case 42: goto L_0x0242;
                case 43: goto L_0x0232;
                case 44: goto L_0x0222;
                case 45: goto L_0x0212;
                case 46: goto L_0x0202;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01e2;
                case 49: goto L_0x01cf;
                case 50: goto L_0x01c6;
                case 51: goto L_0x01b1;
                case 52: goto L_0x019c;
                case 53: goto L_0x018b;
                case 54: goto L_0x017a;
                case 55: goto L_0x0169;
                case 56: goto L_0x0158;
                case 57: goto L_0x0147;
                case 58: goto L_0x0136;
                case 59: goto L_0x0127;
                case 60: goto L_0x0114;
                case 61: goto L_0x0101;
                case 62: goto L_0x00f1;
                case 63: goto L_0x00e1;
                case 64: goto L_0x00d1;
                case 65: goto L_0x00c1;
                case 66: goto L_0x00ac;
                case 67: goto L_0x0096;
                case 68: goto L_0x0084;
                default: goto L_0x0081;
            }
        L_0x0081:
            r4 = 0
            goto L_0x04f6
        L_0x0084:
            boolean r4 = r0.m95633S(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.protobuf.en r8 = r0.m95619E(r10)
            r2.mo58790a(r15, r4, r8)
            goto L_0x0081
        L_0x0096:
            boolean r4 = r0.m95633S(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = m95617C(r1, r13)
            com.google.protobuf.an r4 = r2.f169854a
            long r17 = r13 + r13
            long r13 = r13 >> r16
            long r13 = r17 ^ r13
            r4.mo58781x(r15, r13)
            goto L_0x0081
        L_0x00ac:
            boolean r4 = r0.m95633S(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = m95647s(r1, r13)
            com.google.protobuf.an r8 = r2.f169854a
            int r13 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r13
            r8.mo58779v(r15, r4)
            goto L_0x0081
        L_0x00c1:
            boolean r4 = r0.m95633S(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = m95617C(r1, r13)
            com.google.protobuf.an r4 = r2.f169854a
            r4.mo58768k(r15, r13)
            goto L_0x0081
        L_0x00d1:
            boolean r4 = r0.m95633S(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = m95647s(r1, r13)
            com.google.protobuf.an r8 = r2.f169854a
            r8.mo58766i(r15, r4)
            goto L_0x0081
        L_0x00e1:
            boolean r4 = r0.m95633S(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = m95647s(r1, r13)
            com.google.protobuf.an r8 = r2.f169854a
            r8.mo58770m(r15, r4)
            goto L_0x0081
        L_0x00f1:
            boolean r4 = r0.m95633S(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = m95647s(r1, r13)
            com.google.protobuf.an r8 = r2.f169854a
            r8.mo58779v(r15, r4)
            goto L_0x0081
        L_0x0101:
            boolean r4 = r0.m95633S(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.protobuf.z r4 = (com.google.protobuf.C63088z) r4
            com.google.protobuf.an r8 = r2.f169854a
            r8.mo58763aa(r15, r4)
            goto L_0x0081
        L_0x0114:
            boolean r4 = r0.m95633S(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.protobuf.en r8 = r0.m95619E(r10)
            r2.mo58791b(r15, r4, r8)
            goto L_0x0081
        L_0x0127:
            boolean r4 = r0.m95633S(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r13)
            m95639Y(r15, r4, r2)
            goto L_0x0081
        L_0x0136:
            boolean r4 = r0.m95633S(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            boolean r4 = m95634T(r1, r13)
            com.google.protobuf.an r8 = r2.f169854a
            r8.mo58761Z(r15, r4)
            goto L_0x0081
        L_0x0147:
            boolean r4 = r0.m95633S(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = m95647s(r1, r13)
            com.google.protobuf.an r8 = r2.f169854a
            r8.mo58766i(r15, r4)
            goto L_0x0081
        L_0x0158:
            boolean r4 = r0.m95633S(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = m95617C(r1, r13)
            com.google.protobuf.an r4 = r2.f169854a
            r4.mo58768k(r15, r13)
            goto L_0x0081
        L_0x0169:
            boolean r4 = r0.m95633S(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = m95647s(r1, r13)
            com.google.protobuf.an r8 = r2.f169854a
            r8.mo58770m(r15, r4)
            goto L_0x0081
        L_0x017a:
            boolean r4 = r0.m95633S(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = m95617C(r1, r13)
            com.google.protobuf.an r4 = r2.f169854a
            r4.mo58781x(r15, r13)
            goto L_0x0081
        L_0x018b:
            boolean r4 = r0.m95633S(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = m95617C(r1, r13)
            com.google.protobuf.an r4 = r2.f169854a
            r4.mo58781x(r15, r13)
            goto L_0x0081
        L_0x019c:
            boolean r4 = r0.m95633S(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            float r4 = m95644p(r1, r13)
            com.google.protobuf.an r8 = r2.f169854a
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            r8.mo58766i(r15, r4)
            goto L_0x0081
        L_0x01b1:
            boolean r4 = r0.m95633S(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            double r13 = m95643o(r1, r13)
            com.google.protobuf.an r4 = r2.f169854a
            long r13 = java.lang.Double.doubleToRawLongBits(r13)
            r4.mo58768k(r15, r13)
            goto L_0x0081
        L_0x01c6:
            java.lang.Object r4 = r7.getObject(r1, r13)
            r0.m95638X(r2, r15, r4, r10)
            goto L_0x0081
        L_0x01cf:
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.en r13 = r0.m95619E(r10)
            com.google.protobuf.C63023eo.m95810N(r4, r8, r2, r13)
            goto L_0x0081
        L_0x01e2:
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 1
            com.google.protobuf.C63023eo.m95817U(r4, r8, r2, r15)
            goto L_0x0081
        L_0x01f2:
            r15 = 1
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95816T(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0202:
            r15 = 1
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95815S(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0212:
            r15 = 1
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95814R(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0222:
            r15 = 1
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95806J(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0232:
            r15 = 1
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95819W(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0242:
            r15 = 1
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95803G(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0252:
            r15 = 1
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95807K(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0262:
            r15 = 1
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95808L(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0272:
            r15 = 1
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95811O(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0282:
            r15 = 1
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95820X(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0292:
            r15 = 1
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95812P(r4, r8, r2, r15)
            goto L_0x0081
        L_0x02a2:
            r15 = 1
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95809M(r4, r8, r2, r15)
            goto L_0x0081
        L_0x02b2:
            r15 = 1
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95805I(r4, r8, r2, r15)
            goto L_0x0081
        L_0x02c2:
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.protobuf.C63023eo.m95817U(r4, r8, r2, r15)
            goto L_0x0081
        L_0x02d2:
            r15 = 0
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95816T(r4, r8, r2, r15)
            goto L_0x0081
        L_0x02e2:
            r15 = 0
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95815S(r4, r8, r2, r15)
            goto L_0x0081
        L_0x02f2:
            r15 = 0
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95814R(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0302:
            r15 = 0
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95806J(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0312:
            r15 = 0
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95819W(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0322:
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95804H(r4, r8, r2)
            goto L_0x0081
        L_0x0331:
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.en r13 = r0.m95619E(r10)
            com.google.protobuf.C63023eo.m95813Q(r4, r8, r2, r13)
            goto L_0x0081
        L_0x0344:
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95818V(r4, r8, r2)
            goto L_0x0081
        L_0x0353:
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.protobuf.C63023eo.m95803G(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0363:
            r15 = 0
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95807K(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0373:
            r15 = 0
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95808L(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0383:
            r15 = 0
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95811O(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0393:
            r15 = 0
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95820X(r4, r8, r2, r15)
            goto L_0x0081
        L_0x03a3:
            r15 = 0
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95812P(r4, r8, r2, r15)
            goto L_0x0081
        L_0x03b3:
            r15 = 0
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95809M(r4, r8, r2, r15)
            goto L_0x0081
        L_0x03c3:
            r15 = 0
            int[] r4 = r0.f170064d
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C63023eo.m95805I(r4, r8, r2, r15)
            goto L_0x0081
        L_0x03d3:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x04f6
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.protobuf.en r13 = r0.m95619E(r10)
            r2.mo58790a(r15, r8, r13)
            goto L_0x04f6
        L_0x03e4:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x04f6
            long r13 = r7.getLong(r1, r13)
            com.google.protobuf.an r8 = r2.f169854a
            long r17 = r13 + r13
            long r13 = r13 >> r16
            long r13 = r17 ^ r13
            r8.mo58781x(r15, r13)
            goto L_0x04f6
        L_0x03f9:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x04f6
            int r8 = r7.getInt(r1, r13)
            com.google.protobuf.an r13 = r2.f169854a
            int r14 = r8 + r8
            int r8 = r8 >> 31
            r8 = r8 ^ r14
            r13.mo58779v(r15, r8)
            goto L_0x04f6
        L_0x040d:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x04f6
            long r13 = r7.getLong(r1, r13)
            com.google.protobuf.an r8 = r2.f169854a
            r8.mo58768k(r15, r13)
            goto L_0x04f6
        L_0x041c:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x04f6
            int r8 = r7.getInt(r1, r13)
            com.google.protobuf.an r13 = r2.f169854a
            r13.mo58766i(r15, r8)
            goto L_0x04f6
        L_0x042b:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x04f6
            int r8 = r7.getInt(r1, r13)
            com.google.protobuf.an r13 = r2.f169854a
            r13.mo58770m(r15, r8)
            goto L_0x04f6
        L_0x043a:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x04f6
            int r8 = r7.getInt(r1, r13)
            com.google.protobuf.an r13 = r2.f169854a
            r13.mo58779v(r15, r8)
            goto L_0x04f6
        L_0x0449:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x04f6
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.protobuf.z r8 = (com.google.protobuf.C63088z) r8
            com.google.protobuf.an r13 = r2.f169854a
            r13.mo58763aa(r15, r8)
            goto L_0x04f6
        L_0x045a:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x04f6
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.protobuf.en r13 = r0.m95619E(r10)
            r2.mo58791b(r15, r8, r13)
            goto L_0x04f6
        L_0x046b:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x04f6
            java.lang.Object r8 = r7.getObject(r1, r13)
            m95639Y(r15, r8, r2)
            goto L_0x04f6
        L_0x0478:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x04f6
            com.google.protobuf.fr r8 = com.google.protobuf.C63054fs.f170169a
            boolean r8 = r8.mo59133k(r1, r13)
            com.google.protobuf.an r13 = r2.f169854a
            r13.mo58761Z(r15, r8)
            goto L_0x04f6
        L_0x0489:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x04f6
            int r8 = r7.getInt(r1, r13)
            com.google.protobuf.an r13 = r2.f169854a
            r13.mo58766i(r15, r8)
            goto L_0x04f6
        L_0x0497:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x04f6
            long r13 = r7.getLong(r1, r13)
            com.google.protobuf.an r8 = r2.f169854a
            r8.mo58768k(r15, r13)
            goto L_0x04f6
        L_0x04a5:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x04f6
            int r8 = r7.getInt(r1, r13)
            com.google.protobuf.an r13 = r2.f169854a
            r13.mo58770m(r15, r8)
            goto L_0x04f6
        L_0x04b3:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x04f6
            long r13 = r7.getLong(r1, r13)
            com.google.protobuf.an r8 = r2.f169854a
            r8.mo58781x(r15, r13)
            goto L_0x04f6
        L_0x04c1:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x04f6
            long r13 = r7.getLong(r1, r13)
            com.google.protobuf.an r8 = r2.f169854a
            r8.mo58781x(r15, r13)
            goto L_0x04f6
        L_0x04cf:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x04f6
            com.google.protobuf.fr r8 = com.google.protobuf.C63054fs.f170169a
            float r8 = r8.mo59125c(r1, r13)
            com.google.protobuf.an r13 = r2.f169854a
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            r13.mo58766i(r15, r8)
            goto L_0x04f6
        L_0x04e3:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x04f6
            com.google.protobuf.fr r8 = com.google.protobuf.C63054fs.f170169a
            double r13 = r8.mo59124b(r1, r13)
            com.google.protobuf.an r8 = r2.f169854a
            long r13 = java.lang.Double.doubleToRawLongBits(r13)
            r8.mo58768k(r15, r13)
        L_0x04f6:
            int r10 = r10 + 3
            goto L_0x002f
        L_0x04fa:
            if (r5 == 0) goto L_0x0511
            com.google.protobuf.bb r4 = r0.f170077q
            r4.mo58842j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x050f
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x04fa
        L_0x050f:
            r5 = 0
            goto L_0x04fa
        L_0x0511:
            com.google.protobuf.fi r3 = r0.f170076p
            java.lang.Object r1 = r3.mo59089d(r1)
            r3.mo59104s(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C63003dv.m95637W(java.lang.Object, com.google.protobuf.ao):void");
    }

    /* renamed from: X */
    private final void m95638X(C62907ao aoVar, int i, Object obj, int i2) {
        if (obj != null) {
            C62993dl dlVar = ((C62994dm) m95621G(i2)).f170056a;
            C62906an anVar = aoVar.f169854a;
            for (Map.Entry entry : ((C62995dn) obj).entrySet()) {
                aoVar.f169854a.mo58778u(i, 2);
                aoVar.f169854a.mo58780w(C62994dm.m95599a(dlVar, entry.getKey(), entry.getValue()));
                C62994dm.m95600b(aoVar.f169854a, dlVar, entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: Y */
    private static final void m95639Y(int i, Object obj, C62907ao aoVar) {
        if (obj instanceof String) {
            aoVar.f169854a.mo58776s(i, (String) obj);
            return;
        }
        aoVar.f169854a.mo58763aa(i, (C63088z) obj);
    }

    /* renamed from: d */
    static C63045fj m95640d(Object obj) {
        C62942bv bvVar = (C62942bv) obj;
        C63045fj fjVar = bvVar.unknownFields;
        if (fjVar != C63045fj.f170156a) {
            return fjVar;
        }
        C63045fj fjVar2 = new C63045fj();
        bvVar.unknownFields = fjVar2;
        return fjVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0191  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.protobuf.C63003dv m95641l(com.google.protobuf.C62998dq r26, com.google.protobuf.C63006dy r27, com.google.protobuf.C62986de r28, com.google.protobuf.C63044fi r29, com.google.protobuf.C62922bb r30, com.google.protobuf.C62996do r31) {
        /*
            r0 = r26
            boolean r1 = r0 instanceof com.google.protobuf.C63015eg
            if (r1 == 0) goto L_0x0015
            com.google.protobuf.eg r0 = (com.google.protobuf.C63015eg) r0
            r12 = r28
            r13 = r29
            r14 = r30
            r1 = r31
            com.google.protobuf.dv r0 = m95642n(r0, r12, r13, r14, r1)
            return r0
        L_0x0015:
            r12 = r28
            r13 = r29
            r14 = r30
            com.google.protobuf.fd r0 = (com.google.protobuf.C63039fd) r0
            com.google.protobuf.ed r1 = r0.f170147a
            com.google.protobuf.ed r2 = com.google.protobuf.C63012ed.PROTO3
            r4 = 0
            if (r1 != r2) goto L_0x0026
            r7 = 1
            goto L_0x0027
        L_0x0026:
            r7 = 0
        L_0x0027:
            com.google.protobuf.be[] r1 = r0.f170149c
            int r2 = r1.length
            if (r2 != 0) goto L_0x002f
            r5 = 0
            r6 = 0
            goto L_0x0039
        L_0x002f:
            r5 = r1[r4]
            int r5 = r5.f169878d
            int r6 = r2 + -1
            r6 = r1[r6]
            int r6 = r6.f169878d
        L_0x0039:
            int r8 = r2 * 3
            int[] r8 = new int[r8]
            int r9 = r2 + r2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r10 = 0
            r11 = 0
            r15 = 0
        L_0x0044:
            if (r10 >= r2) goto L_0x0066
            r3 = r1[r10]
            com.google.protobuf.bh r4 = r3.f169876b
            r16 = r2
            com.google.protobuf.bh r2 = com.google.protobuf.C62928bh.MAP
            if (r4 != r2) goto L_0x0053
            int r11 = r11 + 1
            goto L_0x0061
        L_0x0053:
            com.google.protobuf.bh r2 = r3.f169876b
            int r2 = r2.f169950Z
            r3 = 18
            if (r2 < r3) goto L_0x0061
            r3 = 49
            if (r2 > r3) goto L_0x0061
            int r15 = r15 + 1
        L_0x0061:
            int r10 = r10 + 1
            r2 = r16
            goto L_0x0044
        L_0x0066:
            if (r11 <= 0) goto L_0x006b
            int[] r3 = new int[r11]
            goto L_0x006c
        L_0x006b:
            r3 = 0
        L_0x006c:
            if (r15 <= 0) goto L_0x0071
            int[] r4 = new int[r15]
            goto L_0x0072
        L_0x0071:
            r4 = 0
        L_0x0072:
            int[] r10 = r0.f170148b
            if (r10 != 0) goto L_0x0078
            int[] r10 = f170061b
        L_0x0078:
            r2 = 0
            r11 = 0
            r15 = 0
            r17 = 0
            r18 = 0
        L_0x007f:
            int r12 = r1.length
            if (r11 >= r12) goto L_0x01c0
            r12 = r1[r11]
            r19 = r1
            int r1 = r12.f169878d
            com.google.protobuf.ea r13 = r12.f169883i
            if (r13 == 0) goto L_0x00b0
            com.google.protobuf.bh r14 = r12.f169876b
            int r14 = r14.f169950Z
            int r14 = r14 + 51
            r20 = r14
            java.lang.reflect.Field r14 = r13.f170086b
            r21 = r7
            com.google.protobuf.fr r7 = com.google.protobuf.C63054fs.f170169a
            r22 = r6
            long r6 = r7.mo59137o(r14)
            int r7 = (int) r6
            java.lang.reflect.Field r6 = r13.f170085a
            com.google.protobuf.fr r13 = com.google.protobuf.C63054fs.f170169a
            long r13 = r13.mo59137o(r6)
            int r6 = (int) r13
            r14 = r20
        L_0x00ac:
            r13 = 0
        L_0x00ad:
            r20 = r5
            goto L_0x00f2
        L_0x00b0:
            r22 = r6
            r21 = r7
            com.google.protobuf.bh r6 = r12.f169876b
            java.lang.reflect.Field r7 = r12.f169875a
            com.google.protobuf.fr r13 = com.google.protobuf.C63054fs.f170169a
            long r13 = r13.mo59137o(r7)
            int r7 = (int) r13
            int r14 = r6.f169950Z
            com.google.protobuf.bg r6 = r6.f169951aa
            boolean r13 = r6.f169896e
            if (r13 != 0) goto L_0x00ee
            com.google.protobuf.bg r13 = com.google.protobuf.C62927bg.MAP
            if (r6 != r13) goto L_0x00d0
            r20 = r5
            r6 = 0
            r13 = 0
            goto L_0x00f2
        L_0x00d0:
            java.lang.reflect.Field r6 = r12.f169879e
            if (r6 != 0) goto L_0x00da
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r20 = r7
            goto L_0x00e4
        L_0x00da:
            com.google.protobuf.fr r13 = com.google.protobuf.C63054fs.f170169a
            r20 = r7
            long r6 = r13.mo59137o(r6)
            int r7 = (int) r6
            r6 = r7
        L_0x00e4:
            int r7 = r12.f169880f
            int r7 = java.lang.Integer.numberOfTrailingZeros(r7)
            r13 = r7
            r7 = r20
            goto L_0x00ad
        L_0x00ee:
            r20 = r7
            r6 = 0
            goto L_0x00ac
        L_0x00f2:
            int r5 = r12.f169878d
            r8[r15] = r5
            int r5 = r15 + 1
            r23 = r0
            boolean r0 = r12.f169882h
            r24 = r11
            r11 = 1
            if (r11 == r0) goto L_0x0105
            r25 = r4
            r0 = 0
            goto L_0x0109
        L_0x0105:
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r25 = r4
        L_0x0109:
            boolean r4 = r12.f169881g
            if (r11 == r4) goto L_0x010f
            r4 = 0
            goto L_0x0111
        L_0x010f:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0111:
            r0 = r0 | r4
            int r4 = r14 << 20
            r0 = r0 | r4
            r0 = r0 | r7
            r8[r5] = r0
            int r0 = r15 + 2
            int r4 = r13 << 20
            r4 = r4 | r6
            r8[r0] = r4
            com.google.protobuf.bh r0 = r12.f169876b
            int r0 = r0.ordinal()
            r4 = 9
            if (r0 == r4) goto L_0x013a
            r4 = 17
            if (r0 == r4) goto L_0x013a
            r4 = 27
            if (r0 == r4) goto L_0x0137
            r4 = 49
            if (r0 == r4) goto L_0x0137
            r0 = 0
            goto L_0x0145
        L_0x0137:
            java.lang.Class r0 = r12.f169877c
            goto L_0x0145
        L_0x013a:
            java.lang.reflect.Field r0 = r12.f169875a
            if (r0 == 0) goto L_0x0143
            java.lang.Class r0 = r0.getType()
            goto L_0x0145
        L_0x0143:
            java.lang.Class r0 = r12.f169884j
        L_0x0145:
            java.lang.Object r4 = r12.f169885k
            if (r4 == 0) goto L_0x015f
            int r5 = r15 / 3
            int r5 = r5 + r5
            r9[r5] = r4
            if (r0 == 0) goto L_0x0155
            int r5 = r5 + 1
            r9[r5] = r0
            goto L_0x015d
        L_0x0155:
            com.google.protobuf.cf r0 = r12.f169886l
            if (r0 == 0) goto L_0x015d
            int r5 = r5 + 1
            r9[r5] = r0
        L_0x015d:
            r5 = 1
            goto L_0x0174
        L_0x015f:
            if (r0 == 0) goto L_0x0169
            int r4 = r15 / 3
            int r4 = r4 + r4
            r5 = 1
            int r4 = r4 + r5
            r9[r4] = r0
            goto L_0x0174
        L_0x0169:
            r5 = 1
            com.google.protobuf.cf r0 = r12.f169886l
            if (r0 == 0) goto L_0x0174
            int r4 = r15 / 3
            int r4 = r4 + r4
            int r4 = r4 + r5
            r9[r4] = r0
        L_0x0174:
            int r0 = r10.length
            if (r2 >= r0) goto L_0x0180
            r0 = r10[r2]
            if (r0 != r1) goto L_0x0180
            int r0 = r2 + 1
            r10[r2] = r15
            r2 = r0
        L_0x0180:
            com.google.protobuf.bh r0 = r12.f169876b
            com.google.protobuf.bh r1 = com.google.protobuf.C62928bh.MAP
            if (r0 != r1) goto L_0x0191
            int r0 = r17 + 1
            r3[r17] = r15
            r17 = r0
            r1 = 18
        L_0x018e:
            r4 = 49
            goto L_0x01aa
        L_0x0191:
            int r0 = r0.f169950Z
            r1 = 18
            if (r0 < r1) goto L_0x018e
            r4 = 49
            if (r0 > r4) goto L_0x01aa
            int r0 = r18 + 1
            java.lang.reflect.Field r6 = r12.f169875a
            com.google.protobuf.fr r7 = com.google.protobuf.C63054fs.f170169a
            long r6 = r7.mo59137o(r6)
            int r7 = (int) r6
            r25[r18] = r7
            r18 = r0
        L_0x01aa:
            int r11 = r24 + 1
            int r15 = r15 + 3
            r13 = r29
            r14 = r30
            r1 = r19
            r5 = r20
            r7 = r21
            r6 = r22
            r0 = r23
            r4 = r25
            goto L_0x007f
        L_0x01c0:
            r23 = r0
            r25 = r4
            r20 = r5
            r22 = r6
            r21 = r7
            if (r3 != 0) goto L_0x01ce
            int[] r3 = f170061b
        L_0x01ce:
            if (r25 != 0) goto L_0x01d3
            int[] r4 = f170061b
            goto L_0x01d5
        L_0x01d3:
            r4 = r25
        L_0x01d5:
            int r0 = r10.length
            int r1 = r3.length
            int r11 = r0 + r1
            int r2 = r4.length
            int r5 = r11 + r2
            int[] r12 = new int[r5]
            r5 = 0
            java.lang.System.arraycopy(r10, r5, r12, r5, r0)
            java.lang.System.arraycopy(r3, r5, r12, r0, r1)
            java.lang.System.arraycopy(r4, r5, r12, r11, r2)
            com.google.protobuf.dv r15 = new com.google.protobuf.dv
            r1 = r23
            com.google.protobuf.MessageLite r6 = r1.f170150d
            r10 = 1
            r1 = r15
            r2 = r8
            r3 = r9
            r4 = r20
            r5 = r22
            r7 = r21
            r8 = r10
            r9 = r12
            r10 = r0
            r12 = r28
            r13 = r29
            r14 = r30
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C63003dv.m95641l(com.google.protobuf.dq, com.google.protobuf.dy, com.google.protobuf.de, com.google.protobuf.fi, com.google.protobuf.bb, com.google.protobuf.do):com.google.protobuf.dv");
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0398  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.protobuf.C63003dv m95642n(com.google.protobuf.C63015eg r35, com.google.protobuf.C62986de r36, com.google.protobuf.C63044fi r37, com.google.protobuf.C62922bb r38, com.google.protobuf.C62996do r39) {
        /*
            r0 = r35
            com.google.protobuf.ed r1 = r35.mo58990b()
            com.google.protobuf.ed r2 = com.google.protobuf.C63012ed.PROTO3
            r3 = 0
            if (r1 != r2) goto L_0x000d
            r11 = 1
            goto L_0x000e
        L_0x000d:
            r11 = 0
        L_0x000e:
            java.lang.String r1 = r0.f170097b
            int r2 = r1.length()
            char r5 = r1.charAt(r3)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0028
            r5 = 1
        L_0x001e:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0029
            r5 = r7
            goto L_0x001e
        L_0x0028:
            r7 = 1
        L_0x0029:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0048
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0035:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0045
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x0035
        L_0x0045:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x0048:
            if (r7 != 0) goto L_0x0055
            int[] r7 = f170061b
            r14 = r7
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            goto L_0x0166
        L_0x0055:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0074
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0061:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0071
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x0061
        L_0x0071:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x0074:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0093
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0080:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x0090
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x0080
        L_0x0090:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x0093:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00b2
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x009f:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00af
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x009f
        L_0x00af:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00b2:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00d1
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00be:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00ce
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00be
        L_0x00ce:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00d1:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00f0
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00dd:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00ed
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00dd
        L_0x00ed:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f0:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x0111
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x00fc:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x010d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x00fc
        L_0x010d:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0111:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0134
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x011d:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x012f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x011d
        L_0x012f:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0134:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0159
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r3 = r16
            r16 = 13
        L_0x0142:
            int r17 = r3 + 1
            char r3 = r1.charAt(r3)
            if (r3 < r6) goto L_0x0154
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r16
            r15 = r15 | r3
            int r16 = r16 + 13
            r3 = r17
            goto L_0x0142
        L_0x0154:
            int r3 = r3 << r16
            r15 = r15 | r3
            r16 = r17
        L_0x0159:
            int r3 = r15 + r13
            int r3 = r3 + r14
            int[] r3 = new int[r3]
            int r14 = r5 + r5
            int r14 = r14 + r7
            r7 = r14
            r14 = r3
            r3 = r5
            r5 = r16
        L_0x0166:
            sun.misc.Unsafe r8 = f170062c
            java.lang.Object[] r4 = r0.f170098c
            com.google.protobuf.MessageLite r6 = r0.f170096a
            java.lang.Class r6 = r6.getClass()
            r19 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            int r12 = r12 + r12
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r20 = r15 + r13
            r13 = r7
            r22 = r15
            r7 = r19
            r23 = r20
            r19 = 0
            r21 = 0
        L_0x0186:
            if (r7 >= r2) goto L_0x03e5
            int r24 = r7 + 1
            char r7 = r1.charAt(r7)
            r25 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r2) goto L_0x01ba
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r2 = r24
            r24 = 13
        L_0x019b:
            int r26 = r2 + 1
            char r2 = r1.charAt(r2)
            r27 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r15) goto L_0x01b4
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r24
            r7 = r7 | r2
            int r24 = r24 + 13
            r2 = r26
            r15 = r27
            goto L_0x019b
        L_0x01b4:
            int r2 = r2 << r24
            r7 = r7 | r2
            r2 = r26
            goto L_0x01be
        L_0x01ba:
            r27 = r15
            r2 = r24
        L_0x01be:
            int r15 = r2 + 1
            char r2 = r1.charAt(r2)
            r24 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r15) goto L_0x01f0
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r15 = r24
            r24 = 13
        L_0x01d1:
            int r26 = r15 + 1
            char r15 = r1.charAt(r15)
            r28 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01ea
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r24
            r2 = r2 | r10
            int r24 = r24 + 13
            r15 = r26
            r10 = r28
            goto L_0x01d1
        L_0x01ea:
            int r10 = r15 << r24
            r2 = r2 | r10
            r15 = r26
            goto L_0x01f4
        L_0x01f0:
            r28 = r10
            r15 = r24
        L_0x01f4:
            r10 = r2 & 255(0xff, float:3.57E-43)
            r24 = r9
            r9 = r2 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0202
            int r9 = r21 + 1
            r14[r21] = r19
            r21 = r9
        L_0x0202:
            r9 = 51
            if (r10 < r9) goto L_0x02b2
            int r9 = r15 + 1
            char r15 = r1.charAt(r15)
            r26 = r9
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r9) goto L_0x023a
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
            r34 = r26
            r26 = r15
            r15 = r34
        L_0x021d:
            int r33 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r9) goto L_0x0233
            r9 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r32
            r26 = r26 | r9
            int r32 = r32 + 13
            r15 = r33
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x021d
        L_0x0233:
            int r9 = r15 << r32
            r15 = r26 | r9
            r9 = r33
            goto L_0x023c
        L_0x023a:
            r9 = r26
        L_0x023c:
            r26 = r9
            int r9 = r10 + -51
            r0 = 9
            if (r9 == r0) goto L_0x025d
            r0 = 17
            if (r9 != r0) goto L_0x0249
            goto L_0x025d
        L_0x0249:
            r0 = 12
            if (r9 != r0) goto L_0x026b
            if (r11 != 0) goto L_0x026b
            int r0 = r19 / 3
            int r9 = r13 + 1
            int r0 = r0 + r0
            r17 = 1
            int r0 = r0 + 1
            r13 = r4[r13]
            r12[r0] = r13
            goto L_0x026a
        L_0x025d:
            int r0 = r19 / 3
            int r9 = r13 + 1
            int r0 = r0 + r0
            r17 = 1
            int r0 = r0 + 1
            r13 = r4[r13]
            r12[r0] = r13
        L_0x026a:
            r13 = r9
        L_0x026b:
            int r15 = r15 + r15
            r0 = r4[r15]
            boolean r9 = r0 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0275
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            goto L_0x027d
        L_0x0275:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = m95622H(r6, r0)
            r4[r15] = r0
        L_0x027d:
            r9 = r1
            long r0 = r8.objectFieldOffset(r0)
            int r1 = (int) r0
            int r15 = r15 + 1
            r0 = r4[r15]
            r29 = r1
            boolean r1 = r0 instanceof java.lang.reflect.Field
            if (r1 == 0) goto L_0x0290
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            goto L_0x0298
        L_0x0290:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = m95622H(r6, r0)
            r4[r15] = r0
        L_0x0298:
            long r0 = r8.objectFieldOffset(r0)
            int r1 = (int) r0
            r31 = r3
            r0 = r4
            r30 = r13
            r15 = r26
            r3 = 55296(0xd800, float:7.7486E-41)
            r13 = 0
            r17 = 1
            r34 = r29
            r29 = r1
            r1 = r34
            goto L_0x03ad
        L_0x02b2:
            r9 = r1
            int r0 = r13 + 1
            r1 = r4[r13]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.reflect.Field r1 = m95622H(r6, r1)
            r13 = 9
            if (r10 == r13) goto L_0x0326
            r13 = 17
            if (r10 != r13) goto L_0x02c6
            goto L_0x0326
        L_0x02c6:
            r13 = 27
            if (r10 == r13) goto L_0x0316
            r13 = 49
            if (r10 != r13) goto L_0x02cf
            goto L_0x0316
        L_0x02cf:
            r13 = 12
            if (r10 == r13) goto L_0x0306
            r13 = 30
            if (r10 == r13) goto L_0x0306
            r13 = 44
            if (r10 != r13) goto L_0x02dc
            goto L_0x0306
        L_0x02dc:
            r13 = 50
            if (r10 != r13) goto L_0x02fc
            int r13 = r22 + 1
            r14[r22] = r19
            int r22 = r19 / 3
            int r22 = r22 + r22
            int r29 = r0 + 1
            r0 = r4[r0]
            r12[r22] = r0
            r0 = r2 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x02ff
            int r0 = r29 + 1
            int r22 = r22 + 1
            r29 = r4[r29]
            r12[r22] = r29
            r22 = r13
        L_0x02fc:
            r17 = 1
            goto L_0x0333
        L_0x02ff:
            r22 = r13
            r13 = r29
            r17 = 1
            goto L_0x0334
        L_0x0306:
            if (r11 != 0) goto L_0x02fc
            int r13 = r19 / 3
            int r29 = r0 + 1
            int r13 = r13 + r13
            r17 = 1
            int r13 = r13 + 1
            r0 = r4[r0]
            r12[r13] = r0
            goto L_0x0323
        L_0x0316:
            r17 = 1
            int r13 = r19 / 3
            int r29 = r0 + 1
            int r13 = r13 + r13
            int r13 = r13 + 1
            r0 = r4[r0]
            r12[r13] = r0
        L_0x0323:
            r13 = r29
            goto L_0x0334
        L_0x0326:
            r17 = 1
            int r13 = r19 / 3
            int r13 = r13 + r13
            int r13 = r13 + 1
            java.lang.Class r29 = r1.getType()
            r12[r13] = r29
        L_0x0333:
            r13 = r0
        L_0x0334:
            long r0 = r8.objectFieldOffset(r1)
            int r1 = (int) r0
            r0 = r2 & 4096(0x1000, float:5.74E-42)
            r29 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r13
            r13 = 4096(0x1000, float:5.74E-42)
            if (r0 != r13) goto L_0x0398
            r0 = 17
            if (r10 > r0) goto L_0x0398
            int r0 = r15 + 1
            char r13 = r9.charAt(r15)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r15) goto L_0x036d
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r18 = 13
        L_0x0357:
            int r29 = r0 + 1
            char r0 = r9.charAt(r0)
            if (r0 < r15) goto L_0x0369
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r18
            r13 = r13 | r0
            int r18 = r18 + 13
            r0 = r29
            goto L_0x0357
        L_0x0369:
            int r0 = r0 << r18
            r13 = r13 | r0
            goto L_0x036f
        L_0x036d:
            r29 = r0
        L_0x036f:
            int r0 = r3 + r3
            int r18 = r13 / 32
            int r0 = r0 + r18
            r15 = r4[r0]
            r31 = r3
            boolean r3 = r15 instanceof java.lang.reflect.Field
            if (r3 == 0) goto L_0x0380
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
            goto L_0x0388
        L_0x0380:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.reflect.Field r15 = m95622H(r6, r15)
            r4[r0] = r15
        L_0x0388:
            r0 = r4
            long r3 = r8.objectFieldOffset(r15)
            int r4 = (int) r3
            int r13 = r13 % 32
            r15 = r29
            r3 = 55296(0xd800, float:7.7486E-41)
            r29 = r4
            goto L_0x039f
        L_0x0398:
            r31 = r3
            r0 = r4
            r3 = 55296(0xd800, float:7.7486E-41)
            r13 = 0
        L_0x039f:
            r4 = 18
            if (r10 < r4) goto L_0x03ad
            r4 = 49
            if (r10 > r4) goto L_0x03ad
            int r4 = r23 + 1
            r14[r23] = r1
            r23 = r4
        L_0x03ad:
            int r4 = r19 + 1
            r5[r19] = r7
            int r7 = r4 + 1
            r3 = r2 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x03ba
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03bb
        L_0x03ba:
            r3 = 0
        L_0x03bb:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03c2
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c3
        L_0x03c2:
            r2 = 0
        L_0x03c3:
            r2 = r2 | r3
            int r3 = r10 << 20
            r2 = r2 | r3
            r1 = r1 | r2
            r5[r4] = r1
            int r19 = r7 + 1
            int r1 = r13 << 20
            r1 = r1 | r29
            r5[r7] = r1
            r4 = r0
            r1 = r9
            r7 = r15
            r9 = r24
            r2 = r25
            r15 = r27
            r10 = r28
            r13 = r30
            r3 = r31
            r0 = r35
            goto L_0x0186
        L_0x03e5:
            r24 = r9
            r28 = r10
            r27 = r15
            com.google.protobuf.dv r0 = new com.google.protobuf.dv
            r1 = r35
            com.google.protobuf.MessageLite r10 = r1.f170096a
            r1 = 0
            r2 = r5
            r5 = r0
            r6 = r2
            r7 = r12
            r8 = r24
            r9 = r28
            r12 = r1
            r13 = r14
            r14 = r27
            r15 = r20
            r16 = r36
            r17 = r37
            r18 = r38
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C63003dv.m95642n(com.google.protobuf.eg, com.google.protobuf.de, com.google.protobuf.fi, com.google.protobuf.bb, com.google.protobuf.do):com.google.protobuf.dv");
    }

    /* renamed from: o */
    private static double m95643o(Object obj, long j) {
        return ((Double) C63054fs.f170169a.mo59138p(obj, j)).doubleValue();
    }

    /* renamed from: p */
    private static float m95644p(Object obj, long j) {
        return ((Float) C63054fs.f170169a.mo59138p(obj, j)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0391, code lost:
        r4 = r4 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0485, code lost:
        r6 = r6 + (r10 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04fa, code lost:
        r4 = r4 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0544, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x056f, code lost:
        r4 = r4 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0570, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0597, code lost:
        r6 = r6 + (r9 + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x05a4, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x05b2, code lost:
        r3 = r3 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x05b6, code lost:
        r5 = r5 + 3;
        r4 = 1048575;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m95645q(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f170062c
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 0
        L_0x000f:
            int[] r9 = r0.f170064d
            int r9 = r9.length
            if (r5 >= r9) goto L_0x05bd
            int r9 = r0.m95616B(r5)
            int[] r10 = r0.f170064d
            r11 = r10[r5]
            int r12 = m95615A(r9)
            r13 = 17
            r14 = 1
            if (r12 > r13) goto L_0x0038
            int r13 = r5 + 2
            r10 = r10[r13]
            r13 = r10 & r4
            int r15 = r10 >>> 20
            int r15 = r14 << r15
            if (r13 == r7) goto L_0x0052
            long r7 = (long) r13
            int r8 = r2.getInt(r1, r7)
            r7 = r13
            goto L_0x0052
        L_0x0038:
            boolean r10 = r0.f170071k
            if (r10 == 0) goto L_0x0050
            com.google.protobuf.bh r10 = com.google.protobuf.C62928bh.DOUBLE_LIST_PACKED
            int r10 = r10.f169950Z
            if (r12 < r10) goto L_0x0050
            com.google.protobuf.bh r10 = com.google.protobuf.C62928bh.SINT64_LIST_PACKED
            int r10 = r10.f169950Z
            if (r12 > r10) goto L_0x0050
            int[] r10 = r0.f170064d
            int r13 = r5 + 2
            r10 = r10[r13]
            r10 = r10 & r4
            goto L_0x0051
        L_0x0050:
            r10 = 0
        L_0x0051:
            r15 = 0
        L_0x0052:
            r9 = r9 & r4
            long r3 = (long) r9
            r9 = 63
            switch(r12) {
                case 0: goto L_0x05a8;
                case 1: goto L_0x059a;
                case 2: goto L_0x0585;
                case 3: goto L_0x0572;
                case 4: goto L_0x055d;
                case 5: goto L_0x0552;
                case 6: goto L_0x0547;
                case 7: goto L_0x053a;
                case 8: goto L_0x0510;
                case 9: goto L_0x04fe;
                case 10: goto L_0x04e2;
                case 11: goto L_0x04ce;
                case 12: goto L_0x04ba;
                case 13: goto L_0x04ae;
                case 14: goto L_0x04a2;
                case 15: goto L_0x0489;
                case 16: goto L_0x046f;
                case 17: goto L_0x045c;
                case 18: goto L_0x044f;
                case 19: goto L_0x0444;
                case 20: goto L_0x0439;
                case 21: goto L_0x042e;
                case 22: goto L_0x0423;
                case 23: goto L_0x0418;
                case 24: goto L_0x040d;
                case 25: goto L_0x0402;
                case 26: goto L_0x03f7;
                case 27: goto L_0x03e8;
                case 28: goto L_0x03dc;
                case 29: goto L_0x03d0;
                case 30: goto L_0x03c4;
                case 31: goto L_0x03b8;
                case 32: goto L_0x03ac;
                case 33: goto L_0x03a0;
                case 34: goto L_0x0394;
                case 35: goto L_0x0375;
                case 36: goto L_0x0358;
                case 37: goto L_0x033b;
                case 38: goto L_0x031e;
                case 39: goto L_0x0300;
                case 40: goto L_0x02e2;
                case 41: goto L_0x02c4;
                case 42: goto L_0x02a6;
                case 43: goto L_0x0288;
                case 44: goto L_0x026a;
                case 45: goto L_0x024c;
                case 46: goto L_0x022e;
                case 47: goto L_0x0210;
                case 48: goto L_0x01f2;
                case 49: goto L_0x01e2;
                case 50: goto L_0x01d4;
                case 51: goto L_0x01c6;
                case 52: goto L_0x01b8;
                case 53: goto L_0x01a2;
                case 54: goto L_0x018c;
                case 55: goto L_0x0176;
                case 56: goto L_0x0168;
                case 57: goto L_0x015a;
                case 58: goto L_0x014c;
                case 59: goto L_0x011e;
                case 60: goto L_0x010a;
                case 61: goto L_0x00ee;
                case 62: goto L_0x00d8;
                case 63: goto L_0x00c2;
                case 64: goto L_0x00b4;
                case 65: goto L_0x00a6;
                case 66: goto L_0x008b;
                case 67: goto L_0x0071;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x05b6
        L_0x005b:
            boolean r9 = r0.m95633S(r1, r11, r5)
            if (r9 == 0) goto L_0x05b6
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.protobuf.MessageLite r3 = (com.google.protobuf.MessageLite) r3
            com.google.protobuf.en r4 = r0.m95619E(r5)
            int r3 = com.google.protobuf.C62906an.m95312E(r11, r3, r4)
            goto L_0x0459
        L_0x0071:
            boolean r10 = r0.m95633S(r1, r11, r5)
            if (r10 == 0) goto L_0x05b6
            long r3 = m95617C(r1, r3)
            int r10 = r11 << 3
            int r10 = com.google.protobuf.C62906an.m95321N(r10)
            long r11 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r11
            int r3 = com.google.protobuf.C62906an.m95322O(r3)
            goto L_0x0485
        L_0x008b:
            boolean r9 = r0.m95633S(r1, r11, r5)
            if (r9 == 0) goto L_0x05b6
            int r3 = m95647s(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            int r3 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x056f
        L_0x00a6:
            boolean r3 = r0.m95633S(r1, r11, r5)
            if (r3 == 0) goto L_0x05b6
            int r3 = r11 << 3
            int r3 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x05b2
        L_0x00b4:
            boolean r3 = r0.m95633S(r1, r11, r5)
            if (r3 == 0) goto L_0x05b6
            int r3 = r11 << 3
            int r3 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x05a4
        L_0x00c2:
            boolean r9 = r0.m95633S(r1, r11, r5)
            if (r9 == 0) goto L_0x05b6
            int r3 = m95647s(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            int r3 = com.google.protobuf.C62906an.m95314G(r3)
            goto L_0x056f
        L_0x00d8:
            boolean r9 = r0.m95633S(r1, r11, r5)
            if (r9 == 0) goto L_0x05b6
            int r3 = m95647s(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            int r3 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x056f
        L_0x00ee:
            boolean r9 = r0.m95633S(r1, r11, r5)
            if (r9 == 0) goto L_0x05b6
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.protobuf.z r3 = (com.google.protobuf.C63088z) r3
            int r4 = r11 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            int r3 = r3.mo59031d()
            int r9 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x04fa
        L_0x010a:
            boolean r9 = r0.m95633S(r1, r11, r5)
            if (r9 == 0) goto L_0x05b6
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.protobuf.en r4 = r0.m95619E(r5)
            int r3 = com.google.protobuf.C63023eo.m95831i(r11, r3, r4)
            goto L_0x0459
        L_0x011e:
            boolean r9 = r0.m95633S(r1, r11, r5)
            if (r9 == 0) goto L_0x05b6
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.protobuf.C63088z
            if (r4 == 0) goto L_0x013e
            com.google.protobuf.z r3 = (com.google.protobuf.C63088z) r3
            int r4 = r11 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            int r3 = r3.mo59031d()
            int r9 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x04fa
        L_0x013e:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            int r3 = com.google.protobuf.C62906an.m95319L(r3)
            goto L_0x056f
        L_0x014c:
            boolean r3 = r0.m95633S(r1, r11, r5)
            if (r3 == 0) goto L_0x05b6
            int r3 = r11 << 3
            int r3 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x0544
        L_0x015a:
            boolean r3 = r0.m95633S(r1, r11, r5)
            if (r3 == 0) goto L_0x05b6
            int r3 = r11 << 3
            int r3 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x05a4
        L_0x0168:
            boolean r3 = r0.m95633S(r1, r11, r5)
            if (r3 == 0) goto L_0x05b6
            int r3 = r11 << 3
            int r3 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x05b2
        L_0x0176:
            boolean r9 = r0.m95633S(r1, r11, r5)
            if (r9 == 0) goto L_0x05b6
            int r3 = m95647s(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            int r3 = com.google.protobuf.C62906an.m95314G(r3)
            goto L_0x056f
        L_0x018c:
            boolean r9 = r0.m95633S(r1, r11, r5)
            if (r9 == 0) goto L_0x05b6
            long r3 = m95617C(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.protobuf.C62906an.m95321N(r9)
            int r3 = com.google.protobuf.C62906an.m95322O(r3)
            goto L_0x0597
        L_0x01a2:
            boolean r9 = r0.m95633S(r1, r11, r5)
            if (r9 == 0) goto L_0x05b6
            long r3 = m95617C(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.protobuf.C62906an.m95321N(r9)
            int r3 = com.google.protobuf.C62906an.m95322O(r3)
            goto L_0x0597
        L_0x01b8:
            boolean r3 = r0.m95633S(r1, r11, r5)
            if (r3 == 0) goto L_0x05b6
            int r3 = r11 << 3
            int r3 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x05a4
        L_0x01c6:
            boolean r3 = r0.m95633S(r1, r11, r5)
            if (r3 == 0) goto L_0x05b6
            int r3 = r11 << 3
            int r3 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x05b2
        L_0x01d4:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r0.m95621G(r5)
            int r3 = com.google.protobuf.C62996do.m95604a(r11, r3, r4)
            goto L_0x0459
        L_0x01e2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.en r4 = r0.m95619E(r5)
            int r3 = com.google.protobuf.C63023eo.m95828f(r11, r3, r4)
            goto L_0x0459
        L_0x01f2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95834l(r3)
            if (r3 <= 0) goto L_0x05b6
            boolean r4 = r0.f170071k
            if (r4 == 0) goto L_0x0206
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x0206:
            int r4 = com.google.protobuf.C62906an.m95320M(r11)
            int r9 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x0391
        L_0x0210:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95833k(r3)
            if (r3 <= 0) goto L_0x05b6
            boolean r4 = r0.f170071k
            if (r4 == 0) goto L_0x0224
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x0224:
            int r4 = com.google.protobuf.C62906an.m95320M(r11)
            int r9 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x0391
        L_0x022e:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95827e(r3)
            if (r3 <= 0) goto L_0x05b6
            boolean r4 = r0.f170071k
            if (r4 == 0) goto L_0x0242
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x0242:
            int r4 = com.google.protobuf.C62906an.m95320M(r11)
            int r9 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x0391
        L_0x024c:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95826d(r3)
            if (r3 <= 0) goto L_0x05b6
            boolean r4 = r0.f170071k
            if (r4 == 0) goto L_0x0260
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x0260:
            int r4 = com.google.protobuf.C62906an.m95320M(r11)
            int r9 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x0391
        L_0x026a:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95825c(r3)
            if (r3 <= 0) goto L_0x05b6
            boolean r4 = r0.f170071k
            if (r4 == 0) goto L_0x027e
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x027e:
            int r4 = com.google.protobuf.C62906an.m95320M(r11)
            int r9 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x0391
        L_0x0288:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95836n(r3)
            if (r3 <= 0) goto L_0x05b6
            boolean r4 = r0.f170071k
            if (r4 == 0) goto L_0x029c
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x029c:
            int r4 = com.google.protobuf.C62906an.m95320M(r11)
            int r9 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x0391
        L_0x02a6:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95823a(r3)
            if (r3 <= 0) goto L_0x05b6
            boolean r4 = r0.f170071k
            if (r4 == 0) goto L_0x02ba
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x02ba:
            int r4 = com.google.protobuf.C62906an.m95320M(r11)
            int r9 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x0391
        L_0x02c4:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95826d(r3)
            if (r3 <= 0) goto L_0x05b6
            boolean r4 = r0.f170071k
            if (r4 == 0) goto L_0x02d8
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x02d8:
            int r4 = com.google.protobuf.C62906an.m95320M(r11)
            int r9 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x0391
        L_0x02e2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95827e(r3)
            if (r3 <= 0) goto L_0x05b6
            boolean r4 = r0.f170071k
            if (r4 == 0) goto L_0x02f6
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x02f6:
            int r4 = com.google.protobuf.C62906an.m95320M(r11)
            int r9 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x0391
        L_0x0300:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95829g(r3)
            if (r3 <= 0) goto L_0x05b6
            boolean r4 = r0.f170071k
            if (r4 == 0) goto L_0x0314
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x0314:
            int r4 = com.google.protobuf.C62906an.m95320M(r11)
            int r9 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x0391
        L_0x031e:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95837o(r3)
            if (r3 <= 0) goto L_0x05b6
            boolean r4 = r0.f170071k
            if (r4 == 0) goto L_0x0332
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x0332:
            int r4 = com.google.protobuf.C62906an.m95320M(r11)
            int r9 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x0391
        L_0x033b:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95830h(r3)
            if (r3 <= 0) goto L_0x05b6
            boolean r4 = r0.f170071k
            if (r4 == 0) goto L_0x034f
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x034f:
            int r4 = com.google.protobuf.C62906an.m95320M(r11)
            int r9 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x0391
        L_0x0358:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95826d(r3)
            if (r3 <= 0) goto L_0x05b6
            boolean r4 = r0.f170071k
            if (r4 == 0) goto L_0x036c
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x036c:
            int r4 = com.google.protobuf.C62906an.m95320M(r11)
            int r9 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x0391
        L_0x0375:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95827e(r3)
            if (r3 <= 0) goto L_0x05b6
            boolean r4 = r0.f170071k
            if (r4 == 0) goto L_0x0389
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x0389:
            int r4 = com.google.protobuf.C62906an.m95320M(r11)
            int r9 = com.google.protobuf.C62906an.m95321N(r3)
        L_0x0391:
            int r4 = r4 + r9
            goto L_0x056f
        L_0x0394:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95800D(r11, r3)
            goto L_0x0459
        L_0x03a0:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95799C(r11, r3)
            goto L_0x0459
        L_0x03ac:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95848z(r11, r3)
            goto L_0x0459
        L_0x03b8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95847y(r11, r3)
            goto L_0x0459
        L_0x03c4:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95846x(r11, r3)
            goto L_0x0459
        L_0x03d0:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95801E(r11, r3)
            goto L_0x0459
        L_0x03dc:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95824b(r11, r3)
            goto L_0x0459
        L_0x03e8:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.protobuf.en r4 = r0.m95619E(r5)
            int r3 = com.google.protobuf.C63023eo.m95832j(r11, r3, r4)
            goto L_0x0459
        L_0x03f7:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95835m(r11, r3)
            goto L_0x0459
        L_0x0402:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95845w(r11, r3)
            goto L_0x0459
        L_0x040d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95847y(r11, r3)
            goto L_0x0459
        L_0x0418:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95848z(r11, r3)
            goto L_0x0459
        L_0x0423:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95797A(r11, r3)
            goto L_0x0459
        L_0x042e:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95802F(r11, r3)
            goto L_0x0459
        L_0x0439:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95798B(r11, r3)
            goto L_0x0459
        L_0x0444:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95847y(r11, r3)
            goto L_0x0459
        L_0x044f:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.C63023eo.m95848z(r11, r3)
        L_0x0459:
            int r6 = r6 + r3
            goto L_0x05b6
        L_0x045c:
            r9 = r8 & r15
            if (r9 == 0) goto L_0x05b6
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.protobuf.MessageLite r3 = (com.google.protobuf.MessageLite) r3
            com.google.protobuf.en r4 = r0.m95619E(r5)
            int r3 = com.google.protobuf.C62906an.m95312E(r11, r3, r4)
            goto L_0x0459
        L_0x046f:
            r10 = r8 & r15
            if (r10 == 0) goto L_0x05b6
            long r3 = r2.getLong(r1, r3)
            int r10 = r11 << 3
            int r10 = com.google.protobuf.C62906an.m95321N(r10)
            long r11 = r3 + r3
            long r3 = r3 >> r9
            long r3 = r3 ^ r11
            int r3 = com.google.protobuf.C62906an.m95322O(r3)
        L_0x0485:
            int r10 = r10 + r3
            int r6 = r6 + r10
            goto L_0x05b6
        L_0x0489:
            r9 = r8 & r15
            if (r9 == 0) goto L_0x05b6
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            int r9 = r3 + r3
            int r3 = r3 >> 31
            r3 = r3 ^ r9
            int r3 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x056f
        L_0x04a2:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x05b6
            int r3 = r11 << 3
            int r3 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x05b2
        L_0x04ae:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x05b6
            int r3 = r11 << 3
            int r3 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x05a4
        L_0x04ba:
            r9 = r8 & r15
            if (r9 == 0) goto L_0x05b6
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            int r3 = com.google.protobuf.C62906an.m95314G(r3)
            goto L_0x056f
        L_0x04ce:
            r9 = r8 & r15
            if (r9 == 0) goto L_0x05b6
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            int r3 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x056f
        L_0x04e2:
            r9 = r8 & r15
            if (r9 == 0) goto L_0x05b6
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.protobuf.z r3 = (com.google.protobuf.C63088z) r3
            int r4 = r11 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            int r3 = r3.mo59031d()
            int r9 = com.google.protobuf.C62906an.m95321N(r3)
        L_0x04fa:
            int r9 = r9 + r3
            int r4 = r4 + r9
            goto L_0x0570
        L_0x04fe:
            r9 = r8 & r15
            if (r9 == 0) goto L_0x05b6
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.protobuf.en r4 = r0.m95619E(r5)
            int r3 = com.google.protobuf.C63023eo.m95831i(r11, r3, r4)
            goto L_0x0459
        L_0x0510:
            r9 = r8 & r15
            if (r9 == 0) goto L_0x05b6
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof com.google.protobuf.C63088z
            if (r4 == 0) goto L_0x052d
            com.google.protobuf.z r3 = (com.google.protobuf.C63088z) r3
            int r4 = r11 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            int r3 = r3.mo59031d()
            int r9 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x04fa
        L_0x052d:
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r11 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            int r3 = com.google.protobuf.C62906an.m95319L(r3)
            goto L_0x056f
        L_0x053a:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x05b6
            int r3 = r11 << 3
            int r3 = com.google.protobuf.C62906an.m95321N(r3)
        L_0x0544:
            int r3 = r3 + r14
            goto L_0x0459
        L_0x0547:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x05b6
            int r3 = r11 << 3
            int r3 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x05a4
        L_0x0552:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x05b6
            int r3 = r11 << 3
            int r3 = com.google.protobuf.C62906an.m95321N(r3)
            goto L_0x05b2
        L_0x055d:
            r9 = r8 & r15
            if (r9 == 0) goto L_0x05b6
            int r3 = r2.getInt(r1, r3)
            int r4 = r11 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            int r3 = com.google.protobuf.C62906an.m95314G(r3)
        L_0x056f:
            int r4 = r4 + r3
        L_0x0570:
            int r6 = r6 + r4
            goto L_0x05b6
        L_0x0572:
            r9 = r8 & r15
            if (r9 == 0) goto L_0x05b6
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.protobuf.C62906an.m95321N(r9)
            int r3 = com.google.protobuf.C62906an.m95322O(r3)
            goto L_0x0597
        L_0x0585:
            r9 = r8 & r15
            if (r9 == 0) goto L_0x05b6
            long r3 = r2.getLong(r1, r3)
            int r9 = r11 << 3
            int r9 = com.google.protobuf.C62906an.m95321N(r9)
            int r3 = com.google.protobuf.C62906an.m95322O(r3)
        L_0x0597:
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x05b6
        L_0x059a:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x05b6
            int r3 = r11 << 3
            int r3 = com.google.protobuf.C62906an.m95321N(r3)
        L_0x05a4:
            int r3 = r3 + 4
            goto L_0x0459
        L_0x05a8:
            r3 = r8 & r15
            if (r3 == 0) goto L_0x05b6
            int r3 = r11 << 3
            int r3 = com.google.protobuf.C62906an.m95321N(r3)
        L_0x05b2:
            int r3 = r3 + 8
            goto L_0x0459
        L_0x05b6:
            int r5 = r5 + 3
            r4 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000f
        L_0x05bd:
            com.google.protobuf.fi r2 = r0.f170076p
            java.lang.Object r3 = r2.mo59089d(r1)
            int r2 = r2.mo59086a(r3)
            int r6 = r6 + r2
            boolean r2 = r0.f170068h
            if (r2 == 0) goto L_0x061b
            com.google.protobuf.bb r2 = r0.f170077q
            com.google.protobuf.bf r1 = r2.mo58834b(r1)
            r3 = 0
            r13 = 0
        L_0x05d4:
            com.google.protobuf.ew r2 = r1.f169888b
            int r2 = r2.mo59064a()
            if (r3 >= r2) goto L_0x05f4
            com.google.protobuf.ew r2 = r1.f169888b
            java.util.Map$Entry r2 = r2.mo59070e(r3)
            java.lang.Object r4 = r2.getKey()
            com.google.protobuf.bs r4 = (com.google.protobuf.C62939bs) r4
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.protobuf.C62926bf.m95400j(r4, r2)
            int r13 = r13 + r2
            int r3 = r3 + 1
            goto L_0x05d4
        L_0x05f4:
            com.google.protobuf.ew r1 = r1.f169888b
            java.lang.Iterable r1 = r1.mo59065b()
            java.util.Iterator r1 = r1.iterator()
        L_0x05fe:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x061a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.protobuf.bs r3 = (com.google.protobuf.C62939bs) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.protobuf.C62926bf.m95400j(r3, r2)
            int r13 = r13 + r2
            goto L_0x05fe
        L_0x061a:
            int r6 = r6 + r13
        L_0x061b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C63003dv.m95645q(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0379, code lost:
        r4 = (r4 + r6) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0520, code lost:
        r5 = r5 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0574, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x05a8, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05a9, code lost:
        r3 = r3 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x05d8, code lost:
        r3 = r3 + (r6 + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x05e7, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x05f7, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x05fb, code lost:
        r2 = r2 + 3;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m95646r(java.lang.Object r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f170062c
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0005:
            int[] r4 = r11.f170064d
            int r4 = r4.length
            if (r2 >= r4) goto L_0x05ff
            int r4 = r11.m95616B(r2)
            int r5 = m95615A(r4)
            int[] r6 = r11.f170064d
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r8 = (long) r4
            com.google.protobuf.bh r4 = com.google.protobuf.C62928bh.DOUBLE_LIST_PACKED
            int r4 = r4.f169950Z
            if (r5 < r4) goto L_0x002f
            com.google.protobuf.bh r4 = com.google.protobuf.C62928bh.SINT64_LIST_PACKED
            int r4 = r4.f169950Z
            if (r5 > r4) goto L_0x002f
            int[] r4 = r11.f170064d
            int r10 = r2 + 2
            r4 = r4[r10]
            r4 = r4 & r7
            goto L_0x0030
        L_0x002f:
            r4 = 0
        L_0x0030:
            r7 = 63
            switch(r5) {
                case 0: goto L_0x05eb;
                case 1: goto L_0x05db;
                case 2: goto L_0x05c2;
                case 3: goto L_0x05ab;
                case 4: goto L_0x0592;
                case 5: goto L_0x0585;
                case 6: goto L_0x0578;
                case 7: goto L_0x0568;
                case 8: goto L_0x053a;
                case 9: goto L_0x0524;
                case 10: goto L_0x0504;
                case 11: goto L_0x04ec;
                case 12: goto L_0x04d4;
                case 13: goto L_0x04c6;
                case 14: goto L_0x04b8;
                case 15: goto L_0x049b;
                case 16: goto L_0x047f;
                case 17: goto L_0x0468;
                case 18: goto L_0x0459;
                case 19: goto L_0x044c;
                case 20: goto L_0x043f;
                case 21: goto L_0x0432;
                case 22: goto L_0x0425;
                case 23: goto L_0x0418;
                case 24: goto L_0x040b;
                case 25: goto L_0x03fe;
                case 26: goto L_0x03f1;
                case 27: goto L_0x03df;
                case 28: goto L_0x03d1;
                case 29: goto L_0x03c3;
                case 30: goto L_0x03b5;
                case 31: goto L_0x03a7;
                case 32: goto L_0x0399;
                case 33: goto L_0x038b;
                case 34: goto L_0x037d;
                case 35: goto L_0x035d;
                case 36: goto L_0x0340;
                case 37: goto L_0x0323;
                case 38: goto L_0x0306;
                case 39: goto L_0x02e8;
                case 40: goto L_0x02ca;
                case 41: goto L_0x02ac;
                case 42: goto L_0x028e;
                case 43: goto L_0x0270;
                case 44: goto L_0x0252;
                case 45: goto L_0x0234;
                case 46: goto L_0x0216;
                case 47: goto L_0x01f8;
                case 48: goto L_0x01da;
                case 49: goto L_0x01c8;
                case 50: goto L_0x01b8;
                case 51: goto L_0x01aa;
                case 52: goto L_0x019c;
                case 53: goto L_0x0186;
                case 54: goto L_0x0170;
                case 55: goto L_0x015a;
                case 56: goto L_0x014c;
                case 57: goto L_0x013e;
                case 58: goto L_0x0130;
                case 59: goto L_0x0100;
                case 60: goto L_0x00ea;
                case 61: goto L_0x00cc;
                case 62: goto L_0x00b6;
                case 63: goto L_0x00a0;
                case 64: goto L_0x0092;
                case 65: goto L_0x0084;
                case 66: goto L_0x0069;
                case 67: goto L_0x004f;
                case 68: goto L_0x0037;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x05fb
        L_0x0037:
            boolean r4 = r11.m95633S(r12, r6, r2)
            if (r4 == 0) goto L_0x05fb
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            com.google.protobuf.MessageLite r4 = (com.google.protobuf.MessageLite) r4
            com.google.protobuf.en r5 = r11.m95619E(r2)
            int r4 = com.google.protobuf.C62906an.m95312E(r6, r4, r5)
            goto L_0x0465
        L_0x004f:
            boolean r4 = r11.m95633S(r12, r6, r2)
            if (r4 == 0) goto L_0x05fb
            long r4 = m95617C(r12, r8)
            int r6 = r6 << 3
            int r6 = com.google.protobuf.C62906an.m95321N(r6)
            long r8 = r4 + r4
            long r4 = r4 >> r7
            long r4 = r4 ^ r8
            int r4 = com.google.protobuf.C62906an.m95322O(r4)
            goto L_0x05d8
        L_0x0069:
            boolean r4 = r11.m95633S(r12, r6, r2)
            if (r4 == 0) goto L_0x05fb
            int r4 = m95647s(r12, r8)
            int r5 = r6 << 3
            int r5 = com.google.protobuf.C62906an.m95321N(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            goto L_0x05a8
        L_0x0084:
            boolean r4 = r11.m95633S(r12, r6, r2)
            if (r4 == 0) goto L_0x05fb
            int r4 = r6 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            goto L_0x05f7
        L_0x0092:
            boolean r4 = r11.m95633S(r12, r6, r2)
            if (r4 == 0) goto L_0x05fb
            int r4 = r6 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            goto L_0x05e7
        L_0x00a0:
            boolean r4 = r11.m95633S(r12, r6, r2)
            if (r4 == 0) goto L_0x05fb
            int r4 = m95647s(r12, r8)
            int r5 = r6 << 3
            int r5 = com.google.protobuf.C62906an.m95321N(r5)
            int r4 = com.google.protobuf.C62906an.m95314G(r4)
            goto L_0x05a8
        L_0x00b6:
            boolean r4 = r11.m95633S(r12, r6, r2)
            if (r4 == 0) goto L_0x05fb
            int r4 = m95647s(r12, r8)
            int r5 = r6 << 3
            int r5 = com.google.protobuf.C62906an.m95321N(r5)
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            goto L_0x05a8
        L_0x00cc:
            boolean r4 = r11.m95633S(r12, r6, r2)
            if (r4 == 0) goto L_0x05fb
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            com.google.protobuf.z r4 = (com.google.protobuf.C63088z) r4
            int r5 = r6 << 3
            int r5 = com.google.protobuf.C62906an.m95321N(r5)
            int r4 = r4.mo59031d()
            int r6 = com.google.protobuf.C62906an.m95321N(r4)
            goto L_0x0520
        L_0x00ea:
            boolean r4 = r11.m95633S(r12, r6, r2)
            if (r4 == 0) goto L_0x05fb
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            com.google.protobuf.en r5 = r11.m95619E(r2)
            int r4 = com.google.protobuf.C63023eo.m95831i(r6, r4, r5)
            goto L_0x0465
        L_0x0100:
            boolean r4 = r11.m95633S(r12, r6, r2)
            if (r4 == 0) goto L_0x05fb
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            boolean r5 = r4 instanceof com.google.protobuf.C63088z
            if (r5 == 0) goto L_0x0122
            com.google.protobuf.z r4 = (com.google.protobuf.C63088z) r4
            int r5 = r6 << 3
            int r5 = com.google.protobuf.C62906an.m95321N(r5)
            int r4 = r4.mo59031d()
            int r6 = com.google.protobuf.C62906an.m95321N(r4)
            goto L_0x0520
        L_0x0122:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.protobuf.C62906an.m95321N(r5)
            int r4 = com.google.protobuf.C62906an.m95319L(r4)
            goto L_0x05a8
        L_0x0130:
            boolean r4 = r11.m95633S(r12, r6, r2)
            if (r4 == 0) goto L_0x05fb
            int r4 = r6 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            goto L_0x0574
        L_0x013e:
            boolean r4 = r11.m95633S(r12, r6, r2)
            if (r4 == 0) goto L_0x05fb
            int r4 = r6 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            goto L_0x05e7
        L_0x014c:
            boolean r4 = r11.m95633S(r12, r6, r2)
            if (r4 == 0) goto L_0x05fb
            int r4 = r6 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            goto L_0x05f7
        L_0x015a:
            boolean r4 = r11.m95633S(r12, r6, r2)
            if (r4 == 0) goto L_0x05fb
            int r4 = m95647s(r12, r8)
            int r5 = r6 << 3
            int r5 = com.google.protobuf.C62906an.m95321N(r5)
            int r4 = com.google.protobuf.C62906an.m95314G(r4)
            goto L_0x05a8
        L_0x0170:
            boolean r4 = r11.m95633S(r12, r6, r2)
            if (r4 == 0) goto L_0x05fb
            long r4 = m95617C(r12, r8)
            int r6 = r6 << 3
            int r6 = com.google.protobuf.C62906an.m95321N(r6)
            int r4 = com.google.protobuf.C62906an.m95322O(r4)
            goto L_0x05d8
        L_0x0186:
            boolean r4 = r11.m95633S(r12, r6, r2)
            if (r4 == 0) goto L_0x05fb
            long r4 = m95617C(r12, r8)
            int r6 = r6 << 3
            int r6 = com.google.protobuf.C62906an.m95321N(r6)
            int r4 = com.google.protobuf.C62906an.m95322O(r4)
            goto L_0x05d8
        L_0x019c:
            boolean r4 = r11.m95633S(r12, r6, r2)
            if (r4 == 0) goto L_0x05fb
            int r4 = r6 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            goto L_0x05e7
        L_0x01aa:
            boolean r4 = r11.m95633S(r12, r6, r2)
            if (r4 == 0) goto L_0x05fb
            int r4 = r6 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            goto L_0x05f7
        L_0x01b8:
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            java.lang.Object r5 = r11.m95621G(r2)
            int r4 = com.google.protobuf.C62996do.m95604a(r6, r4, r5)
            goto L_0x0465
        L_0x01c8:
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.en r5 = r11.m95619E(r2)
            int r4 = com.google.protobuf.C63023eo.m95828f(r6, r4, r5)
            goto L_0x0465
        L_0x01da:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C63023eo.m95834l(r5)
            if (r5 <= 0) goto L_0x05fb
            boolean r7 = r11.f170071k
            if (r7 == 0) goto L_0x01ee
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01ee:
            int r4 = com.google.protobuf.C62906an.m95320M(r6)
            int r6 = com.google.protobuf.C62906an.m95321N(r5)
            goto L_0x0379
        L_0x01f8:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C63023eo.m95833k(r5)
            if (r5 <= 0) goto L_0x05fb
            boolean r7 = r11.f170071k
            if (r7 == 0) goto L_0x020c
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x020c:
            int r4 = com.google.protobuf.C62906an.m95320M(r6)
            int r6 = com.google.protobuf.C62906an.m95321N(r5)
            goto L_0x0379
        L_0x0216:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C63023eo.m95827e(r5)
            if (r5 <= 0) goto L_0x05fb
            boolean r7 = r11.f170071k
            if (r7 == 0) goto L_0x022a
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x022a:
            int r4 = com.google.protobuf.C62906an.m95320M(r6)
            int r6 = com.google.protobuf.C62906an.m95321N(r5)
            goto L_0x0379
        L_0x0234:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C63023eo.m95826d(r5)
            if (r5 <= 0) goto L_0x05fb
            boolean r7 = r11.f170071k
            if (r7 == 0) goto L_0x0248
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0248:
            int r4 = com.google.protobuf.C62906an.m95320M(r6)
            int r6 = com.google.protobuf.C62906an.m95321N(r5)
            goto L_0x0379
        L_0x0252:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C63023eo.m95825c(r5)
            if (r5 <= 0) goto L_0x05fb
            boolean r7 = r11.f170071k
            if (r7 == 0) goto L_0x0266
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0266:
            int r4 = com.google.protobuf.C62906an.m95320M(r6)
            int r6 = com.google.protobuf.C62906an.m95321N(r5)
            goto L_0x0379
        L_0x0270:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C63023eo.m95836n(r5)
            if (r5 <= 0) goto L_0x05fb
            boolean r7 = r11.f170071k
            if (r7 == 0) goto L_0x0284
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0284:
            int r4 = com.google.protobuf.C62906an.m95320M(r6)
            int r6 = com.google.protobuf.C62906an.m95321N(r5)
            goto L_0x0379
        L_0x028e:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C63023eo.m95823a(r5)
            if (r5 <= 0) goto L_0x05fb
            boolean r7 = r11.f170071k
            if (r7 == 0) goto L_0x02a2
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02a2:
            int r4 = com.google.protobuf.C62906an.m95320M(r6)
            int r6 = com.google.protobuf.C62906an.m95321N(r5)
            goto L_0x0379
        L_0x02ac:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C63023eo.m95826d(r5)
            if (r5 <= 0) goto L_0x05fb
            boolean r7 = r11.f170071k
            if (r7 == 0) goto L_0x02c0
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02c0:
            int r4 = com.google.protobuf.C62906an.m95320M(r6)
            int r6 = com.google.protobuf.C62906an.m95321N(r5)
            goto L_0x0379
        L_0x02ca:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C63023eo.m95827e(r5)
            if (r5 <= 0) goto L_0x05fb
            boolean r7 = r11.f170071k
            if (r7 == 0) goto L_0x02de
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02de:
            int r4 = com.google.protobuf.C62906an.m95320M(r6)
            int r6 = com.google.protobuf.C62906an.m95321N(r5)
            goto L_0x0379
        L_0x02e8:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C63023eo.m95829g(r5)
            if (r5 <= 0) goto L_0x05fb
            boolean r7 = r11.f170071k
            if (r7 == 0) goto L_0x02fc
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02fc:
            int r4 = com.google.protobuf.C62906an.m95320M(r6)
            int r6 = com.google.protobuf.C62906an.m95321N(r5)
            goto L_0x0379
        L_0x0306:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C63023eo.m95837o(r5)
            if (r5 <= 0) goto L_0x05fb
            boolean r7 = r11.f170071k
            if (r7 == 0) goto L_0x031a
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x031a:
            int r4 = com.google.protobuf.C62906an.m95320M(r6)
            int r6 = com.google.protobuf.C62906an.m95321N(r5)
            goto L_0x0379
        L_0x0323:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C63023eo.m95830h(r5)
            if (r5 <= 0) goto L_0x05fb
            boolean r7 = r11.f170071k
            if (r7 == 0) goto L_0x0337
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0337:
            int r4 = com.google.protobuf.C62906an.m95320M(r6)
            int r6 = com.google.protobuf.C62906an.m95321N(r5)
            goto L_0x0379
        L_0x0340:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C63023eo.m95826d(r5)
            if (r5 <= 0) goto L_0x05fb
            boolean r7 = r11.f170071k
            if (r7 == 0) goto L_0x0354
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0354:
            int r4 = com.google.protobuf.C62906an.m95320M(r6)
            int r6 = com.google.protobuf.C62906an.m95321N(r5)
            goto L_0x0379
        L_0x035d:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.C63023eo.m95827e(r5)
            if (r5 <= 0) goto L_0x05fb
            boolean r7 = r11.f170071k
            if (r7 == 0) goto L_0x0371
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0371:
            int r4 = com.google.protobuf.C62906an.m95320M(r6)
            int r6 = com.google.protobuf.C62906an.m95321N(r5)
        L_0x0379:
            int r4 = r4 + r6
            int r4 = r4 + r5
            goto L_0x0465
        L_0x037d:
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C63023eo.m95800D(r6, r4)
            goto L_0x0465
        L_0x038b:
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C63023eo.m95799C(r6, r4)
            goto L_0x0465
        L_0x0399:
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C63023eo.m95848z(r6, r4)
            goto L_0x0465
        L_0x03a7:
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C63023eo.m95847y(r6, r4)
            goto L_0x0465
        L_0x03b5:
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C63023eo.m95846x(r6, r4)
            goto L_0x0465
        L_0x03c3:
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C63023eo.m95801E(r6, r4)
            goto L_0x0465
        L_0x03d1:
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C63023eo.m95824b(r6, r4)
            goto L_0x0465
        L_0x03df:
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            java.util.List r4 = (java.util.List) r4
            com.google.protobuf.en r5 = r11.m95619E(r2)
            int r4 = com.google.protobuf.C63023eo.m95832j(r6, r4, r5)
            goto L_0x0465
        L_0x03f1:
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C63023eo.m95835m(r6, r4)
            goto L_0x0465
        L_0x03fe:
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C63023eo.m95845w(r6, r4)
            goto L_0x0465
        L_0x040b:
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C63023eo.m95847y(r6, r4)
            goto L_0x0465
        L_0x0418:
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C63023eo.m95848z(r6, r4)
            goto L_0x0465
        L_0x0425:
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C63023eo.m95797A(r6, r4)
            goto L_0x0465
        L_0x0432:
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C63023eo.m95802F(r6, r4)
            goto L_0x0465
        L_0x043f:
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C63023eo.m95798B(r6, r4)
            goto L_0x0465
        L_0x044c:
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C63023eo.m95847y(r6, r4)
            goto L_0x0465
        L_0x0459:
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C63023eo.m95848z(r6, r4)
        L_0x0465:
            int r3 = r3 + r4
            goto L_0x05fb
        L_0x0468:
            boolean r4 = r11.m95630P(r12, r2)
            if (r4 == 0) goto L_0x05fb
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            com.google.protobuf.MessageLite r4 = (com.google.protobuf.MessageLite) r4
            com.google.protobuf.en r5 = r11.m95619E(r2)
            int r4 = com.google.protobuf.C62906an.m95312E(r6, r4, r5)
            goto L_0x0465
        L_0x047f:
            boolean r4 = r11.m95630P(r12, r2)
            if (r4 == 0) goto L_0x05fb
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            long r4 = r4.mo59136n(r12, r8)
            int r6 = r6 << 3
            int r6 = com.google.protobuf.C62906an.m95321N(r6)
            long r8 = r4 + r4
            long r4 = r4 >> r7
            long r4 = r4 ^ r8
            int r4 = com.google.protobuf.C62906an.m95322O(r4)
            goto L_0x05d8
        L_0x049b:
            boolean r4 = r11.m95630P(r12, r2)
            if (r4 == 0) goto L_0x05fb
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            int r4 = r4.mo59135m(r12, r8)
            int r5 = r6 << 3
            int r5 = com.google.protobuf.C62906an.m95321N(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            goto L_0x05a8
        L_0x04b8:
            boolean r4 = r11.m95630P(r12, r2)
            if (r4 == 0) goto L_0x05fb
            int r4 = r6 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            goto L_0x05f7
        L_0x04c6:
            boolean r4 = r11.m95630P(r12, r2)
            if (r4 == 0) goto L_0x05fb
            int r4 = r6 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            goto L_0x05e7
        L_0x04d4:
            boolean r4 = r11.m95630P(r12, r2)
            if (r4 == 0) goto L_0x05fb
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            int r4 = r4.mo59135m(r12, r8)
            int r5 = r6 << 3
            int r5 = com.google.protobuf.C62906an.m95321N(r5)
            int r4 = com.google.protobuf.C62906an.m95314G(r4)
            goto L_0x05a8
        L_0x04ec:
            boolean r4 = r11.m95630P(r12, r2)
            if (r4 == 0) goto L_0x05fb
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            int r4 = r4.mo59135m(r12, r8)
            int r5 = r6 << 3
            int r5 = com.google.protobuf.C62906an.m95321N(r5)
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            goto L_0x05a8
        L_0x0504:
            boolean r4 = r11.m95630P(r12, r2)
            if (r4 == 0) goto L_0x05fb
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            com.google.protobuf.z r4 = (com.google.protobuf.C63088z) r4
            int r5 = r6 << 3
            int r5 = com.google.protobuf.C62906an.m95321N(r5)
            int r4 = r4.mo59031d()
            int r6 = com.google.protobuf.C62906an.m95321N(r4)
        L_0x0520:
            int r6 = r6 + r4
            int r5 = r5 + r6
            goto L_0x05a9
        L_0x0524:
            boolean r4 = r11.m95630P(r12, r2)
            if (r4 == 0) goto L_0x05fb
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            com.google.protobuf.en r5 = r11.m95619E(r2)
            int r4 = com.google.protobuf.C63023eo.m95831i(r6, r4, r5)
            goto L_0x0465
        L_0x053a:
            boolean r4 = r11.m95630P(r12, r2)
            if (r4 == 0) goto L_0x05fb
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r4 = r4.mo59138p(r12, r8)
            boolean r5 = r4 instanceof com.google.protobuf.C63088z
            if (r5 == 0) goto L_0x055b
            com.google.protobuf.z r4 = (com.google.protobuf.C63088z) r4
            int r5 = r6 << 3
            int r5 = com.google.protobuf.C62906an.m95321N(r5)
            int r4 = r4.mo59031d()
            int r6 = com.google.protobuf.C62906an.m95321N(r4)
            goto L_0x0520
        L_0x055b:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r6 << 3
            int r5 = com.google.protobuf.C62906an.m95321N(r5)
            int r4 = com.google.protobuf.C62906an.m95319L(r4)
            goto L_0x05a8
        L_0x0568:
            boolean r4 = r11.m95630P(r12, r2)
            if (r4 == 0) goto L_0x05fb
            int r4 = r6 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
        L_0x0574:
            int r4 = r4 + 1
            goto L_0x0465
        L_0x0578:
            boolean r4 = r11.m95630P(r12, r2)
            if (r4 == 0) goto L_0x05fb
            int r4 = r6 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            goto L_0x05e7
        L_0x0585:
            boolean r4 = r11.m95630P(r12, r2)
            if (r4 == 0) goto L_0x05fb
            int r4 = r6 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
            goto L_0x05f7
        L_0x0592:
            boolean r4 = r11.m95630P(r12, r2)
            if (r4 == 0) goto L_0x05fb
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            int r4 = r4.mo59135m(r12, r8)
            int r5 = r6 << 3
            int r5 = com.google.protobuf.C62906an.m95321N(r5)
            int r4 = com.google.protobuf.C62906an.m95314G(r4)
        L_0x05a8:
            int r5 = r5 + r4
        L_0x05a9:
            int r3 = r3 + r5
            goto L_0x05fb
        L_0x05ab:
            boolean r4 = r11.m95630P(r12, r2)
            if (r4 == 0) goto L_0x05fb
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            long r4 = r4.mo59136n(r12, r8)
            int r6 = r6 << 3
            int r6 = com.google.protobuf.C62906an.m95321N(r6)
            int r4 = com.google.protobuf.C62906an.m95322O(r4)
            goto L_0x05d8
        L_0x05c2:
            boolean r4 = r11.m95630P(r12, r2)
            if (r4 == 0) goto L_0x05fb
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a
            long r4 = r4.mo59136n(r12, r8)
            int r6 = r6 << 3
            int r6 = com.google.protobuf.C62906an.m95321N(r6)
            int r4 = com.google.protobuf.C62906an.m95322O(r4)
        L_0x05d8:
            int r6 = r6 + r4
            int r3 = r3 + r6
            goto L_0x05fb
        L_0x05db:
            boolean r4 = r11.m95630P(r12, r2)
            if (r4 == 0) goto L_0x05fb
            int r4 = r6 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
        L_0x05e7:
            int r4 = r4 + 4
            goto L_0x0465
        L_0x05eb:
            boolean r4 = r11.m95630P(r12, r2)
            if (r4 == 0) goto L_0x05fb
            int r4 = r6 << 3
            int r4 = com.google.protobuf.C62906an.m95321N(r4)
        L_0x05f7:
            int r4 = r4 + 8
            goto L_0x0465
        L_0x05fb:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x05ff:
            com.google.protobuf.fi r0 = r11.f170076p
            java.lang.Object r12 = r0.mo59089d(r12)
            int r12 = r0.mo59086a(r12)
            int r3 = r3 + r12
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C63003dv.m95646r(java.lang.Object):int");
    }

    /* renamed from: s */
    private static int m95647s(Object obj, long j) {
        return ((Integer) C63054fs.f170169a.mo59138p(obj, j)).intValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v6, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m95648t(java.lang.Object r17, byte[] r18, int r19, int r20, int r21, long r22, com.google.protobuf.C63071i r24) {
        /*
            r16 = this;
            r0 = r17
            r6 = r18
            r7 = r20
            r1 = r22
            r8 = r24
            sun.misc.Unsafe r3 = f170062c
            r9 = r16
            r4 = r21
            java.lang.Object r4 = r9.m95621G(r4)
            java.lang.Object r5 = r3.getObject(r0, r1)
            boolean r10 = com.google.protobuf.C62996do.m95605b(r5)
            if (r10 == 0) goto L_0x002b
            com.google.protobuf.dn r10 = com.google.protobuf.C62995dn.f170057a
            com.google.protobuf.dn r10 = r10.mo58980a()
            com.google.protobuf.C62996do.m95606c(r10, r5)
            r3.putObject(r0, r1, r10)
            r5 = r10
        L_0x002b:
            com.google.protobuf.dm r4 = (com.google.protobuf.C62994dm) r4
            com.google.protobuf.dl r10 = r4.f170056a
            r11 = r5
            com.google.protobuf.dn r11 = (com.google.protobuf.C62995dn) r11
            r0 = r19
            int r0 = com.google.protobuf.C63072j.m96029r(r6, r0, r8)
            int r1 = r8.f170219a
            if (r1 < 0) goto L_0x00a1
            int r2 = r7 - r0
            if (r1 > r2) goto L_0x00a1
            int r12 = r0 + r1
            java.lang.Object r1 = r10.f170053b
            java.lang.Object r2 = r10.f170055d
            r13 = r1
            r14 = r2
        L_0x0048:
            if (r0 >= r12) goto L_0x0096
            int r1 = r0 + 1
            byte r0 = r6[r0]
            if (r0 >= 0) goto L_0x0059
            int r0 = com.google.protobuf.C63072j.m96030s(r0, r6, r1, r8)
            int r1 = r8.f170219a
            r15 = r1
            r1 = r0
            r0 = r15
        L_0x0059:
            r2 = r0 & 7
            int r3 = r0 >>> 3
            r4 = 1
            if (r3 == r4) goto L_0x007d
            r4 = 2
            if (r3 == r4) goto L_0x0064
            goto L_0x0091
        L_0x0064:
            com.google.protobuf.gd r3 = r10.f170054c
            int r4 = r3.f170204t
            if (r2 != r4) goto L_0x0091
            java.lang.Object r0 = r10.f170055d
            java.lang.Class r4 = r0.getClass()
            r0 = r18
            r2 = r20
            r5 = r24
            int r0 = m95635U(r0, r1, r2, r3, r4, r5)
            java.lang.Object r14 = r8.f170221c
            goto L_0x0048
        L_0x007d:
            com.google.protobuf.gd r3 = r10.f170052a
            int r4 = r3.f170204t
            if (r2 != r4) goto L_0x0091
            r4 = 0
            r0 = r18
            r2 = r20
            r5 = r24
            int r0 = m95635U(r0, r1, r2, r3, r4, r5)
            java.lang.Object r13 = r8.f170221c
            goto L_0x0048
        L_0x0091:
            int r0 = com.google.protobuf.C63072j.m96033v(r0, r6, r1, r7, r8)
            goto L_0x0048
        L_0x0096:
            if (r0 != r12) goto L_0x009c
            r11.put(r13, r14)
            return r12
        L_0x009c:
            com.google.protobuf.ct r0 = com.google.protobuf.C62974ct.m95556f()
            throw r0
        L_0x00a1:
            com.google.protobuf.ct r0 = com.google.protobuf.C62974ct.m95559i()
            goto L_0x00a7
        L_0x00a6:
            throw r0
        L_0x00a7:
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C63003dv.m95648t(java.lang.Object, byte[], int, int, int, long, com.google.protobuf.i):int");
    }

    /* renamed from: u */
    private final int m95649u(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C63071i iVar) {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        C63071i iVar2 = iVar;
        Unsafe unsafe = f170062c;
        long j3 = (long) (this.f170064d[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(C63072j.m96034w(bArr, i))));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(C63072j.m96013b(bArr, i))));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int u = C63072j.m96032u(bArr2, i9, iVar2);
                    unsafe.putObject(obj2, j2, Long.valueOf(iVar2.f170220b));
                    unsafe.putInt(obj2, j3, i11);
                    return u;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int r = C63072j.m96029r(bArr2, i9, iVar2);
                    unsafe.putObject(obj2, j2, Integer.valueOf(iVar2.f170219a));
                    unsafe.putInt(obj2, j3, i11);
                    return r;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(obj2, j2, Long.valueOf(C63072j.m96034w(bArr, i)));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(obj2, j2, Integer.valueOf(C63072j.m96013b(bArr, i)));
                    unsafe.putInt(obj2, j3, i11);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int u2 = C63072j.m96032u(bArr2, i9, iVar2);
                    unsafe.putObject(obj2, j2, Boolean.valueOf(iVar2.f170220b != 0));
                    unsafe.putInt(obj2, j3, i11);
                    return u2;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int r2 = C63072j.m96029r(bArr2, i9, iVar2);
                    int i14 = iVar2.f170219a;
                    if (i14 == 0) {
                        unsafe.putObject(obj2, j2, BuildConfig.FLAVOR);
                    } else if ((i6 & 536870912) == 0 || C63059fx.f170178a.mo59150h(bArr2, r2, r2 + i14)) {
                        unsafe.putObject(obj2, j2, new String(bArr2, r2, i14, C62972cr.f170009a));
                        r2 += i14;
                    } else {
                        throw C62974ct.m95553c();
                    }
                    unsafe.putInt(obj2, j3, i11);
                    return r2;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int d = C63072j.m96015d(m95619E(i13), bArr2, i9, i2, iVar2);
                    Object object = unsafe.getInt(obj2, j3) == i11 ? unsafe.getObject(obj2, j2) : null;
                    if (object == null) {
                        unsafe.putObject(obj2, j2, iVar2.f170221c);
                    } else {
                        unsafe.putObject(obj2, j2, C62972cr.m95545e(object, iVar2.f170221c));
                    }
                    unsafe.putInt(obj2, j3, i11);
                    return d;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int a = C63072j.m96012a(bArr2, i9, iVar2);
                    unsafe.putObject(obj2, j2, iVar2.f170221c);
                    unsafe.putInt(obj2, j3, i11);
                    return a;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int r3 = C63072j.m96029r(bArr2, i9, iVar2);
                    int i15 = iVar2.f170219a;
                    C62959cf D = m95618D(i13);
                    if (D == null || D.isInRange(i15)) {
                        unsafe.putObject(obj2, j2, Integer.valueOf(i15));
                        unsafe.putInt(obj2, j3, i11);
                    } else {
                        m95640d(obj).mo59107d(i10, Long.valueOf((long) i15));
                    }
                    return r3;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int r4 = C63072j.m96029r(bArr2, i9, iVar2);
                    unsafe.putObject(obj2, j2, Integer.valueOf(C62897ae.m95107I(iVar2.f170219a)));
                    unsafe.putInt(obj2, j3, i11);
                    return r4;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int u3 = C63072j.m96032u(bArr2, i9, iVar2);
                    unsafe.putObject(obj2, j2, Long.valueOf(C62897ae.m95109K(iVar2.f170220b)));
                    unsafe.putInt(obj2, j3, i11);
                    return u3;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int c = C63072j.m96014c(m95619E(i13), bArr, i, i2, (i10 & -8) | 4, iVar);
                    Object object2 = unsafe.getInt(obj2, j3) == i11 ? unsafe.getObject(obj2, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj2, j2, iVar2.f170221c);
                    } else {
                        unsafe.putObject(obj2, j2, C62972cr.m95545e(object2, iVar2.f170221c));
                    }
                    unsafe.putInt(obj2, j3, i11);
                    return c;
                }
                break;
        }
        return i9;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0148 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x037a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x037a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0196  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m95650v(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.protobuf.C63071i r29) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f170062c
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.protobuf.cq r12 = (com.google.protobuf.C62971cq) r12
            boolean r13 = r12.mo58948c()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.protobuf.cq r12 = r12.mo58798e(r13)
            r11.putObject(r1, r9, r12)
        L_0x0032:
            r9 = 5
            r10 = 0
            r13 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x0328;
                case 19: goto L_0x02f7;
                case 20: goto L_0x02cc;
                case 21: goto L_0x02cc;
                case 22: goto L_0x02b1;
                case 23: goto L_0x0288;
                case 24: goto L_0x025f;
                case 25: goto L_0x0225;
                case 26: goto L_0x016e;
                case 27: goto L_0x0153;
                case 28: goto L_0x00f9;
                case 29: goto L_0x02b1;
                case 30: goto L_0x00c2;
                case 31: goto L_0x025f;
                case 32: goto L_0x0288;
                case 33: goto L_0x008f;
                case 34: goto L_0x005c;
                case 35: goto L_0x0328;
                case 36: goto L_0x02f7;
                case 37: goto L_0x02cc;
                case 38: goto L_0x02cc;
                case 39: goto L_0x02b1;
                case 40: goto L_0x0288;
                case 41: goto L_0x025f;
                case 42: goto L_0x0225;
                case 43: goto L_0x02b1;
                case 44: goto L_0x00c2;
                case 45: goto L_0x025f;
                case 46: goto L_0x0288;
                case 47: goto L_0x008f;
                case 48: goto L_0x005c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = 3
            if (r6 != r1) goto L_0x037a
            com.google.protobuf.en r1 = r15.m95619E(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.protobuf.C63072j.m96014c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f170221c
            r12.add(r8)
            goto L_0x0358
        L_0x005c:
            if (r6 != r14) goto L_0x0064
            int r1 = com.google.protobuf.C63072j.m96023l(r3, r4, r12, r7)
            goto L_0x037b
        L_0x0064:
            if (r6 != 0) goto L_0x037a
            com.google.protobuf.dh r12 = (com.google.protobuf.C62989dh) r12
            int r1 = com.google.protobuf.C63072j.m96032u(r3, r4, r7)
            long r8 = r7.f170220b
            long r8 = com.google.protobuf.C62897ae.m95109K(r8)
            r12.mo58929f(r8)
        L_0x0075:
            if (r1 >= r5) goto L_0x008e
            int r4 = com.google.protobuf.C63072j.m96029r(r3, r1, r7)
            int r6 = r7.f170219a
            if (r2 == r6) goto L_0x0080
            goto L_0x008e
        L_0x0080:
            int r1 = com.google.protobuf.C63072j.m96032u(r3, r4, r7)
            long r8 = r7.f170220b
            long r8 = com.google.protobuf.C62897ae.m95109K(r8)
            r12.mo58929f(r8)
            goto L_0x0075
        L_0x008e:
            return r1
        L_0x008f:
            if (r6 != r14) goto L_0x0097
            int r1 = com.google.protobuf.C63072j.m96022k(r3, r4, r12, r7)
            goto L_0x037b
        L_0x0097:
            if (r6 != 0) goto L_0x037a
            com.google.protobuf.ca r12 = (com.google.protobuf.C62954ca) r12
            int r1 = com.google.protobuf.C63072j.m96029r(r3, r4, r7)
            int r4 = r7.f170219a
            int r4 = com.google.protobuf.C62897ae.m95107I(r4)
            r12.mo58916g(r4)
        L_0x00a8:
            if (r1 >= r5) goto L_0x00c1
            int r4 = com.google.protobuf.C63072j.m96029r(r3, r1, r7)
            int r6 = r7.f170219a
            if (r2 == r6) goto L_0x00b3
            goto L_0x00c1
        L_0x00b3:
            int r1 = com.google.protobuf.C63072j.m96029r(r3, r4, r7)
            int r4 = r7.f170219a
            int r4 = com.google.protobuf.C62897ae.m95107I(r4)
            r12.mo58916g(r4)
            goto L_0x00a8
        L_0x00c1:
            return r1
        L_0x00c2:
            if (r6 != r14) goto L_0x00c9
            int r2 = com.google.protobuf.C63072j.m96024m(r3, r4, r12, r7)
            goto L_0x00da
        L_0x00c9:
            if (r6 != 0) goto L_0x037a
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.protobuf.C63072j.m96031t(r2, r3, r4, r5, r6, r7)
        L_0x00da:
            com.google.protobuf.bv r1 = (com.google.protobuf.C62942bv) r1
            com.google.protobuf.fj r3 = r1.unknownFields
            com.google.protobuf.fj r4 = com.google.protobuf.C63045fj.f170156a
            if (r3 != r4) goto L_0x00e3
            r3 = 0
        L_0x00e3:
            com.google.protobuf.cf r4 = r15.m95618D(r8)
            com.google.protobuf.fi r5 = r0.f170076p
            r6 = r21
            java.lang.Object r3 = com.google.protobuf.C63023eo.m95839q(r6, r12, r4, r3, r5)
            com.google.protobuf.fj r3 = (com.google.protobuf.C63045fj) r3
            if (r3 != 0) goto L_0x00f6
            r1 = r2
            goto L_0x037b
        L_0x00f6:
            r1.unknownFields = r3
            return r2
        L_0x00f9:
            if (r6 != r14) goto L_0x037a
            int r1 = com.google.protobuf.C63072j.m96029r(r3, r4, r7)
            int r4 = r7.f170219a
            if (r4 < 0) goto L_0x014e
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0149
            if (r4 != 0) goto L_0x010f
            com.google.protobuf.z r4 = com.google.protobuf.C63088z.f170246b
            r12.add(r4)
            goto L_0x0117
        L_0x010f:
            com.google.protobuf.z r6 = com.google.protobuf.C63088z.m96142D(r3, r1, r4)
            r12.add(r6)
        L_0x0116:
            int r1 = r1 + r4
        L_0x0117:
            if (r1 >= r5) goto L_0x0148
            int r4 = com.google.protobuf.C63072j.m96029r(r3, r1, r7)
            int r6 = r7.f170219a
            if (r2 == r6) goto L_0x0122
            goto L_0x0148
        L_0x0122:
            int r1 = com.google.protobuf.C63072j.m96029r(r3, r4, r7)
            int r4 = r7.f170219a
            if (r4 < 0) goto L_0x0143
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x013e
            if (r4 != 0) goto L_0x0136
            com.google.protobuf.z r4 = com.google.protobuf.C63088z.f170246b
            r12.add(r4)
            goto L_0x0117
        L_0x0136:
            com.google.protobuf.z r6 = com.google.protobuf.C63088z.m96142D(r3, r1, r4)
            r12.add(r6)
            goto L_0x0116
        L_0x013e:
            com.google.protobuf.ct r1 = com.google.protobuf.C62974ct.m95559i()
            throw r1
        L_0x0143:
            com.google.protobuf.ct r1 = com.google.protobuf.C62974ct.m95555e()
            throw r1
        L_0x0148:
            return r1
        L_0x0149:
            com.google.protobuf.ct r1 = com.google.protobuf.C62974ct.m95559i()
            throw r1
        L_0x014e:
            com.google.protobuf.ct r1 = com.google.protobuf.C62974ct.m95555e()
            throw r1
        L_0x0153:
            if (r6 == r14) goto L_0x0157
            goto L_0x037a
        L_0x0157:
            com.google.protobuf.en r1 = r15.m95619E(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.protobuf.C63072j.m96016e(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x016e:
            if (r6 != r14) goto L_0x037a
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x01c1
            int r4 = com.google.protobuf.C63072j.m96029r(r3, r4, r7)
            int r6 = r7.f170219a
            if (r6 < 0) goto L_0x01bc
            if (r6 != 0) goto L_0x0189
            r12.add(r1)
            goto L_0x0194
        L_0x0189:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.protobuf.C62972cr.f170009a
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
        L_0x0193:
            int r4 = r4 + r6
        L_0x0194:
            if (r4 >= r5) goto L_0x037a
            int r6 = com.google.protobuf.C63072j.m96029r(r3, r4, r7)
            int r8 = r7.f170219a
            if (r2 != r8) goto L_0x037a
            int r4 = com.google.protobuf.C63072j.m96029r(r3, r6, r7)
            int r6 = r7.f170219a
            if (r6 < 0) goto L_0x01b7
            if (r6 != 0) goto L_0x01ac
            r12.add(r1)
            goto L_0x0194
        L_0x01ac:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.protobuf.C62972cr.f170009a
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
            goto L_0x0193
        L_0x01b7:
            com.google.protobuf.ct r1 = com.google.protobuf.C62974ct.m95555e()
            throw r1
        L_0x01bc:
            com.google.protobuf.ct r1 = com.google.protobuf.C62974ct.m95555e()
            throw r1
        L_0x01c1:
            int r4 = com.google.protobuf.C63072j.m96029r(r3, r4, r7)
            int r6 = r7.f170219a
            if (r6 < 0) goto L_0x0220
            if (r6 != 0) goto L_0x01cf
            r12.add(r1)
            goto L_0x01e4
        L_0x01cf:
            int r8 = r4 + r6
            com.google.protobuf.fu r9 = com.google.protobuf.C63059fx.f170178a
            boolean r9 = r9.mo59150h(r3, r4, r8)
            if (r9 == 0) goto L_0x021b
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.protobuf.C62972cr.f170009a
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
        L_0x01e3:
            r4 = r8
        L_0x01e4:
            if (r4 >= r5) goto L_0x037a
            int r6 = com.google.protobuf.C63072j.m96029r(r3, r4, r7)
            int r8 = r7.f170219a
            if (r2 != r8) goto L_0x037a
            int r4 = com.google.protobuf.C63072j.m96029r(r3, r6, r7)
            int r6 = r7.f170219a
            if (r6 < 0) goto L_0x0216
            if (r6 != 0) goto L_0x01fc
            r12.add(r1)
            goto L_0x01e4
        L_0x01fc:
            int r8 = r4 + r6
            com.google.protobuf.fu r9 = com.google.protobuf.C63059fx.f170178a
            boolean r9 = r9.mo59150h(r3, r4, r8)
            if (r9 == 0) goto L_0x0211
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.protobuf.C62972cr.f170009a
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
            goto L_0x01e3
        L_0x0211:
            com.google.protobuf.ct r1 = com.google.protobuf.C62974ct.m95553c()
            throw r1
        L_0x0216:
            com.google.protobuf.ct r1 = com.google.protobuf.C62974ct.m95555e()
            throw r1
        L_0x021b:
            com.google.protobuf.ct r1 = com.google.protobuf.C62974ct.m95553c()
            throw r1
        L_0x0220:
            com.google.protobuf.ct r1 = com.google.protobuf.C62974ct.m95555e()
            throw r1
        L_0x0225:
            if (r6 != r14) goto L_0x022d
            int r1 = com.google.protobuf.C63072j.m96017f(r3, r4, r12, r7)
            goto L_0x037b
        L_0x022d:
            if (r6 != 0) goto L_0x037a
            com.google.protobuf.p r12 = (com.google.protobuf.C63078p) r12
            int r1 = com.google.protobuf.C63072j.m96032u(r3, r4, r7)
            long r8 = r7.f170220b
            r4 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x023e
            r6 = 1
            goto L_0x023f
        L_0x023e:
            r6 = 0
        L_0x023f:
            r12.mo58923f(r6)
        L_0x0242:
            if (r1 >= r5) goto L_0x025e
            int r6 = com.google.protobuf.C63072j.m96029r(r3, r1, r7)
            int r8 = r7.f170219a
            if (r2 == r8) goto L_0x024d
            goto L_0x025e
        L_0x024d:
            int r1 = com.google.protobuf.C63072j.m96032u(r3, r6, r7)
            long r8 = r7.f170220b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0259
            r6 = 1
            goto L_0x025a
        L_0x0259:
            r6 = 0
        L_0x025a:
            r12.mo58923f(r6)
            goto L_0x0242
        L_0x025e:
            return r1
        L_0x025f:
            if (r6 != r14) goto L_0x0267
            int r1 = com.google.protobuf.C63072j.m96019h(r3, r4, r12, r7)
            goto L_0x037b
        L_0x0267:
            if (r6 != r9) goto L_0x037a
            com.google.protobuf.ca r12 = (com.google.protobuf.C62954ca) r12
            int r1 = com.google.protobuf.C63072j.m96013b(r17, r18)
            r12.mo58916g(r1)
        L_0x0272:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0287
            int r4 = com.google.protobuf.C63072j.m96029r(r3, r1, r7)
            int r6 = r7.f170219a
            if (r2 == r6) goto L_0x027f
            goto L_0x0287
        L_0x027f:
            int r1 = com.google.protobuf.C63072j.m96013b(r3, r4)
            r12.mo58916g(r1)
            goto L_0x0272
        L_0x0287:
            return r1
        L_0x0288:
            if (r6 != r14) goto L_0x0290
            int r1 = com.google.protobuf.C63072j.m96020i(r3, r4, r12, r7)
            goto L_0x037b
        L_0x0290:
            if (r6 != r13) goto L_0x037a
            com.google.protobuf.dh r12 = (com.google.protobuf.C62989dh) r12
            long r8 = com.google.protobuf.C63072j.m96034w(r17, r18)
            r12.mo58929f(r8)
        L_0x029b:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x02b0
            int r4 = com.google.protobuf.C63072j.m96029r(r3, r1, r7)
            int r6 = r7.f170219a
            if (r2 == r6) goto L_0x02a8
            goto L_0x02b0
        L_0x02a8:
            long r8 = com.google.protobuf.C63072j.m96034w(r3, r4)
            r12.mo58929f(r8)
            goto L_0x029b
        L_0x02b0:
            return r1
        L_0x02b1:
            if (r6 != r14) goto L_0x02b9
            int r1 = com.google.protobuf.C63072j.m96024m(r3, r4, r12, r7)
            goto L_0x037b
        L_0x02b9:
            if (r6 == 0) goto L_0x02bd
            goto L_0x037a
        L_0x02bd:
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.protobuf.C63072j.m96031t(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x02cc:
            if (r6 != r14) goto L_0x02d4
            int r1 = com.google.protobuf.C63072j.m96025n(r3, r4, r12, r7)
            goto L_0x037b
        L_0x02d4:
            if (r6 != 0) goto L_0x037a
            com.google.protobuf.dh r12 = (com.google.protobuf.C62989dh) r12
            int r1 = com.google.protobuf.C63072j.m96032u(r3, r4, r7)
            long r8 = r7.f170220b
            r12.mo58929f(r8)
        L_0x02e1:
            if (r1 >= r5) goto L_0x02f6
            int r4 = com.google.protobuf.C63072j.m96029r(r3, r1, r7)
            int r6 = r7.f170219a
            if (r2 == r6) goto L_0x02ec
            goto L_0x02f6
        L_0x02ec:
            int r1 = com.google.protobuf.C63072j.m96032u(r3, r4, r7)
            long r8 = r7.f170220b
            r12.mo58929f(r8)
            goto L_0x02e1
        L_0x02f6:
            return r1
        L_0x02f7:
            if (r6 != r14) goto L_0x02ff
            int r1 = com.google.protobuf.C63072j.m96021j(r3, r4, r12, r7)
            goto L_0x037b
        L_0x02ff:
            if (r6 != r9) goto L_0x037a
            com.google.protobuf.bi r12 = (com.google.protobuf.C62929bi) r12
            int r1 = com.google.protobuf.C63072j.m96013b(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo58861g(r1)
        L_0x030e:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0327
            int r4 = com.google.protobuf.C63072j.m96029r(r3, r1, r7)
            int r6 = r7.f170219a
            if (r2 == r6) goto L_0x031b
            goto L_0x0327
        L_0x031b:
            int r1 = com.google.protobuf.C63072j.m96013b(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo58861g(r1)
            goto L_0x030e
        L_0x0327:
            return r1
        L_0x0328:
            if (r6 != r14) goto L_0x032f
            int r1 = com.google.protobuf.C63072j.m96018g(r3, r4, r12, r7)
            goto L_0x037b
        L_0x032f:
            if (r6 != r13) goto L_0x037a
            com.google.protobuf.ap r12 = (com.google.protobuf.C62908ap) r12
            long r8 = com.google.protobuf.C63072j.m96034w(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo58801g(r8)
        L_0x033e:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0357
            int r4 = com.google.protobuf.C63072j.m96029r(r3, r1, r7)
            int r6 = r7.f170219a
            if (r2 == r6) goto L_0x034b
            goto L_0x0357
        L_0x034b:
            long r8 = com.google.protobuf.C63072j.m96034w(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo58801g(r8)
            goto L_0x033e
        L_0x0357:
            return r1
        L_0x0358:
            if (r4 >= r5) goto L_0x0379
            int r8 = com.google.protobuf.C63072j.m96029r(r3, r4, r7)
            int r9 = r7.f170219a
            if (r2 == r9) goto L_0x0363
            goto L_0x0379
        L_0x0363:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.protobuf.C63072j.m96014c(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f170221c
            r12.add(r8)
            goto L_0x0358
        L_0x0379:
            return r4
        L_0x037a:
            r1 = r4
        L_0x037b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C63003dv.m95650v(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.protobuf.i):int");
    }

    /* renamed from: w */
    private final int m95651w(int i) {
        if (i < this.f170066f || i > this.f170067g) {
            return -1;
        }
        return m95654z(i, 0);
    }

    /* renamed from: x */
    private final int m95652x(int i, int i2) {
        if (i < this.f170066f || i > this.f170067g) {
            return -1;
        }
        return m95654z(i, i2);
    }

    /* renamed from: y */
    private final int m95653y(int i) {
        return this.f170064d[i + 2];
    }

    /* renamed from: z */
    private final int m95654z(int i, int i2) {
        int length = (this.f170064d.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f170064d[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo58992a(Object obj) {
        return this.f170070j ? m95646r(obj) : m95645q(obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01e0, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0257, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0258, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo58993b(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.f170064d
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x025c
            int r3 = r8.m95616B(r1)
            int[] r4 = r8.f170064d
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = m95615A(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0247;
                case 1: goto L_0x023a;
                case 2: goto L_0x022d;
                case 3: goto L_0x0220;
                case 4: goto L_0x0217;
                case 5: goto L_0x020a;
                case 6: goto L_0x0201;
                case 7: goto L_0x01f4;
                case 8: goto L_0x01e5;
                case 9: goto L_0x01d4;
                case 10: goto L_0x01c6;
                case 11: goto L_0x01bc;
                case 12: goto L_0x01b2;
                case 13: goto L_0x01a8;
                case 14: goto L_0x019a;
                case 15: goto L_0x0190;
                case 16: goto L_0x0182;
                case 17: goto L_0x0175;
                case 18: goto L_0x0167;
                case 19: goto L_0x0167;
                case 20: goto L_0x0167;
                case 21: goto L_0x0167;
                case 22: goto L_0x0167;
                case 23: goto L_0x0167;
                case 24: goto L_0x0167;
                case 25: goto L_0x0167;
                case 26: goto L_0x0167;
                case 27: goto L_0x0167;
                case 28: goto L_0x0167;
                case 29: goto L_0x0167;
                case 30: goto L_0x0167;
                case 31: goto L_0x0167;
                case 32: goto L_0x0167;
                case 33: goto L_0x0167;
                case 34: goto L_0x0167;
                case 35: goto L_0x0167;
                case 36: goto L_0x0167;
                case 37: goto L_0x0167;
                case 38: goto L_0x0167;
                case 39: goto L_0x0167;
                case 40: goto L_0x0167;
                case 41: goto L_0x0167;
                case 42: goto L_0x0167;
                case 43: goto L_0x0167;
                case 44: goto L_0x0167;
                case 45: goto L_0x0167;
                case 46: goto L_0x0167;
                case 47: goto L_0x0167;
                case 48: goto L_0x0167;
                case 49: goto L_0x0167;
                case 50: goto L_0x0159;
                case 51: goto L_0x0143;
                case 52: goto L_0x0131;
                case 53: goto L_0x011f;
                case 54: goto L_0x010d;
                case 55: goto L_0x00ff;
                case 56: goto L_0x00ed;
                case 57: goto L_0x00df;
                case 58: goto L_0x00cd;
                case 59: goto L_0x00b7;
                case 60: goto L_0x00a3;
                case 61: goto L_0x008f;
                case 62: goto L_0x0081;
                case 63: goto L_0x0073;
                case 64: goto L_0x0065;
                case 65: goto L_0x0053;
                case 66: goto L_0x0045;
                case 67: goto L_0x0033;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0258
        L_0x001f:
            boolean r3 = r8.m95633S(r9, r4, r1)
            if (r3 == 0) goto L_0x0258
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r3 = r3.mo59138p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0257
        L_0x0033:
            boolean r3 = r8.m95633S(r9, r4, r1)
            if (r3 == 0) goto L_0x0258
            int r2 = r2 * 53
            long r3 = m95617C(r9, r5)
            int r3 = com.google.protobuf.C62972cr.m95543c(r3)
            goto L_0x0257
        L_0x0045:
            boolean r3 = r8.m95633S(r9, r4, r1)
            if (r3 == 0) goto L_0x0258
            int r2 = r2 * 53
            int r3 = m95647s(r9, r5)
            goto L_0x0257
        L_0x0053:
            boolean r3 = r8.m95633S(r9, r4, r1)
            if (r3 == 0) goto L_0x0258
            int r2 = r2 * 53
            long r3 = m95617C(r9, r5)
            int r3 = com.google.protobuf.C62972cr.m95543c(r3)
            goto L_0x0257
        L_0x0065:
            boolean r3 = r8.m95633S(r9, r4, r1)
            if (r3 == 0) goto L_0x0258
            int r2 = r2 * 53
            int r3 = m95647s(r9, r5)
            goto L_0x0257
        L_0x0073:
            boolean r3 = r8.m95633S(r9, r4, r1)
            if (r3 == 0) goto L_0x0258
            int r2 = r2 * 53
            int r3 = m95647s(r9, r5)
            goto L_0x0257
        L_0x0081:
            boolean r3 = r8.m95633S(r9, r4, r1)
            if (r3 == 0) goto L_0x0258
            int r2 = r2 * 53
            int r3 = m95647s(r9, r5)
            goto L_0x0257
        L_0x008f:
            boolean r3 = r8.m95633S(r9, r4, r1)
            if (r3 == 0) goto L_0x0258
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r3 = r3.mo59138p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0257
        L_0x00a3:
            boolean r3 = r8.m95633S(r9, r4, r1)
            if (r3 == 0) goto L_0x0258
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r3 = r3.mo59138p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0257
        L_0x00b7:
            boolean r3 = r8.m95633S(r9, r4, r1)
            if (r3 == 0) goto L_0x0258
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r3 = r3.mo59138p(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0257
        L_0x00cd:
            boolean r3 = r8.m95633S(r9, r4, r1)
            if (r3 == 0) goto L_0x0258
            int r2 = r2 * 53
            boolean r3 = m95634T(r9, r5)
            int r3 = com.google.protobuf.C62972cr.m95541a(r3)
            goto L_0x0257
        L_0x00df:
            boolean r3 = r8.m95633S(r9, r4, r1)
            if (r3 == 0) goto L_0x0258
            int r2 = r2 * 53
            int r3 = m95647s(r9, r5)
            goto L_0x0257
        L_0x00ed:
            boolean r3 = r8.m95633S(r9, r4, r1)
            if (r3 == 0) goto L_0x0258
            int r2 = r2 * 53
            long r3 = m95617C(r9, r5)
            int r3 = com.google.protobuf.C62972cr.m95543c(r3)
            goto L_0x0257
        L_0x00ff:
            boolean r3 = r8.m95633S(r9, r4, r1)
            if (r3 == 0) goto L_0x0258
            int r2 = r2 * 53
            int r3 = m95647s(r9, r5)
            goto L_0x0257
        L_0x010d:
            boolean r3 = r8.m95633S(r9, r4, r1)
            if (r3 == 0) goto L_0x0258
            int r2 = r2 * 53
            long r3 = m95617C(r9, r5)
            int r3 = com.google.protobuf.C62972cr.m95543c(r3)
            goto L_0x0257
        L_0x011f:
            boolean r3 = r8.m95633S(r9, r4, r1)
            if (r3 == 0) goto L_0x0258
            int r2 = r2 * 53
            long r3 = m95617C(r9, r5)
            int r3 = com.google.protobuf.C62972cr.m95543c(r3)
            goto L_0x0257
        L_0x0131:
            boolean r3 = r8.m95633S(r9, r4, r1)
            if (r3 == 0) goto L_0x0258
            int r2 = r2 * 53
            float r3 = m95644p(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0257
        L_0x0143:
            boolean r3 = r8.m95633S(r9, r4, r1)
            if (r3 == 0) goto L_0x0258
            int r2 = r2 * 53
            double r3 = m95643o(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.C62972cr.m95543c(r3)
            goto L_0x0257
        L_0x0159:
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r3 = r3.mo59138p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0257
        L_0x0167:
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r3 = r3.mo59138p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0257
        L_0x0175:
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r3 = r3.mo59138p(r9, r5)
            if (r3 == 0) goto L_0x01e0
            int r7 = r3.hashCode()
            goto L_0x01e0
        L_0x0182:
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            long r3 = r3.mo59136n(r9, r5)
            int r3 = com.google.protobuf.C62972cr.m95543c(r3)
            goto L_0x0257
        L_0x0190:
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            int r3 = r3.mo59135m(r9, r5)
            goto L_0x0257
        L_0x019a:
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            long r3 = r3.mo59136n(r9, r5)
            int r3 = com.google.protobuf.C62972cr.m95543c(r3)
            goto L_0x0257
        L_0x01a8:
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            int r3 = r3.mo59135m(r9, r5)
            goto L_0x0257
        L_0x01b2:
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            int r3 = r3.mo59135m(r9, r5)
            goto L_0x0257
        L_0x01bc:
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            int r3 = r3.mo59135m(r9, r5)
            goto L_0x0257
        L_0x01c6:
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r3 = r3.mo59138p(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0257
        L_0x01d4:
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r3 = r3.mo59138p(r9, r5)
            if (r3 == 0) goto L_0x01e0
            int r7 = r3.hashCode()
        L_0x01e0:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0258
        L_0x01e5:
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            java.lang.Object r3 = r3.mo59138p(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0257
        L_0x01f4:
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            boolean r3 = r3.mo59133k(r9, r5)
            int r3 = com.google.protobuf.C62972cr.m95541a(r3)
            goto L_0x0257
        L_0x0201:
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            int r3 = r3.mo59135m(r9, r5)
            goto L_0x0257
        L_0x020a:
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            long r3 = r3.mo59136n(r9, r5)
            int r3 = com.google.protobuf.C62972cr.m95543c(r3)
            goto L_0x0257
        L_0x0217:
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            int r3 = r3.mo59135m(r9, r5)
            goto L_0x0257
        L_0x0220:
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            long r3 = r3.mo59136n(r9, r5)
            int r3 = com.google.protobuf.C62972cr.m95543c(r3)
            goto L_0x0257
        L_0x022d:
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            long r3 = r3.mo59136n(r9, r5)
            int r3 = com.google.protobuf.C62972cr.m95543c(r3)
            goto L_0x0257
        L_0x023a:
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            float r3 = r3.mo59125c(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0257
        L_0x0247:
            int r2 = r2 * 53
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a
            double r3 = r3.mo59124b(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.C62972cr.m95543c(r3)
        L_0x0257:
            int r2 = r2 + r3
        L_0x0258:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x025c:
            int r2 = r2 * 53
            com.google.protobuf.fi r0 = r8.f170076p
            java.lang.Object r0 = r0.mo59089d(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f170068h
            if (r0 == 0) goto L_0x027c
            int r2 = r2 * 53
            com.google.protobuf.bb r0 = r8.f170077q
            com.google.protobuf.bf r9 = r0.mo58834b(r9)
            com.google.protobuf.ew r9 = r9.f169888b
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x027c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C63003dv.mo58993b(java.lang.Object):int");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0361, code lost:
        if (r0 != r15) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x037d, code lost:
        r7 = r33;
        r6 = r35;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03a8, code lost:
        if (r0 != r15) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03c8, code lost:
        if (r0 != r15) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x051b, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x062a, code lost:
        r2 = r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x063b, code lost:
        r2 = r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x063d, code lost:
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014d, code lost:
        r4 = r8 | r27;
        r5 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x017f, code lost:
        r2 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e2, code lost:
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0202, code lost:
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0239, code lost:
        r4 = r8 | r27;
        r5 = r33;
        r0 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x023e, code lost:
        r3 = r9;
        r1 = r11;
        r2 = r24;
        r11 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0260, code lost:
        r4 = r8 | r27;
        r5 = r33;
        r11 = r35;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x028a, code lost:
        r0 = r11 + 8;
        r4 = r8 | r27;
        r5 = r33;
        r11 = r35;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0293, code lost:
        r3 = r9;
        r2 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0296, code lost:
        r9 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02b0, code lost:
        r22 = r33;
        r6 = r35;
        r7 = r2;
        r17 = r8;
        r28 = r10;
        r2 = r11;
        r18 = r24;
        r19 = true;
        r24 = r9;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo58994c(java.lang.Object r31, byte[] r32, int r33, int r34, int r35, com.google.protobuf.C63071i r36) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            sun.misc.Unsafe r10 = f170062c
            r0 = r33
            r1 = 0
            r2 = -1
            r3 = 0
            r4 = 0
            r5 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0017:
            r16 = 0
            if (r0 >= r13) goto L_0x069c
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0028
            int r0 = com.google.protobuf.C63072j.m96030s(r0, r12, r1, r9)
            int r1 = r9.f170219a
            goto L_0x002d
        L_0x0028:
            r29 = r1
            r1 = r0
            r0 = r29
        L_0x002d:
            int r8 = r1 >>> 3
            r7 = r1 & 7
            r6 = 3
            if (r8 <= r2) goto L_0x003a
            int r3 = r3 / r6
            int r2 = r15.m95652x(r8, r3)
            goto L_0x003e
        L_0x003a:
            int r2 = r15.m95651w(r8)
        L_0x003e:
            r20 = 0
            r6 = -1
            if (r2 != r6) goto L_0x0056
            r2 = r0
            r7 = r1
            r17 = r4
            r22 = r5
            r18 = r8
            r28 = r10
            r6 = r11
            r19 = 1
            r23 = -1
            r24 = 0
            goto L_0x03cb
        L_0x0056:
            int[] r3 = r15.f170064d
            int r23 = r2 + 1
            r11 = r3[r23]
            int r6 = m95615A(r11)
            r17 = r1
            r24 = r8
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r11 & r8
            long r8 = (long) r1
            r1 = 17
            r25 = r8
            if (r6 > r1) goto L_0x02c4
            int r1 = r2 + 2
            r1 = r3[r1]
            int r3 = r1 >>> 20
            r9 = 1
            int r27 = r9 << r3
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r9
            if (r1 == r5) goto L_0x008d
            if (r5 == r9) goto L_0x0085
            long r8 = (long) r5
            r10.putInt(r14, r8, r4)
        L_0x0085:
            long r4 = (long) r1
            int r4 = r10.getInt(r14, r4)
            r9 = r1
            r8 = r4
            goto L_0x008f
        L_0x008d:
            r8 = r4
            r9 = r5
        L_0x008f:
            r1 = 5
            switch(r6) {
                case 0: goto L_0x026a;
                case 1: goto L_0x0245;
                case 2: goto L_0x021b;
                case 3: goto L_0x021b;
                case 4: goto L_0x0205;
                case 5: goto L_0x01e5;
                case 6: goto L_0x01cc;
                case 7: goto L_0x01a4;
                case 8: goto L_0x0183;
                case 9: goto L_0x0153;
                case 10: goto L_0x0138;
                case 11: goto L_0x0205;
                case 12: goto L_0x0105;
                case 13: goto L_0x01cc;
                case 14: goto L_0x01e5;
                case 15: goto L_0x00ec;
                case 16: goto L_0x00c2;
                default: goto L_0x0093;
            }
        L_0x0093:
            r6 = r36
            r11 = r0
            r33 = r9
            r3 = r17
            r4 = r25
            r0 = 3
            r1 = 1
            r9 = r2
            if (r7 != r0) goto L_0x02af
            com.google.protobuf.en r0 = r15.m95619E(r9)
            int r1 = r24 << 3
            r7 = r1 | 4
            r1 = r32
            r2 = r11
            r11 = r3
            r3 = r34
            r12 = r4
            r4 = r7
            r5 = r36
            int r0 = com.google.protobuf.C63072j.m96014c(r0, r1, r2, r3, r4, r5)
            r1 = r8 & r27
            if (r1 != 0) goto L_0x0299
            java.lang.Object r1 = r6.f170221c
            r10.putObject(r14, r12, r1)
            goto L_0x02a6
        L_0x00c2:
            if (r7 != 0) goto L_0x00e2
            r6 = r36
            r4 = r25
            int r7 = com.google.protobuf.C63072j.m96032u(r12, r0, r6)
            long r0 = r6.f170220b
            long r19 = com.google.protobuf.C62897ae.m95109K(r0)
            r0 = r10
            r11 = r17
            r1 = r31
            r33 = r9
            r9 = r2
            r2 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            goto L_0x0239
        L_0x00e2:
            r6 = r36
            r33 = r9
            r9 = r2
            r11 = r0
            r2 = r17
            goto L_0x0268
        L_0x00ec:
            r6 = r36
            r33 = r9
            r11 = r17
            r4 = r25
            r9 = r2
            if (r7 != 0) goto L_0x017f
            int r0 = com.google.protobuf.C63072j.m96029r(r12, r0, r6)
            int r1 = r6.f170219a
            int r1 = com.google.protobuf.C62897ae.m95107I(r1)
            r10.putInt(r14, r4, r1)
            goto L_0x014d
        L_0x0105:
            r6 = r36
            r33 = r9
            r11 = r17
            r4 = r25
            r9 = r2
            if (r7 != 0) goto L_0x017f
            int r0 = com.google.protobuf.C63072j.m96029r(r12, r0, r6)
            int r1 = r6.f170219a
            com.google.protobuf.cf r2 = r15.m95618D(r9)
            if (r2 == 0) goto L_0x0134
            boolean r2 = r2.isInRange(r1)
            if (r2 == 0) goto L_0x0123
            goto L_0x0134
        L_0x0123:
            com.google.protobuf.fj r2 = m95640d(r31)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo59107d(r11, r1)
            r5 = r33
            r4 = r8
            goto L_0x023e
        L_0x0134:
            r10.putInt(r14, r4, r1)
            goto L_0x014d
        L_0x0138:
            r6 = r36
            r33 = r9
            r11 = r17
            r4 = r25
            r1 = 2
            r9 = r2
            if (r7 != r1) goto L_0x017f
            int r0 = com.google.protobuf.C63072j.m96012a(r12, r0, r6)
            java.lang.Object r1 = r6.f170221c
            r10.putObject(r14, r4, r1)
        L_0x014d:
            r4 = r8 | r27
            r5 = r33
            goto L_0x023e
        L_0x0153:
            r6 = r36
            r33 = r9
            r11 = r17
            r4 = r25
            r1 = 2
            r9 = r2
            if (r7 != r1) goto L_0x017f
            com.google.protobuf.en r1 = r15.m95619E(r9)
            int r0 = com.google.protobuf.C63072j.m96015d(r1, r12, r0, r13, r6)
            r1 = r8 & r27
            if (r1 != 0) goto L_0x0171
            java.lang.Object r1 = r6.f170221c
            r10.putObject(r14, r4, r1)
            goto L_0x014d
        L_0x0171:
            java.lang.Object r1 = r10.getObject(r14, r4)
            java.lang.Object r2 = r6.f170221c
            java.lang.Object r1 = com.google.protobuf.C62972cr.m95545e(r1, r2)
            r10.putObject(r14, r4, r1)
            goto L_0x014d
        L_0x017f:
            r2 = r11
            r1 = 1
            goto L_0x0202
        L_0x0183:
            r6 = r36
            r33 = r9
            r4 = r25
            r1 = 2
            r9 = r2
            r2 = r17
            if (r7 != r1) goto L_0x01e2
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r11
            if (r1 != 0) goto L_0x0199
            int r0 = com.google.protobuf.C63072j.m96026o(r12, r0, r6)
            goto L_0x019d
        L_0x0199:
            int r0 = com.google.protobuf.C63072j.m96027p(r12, r0, r6)
        L_0x019d:
            java.lang.Object r1 = r6.f170221c
            r10.putObject(r14, r4, r1)
            goto L_0x0260
        L_0x01a4:
            r6 = r36
            r33 = r9
            r4 = r25
            r9 = r2
            r2 = r17
            if (r7 != 0) goto L_0x01e2
            int r0 = com.google.protobuf.C63072j.m96032u(r12, r0, r6)
            r3 = r0
            long r0 = r6.f170220b
            int r7 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r7 == 0) goto L_0x01bc
            r0 = 1
            goto L_0x01bd
        L_0x01bc:
            r0 = 0
        L_0x01bd:
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            r1.mo59128f(r14, r4, r0)
            r4 = r8 | r27
            r5 = r33
            r11 = r35
            r1 = r2
            r0 = r3
            goto L_0x0293
        L_0x01cc:
            r6 = r36
            r33 = r9
            r4 = r25
            r9 = r2
            r2 = r17
            if (r7 != r1) goto L_0x01e2
            int r1 = com.google.protobuf.C63072j.m96013b(r12, r0)
            r10.putInt(r14, r4, r1)
            int r0 = r0 + 4
            goto L_0x0260
        L_0x01e2:
            r11 = r0
            goto L_0x0268
        L_0x01e5:
            r6 = r36
            r33 = r9
            r4 = r25
            r1 = 1
            r9 = r2
            r2 = r17
            if (r7 != r1) goto L_0x0202
            long r16 = com.google.protobuf.C63072j.m96034w(r12, r0)
            r11 = r0
            r0 = r10
            r1 = r31
            r7 = r2
            r2 = r4
            r4 = r16
            r0.putLong(r1, r2, r4)
            goto L_0x028a
        L_0x0202:
            r11 = r0
            goto L_0x02b0
        L_0x0205:
            r6 = r36
            r11 = r0
            r33 = r9
            r4 = r25
            r9 = r2
            r2 = r17
            if (r7 != 0) goto L_0x0268
            int r0 = com.google.protobuf.C63072j.m96029r(r12, r11, r6)
            int r1 = r6.f170219a
            r10.putInt(r14, r4, r1)
            goto L_0x0260
        L_0x021b:
            r6 = r36
            r11 = r0
            r33 = r9
            r4 = r25
            r9 = r2
            r2 = r17
            if (r7 != 0) goto L_0x0268
            int r7 = com.google.protobuf.C63072j.m96032u(r12, r11, r6)
            long r0 = r6.f170220b
            r16 = r0
            r0 = r10
            r1 = r31
            r11 = r2
            r2 = r4
            r4 = r16
            r0.putLong(r1, r2, r4)
        L_0x0239:
            r4 = r8 | r27
            r5 = r33
            r0 = r7
        L_0x023e:
            r3 = r9
            r1 = r11
            r2 = r24
            r11 = r35
            goto L_0x0296
        L_0x0245:
            r6 = r36
            r11 = r0
            r33 = r9
            r4 = r25
            r9 = r2
            r2 = r17
            if (r7 != r1) goto L_0x0268
            int r0 = com.google.protobuf.C63072j.m96013b(r12, r11)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.protobuf.fr r1 = com.google.protobuf.C63054fs.f170169a
            r1.mo59132j(r14, r4, r0)
            int r0 = r11 + 4
        L_0x0260:
            r4 = r8 | r27
            r5 = r33
            r11 = r35
            r1 = r2
            goto L_0x0293
        L_0x0268:
            r1 = 1
            goto L_0x02b0
        L_0x026a:
            r6 = r36
            r11 = r0
            r33 = r9
            r4 = r25
            r1 = 1
            r9 = r2
            r2 = r17
            if (r7 != r1) goto L_0x02b0
            long r0 = com.google.protobuf.C63072j.m96034w(r12, r11)
            double r16 = java.lang.Double.longBitsToDouble(r0)
            com.google.protobuf.fr r0 = com.google.protobuf.C63054fs.f170169a
            r1 = r31
            r7 = r2
            r2 = r4
            r4 = r16
            r0.mo59131i(r1, r2, r4)
        L_0x028a:
            int r0 = r11 + 8
            r4 = r8 | r27
            r5 = r33
            r11 = r35
            r1 = r7
        L_0x0293:
            r3 = r9
            r2 = r24
        L_0x0296:
            r9 = r6
            goto L_0x0017
        L_0x0299:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r6.f170221c
            java.lang.Object r1 = com.google.protobuf.C62972cr.m95545e(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x02a6:
            r4 = r8 | r27
            r12 = r32
            r5 = r33
            r13 = r34
            goto L_0x023e
        L_0x02af:
            r2 = r3
        L_0x02b0:
            r22 = r33
            r6 = r35
            r7 = r2
            r17 = r8
            r28 = r10
            r2 = r11
            r18 = r24
            r19 = 1
            r23 = -1
            r24 = r9
            goto L_0x03cb
        L_0x02c4:
            r8 = r0
            r9 = r2
            r2 = r17
            r12 = r25
            r1 = 1
            r0 = 27
            if (r6 != r0) goto L_0x032e
            r0 = 2
            if (r7 != r0) goto L_0x031b
            java.lang.Object r0 = r10.getObject(r14, r12)
            com.google.protobuf.cq r0 = (com.google.protobuf.C62971cq) r0
            boolean r1 = r0.mo58948c()
            if (r1 != 0) goto L_0x02f0
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02e7
            r3 = 10
            goto L_0x02e9
        L_0x02e7:
            int r3 = r1 + r1
        L_0x02e9:
            com.google.protobuf.cq r0 = r0.mo58798e(r3)
            r10.putObject(r14, r12, r0)
        L_0x02f0:
            r6 = r0
            com.google.protobuf.en r0 = r15.m95619E(r9)
            r1 = r2
            r7 = r2
            r2 = r32
            r3 = r8
            r17 = r4
            r4 = r34
            r22 = r5
            r5 = r6
            r23 = -1
            r6 = r36
            int r0 = com.google.protobuf.C63072j.m96016e(r0, r1, r2, r3, r4, r5, r6)
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r7
            r3 = r9
            r4 = r17
            r5 = r22
            r2 = r24
            r9 = r36
            goto L_0x0017
        L_0x031b:
            r17 = r4
            r22 = r5
            r23 = -1
            r33 = r2
            r15 = r8
            r28 = r10
            r18 = r24
            r19 = 1
            r24 = r9
            goto L_0x03ab
        L_0x032e:
            r17 = r4
            r22 = r5
            r23 = -1
            r4 = r2
            r0 = 49
            if (r6 > r0) goto L_0x0383
            long r2 = (long) r11
            r0 = r30
            r11 = 1
            r1 = r31
            r25 = r2
            r2 = r32
            r5 = 10
            r3 = r8
            r33 = r4
            r4 = r34
            r5 = r33
            r11 = r6
            r19 = 1
            r6 = r24
            r15 = r8
            r18 = r24
            r8 = r9
            r24 = r9
            r28 = r10
            r9 = r25
            r14 = r36
            int r0 = r0.m95650v(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x037d
        L_0x0363:
            r15 = r30
            r14 = r31
            r12 = r32
            r1 = r33
            r13 = r34
            r11 = r35
            r9 = r36
            r4 = r17
            r2 = r18
            r5 = r22
            r3 = r24
            r10 = r28
            goto L_0x0017
        L_0x037d:
            r7 = r33
            r6 = r35
            r2 = r0
            goto L_0x03cb
        L_0x0383:
            r33 = r4
            r15 = r8
            r28 = r10
            r18 = r24
            r19 = 1
            r24 = r9
            r9 = r6
            r0 = 50
            if (r9 != r0) goto L_0x03b1
            r0 = 2
            if (r7 != r0) goto L_0x03ab
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r24
            r6 = r12
            r8 = r36
            int r0 = r0.m95648t(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x037d
            goto L_0x0363
        L_0x03ab:
            r7 = r33
            r6 = r35
            r2 = r15
            goto L_0x03cb
        L_0x03b1:
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r33
            r6 = r18
            r8 = r11
            r10 = r12
            r12 = r24
            r13 = r36
            int r0 = r0.m95649u(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x037d
            goto L_0x0363
        L_0x03cb:
            if (r7 != r6) goto L_0x03db
            if (r6 == 0) goto L_0x03db
            r8 = r30
            r12 = r31
            r0 = r2
            r1 = r7
            r4 = r17
            r5 = r22
            goto L_0x06a5
        L_0x03db:
            r8 = r30
            boolean r0 = r8.f170068h
            if (r0 == 0) goto L_0x066e
            r9 = r36
            com.google.protobuf.ba r0 = r9.f170222d
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.f169869a
            if (r0 == r1) goto L_0x0669
            com.google.protobuf.MessageLite r1 = r8.f170063a
            com.google.protobuf.fi r3 = r8.f170076p
            r10 = r18
            com.google.protobuf.bt r11 = r0.mo58830c(r1, r10)
            if (r11 != 0) goto L_0x040c
            com.google.protobuf.fj r4 = m95640d(r31)
            r0 = r7
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = com.google.protobuf.C63072j.m96028q(r0, r1, r2, r3, r4, r5)
            r12 = r31
            r14 = r32
        L_0x0408:
            r18 = 0
            goto L_0x0687
        L_0x040c:
            r12 = r31
            r0 = r12
            com.google.protobuf.bq r0 = (com.google.protobuf.C62937bq) r0
            r0.mo58886k()
            com.google.protobuf.bf r13 = r0.f169962ag
            com.google.protobuf.bs r1 = r11.f169971d
            boolean r4 = r1.f169966d
            if (r4 == 0) goto L_0x051e
            boolean r4 = r1.f169967e
            if (r4 == 0) goto L_0x051e
            com.google.protobuf.gd r1 = com.google.protobuf.C63066gd.DOUBLE
            com.google.protobuf.bs r1 = r11.f169971d
            com.google.protobuf.gd r1 = r1.f169965c
            int r1 = r1.ordinal()
            switch(r1) {
                case 0: goto L_0x0506;
                case 1: goto L_0x04f0;
                case 2: goto L_0x04de;
                case 3: goto L_0x04de;
                case 4: goto L_0x04cc;
                case 5: goto L_0x04ba;
                case 6: goto L_0x04a8;
                case 7: goto L_0x0491;
                case 8: goto L_0x042d;
                case 9: goto L_0x042d;
                case 10: goto L_0x042d;
                case 11: goto L_0x042d;
                case 12: goto L_0x04cc;
                case 13: goto L_0x0469;
                case 14: goto L_0x04a8;
                case 15: goto L_0x04ba;
                case 16: goto L_0x0457;
                case 17: goto L_0x0445;
                default: goto L_0x042d;
            }
        L_0x042d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            com.google.protobuf.bs r1 = r11.f169971d
            com.google.protobuf.gd r1 = r1.f169965c
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Type cannot be packed: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0445:
            com.google.protobuf.dh r0 = new com.google.protobuf.dh
            r0.<init>()
            r14 = r32
            int r1 = com.google.protobuf.C63072j.m96023l(r14, r2, r0, r9)
            com.google.protobuf.bs r2 = r11.f169971d
            r13.mo58856n(r2, r0)
            goto L_0x051b
        L_0x0457:
            r14 = r32
            com.google.protobuf.ca r0 = new com.google.protobuf.ca
            r0.<init>()
            int r1 = com.google.protobuf.C63072j.m96022k(r14, r2, r0, r9)
            com.google.protobuf.bs r2 = r11.f169971d
            r13.mo58856n(r2, r0)
            goto L_0x051b
        L_0x0469:
            r14 = r32
            com.google.protobuf.ca r1 = new com.google.protobuf.ca
            r1.<init>()
            int r2 = com.google.protobuf.C63072j.m96024m(r14, r2, r1, r9)
            com.google.protobuf.fj r4 = r0.unknownFields
            com.google.protobuf.fj r5 = com.google.protobuf.C63045fj.f170156a
            if (r4 != r5) goto L_0x047c
            r4 = r16
        L_0x047c:
            com.google.protobuf.bs r5 = r11.f169971d
            com.google.protobuf.ce r5 = r5.f169963a
            java.lang.Object r3 = com.google.protobuf.C63023eo.m95838p(r10, r1, r5, r4, r3)
            com.google.protobuf.fj r3 = (com.google.protobuf.C63045fj) r3
            if (r3 == 0) goto L_0x048a
            r0.unknownFields = r3
        L_0x048a:
            com.google.protobuf.bs r0 = r11.f169971d
            r13.mo58856n(r0, r1)
            goto L_0x054b
        L_0x0491:
            r14 = r32
            com.google.protobuf.p r0 = new com.google.protobuf.p
            r15 = 10
            boolean[] r1 = new boolean[r15]
            r5 = 0
            r0.<init>(r1, r5)
            int r1 = com.google.protobuf.C63072j.m96017f(r14, r2, r0, r9)
            com.google.protobuf.bs r2 = r11.f169971d
            r13.mo58856n(r2, r0)
            goto L_0x051b
        L_0x04a8:
            r14 = r32
            r5 = 0
            com.google.protobuf.ca r0 = new com.google.protobuf.ca
            r0.<init>()
            int r1 = com.google.protobuf.C63072j.m96019h(r14, r2, r0, r9)
            com.google.protobuf.bs r2 = r11.f169971d
            r13.mo58856n(r2, r0)
            goto L_0x051b
        L_0x04ba:
            r14 = r32
            r5 = 0
            com.google.protobuf.dh r0 = new com.google.protobuf.dh
            r0.<init>()
            int r1 = com.google.protobuf.C63072j.m96020i(r14, r2, r0, r9)
            com.google.protobuf.bs r2 = r11.f169971d
            r13.mo58856n(r2, r0)
            goto L_0x051b
        L_0x04cc:
            r14 = r32
            r5 = 0
            com.google.protobuf.ca r0 = new com.google.protobuf.ca
            r0.<init>()
            int r1 = com.google.protobuf.C63072j.m96024m(r14, r2, r0, r9)
            com.google.protobuf.bs r2 = r11.f169971d
            r13.mo58856n(r2, r0)
            goto L_0x051b
        L_0x04de:
            r14 = r32
            r5 = 0
            com.google.protobuf.dh r0 = new com.google.protobuf.dh
            r0.<init>()
            int r1 = com.google.protobuf.C63072j.m96025n(r14, r2, r0, r9)
            com.google.protobuf.bs r2 = r11.f169971d
            r13.mo58856n(r2, r0)
            goto L_0x051b
        L_0x04f0:
            r14 = r32
            r5 = 0
            r15 = 10
            com.google.protobuf.bi r0 = new com.google.protobuf.bi
            float[] r1 = new float[r15]
            r0.<init>(r1, r5)
            int r1 = com.google.protobuf.C63072j.m96021j(r14, r2, r0, r9)
            com.google.protobuf.bs r2 = r11.f169971d
            r13.mo58856n(r2, r0)
            goto L_0x051b
        L_0x0506:
            r14 = r32
            r5 = 0
            r15 = 10
            com.google.protobuf.ap r0 = new com.google.protobuf.ap
            double[] r1 = new double[r15]
            r0.<init>(r1, r5)
            int r1 = com.google.protobuf.C63072j.m96018g(r14, r2, r0, r9)
            com.google.protobuf.bs r2 = r11.f169971d
            r13.mo58856n(r2, r0)
        L_0x051b:
            r0 = r1
            goto L_0x0408
        L_0x051e:
            r14 = r32
            r5 = 0
            r15 = 10
            com.google.protobuf.gd r1 = r1.f169965c
            com.google.protobuf.gd r4 = com.google.protobuf.C63066gd.ENUM
            if (r1 != r4) goto L_0x0555
            int r2 = com.google.protobuf.C63072j.m96029r(r14, r2, r9)
            com.google.protobuf.bs r1 = r11.f169971d
            com.google.protobuf.ce r1 = r1.f169963a
            int r4 = r9.f170219a
            com.google.protobuf.cd r1 = r1.mo23993a(r4)
            if (r1 != 0) goto L_0x054e
            com.google.protobuf.fj r1 = r0.unknownFields
            com.google.protobuf.fj r4 = com.google.protobuf.C63045fj.f170156a
            if (r1 != r4) goto L_0x0546
            com.google.protobuf.fj r1 = new com.google.protobuf.fj
            r1.<init>()
            r0.unknownFields = r1
        L_0x0546:
            int r0 = r9.f170219a
            com.google.protobuf.C63023eo.m95840r(r10, r0, r1, r3)
        L_0x054b:
            r0 = r2
            goto L_0x0408
        L_0x054e:
            int r0 = r9.f170219a
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            goto L_0x0581
        L_0x0555:
            com.google.protobuf.bs r0 = r11.f169971d
            com.google.protobuf.gd r0 = r0.f169965c
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x062d;
                case 1: goto L_0x061c;
                case 2: goto L_0x060f;
                case 3: goto L_0x060f;
                case 4: goto L_0x0602;
                case 5: goto L_0x05f7;
                case 6: goto L_0x05ec;
                case 7: goto L_0x05d8;
                case 8: goto L_0x05cf;
                case 9: goto L_0x05ab;
                case 10: goto L_0x0593;
                case 11: goto L_0x058c;
                case 12: goto L_0x0602;
                case 13: goto L_0x0584;
                case 14: goto L_0x05ec;
                case 15: goto L_0x05f7;
                case 16: goto L_0x0573;
                case 17: goto L_0x0564;
                default: goto L_0x0560;
            }
        L_0x0560:
            r18 = 0
            goto L_0x063d
        L_0x0564:
            int r2 = com.google.protobuf.C63072j.m96032u(r14, r2, r9)
            long r0 = r9.f170220b
            long r0 = com.google.protobuf.C62897ae.m95109K(r0)
            java.lang.Long r16 = java.lang.Long.valueOf(r0)
            goto L_0x0581
        L_0x0573:
            int r2 = com.google.protobuf.C63072j.m96029r(r14, r2, r9)
            int r0 = r9.f170219a
            int r0 = com.google.protobuf.C62897ae.m95107I(r0)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
        L_0x0581:
            r0 = r16
            goto L_0x05a7
        L_0x0584:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Shouldn't reach here."
            r0.<init>(r1)
            throw r0
        L_0x058c:
            int r2 = com.google.protobuf.C63072j.m96012a(r14, r2, r9)
            java.lang.Object r0 = r9.f170221c
            goto L_0x05a7
        L_0x0593:
            com.google.protobuf.ee r0 = com.google.protobuf.C63013ee.f170090a
            com.google.protobuf.MessageLite r1 = r11.f169970c
            java.lang.Class r1 = r1.getClass()
            com.google.protobuf.en r0 = r0.mo59017a(r1)
            r4 = r34
            int r2 = com.google.protobuf.C63072j.m96015d(r0, r14, r2, r4, r9)
            java.lang.Object r0 = r9.f170221c
        L_0x05a7:
            r18 = 0
            goto L_0x063f
        L_0x05ab:
            r4 = r34
            com.google.protobuf.ee r0 = com.google.protobuf.C63013ee.f170090a
            com.google.protobuf.MessageLite r1 = r11.f169970c
            java.lang.Class r1 = r1.getClass()
            com.google.protobuf.en r0 = r0.mo59017a(r1)
            int r1 = r10 << 3
            r16 = r1 | 4
            r1 = r32
            r3 = r34
            r4 = r16
            r18 = 0
            r5 = r36
            int r2 = com.google.protobuf.C63072j.m96014c(r0, r1, r2, r3, r4, r5)
            java.lang.Object r0 = r9.f170221c
            goto L_0x063f
        L_0x05cf:
            r18 = 0
            int r2 = com.google.protobuf.C63072j.m96026o(r14, r2, r9)
            java.lang.Object r0 = r9.f170221c
            goto L_0x063f
        L_0x05d8:
            r18 = 0
            int r2 = com.google.protobuf.C63072j.m96032u(r14, r2, r9)
            long r0 = r9.f170220b
            int r3 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r3 == 0) goto L_0x05e5
            goto L_0x05e7
        L_0x05e5:
            r19 = 0
        L_0x05e7:
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r19)
            goto L_0x063d
        L_0x05ec:
            r18 = 0
            int r0 = com.google.protobuf.C63072j.m96013b(r14, r2)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            goto L_0x062a
        L_0x05f7:
            r18 = 0
            long r0 = com.google.protobuf.C63072j.m96034w(r14, r2)
            java.lang.Long r16 = java.lang.Long.valueOf(r0)
            goto L_0x063b
        L_0x0602:
            r18 = 0
            int r2 = com.google.protobuf.C63072j.m96029r(r14, r2, r9)
            int r0 = r9.f170219a
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            goto L_0x063d
        L_0x060f:
            r18 = 0
            int r2 = com.google.protobuf.C63072j.m96032u(r14, r2, r9)
            long r0 = r9.f170220b
            java.lang.Long r16 = java.lang.Long.valueOf(r0)
            goto L_0x063d
        L_0x061c:
            r18 = 0
            int r0 = com.google.protobuf.C63072j.m96013b(r14, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r16 = java.lang.Float.valueOf(r0)
        L_0x062a:
            int r2 = r2 + 4
            goto L_0x063d
        L_0x062d:
            r18 = 0
            long r0 = com.google.protobuf.C63072j.m96034w(r14, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r16 = java.lang.Double.valueOf(r0)
        L_0x063b:
            int r2 = r2 + 8
        L_0x063d:
            r0 = r16
        L_0x063f:
            com.google.protobuf.bs r1 = r11.f169971d
            boolean r3 = r1.f169966d
            if (r3 == 0) goto L_0x0649
            r13.mo58855m(r1, r0)
            goto L_0x0667
        L_0x0649:
            com.google.protobuf.gd r1 = r1.f169965c
            int r1 = r1.ordinal()
            r3 = 9
            if (r1 == r3) goto L_0x0656
            if (r1 == r15) goto L_0x0656
            goto L_0x0662
        L_0x0656:
            com.google.protobuf.bs r1 = r11.f169971d
            java.lang.Object r1 = r13.mo58854l(r1)
            if (r1 == 0) goto L_0x0662
            java.lang.Object r0 = com.google.protobuf.C62972cr.m95545e(r1, r0)
        L_0x0662:
            com.google.protobuf.bs r1 = r11.f169971d
            r13.mo58856n(r1, r0)
        L_0x0667:
            r0 = r2
            goto L_0x0687
        L_0x0669:
            r12 = r31
            r14 = r32
            goto L_0x0674
        L_0x066e:
            r12 = r31
            r14 = r32
            r9 = r36
        L_0x0674:
            r10 = r18
            r18 = 0
            com.google.protobuf.fj r4 = m95640d(r31)
            r0 = r7
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = com.google.protobuf.C63072j.m96028q(r0, r1, r2, r3, r4, r5)
        L_0x0687:
            r13 = r34
            r11 = r6
            r1 = r7
            r15 = r8
            r2 = r10
            r4 = r17
            r5 = r22
            r3 = r24
            r10 = r28
            r29 = r14
            r14 = r12
            r12 = r29
            goto L_0x0017
        L_0x069c:
            r17 = r4
            r22 = r5
            r28 = r10
            r6 = r11
            r12 = r14
            r8 = r15
        L_0x06a5:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r5 == r2) goto L_0x06b0
            long r2 = (long) r5
            r5 = r28
            r5.putInt(r12, r2, r4)
        L_0x06b0:
            int r2 = r8.f170073m
            r3 = r16
        L_0x06b4:
            int r4 = r8.f170074n
            if (r2 >= r4) goto L_0x06c7
            int[] r4 = r8.f170072l
            r4 = r4[r2]
            com.google.protobuf.fi r5 = r8.f170076p
            java.lang.Object r3 = r8.m95620F(r12, r4, r3, r5)
            com.google.protobuf.fj r3 = (com.google.protobuf.C63045fj) r3
            int r2 = r2 + 1
            goto L_0x06b4
        L_0x06c7:
            if (r3 == 0) goto L_0x06ce
            com.google.protobuf.fi r2 = r8.f170076p
            r2.mo59099n(r12, r3)
        L_0x06ce:
            if (r6 != 0) goto L_0x06da
            r2 = r34
            if (r0 != r2) goto L_0x06d5
            goto L_0x06e0
        L_0x06d5:
            com.google.protobuf.ct r0 = com.google.protobuf.C62974ct.m95556f()
            throw r0
        L_0x06da:
            r2 = r34
            if (r0 > r2) goto L_0x06e1
            if (r1 != r6) goto L_0x06e1
        L_0x06e0:
            return r0
        L_0x06e1:
            com.google.protobuf.ct r0 = com.google.protobuf.C62974ct.m95556f()
            goto L_0x06e7
        L_0x06e6:
            throw r0
        L_0x06e7:
            goto L_0x06e6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C63003dv.mo58994c(java.lang.Object, byte[], int, int, int, com.google.protobuf.i):int");
    }

    /* renamed from: e */
    public final Object mo58995e() {
        return C63006dy.m95677a(this.f170063a);
    }

    /* renamed from: f */
    public final void mo58996f(Object obj) {
        int i;
        int i2 = this.f170073m;
        while (true) {
            i = this.f170074n;
            if (i2 >= i) {
                break;
            }
            long B = (long) (m95616B(this.f170072l[i2]) & 1048575);
            Object p = C63054fs.f170169a.mo59138p(obj, B);
            if (p != null) {
                ((C62995dn) p).f170058b = false;
                C63054fs.f170169a.mo59141s(obj, B, p);
            }
            i2++;
        }
        int length = this.f170072l.length;
        while (i < length) {
            this.f170075o.mo58972b(obj, (long) this.f170072l[i]);
            i++;
        }
        this.f170076p.mo59098m(obj);
        if (this.f170068h) {
            this.f170077q.mo58838f(obj);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x038c, code lost:
        r5 = r2;
        r17 = r4;
        r11 = r6;
        r13 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0670, code lost:
        if (r20.mo58727U() == false) goto L_0x0672;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0672, code lost:
        r0 = r1.f170073m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0676, code lost:
        if (r0 < r1.f170074n) goto L_0x0678;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0678, code lost:
        r5 = m95620F(r8, r1.f170072l[r0], r5, r13);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0683, code lost:
        if (r5 != null) goto L_0x0685;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0685, code lost:
        r13.mo59099n(r8, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0688, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0689, code lost:
        if (r5 == null) goto L_0x068b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
        r5 = r13.mo59088c(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0694, code lost:
        if (r13.mo59101p(r5, r0) == false) goto L_0x0696;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0696, code lost:
        r0 = r1.f170073m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x069a, code lost:
        if (r0 < r1.f170074n) goto L_0x069c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x069c, code lost:
        r5 = m95620F(r8, r1.f170072l[r0], r5, r13);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x06a7, code lost:
        if (r5 != null) goto L_0x06a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x06a9, code lost:
        r13.mo59099n(r8, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0196, code lost:
        r17 = r4;
        r15 = r5;
        r11 = r6;
        r13 = r7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:185:0x0666 */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x066c A[Catch:{ all -> 0x065e }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0689  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x06b7 A[LOOP:6: B:212:0x06b3->B:214:0x06b7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x06c4  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58998h(java.lang.Object r19, com.google.protobuf.C63016eh r20, com.google.protobuf.C62921ba r21) {
        /*
            r18 = this;
            r1 = r18
            r8 = r19
            r0 = r20
            r6 = r21
            r21.getClass()
            com.google.protobuf.fi r7 = r1.f170076p
            com.google.protobuf.bb r4 = r1.f170077q
            r16 = 0
            r5 = r16
            r9 = r5
        L_0x0014:
            int r2 = r20.mo58730c()     // Catch:{ all -> 0x06ad }
            int r10 = r1.m95651w(r2)     // Catch:{ all -> 0x06ad }
            if (r10 >= 0) goto L_0x0093
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L_0x003a
            int r0 = r1.f170073m
        L_0x0025:
            int r2 = r1.f170074n
            if (r0 >= r2) goto L_0x0034
            int[] r2 = r1.f170072l
            r2 = r2[r0]
            java.lang.Object r5 = r1.m95620F(r8, r2, r5, r7)
            int r0 = r0 + 1
            goto L_0x0025
        L_0x0034:
            if (r5 == 0) goto L_0x06ac
            r7.mo59099n(r8, r5)
            return
        L_0x003a:
            boolean r3 = r1.f170068h     // Catch:{ all -> 0x06ad }
            if (r3 != 0) goto L_0x0041
            r11 = r16
            goto L_0x0048
        L_0x0041:
            com.google.protobuf.MessageLite r3 = r1.f170063a     // Catch:{ all -> 0x06ad }
            java.lang.Object r2 = r4.mo58836d(r6, r3, r2)     // Catch:{ all -> 0x06ad }
            r11 = r2
        L_0x0048:
            if (r11 == 0) goto L_0x005f
            if (r9 != 0) goto L_0x0050
            com.google.protobuf.bf r9 = r4.mo58835c(r8)     // Catch:{ all -> 0x06ad }
        L_0x0050:
            r2 = r9
            r9 = r4
            r10 = r20
            r12 = r21
            r13 = r2
            r14 = r5
            r15 = r7
            java.lang.Object r5 = r9.mo58837e(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x06ad }
            r9 = r2
            goto L_0x0014
        L_0x005f:
            boolean r2 = r7.mo59102q()     // Catch:{ all -> 0x06ad }
            if (r2 == 0) goto L_0x006c
            boolean r2 = r20.mo58727U()     // Catch:{ all -> 0x06ad }
            if (r2 != 0) goto L_0x0014
            goto L_0x0078
        L_0x006c:
            if (r5 != 0) goto L_0x0072
            java.lang.Object r5 = r7.mo59088c(r8)     // Catch:{ all -> 0x06ad }
        L_0x0072:
            boolean r2 = r7.mo59101p(r5, r0)     // Catch:{ all -> 0x008f }
            if (r2 != 0) goto L_0x0014
        L_0x0078:
            int r0 = r1.f170073m
        L_0x007a:
            int r2 = r1.f170074n
            if (r0 >= r2) goto L_0x0089
            int[] r2 = r1.f170072l
            r2 = r2[r0]
            java.lang.Object r5 = r1.m95620F(r8, r2, r5, r7)
            int r0 = r0 + 1
            goto L_0x007a
        L_0x0089:
            if (r5 == 0) goto L_0x06ac
            r7.mo59099n(r8, r5)
            return
        L_0x008f:
            r0 = move-exception
            r13 = r7
            goto L_0x06b1
        L_0x0093:
            int r3 = r1.m95616B(r10)     // Catch:{ all -> 0x06ad }
            int r11 = m95615A(r3)     // Catch:{ cs -> 0x0660 }
            r12 = 1048575(0xfffff, float:1.469367E-39)
            switch(r11) {
                case 0: goto L_0x0622;
                case 1: goto L_0x060d;
                case 2: goto L_0x05f6;
                case 3: goto L_0x05df;
                case 4: goto L_0x05c9;
                case 5: goto L_0x05b1;
                case 6: goto L_0x059b;
                case 7: goto L_0x0585;
                case 8: goto L_0x0575;
                case 9: goto L_0x0539;
                case 10: goto L_0x0523;
                case 11: goto L_0x050d;
                case 12: goto L_0x04e3;
                case 13: goto L_0x04cd;
                case 14: goto L_0x04b5;
                case 15: goto L_0x049f;
                case 16: goto L_0x047d;
                case 17: goto L_0x0446;
                case 18: goto L_0x0439;
                case 19: goto L_0x042c;
                case 20: goto L_0x041f;
                case 21: goto L_0x0412;
                case 22: goto L_0x0405;
                case 23: goto L_0x03f8;
                case 24: goto L_0x03eb;
                case 25: goto L_0x03de;
                case 26: goto L_0x03be;
                case 27: goto L_0x03ad;
                case 28: goto L_0x03a0;
                case 29: goto L_0x0393;
                case 30: goto L_0x0379;
                case 31: goto L_0x036c;
                case 32: goto L_0x035f;
                case 33: goto L_0x0352;
                case 34: goto L_0x0345;
                case 35: goto L_0x0338;
                case 36: goto L_0x032b;
                case 37: goto L_0x031e;
                case 38: goto L_0x0311;
                case 39: goto L_0x0304;
                case 40: goto L_0x02f7;
                case 41: goto L_0x02ea;
                case 42: goto L_0x02dd;
                case 43: goto L_0x02d0;
                case 44: goto L_0x02bb;
                case 45: goto L_0x02ae;
                case 46: goto L_0x02a1;
                case 47: goto L_0x0294;
                case 48: goto L_0x0287;
                case 49: goto L_0x0275;
                case 50: goto L_0x0237;
                case 51: goto L_0x0223;
                case 52: goto L_0x020f;
                case 53: goto L_0x01fc;
                case 54: goto L_0x01e9;
                case 55: goto L_0x01d6;
                case 56: goto L_0x01c3;
                case 57: goto L_0x01b0;
                case 58: goto L_0x019d;
                case 59: goto L_0x0190;
                case 60: goto L_0x015a;
                case 61: goto L_0x014b;
                case 62: goto L_0x0138;
                case 63: goto L_0x0112;
                case 64: goto L_0x00fe;
                case 65: goto L_0x00ea;
                case 66: goto L_0x00d6;
                case 67: goto L_0x00c2;
                case 68: goto L_0x00ae;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            r17 = r4
            r15 = r5
            r11 = r6
            r13 = r7
            if (r15 != 0) goto L_0x063a
            java.lang.Object r5 = r13.mo59091f()     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            goto L_0x063b
        L_0x00ae:
            r3 = r3 & r12
            long r11 = (long) r3
            com.google.protobuf.en r3 = r1.m95619E(r10)     // Catch:{ cs -> 0x0660 }
            java.lang.Object r3 = r0.mo58745s(r3, r6)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r13 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r13.mo59141s(r8, r11, r3)     // Catch:{ cs -> 0x0660 }
            r1.m95627M(r8, r2, r10)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x00c2:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ cs -> 0x0660 }
            long r13 = r20.mo58741n()     // Catch:{ cs -> 0x0660 }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r13 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r13.mo59141s(r8, r11, r3)     // Catch:{ cs -> 0x0660 }
            r1.m95627M(r8, r2, r10)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x00d6:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ cs -> 0x0660 }
            int r3 = r20.mo58736i()     // Catch:{ cs -> 0x0660 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r13 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r13.mo59141s(r8, r11, r3)     // Catch:{ cs -> 0x0660 }
            r1.m95627M(r8, r2, r10)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x00ea:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ cs -> 0x0660 }
            long r13 = r20.mo58740m()     // Catch:{ cs -> 0x0660 }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r13 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r13.mo59141s(r8, r11, r3)     // Catch:{ cs -> 0x0660 }
            r1.m95627M(r8, r2, r10)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x00fe:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ cs -> 0x0660 }
            int r3 = r20.mo58735h()     // Catch:{ cs -> 0x0660 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r13 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r13.mo59141s(r8, r11, r3)     // Catch:{ cs -> 0x0660 }
            r1.m95627M(r8, r2, r10)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x0112:
            int r11 = r20.mo58732e()     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.cf r13 = r1.m95618D(r10)     // Catch:{ cs -> 0x0660 }
            if (r13 == 0) goto L_0x0129
            boolean r13 = r13.isInRange(r11)     // Catch:{ cs -> 0x0660 }
            if (r13 == 0) goto L_0x0123
            goto L_0x0129
        L_0x0123:
            java.lang.Object r2 = com.google.protobuf.C63023eo.m95840r(r2, r11, r5, r7)     // Catch:{ cs -> 0x0660 }
            goto L_0x038c
        L_0x0129:
            r3 = r3 & r12
            long r12 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r11.mo59141s(r8, r12, r3)     // Catch:{ cs -> 0x0660 }
            r1.m95627M(r8, r2, r10)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x0138:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ cs -> 0x0660 }
            int r3 = r20.mo58737j()     // Catch:{ cs -> 0x0660 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r13 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r13.mo59141s(r8, r11, r3)     // Catch:{ cs -> 0x0660 }
            r1.m95627M(r8, r2, r10)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x014b:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.z r3 = r20.mo58743q()     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r13 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r13.mo59141s(r8, r11, r3)     // Catch:{ cs -> 0x0660 }
            r1.m95627M(r8, r2, r10)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x015a:
            boolean r11 = r1.m95633S(r8, r2, r10)     // Catch:{ cs -> 0x0660 }
            if (r11 == 0) goto L_0x017a
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            java.lang.Object r3 = r3.mo59138p(r8, r11)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.en r13 = r1.m95619E(r10)     // Catch:{ cs -> 0x0660 }
            java.lang.Object r13 = r0.mo58747u(r13, r6)     // Catch:{ cs -> 0x0660 }
            java.lang.Object r3 = com.google.protobuf.C62972cr.m95545e(r3, r13)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r13 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r13.mo59141s(r8, r11, r3)     // Catch:{ cs -> 0x0660 }
            goto L_0x018c
        L_0x017a:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.en r3 = r1.m95619E(r10)     // Catch:{ cs -> 0x0660 }
            java.lang.Object r3 = r0.mo58747u(r3, r6)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r13 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r13.mo59141s(r8, r11, r3)     // Catch:{ cs -> 0x0660 }
            r1.m95626L(r8, r10)     // Catch:{ cs -> 0x0660 }
        L_0x018c:
            r1.m95627M(r8, r2, r10)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x0190:
            r1.m95625K(r8, r3, r0)     // Catch:{ cs -> 0x0660 }
            r1.m95627M(r8, r2, r10)     // Catch:{ cs -> 0x0660 }
        L_0x0196:
            r17 = r4
            r15 = r5
            r11 = r6
            r13 = r7
            goto L_0x0638
        L_0x019d:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ cs -> 0x0660 }
            boolean r3 = r20.mo58726T()     // Catch:{ cs -> 0x0660 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r13 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r13.mo59141s(r8, r11, r3)     // Catch:{ cs -> 0x0660 }
            r1.m95627M(r8, r2, r10)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x01b0:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ cs -> 0x0660 }
            int r3 = r20.mo58733f()     // Catch:{ cs -> 0x0660 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r13 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r13.mo59141s(r8, r11, r3)     // Catch:{ cs -> 0x0660 }
            r1.m95627M(r8, r2, r10)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x01c3:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ cs -> 0x0660 }
            long r13 = r20.mo58738k()     // Catch:{ cs -> 0x0660 }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r13 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r13.mo59141s(r8, r11, r3)     // Catch:{ cs -> 0x0660 }
            r1.m95627M(r8, r2, r10)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x01d6:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ cs -> 0x0660 }
            int r3 = r20.mo58734g()     // Catch:{ cs -> 0x0660 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r13 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r13.mo59141s(r8, r11, r3)     // Catch:{ cs -> 0x0660 }
            r1.m95627M(r8, r2, r10)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x01e9:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ cs -> 0x0660 }
            long r13 = r20.mo58742o()     // Catch:{ cs -> 0x0660 }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r13 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r13.mo59141s(r8, r11, r3)     // Catch:{ cs -> 0x0660 }
            r1.m95627M(r8, r2, r10)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x01fc:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ cs -> 0x0660 }
            long r13 = r20.mo58739l()     // Catch:{ cs -> 0x0660 }
            java.lang.Long r3 = java.lang.Long.valueOf(r13)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r13 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r13.mo59141s(r8, r11, r3)     // Catch:{ cs -> 0x0660 }
            r1.m95627M(r8, r2, r10)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x020f:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ cs -> 0x0660 }
            float r3 = r20.mo58729b()     // Catch:{ cs -> 0x0660 }
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r13 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r13.mo59141s(r8, r11, r3)     // Catch:{ cs -> 0x0660 }
            r1.m95627M(r8, r2, r10)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x0223:
            r3 = r3 & r12
            long r11 = (long) r3     // Catch:{ cs -> 0x0660 }
            double r13 = r20.mo58728a()     // Catch:{ cs -> 0x0660 }
            java.lang.Double r3 = java.lang.Double.valueOf(r13)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r13 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r13.mo59141s(r8, r11, r3)     // Catch:{ cs -> 0x0660 }
            r1.m95627M(r8, r2, r10)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x0237:
            java.lang.Object r2 = r1.m95621G(r10)     // Catch:{ cs -> 0x0660 }
            int r3 = r1.m95616B(r10)     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            java.lang.Object r3 = r3.mo59138p(r8, r10)     // Catch:{ cs -> 0x0660 }
            if (r3 != 0) goto L_0x0255
            com.google.protobuf.dn r3 = com.google.protobuf.C62995dn.f170057a     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.dn r3 = r3.mo58980a()     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r12 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r12.mo59141s(r8, r10, r3)     // Catch:{ cs -> 0x0660 }
            goto L_0x026a
        L_0x0255:
            boolean r12 = com.google.protobuf.C62996do.m95605b(r3)     // Catch:{ cs -> 0x0660 }
            if (r12 == 0) goto L_0x026a
            com.google.protobuf.dn r12 = com.google.protobuf.C62995dn.f170057a     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.dn r12 = r12.mo58980a()     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.C62996do.m95606c(r12, r3)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r3 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r3.mo59141s(r8, r10, r12)     // Catch:{ cs -> 0x0660 }
            r3 = r12
        L_0x026a:
            com.google.protobuf.dn r3 = (com.google.protobuf.C62995dn) r3     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.dm r2 = (com.google.protobuf.C62994dm) r2     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.dl r2 = r2.f170056a     // Catch:{ cs -> 0x0660 }
            r0.mo58716I(r3, r2, r6)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x0275:
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.en r10 = r1.m95619E(r10)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.de r11 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r11.mo58971a(r8, r2)     // Catch:{ cs -> 0x0660 }
            r0.mo58713F(r2, r10, r6)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x0287:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58721N(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x0294:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58720M(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x02a1:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58719L(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x02ae:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58718K(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x02bb:
            com.google.protobuf.de r11 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r12 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r3 = r11.mo58971a(r8, r12)     // Catch:{ cs -> 0x0660 }
            r0.mo58709B(r3)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.cf r10 = r1.m95618D(r10)     // Catch:{ cs -> 0x0660 }
            java.lang.Object r2 = com.google.protobuf.C63023eo.m95839q(r2, r3, r10, r5, r7)     // Catch:{ cs -> 0x0660 }
            goto L_0x038c
        L_0x02d0:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58724R(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x02dd:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58751y(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x02ea:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58710C(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x02f7:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58711D(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x0304:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58714G(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x0311:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58725S(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x031e:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58715H(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x032b:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58712E(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x0338:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58708A(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x0345:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58721N(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x0352:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58720M(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x035f:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58719L(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x036c:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58718K(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x0379:
            com.google.protobuf.de r11 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r12 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r3 = r11.mo58971a(r8, r12)     // Catch:{ cs -> 0x0660 }
            r0.mo58709B(r3)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.cf r10 = r1.m95618D(r10)     // Catch:{ cs -> 0x0660 }
            java.lang.Object r2 = com.google.protobuf.C63023eo.m95839q(r2, r3, r10, r5, r7)     // Catch:{ cs -> 0x0660 }
        L_0x038c:
            r5 = r2
            r17 = r4
            r11 = r6
            r13 = r7
            goto L_0x0658
        L_0x0393:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58724R(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x03a0:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58752z(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x03ad:
            com.google.protobuf.en r2 = r1.m95619E(r10)     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.de r3 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            java.util.List r3 = r3.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58717J(r3, r2, r6)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x03be:
            boolean r2 = m95629O(r3)     // Catch:{ cs -> 0x0660 }
            if (r2 == 0) goto L_0x03d1
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58723Q(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x03d1:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58722O(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x03de:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58751y(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x03eb:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58710C(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x03f8:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58711D(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x0405:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58714G(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x0412:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58725S(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x041f:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58715H(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x042c:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58712E(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x0439:
            com.google.protobuf.de r2 = r1.f170075o     // Catch:{ cs -> 0x0660 }
            r3 = r3 & r12
            long r10 = (long) r3     // Catch:{ cs -> 0x0660 }
            java.util.List r2 = r2.mo58971a(r8, r10)     // Catch:{ cs -> 0x0660 }
            r0.mo58708A(r2)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x0446:
            boolean r2 = r1.m95630P(r8, r10)     // Catch:{ cs -> 0x0660 }
            if (r2 == 0) goto L_0x0468
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            java.lang.Object r11 = r11.mo59138p(r8, r2)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.en r10 = r1.m95619E(r10)     // Catch:{ cs -> 0x0660 }
            java.lang.Object r10 = r0.mo58745s(r10, r6)     // Catch:{ cs -> 0x0660 }
            java.lang.Object r10 = com.google.protobuf.C62972cr.m95545e(r11, r10)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r11.mo59141s(r8, r2, r10)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x0468:
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.en r11 = r1.m95619E(r10)     // Catch:{ cs -> 0x0660 }
            java.lang.Object r11 = r0.mo58745s(r11, r6)     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r12 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r12.mo59141s(r8, r2, r11)     // Catch:{ cs -> 0x0660 }
            r1.m95626L(r8, r10)     // Catch:{ cs -> 0x0660 }
            goto L_0x0196
        L_0x047d:
            r2 = r3 & r12
            long r11 = (long) r2     // Catch:{ cs -> 0x0660 }
            long r13 = r20.mo58741n()     // Catch:{ cs -> 0x0660 }
            com.google.protobuf.fr r2 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0660 }
            r3 = r19
            r17 = r4
            r15 = r5
            r4 = r11
            r11 = r6
            r12 = r7
            r6 = r13
            r2.mo59140r(r3, r4, r6)     // Catch:{ cs -> 0x049c, all -> 0x0498 }
            r1.m95626L(r8, r10)     // Catch:{ cs -> 0x049c, all -> 0x0498 }
            r13 = r12
            goto L_0x0638
        L_0x0498:
            r0 = move-exception
            r13 = r12
            goto L_0x06b0
        L_0x049c:
            r13 = r12
            goto L_0x0665
        L_0x049f:
            r17 = r4
            r15 = r5
            r11 = r6
            r13 = r7
            r2 = r3 & r12
            long r2 = (long) r2
            int r4 = r20.mo58736i()     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.fr r5 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r5.mo59139q(r8, r2, r4)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r1.m95626L(r8, r10)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            goto L_0x0638
        L_0x04b5:
            r17 = r4
            r15 = r5
            r11 = r6
            r13 = r7
            r2 = r3 & r12
            long r4 = (long) r2     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            long r6 = r20.mo58740m()     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.fr r2 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r3 = r19
            r2.mo59140r(r3, r4, r6)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r1.m95626L(r8, r10)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            goto L_0x0638
        L_0x04cd:
            r17 = r4
            r15 = r5
            r11 = r6
            r13 = r7
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            int r4 = r20.mo58735h()     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.fr r5 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r5.mo59139q(r8, r2, r4)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r1.m95626L(r8, r10)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            goto L_0x0638
        L_0x04e3:
            r17 = r4
            r15 = r5
            r11 = r6
            r13 = r7
            int r4 = r20.mo58732e()     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.cf r5 = r1.m95618D(r10)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            if (r5 == 0) goto L_0x0500
            boolean r5 = r5.isInRange(r4)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            if (r5 == 0) goto L_0x04f9
            goto L_0x0500
        L_0x04f9:
            java.lang.Object r2 = com.google.protobuf.C63023eo.m95840r(r2, r4, r15, r13)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r5 = r2
            goto L_0x0658
        L_0x0500:
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.fr r5 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r5.mo59139q(r8, r2, r4)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r1.m95626L(r8, r10)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            goto L_0x0638
        L_0x050d:
            r17 = r4
            r15 = r5
            r11 = r6
            r13 = r7
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            int r4 = r20.mo58737j()     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.fr r5 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r5.mo59139q(r8, r2, r4)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r1.m95626L(r8, r10)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            goto L_0x0638
        L_0x0523:
            r17 = r4
            r15 = r5
            r11 = r6
            r13 = r7
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.z r4 = r20.mo58743q()     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.fr r5 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r5.mo59141s(r8, r2, r4)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r1.m95626L(r8, r10)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            goto L_0x0638
        L_0x0539:
            r17 = r4
            r15 = r5
            r11 = r6
            r13 = r7
            boolean r2 = r1.m95630P(r8, r10)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            if (r2 == 0) goto L_0x0560
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.fr r4 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            java.lang.Object r4 = r4.mo59138p(r8, r2)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.en r5 = r1.m95619E(r10)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            java.lang.Object r5 = r0.mo58747u(r5, r11)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            java.lang.Object r4 = com.google.protobuf.C62972cr.m95545e(r4, r5)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.fr r5 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r5.mo59141s(r8, r2, r4)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            goto L_0x0638
        L_0x0560:
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.en r4 = r1.m95619E(r10)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            java.lang.Object r4 = r0.mo58747u(r4, r11)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.fr r5 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r5.mo59141s(r8, r2, r4)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r1.m95626L(r8, r10)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            goto L_0x0638
        L_0x0575:
            r17 = r4
            r15 = r5
            r11 = r6
            r13 = r7
            r1.m95625K(r8, r3, r0)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r1.m95626L(r8, r10)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            goto L_0x0638
        L_0x0582:
            r0 = move-exception
            goto L_0x06b0
        L_0x0585:
            r17 = r4
            r15 = r5
            r11 = r6
            r13 = r7
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            boolean r4 = r20.mo58726T()     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.fr r5 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r5.mo59128f(r8, r2, r4)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r1.m95626L(r8, r10)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            goto L_0x0638
        L_0x059b:
            r17 = r4
            r15 = r5
            r11 = r6
            r13 = r7
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            int r4 = r20.mo58733f()     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.fr r5 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r5.mo59139q(r8, r2, r4)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r1.m95626L(r8, r10)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            goto L_0x0638
        L_0x05b1:
            r17 = r4
            r15 = r5
            r11 = r6
            r13 = r7
            r2 = r3 & r12
            long r4 = (long) r2     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            long r6 = r20.mo58738k()     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.fr r2 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r3 = r19
            r2.mo59140r(r3, r4, r6)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r1.m95626L(r8, r10)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            goto L_0x0638
        L_0x05c9:
            r17 = r4
            r15 = r5
            r11 = r6
            r13 = r7
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            int r4 = r20.mo58734g()     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.fr r5 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r5.mo59139q(r8, r2, r4)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r1.m95626L(r8, r10)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            goto L_0x0638
        L_0x05df:
            r17 = r4
            r15 = r5
            r11 = r6
            r13 = r7
            r2 = r3 & r12
            long r4 = (long) r2     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            long r6 = r20.mo58742o()     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.fr r2 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r3 = r19
            r2.mo59140r(r3, r4, r6)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r1.m95626L(r8, r10)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            goto L_0x0638
        L_0x05f6:
            r17 = r4
            r15 = r5
            r11 = r6
            r13 = r7
            r2 = r3 & r12
            long r4 = (long) r2     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            long r6 = r20.mo58739l()     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.fr r2 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r3 = r19
            r2.mo59140r(r3, r4, r6)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r1.m95626L(r8, r10)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            goto L_0x0638
        L_0x060d:
            r17 = r4
            r15 = r5
            r11 = r6
            r13 = r7
            r2 = r3 & r12
            long r2 = (long) r2     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            float r4 = r20.mo58729b()     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.fr r5 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r5.mo59132j(r8, r2, r4)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r1.m95626L(r8, r10)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            goto L_0x0638
        L_0x0622:
            r17 = r4
            r15 = r5
            r11 = r6
            r13 = r7
            r2 = r3 & r12
            long r4 = (long) r2     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            double r6 = r20.mo58728a()     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            com.google.protobuf.fr r2 = com.google.protobuf.C63054fs.f170169a     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r3 = r19
            r2.mo59131i(r3, r4, r6)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
            r1.m95626L(r8, r10)     // Catch:{ cs -> 0x0665, all -> 0x0582 }
        L_0x0638:
            r5 = r15
            goto L_0x0658
        L_0x063a:
            r5 = r15
        L_0x063b:
            boolean r2 = r13.mo59101p(r5, r0)     // Catch:{ cs -> 0x0666 }
            if (r2 != 0) goto L_0x0658
            int r0 = r1.f170073m
        L_0x0643:
            int r2 = r1.f170074n
            if (r0 >= r2) goto L_0x0652
            int[] r2 = r1.f170072l
            r2 = r2[r0]
            java.lang.Object r5 = r1.m95620F(r8, r2, r5, r13)
            int r0 = r0 + 1
            goto L_0x0643
        L_0x0652:
            if (r5 == 0) goto L_0x06ac
            r13.mo59099n(r8, r5)
            return
        L_0x0658:
            r6 = r11
            r7 = r13
            r4 = r17
            goto L_0x0014
        L_0x065e:
            r0 = move-exception
            goto L_0x06b1
        L_0x0660:
            r17 = r4
            r15 = r5
            r11 = r6
            r13 = r7
        L_0x0665:
            r5 = r15
        L_0x0666:
            boolean r2 = r13.mo59102q()     // Catch:{ all -> 0x065e }
            if (r2 == 0) goto L_0x0689
            boolean r2 = r20.mo58727U()     // Catch:{ all -> 0x065e }
            if (r2 != 0) goto L_0x0658
            int r0 = r1.f170073m
        L_0x0674:
            int r2 = r1.f170074n
            if (r0 >= r2) goto L_0x0683
            int[] r2 = r1.f170072l
            r2 = r2[r0]
            java.lang.Object r5 = r1.m95620F(r8, r2, r5, r13)
            int r0 = r0 + 1
            goto L_0x0674
        L_0x0683:
            if (r5 == 0) goto L_0x06ac
            r13.mo59099n(r8, r5)
            return
        L_0x0689:
            if (r5 != 0) goto L_0x0690
            java.lang.Object r2 = r13.mo59088c(r8)     // Catch:{ all -> 0x065e }
            r5 = r2
        L_0x0690:
            boolean r2 = r13.mo59101p(r5, r0)     // Catch:{ all -> 0x065e }
            if (r2 != 0) goto L_0x0658
            int r0 = r1.f170073m
        L_0x0698:
            int r2 = r1.f170074n
            if (r0 >= r2) goto L_0x06a7
            int[] r2 = r1.f170072l
            r2 = r2[r0]
            java.lang.Object r5 = r1.m95620F(r8, r2, r5, r13)
            int r0 = r0 + 1
            goto L_0x0698
        L_0x06a7:
            if (r5 == 0) goto L_0x06ac
            r13.mo59099n(r8, r5)
        L_0x06ac:
            return
        L_0x06ad:
            r0 = move-exception
            r15 = r5
            r13 = r7
        L_0x06b0:
            r5 = r15
        L_0x06b1:
            int r2 = r1.f170073m
        L_0x06b3:
            int r3 = r1.f170074n
            if (r2 >= r3) goto L_0x06c2
            int[] r3 = r1.f170072l
            r3 = r3[r2]
            java.lang.Object r5 = r1.m95620F(r8, r3, r5, r13)
            int r2 = r2 + 1
            goto L_0x06b3
        L_0x06c2:
            if (r5 == 0) goto L_0x06c7
            r13.mo59099n(r8, r5)
        L_0x06c7:
            goto L_0x06c9
        L_0x06c8:
            throw r0
        L_0x06c9:
            goto L_0x06c8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C63003dv.mo58998h(java.lang.Object, com.google.protobuf.eh, com.google.protobuf.ba):void");
    }

    /* renamed from: i */
    public final void mo58999i(Object obj, byte[] bArr, int i, int i2, C63071i iVar) {
        if (this.f170070j) {
            m95636V(obj, bArr, i, i2, iVar);
        } else {
            mo58994c(obj, bArr, i, i2, 0, iVar);
        }
    }

    /* renamed from: j */
    public final boolean mo59000j(Object obj, Object obj2) {
        boolean z;
        int length = this.f170064d.length;
        for (int i = 0; i < length; i += 3) {
            int B = m95616B(i);
            long j = (long) (B & 1048575);
            switch (m95615A(B)) {
                case 0:
                    if (m95628N(obj, obj2, i) && Double.doubleToLongBits(C63054fs.f170169a.mo59124b(obj, j)) == Double.doubleToLongBits(C63054fs.f170169a.mo59124b(obj2, j))) {
                        continue;
                    }
                case 1:
                    if (m95628N(obj, obj2, i) && Float.floatToIntBits(C63054fs.f170169a.mo59125c(obj, j)) == Float.floatToIntBits(C63054fs.f170169a.mo59125c(obj2, j))) {
                        continue;
                    }
                case 2:
                    if (m95628N(obj, obj2, i) && C63054fs.f170169a.mo59136n(obj, j) == C63054fs.f170169a.mo59136n(obj2, j)) {
                        continue;
                    }
                case 3:
                    if (m95628N(obj, obj2, i) && C63054fs.f170169a.mo59136n(obj, j) == C63054fs.f170169a.mo59136n(obj2, j)) {
                        continue;
                    }
                case 4:
                    if (m95628N(obj, obj2, i) && C63054fs.f170169a.mo59135m(obj, j) == C63054fs.f170169a.mo59135m(obj2, j)) {
                        continue;
                    }
                case 5:
                    if (m95628N(obj, obj2, i) && C63054fs.f170169a.mo59136n(obj, j) == C63054fs.f170169a.mo59136n(obj2, j)) {
                        continue;
                    }
                case 6:
                    if (m95628N(obj, obj2, i) && C63054fs.f170169a.mo59135m(obj, j) == C63054fs.f170169a.mo59135m(obj2, j)) {
                        continue;
                    }
                case 7:
                    if (m95628N(obj, obj2, i) && C63054fs.f170169a.mo59133k(obj, j) == C63054fs.f170169a.mo59133k(obj2, j)) {
                        continue;
                    }
                case 8:
                    if (m95628N(obj, obj2, i) && C63023eo.m95844v(C63054fs.f170169a.mo59138p(obj, j), C63054fs.f170169a.mo59138p(obj2, j))) {
                        continue;
                    }
                case 9:
                    if (m95628N(obj, obj2, i) && C63023eo.m95844v(C63054fs.f170169a.mo59138p(obj, j), C63054fs.f170169a.mo59138p(obj2, j))) {
                        continue;
                    }
                case 10:
                    if (m95628N(obj, obj2, i) && C63023eo.m95844v(C63054fs.f170169a.mo59138p(obj, j), C63054fs.f170169a.mo59138p(obj2, j))) {
                        continue;
                    }
                case 11:
                    if (m95628N(obj, obj2, i) && C63054fs.f170169a.mo59135m(obj, j) == C63054fs.f170169a.mo59135m(obj2, j)) {
                        continue;
                    }
                case 12:
                    if (m95628N(obj, obj2, i) && C63054fs.f170169a.mo59135m(obj, j) == C63054fs.f170169a.mo59135m(obj2, j)) {
                        continue;
                    }
                case 13:
                    if (m95628N(obj, obj2, i) && C63054fs.f170169a.mo59135m(obj, j) == C63054fs.f170169a.mo59135m(obj2, j)) {
                        continue;
                    }
                case 14:
                    if (m95628N(obj, obj2, i) && C63054fs.f170169a.mo59136n(obj, j) == C63054fs.f170169a.mo59136n(obj2, j)) {
                        continue;
                    }
                case 15:
                    if (m95628N(obj, obj2, i) && C63054fs.f170169a.mo59135m(obj, j) == C63054fs.f170169a.mo59135m(obj2, j)) {
                        continue;
                    }
                case 16:
                    if (m95628N(obj, obj2, i) && C63054fs.f170169a.mo59136n(obj, j) == C63054fs.f170169a.mo59136n(obj2, j)) {
                        continue;
                    }
                case 17:
                    if (m95628N(obj, obj2, i) && C63023eo.m95844v(C63054fs.f170169a.mo59138p(obj, j), C63054fs.f170169a.mo59138p(obj2, j))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = C63023eo.m95844v(C63054fs.f170169a.mo59138p(obj, j), C63054fs.f170169a.mo59138p(obj2, j));
                    break;
                case 50:
                    z = C63023eo.m95844v(C63054fs.f170169a.mo59138p(obj, j), C63054fs.f170169a.mo59138p(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long y = (long) (m95653y(i) & 1048575);
                    if (C63054fs.f170169a.mo59135m(obj, y) == C63054fs.f170169a.mo59135m(obj2, y) && C63023eo.m95844v(C63054fs.f170169a.mo59138p(obj, j), C63054fs.f170169a.mo59138p(obj2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.f170076p.mo59089d(obj).equals(this.f170076p.mo59089d(obj2))) {
            return false;
        }
        if (this.f170068h) {
            return this.f170077q.mo58834b(obj).equals(this.f170077q.mo58834b(obj2));
        }
        return true;
    }

    /* renamed from: k */
    public final boolean mo59001k(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f170073m) {
            int i6 = this.f170072l[i5];
            int i7 = this.f170064d[i6];
            int B = m95616B(i6);
            int i8 = this.f170064d[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f170062c.getInt(obj2, (long) i9);
                }
                i = i4;
                i2 = i9;
            } else {
                i2 = i3;
                i = i4;
            }
            if ((268435456 & B) != 0 && !m95631Q(obj, i6, i2, i, i10)) {
                return false;
            }
            int A = m95615A(B);
            if (A != 9 && A != 17) {
                if (A != 27) {
                    if (A == 60 || A == 68) {
                        if (m95633S(obj2, i7, i6) && !m95632R(obj2, B, m95619E(i6))) {
                            return false;
                        }
                    } else if (A != 49) {
                        if (A != 50) {
                            continue;
                        } else {
                            C62995dn dnVar = (C62995dn) C63054fs.f170169a.mo59138p(obj2, (long) (B & 1048575));
                            if (!dnVar.isEmpty() && ((C62994dm) m95621G(i6)).f170056a.f170054c.f170203s == C63067ge.MESSAGE) {
                                C63022en enVar = null;
                                for (Object next : dnVar.values()) {
                                    if (enVar == null) {
                                        enVar = C63013ee.f170090a.mo59017a(next.getClass());
                                    }
                                    if (!enVar.mo59001k(next)) {
                                        return false;
                                    }
                                }
                                continue;
                            }
                        }
                    }
                }
                List list = (List) C63054fs.f170169a.mo59138p(obj2, (long) (B & 1048575));
                if (!list.isEmpty()) {
                    C63022en E = m95619E(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!E.mo59001k(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (m95631Q(obj, i6, i2, i, i10) && !m95632R(obj2, B, m95619E(i6))) {
                return false;
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        return !this.f170068h || this.f170077q.mo58834b(obj2).mo58852i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x05de  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59002m(java.lang.Object r18, com.google.protobuf.C62907ao r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f170070j
            if (r3 == 0) goto L_0x05fc
            boolean r3 = r0.f170068h
            r4 = 0
            if (r3 == 0) goto L_0x0028
            com.google.protobuf.bb r3 = r0.f170077q
            com.google.protobuf.bf r3 = r3.mo58834b(r1)
            com.google.protobuf.ew r5 = r3.f169888b
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0028
            java.util.Iterator r3 = r3.mo58847e()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x002a
        L_0x0028:
            r3 = r4
            r5 = r3
        L_0x002a:
            int[] r6 = r0.f170064d
            int r6 = r6.length
            r7 = 0
            r8 = 0
        L_0x002f:
            if (r8 >= r6) goto L_0x05dc
            int r9 = r0.m95616B(r8)
            int[] r10 = r0.f170064d
            r10 = r10[r8]
        L_0x0039:
            if (r5 == 0) goto L_0x0057
            com.google.protobuf.bb r11 = r0.f170077q
            int r11 = r11.mo58833a(r5)
            if (r11 > r10) goto L_0x0057
            com.google.protobuf.bb r11 = r0.f170077q
            r11.mo58842j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0055
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0039
        L_0x0055:
            r5 = r4
            goto L_0x0039
        L_0x0057:
            int r11 = m95615A(r9)
            r12 = 63
            r13 = 1
            r14 = 1048575(0xfffff, float:1.469367E-39)
            switch(r11) {
                case 0: goto L_0x05c1;
                case 1: goto L_0x05a9;
                case 2: goto L_0x0595;
                case 3: goto L_0x0581;
                case 4: goto L_0x056d;
                case 5: goto L_0x0559;
                case 6: goto L_0x0544;
                case 7: goto L_0x052f;
                case 8: goto L_0x051c;
                case 9: goto L_0x0505;
                case 10: goto L_0x04ee;
                case 11: goto L_0x04d9;
                case 12: goto L_0x04c4;
                case 13: goto L_0x04af;
                case 14: goto L_0x049a;
                case 15: goto L_0x0480;
                case 16: goto L_0x0466;
                case 17: goto L_0x044f;
                case 18: goto L_0x043c;
                case 19: goto L_0x0429;
                case 20: goto L_0x0416;
                case 21: goto L_0x0403;
                case 22: goto L_0x03f0;
                case 23: goto L_0x03dd;
                case 24: goto L_0x03ca;
                case 25: goto L_0x03b7;
                case 26: goto L_0x03a4;
                case 27: goto L_0x038d;
                case 28: goto L_0x037a;
                case 29: goto L_0x0367;
                case 30: goto L_0x0354;
                case 31: goto L_0x0341;
                case 32: goto L_0x032e;
                case 33: goto L_0x031b;
                case 34: goto L_0x0308;
                case 35: goto L_0x02f5;
                case 36: goto L_0x02e2;
                case 37: goto L_0x02cf;
                case 38: goto L_0x02bc;
                case 39: goto L_0x02a9;
                case 40: goto L_0x0296;
                case 41: goto L_0x0283;
                case 42: goto L_0x0270;
                case 43: goto L_0x025d;
                case 44: goto L_0x024a;
                case 45: goto L_0x0237;
                case 46: goto L_0x0224;
                case 47: goto L_0x0211;
                case 48: goto L_0x01fe;
                case 49: goto L_0x01e7;
                case 50: goto L_0x01da;
                case 51: goto L_0x01c3;
                case 52: goto L_0x01ac;
                case 53: goto L_0x0199;
                case 54: goto L_0x0186;
                case 55: goto L_0x0173;
                case 56: goto L_0x0160;
                case 57: goto L_0x014d;
                case 58: goto L_0x013a;
                case 59: goto L_0x0127;
                case 60: goto L_0x0110;
                case 61: goto L_0x00f9;
                case 62: goto L_0x00e6;
                case 63: goto L_0x00d3;
                case 64: goto L_0x00c0;
                case 65: goto L_0x00ad;
                case 66: goto L_0x0095;
                case 67: goto L_0x007d;
                case 68: goto L_0x0066;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x05d8
        L_0x0066:
            boolean r11 = r0.m95633S(r1, r10, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            com.google.protobuf.en r11 = r0.m95619E(r8)
            r2.mo58790a(r10, r9, r11)
            goto L_0x05d8
        L_0x007d:
            boolean r11 = r0.m95633S(r1, r10, r8)
            if (r11 == 0) goto L_0x05d8
            r9 = r9 & r14
            long r13 = (long) r9
            long r13 = m95617C(r1, r13)
            com.google.protobuf.an r9 = r2.f169854a
            long r15 = r13 + r13
            long r11 = r13 >> r12
            long r11 = r11 ^ r15
            r9.mo58781x(r10, r11)
            goto L_0x05d8
        L_0x0095:
            boolean r11 = r0.m95633S(r1, r10, r8)
            if (r11 == 0) goto L_0x05d8
            r9 = r9 & r14
            long r11 = (long) r9
            int r9 = m95647s(r1, r11)
            com.google.protobuf.an r11 = r2.f169854a
            int r12 = r9 + r9
            int r9 = r9 >> 31
            r9 = r9 ^ r12
            r11.mo58779v(r10, r9)
            goto L_0x05d8
        L_0x00ad:
            boolean r11 = r0.m95633S(r1, r10, r8)
            if (r11 == 0) goto L_0x05d8
            r9 = r9 & r14
            long r11 = (long) r9
            long r11 = m95617C(r1, r11)
            com.google.protobuf.an r9 = r2.f169854a
            r9.mo58768k(r10, r11)
            goto L_0x05d8
        L_0x00c0:
            boolean r11 = r0.m95633S(r1, r10, r8)
            if (r11 == 0) goto L_0x05d8
            r9 = r9 & r14
            long r11 = (long) r9
            int r9 = m95647s(r1, r11)
            com.google.protobuf.an r11 = r2.f169854a
            r11.mo58766i(r10, r9)
            goto L_0x05d8
        L_0x00d3:
            boolean r11 = r0.m95633S(r1, r10, r8)
            if (r11 == 0) goto L_0x05d8
            r9 = r9 & r14
            long r11 = (long) r9
            int r9 = m95647s(r1, r11)
            com.google.protobuf.an r11 = r2.f169854a
            r11.mo58770m(r10, r9)
            goto L_0x05d8
        L_0x00e6:
            boolean r11 = r0.m95633S(r1, r10, r8)
            if (r11 == 0) goto L_0x05d8
            r9 = r9 & r14
            long r11 = (long) r9
            int r9 = m95647s(r1, r11)
            com.google.protobuf.an r11 = r2.f169854a
            r11.mo58779v(r10, r9)
            goto L_0x05d8
        L_0x00f9:
            boolean r11 = r0.m95633S(r1, r10, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            com.google.protobuf.z r9 = (com.google.protobuf.C63088z) r9
            com.google.protobuf.an r11 = r2.f169854a
            r11.mo58763aa(r10, r9)
            goto L_0x05d8
        L_0x0110:
            boolean r11 = r0.m95633S(r1, r10, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            com.google.protobuf.en r11 = r0.m95619E(r8)
            r2.mo58791b(r10, r9, r11)
            goto L_0x05d8
        L_0x0127:
            boolean r11 = r0.m95633S(r1, r10, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            m95639Y(r10, r9, r2)
            goto L_0x05d8
        L_0x013a:
            boolean r11 = r0.m95633S(r1, r10, r8)
            if (r11 == 0) goto L_0x05d8
            r9 = r9 & r14
            long r11 = (long) r9
            boolean r9 = m95634T(r1, r11)
            com.google.protobuf.an r11 = r2.f169854a
            r11.mo58761Z(r10, r9)
            goto L_0x05d8
        L_0x014d:
            boolean r11 = r0.m95633S(r1, r10, r8)
            if (r11 == 0) goto L_0x05d8
            r9 = r9 & r14
            long r11 = (long) r9
            int r9 = m95647s(r1, r11)
            com.google.protobuf.an r11 = r2.f169854a
            r11.mo58766i(r10, r9)
            goto L_0x05d8
        L_0x0160:
            boolean r11 = r0.m95633S(r1, r10, r8)
            if (r11 == 0) goto L_0x05d8
            r9 = r9 & r14
            long r11 = (long) r9
            long r11 = m95617C(r1, r11)
            com.google.protobuf.an r9 = r2.f169854a
            r9.mo58768k(r10, r11)
            goto L_0x05d8
        L_0x0173:
            boolean r11 = r0.m95633S(r1, r10, r8)
            if (r11 == 0) goto L_0x05d8
            r9 = r9 & r14
            long r11 = (long) r9
            int r9 = m95647s(r1, r11)
            com.google.protobuf.an r11 = r2.f169854a
            r11.mo58770m(r10, r9)
            goto L_0x05d8
        L_0x0186:
            boolean r11 = r0.m95633S(r1, r10, r8)
            if (r11 == 0) goto L_0x05d8
            r9 = r9 & r14
            long r11 = (long) r9
            long r11 = m95617C(r1, r11)
            com.google.protobuf.an r9 = r2.f169854a
            r9.mo58781x(r10, r11)
            goto L_0x05d8
        L_0x0199:
            boolean r11 = r0.m95633S(r1, r10, r8)
            if (r11 == 0) goto L_0x05d8
            r9 = r9 & r14
            long r11 = (long) r9
            long r11 = m95617C(r1, r11)
            com.google.protobuf.an r9 = r2.f169854a
            r9.mo58781x(r10, r11)
            goto L_0x05d8
        L_0x01ac:
            boolean r11 = r0.m95633S(r1, r10, r8)
            if (r11 == 0) goto L_0x05d8
            r9 = r9 & r14
            long r11 = (long) r9
            float r9 = m95644p(r1, r11)
            com.google.protobuf.an r11 = r2.f169854a
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            r11.mo58766i(r10, r9)
            goto L_0x05d8
        L_0x01c3:
            boolean r11 = r0.m95633S(r1, r10, r8)
            if (r11 == 0) goto L_0x05d8
            r9 = r9 & r14
            long r11 = (long) r9
            double r11 = m95643o(r1, r11)
            com.google.protobuf.an r9 = r2.f169854a
            long r11 = java.lang.Double.doubleToRawLongBits(r11)
            r9.mo58768k(r10, r11)
            goto L_0x05d8
        L_0x01da:
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            r0.m95638X(r2, r10, r9, r8)
            goto L_0x05d8
        L_0x01e7:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.en r11 = r0.m95619E(r8)
            com.google.protobuf.C63023eo.m95810N(r10, r9, r2, r11)
            goto L_0x05d8
        L_0x01fe:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r14 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95817U(r10, r9, r2, r13)
            goto L_0x05d8
        L_0x0211:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r14 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95816T(r10, r9, r2, r13)
            goto L_0x05d8
        L_0x0224:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r14 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95815S(r10, r9, r2, r13)
            goto L_0x05d8
        L_0x0237:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r14 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95814R(r10, r9, r2, r13)
            goto L_0x05d8
        L_0x024a:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r14 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95806J(r10, r9, r2, r13)
            goto L_0x05d8
        L_0x025d:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r14 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95819W(r10, r9, r2, r13)
            goto L_0x05d8
        L_0x0270:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r14 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95803G(r10, r9, r2, r13)
            goto L_0x05d8
        L_0x0283:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r14 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95807K(r10, r9, r2, r13)
            goto L_0x05d8
        L_0x0296:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r14 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95808L(r10, r9, r2, r13)
            goto L_0x05d8
        L_0x02a9:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r14 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95811O(r10, r9, r2, r13)
            goto L_0x05d8
        L_0x02bc:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r14 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95820X(r10, r9, r2, r13)
            goto L_0x05d8
        L_0x02cf:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r14 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95812P(r10, r9, r2, r13)
            goto L_0x05d8
        L_0x02e2:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r14 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95809M(r10, r9, r2, r13)
            goto L_0x05d8
        L_0x02f5:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r14 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95805I(r10, r9, r2, r13)
            goto L_0x05d8
        L_0x0308:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95817U(r10, r9, r2, r7)
            goto L_0x05d8
        L_0x031b:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95816T(r10, r9, r2, r7)
            goto L_0x05d8
        L_0x032e:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95815S(r10, r9, r2, r7)
            goto L_0x05d8
        L_0x0341:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95814R(r10, r9, r2, r7)
            goto L_0x05d8
        L_0x0354:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95806J(r10, r9, r2, r7)
            goto L_0x05d8
        L_0x0367:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95819W(r10, r9, r2, r7)
            goto L_0x05d8
        L_0x037a:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95804H(r10, r9, r2)
            goto L_0x05d8
        L_0x038d:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.en r11 = r0.m95619E(r8)
            com.google.protobuf.C63023eo.m95813Q(r10, r9, r2, r11)
            goto L_0x05d8
        L_0x03a4:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95818V(r10, r9, r2)
            goto L_0x05d8
        L_0x03b7:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95803G(r10, r9, r2, r7)
            goto L_0x05d8
        L_0x03ca:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95807K(r10, r9, r2, r7)
            goto L_0x05d8
        L_0x03dd:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95808L(r10, r9, r2, r7)
            goto L_0x05d8
        L_0x03f0:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95811O(r10, r9, r2, r7)
            goto L_0x05d8
        L_0x0403:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95820X(r10, r9, r2, r7)
            goto L_0x05d8
        L_0x0416:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95812P(r10, r9, r2, r7)
            goto L_0x05d8
        L_0x0429:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95809M(r10, r9, r2, r7)
            goto L_0x05d8
        L_0x043c:
            int[] r10 = r0.f170064d
            r10 = r10[r8]
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C63023eo.m95805I(r10, r9, r2, r7)
            goto L_0x05d8
        L_0x044f:
            boolean r11 = r0.m95630P(r1, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            com.google.protobuf.en r11 = r0.m95619E(r8)
            r2.mo58790a(r10, r9, r11)
            goto L_0x05d8
        L_0x0466:
            boolean r11 = r0.m95630P(r1, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r13 = (long) r9
            long r13 = r11.mo59136n(r1, r13)
            com.google.protobuf.an r9 = r2.f169854a
            long r15 = r13 + r13
            long r11 = r13 >> r12
            long r11 = r11 ^ r15
            r9.mo58781x(r10, r11)
            goto L_0x05d8
        L_0x0480:
            boolean r11 = r0.m95630P(r1, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            int r9 = r11.mo59135m(r1, r12)
            com.google.protobuf.an r11 = r2.f169854a
            int r12 = r9 + r9
            int r9 = r9 >> 31
            r9 = r9 ^ r12
            r11.mo58779v(r10, r9)
            goto L_0x05d8
        L_0x049a:
            boolean r11 = r0.m95630P(r1, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            long r11 = r11.mo59136n(r1, r12)
            com.google.protobuf.an r9 = r2.f169854a
            r9.mo58768k(r10, r11)
            goto L_0x05d8
        L_0x04af:
            boolean r11 = r0.m95630P(r1, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            int r9 = r11.mo59135m(r1, r12)
            com.google.protobuf.an r11 = r2.f169854a
            r11.mo58766i(r10, r9)
            goto L_0x05d8
        L_0x04c4:
            boolean r11 = r0.m95630P(r1, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            int r9 = r11.mo59135m(r1, r12)
            com.google.protobuf.an r11 = r2.f169854a
            r11.mo58770m(r10, r9)
            goto L_0x05d8
        L_0x04d9:
            boolean r11 = r0.m95630P(r1, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            int r9 = r11.mo59135m(r1, r12)
            com.google.protobuf.an r11 = r2.f169854a
            r11.mo58779v(r10, r9)
            goto L_0x05d8
        L_0x04ee:
            boolean r11 = r0.m95630P(r1, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            com.google.protobuf.z r9 = (com.google.protobuf.C63088z) r9
            com.google.protobuf.an r11 = r2.f169854a
            r11.mo58763aa(r10, r9)
            goto L_0x05d8
        L_0x0505:
            boolean r11 = r0.m95630P(r1, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            com.google.protobuf.en r11 = r0.m95619E(r8)
            r2.mo58791b(r10, r9, r11)
            goto L_0x05d8
        L_0x051c:
            boolean r11 = r0.m95630P(r1, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            java.lang.Object r9 = r11.mo59138p(r1, r12)
            m95639Y(r10, r9, r2)
            goto L_0x05d8
        L_0x052f:
            boolean r11 = r0.m95630P(r1, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            boolean r9 = r11.mo59133k(r1, r12)
            com.google.protobuf.an r11 = r2.f169854a
            r11.mo58761Z(r10, r9)
            goto L_0x05d8
        L_0x0544:
            boolean r11 = r0.m95630P(r1, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            int r9 = r11.mo59135m(r1, r12)
            com.google.protobuf.an r11 = r2.f169854a
            r11.mo58766i(r10, r9)
            goto L_0x05d8
        L_0x0559:
            boolean r11 = r0.m95630P(r1, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            long r11 = r11.mo59136n(r1, r12)
            com.google.protobuf.an r9 = r2.f169854a
            r9.mo58768k(r10, r11)
            goto L_0x05d8
        L_0x056d:
            boolean r11 = r0.m95630P(r1, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            int r9 = r11.mo59135m(r1, r12)
            com.google.protobuf.an r11 = r2.f169854a
            r11.mo58770m(r10, r9)
            goto L_0x05d8
        L_0x0581:
            boolean r11 = r0.m95630P(r1, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            long r11 = r11.mo59136n(r1, r12)
            com.google.protobuf.an r9 = r2.f169854a
            r9.mo58781x(r10, r11)
            goto L_0x05d8
        L_0x0595:
            boolean r11 = r0.m95630P(r1, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            long r11 = r11.mo59136n(r1, r12)
            com.google.protobuf.an r9 = r2.f169854a
            r9.mo58781x(r10, r11)
            goto L_0x05d8
        L_0x05a9:
            boolean r11 = r0.m95630P(r1, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            float r9 = r11.mo59125c(r1, r12)
            com.google.protobuf.an r11 = r2.f169854a
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            r11.mo58766i(r10, r9)
            goto L_0x05d8
        L_0x05c1:
            boolean r11 = r0.m95630P(r1, r8)
            if (r11 == 0) goto L_0x05d8
            com.google.protobuf.fr r11 = com.google.protobuf.C63054fs.f170169a
            r9 = r9 & r14
            long r12 = (long) r9
            double r11 = r11.mo59124b(r1, r12)
            com.google.protobuf.an r9 = r2.f169854a
            long r11 = java.lang.Double.doubleToRawLongBits(r11)
            r9.mo58768k(r10, r11)
        L_0x05d8:
            int r8 = r8 + 3
            goto L_0x002f
        L_0x05dc:
            if (r5 == 0) goto L_0x05f2
            com.google.protobuf.bb r6 = r0.f170077q
            r6.mo58842j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x05f0
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x05dc
        L_0x05f0:
            r5 = r4
            goto L_0x05dc
        L_0x05f2:
            com.google.protobuf.fi r3 = r0.f170076p
            java.lang.Object r1 = r3.mo59089d(r1)
            r3.mo59104s(r1, r2)
            return
        L_0x05fc:
            r17.m95637W(r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C63003dv.mo59002m(java.lang.Object, com.google.protobuf.ao):void");
    }

    /* renamed from: g */
    public final void mo58997g(Object obj, Object obj2) {
        obj2.getClass();
        for (int i = 0; i < this.f170064d.length; i += 3) {
            int B = m95616B(i);
            long j = (long) (1048575 & B);
            int i2 = this.f170064d[i];
            switch (m95615A(B)) {
                case 0:
                    if (!m95630P(obj2, i)) {
                        break;
                    } else {
                        C63054fs.f170169a.mo59131i(obj, j, C63054fs.f170169a.mo59124b(obj2, j));
                        m95626L(obj, i);
                        break;
                    }
                case 1:
                    if (!m95630P(obj2, i)) {
                        break;
                    } else {
                        C63054fs.f170169a.mo59132j(obj, j, C63054fs.f170169a.mo59125c(obj2, j));
                        m95626L(obj, i);
                        break;
                    }
                case 2:
                    if (!m95630P(obj2, i)) {
                        break;
                    } else {
                        C63054fs.f170169a.mo59140r(obj, j, C63054fs.f170169a.mo59136n(obj2, j));
                        m95626L(obj, i);
                        break;
                    }
                case 3:
                    if (!m95630P(obj2, i)) {
                        break;
                    } else {
                        C63054fs.f170169a.mo59140r(obj, j, C63054fs.f170169a.mo59136n(obj2, j));
                        m95626L(obj, i);
                        break;
                    }
                case 4:
                    if (!m95630P(obj2, i)) {
                        break;
                    } else {
                        C63054fs.f170169a.mo59139q(obj, j, C63054fs.f170169a.mo59135m(obj2, j));
                        m95626L(obj, i);
                        break;
                    }
                case 5:
                    if (!m95630P(obj2, i)) {
                        break;
                    } else {
                        C63054fs.f170169a.mo59140r(obj, j, C63054fs.f170169a.mo59136n(obj2, j));
                        m95626L(obj, i);
                        break;
                    }
                case 6:
                    if (!m95630P(obj2, i)) {
                        break;
                    } else {
                        C63054fs.f170169a.mo59139q(obj, j, C63054fs.f170169a.mo59135m(obj2, j));
                        m95626L(obj, i);
                        break;
                    }
                case 7:
                    if (!m95630P(obj2, i)) {
                        break;
                    } else {
                        C63054fs.f170169a.mo59128f(obj, j, C63054fs.f170169a.mo59133k(obj2, j));
                        m95626L(obj, i);
                        break;
                    }
                case 8:
                    if (!m95630P(obj2, i)) {
                        break;
                    } else {
                        C63054fs.f170169a.mo59141s(obj, j, C63054fs.f170169a.mo59138p(obj2, j));
                        m95626L(obj, i);
                        break;
                    }
                case 9:
                    m95623I(obj, obj2, i);
                    break;
                case 10:
                    if (!m95630P(obj2, i)) {
                        break;
                    } else {
                        C63054fs.f170169a.mo59141s(obj, j, C63054fs.f170169a.mo59138p(obj2, j));
                        m95626L(obj, i);
                        break;
                    }
                case 11:
                    if (!m95630P(obj2, i)) {
                        break;
                    } else {
                        C63054fs.f170169a.mo59139q(obj, j, C63054fs.f170169a.mo59135m(obj2, j));
                        m95626L(obj, i);
                        break;
                    }
                case 12:
                    if (!m95630P(obj2, i)) {
                        break;
                    } else {
                        C63054fs.f170169a.mo59139q(obj, j, C63054fs.f170169a.mo59135m(obj2, j));
                        m95626L(obj, i);
                        break;
                    }
                case 13:
                    if (!m95630P(obj2, i)) {
                        break;
                    } else {
                        C63054fs.f170169a.mo59139q(obj, j, C63054fs.f170169a.mo59135m(obj2, j));
                        m95626L(obj, i);
                        break;
                    }
                case 14:
                    if (!m95630P(obj2, i)) {
                        break;
                    } else {
                        C63054fs.f170169a.mo59140r(obj, j, C63054fs.f170169a.mo59136n(obj2, j));
                        m95626L(obj, i);
                        break;
                    }
                case 15:
                    if (!m95630P(obj2, i)) {
                        break;
                    } else {
                        C63054fs.f170169a.mo59139q(obj, j, C63054fs.f170169a.mo59135m(obj2, j));
                        m95626L(obj, i);
                        break;
                    }
                case 16:
                    if (!m95630P(obj2, i)) {
                        break;
                    } else {
                        C63054fs.f170169a.mo59140r(obj, j, C63054fs.f170169a.mo59136n(obj2, j));
                        m95626L(obj, i);
                        break;
                    }
                case 17:
                    m95623I(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f170075o.mo58973c(obj, obj2, j);
                    break;
                case 50:
                    C63023eo.m95821Y(obj, obj2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!m95633S(obj2, i2, i)) {
                        break;
                    } else {
                        C63054fs.f170169a.mo59141s(obj, j, C63054fs.f170169a.mo59138p(obj2, j));
                        m95627M(obj, i2, i);
                        break;
                    }
                case 60:
                    m95624J(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!m95633S(obj2, i2, i)) {
                        break;
                    } else {
                        C63054fs.f170169a.mo59141s(obj, j, C63054fs.f170169a.mo59138p(obj2, j));
                        m95627M(obj, i2, i);
                        break;
                    }
                case 68:
                    m95624J(obj, obj2, i);
                    break;
            }
        }
        C63023eo.m95842t(this.f170076p, obj, obj2);
        if (this.f170068h) {
            C63023eo.m95841s(this.f170077q, obj, obj2);
        }
    }
}
