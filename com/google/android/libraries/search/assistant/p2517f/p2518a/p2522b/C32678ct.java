package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2532b.p2533a.C32916k;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5462h.C69613f;
import p5462h.C69747m;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.ct */
/* compiled from: PG */
public final class C32678ct implements C32916k {

    /* renamed from: a */
    public final C71788b f87583a = new C71799m();

    /* renamed from: b */
    private final C69613f f87584b;

    public C32678ct(int i) {
        this.f87584b = new C69747m(new C32677cs(i));
    }

    /* renamed from: a */
    public final C32675cq mo38239a() {
        return (C32675cq) this.f87584b.mo5768a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c4 A[Catch:{ all -> 0x014f }, LOOP:0: B:23:0x00be->B:25:0x00c4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x014e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38184e(java.lang.String r18, p3186j$.time.Instant r19, p5462h.p5466c.C69577g r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r20
            java.lang.String r2 = "\t"
            boolean r3 = r0 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32676cr
            if (r3 == 0) goto L_0x0019
            r3 = r0
            com.google.android.libraries.search.assistant.f.a.b.cr r3 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32676cr) r3
            int r4 = r3.f87581g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f87581g = r4
            goto L_0x001e
        L_0x0019:
            com.google.android.libraries.search.assistant.f.a.b.cr r3 = new com.google.android.libraries.search.assistant.f.a.b.cr
            r3.<init>(r1, r0)
        L_0x001e:
            java.lang.Object r0 = r3.f87579e
            h.c.a.a r4 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r5 = r3.f87581g
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0067
            if (r5 == r7) goto L_0x004e
            if (r5 != r6) goto L_0x0046
            java.lang.Object r2 = r3.f87578d
            java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
            java.lang.Object r4 = r3.f87577c
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r3.f87576b
            java.lang.StringBuilder r5 = (java.lang.StringBuilder) r5
            java.lang.Object r3 = r3.f87575a
            kotlinx.coroutines.j.b r3 = (kotlinx.coroutines.p5584j.C71788b) r3
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0042 }
            goto L_0x0127
        L_0x0042:
            r0 = move-exception
            r2 = r8
            goto L_0x0152
        L_0x0046:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004e:
            java.lang.Object r5 = r3.f87578d
            kotlinx.coroutines.j.b r5 = (kotlinx.coroutines.p5584j.C71788b) r5
            java.lang.Object r7 = r3.f87577c
            j$.time.Instant r7 = (p3186j$.time.Instant) r7
            java.lang.Object r9 = r3.f87576b
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r3.f87575a
            com.google.android.libraries.search.assistant.f.a.b.ct r10 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32678ct) r10
            p5462h.C69714l.m101134b(r0)
            r16 = r9
            r9 = r5
            r5 = r16
            goto L_0x0083
        L_0x0067:
            p5462h.C69714l.m101134b(r0)
            kotlinx.coroutines.j.b r0 = r1.f87583a
            r3.f87575a = r1
            r5 = r18
            r3.f87576b = r5
            r9 = r19
            r3.f87577c = r9
            r3.f87578d = r0
            r3.f87581g = r7
            java.lang.Object r7 = r0.mo63025b(r8, r3)
            if (r7 == r4) goto L_0x0156
            r10 = r1
            r7 = r9
            r9 = r0
        L_0x0083:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x014f }
            r0.<init>()     // Catch:{ all -> 0x014f }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x014f }
            r11.<init>()     // Catch:{ all -> 0x014f }
            r11.append(r5)     // Catch:{ all -> 0x014f }
            r11.append(r2)     // Catch:{ all -> 0x014f }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x014f }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x014f }
            r12.<init>()     // Catch:{ all -> 0x014f }
            r12.append(r5)     // Catch:{ all -> 0x014f }
            java.lang.String r13 = "AccessSessionServices:"
            r12.append(r13)     // Catch:{ all -> 0x014f }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x014f }
            r0.append(r12)     // Catch:{ all -> 0x014f }
            r12 = 10
            r0.append(r12)     // Catch:{ all -> 0x014f }
            com.google.android.libraries.search.assistant.f.a.b.cq r13 = r10.mo38239a()     // Catch:{ all -> 0x014f }
            java.util.Map r13 = r13.f87572a     // Catch:{ all -> 0x014f }
            java.util.Set r13 = r13.entrySet()     // Catch:{ all -> 0x014f }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x014f }
        L_0x00be:
            boolean r14 = r13.hasNext()     // Catch:{ all -> 0x014f }
            if (r14 == 0) goto L_0x010a
            java.lang.Object r14 = r13.next()     // Catch:{ all -> 0x014f }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ all -> 0x014f }
            java.lang.Object r15 = r14.getKey()     // Catch:{ all -> 0x014f }
            com.google.android.libraries.search.assistant.f.a.d.d r15 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32858d) r15     // Catch:{ all -> 0x014f }
            java.util.List r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32691df.f87608b     // Catch:{ all -> 0x014f }
            java.util.List r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32688dc.m60590c(r15, r8)     // Catch:{ all -> 0x014f }
            java.lang.String r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32691df.m60594a(r8)     // Catch:{ all -> 0x014f }
            java.lang.Object r14 = r14.getValue()     // Catch:{ all -> 0x014f }
            java.lang.Class r14 = r14.getClass()     // Catch:{ all -> 0x014f }
            int r15 = p5462h.p5473f.p5475b.C69649af.f186028a     // Catch:{ all -> 0x014f }
            h.f.b.g r15 = new h.f.b.g     // Catch:{ all -> 0x014f }
            r15.<init>(r14)     // Catch:{ all -> 0x014f }
            java.lang.String r14 = r15.mo61379b()     // Catch:{ all -> 0x014f }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x014f }
            r15.<init>()     // Catch:{ all -> 0x014f }
            r15.append(r11)     // Catch:{ all -> 0x014f }
            r15.append(r8)     // Catch:{ all -> 0x014f }
            r15.append(r2)     // Catch:{ all -> 0x014f }
            r15.append(r14)     // Catch:{ all -> 0x014f }
            java.lang.String r8 = r15.toString()     // Catch:{ all -> 0x014f }
            r0.append(r8)     // Catch:{ all -> 0x014f }
            r0.append(r12)     // Catch:{ all -> 0x014f }
            r8 = 0
            goto L_0x00be
        L_0x010a:
            com.google.android.libraries.search.assistant.f.a.b.cq r2 = r10.mo38239a()     // Catch:{ all -> 0x014f }
            com.google.android.libraries.search.assistant.f.a.b.co r2 = r2.f87574c     // Catch:{ all -> 0x014f }
            r3.f87575a = r9     // Catch:{ all -> 0x014f }
            r3.f87576b = r0     // Catch:{ all -> 0x014f }
            r3.f87577c = r5     // Catch:{ all -> 0x014f }
            r3.f87578d = r0     // Catch:{ all -> 0x014f }
            r3.f87581g = r6     // Catch:{ all -> 0x014f }
            com.google.android.libraries.search.assistant.f.a.b.bs r2 = r2.f87568b     // Catch:{ all -> 0x014f }
            java.lang.Object r2 = r2.mo38184e(r5, r7, r3)     // Catch:{ all -> 0x014f }
            if (r2 == r4) goto L_0x014e
            r4 = r5
            r3 = r9
            r5 = r0
            r0 = r2
            r2 = r5
        L_0x0127:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x014c }
            r6.<init>()     // Catch:{ all -> 0x014c }
            r6.append(r4)     // Catch:{ all -> 0x014c }
            java.lang.String r4 = "SynchronizedCache:\n "
            r6.append(r4)     // Catch:{ all -> 0x014c }
            r6.append(r0)     // Catch:{ all -> 0x014c }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x014c }
            r2.append(r0)     // Catch:{ all -> 0x014c }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x014c }
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r2)     // Catch:{ all -> 0x014c }
            r2 = 0
            r3.mo63026c(r2)
            return r0
        L_0x014c:
            r0 = move-exception
            goto L_0x0151
        L_0x014e:
            return r4
        L_0x014f:
            r0 = move-exception
            r3 = r9
        L_0x0151:
            r2 = 0
        L_0x0152:
            r3.mo63026c(r2)
            throw r0
        L_0x0156:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32678ct.mo38184e(java.lang.String, j$.time.Instant, h.c.g):java.lang.Object");
    }
}
