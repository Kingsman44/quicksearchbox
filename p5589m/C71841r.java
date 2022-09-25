package p5589m;

import java.io.EOFException;
import java.nio.ByteBuffer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: m.r */
/* compiled from: PG */
public final class C71841r implements C71830g {

    /* renamed from: a */
    public final C71847x f191370a;

    /* renamed from: b */
    public final C71828e f191371b = new C71828e();

    /* renamed from: c */
    public boolean f191372c;

    public C71841r(C71847x xVar) {
        C69664n.m101061g(xVar, "source");
        this.f191370a = xVar;
    }

    /* renamed from: a */
    public final long mo62472a(C71828e eVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.f191372c) {
            C71828e eVar2 = this.f191371b;
            if (eVar2.f191356b == 0 && this.f191370a.mo62472a(eVar2, 8192) == -1) {
                return -1;
            }
            return this.f191371b.mo62472a(eVar, Math.min(j, this.f191371b.f191356b));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: c */
    public final byte mo63062c() {
        mo63077n(1);
        return this.f191371b.mo63062c();
    }

    public final void close() {
        if (!this.f191372c) {
            this.f191372c = true;
            this.f191370a.close();
            C71828e eVar = this.f191371b;
            eVar.mo63078o(eVar.f191356b);
        }
    }

    /* renamed from: e */
    public final int mo63065e() {
        mo63077n(4);
        return this.f191371b.mo63065e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0159 A[SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo63068g(p5589m.C71832i r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "targetBytes"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r2)
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r2)
            boolean r3 = r0.f191372c
            if (r3 != 0) goto L_0x018b
            r3 = 0
            r5 = r3
        L_0x0013:
            m.e r7 = r0.f191371b
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r2)
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 < 0) goto L_0x0177
            m.s r8 = r7.f191355a
            if (r8 != 0) goto L_0x0028
        L_0x0020:
            r19 = r2
        L_0x0022:
            r3 = -1
        L_0x0024:
            r7 = -1
            goto L_0x0155
        L_0x0028:
            long r11 = r7.f191356b
            long r13 = r11 - r5
            r15 = 2
            r16 = 0
            r17 = 1
            int r18 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r18 >= 0) goto L_0x00c9
        L_0x0035:
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 <= 0) goto L_0x0046
            m.s r8 = r8.f191379g
            p5462h.p5473f.p5475b.C69664n.m101058d(r8)
            int r13 = r8.f191375c
            int r14 = r8.f191374b
            int r13 = r13 - r14
            long r13 = (long) r13
            long r11 = r11 - r13
            goto L_0x0035
        L_0x0046:
            if (r8 != 0) goto L_0x0049
            goto L_0x0020
        L_0x0049:
            byte[] r13 = r1.f191358b
            int r14 = r13.length
            if (r14 != r15) goto L_0x0086
            byte r14 = r13[r16]
            byte r13 = r13[r17]
            r15 = r5
        L_0x0053:
            long r3 = r7.f191356b
            int r17 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r17 >= 0) goto L_0x0020
            byte[] r3 = r8.f191373a
            int r4 = r8.f191374b
            long r9 = (long) r4
            long r9 = r9 + r15
            long r9 = r9 - r11
            int r4 = (int) r9
            int r9 = r8.f191375c
        L_0x0063:
            if (r4 >= r9) goto L_0x0077
            byte r10 = r3[r4]
            if (r10 == r14) goto L_0x006f
            if (r10 != r13) goto L_0x006c
            goto L_0x006f
        L_0x006c:
            int r4 = r4 + 1
            goto L_0x0063
        L_0x006f:
            int r3 = r8.f191374b
            int r4 = r4 - r3
            long r3 = (long) r4
            long r3 = r3 + r11
            r19 = r2
            goto L_0x0024
        L_0x0077:
            int r3 = r8.f191375c
            int r4 = r8.f191374b
            int r3 = r3 - r4
            long r3 = (long) r3
            long r15 = r11 + r3
            m.s r8 = r8.f191378f
            p5462h.p5473f.p5475b.C69664n.m101058d(r8)
            r11 = r15
            goto L_0x0053
        L_0x0086:
            r3 = r5
        L_0x0087:
            long r9 = r7.f191356b
            int r14 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r14 >= 0) goto L_0x0020
            byte[] r9 = r8.f191373a
            int r10 = r8.f191374b
            long r14 = (long) r10
            long r14 = r14 + r3
            long r14 = r14 - r11
            int r3 = (int) r14
            int r4 = r8.f191375c
        L_0x0097:
            if (r3 >= r4) goto L_0x00b6
            byte r10 = r9[r3]
            int r14 = r13.length
            r15 = 0
        L_0x009d:
            if (r15 >= r14) goto L_0x00b1
            r19 = r2
            byte r2 = r13[r15]
            if (r10 != r2) goto L_0x00ac
            int r2 = r8.f191374b
            int r3 = r3 - r2
            long r2 = (long) r3
            long r2 = r2 + r11
            goto L_0x010e
        L_0x00ac:
            int r15 = r15 + 1
            r2 = r19
            goto L_0x009d
        L_0x00b1:
            r19 = r2
            int r3 = r3 + 1
            goto L_0x0097
        L_0x00b6:
            r19 = r2
            int r2 = r8.f191375c
            int r3 = r8.f191374b
            int r2 = r2 - r3
            long r2 = (long) r2
            long r2 = r2 + r11
            m.s r8 = r8.f191378f
            p5462h.p5473f.p5475b.C69664n.m101058d(r8)
            r11 = r2
            r3 = r11
            r2 = r19
            goto L_0x0087
        L_0x00c9:
            r19 = r2
            r2 = 0
        L_0x00cd:
            int r4 = r8.f191375c
            int r9 = r8.f191374b
            int r4 = r4 - r9
            long r9 = (long) r4
            long r9 = r9 + r2
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x00df
            m.s r8 = r8.f191378f
            p5462h.p5473f.p5475b.C69664n.m101058d(r8)
            r2 = r9
            goto L_0x00cd
        L_0x00df:
            if (r8 != 0) goto L_0x00e3
            goto L_0x0022
        L_0x00e3:
            byte[] r4 = r1.f191358b
            int r9 = r4.length
            if (r9 != r15) goto L_0x011f
            byte r9 = r4[r16]
            byte r4 = r4[r17]
            r10 = r5
        L_0x00ed:
            long r12 = r7.f191356b
            int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x0022
            byte[] r12 = r8.f191373a
            int r13 = r8.f191374b
            long r13 = (long) r13
            long r13 = r13 + r10
            long r13 = r13 - r2
            int r10 = (int) r13
            int r11 = r8.f191375c
        L_0x00fd:
            if (r10 >= r11) goto L_0x0111
            byte r13 = r12[r10]
            if (r13 == r9) goto L_0x0109
            if (r13 != r4) goto L_0x0106
            goto L_0x0109
        L_0x0106:
            int r10 = r10 + 1
            goto L_0x00fd
        L_0x0109:
            int r4 = r8.f191374b
            int r10 = r10 - r4
            long r7 = (long) r10
        L_0x010d:
            long r2 = r2 + r7
        L_0x010e:
            r3 = r2
            goto L_0x0024
        L_0x0111:
            int r10 = r8.f191375c
            int r11 = r8.f191374b
            int r10 = r10 - r11
            long r10 = (long) r10
            long r10 = r10 + r2
            m.s r8 = r8.f191378f
            p5462h.p5473f.p5475b.C69664n.m101058d(r8)
            r2 = r10
            goto L_0x00ed
        L_0x011f:
            r9 = r5
        L_0x0120:
            long r11 = r7.f191356b
            int r13 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x0022
            byte[] r11 = r8.f191373a
            int r12 = r8.f191374b
            long r12 = (long) r12
            long r12 = r12 + r9
            long r12 = r12 - r2
            int r9 = (int) r12
            int r10 = r8.f191375c
        L_0x0130:
            if (r9 >= r10) goto L_0x0147
            byte r12 = r11[r9]
            int r13 = r4.length
            r14 = 0
        L_0x0136:
            if (r14 >= r13) goto L_0x0144
            byte r15 = r4[r14]
            if (r12 != r15) goto L_0x0141
            int r4 = r8.f191374b
            int r9 = r9 - r4
            long r7 = (long) r9
            goto L_0x010d
        L_0x0141:
            int r14 = r14 + 1
            goto L_0x0136
        L_0x0144:
            int r9 = r9 + 1
            goto L_0x0130
        L_0x0147:
            int r9 = r8.f191375c
            int r10 = r8.f191374b
            int r9 = r9 - r10
            long r9 = (long) r9
            long r9 = r9 + r2
            m.s r8 = r8.f191378f
            p5462h.p5473f.p5475b.C69664n.m101058d(r8)
            r2 = r9
            goto L_0x0120
        L_0x0155:
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x015b
            r9 = r3
            goto L_0x016c
        L_0x015b:
            m.e r2 = r0.f191371b
            long r3 = r2.f191356b
            m.x r9 = r0.f191370a
            r10 = 8192(0x2000, double:4.0474E-320)
            long r9 = r9.mo62472a(r2, r10)
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x016d
            r9 = r7
        L_0x016c:
            return r9
        L_0x016d:
            long r5 = java.lang.Math.max(r5, r3)
            r2 = r19
            r3 = 0
            goto L_0x0013
        L_0x0177:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "fromIndex < 0: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
        L_0x018b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "closed"
            r1.<init>(r2)
            goto L_0x0194
        L_0x0193:
            throw r1
        L_0x0194:
            goto L_0x0193
        */
        throw new UnsupportedOperationException("Method not decompiled: p5589m.C71841r.mo63068g(m.i):long");
    }

    public final boolean isOpen() {
        return !this.f191372c;
    }

    /* renamed from: j */
    public final C71832i mo63073j(long j) {
        mo63077n(j);
        return this.f191371b.mo63073j(j);
    }

    /* renamed from: n */
    public final void mo63077n(long j) {
        if (!mo63080q(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: o */
    public final void mo63078o(long j) {
        if (!this.f191372c) {
            while (j > 0) {
                C71828e eVar = this.f191371b;
                if (eVar.f191356b == 0 && this.f191370a.mo62472a(eVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f191371b.f191356b);
                this.f191371b.mo63078o(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: q */
    public final boolean mo63080q(long j) {
        C71828e eVar;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.f191372c) {
            do {
                eVar = this.f191371b;
                if (eVar.f191356b >= j) {
                    return true;
                }
            } while (this.f191370a.mo62472a(eVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final int read(ByteBuffer byteBuffer) {
        C69664n.m101061g(byteBuffer, "sink");
        C71828e eVar = this.f191371b;
        if (eVar.f191356b == 0 && this.f191370a.mo62472a(eVar, 8192) == -1) {
            return -1;
        }
        return this.f191371b.read(byteBuffer);
    }

    public final String toString() {
        C71847x xVar = this.f191370a;
        return "buffer(" + xVar + ")";
    }
}
