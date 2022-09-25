package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i;

import com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.performers.notification.MaNotificationTtsPlayer$maybePlayOfflineTts$1", mo61344c = "MaNotificationTtsPlayer.kt", mo61345d = "invokeSuspend", mo61346e = {57, 64})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.i.u */
/* compiled from: PG */
final class C128343u extends C69572j implements C69630p {

    /* renamed from: a */
    Object f352982a;

    /* renamed from: b */
    Object f352983b;

    /* renamed from: c */
    int f352984c;

    /* renamed from: d */
    final /* synthetic */ C128346x f352985d;

    /* renamed from: e */
    final /* synthetic */ BundledMessageNotification f352986e;

    /* renamed from: f */
    final /* synthetic */ String f352987f;

    /* renamed from: g */
    private /* synthetic */ Object f352988g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128343u(C128346x xVar, BundledMessageNotification bundledMessageNotification, String str, C69577g gVar) {
        super(2, gVar);
        this.f352985d = xVar;
        this.f352986e = bundledMessageNotification;
        this.f352987f = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128343u) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.google.android.libraries.assistant.c.g.b] */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v20 */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x014d, code lost:
        if (((com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i.C128346x) r3).mo108398b(r1, r9) != r0) goto L_0x014f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r10) {
        /*
            r9 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r9.f352984c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0027
            if (r1 == r3) goto L_0x0016
            java.lang.Object r0 = r9.f352988g
            java.io.Closeable r0 = (java.io.Closeable) r0
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x0013 }
            goto L_0x0150
        L_0x0013:
            r10 = move-exception
            goto L_0x015b
        L_0x0016:
            java.lang.Object r1 = r9.f352983b
            java.lang.Object r3 = r9.f352982a
            java.lang.Object r4 = r9.f352988g
            java.io.Closeable r4 = (java.io.Closeable) r4
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x0023 }
            goto L_0x00fd
        L_0x0023:
            r10 = move-exception
            r0 = r4
            goto L_0x015b
        L_0x0027:
            p5462h.C69714l.m101134b(r10)
            java.lang.Object r10 = r9.f352988g
            kotlinx.coroutines.aw r10 = (kotlinx.coroutines.C71422aw) r10
            com.google.android.apps.search.assistant.surfaces.voice.m.i.x r1 = r9.f352985d
            com.google.android.libraries.search.assistant.notification.data.BundledMessageNotification r4 = r9.f352986e
            java.lang.String r5 = r9.f352987f
            java.lang.String r6 = "bundledMessageNotification"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r6)
            java.lang.String r6 = "locale"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r6)
            j$.util.Optional r6 = com.google.android.libraries.search.assistant.notification.data.p2713a.C34879g.m63708b(r4)
            boolean r6 = r6.isPresent()
            if (r6 == 0) goto L_0x0068
            android.content.Context r1 = r1.f353003c
            com.google.common.b.gu r4 = r4.mo39538a()
            j$.util.stream.Stream r4 = p3186j$.util.Collection.EL.stream(r4)
            com.google.android.libraries.search.assistant.notification.data.a.d r6 = new com.google.android.libraries.search.assistant.notification.data.a.d
            r6.<init>(r1)
            j$.util.stream.Stream r1 = r4.map(r6)
            java.lang.String r4 = " "
            j$.util.stream.Collector r4 = p3186j$.util.stream.Collectors.joining(r4)
            java.lang.Object r1 = r1.collect(r4)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x006c
        L_0x0068:
            java.lang.String r1 = com.google.android.libraries.search.assistant.notification.data.p2713a.C34879g.m63711e(r4)
        L_0x006c:
            com.google.speech.k.a.ah r4 = com.google.speech.p5224k.p5225a.C67190ah.f182619q
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.speech.k.a.ae r4 = (com.google.speech.p5224k.p5225a.C67187ae) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.speech.k.a.ah r6 = (com.google.speech.p5224k.p5225a.C67190ah) r6
            r1.getClass()
            int r7 = r6.f182622a
            r7 = r7 | r3
            r6.f182622a = r7
            r6.f182625d = r1
            r4.copyOnWrite()
            com.google.protobuf.bv r1 = r4.instance
            com.google.speech.k.a.ah r1 = (com.google.speech.p5224k.p5225a.C67190ah) r1
            r5.getClass()
            int r6 = r1.f182622a
            r6 = r6 | 8192(0x2000, float:1.14794E-41)
            r1.f182622a = r6
            r1.f182632k = r5
            com.google.protobuf.bv r1 = r4.build()
            java.lang.String r4 = "newBuilder()\n        .se…(locale)\n        .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r4)
            com.google.speech.k.a.ah r1 = (com.google.speech.p5224k.p5225a.C67190ah) r1
            com.google.assistant.e.j.ka r4 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.e.j.jz r4 = (com.google.assistant.p3897e.p3921j.C52228jz) r4
            java.lang.String r5 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            com.google.assistant.e.j.adu r4 = p5462h.p5473f.p5475b.C69664n.m101061g(r4, "builder")
            java.lang.String r5 = "speech.s3.TtsServiceRequest"
            r4.mo53678c(r5)
            com.google.protobuf.z r1 = r1.toByteString()
            java.lang.String r5 = "ttsServiceRequest.toByteString()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r5)
            r4.mo53677b(r1)
            com.google.assistant.e.j.ka r1 = r4.mo53676a()
            com.google.android.apps.search.assistant.libraries.e.d.a.b r4 = com.google.android.apps.search.assistant.libraries.p8966e.p8970d.p8971a.C119358b.f332780a
            com.google.android.apps.search.assistant.surfaces.voice.m.i.x r5 = r9.f352985d
            com.google.android.libraries.assistant.c.g.b.a.b r5 = r5.f353005e
            com.google.android.libraries.assistant.c.g.k.k r6 = com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i.C128346x.f353002b
            com.google.android.libraries.assistant.c.g.b r10 = r4.mo104304a(r10, r5, r6, r1)
            com.google.android.apps.search.assistant.surfaces.voice.m.i.x r1 = r9.f352985d
            com.google.android.libraries.search.assistant.performer.communication.d.aj r4 = r1.f353004d     // Catch:{ all -> 0x0157 }
            r4.mo21077b()     // Catch:{ all -> 0x0157 }
            r10.mo23303b()     // Catch:{ all -> 0x0157 }
            com.google.android.libraries.assistant.c.g.a r4 = r10.mo23302a()     // Catch:{ all -> 0x0157 }
            com.google.common.util.concurrent.cx r4 = r4.mo23276b()     // Catch:{ all -> 0x0157 }
            java.lang.String r5 = "ttsSession.sessionStatus.playbackStartStatus"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)     // Catch:{ all -> 0x0157 }
            r9.f352988g = r10     // Catch:{ all -> 0x0157 }
            r9.f352982a = r1     // Catch:{ all -> 0x0157 }
            r9.f352983b = r10     // Catch:{ all -> 0x0157 }
            r9.f352984c = r3     // Catch:{ all -> 0x0157 }
            java.lang.Object r3 = kotlinx.coroutines.p5578d.C71663i.m104690c(r4, r9)     // Catch:{ all -> 0x0157 }
            if (r3 == r0) goto L_0x0156
            r4 = r10
            r10 = r3
            r3 = r1
            r1 = r4
        L_0x00fd:
            com.google.android.libraries.assistant.c.g.k.ai r10 = (com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17473ai) r10     // Catch:{ all -> 0x0023 }
            int r5 = r10.f50460b     // Catch:{ all -> 0x0023 }
            r6 = 2
            if (r5 != r6) goto L_0x013d
            com.google.common.f.e r0 = com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i.C128346x.f353001a     // Catch:{ all -> 0x0023 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ all -> 0x0023 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = "Failed to play message TTS, start status=%s"
            int r5 = r10.f50460b     // Catch:{ all -> 0x0023 }
            if (r5 != r6) goto L_0x0123
            java.lang.Object r10 = r10.f50461c     // Catch:{ all -> 0x0023 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x0023 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0023 }
            com.google.android.libraries.assistant.c.g.k.ag r10 = com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17471ag.m34782a(r10)     // Catch:{ all -> 0x0023 }
            if (r10 != 0) goto L_0x0125
            com.google.android.libraries.assistant.c.g.k.ag r10 = com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17471ag.UNSPECIFIED_PLAYBACK_START_FAILURE     // Catch:{ all -> 0x0023 }
            goto L_0x0125
        L_0x0123:
            com.google.android.libraries.assistant.c.g.k.ag r10 = com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17471ag.UNSPECIFIED_PLAYBACK_START_FAILURE     // Catch:{ all -> 0x0023 }
        L_0x0125:
            com.google.common.f.n r5 = new com.google.common.f.n     // Catch:{ all -> 0x0023 }
            r6 = 37856(0x93e0, float:5.3048E-41)
            r5.<init>(r6)     // Catch:{ all -> 0x0023 }
            r0.mo56379ah(r5)     // Catch:{ all -> 0x0023 }
            r0.mo56389s(r1, r10)     // Catch:{ all -> 0x0023 }
            com.google.android.apps.search.assistant.surfaces.voice.m.i.x r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i.C128346x) r3     // Catch:{ all -> 0x0023 }
            com.google.android.libraries.search.assistant.performer.communication.d.aj r10 = r3.f353004d     // Catch:{ all -> 0x0023 }
            com.google.net.a.a.b r0 = com.google.net.p4726a.p4727a.C62722b.ABORTED     // Catch:{ all -> 0x0023 }
            r10.mo21076a(r0)     // Catch:{ all -> 0x0023 }
            goto L_0x014f
        L_0x013d:
            r9.f352988g = r4     // Catch:{ all -> 0x0023 }
            r9.f352982a = r2     // Catch:{ all -> 0x0023 }
            r9.f352983b = r2     // Catch:{ all -> 0x0023 }
            r9.f352984c = r6     // Catch:{ all -> 0x0023 }
            com.google.common.f.e r10 = com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i.C128346x.f353001a     // Catch:{ all -> 0x0023 }
            com.google.android.apps.search.assistant.surfaces.voice.m.i.x r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i.C128346x) r3     // Catch:{ all -> 0x0023 }
            java.lang.Object r10 = r3.mo108398b(r1, r9)     // Catch:{ all -> 0x0023 }
            if (r10 == r0) goto L_0x0156
        L_0x014f:
            r0 = r4
        L_0x0150:
            p5462h.p5472e.C69598b.m101013a(r0, r2)
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        L_0x0156:
            return r0
        L_0x0157:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
        L_0x015b:
            throw r10     // Catch:{ all -> 0x015c }
        L_0x015c:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9707i.C128343u.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C128343u uVar = new C128343u(this.f352985d, this.f352986e, this.f352987f, gVar);
        uVar.f352988g = obj;
        return uVar;
    }
}
