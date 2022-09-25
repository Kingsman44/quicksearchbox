package com.google.android.libraries.search.assistant.p2513e.p2514a;

import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.audio.encoding.LibOggOpusEncoder$encode$1", mo61344c = "LibOggOpusEncoder.kt", mo61345d = "invokeSuspend", mo61346e = {45, 55, 59, 59})
/* renamed from: com.google.android.libraries.search.assistant.e.a.j */
/* compiled from: PG */
final class C32573j extends C69572j implements C69630p {

    /* renamed from: a */
    Object f87225a;

    /* renamed from: b */
    int f87226b;

    /* renamed from: c */
    final /* synthetic */ C32574k f87227c;

    /* renamed from: d */
    final /* synthetic */ C71587n f87228d;

    /* renamed from: e */
    private /* synthetic */ Object f87229e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32573j(C32574k kVar, C71587n nVar, C69577g gVar) {
        super(2, gVar);
        this.f87227c = kVar;
        this.f87228d = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32573j) mo5194c((C71588o) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0093 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r10) {
        /*
            r9 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r9.f87226b
            java.lang.String r2 = "encoder.flushAndStop()"
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x0035
            if (r1 == r5) goto L_0x002d
            if (r1 == r4) goto L_0x0020
            if (r1 != r3) goto L_0x0017
            p5462h.C69714l.m101134b(r10)
            goto L_0x0094
        L_0x0017:
            java.lang.Object r0 = r9.f87229e
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            p5462h.C69714l.m101134b(r10)
            goto L_0x00b4
        L_0x0020:
            java.lang.Object r1 = r9.f87225a
            java.lang.Object r4 = r9.f87229e
            h.f.a.p r4 = (p5462h.p5473f.p5474a.C69630p) r4
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x002a }
            goto L_0x007e
        L_0x002a:
            r10 = move-exception
            goto L_0x009c
        L_0x002d:
            java.lang.Object r1 = r9.f87229e
            h.f.a.p r1 = (p5462h.p5473f.p5474a.C69630p) r1
            p5462h.C69714l.m101134b(r10)
            goto L_0x0054
        L_0x0035:
            p5462h.C69714l.m101134b(r10)
            java.lang.Object r10 = r9.f87229e
            kotlinx.coroutines.b.o r10 = (kotlinx.coroutines.p5574b.C71588o) r10
            com.google.android.libraries.search.assistant.e.a.i r1 = new com.google.android.libraries.search.assistant.e.a.i
            r1.<init>(r10, r6)
            com.google.android.libraries.search.assistant.e.a.k r10 = r9.f87227c
            r9.f87229e = r1
            r9.f87226b = r5
            h.c.o r5 = r10.f87233d
            com.google.android.libraries.search.assistant.e.a.g r7 = new com.google.android.libraries.search.assistant.e.a.g
            r7.<init>(r10, r6)
            java.lang.Object r10 = kotlinx.coroutines.C71803m.m105040a(r5, r7, r9)
            if (r10 == r0) goto L_0x00b5
        L_0x0054:
            com.google.audio.hearing.common.OggOpusEncoder r10 = (com.google.audio.hearing.common.OggOpusEncoder) r10
            com.google.android.libraries.search.assistant.e.a.k r5 = r9.f87227c
            com.google.android.libraries.search.assistant.e.a.d r5 = r5.f87231b
            int r7 = r5.f87210b
            r8 = 24000(0x5dc0, float:3.3631E-41)
            int r5 = r5.f87209a
            r10.mo54137b(r7, r8, r5)
            kotlinx.coroutines.b.n r5 = r9.f87228d     // Catch:{ all -> 0x0098 }
            r7 = 2048(0x800, float:2.87E-42)
            kotlinx.coroutines.b.n r5 = com.google.android.libraries.search.assistant.p2511d.C32546i.m60360a(r5, r7)     // Catch:{ all -> 0x0098 }
            com.google.android.libraries.search.assistant.e.a.h r7 = new com.google.android.libraries.search.assistant.e.a.h     // Catch:{ all -> 0x0098 }
            r7.<init>(r1, r10)     // Catch:{ all -> 0x0098 }
            r9.f87229e = r1     // Catch:{ all -> 0x0098 }
            r9.f87225a = r10     // Catch:{ all -> 0x0098 }
            r9.f87226b = r4     // Catch:{ all -> 0x0098 }
            java.lang.Object r4 = r5.mo38165mp(r7, r9)     // Catch:{ all -> 0x0098 }
            if (r4 == r0) goto L_0x0097
            r4 = r1
            r1 = r10
        L_0x007e:
            com.google.audio.hearing.common.OggOpusEncoder r1 = (com.google.audio.hearing.common.OggOpusEncoder) r1
            byte[] r10 = r1.mo54136a()
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r2)
            r9.f87229e = r6
            r9.f87225a = r6
            r9.f87226b = r3
            java.lang.Object r10 = r4.mo5192a(r10, r9)
            if (r10 != r0) goto L_0x0094
            return r0
        L_0x0094:
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        L_0x0097:
            return r0
        L_0x0098:
            r3 = move-exception
            r4 = r1
            r1 = r10
            r10 = r3
        L_0x009c:
            com.google.audio.hearing.common.OggOpusEncoder r1 = (com.google.audio.hearing.common.OggOpusEncoder) r1
            byte[] r1 = r1.mo54136a()
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            r9.f87229e = r10
            r9.f87225a = r6
            r2 = 4
            r9.f87226b = r2
            java.lang.Object r1 = r4.mo5192a(r1, r9)
            if (r1 != r0) goto L_0x00b3
            return r0
        L_0x00b3:
            r0 = r10
        L_0x00b4:
            throw r0
        L_0x00b5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2513e.p2514a.C32573j.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C32573j jVar = new C32573j(this.f87227c, this.f87228d, gVar);
        jVar.f87229e = obj;
        return jVar;
    }
}
