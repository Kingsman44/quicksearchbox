package com.google.android.libraries.search.assistant.p2486aa.p2492c;

import com.google.android.libraries.search.assistant.p2486aa.p2490b.C32260b;
import com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32258c;
import com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32313i;
import com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32314j;
import com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32324t;
import com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32327w;
import com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a.C32288i;
import com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c.C32347p;
import com.google.common.p4526f.C59071e;
import com.google.common.p4580v.p4582b.C60943b;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Duration;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.j */
/* compiled from: PG */
public final class C32357j extends C32347p {
    @Deprecated

    /* renamed from: a */
    public static final C59071e f86730a = C59071e.m91331h();

    /* renamed from: b */
    public final C32324t f86731b;

    /* renamed from: c */
    public final C32327w f86732c;

    /* renamed from: d */
    public final C32260b f86733d;

    /* renamed from: e */
    private final C71422aw f86734e;

    /* renamed from: f */
    private final C32313i f86735f;

    /* renamed from: g */
    private final C32314j f86736g;

    /* renamed from: h */
    private final C32288i f86737h;

    /* renamed from: i */
    private final C32258c f86738i;

    /* renamed from: j */
    private final boolean f86739j;

    /* renamed from: k */
    private final AtomicInteger f86740k = new AtomicInteger(0);

    /* renamed from: l */
    private final Duration f86741l;

