package com.google.android.libraries.assistant.auto.jumpboost.p649a.p651b;

import android.content.Context;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.C11525d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.a.b.h */
/* compiled from: PG */
public final class C11431h implements C87682aj {

    /* renamed from: a */
    final /* synthetic */ C11525d f37201a;

    /* renamed from: b */
    final /* synthetic */ Context f37202b;

    /* renamed from: c */
    final /* synthetic */ C21370a f37203c;

    /* renamed from: d */
    final /* synthetic */ C47770dh f37204d;

    public C11431h(C11525d dVar, Context context, C21370a aVar, C47770dh dhVar) {
        this.f37201a = dVar;
        this.f37202b = context;
        this.f37203c = aVar;
        this.f37204d = dhVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0101, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0102, code lost:
        p5462h.p5472e.C69598b.m101013a(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0105, code lost:
        throw r1;
     */
    /* renamed from: fM */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19965fM(com.google.android.apps.gsa.search.shared.service.ServiceEventData r8) {
        /*
            r7 = this;
            java.lang.String r0 = "it"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r0)
            com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.d r0 = r7.f37201a
            android.content.Context r1 = r7.f37202b
            com.google.android.libraries.f.a r2 = r7.f37203c
            com.google.apps.tiktok.tracing.dh r3 = r7.f37204d
            java.lang.String r4 = "data"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r4)
            java.lang.String r4 = "carAssistantCallbacks"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r4)
            java.lang.String r4 = "context"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r4)
            java.lang.String r4 = "clock"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r4)
            java.lang.String r4 = "traceCreation"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r4)
            com.google.android.apps.gsa.search.shared.service.b.uo r4 = r8.f236959a
            int r4 = r4.f238699b
            com.google.android.apps.gsa.search.shared.service.b.um r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.m142794a(r4)
            if (r4 != 0) goto L_0x0032
            com.google.android.apps.gsa.search.shared.service.b.um r4 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.ATTACH_WEBVIEW
        L_0x0032:
            com.google.android.apps.gsa.search.shared.service.b.um r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.HANDLE_HOTWORD_QUERY
            if (r4 != r5) goto L_0x0106
            com.google.common.f.e r4 = com.google.android.libraries.assistant.auto.jumpboost.p649a.p651b.C11429f.f37196a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            com.google.common.f.n r5 = new com.google.common.f.n
            r6 = 43318(0xa936, float:6.0701E-41)
            r5.<init>(r6)
            r4.mo56379ah(r5)
            java.lang.String r5 = "Hotword event received"
            r4.mo56386p(r5)
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r4 = com.google.android.apps.gsa.shared.search.Query.class
            boolean r4 = r8.mo81913d(r4)
            if (r4 == 0) goto L_0x00a8
            java.lang.Class<com.google.android.apps.gsa.shared.search.Query> r4 = com.google.android.apps.gsa.shared.search.Query.class
            android.os.Parcelable r8 = r8.mo81912b(r4)
            com.google.android.apps.gsa.shared.search.Query r8 = (com.google.android.apps.gsa.shared.search.Query) r8
            android.net.Uri r8 = r8.f252787z
            if (r8 == 0) goto L_0x00a8
            com.google.common.f.e r4 = com.google.android.libraries.assistant.auto.jumpboost.p649a.p651b.C11429f.f37196a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4
            com.google.common.f.n r5 = new com.google.common.f.n
            r6 = 43319(0xa937, float:6.0703E-41)
            r5.<init>(r6)
            r4.mo56379ah(r5)
            java.lang.String r5 = "Closing audio uri"
            r4.mo56386p(r5)
            java.lang.String r4 = "r"
            com.google.android.libraries.ao.c.f r5 = com.google.android.libraries.p11029ao.p11032c.C147805f.f398780b     // Catch:{ FileNotFoundException -> 0x0088 }
            android.content.res.AssetFileDescriptor r8 = com.google.android.libraries.p11029ao.p11032c.C147806g.m240907a(r1, r8, r4, r5)     // Catch:{ FileNotFoundException -> 0x0088 }
            if (r8 == 0) goto L_0x00c0
            r8.close()     // Catch:{ FileNotFoundException -> 0x0088 }
            goto L_0x00c0
        L_0x0088:
            r8 = move-exception
            com.google.common.f.e r1 = com.google.android.libraries.assistant.auto.jumpboost.p649a.p651b.C11429f.f37196a
            com.google.common.f.x r1 = r1.mo56225c()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.x r8 = r1.mo56382g(r8)
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r1 = new com.google.common.f.n
            r4 = 43317(0xa935, float:6.07E-41)
            r1.<init>(r4)
            r8.mo56379ah(r1)
            java.lang.String r1 = "Error closing recorded audio uri"
            r8.mo56386p(r1)
            goto L_0x00c0
        L_0x00a8:
            com.google.common.f.e r8 = com.google.android.libraries.assistant.auto.jumpboost.p649a.p651b.C11429f.f37196a
            com.google.common.f.x r8 = r8.mo56225c()
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8
            com.google.common.f.n r1 = new com.google.common.f.n
            r4 = 43320(0xa938, float:6.0704E-41)
            r1.<init>(r4)
            r8.mo56379ah(r1)
            java.lang.String r1 = "Missing recorded audio uri for hotword"
            r8.mo56386p(r1)
        L_0x00c0:
            java.lang.String r8 = "HotwordDetected"
            com.google.apps.tiktok.tracing.ax r8 = r3.mo51613c(r8)
            com.google.android.apps.auto.a.a.f r1 = com.google.android.apps.auto.p450a.p451a.C8913f.f30923e     // Catch:{ all -> 0x00ff }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x00ff }
            com.google.android.apps.auto.a.a.e r1 = (com.google.android.apps.auto.p450a.p451a.C8912e) r1     // Catch:{ all -> 0x00ff }
            java.lang.String r3 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r3)     // Catch:{ all -> 0x00ff }
            com.google.android.apps.auto.a.a.d r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")     // Catch:{ all -> 0x00ff }
            long r2 = r2.mo26871c()     // Catch:{ all -> 0x00ff }
            com.google.protobuf.fg r2 = com.google.protobuf.p4750c.C62953e.m95484i(r2)     // Catch:{ all -> 0x00ff }
            java.lang.String r3 = "fromMillis(clock.elapsedRealtime())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)     // Catch:{ all -> 0x00ff }
            r1.mo17275b(r2)     // Catch:{ all -> 0x00ff }
            r1.mo17276c()     // Catch:{ all -> 0x00ff }
            com.google.android.apps.auto.a.a.f r1 = r1.mo17274a()     // Catch:{ all -> 0x00ff }
            com.google.common.util.concurrent.cx r0 = r0.mo20027d(r1)     // Catch:{ all -> 0x00ff }
            java.lang.String r1 = "Error requesting assistant session"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ff }
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r0, r1, r2)     // Catch:{ all -> 0x00ff }
            r0 = 0
            p5462h.p5472e.C69598b.m101013a(r8, r0)
            return
        L_0x00ff:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0101 }
        L_0x0101:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r8, r0)
            throw r1
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.jumpboost.p649a.p651b.C11431h.mo19965fM(com.google.android.apps.gsa.search.shared.service.ServiceEventData):void");
    }
}
