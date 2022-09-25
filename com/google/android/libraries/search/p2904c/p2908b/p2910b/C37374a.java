package com.google.android.libraries.search.p2904c.p2908b.p2910b;

import com.google.android.libraries.search.p2904c.C37502di;
import com.google.android.libraries.search.p2904c.p2908b.C37363a;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.audioadapter.restricted.SodaAudioAdapterReader$read$2$session$1$1", mo61344c = "SodaAudioAdapterReader.kt", mo61345d = "invokeSuspend", mo61346e = {75, 82, 82})
/* renamed from: com.google.android.libraries.search.c.b.b.a */
/* compiled from: PG */
final class C37374a extends C69572j implements C69630p {

    /* renamed from: a */
    Object f99265a;

    /* renamed from: b */
    int f99266b;

    /* renamed from: c */
    final /* synthetic */ C37363a f99267c;

    /* renamed from: d */
    final /* synthetic */ C37378e f99268d;

    /* renamed from: e */
    final /* synthetic */ C37502di f99269e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37374a(C37363a aVar, C37378e eVar, C37502di diVar, C69577g gVar) {
        super(2, gVar);
        this.f99267c = aVar;
        this.f99268d = eVar;
        this.f99269e = diVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C37374a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r8.f99266b
            java.lang.String r2 = "#audio# Soda audio adapter didn't disconnect successfully."
            java.lang.String r3 = "adapter.disconnect(/* timedOut= */ false)"
            r4 = 0
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x0029
            if (r1 == r6) goto L_0x0022
            if (r1 == r5) goto L_0x001a
            java.lang.Object r0 = r8.f99265a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            p5462h.C69714l.m101134b(r9)
            goto L_0x00c9
        L_0x001a:
            java.lang.Object r0 = r8.f99265a
            com.google.android.libraries.search.c.du r0 = (com.google.android.libraries.search.p2904c.C37514du) r0
            p5462h.C69714l.m101134b(r9)
            goto L_0x0089
        L_0x0022:
            p5462h.C69714l.m101134b(r9)     // Catch:{ all -> 0x0026 }
            goto L_0x0065
        L_0x0026:
            r9 = move-exception
            goto L_0x00a6
        L_0x0029:
            p5462h.C69714l.m101134b(r9)
            com.google.android.libraries.search.c.di r9 = r8.f99269e     // Catch:{ all -> 0x0026 }
            com.google.android.libraries.search.c.b.n r1 = com.google.android.libraries.search.p2904c.p2908b.C37390n.f99313d     // Catch:{ all -> 0x0026 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x0026 }
            com.google.android.libraries.search.c.b.m r1 = (com.google.android.libraries.search.p2904c.p2908b.C37389m) r1     // Catch:{ all -> 0x0026 }
            java.lang.String r7 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r7)     // Catch:{ all -> 0x0026 }
            com.google.android.libraries.search.c.b.r r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")     // Catch:{ all -> 0x0026 }
            com.google.android.libraries.search.c.dg r9 = r9.f99564b     // Catch:{ all -> 0x0026 }
            if (r9 != 0) goto L_0x0045
            com.google.android.libraries.search.c.dg r9 = com.google.android.libraries.search.p2904c.C37500dg.f99557c     // Catch:{ all -> 0x0026 }
        L_0x0045:
            java.lang.String r7 = "route.precachedBufferId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r7)     // Catch:{ all -> 0x0026 }
            r1.mo40926b(r9)     // Catch:{ all -> 0x0026 }
            com.google.android.libraries.search.c.b.n r9 = r1.mo40925a()     // Catch:{ all -> 0x0026 }
            com.google.android.libraries.search.c.b.a r1 = r8.f99267c     // Catch:{ all -> 0x0026 }
            com.google.common.util.concurrent.cx r9 = r1.mo24476f(r9)     // Catch:{ all -> 0x0026 }
            java.lang.String r1 = "adapter.stopListening(stopListeningParams)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r1)     // Catch:{ all -> 0x0026 }
            r8.f99266b = r6     // Catch:{ all -> 0x0026 }
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r8)     // Catch:{ all -> 0x0026 }
            if (r9 != r0) goto L_0x0065
            return r0
        L_0x0065:
            com.google.android.libraries.search.c.du r9 = (com.google.android.libraries.search.p2904c.C37514du) r9     // Catch:{ all -> 0x0026 }
            com.google.android.libraries.search.c.b.b.e r1 = r8.f99268d
            com.google.android.libraries.search.c.t.a.d r1 = r1.f99283b
            com.google.android.libraries.search.m.b.b r6 = com.google.android.libraries.search.p3047m.p3050b.C39226b.TAG_CLASSIC_ASSISTANT_URI_VIS
            java.lang.String r6 = com.google.android.libraries.search.p3047m.p3050b.C39227c.m68658b(r6)
            r1.mo41184a(r6)
            com.google.android.libraries.search.c.b.a r1 = r8.f99267c
            com.google.common.util.concurrent.cx r1 = r1.mo24475e(r4)
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)
            r8.f99265a = r9
            r8.f99266b = r5
            java.lang.Object r1 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r8)
            if (r1 == r0) goto L_0x00a5
            r0 = r9
            r9 = r1
        L_0x0089:
            com.google.android.libraries.search.c.b.f r9 = (com.google.android.libraries.search.p2904c.p2908b.C37382f) r9
            com.google.android.libraries.search.c.b.f r1 = com.google.android.libraries.search.p2904c.p2908b.C37382f.AUDIO_ADAPTER_DISCONNECT_STATUS_SUCCESS
            if (r9 == r1) goto L_0x00a5
            com.google.common.f.e r9 = com.google.android.libraries.search.p2904c.p2908b.p2910b.C37378e.f99282a
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.common.f.n r1 = new com.google.common.f.n
            r3 = 52664(0xcdb8, float:7.3798E-41)
            r1.<init>(r3)
            r9.mo56379ah(r1)
            r9.mo56386p(r2)
        L_0x00a5:
            return r0
        L_0x00a6:
            com.google.android.libraries.search.c.b.b.e r1 = r8.f99268d
            com.google.android.libraries.search.c.t.a.d r1 = r1.f99283b
            com.google.android.libraries.search.m.b.b r5 = com.google.android.libraries.search.p3047m.p3050b.C39226b.TAG_CLASSIC_ASSISTANT_URI_VIS
            java.lang.String r5 = com.google.android.libraries.search.p3047m.p3050b.C39227c.m68658b(r5)
            r1.mo41184a(r5)
            com.google.android.libraries.search.c.b.a r1 = r8.f99267c
            com.google.common.util.concurrent.cx r1 = r1.mo24475e(r4)
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)
            r8.f99265a = r9
            r3 = 3
            r8.f99266b = r3
            java.lang.Object r1 = kotlinx.coroutines.p5578d.C71663i.m104690c(r1, r8)
            if (r1 == r0) goto L_0x00e6
            r0 = r9
            r9 = r1
        L_0x00c9:
            com.google.android.libraries.search.c.b.f r9 = (com.google.android.libraries.search.p2904c.p2908b.C37382f) r9
            com.google.android.libraries.search.c.b.f r1 = com.google.android.libraries.search.p2904c.p2908b.C37382f.AUDIO_ADAPTER_DISCONNECT_STATUS_SUCCESS
            if (r9 == r1) goto L_0x00e5
            com.google.common.f.e r9 = com.google.android.libraries.search.p2904c.p2908b.p2910b.C37378e.f99282a
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.common.f.n r1 = new com.google.common.f.n
            r3 = 52666(0xcdba, float:7.3801E-41)
            r1.<init>(r3)
            r9.mo56379ah(r1)
            r9.mo56386p(r2)
        L_0x00e5:
            throw r0
        L_0x00e6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2908b.p2910b.C37374a.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C37374a(this.f99267c, this.f99268d, this.f99269e, gVar);
    }
}
