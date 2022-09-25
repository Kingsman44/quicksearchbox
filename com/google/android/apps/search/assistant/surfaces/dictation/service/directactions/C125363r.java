package com.google.android.apps.search.assistant.surfaces.dictation.service.directactions;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.DirectActionsContextImpl$start$1", mo61344c = "DirectActionsContextImpl.kt", mo61345d = "invokeSuspend", mo61346e = {195, 83, 85})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.r */
/* compiled from: PG */
public final class C125363r extends C69572j implements C69630p {

    /* renamed from: a */
    Object f345758a;

    /* renamed from: b */
    Object f345759b;

    /* renamed from: c */
    int f345760c;

    /* renamed from: d */
    final /* synthetic */ C125364s f345761d;

    /* renamed from: e */
    private /* synthetic */ Object f345762e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125363r(C125364s sVar, C69577g gVar) {
        super(2, gVar);
        this.f345761d = sVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125363r) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
        if (r11.mo106936d(r10) != r0) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009c, code lost:
        if (((kotlinx.coroutines.C71604be) r1.f186027a).mo62825a(r10) == r0) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009f, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a0, code lost:
        r4.mo63026c((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a3, code lost:
        throw r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r11 = (com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125365t.f345773a.mo56225c()).mo56382g(r11);
        r11.mo56379ah(new com.google.common.p4526f.C59094n(36545));
        r11.mo56386p("onDirectActionsInvalidated failed [SD]");
        r10.f345761d.mo106935c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:4:0x000e, B:20:0x0075] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r11) {
        /*
            r10 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r10.f345760c
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x002f
            if (r1 == r4) goto L_0x0021
            if (r1 == r3) goto L_0x0019
            p5462h.C69714l.m101134b(r11)     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            goto L_0x00ca
        L_0x0013:
            r11 = move-exception
            goto L_0x00c9
        L_0x0016:
            r11 = move-exception
            goto L_0x00a5
        L_0x0019:
            java.lang.Object r1 = r10.f345762e
            h.f.b.ae r1 = (p5462h.p5473f.p5475b.C69648ae) r1
            p5462h.C69714l.m101134b(r11)     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            goto L_0x0090
        L_0x0021:
            java.lang.Object r1 = r10.f345759b
            java.lang.Object r4 = r10.f345758a
            java.lang.Object r6 = r10.f345762e
            h.f.b.ae r6 = (p5462h.p5473f.p5475b.C69648ae) r6
            p5462h.C69714l.m101134b(r11)     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            r11 = r1
            r1 = r6
            goto L_0x0075
        L_0x002f:
            p5462h.C69714l.m101134b(r11)
            java.lang.Object r11 = r10.f345762e
            kotlinx.coroutines.aw r11 = (kotlinx.coroutines.C71422aw) r11
            h.f.b.ae r1 = new h.f.b.ae     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            r1.<init>()     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s r6 = r10.f345761d     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            kotlinx.coroutines.aw r7 = r6.f345763a     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.ab r8 = r6.f345764b     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.q r9 = new com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.q     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            r9.<init>(r11, r6)     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            com.google.common.util.concurrent.cx r11 = r8.mo39114b(r9)     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            java.lang.String r6 = "override fun start() {\n …xtImpl)\n      }\n    }\n  }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r6)     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.n r6 = new com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.n     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            r6.<init>(r11, r5)     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            kotlinx.coroutines.be r6 = kotlinx.coroutines.C71803m.m105042c(r7, r5, r5, r6, r2)     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.o r7 = new com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.o     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            r7.<init>(r11)     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            r6.mo62873s(r7)     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            r1.f186027a = r6     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s r11 = r10.f345761d     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            kotlinx.coroutines.j.b r6 = r11.f345765c     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            r10.f345762e = r1     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            r10.f345758a = r6     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            r10.f345759b = r11     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            r10.f345760c = r4     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            java.lang.Object r4 = r6.mo63025b(r5, r10)     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            if (r4 == r0) goto L_0x00a4
            r4 = r6
        L_0x0075:
            java.lang.Object r6 = r1.f186027a     // Catch:{ all -> 0x009f }
            kotlinx.coroutines.be r6 = (kotlinx.coroutines.C71604be) r6     // Catch:{ all -> 0x009f }
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s r11 = (com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125364s) r11     // Catch:{ all -> 0x009f }
            r11.f345766d = r6     // Catch:{ all -> 0x009f }
            r4.mo63026c(r5)     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s r11 = r10.f345761d     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            r10.f345762e = r1     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            r10.f345758a = r5     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            r10.f345759b = r5     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            r10.f345760c = r3     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            java.lang.Object r11 = r11.mo106936d(r10)     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            if (r11 == r0) goto L_0x009e
        L_0x0090:
            java.lang.Object r11 = r1.f186027a     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            kotlinx.coroutines.be r11 = (kotlinx.coroutines.C71604be) r11     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            r10.f345762e = r5     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            r10.f345760c = r2     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            java.lang.Object r11 = r11.mo62825a(r10)     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            if (r11 != r0) goto L_0x00ca
        L_0x009e:
            return r0
        L_0x009f:
            r11 = move-exception
            r4.mo63026c(r5)     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
            throw r11     // Catch:{ CancellationException -> 0x00ca, Exception -> 0x0016 }
        L_0x00a4:
            return r0
        L_0x00a5:
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125365t.f345773a     // Catch:{ all -> 0x0013 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0013 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0013 }
            com.google.common.f.x r11 = r0.mo56382g(r11)     // Catch:{ all -> 0x0013 }
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11     // Catch:{ all -> 0x0013 }
            java.lang.String r0 = "onDirectActionsInvalidated failed [SD]"
            com.google.common.f.n r1 = new com.google.common.f.n     // Catch:{ all -> 0x0013 }
            r2 = 36545(0x8ec1, float:5.121E-41)
            r1.<init>(r2)     // Catch:{ all -> 0x0013 }
            r11.mo56379ah(r1)     // Catch:{ all -> 0x0013 }
            r11.mo56386p(r0)     // Catch:{ all -> 0x0013 }
            com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.s r11 = r10.f345761d     // Catch:{ all -> 0x0013 }
            r11.mo106935c()     // Catch:{ all -> 0x0013 }
            goto L_0x00ca
        L_0x00c9:
            throw r11
        L_0x00ca:
            h.q r11 = p5462h.C69788q.f186170a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.directactions.C125363r.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C125363r rVar = new C125363r(this.f345761d, gVar);
        rVar.f345762e = obj;
        return rVar;
    }
}
