package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.ondevice.streaming.impl.SodaSession$runSpeechRecognition$job$1", mo61344c = "SodaSession.kt", mo61345d = "invokeSuspend", mo61346e = {55, 56, 57, 58})
/* renamed from: com.google.android.apps.search.assistant.platform.f.j.c.a.q */
/* compiled from: PG */
final class C120742q extends C69572j implements C69630p {

    /* renamed from: a */
    int f335830a;

    /* renamed from: b */
    final /* synthetic */ C120749x f335831b;

    /* renamed from: c */
    private /* synthetic */ Object f335832c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120742q(C120749x xVar, C69577g gVar) {
        super(2, gVar);
        this.f335831b = xVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120742q) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r9 != r0) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        if (r4.mo104913b(r1, r9, r8) == r0) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        if (r9.mo104912a(r1, r8) == r0) goto L_0x008f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r8.f335830a
            java.lang.String r2 = "audioInputSession"
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x002c
            if (r1 == r5) goto L_0x0026
            if (r1 == r4) goto L_0x001e
            if (r1 == r3) goto L_0x0016
            p5462h.C69714l.m101134b(r9)     // Catch:{ CancellationException -> 0x002a }
            goto L_0x00aa
        L_0x0016:
            java.lang.Object r1 = r8.f335832c
            com.google.android.apps.search.assistant.platform.f.b.h r1 = (com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120511h) r1
            p5462h.C69714l.m101134b(r9)     // Catch:{ CancellationException -> 0x002a }
            goto L_0x007e
        L_0x001e:
            java.lang.Object r1 = r8.f335832c
            com.google.android.apps.search.assistant.platform.f.b.h r1 = (com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120511h) r1
            p5462h.C69714l.m101134b(r9)     // Catch:{ CancellationException -> 0x002a }
            goto L_0x0068
        L_0x0026:
            p5462h.C69714l.m101134b(r9)     // Catch:{ CancellationException -> 0x002a }
            goto L_0x004c
        L_0x002a:
            r9 = move-exception
            goto L_0x0090
        L_0x002c:
            p5462h.C69714l.m101134b(r9)
            java.lang.Object r9 = r8.f335832c
            kotlinx.coroutines.aw r9 = (kotlinx.coroutines.C71422aw) r9
            com.google.android.apps.search.assistant.platform.f.j.c.a.x r1 = r8.f335831b     // Catch:{ CancellationException -> 0x002a }
            com.google.android.apps.search.assistant.platform.f.b.e r1 = r1.f335853d     // Catch:{ CancellationException -> 0x002a }
            com.google.apps.tiktok.tracing.contrib.b.c r1 = r1.mo104774a()     // Catch:{ CancellationException -> 0x002a }
            java.lang.String r6 = "audioInput.open()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r6)     // Catch:{ CancellationException -> 0x002a }
            kotlinx.coroutines.be r9 = com.google.android.libraries.search.assistant.p2511d.C32550m.m60364a(r1, r9)     // Catch:{ CancellationException -> 0x002a }
            r8.f335830a = r5     // Catch:{ CancellationException -> 0x002a }
            java.lang.Object r9 = r9.mo62825a(r8)     // Catch:{ CancellationException -> 0x002a }
            if (r9 == r0) goto L_0x008f
        L_0x004c:
            com.google.android.apps.search.assistant.platform.f.b.h r9 = (com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120511h) r9     // Catch:{ CancellationException -> 0x002a }
            com.google.android.apps.search.assistant.platform.f.j.c.a.x r1 = r8.f335831b     // Catch:{ CancellationException -> 0x002a }
            com.google.android.apps.search.assistant.platform.f.h.a r1 = r1.f335852c     // Catch:{ CancellationException -> 0x002a }
            com.google.common.util.concurrent.cx r1 = r1.mo104903b()     // Catch:{ CancellationException -> 0x002a }
            java.lang.String r5 = "localeProvider.localeLanguageCode()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r5)     // Catch:{ CancellationException -> 0x002a }
            r8.f335832c = r9     // Catch:{ CancellationException -> 0x002a }
            r8.f335830a = r4     // Catch:{ CancellationException -> 0x002a }
            java.lang.Object r1 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r8)     // Catch:{ CancellationException -> 0x002a }
            if (r1 == r0) goto L_0x008f
            r7 = r1
            r1 = r9
            r9 = r7
        L_0x0068:
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ CancellationException -> 0x002a }
            com.google.android.apps.search.assistant.platform.f.j.c.a.x r4 = r8.f335831b     // Catch:{ CancellationException -> 0x002a }
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)     // Catch:{ CancellationException -> 0x002a }
            java.lang.String r5 = "locale"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r5)     // Catch:{ CancellationException -> 0x002a }
            r8.f335832c = r1     // Catch:{ CancellationException -> 0x002a }
            r8.f335830a = r3     // Catch:{ CancellationException -> 0x002a }
            java.lang.Object r9 = r4.mo104913b(r1, r9, r8)     // Catch:{ CancellationException -> 0x002a }
            if (r9 == r0) goto L_0x008f
        L_0x007e:
            com.google.android.apps.search.assistant.platform.f.j.c.a.x r9 = r8.f335831b     // Catch:{ CancellationException -> 0x002a }
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)     // Catch:{ CancellationException -> 0x002a }
            r2 = 0
            r8.f335832c = r2     // Catch:{ CancellationException -> 0x002a }
            r2 = 4
            r8.f335830a = r2     // Catch:{ CancellationException -> 0x002a }
            java.lang.Object r9 = r9.mo104912a(r1, r8)     // Catch:{ CancellationException -> 0x002a }
            if (r9 != r0) goto L_0x00aa
        L_0x008f:
            return r0
        L_0x0090:
            com.google.android.apps.search.assistant.platform.f.j.c.a.x r0 = r8.f335831b
            com.google.common.f.e r0 = r0.f335854e
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.n r1 = new com.google.common.f.n
            r2 = 35578(0x8afa, float:4.9855E-41)
            r1.<init>(r2)
            r0.mo56379ah(r1)
            java.lang.String r1 = "Speech recognizer cancelled: %s"
            r0.mo56389s(r1, r9)
        L_0x00aa:
            h.q r9 = p5462h.C69788q.f186170a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.p9119a.C120742q.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120742q qVar = new C120742q(this.f335831b, gVar);
        qVar.f335832c = obj;
        return qVar;
    }
}
