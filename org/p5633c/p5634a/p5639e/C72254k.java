package org.p5633c.p5634a.p5639e;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72233e;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72288l;

/* renamed from: org.c.a.e.k */
/* compiled from: PG */
final class C72254k implements C72265v, C72261r {

    /* renamed from: a */
    private static final Map f192251a = new HashMap();

    /* renamed from: b */
    private final C72283g f192252b;

    /* renamed from: c */
    private final boolean f192253c;

    public C72254k(C72283g gVar, boolean z) {
        this.f192252b = gVar;
        this.f192253c = z;
    }

    /* renamed from: a */
    public final int mo63604a() {
        return mo63605b();
    }

    /* renamed from: b */
    public final int mo63605b() {
        return this.f192253c ? 6 : 20;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0117, code lost:
        r3 = java.lang.Math.min(r18.length(), r2 + r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0121, code lost:
        if (r3 <= r2) goto L_0x0143;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0123, code lost:
        r6 = r18.substring(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x012d, code lost:
        if (r7.contains(r6) == false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x012f, code lost:
        r0.mo63639c(new org.p5633c.p5634a.p5639e.C72262s(r1.f192252b.mo63646a(r0.f192278a), r6, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x013f, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0140, code lost:
        r3 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0145, code lost:
        return r2 ^ -1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo63606c(org.p5633c.p5634a.p5639e.C72264u r17, java.lang.String r18, int r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r19
            java.lang.String r3 = "Field '"
            java.util.Locale r4 = r0.f192281d
            java.util.Map r5 = f192251a
            monitor-enter(r5)
            java.lang.Object r6 = r5.get(r4)     // Catch:{ all -> 0x0146 }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x0146 }
            if (r6 != 0) goto L_0x001d
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0146 }
            r6.<init>()     // Catch:{ all -> 0x0146 }
            r5.put(r4, r6)     // Catch:{ all -> 0x0146 }
        L_0x001d:
            org.c.a.g r7 = r1.f192252b     // Catch:{ all -> 0x0146 }
            java.lang.Object r7 = r6.get(r7)     // Catch:{ all -> 0x0146 }
            java.lang.Object[] r7 = (java.lang.Object[]) r7     // Catch:{ all -> 0x0146 }
            r8 = 0
            if (r7 != 0) goto L_0x0108
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x0146 }
            r10 = 32
            r7.<init>(r10)     // Catch:{ all -> 0x0146 }
            org.c.a.aa r11 = new org.c.a.aa     // Catch:{ all -> 0x0146 }
            org.c.a.l r12 = org.p5633c.p5634a.C72288l.f192416b     // Catch:{ all -> 0x0146 }
            r13 = 0
            r11.<init>(r13, r12)     // Catch:{ all -> 0x0146 }
            org.c.a.g r12 = r1.f192252b     // Catch:{ all -> 0x0146 }
            org.c.a.a r13 = r11.f191963b     // Catch:{ all -> 0x0146 }
            org.c.a.e r13 = r12.mo63646a(r13)     // Catch:{ all -> 0x0146 }
            boolean r14 = r13.mo63558E()     // Catch:{ all -> 0x0146 }
            if (r14 == 0) goto L_0x00ef
            org.c.a.z r3 = new org.c.a.z     // Catch:{ all -> 0x0146 }
            r3.<init>(r11, r13)     // Catch:{ all -> 0x0146 }
            org.c.a.e r11 = r3.f192467b     // Catch:{ all -> 0x0146 }
            int r11 = r11.mo63447h()     // Catch:{ all -> 0x0146 }
            org.c.a.e r12 = r3.f192467b     // Catch:{ all -> 0x0146 }
            int r12 = r12.mo63446d()     // Catch:{ all -> 0x0146 }
            int r13 = r12 - r11
            if (r13 <= r10) goto L_0x005f
            r0 = r2 ^ -1
            monitor-exit(r5)     // Catch:{ all -> 0x0146 }
            return r0
        L_0x005f:
            org.c.a.e r10 = r3.f192467b     // Catch:{ all -> 0x0146 }
            int r10 = r10.mo63468c(r4)     // Catch:{ all -> 0x0146 }
        L_0x0065:
            if (r11 > r12) goto L_0x00b3
            org.c.a.aa r13 = r3.f192466a     // Catch:{ all -> 0x0146 }
            org.c.a.e r14 = r3.f192467b     // Catch:{ all -> 0x0146 }
            r15 = r10
            long r9 = r13.f191962a     // Catch:{ all -> 0x0146 }
            long r9 = r14.mo63454q(r9, r11)     // Catch:{ all -> 0x0146 }
            r13.mo63411mt(r9)     // Catch:{ all -> 0x0146 }
            java.lang.String r9 = r3.mo63554f(r4)     // Catch:{ all -> 0x0146 }
            r7.add(r9)     // Catch:{ all -> 0x0146 }
            java.lang.String r9 = r3.mo63554f(r4)     // Catch:{ all -> 0x0146 }
            java.lang.String r9 = r9.toLowerCase(r4)     // Catch:{ all -> 0x0146 }
            r7.add(r9)     // Catch:{ all -> 0x0146 }
            java.lang.String r9 = r3.mo63554f(r4)     // Catch:{ all -> 0x0146 }
            java.lang.String r9 = r9.toUpperCase(r4)     // Catch:{ all -> 0x0146 }
            r7.add(r9)     // Catch:{ all -> 0x0146 }
            java.lang.String r9 = r3.mo63555g(r4)     // Catch:{ all -> 0x0146 }
            r7.add(r9)     // Catch:{ all -> 0x0146 }
            java.lang.String r9 = r3.mo63555g(r4)     // Catch:{ all -> 0x0146 }
            java.lang.String r9 = r9.toLowerCase(r4)     // Catch:{ all -> 0x0146 }
            r7.add(r9)     // Catch:{ all -> 0x0146 }
            java.lang.String r9 = r3.mo63555g(r4)     // Catch:{ all -> 0x0146 }
            java.lang.String r9 = r9.toUpperCase(r4)     // Catch:{ all -> 0x0146 }
            r7.add(r9)     // Catch:{ all -> 0x0146 }
            int r11 = r11 + 1
            r10 = r15
            goto L_0x0065
        L_0x00b3:
            r15 = r10
            java.lang.String r3 = "en"
            java.lang.String r9 = r4.getLanguage()     // Catch:{ all -> 0x0146 }
            boolean r3 = r3.equals(r9)     // Catch:{ all -> 0x0146 }
            if (r3 == 0) goto L_0x00dc
            org.c.a.g r3 = r1.f192252b     // Catch:{ all -> 0x0146 }
            org.c.a.g r9 = org.p5633c.p5634a.C72283g.f192387c     // Catch:{ all -> 0x0146 }
            if (r3 != r9) goto L_0x00dc
            java.lang.String r3 = "BCE"
            r7.add(r3)     // Catch:{ all -> 0x0146 }
            java.lang.String r3 = "bce"
            r7.add(r3)     // Catch:{ all -> 0x0146 }
            java.lang.String r3 = "CE"
            r7.add(r3)     // Catch:{ all -> 0x0146 }
            java.lang.String r3 = "ce"
            r7.add(r3)     // Catch:{ all -> 0x0146 }
            r10 = 3
            goto L_0x00dd
        L_0x00dc:
            r10 = r15
        L_0x00dd:
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0146 }
            r3[r8] = r7     // Catch:{ all -> 0x0146 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0146 }
            r9 = 1
            r3[r9] = r8     // Catch:{ all -> 0x0146 }
            org.c.a.g r8 = r1.f192252b     // Catch:{ all -> 0x0146 }
            r6.put(r8, r3)     // Catch:{ all -> 0x0146 }
            goto L_0x0116
        L_0x00ef:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0146 }
            java.lang.String r2 = r12.f192410z     // Catch:{ all -> 0x0146 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0146 }
            r4.<init>(r3)     // Catch:{ all -> 0x0146 }
            r4.append(r2)     // Catch:{ all -> 0x0146 }
            java.lang.String r2 = "' is not supported"
            r4.append(r2)     // Catch:{ all -> 0x0146 }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x0146 }
            r0.<init>(r2)     // Catch:{ all -> 0x0146 }
            throw r0     // Catch:{ all -> 0x0146 }
        L_0x0108:
            r3 = r7[r8]     // Catch:{ all -> 0x0146 }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x0146 }
            r6 = 1
            r6 = r7[r6]     // Catch:{ all -> 0x0146 }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x0146 }
            int r10 = r6.intValue()     // Catch:{ all -> 0x0146 }
            r7 = r3
        L_0x0116:
            monitor-exit(r5)     // Catch:{ all -> 0x0146 }
            int r3 = r18.length()
            int r5 = r2 + r10
            int r3 = java.lang.Math.min(r3, r5)
        L_0x0121:
            if (r3 <= r2) goto L_0x0143
            r5 = r18
            java.lang.String r6 = r5.substring(r2, r3)
            boolean r8 = r7.contains(r6)
            if (r8 == 0) goto L_0x0140
            org.c.a.g r2 = r1.f192252b
            org.c.a.e.s r5 = new org.c.a.e.s
            org.c.a.a r7 = r0.f192278a
            org.c.a.e r2 = r2.mo63646a(r7)
            r5.<init>(r2, r6, r4)
            r0.mo63639c(r5)
            return r3
        L_0x0140:
            int r3 = r3 + -1
            goto L_0x0121
        L_0x0143:
            r0 = r2 ^ -1
            return r0
        L_0x0146:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0146 }
            goto L_0x014a
        L_0x0149:
            throw r0
        L_0x014a:
            goto L_0x0149
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p5633c.p5634a.p5639e.C72254k.mo63606c(org.c.a.e.u, java.lang.String, int):int");
    }

    /* renamed from: d */
    public final void mo63607d(StringBuffer stringBuffer, C72151ai aiVar, Locale locale) {
        String str;
        try {
            if (aiVar.mo63397i(this.f192252b)) {
                C72233e a = this.f192252b.mo63646a(aiVar.mo63439f());
                str = this.f192253c ? a.mo63560u(aiVar, locale) : a.mo63561x(aiVar, locale);
            } else {
                str = "�";
            }
            stringBuffer.append(str);
        } catch (RuntimeException unused) {
            stringBuffer.append(65533);
        }
    }

    /* renamed from: e */
    public final void mo63608e(StringBuffer stringBuffer, long j, C72132a aVar, int i, C72288l lVar, Locale locale) {
        String str;
        try {
            C72233e a = this.f192252b.mo63646a(aVar);
            if (this.f192253c) {
                str = a.mo63471t(j, locale);
            } else {
                str = a.mo63472w(j, locale);
            }
            stringBuffer.append(str);
        } catch (RuntimeException unused) {
            stringBuffer.append(65533);
        }
    }
}
