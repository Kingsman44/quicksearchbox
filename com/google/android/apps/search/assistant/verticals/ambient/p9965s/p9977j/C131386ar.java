package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.search.assistant.platform.pcp.api.C123587c;
import com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9900d.C130500a;
import com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9900d.C130501b;
import com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9900d.C130502c;
import com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9900d.C130503d;
import com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9900d.C130505f;
import com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9900d.C130508i;
import com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9900d.C130509j;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130936bu;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130940by;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130944cb;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130945cc;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130946cd;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130947ce;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p4016z.C53715bm;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5460g.p5461a.C69464a;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.j.ar */
/* compiled from: PG */
public final class C131386ar implements C130505f {

    /* renamed from: a */
    public final Context f359161a;

    /* renamed from: b */
    public final C69585o f359162b;

    /* renamed from: c */
    public final C69585o f359163c;

    /* renamed from: d */
    public final C131379ak f359164d;

    /* renamed from: e */
    public final C130508i f359165e;

    /* renamed from: f */
    public final C131391aw f359166f;

    /* renamed from: g */
    public final C69464a f359167g;

    /* renamed from: h */
    public final C58974d f359168h;

    /* renamed from: i */
    private final C71422aw f359169i;

    /* renamed from: j */
    private final C123587c f359170j;

    /* renamed from: k */
    private final C130947ce f359171k;

    /* renamed from: l */
    private final PackageManager f359172l;

