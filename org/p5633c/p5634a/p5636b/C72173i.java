package org.p5633c.p5634a.p5636b;

import org.p5633c.p5634a.C72132a;

/* renamed from: org.c.a.b.i */
/* compiled from: PG */
abstract class C72173i extends C72170f {

    /* renamed from: H */
    private static final int[] f192103H = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* renamed from: I */
    private static final int[] f192104I = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    /* renamed from: J */
    private static final long[] f192105J = new long[12];

    /* renamed from: K */
    private static final long[] f192106K = new long[12];
    private static final long serialVersionUID = 538276888268L;

    static {
        long j = 0;
        long j2 = 0;
        int i = 0;
        while (i < 11) {
            j += ((long) f192103H[i]) * 86400000;
            int i2 = i + 1;
            f192105J[i2] = j;
            j2 += ((long) f192104I[i]) * 86400000;
            f192106K[i2] = j2;
            i = i2;
        }
    }

    public C72173i(C72132a aVar, int i) {
        super(aVar, i);
    }

    /* renamed from: Z */
    public final int mo63495Z(int i) {
        return f192104I[i - 1];
    }

    /* renamed from: ab */
    public final int mo63497ab(long j, int i) {
        if (i > 28 || i <= 0) {
            return mo63496aa(j);
        }
        return 28;
    }

    /* renamed from: ad */
    public final int mo63499ad(int i, int i2) {
        if (mo63463ay(i)) {
            return f192104I[i2 - 1];
        }
        return f192103H[i2 - 1];
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0085 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0099 A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a8 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: ah */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo63501ah(long r13, int r15) {
        /*
            r12 = this;
            org.c.a.b.e r0 = super.mo63511ax(r15)
            long r0 = r0.f192080b
            long r13 = r13 - r0
            r0 = 10
            long r13 = r13 >> r0
            int r14 = (int) r13
            boolean r13 = r12.mo63463ay(r15)
            r15 = 3
            r1 = 2
            r2 = 6
            r3 = 5
            r4 = 9
            r5 = 8
            r6 = 12
            r7 = 11
            r8 = 1
            r9 = 4
            r10 = 7
            r11 = 2615625(0x27e949, float:3.665271E-39)
            if (r13 == 0) goto L_0x0063
            r13 = 15356250(0xea515a, float:2.151869E-38)
            if (r14 >= r13) goto L_0x0044
            r13 = 7678125(0x7528ad, float:1.0759345E-38)
            if (r14 >= r13) goto L_0x0037
            if (r14 >= r11) goto L_0x0030
            goto L_0x006f
        L_0x0030:
            r13 = 5062500(0x4d3f64, float:7.094073E-39)
            if (r14 < r13) goto L_0x0036
            goto L_0x0076
        L_0x0036:
            return r1
        L_0x0037:
            r13 = 10209375(0x9bc85f, float:1.4306382E-38)
            if (r14 >= r13) goto L_0x003d
            goto L_0x007e
        L_0x003d:
            r13 = 12825000(0xc3b1a8, float:1.7971653E-38)
            if (r14 < r13) goto L_0x0043
            goto L_0x0085
        L_0x0043:
            return r3
        L_0x0044:
            r13 = 23118750(0x160c39e, float:4.128265E-38)
            if (r14 >= r13) goto L_0x0056
            r13 = 17971875(0x1123aa3, float:2.6858035E-38)
            if (r14 >= r13) goto L_0x004f
            goto L_0x0092
        L_0x004f:
            r13 = 20587500(0x13a23ec, float:3.4188577E-38)
            if (r14 < r13) goto L_0x0055
            goto L_0x0099
        L_0x0055:
            return r5
        L_0x0056:
            r13 = 25734375(0x188ace7, float:5.020661E-38)
            if (r14 >= r13) goto L_0x005c
            goto L_0x00aa
        L_0x005c:
            r13 = 28265625(0x1af4c99, float:6.439476E-38)
            if (r14 < r13) goto L_0x0062
            goto L_0x00a8
        L_0x0062:
            return r7
        L_0x0063:
            r13 = 15271875(0xe907c3, float:2.1400455E-38)
            if (r14 >= r13) goto L_0x0088
            r13 = 7593750(0x73df16, float:1.064111E-38)
            if (r14 >= r13) goto L_0x0079
            if (r14 >= r11) goto L_0x0071
        L_0x006f:
            r0 = 1
            goto L_0x00aa
        L_0x0071:
            r13 = 4978125(0x4bf5cd, float:6.975839E-39)
            if (r14 < r13) goto L_0x0078
        L_0x0076:
            r0 = 3
            goto L_0x00aa
        L_0x0078:
            return r1
        L_0x0079:
            r13 = 10125000(0x9a7ec8, float:1.4188147E-38)
            if (r14 >= r13) goto L_0x0080
        L_0x007e:
            r0 = 4
            goto L_0x00aa
        L_0x0080:
            r13 = 12740625(0xc26811, float:1.7853418E-38)
            if (r14 < r13) goto L_0x0087
        L_0x0085:
            r0 = 6
            goto L_0x00aa
        L_0x0087:
            return r3
        L_0x0088:
            r13 = 23034375(0x15f7a07, float:4.1046182E-38)
            if (r14 >= r13) goto L_0x009d
            r13 = 17887500(0x110f10c, float:2.6621566E-38)
            if (r14 >= r13) goto L_0x0094
        L_0x0092:
            r0 = 7
            goto L_0x00aa
        L_0x0094:
            r13 = 20503125(0x138da55, float:3.3952108E-38)
            if (r14 < r13) goto L_0x009c
        L_0x0099:
            r0 = 9
            goto L_0x00aa
        L_0x009c:
            return r5
        L_0x009d:
            r13 = 25650000(0x1876350, float:4.9733674E-38)
            if (r14 >= r13) goto L_0x00a3
            goto L_0x00aa
        L_0x00a3:
            r13 = 28181250(0x1ae0302, float:6.392182E-38)
            if (r14 < r13) goto L_0x00ab
        L_0x00a8:
            r0 = 12
        L_0x00aa:
            return r0
        L_0x00ab:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5633c.p5634a.p5636b.C72173i.mo63501ah(long, int):int");
    }

    /* renamed from: at */
    public final long mo63507at(int i, int i2) {
        if (mo63463ay(i)) {
            return f192106K[i2 - 1];
        }
        return f192105J[i2 - 1];
    }

    /* renamed from: au */
    public final long mo63508au(long j, long j2) {
        int al = mo63505al(j);
        int al2 = mo63505al(j2);
        long j3 = j - super.mo63511ax(al).f192080b;
        long j4 = j2 - super.mo63511ax(al2).f192080b;
        if (j4 >= 5097600000L) {
            if (mo63463ay(al2)) {
                if (!mo63463ay(al)) {
                    j4 -= 86400000;
                }
            } else if (j3 >= 5097600000L && mo63463ay(al)) {
                j3 -= 86400000;
            }
        }
        int i = al - al2;
        if (j3 < j4) {
            i--;
        }
        return (long) i;
    }

    /* renamed from: aw */
    public final long mo63510aw(long j, int i) {
        int al = mo63505al(j);
        int Y = mo63494Y(j, al);
        int af = mo63500af(j);
        if (Y > 59) {
            if (mo63463ay(al)) {
                if (!mo63463ay(i)) {
                    Y--;
                }
            } else if (mo63463ay(i)) {
                Y++;
            }
        }
        return mo63509av(i, 1, Y) + ((long) af);
    }
}
