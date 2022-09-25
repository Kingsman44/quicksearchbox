package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b;

import kotlinx.coroutines.p5573a.C71360an;
import kotlinx.coroutines.p5573a.C71361ao;
import kotlinx.coroutines.p5574b.C71486aq;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71594u;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69648ae;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.audio.focus.service.AudioFocusInternalServiceImpl$createAudioFocusStreaming$1", mo61344c = "AudioFocusInternalServiceImpl.kt", mo61345d = "invokeSuspend", mo61346e = {137})
/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.b.f */
/* compiled from: PG */
final class C33636f extends C69572j implements C69630p {

    /* renamed from: a */
    int f89879a;

    /* renamed from: b */
    final /* synthetic */ C71587n f89880b;

    /* renamed from: c */
    final /* synthetic */ C33638h f89881c;

    /* renamed from: d */
    private /* synthetic */ Object f89882d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33636f(C71587n nVar, C33638h hVar, C69577g gVar) {
        super(2, gVar);
        this.f89880b = nVar;
        this.f89881c = hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: com.google.android.libraries.search.assistant.invocation.d.a.b.b.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: com.google.android.libraries.search.assistant.invocation.d.a.b.b.d} */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008d, code lost:
        if (r14 != r1) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009d, code lost:
        if (r14 == r1) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a2, code lost:
        return r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m62221e(p5462h.p5473f.p5475b.C69648ae r10, com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.C33638h r11, kotlinx.coroutines.p5573a.C71361ao r12, com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33610d r13, p5462h.p5466c.C69577g r14) {
        /*
            boolean r0 = r14 instanceof com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.C33634d
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.google.android.libraries.search.assistant.invocation.d.a.b.d r0 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.C33634d) r0
            int r1 = r0.f89875f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f89875f = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.d.a.b.d r0 = new com.google.android.libraries.search.assistant.invocation.d.a.b.d
            r0.<init>(r14)
        L_0x0018:
            java.lang.Object r14 = r0.f89874e
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f89875f
            r3 = 4
            r4 = 2
            java.lang.String r5 = "request.invocationToken"
            r6 = 3
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L_0x0067
            if (r2 == r7) goto L_0x005a
            if (r2 == r4) goto L_0x004b
            if (r2 == r6) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            java.lang.Object r10 = r0.f89873d
            java.lang.Object r11 = r0.f89872c
            com.google.android.apps.search.assistant.platform.j.b.b.b.a r11 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121740a) r11
            java.lang.Object r12 = r0.f89871b
            java.lang.Object r13 = r0.f89870a
            p5462h.C69714l.m101134b(r14)
            goto L_0x020b
        L_0x003e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0046:
            p5462h.C69714l.m101134b(r14)
            goto L_0x0124
        L_0x004b:
            java.lang.Object r10 = r0.f89872c
            r13 = r10
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.d r13 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33610d) r13
            java.lang.Object r12 = r0.f89871b
            java.lang.Object r11 = r0.f89870a
            p5462h.C69714l.m101134b(r14)     // Catch:{ all -> 0x0058 }
            goto L_0x009f
        L_0x0058:
            r10 = move-exception
            goto L_0x00a3
        L_0x005a:
            java.lang.Object r10 = r0.f89872c
            r13 = r10
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.d r13 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33610d) r13
            java.lang.Object r12 = r0.f89871b
            java.lang.Object r11 = r0.f89870a
            p5462h.C69714l.m101134b(r14)     // Catch:{ all -> 0x0058 }
            goto L_0x008f
        L_0x0067:
            p5462h.C69714l.m101134b(r14)
            com.google.android.libraries.search.assistant.invocation.o.a.bp r14 = r13.f89829a
            if (r14 != 0) goto L_0x0070
            com.google.android.libraries.search.assistant.invocation.o.a.bp r14 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x0070:
            r10.f186027a = r14
            com.google.android.apps.search.assistant.platform.j.b.a.a.ar r10 = r11.f89890c
            com.google.android.libraries.search.assistant.invocation.o.a.bp r14 = r13.f89829a
            if (r14 != 0) goto L_0x007a
            com.google.android.libraries.search.assistant.invocation.o.a.bp r14 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x007a:
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r5)
            com.google.android.apps.search.assistant.platform.j.b.a.a.aq r10 = r10.mo105297a(r14)
            r0.f89870a = r11     // Catch:{ all -> 0x0058 }
            r0.f89871b = r12     // Catch:{ all -> 0x0058 }
            r0.f89872c = r13     // Catch:{ all -> 0x0058 }
            r0.f89875f = r7     // Catch:{ all -> 0x0058 }
            java.lang.Object r14 = r10.mo105295b(r0)     // Catch:{ all -> 0x0058 }
            if (r14 == r1) goto L_0x00a2
        L_0x008f:
            com.google.android.apps.search.assistant.platform.j.b.b.b.j r14 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121749j) r14     // Catch:{ all -> 0x0058 }
            r0.f89870a = r11     // Catch:{ all -> 0x0058 }
            r0.f89871b = r12     // Catch:{ all -> 0x0058 }
            r0.f89872c = r13     // Catch:{ all -> 0x0058 }
            r0.f89875f = r4     // Catch:{ all -> 0x0058 }
            java.lang.Object r14 = r14.mo105341c(r0)     // Catch:{ all -> 0x0058 }
            if (r14 == r1) goto L_0x00a2
        L_0x009f:
            com.google.android.apps.search.assistant.platform.j.b.b.b.a r14 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121740a) r14     // Catch:{ all -> 0x0058 }
            goto L_0x00a7
        L_0x00a2:
            return r1
        L_0x00a3:
            java.lang.Object r14 = p5462h.C69714l.m101133a(r10)
        L_0x00a7:
            java.lang.Throwable r10 = p5462h.C69702k.m101124a(r14)
            java.lang.String r2 = "newBuilder()"
            if (r10 == 0) goto L_0x0127
            com.google.common.f.e r14 = com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.C33638h.f89888a
            com.google.common.f.x r14 = r14.mo56226d()
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "INV.AudioFocus.Server"
            r14.mo56378ag(r3, r4)
            com.google.common.f.x r14 = r14.mo56382g(r10)
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14
            com.google.android.libraries.search.assistant.invocation.o.a.bp r13 = r13.f89829a
            if (r13 != 0) goto L_0x00ca
            com.google.android.libraries.search.assistant.invocation.o.a.bp r13 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x00ca:
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r5)
            com.google.frameworks.client.a.a.b r13 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r13)
            com.google.common.f.n r3 = new com.google.common.f.n
            r4 = 51243(0xc82b, float:7.1807E-41)
            r3.<init>(r4)
            r14.mo56379ah(r3)
            java.lang.String r3 = "A failure happens when getting the audio focus resource for acquiring audio focus. InvocationToken: %s."
            r14.mo56389s(r3, r13)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.r r13 = com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33624r.f89856c
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.q r13 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33623q) r13
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r2)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.al r13 = p5462h.p5473f.p5475b.C69664n.m101061g(r13, "builder")
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.h r14 = com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33614h.f89833c
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.g r14 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33613g) r14
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r2)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.b r14 = p5462h.p5473f.p5475b.C69664n.m101061g(r14, "builder")
            com.google.android.libraries.search.assistant.invocation.d.a.b.h r11 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.C33638h) r11
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.k r10 = r11.mo39009b(r10)
            r14.mo39007b(r10)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.h r10 = r14.mo39006a()
            r13.mo39004b(r10)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.r r10 = r13.mo39003a()
            r0.f89870a = r8
            r0.f89871b = r8
            r0.f89872c = r8
            r0.f89875f = r6
            kotlinx.coroutines.a.w r12 = (kotlinx.coroutines.p5573a.C71390w) r12
            java.lang.Object r10 = r12.mo62729v(r10, r0)
            if (r10 != r1) goto L_0x0124
            return r1
        L_0x0124:
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        L_0x0127:
            boolean r10 = r14 instanceof p5462h.C69692j
            if (r7 == r10) goto L_0x012c
            goto L_0x012d
        L_0x012c:
            r14 = r8
        L_0x012d:
            r10 = r14
            com.google.android.apps.search.assistant.platform.j.b.b.b.a r10 = (com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9245b.p9247b.C121740a) r10
            if (r10 != 0) goto L_0x0158
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            com.google.android.libraries.search.assistant.invocation.o.a.bp r11 = r13.f89829a
            if (r11 != 0) goto L_0x013a
            com.google.android.libraries.search.assistant.invocation.o.a.bp r11 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x013a:
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r5)
            com.google.frameworks.client.a.a.b r11 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Could not get AcquireAudioFocusStatus even when there is no failure. This should not happen. InvocationToken: "
            r12.<init>(r13)
            r12.append(r11)
            java.lang.String r11 = "."
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L_0x0158:
            com.google.android.libraries.search.c.ac r13 = r10.f337812a
            int r13 = r13.f99179b
            com.google.android.libraries.search.c.af r13 = com.google.android.libraries.search.p2904c.C37341af.m66350a(r13)
            if (r13 != 0) goto L_0x0164
            com.google.android.libraries.search.c.af r13 = com.google.android.libraries.search.p2904c.C37341af.UNKNOWN_ACQUIRING_STATUS
        L_0x0164:
            java.lang.String r14 = "acquireFocusResult.acqui…audioFocusAcquiringStatus"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r14)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.h r14 = com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33614h.f89833c
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.g r14 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33613g) r14
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r2)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.b r14 = p5462h.p5473f.p5475b.C69664n.m101061g(r14, "builder")
            com.google.android.libraries.search.c.af r4 = com.google.android.libraries.search.p2904c.C37341af.ACQUIRED
            if (r13 != r4) goto L_0x01ad
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.f r4 = com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33612f.f89831a
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.e r4 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33611e) r4
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r2)
            java.lang.String r5 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r5)
            com.google.protobuf.bv r4 = r4.build()
            java.lang.String r5 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.f r4 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33612f) r4
            java.lang.String r5 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r5)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.g r5 = r14.f89826a
            r5.copyOnWrite()
            com.google.protobuf.bv r5 = r5.instance
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.h r5 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33614h) r5
            r4.getClass()
            r5.f89836b = r4
            r5.f89835a = r7
            goto L_0x01d9
        L_0x01ad:
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.k r4 = com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33617k.f89844c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.i r4 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33615i) r4
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r2)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.ad r4 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")
            java.lang.String r5 = r13.name()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r7 = "AudioFocusAcquiringStatus: "
            java.lang.String r5 = r7.concat(r5)
            r4.mo38998b(r5)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.j r5 = com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33616j.EXCEPTION_FAILED_ACQUIRING_FOCUS
            r4.mo38999c(r5)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.k r4 = r4.mo38997a()
            r14.mo39007b(r4)
        L_0x01d9:
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.h r14 = r14.mo39006a()
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.r r4 = com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33624r.f89856c
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.q r4 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.p2608b.C33623q) r4
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r2)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.al r2 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")
            r2.mo39004b(r14)
            com.google.android.libraries.search.assistant.invocation.d.a.b.b.r r14 = r2.mo39003a()
            r0.f89870a = r11
            r0.f89871b = r12
            r0.f89872c = r10
            r0.f89873d = r13
            r0.f89875f = r3
            r2 = r12
            kotlinx.coroutines.a.w r2 = (kotlinx.coroutines.p5573a.C71390w) r2
            java.lang.Object r14 = r2.mo62729v(r14, r0)
            if (r14 != r1) goto L_0x0207
            return r1
        L_0x0207:
            r9 = r11
            r11 = r10
            r10 = r13
            r13 = r9
        L_0x020b:
            com.google.android.libraries.search.c.af r14 = com.google.android.libraries.search.p2904c.C37341af.ACQUIRED
            if (r10 != r14) goto L_0x021d
            com.google.android.libraries.search.assistant.invocation.d.a.b.h r13 = (com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.C33638h) r13
            kotlinx.coroutines.aw r10 = r13.f89889b
            com.google.android.libraries.search.assistant.invocation.d.a.b.e r13 = new com.google.android.libraries.search.assistant.invocation.d.a.b.e
            kotlinx.coroutines.a.ao r12 = (kotlinx.coroutines.p5573a.C71361ao) r12
            r13.<init>(r11, r12, r8)
            kotlinx.coroutines.C71803m.m105043d(r10, r8, r8, r13, r6)
        L_0x021d:
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b.C33636f.m62221e(h.f.b.ae, com.google.android.libraries.search.assistant.invocation.d.a.b.h, kotlinx.coroutines.a.ao, com.google.android.libraries.search.assistant.invocation.d.a.b.b.d, h.c.g):java.lang.Object");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C33636f) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f89879a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar = (C71361ao) this.f89882d;
            C69648ae aeVar = new C69648ae();
            C71594u.m104517d(C71486aq.m104308b(C71536cm.m104384b(this.f89880b, new C33590a(aeVar, this.f89881c, aoVar, (C69577g) null)), new C33592b(aeVar, (C69577g) null)), aoVar);
            C33633c cVar = new C33633c(aeVar);
            this.f89879a = 1;
            if (C71360an.m104022a(aoVar, cVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C33636f fVar = new C33636f(this.f89880b, this.f89881c, gVar);
        fVar.f89882d = obj;
        return fVar;
    }
}
