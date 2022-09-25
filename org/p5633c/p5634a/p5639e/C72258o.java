package org.p5633c.p5634a.p5639e;

import java.util.Locale;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72288l;

/* renamed from: org.c.a.e.o */
/* compiled from: PG */
final class C72258o implements C72265v, C72261r {

    /* renamed from: a */
    private final C72283g f192264a;

    /* renamed from: b */
    private final int f192265b;

    /* renamed from: c */
    private final boolean f192266c;

    public C72258o(C72283g gVar, int i, boolean z) {
        this.f192264a = gVar;
        this.f192265b = i;
        this.f192266c = z;
    }

    /* renamed from: a */
    public final int mo63604a() {
        return this.f192266c ? 4 : 2;
    }

    /* renamed from: b */
    public final int mo63605b() {
        return 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo63606c(org.p5633c.p5634a.p5639e.C72264u r12, java.lang.String r13, int r14) {
        /*
            r11 = this;
            int r0 = r13.length()
            int r0 = r0 - r14
            boolean r1 = r11.f192266c
            r2 = 57
            r3 = 48
            r4 = 2
            r5 = 0
            if (r1 != 0) goto L_0x0019
            int r0 = java.lang.Math.min(r4, r0)
            if (r0 < r4) goto L_0x0016
            goto L_0x0053
        L_0x0016:
            r12 = r14 ^ -1
            return r12
        L_0x0019:
            r1 = 0
            r6 = 0
            r7 = 0
        L_0x001c:
            if (r1 >= r0) goto L_0x0049
            int r8 = r14 + r1
            char r8 = r13.charAt(r8)
            if (r1 != 0) goto L_0x0041
            r9 = 45
            r10 = 1
            if (r8 == r9) goto L_0x0032
            r9 = 43
            if (r8 != r9) goto L_0x0030
            goto L_0x0036
        L_0x0030:
            r1 = 0
            goto L_0x0041
        L_0x0032:
            if (r8 != r9) goto L_0x0036
            r7 = 1
            goto L_0x0037
        L_0x0036:
            r7 = 0
        L_0x0037:
            if (r7 == 0) goto L_0x003b
            r1 = 1
            goto L_0x003f
        L_0x003b:
            int r14 = r14 + 1
            int r0 = r0 + -1
        L_0x003f:
            r6 = 1
            goto L_0x001c
        L_0x0041:
            if (r8 < r3) goto L_0x0049
            if (r8 <= r2) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            int r1 = r1 + 1
            goto L_0x001c
        L_0x0049:
            if (r1 != 0) goto L_0x004e
            r12 = r14 ^ -1
            return r12
        L_0x004e:
            if (r6 != 0) goto L_0x0094
            if (r1 == r4) goto L_0x0053
            goto L_0x0094
        L_0x0053:
            char r0 = r13.charAt(r14)
            if (r0 < r3) goto L_0x0091
            if (r0 <= r2) goto L_0x005c
            goto L_0x0091
        L_0x005c:
            int r0 = r0 + -48
            int r1 = r14 + 1
            char r13 = r13.charAt(r1)
            if (r13 < r3) goto L_0x008e
            if (r13 <= r2) goto L_0x0069
            goto L_0x008e
        L_0x0069:
            int r1 = r0 << 3
            int r0 = r0 + r0
            int r1 = r1 + r0
            int r1 = r1 + r13
            int r1 = r1 + -48
            int r13 = r11.f192265b
            int r13 = r13 + -50
            r0 = 100
            if (r13 < 0) goto L_0x007b
            int r2 = r13 % 100
            goto L_0x0080
        L_0x007b:
            int r2 = r13 + 1
            int r2 = r2 % r0
            int r2 = r2 + 99
        L_0x0080:
            if (r1 >= r2) goto L_0x0084
            r5 = 100
        L_0x0084:
            org.c.a.g r0 = r11.f192264a
            int r13 = r13 + r5
            int r13 = r13 - r2
            int r1 = r1 + r13
            r12.mo63640d(r0, r1)
            int r14 = r14 + r4
            return r14
        L_0x008e:
            r12 = r14 ^ -1
            return r12
        L_0x0091:
            r12 = r14 ^ -1
            return r12
        L_0x0094:
            r0 = 9
            if (r1 < r0) goto L_0x00a2
            int r1 = r1 + r14
            java.lang.String r13 = r13.substring(r14, r1)
            int r13 = java.lang.Integer.parseInt(r13)
            goto L_0x00c7
        L_0x00a2:
            if (r7 == 0) goto L_0x00a7
            int r0 = r14 + 1
            goto L_0x00a8
        L_0x00a7:
            r0 = r14
        L_0x00a8:
            int r2 = r0 + 1
            char r0 = r13.charAt(r0)     // Catch:{ StringIndexOutOfBoundsException -> 0x00cd }
            int r0 = r0 + -48
            int r1 = r1 + r14
        L_0x00b1:
            if (r2 >= r1) goto L_0x00c2
            int r14 = r2 + 1
            int r3 = r0 << 3
            int r0 = r0 + r0
            int r3 = r3 + r0
            char r0 = r13.charAt(r2)
            int r3 = r3 + r0
            int r0 = r3 + -48
            r2 = r14
            goto L_0x00b1
        L_0x00c2:
            if (r7 == 0) goto L_0x00c6
            int r13 = -r0
            goto L_0x00c7
        L_0x00c6:
            r13 = r0
        L_0x00c7:
            org.c.a.g r14 = r11.f192264a
            r12.mo63640d(r14, r13)
            return r1
        L_0x00cd:
            r12 = r14 ^ -1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5633c.p5634a.p5639e.C72258o.mo63606c(org.c.a.e.u, java.lang.String, int):int");
    }

    /* renamed from: d */
    public final void mo63607d(StringBuffer stringBuffer, C72151ai aiVar, Locale locale) {
        int i = -1;
        if (aiVar.mo63397i(this.f192264a)) {
            try {
                int b = aiVar.mo63392b(this.f192264a);
                if (b < 0) {
                    b = -b;
                }
                i = b % 100;
            } catch (RuntimeException unused) {
            }
        }
        if (i < 0) {
            stringBuffer.append(65533);
            stringBuffer.append(65533);
            return;
        }
        C72266w.m106676d(stringBuffer, i, 2);
    }

    /* renamed from: e */
    public final void mo63608e(StringBuffer stringBuffer, long j, C72132a aVar, int i, C72288l lVar, Locale locale) {
        int i2;
        try {
            int a = this.f192264a.mo63646a(aVar).mo63444a(j);
            if (a < 0) {
                a = -a;
            }
            i2 = a % 100;
        } catch (RuntimeException unused) {
            i2 = -1;
        }
        if (i2 < 0) {
            stringBuffer.append(65533);
            stringBuffer.append(65533);
            return;
        }
        C72266w.m106676d(stringBuffer, i2, 2);
    }
}
