package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32805b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32839cg;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32840ch;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32842cj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32870p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.o */
/* compiled from: PG */
final class C32762o {

    /* renamed from: a */
    public final C32870p f87906a;

    /* renamed from: b */
    final /* synthetic */ C32607ac f87907b;

    public C32762o(C32607ac acVar, C32870p pVar) {
        this.f87907b = acVar;
        this.f87906a = pVar;
    }

    /* renamed from: a */
    public final C32840ch mo38285a(long j) {
        C32607ac acVar = this.f87907b;
        C32839cg cgVar = (C32839cg) C32840ch.f88047e.createBuilder();
        C69664n.m101060f(cgVar, "newBuilder()");
        C32842cj a = C69664n.m101061g(cgVar, "builder");
        a.mo38323b(acVar.f87311b);
        C32805b bVar = acVar.f87312c;
        C69664n.m101061g(bVar, "value");
        C32839cg cgVar2 = a.f88053a;
        cgVar2.copyOnWrite();
        C32840ch chVar = (C32840ch) cgVar2.instance;
        bVar.getClass();
        chVar.f88051c = bVar;
        chVar.f88049a |= 1;
        C32839cg cgVar3 = a.f88053a;
        cgVar3.copyOnWrite();
        ((C32840ch) cgVar3.instance).f88052d = j;
        return a.mo38322a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: com.google.android.libraries.search.assistant.f.a.d.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.libraries.search.assistant.f.a.d.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: com.google.android.libraries.search.assistant.f.a.d.y} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x013d A[Catch:{ all -> 0x01c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0163 A[Catch:{ all -> 0x01c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0169 A[Catch:{ all -> 0x01c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0177 A[Catch:{ all -> 0x01c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01c0 A[Catch:{ all -> 0x01c8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38286b(long r20, com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y r22, com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32871q r23, p5462h.p5466c.C69577g r24) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r0 = r22
            r4 = r24
            boolean r5 = r4 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32759l
            if (r5 == 0) goto L_0x001b
            r5 = r4
            com.google.android.libraries.search.assistant.f.a.b.l r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32759l) r5
            int r6 = r5.f87898g
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001b
            int r6 = r6 - r7
            r5.f87898g = r6
            goto L_0x0020
        L_0x001b:
            com.google.android.libraries.search.assistant.f.a.b.l r5 = new com.google.android.libraries.search.assistant.f.a.b.l
            r5.<init>(r1, r4)
        L_0x0020:
            java.lang.Object r4 = r5.f87896e
            h.c.a.a r6 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r7 = r5.f87898g
            r8 = 1
            if (r7 == 0) goto L_0x004a
            if (r7 != r8) goto L_0x0042
            long r2 = r5.f87895d
            java.lang.Object r0 = r5.f87894c
            java.lang.Object r6 = r5.f87893b
            java.lang.Object r5 = r5.f87892a
            p5462h.C69714l.m101134b(r4)     // Catch:{ all -> 0x003f }
            r18 = r4
            r4 = r0
            r0 = r6
            r6 = r5
            r5 = r18
            goto L_0x0128
        L_0x003f:
            r0 = move-exception
            goto L_0x01ce
        L_0x0042:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004a:
            p5462h.C69714l.m101134b(r4)
            com.google.android.libraries.search.assistant.f.a.b.ac r4 = r1.f87907b
            com.google.common.base.cz r4 = r4.f87315f
            com.google.common.base.ci r4 = com.google.common.base.C58872ci.m90947d(r4)
            com.google.android.libraries.search.assistant.f.a.b.ac r7 = r1.f87907b
            com.google.android.libraries.search.assistant.f.b.b r7 = r7.f87313d
            com.google.android.libraries.search.assistant.f.a.d.be r9 = r0.f88115b
            if (r9 != 0) goto L_0x005f
            com.google.android.libraries.search.assistant.f.a.d.be r9 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be.f87993c
        L_0x005f:
            com.google.android.libraries.search.assistant.f.a.d.ar r9 = r9.f87996b
            if (r9 != 0) goto L_0x0065
            com.google.android.libraries.search.assistant.f.a.d.ar r9 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar.f87973c
        L_0x0065:
            java.lang.String r10 = "consumerFetchRequest.fet…ContextRequest.contextKey"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)
            java.lang.String r10 = "contextKey"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r10)
            com.google.android.libraries.search.b.i.g r10 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97008dT
            com.google.net.a.a.b r11 = com.google.net.p4726a.p4727a.C62722b.OK
            com.google.android.libraries.search.b.i.a r10 = r10.mo40815i(r11)
            com.google.android.libraries.search.assistant.f.a.d.b r11 = r7.f88229b
            com.google.android.libraries.search.assistant.p2517f.p2532b.C32905a.m60898d(r10, r11, r2)
            com.google.protobuf.bt r11 = p5535j.p5536a.p5545c.p5548c.p5549a.C70985al.f189288h
            j.a.c.c.a.al r12 = p5535j.p5536a.p5545c.p5548c.p5549a.C70985al.f189287g
            com.google.protobuf.bn r12 = r12.createBuilder()
            j.a.c.c.a.ai r12 = (p5535j.p5536a.p5545c.p5548c.p5549a.C70982ai) r12
            java.lang.String r13 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r13)
            j.a.c.c.a.ah r12 = p5462h.p5473f.p5475b.C69664n.m101061g(r12, "builder")
            com.google.android.libraries.search.assistant.f.b.m r14 = com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s.f88258a
            j.a.a.b.a.n r9 = r14.mo38354a(r9)
            java.lang.String r14 = "convertToLogsContextKey(keyToFetch)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r14)
            java.lang.String r14 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r14)
            j.a.c.c.a.ai r14 = r12.f189277a
            r14.copyOnWrite()
            com.google.protobuf.bv r14 = r14.instance
            j.a.c.c.a.al r14 = (p5535j.p5536a.p5545c.p5548c.p5549a.C70985al) r14
            r9.getClass()
            r14.f189293d = r9
            int r9 = r14.f189290a
            r9 = r9 | 4
            r14.f189290a = r9
            j.a.c.c.a.al r9 = r12.mo62596a()
            r12 = r10
            com.google.android.libraries.search.b.i.b r12 = (com.google.android.libraries.search.p2871b.p2895i.C37253b) r12
            r12.mo40792p(r11, r9)
            com.google.android.libraries.search.b.b r9 = r7.f88228a
            r9.mo19974a(r10)
            r7.mo38346a()
            com.google.android.libraries.search.assistant.f.a.d.ag r7 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32785ag.f87957e
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.search.assistant.f.a.d.af r7 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32784af) r7
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r13)
            com.google.android.libraries.search.assistant.f.a.d.ai r7 = p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder")
            com.google.android.libraries.search.assistant.f.a.d.ch r9 = r19.mo38285a(r20)
            r7.mo38297d(r9)
            com.google.protobuf.bn r9 = r22.toBuilder()
            java.lang.String r10 = "this.toBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)
            com.google.android.libraries.search.assistant.f.a.d.x r9 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32878x) r9
            com.google.android.libraries.search.assistant.f.a.d.aa r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            com.google.android.libraries.search.assistant.f.a.d.x r10 = r9.f87949a
            com.google.protobuf.bv r11 = r10.instance
            com.google.android.libraries.search.assistant.f.a.d.y r11 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y) r11
            int r11 = r11.f88114a
            r11 = r11 & 2
            if (r11 != 0) goto L_0x0105
            r10.copyOnWrite()
            com.google.protobuf.bv r10 = r10.instance
            com.google.android.libraries.search.assistant.f.a.d.y r10 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y) r10
            int r11 = r10.f88114a
            r11 = r11 | 2
            r10.f88114a = r11
            r10.f88116c = r8
        L_0x0105:
            com.google.android.libraries.search.assistant.f.a.d.y r9 = r9.mo38289a()
            r7.mo38296c(r9)
            r9 = r23
            r7.mo38295b(r9)
            com.google.android.libraries.search.assistant.f.a.d.ag r7 = r7.mo38294a()
            com.google.android.libraries.search.assistant.f.a.d.p r9 = r1.f87906a     // Catch:{ all -> 0x01cc }
            r5.f87892a = r1     // Catch:{ all -> 0x01cc }
            r5.f87893b = r0     // Catch:{ all -> 0x01cc }
            r5.f87894c = r4     // Catch:{ all -> 0x01cc }
            r5.f87895d = r2     // Catch:{ all -> 0x01cc }
            r5.f87898g = r8     // Catch:{ all -> 0x01cc }
            java.lang.Object r5 = r9.mo38327b(r7, new p5488io.grpc.C70334de(), r5)     // Catch:{ all -> 0x01cc }
            if (r5 == r6) goto L_0x01cb
            r6 = r1
        L_0x0128:
            com.google.android.libraries.search.assistant.f.a.d.bp r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32821bp) r5     // Catch:{ all -> 0x01c8 }
            com.google.common.base.ci r4 = (com.google.common.base.C58872ci) r4     // Catch:{ all -> 0x01c8 }
            long r7 = r4.mo56159b()     // Catch:{ all -> 0x01c8 }
            j$.time.Duration r4 = p3186j$.time.Duration.ofNanos(r7)     // Catch:{ all -> 0x01c8 }
            java.lang.String r7 = "fetchStopwatch.elapsed()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r7)     // Catch:{ all -> 0x01c8 }
            com.google.protobuf.ar r7 = r5.f88018c     // Catch:{ all -> 0x01c8 }
            if (r7 != 0) goto L_0x013f
            com.google.protobuf.ar r7 = com.google.protobuf.C62910ar.f169858c     // Catch:{ all -> 0x01c8 }
        L_0x013f:
            java.lang.String r8 = "result.fetchDuration"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)     // Catch:{ all -> 0x01c8 }
            j$.time.Duration r7 = com.google.protobuf.p4750c.p4751a.C62949a.m95468c(r7)     // Catch:{ all -> 0x01c8 }
            j$.time.Duration r8 = r4.minus(r7)     // Catch:{ all -> 0x01c8 }
            com.google.common.f.e$a r9 = com.google.common.p4526f.C59071e.f157037b     // Catch:{ all -> 0x01c8 }
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x01c8 }
            r10 = r6
            com.google.android.libraries.search.assistant.f.a.b.o r10 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32762o) r10     // Catch:{ all -> 0x01c8 }
            com.google.android.libraries.search.assistant.f.a.b.ac r10 = r10.f87907b     // Catch:{ all -> 0x01c8 }
            java.util.List r10 = r10.f87318i     // Catch:{ all -> 0x01c8 }
            com.google.common.f.c r11 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32692dg.m60595a(r9, r10)     // Catch:{ all -> 0x01c8 }
            java.lang.String r12 = "Fetching %s from %s took %d ms (spent in provider: %d ms, Context API latency: %d ms)"
            com.google.android.libraries.search.assistant.f.a.d.y r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y) r0     // Catch:{ all -> 0x01c8 }
            com.google.android.libraries.search.assistant.f.a.d.be r0 = r0.f88115b     // Catch:{ all -> 0x01c8 }
            if (r0 != 0) goto L_0x0165
            com.google.android.libraries.search.assistant.f.a.d.be r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be.f87993c     // Catch:{ all -> 0x01c8 }
        L_0x0165:
            com.google.android.libraries.search.assistant.f.a.d.ar r0 = r0.f87996b     // Catch:{ all -> 0x01c8 }
            if (r0 != 0) goto L_0x016b
            com.google.android.libraries.search.assistant.f.a.d.ar r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar.f87973c     // Catch:{ all -> 0x01c8 }
        L_0x016b:
            java.lang.String r13 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g.m60429b(r0)     // Catch:{ all -> 0x01c8 }
            int r0 = r5.f88017b     // Catch:{ all -> 0x01c8 }
            com.google.android.libraries.search.assistant.f.a.d.bo r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32820bo.m60788a(r0)     // Catch:{ all -> 0x01c8 }
            if (r0 != 0) goto L_0x0179
            com.google.android.libraries.search.assistant.f.a.d.bo r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32820bo.UNRECOGNIZED     // Catch:{ all -> 0x01c8 }
        L_0x0179:
            java.lang.String r14 = r0.name()     // Catch:{ all -> 0x01c8 }
            long r9 = r4.toMillis()     // Catch:{ all -> 0x01c8 }
            java.lang.Long r15 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x01c8 }
            long r9 = r7.toMillis()     // Catch:{ all -> 0x01c8 }
            java.lang.Long r16 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x01c8 }
            long r9 = r8.toMillis()     // Catch:{ all -> 0x01c8 }
            java.lang.Long r17 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x01c8 }
            com.google.common.f.n r0 = new com.google.common.f.n     // Catch:{ all -> 0x01c8 }
            r4 = 50567(0xc587, float:7.086E-41)
            r0.<init>(r4)     // Catch:{ all -> 0x01c8 }
            r11.mo56379ah(r0)     // Catch:{ all -> 0x01c8 }
            r11.mo56361N(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x01c8 }
            r0 = r6
            com.google.android.libraries.search.assistant.f.a.b.o r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32762o) r0     // Catch:{ all -> 0x01c8 }
            com.google.android.libraries.search.assistant.f.a.b.ac r0 = r0.f87907b     // Catch:{ all -> 0x01c8 }
            kotlinx.coroutines.z r4 = r0.f87324o     // Catch:{ all -> 0x01c8 }
            com.google.android.libraries.search.assistant.f.a.b.n r7 = new com.google.android.libraries.search.assistant.f.a.b.n     // Catch:{ all -> 0x01c8 }
            r7.<init>(r0, r5, r8)     // Catch:{ all -> 0x01c8 }
            com.google.android.libraries.search.assistant.p2517f.p2532b.p2534b.C32922e.m60928a(r4, r7)     // Catch:{ all -> 0x01c8 }
            r0 = r6
            com.google.android.libraries.search.assistant.f.a.b.o r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32762o) r0     // Catch:{ all -> 0x01c8 }
            com.google.android.libraries.search.assistant.f.a.b.ac r0 = r0.f87907b     // Catch:{ all -> 0x01c8 }
            com.google.android.libraries.search.assistant.f.b.b r0 = r0.f87313d     // Catch:{ all -> 0x01c8 }
            r0.mo38350e(r2, r5)     // Catch:{ all -> 0x01c8 }
            com.google.android.libraries.search.assistant.f.a.d.aw r0 = r5.f88016a     // Catch:{ all -> 0x01c8 }
            if (r0 != 0) goto L_0x01c2
            com.google.android.libraries.search.assistant.f.a.d.aw r0 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw.f87978c     // Catch:{ all -> 0x01c8 }
        L_0x01c2:
            java.lang.String r4 = "{\n        val internalCo…ult.contextResult\n      }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r4)     // Catch:{ all -> 0x01c8 }
            return r0
        L_0x01c8:
            r0 = move-exception
            r5 = r6
            goto L_0x01ce
        L_0x01cb:
            return r6
        L_0x01cc:
            r0 = move-exception
            r5 = r1
        L_0x01ce:
            com.google.android.libraries.search.assistant.f.a.b.o r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32762o) r5
            com.google.android.libraries.search.assistant.f.a.b.ac r4 = r5.f87907b
            com.google.android.libraries.search.assistant.f.b.b r4 = r4.f87313d
            java.lang.Object r5 = p5462h.C69714l.m101133a(r0)
            r4.mo38350e(r2, r5)
            boolean r2 = r0 instanceof p5488io.grpc.StatusException
            if (r2 != 0) goto L_0x01e5
            boolean r2 = r0 instanceof p5488io.grpc.C70761fa
            if (r2 == 0) goto L_0x01e4
            goto L_0x01e5
        L_0x01e4:
            throw r0
        L_0x01e5:
            com.google.android.libraries.search.assistant.n.a.a.b r0 = com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d.m63595b(r0)
            com.google.android.libraries.search.assistant.n.a.e r0 = com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d.m63594a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32762o.mo38286b(long, com.google.android.libraries.search.assistant.f.a.d.y, com.google.android.libraries.search.assistant.f.a.d.q, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo38287c(long r5, p5462h.p5466c.C69577g r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32760m
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.google.android.libraries.search.assistant.f.a.b.m r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32760m) r0
            int r1 = r0.f87902d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87902d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.f.a.b.m r0 = new com.google.android.libraries.search.assistant.f.a.b.m
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f87900b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f87902d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r5 = r0.f87899a
            p5462h.C69714l.m101134b(r7)     // Catch:{ StatusException -> 0x0029 }
            goto L_0x0046
        L_0x0029:
            r6 = move-exception
            goto L_0x004b
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0033:
            p5462h.C69714l.m101134b(r7)
            com.google.android.libraries.search.assistant.f.a.d.p r7 = r4.f87906a     // Catch:{ StatusException -> 0x0048 }
            com.google.android.libraries.search.assistant.f.a.d.ch r5 = r4.mo38285a(r5)     // Catch:{ StatusException -> 0x0048 }
            r0.f87899a = r4     // Catch:{ StatusException -> 0x0048 }
            r0.f87902d = r3     // Catch:{ StatusException -> 0x0048 }
            java.lang.Object r7 = r7.mo38328c(r5, new p5488io.grpc.C70334de(), r0)     // Catch:{ StatusException -> 0x0048 }
            if (r7 == r1) goto L_0x0047
        L_0x0046:
            return r7
        L_0x0047:
            return r1
        L_0x0048:
            r5 = move-exception
            r6 = r5
            r5 = r4
        L_0x004b:
            io.grpc.Status r7 = r6.f186943a
            io.grpc.Status$Code r7 = r7.getCode()
            io.grpc.Status$Code r0 = p5488io.grpc.Status.Code.UNAVAILABLE
            if (r7 != r0) goto L_0x0060
            com.google.android.libraries.search.assistant.f.a.b.o r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32762o) r5
            com.google.android.libraries.search.assistant.f.a.b.ac r5 = r5.f87907b
            java.util.List r5 = r5.f87318i
            com.google.android.libraries.search.assistant.f.a.b.ce r5 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32662cd.m60553e(r5)
            throw r5
        L_0x0060:
            com.google.android.libraries.search.assistant.n.a.a.b r5 = com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d.m63595b(r6)
            com.google.android.libraries.search.assistant.n.a.e r5 = com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d.m63594a(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32762o.mo38287c(long, h.c.g):java.lang.Object");
    }
}