    /* renamed from: m */
    private final Duration f86742m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32357j(C71422aw awVar, C32313i iVar, C32324t tVar, C32314j jVar, C32288i iVar2, C32327w wVar, C32258c cVar, C32260b bVar, boolean z, long j, long j2) {
        super(awVar.mo5702lZ());
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(iVar, "accessSessionManager");
        C69664n.m101061g(cVar, "debugDataProvider");
        this.f86734e = awVar;
        this.f86735f = iVar;
        this.f86731b = tVar;
        this.f86736g = jVar;
        this.f86737h = iVar2;
        this.f86732c = wVar;
        this.f86738i = cVar;
        this.f86733d = bVar;
        this.f86739j = z;
        this.f86741l = C60943b.m93086b(j);
        this.f86742m = C60943b.m93086b(j2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c A[PHI: r8 
      PHI: (r8v2 java.lang.Object) = (r8v5 java.lang.Object), (r8v1 java.lang.Object) binds: [B:18:0x0069, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38047b(com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq r6, int r7, p5462h.p5466c.C69577g r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.libraries.search.assistant.p2486aa.p2492c.C32328b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.google.android.libraries.search.assistant.aa.c.b r0 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.C32328b) r0
            int r1 = r0.f86662f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f86662f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.aa.c.b r0 = new com.google.android.libraries.search.assistant.aa.c.b
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f86660d
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f86662f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p5462h.C69714l.m101134b(r8)
            goto L_0x006c
        L_0x002a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0032:
            int r7 = r0.f86659c
            java.lang.Object r6 = r0.f86658b
            java.lang.Object r2 = r0.f86657a
            p5462h.C69714l.m101134b(r8)
            goto L_0x0051
        L_0x003c:
            p5462h.C69714l.m101134b(r8)
            com.google.android.libraries.search.assistant.aa.c.a.i r8 = r5.f86735f
            r0.f86657a = r5
            r0.f86658b = r6
            r0.f86659c = r7
            r0.f86662f = r4
            r2 = 0
            java.lang.Object r8 = r8.mo38036b(r6, r7, r2, r0)
            if (r8 == r1) goto L_0x006d
            r2 = r5
        L_0x0051:
            com.google.android.libraries.search.assistant.f.a.b r8 = (com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b) r8
            com.google.android.libraries.search.assistant.aa.c.j r2 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.C32357j) r2
            com.google.android.libraries.search.assistant.aa.c.a.j r2 = r2.f86736g
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r7)
            r7 = 0
            r0.f86657a = r7
            r0.f86658b = r7
            r0.f86662f = r3
            com.google.android.libraries.search.assistant.f.a.d.cq r6 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r6
            java.lang.Object r8 = r2.mo38037a(r8, r6, r4, r0)
            if (r8 != r1) goto L_0x006c
            return r1
        L_0x006c:
            return r8
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2486aa.p2492c.C32357j.mo38047b(com.google.android.libraries.search.assistant.f.a.d.cq, int, h.c.g):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: kotlinx.coroutines.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: kotlinx.coroutines.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: com.google.android.libraries.search.assistant.f.a.d.cq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v25, resolved type: kotlinx.coroutines.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: com.google.android.libraries.search.assistant.f.a.d.cq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: com.google.android.libraries.search.assistant.f.a.d.cq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: kotlinx.coroutines.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: kotlinx.coroutines.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v16, resolved type: kotlinx.coroutines.be} */
    /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
        r9 = (com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32259d) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x043b, code lost:
        if (r9 != null) goto L_0x044d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x043d, code lost:
        if (r8 >= r7) goto L_0x0445;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        r6.lock();
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0445, code lost:
        r5.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0448, code lost:
        r12 = r30;
        r5 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:?, code lost:
        r9.f86496f.putAll(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0452, code lost:
        if (r8 >= r7) goto L_0x045a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
        r6.lock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0457, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        r5.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        r5.f86664a = r12;
        r5.f86665b = r15;
        r5.f86666c = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:?, code lost:
        r5.f86667d = null;
        r5.f86668e = null;
        r5.f86669f = null;
        r5.f86670g = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        r5.f86671h = r3;
        r5.f86675l = 4;
        r4 = r23.mo62825a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0478, code lost:
        r2 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x047a, code lost:
        if (r4 == r2) goto L_0x049d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x047c, code lost:
        r2 = r3;
        r5 = r12;
        r3 = r1;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x049d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x049e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x049f, code lost:
        r4 = null;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04a1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04a2, code lost:
        r4 = null;
        r15 = r15;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02b4 A[SYNTHETIC, Splitter:B:107:0x02b4] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0305 A[SYNTHETIC, Splitter:B:123:0x0305] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x034d A[SYNTHETIC, Splitter:B:128:0x034d] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0371 A[SYNTHETIC, Splitter:B:134:0x0371] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03b1 A[Catch:{ Exception -> 0x04bd, all -> 0x04b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03c2 A[SYNTHETIC, Splitter:B:143:0x03c2] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x03fb A[SYNTHETIC, Splitter:B:149:0x03fb] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0400 A[Catch:{ Exception -> 0x02bc, all -> 0x02b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0404 A[Catch:{ Exception -> 0x02bc, all -> 0x02b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x041d A[SYNTHETIC, Splitter:B:162:0x041d] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04ab A[SYNTHETIC, Splitter:B:210:0x04ab] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0438 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01c6 A[SYNTHETIC, Splitter:B:77:0x01c6] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0218 A[SYNTHETIC, Splitter:B:88:0x0218] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38048c(com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq r27, int r28, p3186j$.time.Duration r29, boolean r30, p5462h.p5466c.C69577g r31) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r31
            boolean r5 = r4 instanceof com.google.android.libraries.search.assistant.p2486aa.p2492c.C32331c
            if (r5 == 0) goto L_0x001b
            r5 = r4
            com.google.android.libraries.search.assistant.aa.c.c r5 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.C32331c) r5
            int r6 = r5.f86675l
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001b
            int r6 = r6 - r7
            r5.f86675l = r6
            goto L_0x0020
        L_0x001b:
            com.google.android.libraries.search.assistant.aa.c.c r5 = new com.google.android.libraries.search.assistant.aa.c.c
            r5.<init>(r1, r4)
        L_0x0020:
            java.lang.Object r4 = r5.f86673j
            h.c.a.a r6 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r7 = r5.f86675l
            java.lang.String r8 = "sessionToken"
            r9 = 4
            r10 = 2
            java.lang.String r11 = "Sbcp"
            r12 = 3
            r13 = 1
            if (r7 == 0) goto L_0x00db
            if (r7 == r13) goto L_0x00b9
            if (r7 == r10) goto L_0x008c
            if (r7 == r12) goto L_0x005c
            if (r7 != r9) goto L_0x0054
            int r2 = r5.f86671h
            java.lang.Object r3 = r5.f86666c
            com.google.speech.j.a.az r3 = (com.google.speech.p5218j.p5219a.C66722az) r3
            java.lang.Object r6 = r5.f86665b
            java.lang.Object r5 = r5.f86664a
            p5462h.C69714l.m101134b(r4)     // Catch:{ Exception -> 0x004e, all -> 0x0048 }
            r15 = r6
            goto L_0x047f
        L_0x0048:
            r0 = move-exception
            r1 = r0
            r3 = r2
            r15 = r6
            goto L_0x00d0
        L_0x004e:
            r0 = move-exception
            r1 = r0
            r3 = r2
            r15 = r6
            goto L_0x00d8
        L_0x0054:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L_0x005c:
            int r2 = r5.f86672i
            int r3 = r5.f86671h
            java.lang.Object r7 = r5.f86670g
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r10 = r5.f86669f
            com.google.android.libraries.search.assistant.f.a.d.cq r10 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r10
            java.lang.Object r12 = r5.f86668e
            com.google.android.libraries.search.assistant.aa.c.a.a.i r12 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a.C32288i) r12
            java.lang.Object r13 = r5.f86667d
            java.lang.Object r15 = r5.f86666c
            com.google.android.libraries.search.assistant.f.a.b r15 = (com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b) r15
            java.lang.Object r9 = r5.f86665b
            java.lang.Object r14 = r5.f86664a
            p5462h.C69714l.m101134b(r4)     // Catch:{ Exception -> 0x0087, all -> 0x0082 }
            r25 = r15
            r15 = r9
            r9 = r12
            r12 = r14
            r14 = r25
            goto L_0x0189
        L_0x0082:
            r0 = move-exception
            r1 = r0
            r15 = r9
            r5 = r14
            goto L_0x00d0
        L_0x0087:
            r0 = move-exception
            r1 = r0
            r15 = r9
            r5 = r14
            goto L_0x00d8
        L_0x008c:
            int r2 = r5.f86672i
            int r3 = r5.f86671h
            java.lang.Object r7 = r5.f86670g
            com.google.android.libraries.search.assistant.f.a.d.cq r7 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r7
            java.lang.Object r9 = r5.f86669f
            com.google.android.libraries.search.assistant.aa.c.a.a.i r9 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a.C32288i) r9
            java.lang.Object r10 = r5.f86668e
            kotlinx.coroutines.be r10 = (kotlinx.coroutines.C71604be) r10
            java.lang.Object r13 = r5.f86667d
            java.lang.Object r14 = r5.f86666c
            com.google.android.libraries.search.assistant.f.a.b r14 = (com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b) r14
            java.lang.Object r15 = r5.f86665b
            java.lang.Object r12 = r5.f86664a
            p5462h.C69714l.m101134b(r4)     // Catch:{ Exception -> 0x00b5, all -> 0x00b1 }
            r25 = r10
            r10 = r7
            r7 = r13
            r13 = r25
            goto L_0x016a
        L_0x00b1:
            r0 = move-exception
            r1 = r0
            r5 = r12
            goto L_0x00d0
        L_0x00b5:
            r0 = move-exception
            r1 = r0
            r5 = r12
            goto L_0x00d8
        L_0x00b9:
            int r2 = r5.f86671h
            java.lang.Object r3 = r5.f86666c
            j$.time.Duration r3 = (p3186j$.time.Duration) r3
            java.lang.Object r7 = r5.f86665b
            java.lang.Object r9 = r5.f86664a
            p5462h.C69714l.m101134b(r4)     // Catch:{ Exception -> 0x00d3, all -> 0x00cb }
            r22 = r3
            r3 = r2
            r2 = r7
            goto L_0x010a
        L_0x00cb:
            r0 = move-exception
            r1 = r0
            r3 = r2
            r15 = r7
            r5 = r9
        L_0x00d0:
            r14 = 0
            goto L_0x0532
        L_0x00d3:
            r0 = move-exception
            r1 = r0
            r3 = r2
            r15 = r7
            r5 = r9
        L_0x00d8:
            r4 = 0
            goto L_0x0500
        L_0x00db:
            p5462h.C69714l.m101134b(r4)
            com.google.android.libraries.search.assistant.aa.b.b r4 = r1.f86733d
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r8)
            com.google.android.libraries.search.b.i.g r7 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97137fq
            com.google.android.libraries.search.b.i.a r7 = r7.mo40779c()
            r9 = 0
            j.a.c.c.a.ee r12 = com.google.android.libraries.search.assistant.p2486aa.p2490b.C32255a.m60036a(r2, r9)
            r4.mo38021b(r7, r2, r3, r12)
            com.google.android.libraries.search.assistant.aa.c.a.i r4 = r1.f86735f     // Catch:{ Exception -> 0x04fa, all -> 0x04f2 }
            r5.f86664a = r1     // Catch:{ Exception -> 0x04fa, all -> 0x04f2 }
            r5.f86665b = r2     // Catch:{ Exception -> 0x04fa, all -> 0x04f2 }
            r7 = r29
            r5.f86666c = r7     // Catch:{ Exception -> 0x04fa, all -> 0x04f2 }
            r5.f86671h = r3     // Catch:{ Exception -> 0x04fa, all -> 0x04f2 }
            r5.f86675l = r13     // Catch:{ Exception -> 0x04fa, all -> 0x04f2 }
            r9 = r30
            java.lang.Object r4 = r4.mo38036b(r2, r3, r9, r5)     // Catch:{ Exception -> 0x04fa, all -> 0x04f2 }
            if (r4 == r6) goto L_0x04f0
            r9 = r1
            r22 = r7
        L_0x010a:
            com.google.android.libraries.search.assistant.f.a.b r4 = (com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b) r4     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            r7 = r9
            com.google.android.libraries.search.assistant.aa.c.j r7 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.C32357j) r7     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            kotlinx.coroutines.aw r7 = r7.f86734e     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            com.google.android.libraries.search.assistant.aa.c.d r12 = new com.google.android.libraries.search.assistant.aa.c.d     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            r18 = r9
            com.google.android.libraries.search.assistant.aa.c.j r18 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.C32357j) r18     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            r20 = r2
            com.google.android.libraries.search.assistant.f.a.d.cq r20 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r20     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            r23 = 0
            r17 = r12
            r19 = r4
            r21 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            r13 = 3
            r14 = 0
            kotlinx.coroutines.be r7 = kotlinx.coroutines.C71803m.m105042c(r7, r14, r14, r12, r13)     // Catch:{ Exception -> 0x04e0, all -> 0x04dd }
            r12 = r9
            com.google.android.libraries.search.assistant.aa.c.j r12 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.C32357j) r12     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            kotlinx.coroutines.aw r12 = r12.f86734e     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            com.google.android.libraries.search.assistant.aa.c.e r13 = new com.google.android.libraries.search.assistant.aa.c.e     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            r14 = r9
            com.google.android.libraries.search.assistant.aa.c.j r14 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.C32357j) r14     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            r15 = r2
            com.google.android.libraries.search.assistant.f.a.d.cq r15 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r15     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            r10 = 0
            r13.<init>(r14, r15, r3, r10)     // Catch:{ Exception -> 0x04da, all -> 0x04d7 }
            r14 = 3
            kotlinx.coroutines.be r12 = kotlinx.coroutines.C71803m.m105042c(r12, r10, r10, r13, r14)     // Catch:{ Exception -> 0x04da, all -> 0x04d7 }
            r10 = r9
            com.google.android.libraries.search.assistant.aa.c.j r10 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.C32357j) r10     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            com.google.android.libraries.search.assistant.aa.c.a.a.i r10 = r10.f86737h     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            r5.f86664a = r9     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            r5.f86665b = r2     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            r5.f86666c = r4     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            r5.f86667d = r7     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            r5.f86668e = r12     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            r5.f86669f = r10     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            r5.f86670g = r2     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            r5.f86671h = r3     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            r5.f86672i = r3     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            r13 = 2
            r5.f86675l = r13     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            java.lang.Object r13 = r12.mo62825a(r5)     // Catch:{ Exception -> 0x04ea, all -> 0x04e3 }
            if (r13 == r6) goto L_0x04d5
            r15 = r2
            r14 = r4
            r4 = r13
            r2 = r3
            r13 = r12
            r12 = r9
            r9 = r10
            r10 = r15
        L_0x016a:
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x04d0, all -> 0x04c9 }
            r5.f86664a = r12     // Catch:{ Exception -> 0x04d0, all -> 0x04c9 }
            r5.f86665b = r15     // Catch:{ Exception -> 0x04d0, all -> 0x04c9 }
            r5.f86666c = r14     // Catch:{ Exception -> 0x04d0, all -> 0x04c9 }
            r5.f86667d = r13     // Catch:{ Exception -> 0x04d0, all -> 0x04c9 }
            r5.f86668e = r9     // Catch:{ Exception -> 0x04d0, all -> 0x04c9 }
            r5.f86669f = r10     // Catch:{ Exception -> 0x04d0, all -> 0x04c9 }
            r5.f86670g = r4     // Catch:{ Exception -> 0x04d0, all -> 0x04c9 }
            r5.f86671h = r3     // Catch:{ Exception -> 0x04d0, all -> 0x04c9 }
            r5.f86672i = r2     // Catch:{ Exception -> 0x04d0, all -> 0x04c9 }
            r1 = 3
            r5.f86675l = r1     // Catch:{ Exception -> 0x04d0, all -> 0x04c9 }
            java.lang.Object r1 = r7.mo62825a(r5)     // Catch:{ Exception -> 0x04d0, all -> 0x04c9 }
            if (r1 == r6) goto L_0x04c7
            r7 = r4
            r4 = r1
        L_0x0189:
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r8)     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            java.lang.String r1 = "locale"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r1)     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            java.lang.String r1 = "contextResults"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r1)     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            com.google.common.f.e r1 = com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a.C32288i.f86515a     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            r1.mo56378ag(r8, r11)     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            java.lang.String r17 = "Received locale: %s & ContextResults for keys: %s. SessionToken: %s; RequestId: %s"
            java.util.Set r8 = r4.keySet()     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            r22 = r6
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            r23 = r13
            r13 = 10
            r24 = r5
            int r5 = p5462h.p5463a.C69540x.m100804k(r8, r13)     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            java.util.Iterator r5 = r8.iterator()     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
        L_0x01c0:
            boolean r8 = r5.hasNext()     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            if (r8 == 0) goto L_0x01de
            java.lang.Object r8 = r5.next()     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            com.google.android.libraries.search.assistant.f.a.d.ar r8 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar) r8     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            java.lang.String r8 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g.m60429b(r8)     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            r6.add(r8)     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            goto L_0x01c0
        L_0x01d4:
            r0 = move-exception
        L_0x01d5:
            r1 = r0
            r4 = 0
            goto L_0x04cc
        L_0x01d9:
            r0 = move-exception
        L_0x01da:
            r1 = r0
            r4 = 0
            goto L_0x04d3
        L_0x01de:
            r5 = r10
            com.google.android.libraries.search.assistant.f.a.d.cq r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r5     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            java.lang.String r20 = com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s.m60951b(r5)     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            java.lang.Integer r21 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            com.google.common.f.n r5 = new com.google.common.f.n     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            r8 = 52573(0xcd5d, float:7.367E-41)
            r5.<init>(r8)     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            r1.mo56379ah(r5)     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            r16 = r1
            r18 = r7
            r19 = r6
            r16.mo56360M(r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            com.google.speech.j.a.az r1 = com.google.speech.p5218j.p5219a.C66722az.f181493f     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            com.google.speech.j.a.ay r1 = (com.google.speech.p5218j.p5219a.C66721ay) r1     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            java.lang.String r5 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r5)     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
        L_0x0212:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            if (r5 == 0) goto L_0x0297
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            java.lang.Object r6 = r5.getKey()     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            com.google.android.libraries.search.assistant.f.a.d.ar r6 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar) r6     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            com.google.android.libraries.search.assistant.f.a.d.aw r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw) r5     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            java.util.Map r8 = com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a.C32288i.f86516b     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            java.lang.Object r8 = r8.get(r6)     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            if (r8 != 0) goto L_0x0236
            h.a.am r8 = p5462h.p5463a.C69496am.f185918a     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
        L_0x0236:
            boolean r16 = r8.isEmpty()     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            if (r16 == 0) goto L_0x0270
            com.google.common.f.e r5 = com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a.C32288i.f86515a     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            com.google.common.f.x r5 = r5.mo56224b()     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            r5.mo56378ag(r8, r11)     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            java.lang.String r8 = "No converter defined for context %s. SessionToken: %s; RequestId: %s"
            java.lang.String r6 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g.m60429b(r6)     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            r16 = r10
            com.google.android.libraries.search.assistant.f.a.d.cq r16 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r16     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            java.lang.String r13 = com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s.m60951b(r16)     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            r28 = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            r29 = r14
            com.google.common.f.n r14 = new com.google.common.f.n     // Catch:{ Exception -> 0x01d9, all -> 0x01d4 }
            r30 = r12
            r12 = 52574(0xcd5e, float:7.3672E-41)
            r14.<init>(r12)     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            r5.mo56379ah(r14)     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            r5.mo56359L(r8, r6, r13, r4)     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            goto L_0x028d
        L_0x0270:
            r28 = r4
            r30 = r12
            r29 = r14
            java.util.Iterator r4 = r8.iterator()     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
        L_0x027a:
            boolean r6 = r4.hasNext()     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            if (r6 == 0) goto L_0x028d
            java.lang.Object r6 = r4.next()     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            com.google.android.libraries.search.assistant.aa.c.a.a.h r6 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a.C32287h) r6     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            r8 = r10
            com.google.android.libraries.search.assistant.f.a.d.cq r8 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r8     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            r6.mo38032b(r8, r2, r5, r1)     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            goto L_0x027a
        L_0x028d:
            r4 = r28
            r14 = r29
            r12 = r30
            r13 = 10
            goto L_0x0212
        L_0x0297:
            r30 = r12
            r29 = r14
            r4 = 45
            java.lang.String r4 = p5462h.p5483m.C69764m.m101232k(r7, r4)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.util.Locale r5 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.lang.String r4 = r4.toLowerCase(r5)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.lang.String r5 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.lang.String r5 = "en_sg"
            boolean r5 = p5462h.p5473f.p5475b.C69664n.m101066l(r4, r5)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            if (r5 == 0) goto L_0x02c1
            java.lang.String[] r4 = r9.f86519e     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            goto L_0x02ce
        L_0x02b7:
            r0 = move-exception
            r12 = r30
            goto L_0x01d5
        L_0x02bc:
            r0 = move-exception
            r12 = r30
            goto L_0x01da
        L_0x02c1:
            java.lang.String r5 = "ja_jp"
            boolean r4 = p5462h.p5473f.p5475b.C69664n.m101066l(r4, r5)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            if (r4 == 0) goto L_0x02cc
            java.lang.String[] r4 = r9.f86518d     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            goto L_0x02ce
        L_0x02cc:
            java.lang.String[] r4 = r9.f86517c     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
        L_0x02ce:
            java.lang.String r20 = "experiment-labels"
            int r5 = r4.length     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            r21 = r4
            java.lang.String[] r21 = (java.lang.String[]) r21     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            r16 = r10
            com.google.android.libraries.search.assistant.f.a.d.cq r16 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r16     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            r18 = 1
            r17 = r2
            r19 = r1
            com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a.C32289j.m60075d(r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.lang.String r2 = "builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            com.google.speech.j.a.az r1 = (com.google.speech.p5218j.p5219a.C66722az) r1     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            com.google.common.f.e r2 = f86730a     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            r4 = r2
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            r4.mo56378ag(r2, r11)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.lang.String r5 = "Converted ContextResults to RecognitionContext with %d features & %d contexts. SessionToken: %s; RequestId: %s"
            com.google.speech.j.a.at r2 = r1.f181497c     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            if (r2 != 0) goto L_0x0307
            com.google.speech.j.a.at r2 = com.google.speech.p5218j.p5219a.C66716at.f181484b     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
        L_0x0307:
            com.google.protobuf.dn r2 = r2.f181486a     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            int r2 = r2.size()     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.lang.Integer r6 = new java.lang.Integer     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            r6.<init>(r2)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            com.google.protobuf.cq r2 = r1.f181496b     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            int r2 = r2.size()     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.lang.Integer r7 = new java.lang.Integer     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            r7.<init>(r2)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            r2 = r15
            com.google.android.libraries.search.assistant.f.a.d.cq r2 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r2     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.lang.String r8 = com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s.m60951b(r2)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.lang.Integer r9 = new java.lang.Integer     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            r9.<init>(r3)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            com.google.common.f.n r2 = new com.google.common.f.n     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            r10 = 52533(0xcd35, float:7.3614E-41)
            r2.<init>(r10)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            r4.mo56379ah(r2)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            r4.mo56360M(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            r12 = r30
            com.google.android.libraries.search.assistant.aa.c.j r12 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.C32357j) r12     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            com.google.android.libraries.search.assistant.aa.b.a.c r2 = r12.f86738i     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            int r4 = com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32258c.f86485d     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.lang.String r4 = "recognitionContext"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r4)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            r4.<init>()     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            com.google.speech.j.a.at r5 = r1.f181497c     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            if (r5 != 0) goto L_0x034f
            com.google.speech.j.a.at r5 = com.google.speech.p5218j.p5219a.C66716at.f181484b     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
        L_0x034f:
            com.google.protobuf.dn r5 = r5.f181486a     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r5)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.lang.String r6 = "recognitionContext.features.featureMap"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            int r7 = r5.size()     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
        L_0x036b:
            boolean r7 = r5.hasNext()     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            if (r7 == 0) goto L_0x0399
            java.lang.Object r7 = r5.next()     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            java.lang.Object r8 = r7.getKey()     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            java.lang.String r9 = "it.key"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            java.lang.String r9 = "it.value"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r9)     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            com.google.speech.j.a.aq r7 = (com.google.speech.p5218j.p5219a.C66713aq) r7     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            int r7 = com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32256a.m60041d(r7)     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            h.i r7 = com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32256a.m60039b(r8, r7)     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            r6.add(r7)     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            goto L_0x036b
        L_0x0399:
            p5462h.p5463a.C69505av.m100877s(r4, r6)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            com.google.protobuf.cq r5 = r1.f181496b     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.lang.String r6 = "recognitionContext.contextList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            r6 = 10
            int r6 = p5462h.p5463a.C69540x.m100804k(r5, r6)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            int r6 = p5462h.p5463a.C69505av.m100860b(r6)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            r7 = 16
            if (r6 >= r7) goto L_0x03b3
            r6 = 16
        L_0x03b3:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
        L_0x03bc:
            boolean r6 = r5.hasNext()     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            if (r6 == 0) goto L_0x03e4
            java.lang.Object r6 = r5.next()     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            com.google.speech.j.a.ak r6 = (com.google.speech.p5218j.p5219a.C66707ak) r6     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            java.lang.String r8 = r6.f181463d     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            java.lang.String r9 = "it.name"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            java.lang.String r9 = "it"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r9)     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            int r6 = com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32256a.m60040c(r6)     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            h.i r6 = com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32256a.m60038a(r8, r6)     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            java.lang.Object r8 = r6.f186052a     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            java.lang.Object r6 = r6.f186053b     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            r7.put(r8, r6)     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            goto L_0x03bc
        L_0x03e4:
            r4.putAll(r7)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.lang.String r5 = "accessSession"
            r14 = r29
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r5)     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = r2.f86488c     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r6 = r5.readLock()     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            int r7 = r5.getWriteHoldCount()     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            r8 = 0
            if (r7 != 0) goto L_0x0400
            int r7 = r5.getReadHoldCount()     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            goto L_0x0401
        L_0x0400:
            r7 = 0
        L_0x0401:
            r9 = 0
        L_0x0402:
            if (r9 >= r7) goto L_0x040a
            r6.unlock()     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            int r9 = r9 + 1
            goto L_0x0402
        L_0x040a:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r5.writeLock()     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            r5.lock()     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            java.util.Queue r2 = r2.f86487b     // Catch:{ all -> 0x04a4 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x04a4 }
        L_0x0417:
            boolean r9 = r2.hasNext()     // Catch:{ all -> 0x04a4 }
            if (r9 == 0) goto L_0x0438
            java.lang.Object r9 = r2.next()     // Catch:{ all -> 0x0431 }
            r10 = r9
            com.google.android.libraries.search.assistant.aa.b.a.d r10 = (com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32259d) r10     // Catch:{ all -> 0x0431 }
            com.google.android.libraries.search.assistant.f.a.d.d r10 = r10.f86491a     // Catch:{ all -> 0x0431 }
            com.google.android.libraries.search.assistant.f.a.d.d r12 = r14.mo38179a()     // Catch:{ all -> 0x0431 }
            boolean r10 = p5462h.p5473f.p5475b.C69664n.m101066l(r10, r12)     // Catch:{ all -> 0x0431 }
            if (r10 == 0) goto L_0x0417
            goto L_0x0439
        L_0x0431:
            r0 = move-exception
            r12 = r30
            r1 = r0
            r4 = 0
            goto L_0x04a9
        L_0x0438:
            r9 = 0
        L_0x0439:
            com.google.android.libraries.search.assistant.aa.b.a.d r9 = (com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32259d) r9     // Catch:{ all -> 0x04a4 }
            if (r9 != 0) goto L_0x044d
        L_0x043d:
            if (r8 >= r7) goto L_0x0445
            r6.lock()     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            int r8 = r8 + 1
            goto L_0x043d
        L_0x0445:
            r5.unlock()     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
        L_0x0448:
            r12 = r30
            r5 = r24
            goto L_0x045e
        L_0x044d:
            java.util.Map r2 = r9.f86496f     // Catch:{ all -> 0x04a4 }
            r2.putAll(r4)     // Catch:{ all -> 0x04a4 }
        L_0x0452:
            if (r8 >= r7) goto L_0x045a
            r6.lock()     // Catch:{ Exception -> 0x02bc, all -> 0x02b7 }
            int r8 = r8 + 1
            goto L_0x0452
        L_0x045a:
            r5.unlock()     // Catch:{ Exception -> 0x04bd, all -> 0x04b9 }
            goto L_0x0448
        L_0x045e:
            r5.f86664a = r12     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            r5.f86665b = r15     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            r5.f86666c = r1     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            r2 = 0
            r5.f86667d = r2     // Catch:{ Exception -> 0x04a1, all -> 0x049e }
            r5.f86668e = r2     // Catch:{ Exception -> 0x04a1, all -> 0x049e }
            r5.f86669f = r2     // Catch:{ Exception -> 0x04a1, all -> 0x049e }
            r5.f86670g = r2     // Catch:{ Exception -> 0x04a1, all -> 0x049e }
            r5.f86671h = r3     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            r2 = 4
            r5.f86675l = r2     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            r13 = r23
            java.lang.Object r4 = r13.mo62825a(r5)     // Catch:{ Exception -> 0x04c4, all -> 0x04c1 }
            r2 = r22
            if (r4 == r2) goto L_0x049d
            r2 = r3
            r5 = r12
            r3 = r1
        L_0x047f:
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0497, all -> 0x0491 }
            com.google.android.libraries.search.assistant.aa.c.a r1 = new com.google.android.libraries.search.assistant.aa.c.a     // Catch:{ Exception -> 0x0497, all -> 0x0491 }
            r1.<init>(r4, r3)     // Catch:{ Exception -> 0x0497, all -> 0x0491 }
            com.google.android.libraries.search.assistant.aa.c.j r5 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.C32357j) r5
            com.google.android.libraries.search.assistant.aa.b.b r3 = r5.f86733d
            com.google.android.libraries.search.assistant.f.a.d.cq r15 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r15
            r4 = 0
            r3.mo38020a(r15, r2, r4)
            return r1
        L_0x0491:
            r0 = move-exception
            r4 = 0
            r1 = r0
            r3 = r2
            goto L_0x04f8
        L_0x0497:
            r0 = move-exception
            r4 = 0
            r1 = r0
            r3 = r2
            goto L_0x0500
        L_0x049d:
            return r2
        L_0x049e:
            r0 = move-exception
            r4 = r2
            goto L_0x04cb
        L_0x04a1:
            r0 = move-exception
            r4 = r2
            goto L_0x04d2
        L_0x04a4:
            r0 = move-exception
            r12 = r30
            r4 = 0
            r1 = r0
        L_0x04a9:
            if (r8 >= r7) goto L_0x04b1
            r6.lock()     // Catch:{ Exception -> 0x04b7, all -> 0x04b5 }
            int r8 = r8 + 1
            goto L_0x04a9
        L_0x04b1:
            r5.unlock()     // Catch:{ Exception -> 0x04b7, all -> 0x04b5 }
            throw r1     // Catch:{ Exception -> 0x04b7, all -> 0x04b5 }
        L_0x04b5:
            r0 = move-exception
            goto L_0x04cb
        L_0x04b7:
            r0 = move-exception
            goto L_0x04d2
        L_0x04b9:
            r0 = move-exception
            r12 = r30
            goto L_0x04c2
        L_0x04bd:
            r0 = move-exception
            r12 = r30
            goto L_0x04c5
        L_0x04c1:
            r0 = move-exception
        L_0x04c2:
            r4 = 0
            goto L_0x04cb
        L_0x04c4:
            r0 = move-exception
        L_0x04c5:
            r4 = 0
            goto L_0x04d2
        L_0x04c7:
            r2 = r6
            return r2
        L_0x04c9:
            r0 = move-exception
            r4 = 0
        L_0x04cb:
            r1 = r0
        L_0x04cc:
            r14 = r4
            r5 = r12
            goto L_0x0532
        L_0x04d0:
            r0 = move-exception
            r4 = 0
        L_0x04d2:
            r1 = r0
        L_0x04d3:
            r5 = r12
            goto L_0x0500
        L_0x04d5:
            r2 = r6
            return r2
        L_0x04d7:
            r0 = move-exception
            r4 = r10
            goto L_0x04e5
        L_0x04da:
            r0 = move-exception
            r4 = r10
            goto L_0x04ec
        L_0x04dd:
            r0 = move-exception
            r4 = r14
            goto L_0x04e5
        L_0x04e0:
            r0 = move-exception
            r4 = r14
            goto L_0x04ec
        L_0x04e3:
            r0 = move-exception
            r4 = 0
        L_0x04e5:
            r1 = r0
            r15 = r2
            r14 = r4
            r5 = r9
            goto L_0x0532
        L_0x04ea:
            r0 = move-exception
            r4 = 0
        L_0x04ec:
            r1 = r0
            r15 = r2
            r5 = r9
            goto L_0x0500
        L_0x04f0:
            r2 = r6
            return r2
        L_0x04f2:
            r0 = move-exception
            r4 = 0
            r1 = r0
            r5 = r26
            r15 = r2
        L_0x04f8:
            r14 = r4
            goto L_0x0532
        L_0x04fa:
            r0 = move-exception
            r4 = 0
            r1 = r0
            r5 = r26
            r15 = r2
        L_0x0500:
            com.google.common.f.e r2 = f86730a     // Catch:{ all -> 0x052f }
            com.google.common.f.x r2 = r2.mo56226d()     // Catch:{ all -> 0x052f }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x052f }
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x052f }
            r2.mo56378ag(r6, r11)     // Catch:{ all -> 0x052f }
            com.google.common.f.x r2 = r2.mo56382g(r1)     // Catch:{ all -> 0x052f }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x052f }
            java.lang.String r6 = "Fetching RecognitionContext failed. SessionToken: %s; RequestId: %s"
            r7 = r15
            com.google.android.libraries.search.assistant.f.a.d.cq r7 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r7     // Catch:{ all -> 0x052f }
            java.lang.String r7 = com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s.m60951b(r7)     // Catch:{ all -> 0x052f }
            com.google.common.f.n r8 = new com.google.common.f.n     // Catch:{ all -> 0x052f }
            r9 = 52534(0xcd36, float:7.3616E-41)
            r8.<init>(r9)     // Catch:{ all -> 0x052f }
            r2.mo56379ah(r8)     // Catch:{ all -> 0x052f }
            r2.mo56352E(r6, r7, r3)     // Catch:{ all -> 0x052f }
            throw r1     // Catch:{ all -> 0x052b }
        L_0x052b:
            r0 = move-exception
            r14 = r1
            r1 = r0
            goto L_0x0532
        L_0x052f:
            r0 = move-exception
            r1 = r0
            goto L_0x04f8
        L_0x0532:
            com.google.android.libraries.search.assistant.aa.c.j r5 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.C32357j) r5
            com.google.android.libraries.search.assistant.aa.b.b r2 = r5.f86733d
            com.google.android.libraries.search.assistant.f.a.d.cq r15 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r15
            r2.mo38020a(r15, r3, r14)
            goto L_0x053d
        L_0x053c:
            throw r1
        L_0x053d:
            goto L_0x053c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2486aa.p2492c.C32357j.mo38048c(com.google.android.libraries.search.assistant.f.a.d.cq, int, j$.time.Duration, boolean, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38043d(com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c.C32337f r12, p5462h.p5466c.C69577g r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.google.android.libraries.search.assistant.p2486aa.p2492c.C32353f
            if (r0 == 0) goto L_0x0013
            r0 = r13
            com.google.android.libraries.search.assistant.aa.c.f r0 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.C32353f) r0
            int r1 = r0.f86715f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f86715f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.aa.c.f r0 = new com.google.android.libraries.search.assistant.aa.c.f
            r0.<init>(r11, r13)
        L_0x0018:
            r6 = r0
            java.lang.Object r13 = r6.f86713d
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r6.f86715f
            java.lang.String r7 = "newBuilder()"
            r8 = 1
            java.lang.String r9 = "Sbcp"
            if (r1 == 0) goto L_0x003e
            if (r1 != r8) goto L_0x0036
            int r12 = r6.f86712c
            java.lang.Object r0 = r6.f86711b
            java.lang.Object r1 = r6.f86710a
            p5462h.C69714l.m101134b(r13)     // Catch:{ all -> 0x0033 }
            goto L_0x00d9
        L_0x0033:
            r13 = move-exception
            goto L_0x013f
        L_0x0036:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003e:
            p5462h.C69714l.m101134b(r13)
            com.google.android.libraries.search.assistant.f.a.d.cq r12 = r12.f86680a
            if (r12 != 0) goto L_0x0047
            com.google.android.libraries.search.assistant.f.a.d.cq r12 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq.f88059c
        L_0x0047:
            java.lang.String r13 = "request.sessionToken"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r13)
            boolean r13 = r11.f86739j
            if (r13 != 0) goto L_0x0085
            com.google.common.f.e r13 = f86730a
            com.google.common.f.x r13 = r13.mo56224b()
            com.google.common.f.c r13 = (com.google.common.p4526f.C59052c) r13
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r0, r9)
            java.lang.String r12 = com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s.m60951b(r12)
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 52538(0xcd3a, float:7.3621E-41)
            r0.<init>(r1)
            r13.mo56379ah(r0)
            java.lang.String r0 = "Returning empty response in fetchSpeechBiasingContext as SBCP is disabled. SessionToken: %s"
            r13.mo56389s(r0, r12)
            com.google.android.libraries.search.assistant.aa.c.c.h r12 = com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c.C32339h.f86681c
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.search.assistant.aa.c.c.g r12 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c.C32338g) r12
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r7)
            com.google.android.libraries.search.assistant.aa.c.c.b r12 = p5462h.p5473f.p5475b.C69664n.m101061g(r12, "builder")
            com.google.android.libraries.search.assistant.aa.c.c.h r12 = r12.mo38041a()
            return r12
        L_0x0085:
            java.util.concurrent.atomic.AtomicInteger r13 = r11.f86740k
            int r13 = r13.incrementAndGet()
            com.google.android.libraries.search.assistant.aa.b.b r1 = r11.f86733d
            java.lang.String r2 = "sessionToken"
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r2)
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97142fv
            com.google.android.libraries.search.b.i.a r2 = r2.mo40779c()
            r3 = 0
            j.a.c.c.a.ee r3 = com.google.android.libraries.search.assistant.p2486aa.p2490b.C32255a.m60036a(r12, r3)
            r1.mo38021b(r2, r12, r13, r3)
            com.google.common.f.e r1 = f86730a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r1.mo56378ag(r2, r9)
            java.lang.String r2 = com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s.m60951b(r12)
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 52535(0xcd37, float:7.3617E-41)
            r3.<init>(r4)
            r1.mo56379ah(r3)
            java.lang.String r3 = "fetchSpeechBiasingContext called with SessionToken: %s; RequestId: %s"
            r1.mo56352E(r3, r2, r13)
            j$.time.Duration r4 = r11.f86741l     // Catch:{ all -> 0x0139 }
            r6.f86710a = r11     // Catch:{ all -> 0x0139 }
            r6.f86711b = r12     // Catch:{ all -> 0x0139 }
            r6.f86712c = r13     // Catch:{ all -> 0x0139 }
            r6.f86715f = r8     // Catch:{ all -> 0x0139 }
            r5 = 0
            r1 = r11
            r2 = r12
            r3 = r13
            java.lang.Object r1 = r1.mo38048c(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0139 }
            if (r1 == r0) goto L_0x0138
            r0 = r12
            r12 = r13
            r13 = r1
            r1 = r11
        L_0x00d9:
            com.google.android.libraries.search.assistant.aa.c.a r13 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.C32261a) r13     // Catch:{ all -> 0x0033 }
            com.google.speech.j.a.az r13 = r13.f86500b     // Catch:{ all -> 0x0033 }
            r2 = r1
            com.google.android.libraries.search.assistant.aa.c.j r2 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.C32357j) r2     // Catch:{ all -> 0x0033 }
            com.google.android.libraries.search.assistant.aa.b.b r2 = r2.f86733d     // Catch:{ all -> 0x0033 }
            r3 = r0
            com.google.android.libraries.search.assistant.f.a.d.cq r3 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r3     // Catch:{ all -> 0x0033 }
            r2.mo38024e(r3, r12)     // Catch:{ all -> 0x0033 }
            com.google.android.libraries.search.assistant.aa.c.c.h r2 = com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c.C32339h.f86681c     // Catch:{ all -> 0x0033 }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x0033 }
            com.google.android.libraries.search.assistant.aa.c.c.g r2 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c.C32338g) r2     // Catch:{ all -> 0x0033 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r7)     // Catch:{ all -> 0x0033 }
            com.google.android.libraries.search.assistant.aa.c.c.b r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")     // Catch:{ all -> 0x0033 }
            java.lang.String r3 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r3)     // Catch:{ all -> 0x0033 }
            com.google.android.libraries.search.assistant.aa.c.c.g r3 = r2.f86676a     // Catch:{ all -> 0x0033 }
            r3.copyOnWrite()     // Catch:{ all -> 0x0033 }
            com.google.protobuf.bv r3 = r3.instance     // Catch:{ all -> 0x0033 }
            com.google.android.libraries.search.assistant.aa.c.c.h r3 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c.C32339h) r3     // Catch:{ all -> 0x0033 }
            r13.getClass()     // Catch:{ all -> 0x0033 }
            r3.f86684b = r13     // Catch:{ all -> 0x0033 }
            int r13 = r3.f86683a     // Catch:{ all -> 0x0033 }
            r13 = r13 | r8
            r3.f86683a = r13     // Catch:{ all -> 0x0033 }
            com.google.android.libraries.search.assistant.aa.c.c.h r13 = r2.mo38041a()     // Catch:{ all -> 0x0033 }
            com.google.common.f.e r2 = f86730a     // Catch:{ all -> 0x0033 }
            com.google.common.f.x r2 = r2.mo56224b()     // Catch:{ all -> 0x0033 }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x0033 }
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0033 }
            r2.mo56378ag(r3, r9)     // Catch:{ all -> 0x0033 }
            java.lang.String r3 = "fetchSpeechBiasingContext completed with SessionToken: %s; RequestId: %s"
            r4 = r0
            com.google.android.libraries.search.assistant.f.a.d.cq r4 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r4     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s.m60951b(r4)     // Catch:{ all -> 0x0033 }
            com.google.common.f.n r5 = new com.google.common.f.n     // Catch:{ all -> 0x0033 }
            r6 = 52536(0xcd38, float:7.3619E-41)
            r5.<init>(r6)     // Catch:{ all -> 0x0033 }
            r2.mo56379ah(r5)     // Catch:{ all -> 0x0033 }
            r2.mo56352E(r3, r4, r12)     // Catch:{ all -> 0x0033 }
            return r13
        L_0x0138:
            return r0
        L_0x0139:
            r0 = move-exception
            r1 = r11
            r10 = r0
            r0 = r12
            r12 = r13
            r13 = r10
        L_0x013f:
            com.google.common.f.e r2 = f86730a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r3, r9)
            com.google.common.f.x r2 = r2.mo56382g(r13)
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.android.libraries.search.assistant.f.a.d.cq r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r0
            java.lang.String r3 = com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s.m60951b(r0)
            com.google.common.f.n r4 = new com.google.common.f.n
            r5 = 52537(0xcd39, float:7.362E-41)
            r4.<init>(r5)
            r2.mo56379ah(r4)
            java.lang.String r4 = "fetchSpeechBiasingContext failed with SessionToken: %s; RequestId: %s"
            r2.mo56352E(r4, r3, r12)
            com.google.android.libraries.search.assistant.aa.c.j r1 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.C32357j) r1
            com.google.android.libraries.search.assistant.aa.b.b r1 = r1.f86733d
            r1.mo38024e(r0, r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2486aa.p2492c.C32357j.mo38043d(com.google.android.libraries.search.assistant.aa.c.c.f, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38044e(com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c.C32341j r19, p5462h.p5466c.C69577g r20) {
        /*
            r18 = this;
            r6 = r18
            r0 = r20
            boolean r1 = r0 instanceof com.google.android.libraries.search.assistant.p2486aa.p2492c.C32354g
            if (r1 == 0) goto L_0x0017
            r1 = r0
            com.google.android.libraries.search.assistant.aa.c.g r1 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.C32354g) r1
            int r2 = r1.f86721f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f86721f = r2
            goto L_0x001c
        L_0x0017:
            com.google.android.libraries.search.assistant.aa.c.g r1 = new com.google.android.libraries.search.assistant.aa.c.g
            r1.<init>(r6, r0)
        L_0x001c:
            r5 = r1
            java.lang.Object r0 = r5.f86719d
            h.c.a.a r7 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r5.f86721f
            java.lang.String r8 = "sessionToken"
            java.lang.String r9 = "newBuilder()"
            r2 = 1
            r10 = 0
            if (r1 == 0) goto L_0x0040
            if (r1 != r2) goto L_0x0038
            int r1 = r5.f86718c
            java.lang.Object r2 = r5.f86717b
            java.lang.Object r3 = r5.f86716a
            p5462h.C69714l.m101134b(r0)
            goto L_0x00a8
        L_0x0038:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0040:
            p5462h.C69714l.m101134b(r0)
            boolean r0 = r6.f86739j
            java.lang.String r1 = "Sbcp"
            if (r0 == 0) goto L_0x00f1
            r0 = r19
            com.google.android.libraries.search.assistant.f.a.d.cq r0 = r0.f86688a
            if (r0 != 0) goto L_0x0051
            com.google.android.libraries.search.assistant.f.a.d.cq r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq.f88059c
        L_0x0051:
            r11 = r0
            java.lang.String r0 = "request.sessionToken"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r6.f86740k
            int r12 = r0.incrementAndGet()
            com.google.android.libraries.search.assistant.aa.b.b r0 = r6.f86733d
            p5462h.p5473f.p5475b.C69664n.m101061g(r11, r8)
            com.google.android.libraries.search.b.i.g r3 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97135fo
            com.google.android.libraries.search.b.i.a r3 = r3.mo40779c()
            j.a.c.c.a.ee r4 = com.google.android.libraries.search.assistant.p2486aa.p2490b.C32255a.m60036a(r11, r10)
            r0.mo38021b(r3, r11, r12, r4)
            com.google.common.f.e r0 = f86730a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r3, r1)
            java.lang.String r1 = com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s.m60951b(r11)
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 52539(0xcd3b, float:7.3623E-41)
            r3.<init>(r4)
            r0.mo56379ah(r3)
            java.lang.String r3 = "registerSpeechBiasingContextSession called with SessionToken: %s; RequestId: %s"
            r0.mo56352E(r3, r1, r12)
            j$.time.Duration r3 = r6.f86742m
            r5.f86716a = r6
            r5.f86717b = r11
            r5.f86718c = r12
            r5.f86721f = r2
            r4 = 1
            r0 = r18
            r1 = r11
            r2 = r12
            java.lang.Object r0 = r0.mo38048c(r1, r2, r3, r4, r5)
            if (r0 == r7) goto L_0x00f0
            r3 = r6
            r2 = r11
            r1 = r12
        L_0x00a8:
            com.google.android.libraries.search.assistant.aa.c.a r0 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.C32261a) r0
            java.lang.String r14 = r0.f86499a
            com.google.speech.j.a.az r13 = r0.f86500b
            com.google.android.libraries.search.assistant.aa.c.j r3 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.C32357j) r3
            kotlinx.coroutines.aw r0 = r3.f86734e
            com.google.android.libraries.search.assistant.aa.c.i r4 = new com.google.android.libraries.search.assistant.aa.c.i
            r5 = r2
            com.google.android.libraries.search.assistant.f.a.d.cq r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq) r5
            r17 = 0
            r11 = r4
            r12 = r3
            r15 = r5
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r7 = 3
            kotlinx.coroutines.cp r0 = kotlinx.coroutines.C71803m.m105043d(r0, r10, r10, r4, r7)
            com.google.android.libraries.search.assistant.aa.c.h r4 = new com.google.android.libraries.search.assistant.aa.c.h
            r4.<init>(r5, r1, r3)
            r0.mo62873s(r4)
            com.google.android.libraries.search.assistant.aa.b.b r0 = r3.f86733d
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r8)
            com.google.android.libraries.search.b.i.g r2 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97141fu
            com.google.android.libraries.search.b.i.a r2 = r2.mo40779c()
            r0.mo38022c(r2, r5, r1, r10)
            com.google.android.libraries.search.assistant.aa.c.c.l r0 = com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c.C32343l.f86689a
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.search.assistant.aa.c.c.k r0 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c.C32342k) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)
            com.google.android.libraries.search.assistant.aa.c.c.d r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            com.google.android.libraries.search.assistant.aa.c.c.l r0 = r0.mo38042a()
            return r0
        L_0x00f0:
            return r7
        L_0x00f1:
            com.google.common.f.e r0 = f86730a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r1)
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 52540(0xcd3c, float:7.3624E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "Ignoring registerSpeechBiasingContextSession call as SBCP is disabled"
            r0.mo56386p(r1)
            com.google.android.libraries.search.assistant.aa.c.c.l r0 = com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c.C32343l.f86689a
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.search.assistant.aa.c.c.k r0 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c.C32342k) r0
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r9)
            com.google.android.libraries.search.assistant.aa.c.c.d r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r0, "builder")
            com.google.android.libraries.search.assistant.aa.c.c.l r0 = r0.mo38042a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2486aa.p2492c.C32357j.mo38044e(com.google.android.libraries.search.assistant.aa.c.c.j, h.c.g):java.lang.Object");
    }
}
