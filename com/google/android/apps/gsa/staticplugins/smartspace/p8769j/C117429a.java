package com.google.android.apps.gsa.staticplugins.smartspace.p8769j;

import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85003f;
import com.google.android.apps.gsa.search.core.p6519al.p6690db.C85299b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.search.assistant.platform.pcp.featuredata.C123819aj;
import com.google.android.apps.search.assistant.platform.pcp.p9339i.C124100bz;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.C131650d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.j.a */
/* compiled from: PG */
public final class C117429a implements C86686h {

    /* renamed from: a */
    private static final C59071e f325936a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.smartspace.j.a");

    /* renamed from: c */
    private final C86610af f325937c;

    /* renamed from: d */
    private final C85299b f325938d;

    /* renamed from: e */
    private final C85003f f325939e;

    /* renamed from: f */
    private final C86124t f325940f;

    /* renamed from: g */
    private final C123819aj f325941g;

    /* renamed from: h */
    private final C131650d f325942h;

    /* renamed from: i */
    private final C124100bz f325943i;

    public C117429a(C86610af afVar, C85299b bVar, C85003f fVar, C86124t tVar, C123819aj ajVar, C131650d dVar, C124100bz bzVar) {
        this.f325937c = afVar;
        this.f325938d = bVar;
        this.f325939e = fVar;
        this.f325940f = tVar;
        this.f325941g = ajVar;
        this.f325942h = dVar;
        this.f325943i = bzVar;
    }

    /* renamed from: b */
    public final /* synthetic */ C86726f mo80291b(C21370a aVar) {
        return C86685g.m139632a(aVar);
    }

