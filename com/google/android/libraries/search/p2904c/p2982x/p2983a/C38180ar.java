package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.service.impl.StreamListeningSessionResponseSender$startInternal$1", mo61344c = "StreamListeningSessionResponseSender.kt", mo61345d = "invokeSuspend", mo61346e = {77, 78, 115})
/* renamed from: com.google.android.libraries.search.c.x.a.ar */
/* compiled from: PG */
final class C38180ar extends C69572j implements C69630p {

    /* renamed from: a */
    Object f101182a;

    /* renamed from: b */
    int f101183b;

    /* renamed from: c */
    final /* synthetic */ C38181as f101184c;

    /* renamed from: d */
    private /* synthetic */ Object f101185d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38180ar(C38181as asVar, C69577g gVar) {
        super(2, gVar);
        this.f101184c = asVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C38180ar) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.google.android.libraries.search.c.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: com.google.android.libraries.search.c.be} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: com.google.android.libraries.search.c.be} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r12) {
        /*
            r11 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r11.f101183b
            java.lang.String r2 = "ALT.GrpcARCRespSenderV2"
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 == r4) goto L_0x001d
            if (r1 == r3) goto L_0x0013
            p5462h.C69714l.m101134b(r12)
            goto L_0x015f
        L_0x0013:
            java.lang.Object r1 = r11.f101182a
            java.lang.Object r3 = r11.f101185d
            kotlinx.coroutines.aw r3 = (kotlinx.coroutines.C71422aw) r3
            p5462h.C69714l.m101134b(r12)
            goto L_0x0054
        L_0x001d:
            java.lang.Object r1 = r11.f101185d
            kotlinx.coroutines.aw r1 = (kotlinx.coroutines.C71422aw) r1
            p5462h.C69714l.m101134b(r12)
            goto L_0x003b
        L_0x0025:
            p5462h.C69714l.m101134b(r12)
            java.lang.Object r12 = r11.f101185d
            kotlinx.coroutines.aw r12 = (kotlinx.coroutines.C71422aw) r12
            com.google.android.libraries.search.c.x.a.as r1 = r11.f101184c
            r11.f101185d = r12
            r11.f101183b = r4
            java.lang.Object r1 = r1.mo41305b(r11)
            if (r1 == r0) goto L_0x0184
            r10 = r1
            r1 = r12
            r12 = r10
        L_0x003b:
            com.google.android.libraries.search.c.be r12 = (com.google.android.libraries.search.p2904c.C37400be) r12
            if (r12 != 0) goto L_0x0042
            h.q r12 = p5462h.C69788q.f186170a
            return r12
        L_0x0042:
            com.google.android.libraries.search.c.x.a.as r4 = r11.f101184c
            r11.f101185d = r1
            r11.f101182a = r12
            r11.f101183b = r3
            java.lang.Object r3 = r4.mo41304a(r11)
            if (r3 == r0) goto L_0x0184
            r10 = r1
            r1 = r12
            r12 = r3
            r3 = r10
        L_0x0054:
            com.google.android.libraries.search.c.ay r12 = (com.google.android.libraries.search.p2904c.C37360ay) r12
            if (r12 != 0) goto L_0x005b
            h.q r12 = p5462h.C69788q.f186170a
            return r12
        L_0x005b:
            com.google.android.libraries.search.c.x.a.as r4 = r11.f101184c
            com.google.android.libraries.search.c.x.at r5 = com.google.android.libraries.search.p2904c.p2982x.C38237at.f101333c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.search.c.x.as r5 = (com.google.android.libraries.search.p2904c.p2982x.C38236as) r5
            java.lang.String r6 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            com.google.android.libraries.search.c.x.av r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            com.google.android.libraries.search.c.x.al r7 = com.google.android.libraries.search.p2904c.p2982x.C38229al.f101316f
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.libraries.search.c.x.ak r7 = (com.google.android.libraries.search.p2904c.p2982x.C38228ak) r7
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r6)
            com.google.android.libraries.search.c.x.an r7 = p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder")
            com.google.android.libraries.search.c.bu r8 = r1.mo40929a()
            java.lang.String r9 = "startListeningResult.startListeningStatus"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            r7.mo41341b(r8)
            com.google.android.libraries.search.c.x.ak r8 = r7.f101323a
            r8.copyOnWrite()
            com.google.protobuf.bv r8 = r8.instance
            com.google.android.libraries.search.c.x.al r8 = (com.google.android.libraries.search.p2904c.p2982x.C38229al) r8
            r8.f101322e = r12
            int r9 = r8.f101318a
            r9 = r9 | 8
            r8.f101318a = r9
            com.google.android.libraries.search.c.x.al r7 = r7.mo41340a()
            r5.mo41345d(r7)
            com.google.android.libraries.search.c.x.at r5 = r5.mo41342a()
            r4.mo41307d(r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.google.common.base.ax r5 = r1.mo40930b()
            boolean r5 = r5.mo56113h()
            r7 = 3
            r8 = 0
            if (r5 == 0) goto L_0x00c8
            com.google.android.libraries.search.c.x.a.an r5 = new com.google.android.libraries.search.c.x.a.an
            com.google.android.libraries.search.c.x.a.as r9 = r11.f101184c
            r5.<init>(r9, r1, r12, r8)
            kotlinx.coroutines.cp r12 = kotlinx.coroutines.C71803m.m105043d(r3, r8, r8, r5, r7)
            r4.add(r12)
            goto L_0x00e0
        L_0x00c8:
            com.google.common.base.ax r12 = r1.mo40931c()
            boolean r12 = r12.mo56113h()
            if (r12 == 0) goto L_0x00e0
            com.google.android.libraries.search.c.x.a.ao r12 = new com.google.android.libraries.search.c.x.a.ao
            com.google.android.libraries.search.c.x.a.as r5 = r11.f101184c
            r12.<init>(r5, r1, r8)
            kotlinx.coroutines.cp r12 = kotlinx.coroutines.C71803m.m105043d(r3, r8, r8, r12, r7)
            r4.add(r12)
        L_0x00e0:
            com.google.common.base.ax r12 = r1.mo40932d()
            boolean r12 = r12.mo56113h()
            if (r12 == 0) goto L_0x00f9
            com.google.android.libraries.search.c.x.a.ap r12 = new com.google.android.libraries.search.c.x.a.ap
            com.google.android.libraries.search.c.x.a.as r5 = r11.f101184c
            r12.<init>(r5, r1, r8)
            kotlinx.coroutines.cp r12 = kotlinx.coroutines.C71803m.m105043d(r3, r8, r8, r12, r7)
            r4.add(r12)
            goto L_0x0144
        L_0x00f9:
            com.google.common.f.e r12 = com.google.android.libraries.search.p2904c.p2982x.p2983a.C38181as.f101186a
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r1, r2)
            com.google.common.f.n r1 = new com.google.common.f.n
            r5 = 53030(0xcf26, float:7.4311E-41)
            r1.<init>(r5)
            r12.mo56379ah(r1)
            java.lang.String r1 = "#audio# No first byte read result, send empty"
            r12.mo56386p(r1)
            com.google.android.libraries.search.c.x.a.as r12 = r11.f101184c
            com.google.android.libraries.search.c.x.at r1 = com.google.android.libraries.search.p2904c.p2982x.C38237at.f101333c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.search.c.x.as r1 = (com.google.android.libraries.search.p2904c.p2982x.C38236as) r1
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r6)
            com.google.android.libraries.search.c.x.av r1 = p5462h.p5473f.p5475b.C69664n.m101061g(r1, "builder")
            com.google.android.libraries.search.c.bb r5 = com.google.android.libraries.search.p2904c.C37397bb.f99320c
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.android.libraries.search.c.ba r5 = (com.google.android.libraries.search.p2904c.C37396ba) r5
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            com.google.android.libraries.search.c.gz r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")
            com.google.android.libraries.search.c.bb r5 = r5.mo41045a()
            r1.mo41344c(r5)
            com.google.android.libraries.search.c.x.at r1 = r1.mo41342a()
            r12.mo41307d(r1)
        L_0x0144:
            com.google.android.libraries.search.c.x.a.aq r12 = new com.google.android.libraries.search.c.x.a.aq
            com.google.android.libraries.search.c.x.a.as r1 = r11.f101184c
            r12.<init>(r1, r8)
            kotlinx.coroutines.cp r12 = kotlinx.coroutines.C71803m.m105043d(r3, r8, r8, r12, r7)
            r4.add(r12)
            r11.f101185d = r8
            r11.f101182a = r8
            r11.f101183b = r7
            java.lang.Object r12 = kotlinx.coroutines.C71760h.m104950b(r4, r11)
            if (r12 != r0) goto L_0x015f
            return r0
        L_0x015f:
            com.google.common.f.e r12 = com.google.android.libraries.search.p2904c.p2982x.p2983a.C38181as.f101186a
            com.google.common.f.x r12 = r12.mo56224b()
            com.google.common.f.c r12 = (com.google.common.p4526f.C59052c) r12
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r12.mo56378ag(r0, r2)
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 53031(0xcf27, float:7.4312E-41)
            r0.<init>(r1)
            r12.mo56379ah(r0)
            java.lang.String r0 = "#audio# Completing sending data to the remote client"
            r12.mo56386p(r0)
            com.google.android.libraries.search.c.x.a.as r12 = r11.f101184c
            r12.mo41309f()
            h.q r12 = p5462h.C69788q.f186170a
            return r12
        L_0x0184:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2982x.p2983a.C38180ar.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C38180ar arVar = new C38180ar(this.f101184c, gVar);
        arVar.f101185d = obj;
        return arVar;
    }
}
