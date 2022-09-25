package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9544aa;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.C127369n;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127358f;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127360h;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3745ab.p3771w.C48422i;
import com.google.assistant.p3897e.p3917i.p3918a.C51536li;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.aa.b */
/* compiled from: PG */
public final class C127190b implements C127369n {

    /* renamed from: a */
    public static final C32836cd f350162a;

    /* renamed from: b */
    public static final C33476a f350163b = new C33476a("assistant.api.params.RequestLoggingParams", C51536li.f134316k);

    /* renamed from: c */
    public static final C33476a f350164c = new C33476a("assistant.logs.OpaAndroidInfo", C48422i.f125135e);

    /* renamed from: d */
    private final C127358f f350165d;

    /* renamed from: e */
    private final C127360h f350166e;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        ccVar.copyOnWrite();
        C32836cd cdVar = (C32836cd) ccVar.instance;
        cdVar.f88042a |= 2;
        cdVar.f88044c = true;
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        ajVar.copyOnWrite();
        C32796ar arVar = (C32796ar) ajVar.instance;
        arVar.f87975a = 1;
        arVar.f87976b = "asst.request.logging.params";
        ccVar.copyOnWrite();
        C32836cd cdVar2 = (C32836cd) ccVar.instance;
        C32796ar arVar2 = (C32796ar) ajVar.build();
        arVar2.getClass();
        cdVar2.f88043b = arVar2;
        cdVar2.f88042a |= 1;
        C62942bv build = ccVar.build();
        C69664n.m101060f(build, "newBuilder()\n        .se…arams\"))\n        .build()");
        f350162a = (C32836cd) build;
    }

    public C127190b(C127358f fVar, C127360h hVar) {
        C69664n.m101061g(fVar, "interactionIdStore");
        C69664n.m101061g(hVar, "interactionInitiatorStore");
        this.f350165d = fVar;
        this.f350166e = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0114  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo107986a(com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i r13, com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be r14) {
        /*
            r12 = this;
            java.lang.String r0 = "queryContext"
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r0)
            java.lang.String r1 = "request"
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r1)
            com.google.android.libraries.search.assistant.f.a.d.aw r14 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw.f87978c
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.android.libraries.search.assistant.f.a.d.au r14 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au) r14
            java.lang.String r1 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r1)
            com.google.android.libraries.search.assistant.f.a.d.ay r14 = p5462h.p5473f.p5475b.C69664n.m101061g(r14, "builder")
            com.google.android.libraries.search.assistant.f.a.d.ba r2 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba.f87988c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.libraries.search.assistant.f.a.d.az r2 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az) r2
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r1)
            com.google.android.libraries.search.assistant.f.a.d.bc r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r2, "builder")
            com.google.android.libraries.search.assistant.i.a r2 = f350163b
            com.google.assistant.e.i.a.li r3 = com.google.assistant.p3897e.p3917i.p3918a.C51536li.f134316k
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.i.a.lf r3 = (com.google.assistant.p3897e.p3917i.p3918a.C51533lf) r3
            com.google.assistant.e.i.a.lh r4 = com.google.assistant.p3897e.p3917i.p3918a.C51535lh.REAL_USER
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.assistant.e.i.a.li r5 = (com.google.assistant.p3897e.p3917i.p3918a.C51536li) r5
            int r4 = r4.f134315r
            r5.f134319b = r4
            int r4 = r5.f134318a
            r6 = 1
            r4 = r4 | r6
            r5.f134318a = r4
            com.google.android.libraries.search.assistant.i.a r4 = f350164c
            com.google.android.apps.search.assistant.surfaces.voice.d.d.c r5 = r13.f350565c
            if (r5 != 0) goto L_0x004f
            com.google.android.apps.search.assistant.surfaces.voice.d.d.c r5 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127283c.f350547c
        L_0x004f:
            int r5 = r5.f350549a
            com.google.android.apps.search.assistant.surfaces.voice.d.d.b r5 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127282b.m208209a(r5)
            int r5 = r5.ordinal()
            if (r5 == 0) goto L_0x008e
            if (r5 == r6) goto L_0x0067
            r7 = 2
            if (r5 != r7) goto L_0x0061
            goto L_0x008e
        L_0x0061:
            h.g r13 = new h.g
            r13.<init>()
            throw r13
        L_0x0067:
            com.google.assistant.ab.w.i r13 = com.google.assistant.p3745ab.p3771w.C48422i.f125135e
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.assistant.ab.w.h r13 = (com.google.assistant.p3745ab.p3771w.C48421h) r13
            com.google.android.apps.gsa.assistant.shared.l.e r0 = com.google.android.apps.gsa.assistant.shared.l.e.aI
            r13.copyOnWrite()
            com.google.protobuf.bv r5 = r13.instance
            com.google.assistant.ab.w.i r5 = (com.google.assistant.p3745ab.p3771w.C48422i) r5
            int r0 = r0.ca
            r5.f125138b = r0
            int r0 = r5.f125137a
            r0 = r0 | r6
            r5.f125137a = r0
            com.google.protobuf.bv r13 = r13.build()
            java.lang.String r0 = "newBuilder().setTriggerT…ggerType.GSA_MIC).build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r0)
            com.google.assistant.ab.w.i r13 = (com.google.assistant.p3745ab.p3771w.C48422i) r13
            goto L_0x016c
        L_0x008e:
            com.google.assistant.ab.w.i r5 = com.google.assistant.p3745ab.p3771w.C48422i.f125135e
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.ab.w.h r5 = (com.google.assistant.p3745ab.p3771w.C48421h) r5
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r0)
            com.google.android.apps.search.assistant.surfaces.voice.d.g.f r0 = r12.f350165d
            java.lang.String r7 = r13.f350564b
            java.lang.String r8 = "queryContext.requestId"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            java.lang.String r8 = "requestId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r8)
            java.util.concurrent.atomic.AtomicReference r0 = r0.f350721b
            java.lang.Object r0 = r0.get()
            com.google.android.apps.search.assistant.surfaces.voice.d.g.d r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127356d) r0
            r8 = 0
            if (r0 != 0) goto L_0x00b4
        L_0x00b2:
            r0 = r8
            goto L_0x00d9
        L_0x00b4:
            java.lang.String r9 = r0.f350718b
            boolean r9 = p5462h.p5473f.p5475b.C69664n.m101066l(r9, r7)
            if (r9 != 0) goto L_0x00d7
            com.google.common.f.e r9 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127358f.f350720a
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            java.lang.String r0 = r0.f350718b
            com.google.common.f.n r10 = new com.google.common.f.n
            r11 = 37299(0x91b3, float:5.2267E-41)
            r10.<init>(r11)
            r9.mo56379ah(r10)
            java.lang.String r10 = "Request id mis-match. Expected %s, got %s."
            r9.mo56354G(r10, r7, r0)
            goto L_0x00b2
        L_0x00d7:
            com.google.android.apps.search.assistant.platform.b.a.d.cb r0 = r0.f350717a
        L_0x00d9:
            if (r0 != 0) goto L_0x00dc
            goto L_0x011e
        L_0x00dc:
            com.google.android.apps.search.assistant.surfaces.voice.d.g.h r7 = r12.f350166e
            java.util.concurrent.atomic.AtomicReference r7 = r7.f350724b
            java.lang.Object r7 = r7.get()
            com.google.android.apps.search.assistant.platform.b.a.d.ce r7 = (com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119837ce) r7
            if (r7 != 0) goto L_0x00e9
            goto L_0x011e
        L_0x00e9:
            com.google.android.apps.search.assistant.platform.b.a.d.cb r9 = r7.f333777a
            if (r9 != 0) goto L_0x00ef
            com.google.android.apps.search.assistant.platform.b.a.d.cb r9 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb.f333765b
        L_0x00ef:
            boolean r9 = p5462h.p5473f.p5475b.C69664n.m101066l(r9, r0)
            if (r9 != 0) goto L_0x0114
            com.google.common.f.e r9 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9581g.C127360h.f350723a
            com.google.common.f.x r9 = r9.mo56226d()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.android.apps.search.assistant.platform.b.a.d.cb r7 = r7.f333777a
            if (r7 != 0) goto L_0x0103
            com.google.android.apps.search.assistant.platform.b.a.d.cb r7 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb.f333765b
        L_0x0103:
            com.google.common.f.n r10 = new com.google.common.f.n
            r11 = 37300(0x91b4, float:5.2268E-41)
            r10.<init>(r11)
            r9.mo56379ah(r10)
            java.lang.String r10 = "Interaction id mis-match. Expected %s, got %s."
            r9.mo56354G(r10, r0, r7)
            goto L_0x011e
        L_0x0114:
            int r0 = r7.f333778b
            com.google.android.apps.search.assistant.platform.b.a.d.cd r8 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119836cd.m198736a(r0)
            if (r8 != 0) goto L_0x011e
            com.google.android.apps.search.assistant.platform.b.a.d.cd r8 = com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119836cd.UNRECOGNIZED
        L_0x011e:
            com.google.android.apps.gsa.assistant.shared.l.e r13 = com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9544aa.C127189a.m208030a(r13, r8)
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.assistant.ab.w.i r0 = (com.google.assistant.p3745ab.p3771w.C48422i) r0
            int r13 = r13.ca
            r0.f125138b = r13
            int r13 = r0.f125137a
            r13 = r13 | r6
            r0.f125137a = r13
            com.google.assistant.ab.w.g r13 = com.google.assistant.p3745ab.p3771w.C48420g.f125128f
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.assistant.ab.w.a r13 = (com.google.assistant.p3745ab.p3771w.C48414a) r13
            r13.copyOnWrite()
            com.google.protobuf.bv r0 = r13.instance
            com.google.assistant.ab.w.g r0 = (com.google.assistant.p3745ab.p3771w.C48420g) r0
            r0.f125134e = r6
            int r6 = r0.f125130a
            r6 = r6 | 8
            r0.f125130a = r6
            r5.copyOnWrite()
            com.google.protobuf.bv r0 = r5.instance
            com.google.assistant.ab.w.i r0 = (com.google.assistant.p3745ab.p3771w.C48422i) r0
            com.google.protobuf.bv r13 = r13.build()
            com.google.assistant.ab.w.g r13 = (com.google.assistant.p3745ab.p3771w.C48420g) r13
            r13.getClass()
            r0.f125140d = r13
            int r13 = r0.f125137a
            r13 = r13 | 4
            r0.f125137a = r13
            com.google.protobuf.bv r13 = r5.build()
            java.lang.String r0 = "newBuilder()\n          .…     )\n          .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r0)
            com.google.assistant.ab.w.i r13 = (com.google.assistant.p3745ab.p3771w.C48422i) r13
        L_0x016c:
            com.google.assistant.e.j.ka r13 = r4.mo38879a(r13)
            r3.copyOnWrite()
            com.google.protobuf.bv r0 = r3.instance
            com.google.assistant.e.i.a.li r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51536li) r0
            r13.getClass()
            r0.f134323f = r13
            int r13 = r0.f134318a
            r13 = r13 | 256(0x100, float:3.59E-43)
            r0.f134318a = r13
            com.google.protobuf.bv r13 = r3.build()
            java.lang.String r0 = "newBuilder()\n      .setR…Context)))\n      .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r0)
            com.google.assistant.e.i.a.li r13 = (com.google.assistant.p3897e.p3917i.p3918a.C51536li) r13
            com.google.assistant.e.j.ka r13 = r2.mo38879a(r13)
            java.lang.String r0 = "REQUEST_LOGGING_PARAMS_K…(getParams(queryContext))"
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r0)
            r1.mo38306b(r13)
            com.google.android.libraries.search.assistant.f.a.d.ba r13 = r1.mo38305a()
            r14.mo38303b(r13)
            com.google.android.libraries.search.assistant.f.a.d.aw r13 = r14.mo38302a()
            com.google.common.util.concurrent.cx r13 = com.google.common.util.concurrent.C60856cj.m92900i(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9544aa.C127190b.mo107986a(com.google.android.apps.search.assistant.surfaces.voice.d.d.i, com.google.android.libraries.search.assistant.f.a.d.be):com.google.common.util.concurrent.cx");
    }
}
