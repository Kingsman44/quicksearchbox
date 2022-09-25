package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.Arrays;
import p3186j$.util.Objects;

/* renamed from: com.google.common.b.pv */
/* compiled from: PG */
public final class C58729pv extends C58495hd {

    /* renamed from: a */
    public static final C58495hd f156485a = new C58729pv((Object) null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    final transient Object[] f156486b;

    /* renamed from: c */
    public final transient int f156487c;

    /* renamed from: d */
    private final transient Object f156488d;

    private C58729pv(Object obj, Object[] objArr, int i) {
        this.f156488d = obj;
        this.f156486b = objArr;
        this.f156487c = i;
    }

    /* renamed from: b */
    static C58729pv m90559b(int i, Object[] objArr, C58490gz gzVar) {
        if (i == 0) {
            return (C58729pv) f156485a;
        }
        if (i == 1) {
            C58371co.m89406a(Objects.requireNonNull(objArr[0]), Objects.requireNonNull(objArr[1]));
            return new C58729pv((Object) null, objArr, 1);
        }
        C58838bb.m90864E(i, objArr.length >> 1);
        Object y = m90562y(objArr, i, C58528ij.m90002A(i), 0);
        if (y instanceof Object[]) {
            Object[] objArr2 = (Object[]) y;
            C58489gy gyVar = (C58489gy) objArr2[2];
            if (gzVar != null) {
                gzVar.f156123c = gyVar;
                Object obj = objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, intValue + intValue);
                y = obj;
                i = intValue;
            } else {
                throw gyVar.mo55426a();
            }
        }
        return new C58729pv(y, objArr, i);
    }

    /* renamed from: e */
    static Object m90560e(Object[] objArr, int i, int i2, int i3) {
        Object y = m90562y(objArr, i, i2, i3);
        if (!(y instanceof Object[])) {
            return y;
        }
        throw ((C58489gy) ((Object[]) y)[2]).mo55426a();
    }

