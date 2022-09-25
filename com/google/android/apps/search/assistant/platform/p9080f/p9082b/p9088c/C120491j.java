package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119906y;
import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.impl.AudioInputImpl$runAudioFocus$2", mo61344c = "AudioInputImpl.kt", mo61345d = "invokeSuspend", mo61346e = {146, 167})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.c.j */
/* compiled from: PG */
final class C120491j extends C69572j implements C69630p {

    /* renamed from: a */
    int f335095a;

    /* renamed from: b */
    final /* synthetic */ C120498q f335096b;

    /* renamed from: c */
    final /* synthetic */ C119906y f335097c;

    /* renamed from: d */
    final /* synthetic */ C32534ai f335098d;

    /* renamed from: e */
    private /* synthetic */ Object f335099e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120491j(C120498q qVar, C119906y yVar, C32534ai aiVar, C69577g gVar) {
        super(2, gVar);
        this.f335096b = qVar;
        this.f335097c = yVar;
        this.f335098d = aiVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120491j) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlinx.coroutines.aw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0095  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r7) {
        /*
            r6 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r6.f335095a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001d
            if (r1 == r2) goto L_0x0013
            java.lang.Object r0 = r6.f335099e
            com.google.android.apps.search.assistant.platform.f.b.b.a r0 = (com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.C120421a) r0
            p5462h.C69714l.m101134b(r7)
            goto L_0x0093
        L_0x0013:
            java.lang.Object r1 = r6.f335099e
            kotlinx.coroutines.aw r1 = (kotlinx.coroutines.C71422aw) r1
            p5462h.C69714l.m101134b(r7)     // Catch:{ all -> 0x001b }
            goto L_0x0046
        L_0x001b:
            r7 = move-exception
            goto L_0x004a
        L_0x001d:
            p5462h.C69714l.m101134b(r7)
            java.lang.Object r7 = r6.f335099e
            r1 = r7
            kotlinx.coroutines.aw r1 = (kotlinx.coroutines.C71422aw) r1
            com.google.android.apps.search.assistant.platform.f.b.c.q r7 = r6.f335096b     // Catch:{ all -> 0x001b }
            g.a.a r7 = r7.f335125g     // Catch:{ all -> 0x001b }
            java.lang.Object r7 = r7.mo17428b()     // Catch:{ all -> 0x001b }
            com.google.android.apps.search.assistant.platform.f.b.b.b r7 = (com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.C120479b) r7     // Catch:{ all -> 0x001b }
            com.google.apps.tiktok.tracing.contrib.b.c r7 = r7.mo104761a()     // Catch:{ all -> 0x001b }
            java.lang.String r4 = "focusPolicy.get().acquireMicFocus()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r4)     // Catch:{ all -> 0x001b }
            kotlinx.coroutines.be r7 = com.google.android.libraries.search.assistant.p2511d.C32550m.m60364a(r7, r1)     // Catch:{ all -> 0x001b }
            r6.f335099e = r1     // Catch:{ all -> 0x001b }
            r6.f335095a = r2     // Catch:{ all -> 0x001b }
            java.lang.Object r7 = r7.mo62825a(r6)     // Catch:{ all -> 0x001b }
            if (r7 == r0) goto L_0x0049
        L_0x0046:
            com.google.android.apps.search.assistant.platform.f.b.b.a r7 = (com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.C120421a) r7     // Catch:{ all -> 0x001b }
            goto L_0x0076
        L_0x0049:
            return r0
        L_0x004a:
            com.google.android.apps.search.assistant.platform.b.a.d.y r2 = r6.f335097c
            boolean r2 = r2.f333917c
            if (r2 == 0) goto L_0x009c
            com.google.common.f.e r2 = com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c.C120498q.f335119a
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "ConvEngine.Audio"
            r2.mo56378ag(r4, r5)
            com.google.common.f.x r7 = r2.mo56382g(r7)
            com.google.common.f.c r7 = (com.google.common.p4526f.C59052c) r7
            com.google.common.f.n r2 = new com.google.common.f.n
            r4 = 35472(0x8a90, float:4.9707E-41)
            r2.<init>(r4)
            r7.mo56379ah(r2)
            java.lang.String r2 = "Audio Focus acquisition failure ignored"
            r7.mo56386p(r2)
            r7 = r3
        L_0x0076:
            com.google.android.apps.search.assistant.platform.f.b.c.i r2 = new com.google.android.apps.search.assistant.platform.f.b.c.i
            com.google.android.apps.search.assistant.platform.b.a.d.y r4 = r6.f335097c
            r2.<init>(r7, r4, r3)
            r4 = 3
            kotlinx.coroutines.C71803m.m105043d(r1, r3, r3, r2, r4)
            com.google.android.libraries.search.assistant.d.ai r1 = r6.f335098d
            com.google.common.util.concurrent.cx r1 = r1.mo38134b()
            r6.f335099e = r7
            r2 = 2
            r6.f335095a = r2
            java.lang.Object r1 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r6)
            if (r1 == r0) goto L_0x009b
            r0 = r7
        L_0x0093:
            if (r0 == 0) goto L_0x0098
            r0.close()
        L_0x0098:
            h.q r7 = p5462h.C69788q.f186170a
            return r7
        L_0x009b:
            return r0
        L_0x009c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c.C120491j.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120491j jVar = new C120491j(this.f335096b, this.f335097c, this.f335098d, gVar);
        jVar.f335099e = obj;
        return jVar;
    }
}
