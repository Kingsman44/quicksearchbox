package com.google.apps.tiktok.tracing;

import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;

/* renamed from: com.google.apps.tiktok.tracing.fd */
/* compiled from: PG */
public final class C47822fd extends RuntimeException {
    public C47822fd(Throwable th, StackTraceElement[] stackTraceElementArr) {
        super(BuildConfig.FLAVOR, th);
        setStackTrace(stackTraceElementArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0121, code lost:
        r17 = r8;
        r18 = r9;
        r13 = r15;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.RuntimeException m84995a(java.lang.Throwable r20) {
        /*
            com.google.apps.tiktok.tracing.bw r0 = com.google.apps.tiktok.tracing.C47831fm.m85009d()
            com.google.apps.tiktok.tracing.fd r1 = new com.google.apps.tiktok.tracing.fd
            r2 = 0
            java.lang.StackTraceElement[] r3 = m85000f(r0, r2)
            r4 = r20
            r1.<init>(r4, r3)
            boolean r3 = r0 instanceof com.google.apps.tiktok.tracing.C47844fy
            if (r3 == 0) goto L_0x02a6
            com.google.apps.tiktok.tracing.fy r0 = (com.google.apps.tiktok.tracing.C47844fy) r0
            com.google.apps.tiktok.tracing.ew r3 = r0.mo51402f()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.google.protobuf.cq r6 = r3.f123835d
            java.util.Iterator r6 = r6.iterator()
        L_0x002a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0040
            java.lang.Object r7 = r6.next()
            com.google.apps.tiktok.tracing.bg r7 = (com.google.apps.tiktok.tracing.C47556bg) r7
            int r8 = r7.f123406a
            r8 = r8 & 16
            if (r8 != 0) goto L_0x002a
            r5.add(r7)
            goto L_0x002a
        L_0x0040:
            boolean r5 = r5.isEmpty()
            java.lang.String r6 = "tk_trace"
            r7 = 0
            if (r5 == 0) goto L_0x0053
            java.lang.StackTraceElement r5 = new java.lang.StackTraceElement
            java.lang.String r8 = "No unfinished spans when the app crashed:"
            r5.<init>(r6, r8, r2, r7)
            r4.add(r5)
        L_0x0053:
            com.google.apps.tiktok.tracing.t r5 = r3.f123838g
            if (r5 != 0) goto L_0x0059
            com.google.apps.tiktok.tracing.t r5 = com.google.apps.tiktok.tracing.C47860t.f123928d
        L_0x0059:
            int r5 = r5.f123930a
            r8 = 1
            r5 = r5 & r8
            if (r5 == 0) goto L_0x0092
            java.lang.StackTraceElement r5 = new java.lang.StackTraceElement
            java.util.Locale r9 = java.util.Locale.US
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]
            com.google.protobuf.cq r11 = r3.f123835d
            java.lang.Object r11 = r11.get(r7)
            com.google.apps.tiktok.tracing.bg r11 = (com.google.apps.tiktok.tracing.C47556bg) r11
            java.lang.String r11 = r11.f123407b
            r10[r7] = r11
            com.google.apps.tiktok.tracing.t r11 = r3.f123838g
            if (r11 != 0) goto L_0x0078
            com.google.apps.tiktok.tracing.t r11 = com.google.apps.tiktok.tracing.C47860t.f123928d
        L_0x0078:
            com.google.apps.tiktok.tracing.s r11 = r11.f123931b
            if (r11 != 0) goto L_0x007e
            com.google.apps.tiktok.tracing.s r11 = com.google.apps.tiktok.tracing.C47859s.f123924c
        L_0x007e:
            int r11 = r11.f123927b
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r8] = r11
            java.lang.String r8 = "Trace %s tried to log too many spans. %s spans dropped"
            java.lang.String r8 = java.lang.String.format(r9, r8, r10)
            r5.<init>(r6, r8, r2, r7)
            r4.add(r5)
        L_0x0092:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x00a5
            java.lang.StackTraceElement[] r3 = new java.lang.StackTraceElement[r7]
            java.lang.Object[] r3 = r4.toArray(r3)
            java.lang.StackTraceElement[] r3 = (java.lang.StackTraceElement[]) r3
            m84999e(r1, r3)
            goto L_0x01c7
        L_0x00a5:
            int r4 = r0.mo51401e()
            com.google.protobuf.cq r5 = r3.f123835d
            int r5 = r5.size()
            java.lang.StackTraceElement[] r5 = new java.lang.StackTraceElement[r5]
            java.util.BitSet r8 = new java.util.BitSet
            r8.<init>()
            com.google.protobuf.cq r9 = r3.f123835d
            java.util.List r9 = com.google.common.p4522b.C58597ky.m90216g(r9)
            java.util.Iterator r9 = r9.iterator()
            r10 = 0
        L_0x00c1:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x01c7
            java.lang.Object r11 = r9.next()
            com.google.apps.tiktok.tracing.bg r11 = (com.google.apps.tiktok.tracing.C47556bg) r11
            int r12 = r11.f123408c
            if (r12 < r4) goto L_0x01c7
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r13 = 10
            if (r10 < r13) goto L_0x00f1
            java.lang.StackTraceElement r3 = new java.lang.StackTraceElement
            java.lang.String r4 = "Suppressed exceptions exceeds the limit 10, additional unfinished spans will not be reported"
            r3.<init>(r6, r4, r2, r7)
            r12.add(r3)
            java.lang.StackTraceElement[] r3 = new java.lang.StackTraceElement[r7]
            java.lang.Object[] r3 = r12.toArray(r3)
            java.lang.StackTraceElement[] r3 = (java.lang.StackTraceElement[]) r3
            m84999e(r1, r3)
            goto L_0x01c7
        L_0x00f1:
            int r13 = r11.f123408c
            r14 = r5[r13]
            if (r14 != 0) goto L_0x01bd
            int r14 = r11.f123406a
            r14 = r14 & 16
            if (r14 != 0) goto L_0x01bd
            boolean r13 = r8.get(r13)
            if (r13 != 0) goto L_0x01bd
            int r13 = r11.f123408c
            r15 = -1
        L_0x0106:
            boolean r16 = r8.get(r13)
            if (r16 == 0) goto L_0x010d
            goto L_0x0121
        L_0x010d:
            com.google.protobuf.cq r14 = r3.f123835d
            java.lang.Object r14 = r14.get(r13)
            com.google.apps.tiktok.tracing.bg r14 = (com.google.apps.tiktok.tracing.C47556bg) r14
            if (r14 != 0) goto L_0x0127
            java.lang.StackTraceElement r13 = new java.lang.StackTraceElement
            java.lang.String r14 = "Orphaned Root"
            r13.<init>(r6, r14, r2, r7)
            r12.add(r13)
        L_0x0121:
            r17 = r8
            r18 = r9
            r13 = r15
            goto L_0x018a
        L_0x0127:
            int r15 = r14.f123408c
            r15 = r5[r15]
            if (r15 != 0) goto L_0x016d
            java.lang.StackTraceElement r15 = new java.lang.StackTraceElement
            java.lang.String r2 = r14.f123407b
            int r7 = r14.f123406a
            r7 = r7 & 16
            if (r7 == 0) goto L_0x0153
            r17 = r8
            long r7 = r14.f123411f
            r18 = r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r19 = r13
            java.lang.String r13 = " "
            r9.<init>(r13)
            r9.append(r7)
            java.lang.String r7 = " ms"
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            goto L_0x015b
        L_0x0153:
            r17 = r8
            r18 = r9
            r19 = r13
            java.lang.String r7 = "(unfinished)"
        L_0x015b:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r2.concat(r7)
            r7 = 0
            r8 = 0
            r15.<init>(r6, r2, r8, r7)
            int r2 = r14.f123408c
            r5[r2] = r15
            goto L_0x0173
        L_0x016d:
            r17 = r8
            r18 = r9
            r19 = r13
        L_0x0173:
            int r2 = r14.f123408c
            r2 = r5[r2]
            r12.add(r2)
            int r13 = r14.f123409d
            if (r13 < r4) goto L_0x0188
            r8 = r17
            r9 = r18
            r15 = r19
            r2 = 0
            r7 = 0
            goto L_0x0106
        L_0x0188:
            r13 = r19
        L_0x018a:
            if (r13 != r4) goto L_0x019d
            int r10 = r10 + 1
            r2 = 0
            java.lang.StackTraceElement[] r7 = new java.lang.StackTraceElement[r2]
            java.lang.Object[] r2 = r12.toArray(r7)
            java.lang.StackTraceElement[] r2 = (java.lang.StackTraceElement[]) r2
            m84999e(r1, r2)
            r8 = r17
            goto L_0x01c1
        L_0x019d:
            com.google.protobuf.cq r2 = r3.f123835d
            int r7 = r11.f123408c
        L_0x01a1:
            java.lang.Object r8 = r2.get(r7)
            com.google.apps.tiktok.tracing.bg r8 = (com.google.apps.tiktok.tracing.C47556bg) r8
            r9 = r17
            boolean r7 = r9.get(r7)
            if (r7 != 0) goto L_0x01c0
            int r7 = r8.f123408c
            r9.set(r7)
            int r7 = r8.f123409d
            r8 = -1
            if (r7 != r8) goto L_0x01ba
            goto L_0x01c0
        L_0x01ba:
            r17 = r9
            goto L_0x01a1
        L_0x01bd:
            r18 = r9
            r9 = r8
        L_0x01c0:
            r8 = r9
        L_0x01c1:
            r9 = r18
            r2 = 0
            r7 = 0
            goto L_0x00c1
        L_0x01c7:
            java.util.Map r2 = com.google.apps.tiktok.tracing.C47831fm.m85017l()
            java.util.BitSet r3 = new java.util.BitSet
            r3.<init>()
            java.util.BitSet r4 = new java.util.BitSet
            r4.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x01dd:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x02a6
            java.lang.Object r5 = r2.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getValue()
            com.google.apps.tiktok.tracing.bw r6 = (com.google.apps.tiktok.tracing.C47572bw) r6
            java.lang.Object r5 = r5.getKey()
            java.lang.Thread r5 = (java.lang.Thread) r5
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            if (r5 == r7) goto L_0x01dd
            boolean r7 = r6 instanceof com.google.apps.tiktok.tracing.C47844fy
            if (r7 == 0) goto L_0x01dd
            r7 = r6
            com.google.apps.tiktok.tracing.fy r7 = (com.google.apps.tiktok.tracing.C47844fy) r7
            r8 = r7
            com.google.apps.tiktok.tracing.bw r8 = (com.google.apps.tiktok.tracing.C47572bw) r8
            java.util.UUID r8 = r8.mo51370d()
            r9 = r0
            com.google.apps.tiktok.tracing.bw r9 = (com.google.apps.tiktok.tracing.C47572bw) r9
            java.util.UUID r10 = r9.mo51370d()
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x01dd
            int r8 = r7.mo51401e()
            int r10 = r0.mo51401e()
            if (r8 <= r10) goto L_0x01dd
            com.google.apps.tiktok.tracing.ew r8 = r0.mo51402f()
            com.google.protobuf.cq r8 = r8.f123835d
            int r7 = r7.mo51401e()
            java.util.BitSet r10 = new java.util.BitSet
            r10.<init>()
        L_0x022f:
            boolean r11 = r4.get(r7)
            if (r11 == 0) goto L_0x023b
            boolean r11 = r3.get(r7)
            if (r11 == 0) goto L_0x01dd
        L_0x023b:
            boolean r11 = r3.get(r7)
            if (r11 == 0) goto L_0x0245
            r3.or(r10)
            goto L_0x0268
        L_0x0245:
            r4.set(r7)
            r10.set(r7)
            java.lang.Object r7 = r8.get(r7)
            com.google.apps.tiktok.tracing.bg r7 = (com.google.apps.tiktok.tracing.C47556bg) r7
            int r7 = r7.f123409d
            int r11 = r0.mo51401e()
            if (r7 > r11) goto L_0x022f
            int r8 = r0.mo51401e()
            if (r7 != r8) goto L_0x0262
            r3.or(r10)
        L_0x0262:
            int r8 = r0.mo51401e()
            if (r7 != r8) goto L_0x01dd
        L_0x0268:
            com.google.android.libraries.i.bf r7 = new com.google.android.libraries.i.bf
            r7.<init>(r5)
            com.google.apps.tiktok.tracing.fd r5 = new com.google.apps.tiktok.tracing.fd
            com.google.apps.tiktok.tracing.bw r8 = r9.mo51366a()
            java.lang.StackTraceElement[] r6 = m85000f(r6, r8)
            r11 = 0
            r5.<init>(r11, r6)
            r7.initCause(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.StackTraceElement r6 = new java.lang.StackTraceElement
            java.lang.String r8 = r7.getMessage()
            java.lang.String r9 = ""
            r12 = 0
            r6.<init>(r8, r9, r11, r12)
            r5.add(r6)
            java.lang.StackTraceElement[] r6 = r7.getStackTrace()
            java.util.Collections.addAll(r5, r6)
            java.lang.StackTraceElement[] r6 = new java.lang.StackTraceElement[r12]
            java.lang.Object[] r5 = r5.toArray(r6)
            java.lang.StackTraceElement[] r5 = (java.lang.StackTraceElement[]) r5
            com.google.apps.tiktok.tracing.C47820fb.m84994a(r1, r7)
            goto L_0x01dd
        L_0x02a6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.tracing.C47822fd.m84995a(java.lang.Throwable):java.lang.RuntimeException");
    }

    /* renamed from: b */
    public static RuntimeException m84996b(Thread thread) {
        C47833fn fnVar;
        C47572bw bwVar;
        synchronized (C47831fm.f123851a) {
            fnVar = (C47833fn) C47831fm.f123851a.get(thread);
        }
        if (fnVar == null) {
            bwVar = null;
        } else {
            bwVar = fnVar.f123862c;
        }
        return new C47822fd((Throwable) null, m85000f(bwVar, (C47572bw) null));
    }

    /* renamed from: c */
    public static RuntimeException m84997c() {
        return new C47822fd((Throwable) null, m85000f(C47831fm.m85009d(), (C47572bw) null));
    }

    /* renamed from: d */
    public static void m84998d(Throwable th) {
        C47865y.m85085a(th);
        throw new C47822fd(th, m85000f(C47831fm.m85009d(), (C47572bw) null));
    }

    /* renamed from: e */
    public static void m84999e(Throwable th, StackTraceElement[] stackTraceElementArr) {
        C47820fb.m84994a(th, new C47821fc(stackTraceElementArr));
    }

    /* renamed from: f */
    private static StackTraceElement[] m85000f(C47572bw bwVar, C47572bw bwVar2) {
        ArrayList arrayList = new ArrayList();
        for (C47572bw bwVar3 = bwVar; bwVar3 != bwVar2; bwVar3 = bwVar3.mo51366a()) {
            arrayList.add(new StackTraceElement("tk_trace", bwVar3.mo51367b(), (String) null, 0));
        }
        if (bwVar instanceof C47864x) {
            arrayList.add(new StackTraceElement("tk_trace", "Missing root trace", (String) null, 0));
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
