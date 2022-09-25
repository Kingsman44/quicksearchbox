package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.p770b;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.C12221c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.C12223e;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.C12224f;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.p770b.p771a.C12204b;
import com.google.android.libraries.assistant.auto.tng.p1028l.C13733aq;
import com.google.android.libraries.assistant.auto.tng.p1028l.C13735as;
import com.google.android.libraries.assistant.auto.tng.p1028l.C13883n;
import com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.p1034a.C13830a;
import com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.p1034a.C13833d;
import com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.p1034a.C13847r;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.p */
/* compiled from: PG */
public final class C12219p implements C12221c {

    /* renamed from: c */
    private static final C59071e f38949c = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.p");

    /* renamed from: a */
    public final Executor f38950a;

    /* renamed from: b */
    public final C15481g f38951b;

    /* renamed from: d */
    private final C13735as f38952d;

    /* renamed from: e */
    private final C12213j f38953e;

    /* renamed from: f */
    private final C12204b f38954f;

    /* renamed from: g */
    private final C69464a f38955g;

    /* renamed from: h */
    private final C13883n f38956h;

    public C12219p(C13735as asVar, C12213j jVar, C12204b bVar, C13883n nVar, Executor executor, C69464a aVar, C15481g gVar) {
        this.f38952d = asVar;
        this.f38953e = jVar;
        this.f38954f = bVar;
        this.f38956h = nVar;
        this.f38950a = executor;
        this.f38955g = aVar;
        this.f38951b = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        throw r10;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x01be */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8 A[Catch:{ all -> 0x01a3, all -> 0x01a8, ct -> 0x008b, all -> 0x01bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f7 A[SYNTHETIC, Splitter:B:40:0x00f7] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20498a(com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.C12223e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "HybridTextPipeline.execute"
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r0)
            com.google.common.f.e r1 = f38949c     // Catch:{ all -> 0x01bf }
            com.google.common.f.x r1 = r1.mo56224b()     // Catch:{ all -> 0x01bf }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x01bf }
            r2 = 44112(0xac50, float:6.1814E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)     // Catch:{ all -> 0x01bf }
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1     // Catch:{ all -> 0x01bf }
            java.lang.String r2 = "Executing text request"
            r1.mo56386p(r2)     // Catch:{ all -> 0x01bf }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.i r1 = r10.mo20486a()     // Catch:{ all -> 0x01bf }
            boolean r1 = r1.f40384c     // Catch:{ all -> 0x01bf }
            r2 = 0
            if (r1 == 0) goto L_0x0032
            com.google.android.libraries.assistant.auto.tng.l.n r1 = r9.f38956h     // Catch:{ all -> 0x01bf }
            com.google.common.util.concurrent.cx r1 = r1.mo21336a()     // Catch:{ all -> 0x01bf }
            java.lang.String r3 = "conversationContext reset failed"
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x01bf }
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r1, r3, r4)     // Catch:{ all -> 0x01bf }
        L_0x0032:
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.ak r1 = r10.mo20487b()     // Catch:{ all -> 0x01bf }
            int r1 = r1.f40449a     // Catch:{ all -> 0x01bf }
            r3 = 1
            r4 = 2
            if (r1 != r4) goto L_0x00a6
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.ak r1 = r10.mo20487b()     // Catch:{ all -> 0x01bf }
            int r5 = r1.f40449a     // Catch:{ all -> 0x01bf }
            if (r5 != r4) goto L_0x0049
            java.lang.Object r1 = r1.f40450b     // Catch:{ all -> 0x01bf }
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.ah r1 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13020ah) r1     // Catch:{ all -> 0x01bf }
            goto L_0x004b
        L_0x0049:
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.ah r1 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13020ah.f40439c     // Catch:{ all -> 0x01bf }
        L_0x004b:
            int r1 = r1.f40441a     // Catch:{ all -> 0x01bf }
            r1 = r1 & r3
            if (r1 == 0) goto L_0x00a6
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.ak r1 = r10.mo20487b()     // Catch:{ all -> 0x01bf }
            int r5 = r1.f40449a     // Catch:{ all -> 0x01bf }
            if (r5 != r4) goto L_0x005d
            java.lang.Object r1 = r1.f40450b     // Catch:{ all -> 0x01bf }
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.ah r1 = (com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13020ah) r1     // Catch:{ all -> 0x01bf }
            goto L_0x005f
        L_0x005d:
            com.google.android.libraries.assistant.auto.tng.assistant.d.c.ah r1 = com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13020ah.f40439c     // Catch:{ all -> 0x01bf }
        L_0x005f:
            com.google.assistant.e.j.du r1 = r1.f40442b     // Catch:{ all -> 0x01bf }
            if (r1 != 0) goto L_0x0065
            com.google.assistant.e.j.du r1 = com.google.assistant.p3897e.p3921j.C51805du.f135924e     // Catch:{ all -> 0x01bf }
        L_0x0065:
            com.google.protobuf.dn r1 = r1.f135929d     // Catch:{ all -> 0x01bf }
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)     // Catch:{ all -> 0x01bf }
            java.lang.String r4 = "widget_dialog_info_input"
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x01bf }
            com.google.assistant.e.j.ka r1 = (com.google.assistant.p3897e.p3921j.C52230ka) r1     // Catch:{ all -> 0x01bf }
            if (r1 != 0) goto L_0x0078
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x01bf }
            goto L_0x00a8
        L_0x0078:
            com.google.protobuf.z r4 = r1.f137061c     // Catch:{ ct -> 0x008b }
            com.google.protobuf.ba r5 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x008b }
            com.google.assistant.e.j.apy r6 = com.google.assistant.p3897e.p3921j.apy.f135589f     // Catch:{ ct -> 0x008b }
            com.google.protobuf.bv r4 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r6, (com.google.protobuf.C63088z) r4, (com.google.protobuf.C62921ba) r5)     // Catch:{ ct -> 0x008b }
            com.google.assistant.e.j.apy r4 = (com.google.assistant.p3897e.p3921j.apy) r4     // Catch:{ ct -> 0x008b }
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r4)     // Catch:{ all -> 0x01bf }
            goto L_0x00a8
        L_0x008b:
            com.google.common.f.e r4 = com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.p770b.p771a.C12204b.f38919a     // Catch:{ all -> 0x01bf }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ all -> 0x01bf }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x01bf }
            r5 = 44121(0xac59, float:6.1827E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ all -> 0x01bf }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x01bf }
            java.lang.String r5 = "unexpected protobuf type: %s"
            java.lang.String r1 = r1.f137060b     // Catch:{ all -> 0x01bf }
            r4.mo56389s(r5, r1)     // Catch:{ all -> 0x01bf }
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x01bf }
            goto L_0x00a8
        L_0x00a6:
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x01bf }
        L_0x00a8:
            boolean r4 = r1.mo56113h()     // Catch:{ all -> 0x01bf }
            if (r4 == 0) goto L_0x00f7
            java.lang.Object r4 = r1.mo56107c()     // Catch:{ all -> 0x01bf }
            com.google.assistant.e.j.apy r4 = (com.google.assistant.p3897e.p3921j.apy) r4     // Catch:{ all -> 0x01bf }
            boolean r4 = r4.f135595e     // Catch:{ all -> 0x01bf }
            if (r4 != 0) goto L_0x00f7
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.a.b r10 = r9.f38954f     // Catch:{ all -> 0x01bf }
            java.lang.Object r1 = r1.mo56107c()     // Catch:{ all -> 0x01bf }
            com.google.assistant.e.j.apy r1 = (com.google.assistant.p3897e.p3921j.apy) r1     // Catch:{ all -> 0x01bf }
            com.google.android.apps.gsa.binaries.satin.app.baj r2 = r10.f38920b     // Catch:{ all -> 0x01bf }
            com.google.cd.i.g r10 = r10.f38921c     // Catch:{ all -> 0x01bf }
            java.lang.String r3 = "WidgetTtsInteraction"
            com.google.cd.a.a r10 = r10.mo54628a(r3)     // Catch:{ all -> 0x01bf }
            r2.f204877c = r10     // Catch:{ all -> 0x01bf }
            r1.getClass()
            r2.f204876b = r1     // Catch:{ all -> 0x01bf }
            com.google.assistant.e.j.apy r10 = r2.f204876b     // Catch:{ all -> 0x01bf }
            java.lang.Class<com.google.assistant.e.j.apy> r1 = com.google.assistant.p3897e.p3921j.apy.class
            dagger.p5294a.C68225k.m98529a(r10, r1)     // Catch:{ all -> 0x01bf }
            com.google.cd.a.a r10 = r2.f204877c     // Catch:{ all -> 0x01bf }
            java.lang.Class<com.google.cd.a.a> r1 = com.google.p4449cd.p4450a.C57934a.class
            dagger.p5294a.C68225k.m98529a(r10, r1)     // Catch:{ all -> 0x01bf }
            com.google.android.apps.gsa.binaries.satin.app.bal r10 = new com.google.android.apps.gsa.binaries.satin.app.bal     // Catch:{ all -> 0x01bf }
            com.google.android.apps.gsa.binaries.satin.app.aqy r1 = r2.f204875a     // Catch:{ all -> 0x01bf }
            com.google.assistant.e.j.apy r3 = r2.f204876b     // Catch:{ all -> 0x01bf }
            com.google.cd.a.a r2 = r2.f204877c     // Catch:{ all -> 0x01bf }
            r10.<init>(r1, r3, r2)     // Catch:{ all -> 0x01bf }
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.a.a r1 = new com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.a.a     // Catch:{ all -> 0x01bf }
            r1.<init>(r10)     // Catch:{ all -> 0x01bf }
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60856cj.m92900i(r1)     // Catch:{ all -> 0x01bf }
            r0.close()
            return r10
        L_0x00f7:
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.j r1 = r9.f38953e     // Catch:{ all -> 0x01bf }
            com.google.android.libraries.assistant.auto.tng.assistant.d.a.a.i r4 = r10.mo20486a()     // Catch:{ all -> 0x01bf }
            com.google.common.util.concurrent.cx r5 = r10.mo20488c()     // Catch:{ all -> 0x01bf }
            java.lang.String r6 = "FluidActionsPipeline.getResponse"
            com.google.apps.tiktok.tracing.bi r6 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r6)     // Catch:{ all -> 0x01bf }
            com.google.android.libraries.assistant.auto.tng.o.a.g r7 = r1.f38934d     // Catch:{ all -> 0x01a3 }
            com.google.android.libraries.search.b.i.g r8 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97488bG     // Catch:{ all -> 0x01a3 }
            r7.mo22352b(r8)     // Catch:{ all -> 0x01a3 }
            boolean r7 = r1.f38938h     // Catch:{ all -> 0x01a3 }
            if (r7 != 0) goto L_0x0129
            com.google.android.libraries.assistant.auto.tng.o.a.g r1 = r1.f38934d     // Catch:{ all -> 0x01a3 }
            com.google.android.libraries.search.b.i.g r4 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97489bH     // Catch:{ all -> 0x01a3 }
            com.google.net.a.a.b r5 = com.google.net.p4726a.p4727a.C62722b.UNIMPLEMENTED     // Catch:{ all -> 0x01a3 }
            com.google.android.libraries.search.b.i.a r4 = r4.mo40815i(r5)     // Catch:{ all -> 0x01a3 }
            r1.mo22352b(r4)     // Catch:{ all -> 0x01a3 }
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x01a3 }
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)     // Catch:{ all -> 0x01a3 }
        L_0x0125:
            r6.close()     // Catch:{ all -> 0x01bf }
            goto L_0x0165
        L_0x0129:
            boolean r7 = r1.f38939i     // Catch:{ all -> 0x01a3 }
            if (r7 == 0) goto L_0x0145
            boolean r4 = r4.f40384c     // Catch:{ all -> 0x01a3 }
            if (r4 == 0) goto L_0x0145
            com.google.android.libraries.assistant.auto.tng.o.a.g r1 = r1.f38934d     // Catch:{ all -> 0x01a3 }
            com.google.android.libraries.search.b.i.g r4 = com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a.f97489bH     // Catch:{ all -> 0x01a3 }
            com.google.net.a.a.b r5 = com.google.net.p4726a.p4727a.C62722b.FAILED_PRECONDITION     // Catch:{ all -> 0x01a3 }
            com.google.android.libraries.search.b.i.a r4 = r4.mo40815i(r5)     // Catch:{ all -> 0x01a3 }
            r1.mo22352b(r4)     // Catch:{ all -> 0x01a3 }
            com.google.common.base.b r1 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x01a3 }
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)     // Catch:{ all -> 0x01a3 }
            goto L_0x0125
        L_0x0145:
            com.google.apps.tiktok.tracing.contrib.b.f r4 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r5)     // Catch:{ all -> 0x01a3 }
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.a r5 = new com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.a     // Catch:{ all -> 0x01a3 }
            r5.<init>(r1)     // Catch:{ all -> 0x01a3 }
            java.util.concurrent.Executor r7 = r1.f38935e     // Catch:{ all -> 0x01a3 }
            com.google.apps.tiktok.tracing.contrib.b.f r4 = r4.mo51516i(r5, r7)     // Catch:{ all -> 0x01a3 }
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.b r5 = new com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.b     // Catch:{ all -> 0x01a3 }
            r5.<init>(r1)     // Catch:{ all -> 0x01a3 }
            java.lang.Class<java.lang.Throwable> r7 = java.lang.Throwable.class
            java.util.concurrent.Executor r1 = r1.f38935e     // Catch:{ all -> 0x01a3 }
            com.google.apps.tiktok.tracing.contrib.b.f r1 = r4.mo51513e(r7, r5, r1)     // Catch:{ all -> 0x01a3 }
            r6.mo51417a(r1)     // Catch:{ all -> 0x01a3 }
            goto L_0x0125
        L_0x0165:
            g.a.a r2 = r9.f38955g     // Catch:{ all -> 0x01bf }
            java.lang.Object r2 = r2.mo17428b()     // Catch:{ all -> 0x01bf }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x01bf }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x01bf }
            if (r2 == 0) goto L_0x018d
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.f r10 = r9.mo20499b(r10)     // Catch:{ all -> 0x01bf }
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.m r2 = new com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.m     // Catch:{ all -> 0x01bf }
            r2.<init>(r9, r10)     // Catch:{ all -> 0x01bf }
            java.util.concurrent.Executor r10 = r9.f38950a     // Catch:{ all -> 0x01bf }
            com.google.common.util.concurrent.s r2 = com.google.apps.tiktok.tracing.C47810es.m84966f(r2)     // Catch:{ all -> 0x01bf }
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60922j.m93045h(r1, r2, r10)     // Catch:{ all -> 0x01bf }
            r0.mo51417a(r10)     // Catch:{ all -> 0x01bf }
            r0.close()
            return r10
        L_0x018d:
            com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.n r2 = new com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.b.n     // Catch:{ all -> 0x01bf }
            r2.<init>(r9, r10)     // Catch:{ all -> 0x01bf }
            java.util.concurrent.Executor r10 = r9.f38950a     // Catch:{ all -> 0x01bf }
            com.google.common.base.ah r2 = com.google.apps.tiktok.tracing.C47810es.m84963c(r2)     // Catch:{ all -> 0x01bf }
            com.google.common.util.concurrent.cx r10 = com.google.common.util.concurrent.C60922j.m93044g(r1, r2, r10)     // Catch:{ all -> 0x01bf }
            r0.mo51417a(r10)     // Catch:{ all -> 0x01bf }
            r0.close()
            return r10
        L_0x01a3:
            r10 = move-exception
            r6.close()     // Catch:{ all -> 0x01a8 }
            goto L_0x01be
        L_0x01a8:
            r1 = move-exception
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x01be }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r4[r2] = r5     // Catch:{ Exception -> 0x01be }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r4 = r5.getDeclaredMethod(r6, r4)     // Catch:{ Exception -> 0x01be }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01be }
            r3[r2] = r1     // Catch:{ Exception -> 0x01be }
            r4.invoke(r10, r3)     // Catch:{ Exception -> 0x01be }
        L_0x01be:
            throw r10     // Catch:{ all -> 0x01bf }
        L_0x01bf:
            r10 = move-exception
            r0.close()     // Catch:{ all -> 0x01c4 }
            goto L_0x01c8
        L_0x01c4:
            r0 = move-exception
            com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.p770b.C12215l.m28138a(r10, r0)
        L_0x01c8:
            goto L_0x01ca
        L_0x01c9:
            throw r10
        L_0x01ca:
            goto L_0x01c9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.p770b.C12219p.mo20498a(com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.e):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final C12224f mo20499b(C12223e eVar) {
        C47558bi a = C47831fm.m85006a("HybridTextPipeline.defaultResponse");
        try {
            C13847r rVar = new C13847r();
            C13733aq a2 = this.f38952d.mo21235a(rVar);
            C13833d dVar = new C13833d();
            eVar.getClass();
            dVar.f42129a = new C13830a(eVar);
            dVar.mo21285b(eVar.mo20486a().f40386e);
            C60870cx b = a2.mo21234b(dVar.mo21284a());
            a.mo51417a(b);
            C12220q qVar = new C12220q(a2, rVar, b);
            a.close();
            return qVar;
        } catch (Throwable th) {
            C12215l.m28138a(th, th);
        }
        throw th;
    }
}