    /* renamed from: x */
    static Object m90561x(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            if (Objects.requireNonNull(objArr[i2]).equals(obj2)) {
                return Objects.requireNonNull(objArr[i2 ^ 1]);
            }
            return null;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int a = C58462fy.m89757a(obj2.hashCode());
                while (true) {
                    int i3 = a & length;
                    byte b = bArr[i3] & 255;
                    if (b == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[b])) {
                        return objArr[b ^ 1];
                    }
                    a = i3 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int a2 = C58462fy.m89757a(obj2.hashCode());
                while (true) {
                    int i4 = a2 & length2;
                    char c = (char) sArr[i4];
                    if (c == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[c])) {
                        return objArr[c ^ 1];
                    }
                    a2 = i4 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int a3 = C58462fy.m89757a(obj2.hashCode());
                while (true) {
                    int i5 = a3 & length3;
                    int i6 = iArr[i5];
                    if (i6 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i6])) {
                        return objArr[i6 ^ 1];
                    }
                    a3 = i5 + 1;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m90562y(java.lang.Object[] r16, int r17, int r18, int r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = 0
            r3 = 1
            if (r0 != r3) goto L_0x001a
            r0 = r16[r19]
            java.lang.Object r0 = p3186j$.util.Objects.requireNonNull(r0)
            r1 = r19 ^ 1
            r1 = r16[r1]
            java.lang.Object r1 = p3186j$.util.Objects.requireNonNull(r1)
            com.google.common.p4522b.C58371co.m89406a(r0, r1)
            return r2
        L_0x001a:
            int r4 = r1 + -1
            r5 = 128(0x80, float:1.794E-43)
            r6 = 2
            r7 = 3
            r8 = -1
            r9 = 0
            if (r1 > r5) goto L_0x0091
            byte[] r1 = new byte[r1]
            java.util.Arrays.fill(r1, r8)
            r5 = 0
            r8 = 0
        L_0x002b:
            if (r5 >= r0) goto L_0x0081
            int r10 = r5 + r5
            int r10 = r10 + r19
            int r11 = r8 + r8
            int r11 = r11 + r19
            r12 = r16[r10]
            java.lang.Object r12 = p3186j$.util.Objects.requireNonNull(r12)
            r10 = r10 ^ r3
            r10 = r16[r10]
            java.lang.Object r10 = p3186j$.util.Objects.requireNonNull(r10)
            com.google.common.p4522b.C58371co.m89406a(r12, r10)
            int r13 = r12.hashCode()
            int r13 = com.google.common.p4522b.C58462fy.m89757a(r13)
        L_0x004d:
            r13 = r13 & r4
            byte r14 = r1[r13]
            r15 = 255(0xff, float:3.57E-43)
            r14 = r14 & r15
            if (r14 != r15) goto L_0x0063
            byte r14 = (byte) r11
            r1[r13] = r14
            if (r8 >= r5) goto L_0x0060
            r16[r11] = r12
            r11 = r11 ^ 1
            r16[r11] = r10
        L_0x0060:
            int r8 = r8 + 1
            goto L_0x007b
        L_0x0063:
            r15 = r16[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x007e
            r2 = r14 ^ 1
            com.google.common.b.gy r11 = new com.google.common.b.gy
            r13 = r16[r2]
            java.lang.Object r13 = p3186j$.util.Objects.requireNonNull(r13)
            r11.<init>(r12, r10, r13)
            r16[r2] = r10
            r2 = r11
        L_0x007b:
            int r5 = r5 + 1
            goto L_0x002b
        L_0x007e:
            int r13 = r13 + 1
            goto L_0x004d
        L_0x0081:
            if (r8 != r0) goto L_0x0084
            return r1
        L_0x0084:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0[r3] = r1
            r0[r6] = r2
            return r0
        L_0x0091:
            r5 = 32768(0x8000, float:4.5918E-41)
            if (r1 > r5) goto L_0x0104
            short[] r1 = new short[r1]
            java.util.Arrays.fill(r1, r8)
            r5 = 0
            r8 = 0
        L_0x009d:
            if (r5 >= r0) goto L_0x00f4
            int r10 = r5 + r5
            int r10 = r10 + r19
            int r11 = r8 + r8
            int r11 = r11 + r19
            r12 = r16[r10]
            java.lang.Object r12 = p3186j$.util.Objects.requireNonNull(r12)
            r10 = r10 ^ r3
            r10 = r16[r10]
            java.lang.Object r10 = p3186j$.util.Objects.requireNonNull(r10)
            com.google.common.p4522b.C58371co.m89406a(r12, r10)
            int r13 = r12.hashCode()
            int r13 = com.google.common.p4522b.C58462fy.m89757a(r13)
        L_0x00bf:
            r13 = r13 & r4
            short r14 = r1[r13]
            char r14 = (char) r14
            r15 = 65535(0xffff, float:9.1834E-41)
            if (r14 != r15) goto L_0x00d6
            short r14 = (short) r11
            r1[r13] = r14
            if (r8 >= r5) goto L_0x00d3
            r16[r11] = r12
            r11 = r11 ^ 1
            r16[r11] = r10
        L_0x00d3:
            int r8 = r8 + 1
            goto L_0x00ee
        L_0x00d6:
            r15 = r16[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x00f1
            r2 = r14 ^ 1
            com.google.common.b.gy r11 = new com.google.common.b.gy
            r13 = r16[r2]
            java.lang.Object r13 = p3186j$.util.Objects.requireNonNull(r13)
            r11.<init>(r12, r10, r13)
            r16[r2] = r10
            r2 = r11
        L_0x00ee:
            int r5 = r5 + 1
            goto L_0x009d
        L_0x00f1:
            int r13 = r13 + 1
            goto L_0x00bf
        L_0x00f4:
            if (r8 != r0) goto L_0x00f7
            return r1
        L_0x00f7:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r0[r3] = r1
            r0[r6] = r2
            return r0
        L_0x0104:
            int[] r1 = new int[r1]
            java.util.Arrays.fill(r1, r8)
            r5 = 0
            r10 = 0
        L_0x010b:
            if (r5 >= r0) goto L_0x015f
            int r11 = r5 + r5
            int r11 = r11 + r19
            int r12 = r10 + r10
            int r12 = r12 + r19
            r13 = r16[r11]
            java.lang.Object r13 = p3186j$.util.Objects.requireNonNull(r13)
            r11 = r11 ^ r3
            r11 = r16[r11]
            java.lang.Object r11 = p3186j$.util.Objects.requireNonNull(r11)
            com.google.common.p4522b.C58371co.m89406a(r13, r11)
            int r14 = r13.hashCode()
            int r14 = com.google.common.p4522b.C58462fy.m89757a(r14)
        L_0x012d:
            r14 = r14 & r4
            r15 = r1[r14]
            if (r15 != r8) goto L_0x013f
            r1[r14] = r12
            if (r10 >= r5) goto L_0x013c
            r16[r12] = r13
            r12 = r12 ^ 1
            r16[r12] = r11
        L_0x013c:
            int r10 = r10 + 1
            goto L_0x0157
        L_0x013f:
            r8 = r16[r15]
            boolean r8 = r13.equals(r8)
            if (r8 == 0) goto L_0x015b
            r2 = r15 ^ 1
            com.google.common.b.gy r8 = new com.google.common.b.gy
            r12 = r16[r2]
            java.lang.Object r12 = p3186j$.util.Objects.requireNonNull(r12)
            r8.<init>(r13, r11, r12)
            r16[r2] = r11
            r2 = r8
        L_0x0157:
            int r5 = r5 + 1
            r8 = -1
            goto L_0x010b
        L_0x015b:
            int r14 = r14 + 1
            r8 = -1
            goto L_0x012d
        L_0x015f:
            if (r10 != r0) goto L_0x0162
            return r1
        L_0x0162:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r3] = r1
            r0[r6] = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4522b.C58729pv.m90562y(java.lang.Object[], int, int, int):java.lang.Object");
    }

    /* renamed from: c */
    public final boolean mo55193c() {
        return false;
    }

    /* renamed from: d */
    public final C58528ij mo55194d() {
        return new C58727pt(this, new C58728pu(this.f156486b, 0, this.f156487c));
    }

    /* renamed from: f */
    public final C58471gg mo55368f() {
        return new C58728pu(this.f156486b, 1, this.f156487c);
    }

    public final Object get(Object obj) {
        Object x = m90561x(this.f156488d, this.f156486b, this.f156487c, 0, obj);
        if (x == null) {
            return null;
        }
        return x;
    }

    /* renamed from: lE */
    public final C58528ij mo55439lE() {
        return new C58726ps(this, this.f156486b, 0, this.f156487c);
    }

    public final int size() {
        return this.f156487c;
    }
}