    /* renamed from: e */
    public final /* synthetic */ C58528ij mo80292e() {
        return C86686h.f234170b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01a2  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80293f(long r5, com.google.android.apps.gsa.search.shared.service.ClientEventData r7, com.google.android.apps.gsa.search.core.service.p6848e.C86681c r8) {
        /*
            r4 = this;
            com.google.android.apps.gsa.search.shared.service.b.bw r8 = r7.f236955a
            int r8 = r8.f237480b
            com.google.android.apps.gsa.search.shared.service.b.bu r8 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.m142761a(r8)
            if (r8 != 0) goto L_0x000c
            com.google.android.apps.gsa.search.shared.service.b.bu r8 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.UNKNOWN
        L_0x000c:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r8 = r8.ordinal()
            r0 = 167(0xa7, float:2.34E-43)
            r1 = 1
            if (r8 == r0) goto L_0x004e
            r7 = 168(0xa8, float:2.35E-43)
            if (r8 == r7) goto L_0x001c
            return
        L_0x001c:
            com.google.android.apps.gsa.search.shared.service.b.xe r7 = com.google.android.apps.gsa.search.shared.service.p6935b.C88317xe.f238841c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.xd r7 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88316xd) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.android.apps.gsa.search.shared.service.b.xe r8 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88317xe) r8
            int r0 = r8.f238843a
            r0 = r0 | r1
            r8.f238843a = r0
            r8.f238844b = r1
            com.google.protobuf.bv r7 = r7.build()
            com.google.android.apps.gsa.search.shared.service.b.xe r7 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88317xe) r7
            com.google.android.apps.gsa.search.shared.service.al r8 = new com.google.android.apps.gsa.search.shared.service.al
            com.google.android.apps.gsa.search.shared.service.b.um r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88244um.SMARTSPACE_READY_QUERY_RESPONSE
            r8.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C88244um) r0)
            com.google.protobuf.bt r0 = com.google.android.apps.gsa.search.shared.service.p6935b.C88315xc.f238840a
            r8.mo81965b(r0, r7)
            com.google.android.apps.gsa.search.shared.service.ServiceEventData r7 = r8.mo81964a()
            com.google.android.apps.gsa.search.core.service.af r8 = r4.f325937c
            r8.mo80229j(r5, r7)
            return
        L_0x004e:
            com.google.protobuf.bt r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C88311wz.f238834a
            com.google.android.apps.gsa.search.shared.service.b.bw r6 = r7.f236955a
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r6.mo58887l(r5)
            com.google.protobuf.bf r6 = r6.f169962ag
            com.google.protobuf.bs r5 = r5.f169971d
            boolean r5 = r6.mo58857o(r5)
            java.lang.String r6 = "SSGUSessionCntrl"
            if (r5 != 0) goto L_0x0079
            com.google.common.f.e r5 = f325936a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r7, r6)
            java.lang.String r6 = "SmartspaceGenericUpdateEvent extension is missing. Ignoring event."
            r7 = 33122(0x8162, float:4.6414E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
            return
        L_0x0079:
            com.google.protobuf.bt r5 = com.google.android.apps.gsa.search.shared.service.p6935b.C88311wz.f238834a
            com.google.android.apps.gsa.search.shared.service.b.bw r7 = r7.f236955a
            com.google.protobuf.bt r5 = com.google.protobuf.C62942bv.checkIsLite(r5)
            r7.mo58887l(r5)
            com.google.protobuf.bf r7 = r7.f169962ag
            com.google.protobuf.bs r8 = r5.f169971d
            java.lang.Object r7 = r7.mo58854l(r8)
            if (r7 != 0) goto L_0x0091
            java.lang.Object r5 = r5.f169969b
            goto L_0x0095
        L_0x0091:
            java.lang.Object r5 = r5.mo58889c(r7)
        L_0x0095:
            com.google.android.apps.gsa.search.shared.service.b.xb r5 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88314xb) r5
            if (r5 != 0) goto L_0x00ad
            com.google.common.f.e r5 = f325936a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r7, r6)
            java.lang.String r6 = "SmartspaceGenericUpdateEvent contains no data."
            r7 = 33121(0x8161, float:4.6412E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
            return
        L_0x00ad:
            com.google.android.apps.search.assistant.verticals.ambient.smartspace.d r7 = r4.f325942h
            java.lang.String r8 = "SmartspaceUpdate_"
            com.google.android.libraries.performance.primes.au r8 = com.google.android.libraries.performance.primes.C31164au.m58092b(r8)
            com.google.android.libraries.performance.primes.au[] r0 = new com.google.android.libraries.performance.primes.C31164au[r1]
            r2 = 0
            com.google.assistant.c.cr r3 = com.google.assistant.p3886c.C50794cr.TIPS
            com.google.android.libraries.performance.primes.au r2 = com.google.android.libraries.performance.primes.C31164au.m58093c(r2, r3)
            r3 = 0
            r0[r3] = r2
            com.google.android.libraries.performance.primes.au r8 = com.google.android.libraries.performance.primes.C31164au.m58091a(r8, r0)
            r7.mo110242a(r8)
            com.google.android.apps.search.assistant.platform.pcp.i.bz r7 = r4.f325943i
            r8 = 100002(0x186a2, float:1.40133E-40)
            r7.mo106282a(r8)
            com.google.android.apps.gsa.search.core.i.t r7 = r4.f325940f
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247660lO
            boolean r7 = r7.mo79746e(r8)
            if (r7 == 0) goto L_0x01bc
            com.google.android.apps.gsa.search.core.i.t r7 = r4.f325940f
            com.google.android.apps.gsa.shared.m.d r8 = com.google.android.apps.gsa.shared.p7066m.C90070dv.f249749a
            boolean r7 = r7.mo79746e(r8)
            if (r7 == 0) goto L_0x01b6
            int r7 = r5.f238838a
            r7 = r7 & r1
            if (r7 == 0) goto L_0x0167
            com.google.protobuf.z r5 = r5.f238839b     // Catch:{ ct -> 0x0159 }
            com.google.protobuf.ba r7 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0159 }
            com.google.android.apps.gsa.smartspace.m r8 = com.google.android.apps.gsa.smartspace.C92117m.f256824i     // Catch:{ ct -> 0x0159 }
            com.google.protobuf.bv r5 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r8, (com.google.protobuf.C63088z) r5, (com.google.protobuf.C62921ba) r7)     // Catch:{ ct -> 0x0159 }
            com.google.android.apps.gsa.smartspace.m r5 = (com.google.android.apps.gsa.smartspace.C92117m) r5     // Catch:{ ct -> 0x0159 }
            int r7 = r5.f256826a     // Catch:{ ct -> 0x0159 }
            r7 = r7 & 64
            if (r7 == 0) goto L_0x0167
            int r7 = r5.f256832g     // Catch:{ ct -> 0x0159 }
            int r7 = com.google.android.apps.gsa.smartspace.C92116l.m151154a(r7)     // Catch:{ ct -> 0x0159 }
            if (r7 != 0) goto L_0x0106
            r7 = 1
        L_0x0106:
            int r7 = r7 + -1
            r8 = 7
            if (r7 == r8) goto L_0x010e
            com.google.common.base.b r5 = com.google.common.base.C58836b.f156633a     // Catch:{ ct -> 0x0159 }
            goto L_0x0169
        L_0x010e:
            com.google.android.apps.search.assistant.platform.pcp.f.bz r7 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123759bz.f341867e     // Catch:{ ct -> 0x0159 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ ct -> 0x0159 }
            com.google.android.apps.search.assistant.platform.pcp.f.by r7 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123758by) r7     // Catch:{ ct -> 0x0159 }
            java.lang.String r8 = r5.f256827b     // Catch:{ ct -> 0x0159 }
            r7.copyOnWrite()     // Catch:{ ct -> 0x0159 }
            com.google.protobuf.bv r0 = r7.instance     // Catch:{ ct -> 0x0159 }
            com.google.android.apps.search.assistant.platform.pcp.f.bz r0 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123759bz) r0     // Catch:{ ct -> 0x0159 }
            r8.getClass()     // Catch:{ ct -> 0x0159 }
            int r2 = r0.f341869a     // Catch:{ ct -> 0x0159 }
            r1 = r1 | r2
            r0.f341869a = r1     // Catch:{ ct -> 0x0159 }
            r0.f341870b = r8     // Catch:{ ct -> 0x0159 }
            java.lang.String r8 = r5.f256828c     // Catch:{ ct -> 0x0159 }
            r7.copyOnWrite()     // Catch:{ ct -> 0x0159 }
            com.google.protobuf.bv r0 = r7.instance     // Catch:{ ct -> 0x0159 }
            com.google.android.apps.search.assistant.platform.pcp.f.bz r0 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123759bz) r0     // Catch:{ ct -> 0x0159 }
            r8.getClass()     // Catch:{ ct -> 0x0159 }
            int r1 = r0.f341869a     // Catch:{ ct -> 0x0159 }
            r1 = r1 | 2
            r0.f341869a = r1     // Catch:{ ct -> 0x0159 }
            r0.f341871c = r8     // Catch:{ ct -> 0x0159 }
            long r0 = r5.f256831f     // Catch:{ ct -> 0x0159 }
            r7.copyOnWrite()     // Catch:{ ct -> 0x0159 }
            com.google.protobuf.bv r5 = r7.instance     // Catch:{ ct -> 0x0159 }
            com.google.android.apps.search.assistant.platform.pcp.f.bz r5 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123759bz) r5     // Catch:{ ct -> 0x0159 }
            int r8 = r5.f341869a     // Catch:{ ct -> 0x0159 }
            r8 = r8 | 4
            r5.f341869a = r8     // Catch:{ ct -> 0x0159 }
            r5.f341872d = r0     // Catch:{ ct -> 0x0159 }
            com.google.protobuf.bv r5 = r7.build()     // Catch:{ ct -> 0x0159 }
            com.google.android.apps.search.assistant.platform.pcp.f.bz r5 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123759bz) r5     // Catch:{ ct -> 0x0159 }
            com.google.common.base.ax r5 = com.google.common.base.C58833ax.m90834k(r5)     // Catch:{ ct -> 0x0159 }
            goto L_0x0169
        L_0x0159:
            r5 = move-exception
            com.google.common.f.e r7 = com.google.android.apps.gsa.opa.smartspace.p6457f.C83787a.f228364a
            com.google.common.f.x r7 = r7.mo56225c()
            java.lang.String r8 = "Invalid SmartspaceGenericUpdate proto bytes"
            r0 = 6863(0x1acf, float:9.617E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r5)).mo56372aa(r0)).mo56386p(r8)
        L_0x0167:
            com.google.common.base.b r5 = com.google.common.base.C58836b.f156633a
        L_0x0169:
            boolean r7 = r5.mo56113h()
            if (r7 == 0) goto L_0x01a2
            java.lang.Object r5 = r5.mo56107c()
            com.google.android.apps.search.assistant.platform.pcp.f.bz r5 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123759bz) r5
            java.lang.String r6 = r5.f341870b
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x018b
            java.lang.String r6 = r5.f341871c
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x018b
            com.google.android.apps.search.assistant.platform.pcp.featuredata.aj r5 = r4.f325941g
            r5.mo106136a()
            return
        L_0x018b:
            com.google.android.apps.search.assistant.platform.pcp.featuredata.aj r6 = r4.f325941g
            com.google.apps.tiktok.account.data.b r7 = r6.f342048b
            com.google.common.util.concurrent.cx r7 = r7.mo50247d()
            com.google.android.apps.search.assistant.platform.pcp.featuredata.ab r8 = new com.google.android.apps.search.assistant.platform.pcp.featuredata.ab
            r8.<init>(r6, r5)
            java.util.concurrent.Executor r5 = r6.f342051e
            com.google.common.util.concurrent.s r6 = com.google.apps.tiktok.tracing.C47810es.m84966f(r8)
            com.google.common.util.concurrent.C60922j.m93045h(r7, r6, r5)
            return
        L_0x01a2:
            com.google.common.f.e r5 = f325936a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r7, r6)
            java.lang.String r6 = "Tips data could not be retrieved"
            r7 = 33120(0x8160, float:4.6411E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
            return
        L_0x01b6:
            com.google.android.apps.gsa.search.core.al.bp.f r6 = r4.f325939e
            r6.mo78602b(r5)
            return
        L_0x01bc:
            com.google.protobuf.z r5 = r5.f238839b
            byte[] r5 = r5.mo59174N()
            if (r5 == 0) goto L_0x01ce
            int r7 = r5.length
            if (r7 != 0) goto L_0x01c8
            goto L_0x01ce
        L_0x01c8:
            com.google.android.apps.gsa.search.core.al.db.b r6 = r4.f325938d
            r6.mo78850b(r5)
            return
        L_0x01ce:
            com.google.common.f.e r5 = f325936a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5.mo56378ag(r7, r6)
            java.lang.String r6 = "Received empty data."
            r7 = 33118(0x815e, float:4.6408E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.smartspace.p8769j.C117429a.mo80293f(long, com.google.android.apps.gsa.search.shared.service.ClientEventData, com.google.android.apps.gsa.search.core.service.e.c):void");
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r(getClass().getName());
    }

    /* renamed from: h */
    public final void mo80295h() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo80298k(ClientConfig clientConfig, ClientConfig clientConfig2) {
        return C86685g.m139633b(clientConfig, clientConfig2);
    }

    /* renamed from: l */
    public final /* synthetic */ boolean mo80299l() {
        return false;
    }
}
