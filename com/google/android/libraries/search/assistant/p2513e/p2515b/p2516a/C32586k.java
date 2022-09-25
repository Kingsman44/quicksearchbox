package com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a;

import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.audio.endpointer.micro.MicroEndpointer$process$1", mo61344c = "MicroEndpointer.kt", mo61345d = "invokeSuspend", mo61346e = {60, 73, 131, 136, 137})
/* renamed from: com.google.android.libraries.search.assistant.e.b.a.k */
/* compiled from: PG */
public final class C32586k extends C69572j implements C69630p {

    /* renamed from: a */
    Object f87268a;

    /* renamed from: b */
    Object f87269b;

    /* renamed from: c */
    Object f87270c;

    /* renamed from: d */
    Object f87271d;

    /* renamed from: e */
    Object f87272e;

    /* renamed from: f */
    long f87273f;

    /* renamed from: g */
    int f87274g;

    /* renamed from: h */
    final /* synthetic */ C32587l f87275h;

    /* renamed from: i */
    final /* synthetic */ C71587n f87276i;

    /* renamed from: j */
    private /* synthetic */ Object f87277j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32586k(C32587l lVar, C71587n nVar, C69577g gVar) {
        super(2, gVar);
        this.f87275h = lVar;
        this.f87276i = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32586k) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: com.google.android.libraries.search.assistant.e.b.a.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: h.f.b.ae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: java.io.Closeable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.io.Closeable} */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01d0, code lost:
        if (r11.mo20883a(r0, r1) != r7) goto L_0x01d2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x013f A[Catch:{ all -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x017e A[Catch:{ all -> 0x0060 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01ac A[Catch:{ all -> 0x0060 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r27) {
        /*
            r26 = this;
            r1 = r26
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r1.f87274g
            r3 = 4
            r4 = 2
            r5 = 3
            r6 = 1
            if (r2 == 0) goto L_0x0072
            if (r2 == r6) goto L_0x0065
            if (r2 == r4) goto L_0x0042
            if (r2 == r5) goto L_0x0028
            if (r2 == r3) goto L_0x001d
            java.lang.Object r0 = r1.f87277j
            r2 = r0
            java.io.Closeable r2 = (java.io.Closeable) r2
            p5462h.C69714l.m101134b(r27)     // Catch:{ all -> 0x0060 }
            goto L_0x0025
        L_0x001d:
            java.lang.Object r0 = r1.f87277j
            r2 = r0
            java.io.Closeable r2 = (java.io.Closeable) r2
            p5462h.C69714l.m101134b(r27)     // Catch:{ all -> 0x0060 }
        L_0x0025:
            r3 = 0
            goto L_0x01d2
        L_0x0028:
            java.lang.Object r2 = r1.f87272e
            j$.time.Duration r2 = (p3186j$.time.Duration) r2
            java.lang.Object r4 = r1.f87271d
            java.io.Closeable r4 = (java.io.Closeable) r4
            java.lang.Object r8 = r1.f87270c
            java.lang.Object r9 = r1.f87269b
            java.lang.Object r10 = r1.f87268a
            java.lang.Object r11 = r1.f87277j
            kotlinx.coroutines.b.o r11 = (kotlinx.coroutines.p5574b.C71588o) r11
            p5462h.C69714l.m101134b(r27)     // Catch:{ all -> 0x0040 }
            r7 = r0
            goto L_0x0165
        L_0x0040:
            r0 = move-exception
            goto L_0x0062
        L_0x0042:
            long r8 = r1.f87273f
            java.lang.Object r2 = r1.f87272e
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r4 = r1.f87271d
            h.f.b.ad r4 = (p5462h.p5473f.p5475b.C69647ad) r4
            java.lang.Object r10 = r1.f87270c
            java.lang.Object r11 = r1.f87269b
            java.lang.Object r12 = r1.f87268a
            java.lang.Object r13 = r1.f87277j
            kotlinx.coroutines.b.o r13 = (kotlinx.coroutines.p5574b.C71588o) r13
            p5462h.C69714l.m101134b(r27)     // Catch:{ all -> 0x0060 }
            r7 = r0
            r6 = r10
            r5 = r11
            r10 = r12
            r11 = r13
            goto L_0x0125
        L_0x0060:
            r0 = move-exception
            r4 = r2
        L_0x0062:
            r2 = r0
            goto L_0x01dc
        L_0x0065:
            long r8 = r1.f87273f
            java.lang.Object r2 = r1.f87277j
            kotlinx.coroutines.b.o r2 = (kotlinx.coroutines.p5574b.C71588o) r2
            p5462h.C69714l.m101134b(r27)
            r14 = r8
            r8 = r27
            goto L_0x008c
        L_0x0072:
            p5462h.C69714l.m101134b(r27)
            java.lang.Object r2 = r1.f87277j
            kotlinx.coroutines.b.o r2 = (kotlinx.coroutines.p5574b.C71588o) r2
            com.google.android.libraries.search.assistant.e.b.a.l r8 = r1.f87275h
            com.google.android.libraries.search.assistant.e.b.a.o r8 = r8.f87280c
            r1.f87277j = r2
            r9 = 32
            r1.f87273f = r9
            r1.f87274g = r6
            java.lang.Object r8 = r8.mo38166a(r1)
            if (r8 == r0) goto L_0x01e3
            r14 = r9
        L_0x008c:
            byte[] r8 = (byte[]) r8
            com.google.speech.micro.GoogleEndpointerData r9 = new com.google.speech.micro.GoogleEndpointerData
            r10 = 16000(0x3e80, float:2.2421E-41)
            r9.<init>(r8, r10)
            h.f.b.ae r8 = new h.f.b.ae
            r8.<init>()
            com.google.android.libraries.search.assistant.e.b.a.c r10 = com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32578c.INITIAL
            r8.f186027a = r10
            h.f.b.ae r13 = new h.f.b.ae
            r13.<init>()
            com.google.android.libraries.search.assistant.e.b.a.l r10 = r1.f87275h
            com.google.android.libraries.search.assistant.e.b.a.b r10 = r10.f87278a
            j$.time.Duration r10 = r10.f87237b
            j$.time.Duration r10 = r10.negated()
            r13.f186027a = r10
            h.f.b.ae r11 = new h.f.b.ae
            r11.<init>()
            j$.time.Duration r10 = p3186j$.time.Duration.ZERO
            r11.f186027a = r10
            h.f.b.ad r12 = new h.f.b.ad
            r12.<init>()
            com.google.android.libraries.search.assistant.e.b.a.j r10 = new com.google.android.libraries.search.assistant.e.b.a.j
            com.google.android.libraries.search.assistant.e.b.a.l r3 = r1.f87275h
            r10.<init>(r11, r3)
            com.google.android.libraries.search.assistant.e.b.a.a r3 = new com.google.android.libraries.search.assistant.e.b.a.a
            com.google.speech.micro.GoogleEndpointer r7 = new com.google.speech.micro.GoogleEndpointer
            r7.<init>(r9)
            r3.<init>(r7)
            kotlinx.coroutines.b.n r7 = r1.f87276i
            com.google.android.libraries.search.assistant.e.b.a.l r6 = r1.f87275h
            com.google.speech.micro.GoogleEndpointer r5 = r3.f87235a     // Catch:{ all -> 0x01d9 }
            com.google.android.libraries.search.assistant.e.b.a.i r4 = new com.google.android.libraries.search.assistant.e.b.a.i     // Catch:{ all -> 0x01d9 }
            r4.<init>(r7)     // Catch:{ all -> 0x01d9 }
            int r7 = r9.idealBufferBytes()     // Catch:{ all -> 0x01d9 }
            kotlinx.coroutines.b.n r4 = com.google.android.libraries.search.assistant.p2511d.C32546i.m60360a(r4, r7)     // Catch:{ all -> 0x01d9 }
            com.google.android.libraries.search.assistant.e.b.a.f r7 = new com.google.android.libraries.search.assistant.e.b.a.f     // Catch:{ all -> 0x01d9 }
            r9 = r7
            r16 = r10
            r10 = r12
            r20 = r0
            r27 = r11
            r0 = r12
            r11 = r14
            r21 = r13
            r13 = r8
            r22 = r14
            r14 = r6
            r15 = r27
            r17 = r2
            r18 = r21
            r19 = r5
            r9.<init>(r10, r11, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x01d9 }
            r1.f87277j = r2     // Catch:{ all -> 0x01d9 }
            r1.f87268a = r8     // Catch:{ all -> 0x01d9 }
            r5 = r21
            r1.f87269b = r5     // Catch:{ all -> 0x01d9 }
            r6 = r27
            r1.f87270c = r6     // Catch:{ all -> 0x01d9 }
            r1.f87271d = r0     // Catch:{ all -> 0x01d9 }
            r1.f87272e = r3     // Catch:{ all -> 0x01d9 }
            r9 = r22
            r1.f87273f = r9     // Catch:{ all -> 0x01d9 }
            r11 = 2
            r1.f87274g = r11     // Catch:{ all -> 0x01d9 }
            java.lang.Object r4 = r4.mo38165mp(r7, r1)     // Catch:{ all -> 0x01d9 }
            r7 = r20
            if (r4 == r7) goto L_0x01d8
            r4 = r0
            r11 = r2
            r2 = r3
            r24 = r9
            r10 = r8
            r8 = r24
        L_0x0125:
            long r3 = r4.f186026a     // Catch:{ all -> 0x0060 }
            long r3 = r3 / r8
            j$.time.Duration r0 = p3186j$.time.Duration.ofMillis(r3)     // Catch:{ all -> 0x0060 }
            r3 = r5
            h.f.b.ae r3 = (p5462h.p5473f.p5475b.C69648ae) r3     // Catch:{ all -> 0x0060 }
            java.lang.Object r3 = r3.f186027a     // Catch:{ all -> 0x0060 }
            j$.time.Duration r3 = (p3186j$.time.Duration) r3     // Catch:{ all -> 0x0060 }
            j$.time.Duration r3 = r0.minus(r3)     // Catch:{ all -> 0x0060 }
            j$.time.Duration r4 = p3186j$.time.Duration.ZERO     // Catch:{ all -> 0x0060 }
            int r3 = r3.compareTo((p3186j$.time.Duration) r4)     // Catch:{ all -> 0x0060 }
            if (r3 <= 0) goto L_0x016f
            r0.toMillis()     // Catch:{ all -> 0x0060 }
            com.google.android.libraries.search.assistant.e.b.c r3 = new com.google.android.libraries.search.assistant.e.b.c     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "audioProcessedOffset"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r4)     // Catch:{ all -> 0x0060 }
            r3.<init>(r0)     // Catch:{ all -> 0x0060 }
            r1.f87277j = r11     // Catch:{ all -> 0x0060 }
            r1.f87268a = r10     // Catch:{ all -> 0x0060 }
            r1.f87269b = r5     // Catch:{ all -> 0x0060 }
            r1.f87270c = r6     // Catch:{ all -> 0x0060 }
            r1.f87271d = r2     // Catch:{ all -> 0x0060 }
            r1.f87272e = r0     // Catch:{ all -> 0x0060 }
            r4 = 3
            r1.f87274g = r4     // Catch:{ all -> 0x0060 }
            java.lang.Object r3 = r11.mo20883a(r3, r1)     // Catch:{ all -> 0x0060 }
            if (r3 == r7) goto L_0x016e
            r4 = r2
            r9 = r5
            r8 = r6
            r2 = r0
        L_0x0165:
            r0 = r9
            h.f.b.ae r0 = (p5462h.p5473f.p5475b.C69648ae) r0     // Catch:{ all -> 0x0040 }
            r0.f186027a = r2     // Catch:{ all -> 0x0040 }
            r2 = r4
            r6 = r8
            r5 = r9
            goto L_0x016f
        L_0x016e:
            return r7
        L_0x016f:
            h.f.b.ae r10 = (p5462h.p5473f.p5475b.C69648ae) r10     // Catch:{ all -> 0x0060 }
            java.lang.Object r0 = r10.f186027a     // Catch:{ all -> 0x0060 }
            com.google.android.libraries.search.assistant.e.b.a.c r0 = (com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32578c) r0     // Catch:{ all -> 0x0060 }
            com.google.android.libraries.search.assistant.e.b.a.c r3 = com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32578c.INITIAL     // Catch:{ all -> 0x0060 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0060 }
            r3 = 1
            if (r0 == r3) goto L_0x01ac
            r3 = 3
            if (r0 == r3) goto L_0x0183
            goto L_0x0025
        L_0x0183:
            com.google.android.libraries.search.assistant.e.b.a r0 = new com.google.android.libraries.search.assistant.e.b.a     // Catch:{ all -> 0x0060 }
            h.f.b.ae r6 = (p5462h.p5473f.p5475b.C69648ae) r6     // Catch:{ all -> 0x0060 }
            java.lang.Object r3 = r6.f186027a     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "speechEndOffset"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)     // Catch:{ all -> 0x0060 }
            j$.time.Duration r3 = (p3186j$.time.Duration) r3     // Catch:{ all -> 0x0060 }
            r0.<init>(r3)     // Catch:{ all -> 0x0060 }
            r1.f87277j = r2     // Catch:{ all -> 0x0060 }
            r3 = 0
            r1.f87268a = r3     // Catch:{ all -> 0x0060 }
            r1.f87269b = r3     // Catch:{ all -> 0x0060 }
            r1.f87270c = r3     // Catch:{ all -> 0x0060 }
            r1.f87271d = r3     // Catch:{ all -> 0x0060 }
            r1.f87272e = r3     // Catch:{ all -> 0x0060 }
            r3 = 5
            r1.f87274g = r3     // Catch:{ all -> 0x0060 }
            java.lang.Object r0 = r11.mo20883a(r0, r1)     // Catch:{ all -> 0x0060 }
            if (r0 == r7) goto L_0x01ab
            goto L_0x0025
        L_0x01ab:
            return r7
        L_0x01ac:
            com.google.android.libraries.search.assistant.e.b.a r0 = new com.google.android.libraries.search.assistant.e.b.a     // Catch:{ all -> 0x0060 }
            h.f.b.ae r5 = (p5462h.p5473f.p5475b.C69648ae) r5     // Catch:{ all -> 0x0060 }
            java.lang.Object r3 = r5.f186027a     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = "lastProgressOffset"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)     // Catch:{ all -> 0x0060 }
            j$.time.Duration r3 = (p3186j$.time.Duration) r3     // Catch:{ all -> 0x0060 }
            r0.<init>(r3)     // Catch:{ all -> 0x0060 }
            r1.f87277j = r2     // Catch:{ all -> 0x0060 }
            r3 = 0
            r1.f87268a = r3     // Catch:{ all -> 0x0060 }
            r1.f87269b = r3     // Catch:{ all -> 0x0060 }
            r1.f87270c = r3     // Catch:{ all -> 0x0060 }
            r1.f87271d = r3     // Catch:{ all -> 0x0060 }
            r1.f87272e = r3     // Catch:{ all -> 0x0060 }
            r4 = 4
            r1.f87274g = r4     // Catch:{ all -> 0x0060 }
            java.lang.Object r0 = r11.mo20883a(r0, r1)     // Catch:{ all -> 0x0060 }
            if (r0 == r7) goto L_0x01d8
        L_0x01d2:
            p5462h.p5472e.C69598b.m101013a(r2, r3)
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x01d8:
            return r7
        L_0x01d9:
            r0 = move-exception
            r2 = r0
            r4 = r3
        L_0x01dc:
            throw r2     // Catch:{ all -> 0x01dd }
        L_0x01dd:
            r0 = move-exception
            r3 = r0
            p5462h.p5472e.C69598b.m101013a(r4, r2)
            throw r3
        L_0x01e3:
            r7 = r0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2513e.p2515b.p2516a.C32586k.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C32586k kVar = new C32586k(this.f87275h, this.f87276i, gVar);
        kVar.f87277j = obj;
        return kVar;
    }
}