    public C131386ar(Context context, C71422aw awVar, C69585o oVar, C69585o oVar2, C123587c cVar, C131379ak akVar, C130508i iVar, C131391aw awVar2, C130947ce ceVar, PackageManager packageManager, C130603a aVar, C69464a aVar2) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(oVar2, "backgroundContext");
        C69664n.m101061g(iVar, "mediaDisplayStatusTracker");
        C69664n.m101061g(packageManager, "packageManager");
        C69664n.m101061g(aVar, "loggerFactory");
        this.f359161a = context;
        this.f359169i = awVar;
        this.f359162b = oVar;
        this.f359163c = oVar2;
        this.f359170j = cVar;
        this.f359164d = akVar;
        this.f359165e = iVar;
        this.f359166f = awVar2;
        this.f359171k = ceVar;
        this.f359172l = packageManager;
        this.f359167g = aVar2;
        this.f359168h = aVar.mo109740b(this);
    }

    /* renamed from: g */
    private final void m213847g(C130946cd cdVar, C130509j jVar) {
        if (!(jVar instanceof C130945cc)) {
            m213848h(cdVar, jVar);
        } else {
            this.f359171k.mo110011a(cdVar, (C130945cc) jVar);
        }
    }

    /* renamed from: h */
    private final void m213848h(C130946cd cdVar, C130509j jVar) {
        ((C58970a) this.f359168h.mo56225c()).mo56389s("Unexpected suggestion type encountered: %s", jVar);
        this.f359171k.mo110011a(cdVar, C130936bu.f358273a);
    }

    /* renamed from: a */
    public final void mo109711a(C130502c cVar) {
        C69664n.m101061g(cVar, "result");
        C69664n.m101061g(cVar, "result");
        if (cVar instanceof C130501b) {
            this.f359171k.mo110011a(C130946cd.FAILURE_PRODUCER, C130936bu.f358273a);
        } else if (cVar instanceof C130500a) {
            C130509j jVar = ((C130500a) cVar).f357497a;
            if (jVar instanceof C130944cb) {
                this.f359171k.mo110011a(C130946cd.FAILURE_TIMEOUT, (C130945cc) jVar);
            } else if (!(jVar instanceof C130940by) && !(jVar instanceof C130945cc)) {
                m213848h(C130946cd.FAILURE_PRODUCER, jVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo109712b(C130503d dVar) {
        C69664n.m101061g(dVar, "result");
        C69664n.m101061g(dVar, "result");
        m213847g(C130946cd.FAILURE_AIAI, dVar.f357500a);
    }

    /* renamed from: c */
    public final void mo109713c(C130503d dVar) {
        C69664n.m101061g(dVar, "result");
        C69664n.m101061g(dVar, "result");
        m213847g(C130946cd.SUCCESS_AIAI, dVar.f357500a);
    }

    /* renamed from: d */
    public final C58485gu mo110138d() {
        C58485gu n = C58485gu.m89846n(C50794cr.MEDIA);
        C69664n.m101060f(n, "of(CardType.MEDIA)");
        return n;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C60870cx mo110139e(C106596h hVar, C53715bm bmVar, Object obj) {
        Void voidR = (Void) obj;
        if (bmVar != null) {
            return C71663i.m104692e(this.f359169i, (C71424ay) null, new C131380al(bmVar, this, (C69577g) null), 3);
        }
        ((C58970a) this.f359168h.mo56225c()).mo56386p("TriggeringEvent is null.");
        return C60856cj.m92899h(new IllegalArgumentException("TriggeringEvent is null."));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.android.apps.search.assistant.verticals.ambient.s.j.ar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: com.google.android.apps.search.assistant.verticals.ambient.s.j.ar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: com.google.android.apps.search.assistant.verticals.ambient.s.j.ar} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo110153f(p5462h.p5466c.C69577g r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r0 instanceof com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131381am
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.google.android.apps.search.assistant.verticals.ambient.s.j.am r2 = (com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131381am) r2
            int r3 = r2.f359147d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f359147d = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.apps.search.assistant.verticals.ambient.s.j.am r2 = new com.google.android.apps.search.assistant.verticals.ambient.s.j.am
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f359145b
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f359147d
            r5 = 1
            r6 = 9
            if (r4 == 0) goto L_0x0038
            if (r4 != r5) goto L_0x0030
            java.lang.Object r2 = r2.f359144a
            p5462h.C69714l.m101134b(r0)
            goto L_0x00a5
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0038:
            p5462h.C69714l.m101134b(r0)
            com.google.android.apps.search.assistant.platform.pcp.api.c r0 = r1.f359170j
            com.google.assistant.s.a.j r4 = com.google.assistant.p3994s.p3995a.C53306j.AMBIENT_ASSISTANT
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            java.util.Set r7 = p5462h.p5463a.C69514bd.m100887a(r7)
            com.google.android.apps.search.assistant.platform.pcp.f.bv r14 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv.f341837o
            com.google.android.apps.search.assistant.platform.pcp.f.f r15 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f.f341922a
            com.google.common.f.e r8 = com.google.android.apps.search.assistant.platform.pcp.api.C123597m.f341493a
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r10 = "PCP.DataQuery"
            r8.mo56378ag(r9, r10)
            java.lang.String r9 = "#getCurrentCachedData"
            r10 = 35151(0x894f, float:4.9257E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r10)).mo56386p(r9)
            java.util.Set r13 = com.google.android.apps.search.assistant.platform.pcp.api.C123597m.m202902i(r7)
            com.google.android.apps.search.assistant.platform.pcp.api.m r0 = (com.google.android.apps.search.assistant.platform.pcp.api.C123597m) r0
            r12 = 0
            r16 = 1
            r7 = r0
            r8 = r4
            r9 = r13
            r10 = r14
            r11 = r15
            r6 = r13
            r13 = r16
            com.google.common.util.concurrent.cx r13 = r7.mo106049g(r8, r9, r10, r11, r12, r13)
            com.google.android.apps.search.assistant.platform.pcp.i.ad r7 = r0.f341494b
            com.google.common.b.ij r9 = r7.mo106251d(r4, r6)
            boolean r6 = r0.mo106051k(r9)
            if (r6 == 0) goto L_0x0096
            r12 = 0
            r6 = 1
            r7 = r0
            r8 = r4
            r10 = r14
            r11 = r15
            r14 = r13
            r13 = r6
            com.google.common.util.concurrent.cx r6 = r7.mo106048f(r8, r9, r10, r11, r12, r13)
            com.google.common.util.concurrent.cx r13 = com.google.android.apps.search.assistant.platform.pcp.api.C123597m.m202901h(r14, r6)
            r0.mo106050j(r13, r4)
            goto L_0x009a
        L_0x0096:
            r14 = r13
            r0.mo106050j(r14, r4)
        L_0x009a:
            r2.f359144a = r1
            r2.f359147d = r5
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r13, r2)
            if (r0 == r3) goto L_0x01f3
            r2 = r1
        L_0x00a5:
            com.google.android.apps.search.assistant.platform.pcp.f.bm r0 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm) r0
            com.google.protobuf.cq r0 = r0.f341820a
            boolean r3 = r0.isEmpty()
            r4 = 0
            if (r3 == 0) goto L_0x00c1
            r0 = r2
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ar r0 = (com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131386ar) r0
            com.google.common.f.a.d r0 = r0.f359168h
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            java.lang.String r3 = "PCP returned no ON_DEVICE_MEDIA_RECOMMENDATION for client AMBIENT_ASSISTANT"
            r0.mo56386p(r3)
            r0 = r4
        L_0x00c1:
            if (r0 == 0) goto L_0x01f2
            java.util.Iterator r0 = r0.iterator()
        L_0x00c7:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0121
            java.lang.Object r3 = r0.next()
            r5 = r3
            com.google.android.apps.search.assistant.platform.pcp.f.bk r5 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk) r5
            int r6 = r5.f341810e
            r7 = 9
            if (r6 == r7) goto L_0x00eb
            r3 = r2
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ar r3 = (com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131386ar) r3
            com.google.common.f.a.d r3 = r3.f359168h
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3
            java.lang.String r5 = "PCP is not ON_DEVICE_MEDIA_RECOMMENDATION_VALUE(%d)."
            r3.mo56387q(r5, r7)
            goto L_0x00c7
        L_0x00eb:
            int r6 = r5.f341807b
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0110
            com.google.android.apps.search.assistant.platform.pcp.f.cl r5 = r5.f341816k
            if (r5 != 0) goto L_0x00f7
            com.google.android.apps.search.assistant.platform.pcp.f.cl r5 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123772cl.f341902h
        L_0x00f7:
            com.google.protobuf.z r5 = r5.f341910g
            boolean r5 = r5.mo59173M()
            if (r5 == 0) goto L_0x0122
            r3 = r2
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ar r3 = (com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131386ar) r3
            com.google.common.f.a.d r3 = r3.f359168h
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3
            java.lang.String r5 = "PCP returned ON_DEVICE_MEDIA_RECOMMENDATION without UiInstructions data."
            r3.mo56386p(r5)
            goto L_0x00c7
        L_0x0110:
            r3 = r2
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ar r3 = (com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131386ar) r3
            com.google.common.f.a.d r3 = r3.f359168h
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.a.a r3 = (com.google.common.p4526f.p4527a.C58970a) r3
            java.lang.String r5 = "PCP returned ON_DEVICE_MEDIA_RECOMMENDATION without UiInstructions."
            r3.mo56386p(r5)
            goto L_0x00c7
        L_0x0121:
            r3 = r4
        L_0x0122:
            com.google.android.apps.search.assistant.platform.pcp.f.bk r3 = (com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk) r3
            if (r3 == 0) goto L_0x01f2
            com.google.android.apps.search.assistant.platform.pcp.f.cl r0 = r3.f341816k     // Catch:{ ct -> 0x01dc }
            if (r0 != 0) goto L_0x012c
            com.google.android.apps.search.assistant.platform.pcp.f.cl r0 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123772cl.f341902h     // Catch:{ ct -> 0x01dc }
        L_0x012c:
            com.google.protobuf.z r0 = r0.f341910g     // Catch:{ ct -> 0x01dc }
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x01dc }
            com.google.assistant.c.do r5 = com.google.assistant.p3886c.C50818do.f132293H     // Catch:{ ct -> 0x01dc }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (com.google.protobuf.C63088z) r0, (com.google.protobuf.C62921ba) r3)     // Catch:{ ct -> 0x01dc }
            com.google.assistant.c.do r0 = (com.google.assistant.p3886c.C50818do) r0     // Catch:{ ct -> 0x01dc }
            java.lang.String r3 = "try {\n        Smartspace…      return null\n      }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r3)
            r3 = r2
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ar r3 = (com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131386ar) r3
            com.google.common.f.a.d r5 = r3.f359168h
            com.google.common.f.x r5 = r5.mo56224b()
            com.google.common.f.a.a r5 = (com.google.common.p4526f.p4527a.C58970a) r5
            com.google.assistant.c.dj r6 = r0.f132329z
            if (r6 != 0) goto L_0x0150
            com.google.assistant.c.dj r6 = com.google.assistant.p3886c.C50813dj.f132278a
        L_0x0150:
            com.google.protobuf.bt r7 = com.google.assistant.p3886c.C50761bz.f132094e
            java.lang.String r8 = "ext"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)
            java.lang.Object r6 = com.google.protobuf.p4746a.C62885d.m94956a(r6, r7)
            com.google.assistant.c.bz r6 = (com.google.assistant.p3886c.C50761bz) r6
            com.google.assistant.c.ai r6 = r6.f132097b
            if (r6 != 0) goto L_0x0163
            com.google.assistant.c.ai r6 = com.google.assistant.p3886c.C50697ai.f131903b
        L_0x0163:
            com.google.protobuf.cq r6 = r6.f131905a
            int r6 = r6.size()
            java.lang.String r7 = "SmartspaceCard loaded from PCP SUCCESS: %d media items returned."
            r5.mo56387q(r7, r6)
            com.google.assistant.c.dj r5 = r0.f132329z
            if (r5 != 0) goto L_0x0174
            com.google.assistant.c.dj r5 = com.google.assistant.p3886c.C50813dj.f132278a
        L_0x0174:
            com.google.protobuf.bt r6 = com.google.assistant.p3886c.C50761bz.f132094e
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r8)
            java.lang.Object r5 = com.google.protobuf.p4746a.C62885d.m94956a(r5, r6)
            com.google.assistant.c.bz r5 = (com.google.assistant.p3886c.C50761bz) r5
            com.google.assistant.c.ai r5 = r5.f132097b
            if (r5 != 0) goto L_0x0185
            com.google.assistant.c.ai r5 = com.google.assistant.p3886c.C50697ai.f131903b
        L_0x0185:
            com.google.protobuf.cq r5 = r5.f131905a
            java.lang.String r6 = "smartspaceCard.smartspac…ns\n        .mediaItemList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            java.lang.Object r5 = p5462h.p5463a.C69540x.m100821C(r5)
            com.google.assistant.c.ac r5 = (com.google.assistant.p3886c.C50691ac) r5
            if (r5 == 0) goto L_0x0197
            java.lang.String r5 = r5.f131883d
            goto L_0x0198
        L_0x0197:
            r5 = r4
        L_0x0198:
            if (r5 == 0) goto L_0x01ce
            boolean r6 = p5462h.p5483m.C69764m.m101229h(r5)
            if (r6 == 0) goto L_0x01a1
            goto L_0x01ce
        L_0x01a1:
            r6 = r2
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ar r6 = (com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131386ar) r6     // Catch:{ NameNotFoundException -> 0x01c0 }
            android.content.pm.PackageManager r6 = r6.f359172l     // Catch:{ NameNotFoundException -> 0x01c0 }
            r7 = 0
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo(r5, r7)     // Catch:{ NameNotFoundException -> 0x01c0 }
            boolean r6 = r6.enabled     // Catch:{ NameNotFoundException -> 0x01c0 }
            if (r6 != 0) goto L_0x01bf
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ar r2 = (com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131386ar) r2     // Catch:{ NameNotFoundException -> 0x01c0 }
            com.google.common.f.a.d r0 = r2.f359168h     // Catch:{ NameNotFoundException -> 0x01c0 }
            com.google.common.f.x r0 = r0.mo56226d()     // Catch:{ NameNotFoundException -> 0x01c0 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ NameNotFoundException -> 0x01c0 }
            java.lang.String r2 = "App %s is not enabled."
            r0.mo56389s(r2, r5)     // Catch:{ NameNotFoundException -> 0x01c0 }
            goto L_0x01f2
        L_0x01bf:
            return r0
        L_0x01c0:
            com.google.common.f.a.d r0 = r3.f359168h
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            java.lang.String r2 = "App %s not installed."
            r0.mo56389s(r2, r5)
            goto L_0x01f2
        L_0x01ce:
            com.google.common.f.a.d r0 = r3.f359168h
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            java.lang.String r2 = "Smartspace card has no package name."
            r0.mo56386p(r2)
            goto L_0x01f2
        L_0x01dc:
            r0 = move-exception
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ar r2 = (com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131386ar) r2
            com.google.common.f.a.d r2 = r2.f359168h
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            com.google.common.f.x r0 = r2.mo56382g(r0)
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            java.lang.String r2 = "PCP did not return valid Smartspace card."
            r0.mo56386p(r2)
        L_0x01f2:
            return r4
        L_0x01f3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131386ar.mo110153f(h.c.g):java.lang.Object");
    }
}
