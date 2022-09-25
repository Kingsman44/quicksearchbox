package com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e.C125375ac;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125937z;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9474p.C126174c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126294ac;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126338o;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.h.aq */
/* compiled from: PG */
public final class C125777aq {

    /* renamed from: b */
    private static final C59071e f346641b = C59071e.m91331h();

    /* renamed from: a */
    public final C71422aw f346642a;

    /* renamed from: c */
    private final C125937z f346643c;

    /* renamed from: d */
    private final C126294ac f346644d;

    /* renamed from: e */
    private final boolean f346645e;

    /* renamed from: f */
    private final C125375ac f346646f;

    /* renamed from: g */
    private final C126338o f346647g;

    /* renamed from: h */
    private final C126174c f346648h;

    public C125777aq(C125937z zVar, C126294ac acVar, C71422aw awVar, boolean z, C125375ac acVar2, C126338o oVar, C126174c cVar) {
        C69664n.m101061g(zVar, "keyboardStateManager");
        C69664n.m101061g(acVar, "dictationStarter");
        C69664n.m101061g(awVar, "lighweightScope");
        C69664n.m101061g(acVar2, "dictationIdSequence");
        C69664n.m101061g(oVar, "defaultIdleTimeouts");
        C69664n.m101061g(cVar, "dictationLogger");
        this.f346643c = zVar;
        this.f346644d = acVar;
        this.f346642a = awVar;
        this.f346645e = z;
        this.f346646f = acVar2;
        this.f346647g = oVar;
        this.f346648h = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d4 A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0129 A[Catch:{ all -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0164 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107114a(com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125100ca r20, com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119297s r21, p3186j$.time.Duration r22, p5462h.p5466c.C69577g r23) {
        /*
            r19 = this;
            r1 = r19
            r0 = r23
            boolean r2 = r0 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125776ap
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.ap r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125776ap) r2
            int r3 = r2.f346640f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f346640f = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.ap r2 = new com.google.android.apps.search.assistant.surfaces.dictation.service.h.ap
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f346638d
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f346640f
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x004f
            if (r4 == r6) goto L_0x003f
            if (r4 != r5) goto L_0x0037
            long r3 = r2.f346637c
            java.lang.Object r2 = r2.f346635a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x0034 }
            goto L_0x0121
        L_0x0034:
            r0 = move-exception
            goto L_0x0169
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x003f:
            long r8 = r2.f346637c
            java.lang.Object r4 = r2.f346636b
            java.lang.Object r6 = r2.f346635a
            p5462h.C69714l.m101134b(r0)     // Catch:{ all -> 0x004a }
            goto L_0x00ca
        L_0x004a:
            r0 = move-exception
            r2 = r6
        L_0x004c:
            r3 = r8
            goto L_0x0169
        L_0x004f:
            p5462h.C69714l.m101134b(r0)
            com.google.android.apps.search.assistant.surfaces.dictation.service.e.ac r0 = r1.f346646f
            java.util.concurrent.atomic.AtomicLong r0 = r0.f345802a
            long r8 = r0.getAndIncrement()
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.z r0 = r1.f346643c
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.t r0 = r0.mo107202a()
            java.util.Locale r4 = r0.mo107188g()
            r10 = r20
            boolean r10 = r10.f345101a
            if (r10 == 0) goto L_0x006d
            com.google.android.apps.search.assistant.libraries.dictation.b.u r10 = com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119299u.STICKY
            goto L_0x006f
        L_0x006d:
            com.google.android.apps.search.assistant.libraries.dictation.b.u r10 = com.google.android.apps.search.assistant.libraries.dictation.p8961b.C119299u.DEFAULT
        L_0x006f:
            com.google.android.apps.search.assistant.surfaces.dictation.service.s.z r11 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126292aa.m206501h()
            r11.mo107547b(r8)
            r11.mo107549d(r4)
            r11.mo107550e(r10)
            com.google.android.apps.search.assistant.surfaces.dictation.service.s.o r4 = r1.f346647g
            j$.time.Duration r4 = r4.mo107564a(r10)
            r11.mo107548c(r4)
            r4 = r21
            r11.mo107551f(r4)
            com.google.android.apps.search.assistant.surfaces.dictation.service.s.aa r4 = r11.mo107546a()
            java.lang.String r10 = "builder()\n      .setDict…requester)\n      .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r10)
            com.google.android.apps.search.assistant.surfaces.dictation.service.p.c r11 = r1.f346648h
            long r12 = r4.mo107508a()
            com.google.android.apps.search.assistant.libraries.dictation.b.s r14 = r4.mo107509b()
            com.google.protos.f.b.b.a.i r16 = com.google.protos.p4985f.p4988b.p4990b.p4991a.C64730i.UNDEFINED
            com.google.android.apps.search.assistant.libraries.dictation.b.u r17 = r4.mo107510c()
            r18 = 0
            r15 = r22
            r11.mo107425x(r12, r14, r15, r16, r17, r18)
            boolean r10 = r1.f346645e     // Catch:{ all -> 0x0165 }
            if (r10 == 0) goto L_0x00fa
            r2.f346635a = r1     // Catch:{ all -> 0x0165 }
            r2.f346636b = r4     // Catch:{ all -> 0x0165 }
            r2.f346637c = r8     // Catch:{ all -> 0x0165 }
            r2.f346640f = r6     // Catch:{ all -> 0x0165 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.w r6 = r0.f347134a     // Catch:{ all -> 0x0165 }
            boolean r10 = r6.f347147b     // Catch:{ all -> 0x0165 }
            if (r10 != 0) goto L_0x00bf
            com.google.android.apps.search.assistant.surfaces.dictation.a.i r0 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i.NON_ELIGIBLE_KEYBOARD_NOT_VISIBLE     // Catch:{ all -> 0x0165 }
            goto L_0x00c7
        L_0x00bf:
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.o r0 = r0.f347135b     // Catch:{ all -> 0x0165 }
            com.google.android.apps.gsa.nga.api.a.af r6 = r6.f347148c     // Catch:{ all -> 0x0165 }
            java.lang.Object r0 = r0.mo107178m(r6, r2)     // Catch:{ all -> 0x0165 }
        L_0x00c7:
            if (r0 == r3) goto L_0x00f9
            r6 = r1
        L_0x00ca:
            com.google.android.apps.search.assistant.surfaces.dictation.a.i r0 = (com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i) r0     // Catch:{ all -> 0x004a }
            com.google.android.apps.search.assistant.surfaces.dictation.a.i r10 = com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125160i.ELIGIBLE     // Catch:{ all -> 0x004a }
            boolean r10 = r10.equals(r0)     // Catch:{ all -> 0x004a }
            if (r10 != 0) goto L_0x00fb
            com.google.common.f.e r2 = f346641b     // Catch:{ all -> 0x004a }
            com.google.common.f.x r2 = r2.mo56225c()     // Catch:{ all -> 0x004a }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x004a }
            java.lang.String r3 = "Eligibility check on dictation start failed with %s [SD]"
            com.google.frameworks.client.a.a.b r4 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126288a.m206490b(r0)     // Catch:{ all -> 0x004a }
            com.google.common.f.n r5 = new com.google.common.f.n     // Catch:{ all -> 0x004a }
            r10 = 36684(0x8f4c, float:5.1405E-41)
            r5.<init>(r10)     // Catch:{ all -> 0x004a }
            r2.mo56379ah(r5)     // Catch:{ all -> 0x004a }
            r2.mo56389s(r3, r4)     // Catch:{ all -> 0x004a }
            r2 = r6
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.aq r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125777aq) r2     // Catch:{ all -> 0x004a }
            com.google.android.apps.search.assistant.surfaces.dictation.service.p.c r2 = r2.f346648h     // Catch:{ all -> 0x004a }
            r2.mo107412k(r8, r0)     // Catch:{ all -> 0x004a }
            return r7
        L_0x00f9:
            return r3
        L_0x00fa:
            r6 = r1
        L_0x00fb:
            r0 = r6
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.aq r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125777aq) r0     // Catch:{ all -> 0x004a }
            com.google.android.apps.search.assistant.surfaces.dictation.service.s.ac r0 = r0.f346644d     // Catch:{ all -> 0x004a }
            com.google.android.apps.search.assistant.surfaces.dictation.service.s.ax r10 = new com.google.android.apps.search.assistant.surfaces.dictation.service.s.ax     // Catch:{ all -> 0x004a }
            r10.<init>()     // Catch:{ all -> 0x004a }
            com.google.android.apps.search.assistant.surfaces.dictation.service.s.aa r4 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126292aa) r4     // Catch:{ all -> 0x004a }
            r11 = 4
            com.google.common.util.concurrent.cx r0 = r0.mo106952d(r4, r11, r10)     // Catch:{ all -> 0x004a }
            java.lang.String r4 = "dictationStarter\n       …ntsListener()\n          )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r4)     // Catch:{ all -> 0x004a }
            r2.f346635a = r6     // Catch:{ all -> 0x004a }
            r2.f346636b = r7     // Catch:{ all -> 0x004a }
            r2.f346637c = r8     // Catch:{ all -> 0x004a }
            r2.f346640f = r5     // Catch:{ all -> 0x004a }
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r0, r2)     // Catch:{ all -> 0x004a }
            if (r0 == r3) goto L_0x0164
            r2 = r6
            r3 = r8
        L_0x0121:
            com.google.android.apps.search.assistant.surfaces.dictation.service.s.ab r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126293ab) r0     // Catch:{ all -> 0x0034 }
            boolean r5 = r0.mo107518e()     // Catch:{ all -> 0x0034 }
            if (r5 != 0) goto L_0x0157
            com.google.common.f.e r5 = f346641b     // Catch:{ all -> 0x0034 }
            com.google.common.f.x r5 = r5.mo56225c()     // Catch:{ all -> 0x0034 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0034 }
            java.lang.String r6 = "Failed to start dictation %s on request from the keyboard with: %s [SD]"
            java.lang.Long r8 = new java.lang.Long     // Catch:{ all -> 0x0034 }
            r8.<init>(r3)     // Catch:{ all -> 0x0034 }
            com.google.frameworks.client.a.a.b r8 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r8)     // Catch:{ all -> 0x0034 }
            com.google.protos.ad.a.a.a.a.b.a.a.a.a.a r9 = r0.mo107515a()     // Catch:{ all -> 0x0034 }
            java.lang.String r10 = "result.startStatus()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)     // Catch:{ all -> 0x0034 }
            com.google.frameworks.client.a.a.b r9 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126288a.m206493e(r9)     // Catch:{ all -> 0x0034 }
            com.google.common.f.n r10 = new com.google.common.f.n     // Catch:{ all -> 0x0034 }
            r11 = 36683(0x8f4b, float:5.1404E-41)
            r10.<init>(r11)     // Catch:{ all -> 0x0034 }
            r5.mo56379ah(r10)     // Catch:{ all -> 0x0034 }
            r5.mo56354G(r6, r8, r9)     // Catch:{ all -> 0x0034 }
        L_0x0157:
            r5 = r2
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.aq r5 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125777aq) r5     // Catch:{ all -> 0x0034 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.p.c r5 = r5.f346648h     // Catch:{ all -> 0x0034 }
            com.google.protos.ad.a.a.a.a.b.a.a.a.a.a r0 = r0.mo107515a()     // Catch:{ all -> 0x0034 }
            r5.mo107414m(r3, r0)     // Catch:{ all -> 0x0034 }
            return r7
        L_0x0164:
            return r3
        L_0x0165:
            r0 = move-exception
            r2 = r1
            goto L_0x004c
        L_0x0169:
            com.google.common.f.e r5 = f346641b
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.x r5 = r5.mo56382g(r0)
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r3)
            com.google.frameworks.client.a.a.b r6 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c.m206496a(r6)
            com.google.common.f.n r7 = new com.google.common.f.n
            r8 = 36682(0x8f4a, float:5.1402E-41)
            r7.<init>(r8)
            r5.mo56379ah(r7)
            java.lang.String r7 = "Failed to start dictation %s on request from the keyboard [SD]"
            r5.mo56389s(r7, r6)
            com.google.android.apps.search.assistant.surfaces.dictation.service.h.aq r2 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125777aq) r2
            com.google.android.apps.search.assistant.surfaces.dictation.service.p.c r2 = r2.f346648h
            com.google.protos.ad.a.a.a.a.b.a.a.a.a.a r5 = com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4767b.p4768a.p4769a.p4770a.p4771a.C63122a.FAILURE_UNCLASSIFIED_START_ERROR
            r2.mo107413l(r3, r5, r0)
            goto L_0x019b
        L_0x019a:
            throw r0
        L_0x019b:
            goto L_0x019a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125777aq.mo107114a(com.google.android.apps.search.assistant.surfaces.dictation.a.ca, com.google.android.apps.search.assistant.libraries.dictation.b.s, j$.time.Duration, h.c.g):java.lang.Object");
    }
}
