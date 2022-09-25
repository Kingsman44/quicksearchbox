package com.google.p4476cf.p4478b;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import java.util.ArrayDeque;

/* renamed from: com.google.cf.b.c */
/* compiled from: PG */
final class C58062c {

    /* renamed from: a */
    private static final C58827ar f155208a = new C58827ar(BuildConfig.FLAVOR);

    /* renamed from: a */
    static C58495hd m88815a(CharSequence charSequence) {
        C58490gz gzVar = new C58490gz(4);
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            i += m88816b(new ArrayDeque(), charSequence, i, gzVar);
        }
        return gzVar.mo55427f(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0093 A[EDGE_INSN: B:49:0x0093->B:37:0x0093 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m88816b(java.util.Deque r11, java.lang.CharSequence r12, int r13, com.google.common.p4522b.C58490gz r14) {
        /*
            int r0 = r12.length()
            r1 = 0
            r2 = r13
            r3 = 0
        L_0x0007:
            r4 = 58
            r5 = 33
            r6 = 63
            r7 = 44
            if (r2 >= r0) goto L_0x0025
            char r3 = r12.charAt(r2)
            r8 = 38
            if (r3 == r8) goto L_0x0025
            if (r3 == r6) goto L_0x0025
            if (r3 == r5) goto L_0x0025
            if (r3 == r4) goto L_0x0025
            if (r3 != r7) goto L_0x0022
            goto L_0x0025
        L_0x0022:
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0025:
            java.lang.CharSequence r8 = r12.subSequence(r13, r2)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            java.lang.StringBuilder r8 = r9.reverse()
            r11.push(r8)
            if (r3 == r5) goto L_0x003f
            if (r3 == r6) goto L_0x003f
            if (r3 == r4) goto L_0x003f
            if (r3 != r7) goto L_0x0078
            r3 = 44
        L_0x003f:
            com.google.common.base.ar r4 = f155208a
            java.lang.String r4 = r4.mo56097d(r11)
            int r5 = r4.length()
            if (r5 <= 0) goto L_0x0078
            com.google.cf.b.b[] r5 = com.google.p4476cf.p4478b.C58061b.values()
            int r8 = r5.length
        L_0x0050:
            if (r1 >= r8) goto L_0x0064
            r9 = r5[r1]
            char r10 = r9.f155206c
            if (r10 == r3) goto L_0x0060
            char r10 = r9.f155207d
            if (r10 != r3) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            int r1 = r1 + 1
            goto L_0x0050
        L_0x0060:
            r14.mo55429h(r4, r9)
            goto L_0x0078
        L_0x0064:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "No enum corresponding to given code: "
            r12.<init>(r13)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0078:
            int r2 = r2 + 1
            if (r3 == r6) goto L_0x0093
            if (r3 == r7) goto L_0x0093
        L_0x007e:
            if (r2 >= r0) goto L_0x0093
            int r1 = m88816b(r11, r12, r2, r14)
            int r2 = r2 + r1
            char r1 = r12.charAt(r2)
            if (r1 == r6) goto L_0x0091
            char r1 = r12.charAt(r2)
            if (r1 != r7) goto L_0x007e
        L_0x0091:
            int r2 = r2 + 1
        L_0x0093:
            r11.pop()
            int r2 = r2 - r13
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4476cf.p4478b.C58062c.m88816b(java.util.Deque, java.lang.CharSequence, int, com.google.common.b.gz):int");
    }
}
