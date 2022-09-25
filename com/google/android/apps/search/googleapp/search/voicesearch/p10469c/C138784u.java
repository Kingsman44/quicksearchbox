package com.google.android.apps.search.googleapp.search.voicesearch.p10469c;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139707b;
import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.apps.search.googleapp.search.p10415i.C137493b;
import com.google.android.apps.search.googleapp.search.p10415i.C137521w;
import com.google.android.apps.search.googleapp.search.voicesearch.p10467a.C138692f;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60866ct;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.c.u */
/* compiled from: PG */
public final class C138784u implements C70862aj {

    /* renamed from: g */
    public static final /* synthetic */ int f377498g = 0;

    /* renamed from: h */
    private static final C58974d f377499h = C58974d.m91135i("VSResponseObserver");

    /* renamed from: a */
    public final boolean f377500a;

    /* renamed from: b */
    public volatile C138788y f377501b = C138788y.f377531g;

    /* renamed from: c */
    public volatile int f377502c;

    /* renamed from: d */
    public volatile boolean f377503d = false;

    /* renamed from: e */
    public C70862aj f377504e;

    /* renamed from: f */
    public boolean f377505f = false;

    /* renamed from: i */
    private final C138692f f377506i;

    /* renamed from: j */
    private final C89859i f377507j;

    /* renamed from: k */
    private final C21370a f377508k;

    /* renamed from: l */
    private final C137493b f377509l;

    /* renamed from: m */
    private final C137521w f377510m;

    /* renamed from: n */
    private final C138728b f377511n;

    /* renamed from: o */
    private final C138767d f377512o;

    /* renamed from: p */
    private final C138772i f377513p;

    /* renamed from: q */
    private final C139708c f377514q;

    /* renamed from: r */
    private final boolean f377515r;

    /* renamed from: s */
    private final boolean f377516s;

    /* renamed from: t */
    private String f377517t;

    /* renamed from: u */
    private Duration f377518u = Duration.ZERO;

    /* renamed from: v */
    private boolean f377519v = false;

    /* renamed from: w */
    private boolean f377520w = false;

    public C138784u(C89859i iVar, boolean z, boolean z2, C138692f fVar, C21370a aVar, C137493b bVar, C138728b bVar2, C138767d dVar, C138772i iVar2, C139708c cVar, boolean z3) {
        this.f377506i = fVar;
        this.f377507j = iVar;
        this.f377508k = aVar;
        this.f377515r = z;
        this.f377509l = bVar;
        this.f377500a = z3;
        this.f377516s = z2;
        C137521w wVar = new C137521w();
        this.f377510m = wVar;
        this.f377511n = bVar2;
        this.f377512o = dVar;
        this.f377513p = iVar2;
        this.f377514q = cVar;
        iVar2.f377458b = wVar;
    }

    /* renamed from: d */
    private final void m225432d(C138788y yVar) {
        this.f377501b = yVar;
        C138772i iVar = this.f377513p;
        int i = iVar.mo114522a().f377534b;
        String str = iVar.mo114522a().f377535c;
        iVar.f377457a.mo50787a(C60866ct.f164955a, "VOICE_SEARCH_STATE");
    }

    /* renamed from: e */
    private static boolean m225433e(int i) {
        return C138787x.m225439a(i) < 4;
    }

    /* renamed from: f */
    private final boolean m225434f(int i) {
        int b = C138787x.m225440b(this.f377501b.f377534b);
        if (b == 0) {
            b = 1;
        }
        return C138787x.m225439a(b) < C138787x.m225439a(i);
    }

    /* renamed from: a */
    public final void mo20121a() {
        int i = this.f377501b.f377534b;
        int i2 = 1;
        this.f377503d = true;
        C70862aj ajVar = this.f377504e;
        if (ajVar != null) {
            ajVar.mo20121a();
        }
        this.f377514q.mo115175b(this.f377518u);
        if (this.f377501b.f377535c.isEmpty()) {
            if (!this.f377500a) {
                this.f377507j.mo83702b(C89849ae.TNG_VOICE_SEARCH_FAILURE);
            }
            int b = C138787x.m225440b(this.f377501b.f377534b);
            if (b != 0 && b == 8) {
                this.f377514q.mo115179f(C139707b.RESTARTED_BY_NUDGE, this.f377517t);
                C139708c cVar = this.f377514q;
                if (((Optional) cVar.f379734a.get()).isPresent()) {
                    Object obj = ((Optional) cVar.f379734a.getAndSet(Optional.empty())).get();
                    C69664n.m101060f(obj, "voiceEntrySourceHolder.g…t(Optional.empty()).get()");
                    cVar.mo115177d((C37254c) obj);
                    this.f377512o.mo114519b(true);
                } else {
                    throw new IllegalStateException("VoiceEntrySource should be present on restart.");
                }
            } else {
                int b2 = C138787x.m225440b(this.f377501b.f377534b);
                if (b2 != 0) {
                    i2 = b2;
                }
                if (m225433e(i2)) {
                    this.f377514q.mo115179f(C139707b.RECOGNITION_FAILURE, this.f377517t);
                    C138786w wVar = (C138786w) this.f377501b.toBuilder();
                    wVar.copyOnWrite();
                    ((C138788y) wVar.instance).f377534b = C138787x.m225439a(9);
                    m225432d((C138788y) wVar.build());
                }
            }
        } else {
            int b3 = C138787x.m225440b(this.f377501b.f377534b);
            if (b3 != 0 && b3 == 7) {
                this.f377514q.mo115179f(C139707b.ASSISTANT_LAUNCHED, this.f377517t);
                if (!this.f377516s) {
                    this.f377513p.mo114524c();
                    this.f377501b = C138788y.f377531g;
                }
            }
        }
        this.f377510m.mo113793b();
        this.f377514q.f379736c = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0191  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20122b(java.lang.Throwable r11) {
        /*
            r10 = this;
            com.google.common.f.a.d r0 = f377499h
            com.google.common.f.x r1 = r0.mo56226d()
            java.lang.String r2 = "onError()"
            r3 = 41298(0xa152, float:5.7871E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56382g(r11)).mo56372aa(r3)).mo56386p(r2)
            r1 = 1
            r10.f377503d = r1
            io.grpc.i.aj r2 = r10.f377504e
            if (r2 == 0) goto L_0x0018
            r2.mo20122b(r11)
        L_0x0018:
            j$.time.Duration r2 = r10.f377518u
            boolean r2 = r2.isZero()
            if (r2 != 0) goto L_0x0027
            com.google.android.apps.search.googleapp.t.f.c r2 = r10.f377514q
            j$.time.Duration r3 = r10.f377518u
            r2.mo115175b(r3)
        L_0x0027:
            com.google.android.apps.search.googleapp.t.f.c r2 = r10.f377514q
            boolean r2 = r2.f379736c
            r3 = 0
            if (r2 == 0) goto L_0x0033
            com.google.android.apps.search.googleapp.t.f.c r11 = r10.f377514q
            r11.f379736c = r3
            return
        L_0x0033:
            boolean r2 = r11 instanceof p5488io.grpc.C70761fa
            r4 = 9
            if (r2 == 0) goto L_0x0187
            r2 = r11
            io.grpc.fa r2 = (p5488io.grpc.C70761fa) r2
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            com.google.common.f.x r0 = r0.mo56382g(r2)
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            r5 = 41299(0xa153, float:5.7872E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r5)
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            io.grpc.Status r5 = r2.f188571a
            java.lang.String r6 = "TNG:VS Runtime Observer Error: Status: %s Description: %s"
            java.lang.String r7 = r5.getDescription()
            r0.mo56354G(r6, r5, r7)
            io.grpc.Status$Code r0 = p5488io.grpc.Status.Code.CANCELLED
            io.grpc.Status r5 = r2.f188571a
            io.grpc.Status$Code r5 = r5.getCode()
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0115
            io.grpc.Status r11 = r2.f188571a
            java.lang.String r11 = r11.getDescription()
            if (r11 == 0) goto L_0x0085
            java.lang.String r0 = "APVS request has been canceled by tapping on the searchbox in SBT."
            boolean r11 = r11.equals(r0)
            if (r11 != 0) goto L_0x007b
            goto L_0x0085
        L_0x007b:
            com.google.android.apps.search.googleapp.t.f.c r11 = r10.f377514q
            com.google.android.apps.search.googleapp.t.f.b r0 = com.google.android.apps.search.googleapp.p10516t.p10522f.C139707b.SBT_SEARCH_BOX_CLICK_SUCCESS
            java.lang.String r1 = r10.f377517t
            r11.mo115179f(r0, r1)
            return
        L_0x0085:
            com.google.android.apps.gsa.shared.logger.b.i r11 = r10.f377507j
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TNG_VOICE_SEARCH_CANCEL
            r11.mo83702b(r0)
            com.google.android.apps.search.googleapp.t.f.c r11 = r10.f377514q
            io.grpc.Status r0 = r2.f188571a
            java.lang.String r0 = r0.getDescription()
            java.lang.String r2 = r10.f377517t
            com.google.android.libraries.search.b.i.f r3 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97871bx
            com.google.android.apps.search.googleapp.t.f.b r5 = com.google.android.apps.search.googleapp.p10516t.p10522f.C139707b.CANCEL
            int r5 = r5.f379733q
            java.lang.String r6 = r11.f379735b
            com.google.android.libraries.search.b.i.a r3 = r3.mo40803a(r5, r6)
            if (r0 == 0) goto L_0x00e6
            com.google.protobuf.bt r5 = p5535j.p5536a.p5545c.p5548c.p5552d.C71150d.f189800d
            j.a.c.c.d.d r6 = p5535j.p5536a.p5545c.p5548c.p5552d.C71150d.f189799c
            com.google.protobuf.bn r6 = r6.createBuilder()
            j.a.c.c.d.c r6 = (p5535j.p5536a.p5545c.p5548c.p5552d.C71149c) r6
            j.a.c.c.d.b r7 = p5535j.p5536a.p5545c.p5548c.p5552d.C71148b.f189792e
            com.google.protobuf.bn r7 = r7.createBuilder()
            j.a.c.c.d.a r7 = (p5535j.p5536a.p5545c.p5548c.p5552d.C71147a) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            j.a.c.c.d.b r8 = (p5535j.p5536a.p5545c.p5548c.p5552d.C71148b) r8
            int r9 = r8.f189794a
            r9 = r9 | 4
            r8.f189794a = r9
            r8.f189797d = r0
            com.google.protobuf.bv r0 = r7.build()
            j.a.c.c.d.b r0 = (p5535j.p5536a.p5545c.p5548c.p5552d.C71148b) r0
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            j.a.c.c.d.d r7 = (p5535j.p5536a.p5545c.p5548c.p5552d.C71150d) r7
            r0.getClass()
            r7.f189803b = r0
            int r0 = r7.f189802a
            r0 = r0 | r1
            r7.f189802a = r0
            com.google.protobuf.bv r0 = r6.build()
            r1 = r3
            com.google.android.libraries.search.b.i.b r1 = (com.google.android.libraries.search.p2871b.p2895i.C37253b) r1
            r1.mo40792p(r5, r0)
        L_0x00e6:
            if (r2 == 0) goto L_0x00ee
            r0 = r3
            com.google.android.libraries.search.b.i.b r0 = (com.google.android.libraries.search.p2871b.p2895i.C37253b) r0
            r0.mo40794r(r2)
        L_0x00ee:
            r11.mo115176c(r3)
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r11 = r10.f377501b
            com.google.protobuf.bn r11 = r11.toBuilder()
            com.google.android.apps.search.googleapp.search.voicesearch.c.w r11 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138786w) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r0 = r11.instance
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r0 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r0
            int r1 = com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138787x.m225439a(r4)
            r0.f377534b = r1
            com.google.protobuf.bv r11 = r11.build()
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r11 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r11
            r10.m225432d(r11)
            com.google.android.apps.search.googleapp.search.i.w r11 = r10.f377510m
            r11.mo113793b()
            return
        L_0x0115:
            io.grpc.Status r0 = r2.f188571a
            java.lang.String r0 = r0.getDescription()
            if (r0 == 0) goto L_0x016b
            io.grpc.Status r0 = r2.f188571a
            java.lang.String r0 = r0.getDescription()
            r0.getClass()
            java.lang.String r5 = "ERR_INTERNET_DISCONNECTED"
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x012f
            goto L_0x016b
        L_0x012f:
            com.google.android.apps.gsa.shared.logger.b.i r0 = r10.f377507j
            com.google.android.apps.gsa.shared.logger.b.ae r1 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TNG_VOICE_SEARCH_FAILURE
            r0.mo83702b(r1)
            com.google.android.apps.search.googleapp.t.f.c r0 = r10.f377514q
            com.google.android.apps.search.googleapp.t.f.b r1 = com.google.android.apps.search.googleapp.p10516t.p10522f.C139707b.NETWORK_FAILURE
            java.lang.String r3 = r10.f377517t
            com.google.android.libraries.assistant.o.a r2 = com.google.android.libraries.assistant.p1533o.C18485c.m35946a(r2)
            r0.mo115180g(r1, r3, r2)
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r0 = r10.f377501b
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.android.apps.search.googleapp.search.voicesearch.c.w r0 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138786w) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r1 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r1
            r2 = 10
            int r2 = com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138787x.m225439a(r2)
            r1.f377534b = r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r0 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r0
            r10.m225432d(r0)
            com.google.android.apps.search.googleapp.search.i.w r0 = r10.f377510m
            r0.f374041c = r11
            r0.mo113793b()
            return
        L_0x016b:
            io.grpc.Status$Code r0 = p5488io.grpc.Status.Code.OK
            io.grpc.Status r5 = r2.f188571a
            io.grpc.Status$Code r5 = r5.getCode()
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x0187
            com.google.android.apps.search.googleapp.t.f.c r0 = r10.f377514q
            com.google.android.apps.search.googleapp.t.f.b r3 = com.google.android.apps.search.googleapp.p10516t.p10522f.C139707b.RECOGNITION_FAILURE
            java.lang.String r5 = r10.f377517t
            com.google.android.libraries.assistant.o.a r2 = com.google.android.libraries.assistant.p1533o.C18485c.m35946a(r2)
            r0.mo115180g(r3, r5, r2)
            goto L_0x0188
        L_0x0187:
            r1 = 0
        L_0x0188:
            com.google.android.apps.gsa.shared.logger.b.i r0 = r10.f377507j
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.TNG_VOICE_SEARCH_FAILURE
            r0.mo83702b(r2)
            if (r1 != 0) goto L_0x019a
            com.google.android.apps.search.googleapp.t.f.c r0 = r10.f377514q
            com.google.android.apps.search.googleapp.t.f.b r1 = com.google.android.apps.search.googleapp.p10516t.p10522f.C139707b.RECOGNITION_FAILURE
            java.lang.String r2 = r10.f377517t
            r0.mo115179f(r1, r2)
        L_0x019a:
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r0 = r10.f377501b
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.android.apps.search.googleapp.search.voicesearch.c.w r0 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138786w) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r1 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r1
            int r2 = com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138787x.m225439a(r4)
            r1.f377534b = r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r0 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r0
            r10.m225432d(r0)
            com.google.android.apps.search.googleapp.search.i.w r0 = r10.f377510m
            r0.f374041c = r11
            r0.mo113793b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138784u.mo20122b(java.lang.Throwable):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v78, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        if (r2.f52365a.size() > 0) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01f3, code lost:
        if (r3 == null) goto L_0x01f5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo20123c(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            com.google.android.libraries.assistant.o.bt r1 = (com.google.android.libraries.assistant.p1533o.C18484bt) r1
            int r2 = r1.f52421a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0017
            if (r2 == r6) goto L_0x0015
            if (r2 == r5) goto L_0x0013
            r7 = 0
            goto L_0x0018
        L_0x0013:
            r7 = 2
            goto L_0x0018
        L_0x0015:
            r7 = 1
            goto L_0x0018
        L_0x0017:
            r7 = 3
        L_0x0018:
            int r8 = r7 + -1
            r9 = 0
            if (r7 == 0) goto L_0x04d6
            java.lang.String r7 = ""
            if (r8 == 0) goto L_0x0061
            if (r8 == r6) goto L_0x0035
            if (r8 == r5) goto L_0x0026
            return
        L_0x0026:
            com.google.common.f.a.d r1 = f377499h
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "VoiceSearchResponse has no message."
            r3 = 41301(0xa155, float:5.7875E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r1).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x0035:
            if (r2 != r5) goto L_0x003c
            java.lang.Object r1 = r1.f52422b
            r7 = r1
            java.lang.String r7 = (java.lang.String) r7
        L_0x003c:
            r0.f377517t = r7
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r1 = r0.f377501b
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.android.apps.search.googleapp.search.voicesearch.c.w r1 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138786w) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r2 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r2
            r7.getClass()
            int r3 = r2.f377533a
            r3 = r3 | r6
            r2.f377533a = r3
            r2.f377538f = r7
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r1 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r1
            r0.m225432d(r1)
            return
        L_0x0061:
            if (r2 != r6) goto L_0x0068
            java.lang.Object r1 = r1.f52422b
            com.google.android.libraries.assistant.o.u r1 = (com.google.android.libraries.assistant.p1533o.C18503u) r1
            goto L_0x006a
        L_0x0068:
            com.google.android.libraries.assistant.o.u r1 = com.google.android.libraries.assistant.p1533o.C18503u.f52450f
        L_0x006a:
            boolean r2 = r0.f377520w
            if (r2 != 0) goto L_0x008d
            com.google.android.libraries.assistant.o.an r2 = r1.f52452a
            if (r2 != 0) goto L_0x0074
            com.google.android.libraries.assistant.o.an r2 = com.google.android.libraries.assistant.p1533o.C18451an.f52363e
        L_0x0074:
            boolean r2 = r2.f52368d
            if (r2 != 0) goto L_0x0086
            com.google.android.libraries.assistant.o.an r2 = r1.f52452a
            if (r2 != 0) goto L_0x007e
            com.google.android.libraries.assistant.o.an r2 = com.google.android.libraries.assistant.p1533o.C18451an.f52363e
        L_0x007e:
            com.google.protobuf.cq r2 = r2.f52365a
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x008d
        L_0x0086:
            r0.f377520w = r6
            com.google.android.apps.search.googleapp.search.i.b r2 = r0.f377509l
            r2.mo113785a()
        L_0x008d:
            com.google.bb.a.pb r2 = r1.f52456e
            r8 = 8
            if (r2 == 0) goto L_0x02a1
            com.google.android.apps.search.googleapp.search.voicesearch.a.f r10 = r0.f377506i
            com.google.protobuf.cq r11 = r2.f145835d
            int r11 = r11.size()
            if (r11 <= r6) goto L_0x00c1
            com.google.common.f.e r11 = com.google.android.apps.search.googleapp.search.voicesearch.p10467a.C138692f.f377219b
            com.google.common.f.x r11 = r11.mo56226d()
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            com.google.common.f.aa r12 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101864b
            r13 = 194896400(0xb9de210, float:6.081434E-32)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r11.mo56378ag(r12, r13)
            com.google.common.f.n r12 = new com.google.common.f.n
            r13 = 41293(0xa14d, float:5.7864E-41)
            r12.<init>(r13)
            r11.mo56379ah(r12)
            java.lang.String r12 = "Saw multiple ActionV2 protos, but expected at most one."
            r11.mo56386p(r12)
        L_0x00c1:
            com.google.protobuf.cq r2 = r2.f145835d
            java.lang.String r11 = "peanut.actionV2List"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00d1:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x00fa
            java.lang.Object r12 = r2.next()
            r13 = r12
            com.google.bb.a.ad r13 = (com.google.p4152bb.p4153a.C54946ad) r13
            java.util.EnumSet r14 = com.google.android.apps.search.googleapp.search.voicesearch.p10467a.C138692f.f377218a
            com.google.bb.a.af r13 = r13.f144536d
            if (r13 != 0) goto L_0x00e6
            com.google.bb.a.af r13 = com.google.p4152bb.p4153a.C54948af.f144541h
        L_0x00e6:
            int r13 = r13.f144544b
            com.google.bb.a.x r13 = com.google.p4152bb.p4153a.C55421x.m87686a(r13)
            if (r13 != 0) goto L_0x00f0
            com.google.bb.a.x r13 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE
        L_0x00f0:
            boolean r13 = r14.contains(r13)
            if (r13 == 0) goto L_0x00d1
            r11.add(r12)
            goto L_0x00d1
        L_0x00fa:
            h.f.b.ae r2 = new h.f.b.ae
            r2.<init>()
            java.util.Iterator r12 = r11.iterator()
        L_0x0103:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0125
            java.lang.Object r13 = r12.next()
            r14 = r13
            com.google.bb.a.ad r14 = (com.google.p4152bb.p4153a.C54946ad) r14
            com.google.bb.a.af r14 = r14.f144536d
            if (r14 != 0) goto L_0x0116
            com.google.bb.a.af r14 = com.google.p4152bb.p4153a.C54948af.f144541h
        L_0x0116:
            int r14 = r14.f144544b
            com.google.bb.a.x r14 = com.google.p4152bb.p4153a.C55421x.m87686a(r14)
            if (r14 != 0) goto L_0x0120
            com.google.bb.a.x r14 = com.google.p4152bb.p4153a.C55421x.UNKNOWN_ACTION_TYPE
        L_0x0120:
            com.google.bb.a.x r15 = com.google.p4152bb.p4153a.C55421x.SMS
            if (r14 != r15) goto L_0x0103
            goto L_0x0126
        L_0x0125:
            r13 = r9
        L_0x0126:
            com.google.bb.a.ad r13 = (com.google.p4152bb.p4153a.C54946ad) r13
            if (r13 == 0) goto L_0x01f5
            android.content.Context r12 = r10.f377220c
            java.lang.String r12 = android.provider.Telephony.Sms.getDefaultSmsPackage(r12)
            if (r12 != 0) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r7 = r12
        L_0x0134:
            com.google.bb.a.jw r12 = com.google.p4152bb.p4153a.C55208jw.f145315y
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.bb.a.jv r12 = (com.google.p4152bb.p4153a.C55207jv) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.bb.a.jw r14 = (com.google.p4152bb.p4153a.C55208jw) r14
            int r15 = r14.f145318a
            r15 = r15 | r6
            r14.f145318a = r15
            java.lang.String r15 = "android.intent.action.MAIN"
            r14.f145319b = r15
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.bb.a.jw r14 = (com.google.p4152bb.p4153a.C55208jw) r14
            int r15 = r14.f145318a
            r15 = r15 | 64
            r14.f145318a = r15
            r14.f145329l = r6
            com.google.bb.a.he r14 = com.google.p4152bb.p4153a.C55136he.f145130j
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.bb.a.hd r14 = (com.google.p4152bb.p4153a.C55135hd) r14
            r14.copyOnWrite()
            com.google.protobuf.bv r15 = r14.instance
            com.google.bb.a.he r15 = (com.google.p4152bb.p4153a.C55136he) r15
            int r3 = r15.f145132a
            r3 = r3 | r6
            r15.f145132a = r3
            r15.f145133b = r7
            r12.copyOnWrite()
            com.google.protobuf.bv r3 = r12.instance
            com.google.bb.a.jw r3 = (com.google.p4152bb.p4153a.C55208jw) r3
            com.google.protobuf.bv r7 = r14.build()
            com.google.bb.a.he r7 = (com.google.p4152bb.p4153a.C55136he) r7
            r7.getClass()
            r3.f145322e = r7
            int r7 = r3.f145318a
            r7 = r7 | r8
            r3.f145318a = r7
            com.google.bb.a.nl r3 = com.google.p4152bb.p4153a.C55305nl.f145689r
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.bb.a.ni r3 = (com.google.p4152bb.p4153a.C55302ni) r3
            com.google.bb.a.la r7 = com.google.p4152bb.p4153a.C55240la.f145449k
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.bb.a.kz r7 = (com.google.p4152bb.p4153a.C55238kz) r7
            com.google.protobuf.bt r14 = com.google.p4152bb.p4153a.C55208jw.f145316z
            com.google.protobuf.bv r12 = r12.build()
            r7.mo58885m(r14, r12)
            r3.copyOnWrite()
            com.google.protobuf.bv r12 = r3.instance
            com.google.bb.a.nl r12 = (com.google.p4152bb.p4153a.C55305nl) r12
            com.google.protobuf.bv r7 = r7.build()
            com.google.bb.a.la r7 = (com.google.p4152bb.p4153a.C55240la) r7
            r7.getClass()
            r12.mo54238a()
            com.google.protobuf.cq r12 = r12.f145692b
            r12.add(r7)
            com.google.protobuf.bn r7 = r13.toBuilder()
            com.google.bb.a.ac r7 = (com.google.p4152bb.p4153a.C54945ac) r7
            com.google.protobuf.bt r12 = com.google.p4152bb.p4153a.C55265lz.f145556m
            com.google.bb.a.lz r13 = com.google.p4152bb.p4153a.C55265lz.f145555l
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.bb.a.ly r13 = (com.google.p4152bb.p4153a.C55264ly) r13
            r13.copyOnWrite()
            com.google.protobuf.bv r14 = r13.instance
            com.google.bb.a.lz r14 = (com.google.p4152bb.p4153a.C55265lz) r14
            com.google.protobuf.bv r3 = r3.build()
            com.google.bb.a.nl r3 = (com.google.p4152bb.p4153a.C55305nl) r3
            r3.getClass()
            r14.mo54227b()
            com.google.protobuf.cq r14 = r14.f145560c
            r14.add(r3)
            com.google.protobuf.bv r3 = r13.build()
            r7.mo58885m(r12, r3)
            com.google.protobuf.bv r3 = r7.build()
            java.lang.String r7 = "actionV2\n      .toBuilde…).build())\n      .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r7)
            com.google.bb.a.ad r3 = (com.google.p4152bb.p4153a.C54946ad) r3
            if (r3 != 0) goto L_0x021e
        L_0x01f5:
            java.util.Iterator r3 = r11.iterator()
        L_0x01f9:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x021a
            java.lang.Object r7 = r3.next()
            r11 = r7
            com.google.bb.a.ad r11 = (com.google.p4152bb.p4153a.C54946ad) r11
            com.google.protobuf.bt r12 = com.google.p4152bb.p4153a.C55265lz.f145556m
            com.google.protobuf.bt r12 = com.google.protobuf.C62942bv.checkIsLite(r12)
            r11.mo58887l(r12)
            com.google.protobuf.bf r11 = r11.f169962ag
            com.google.protobuf.bs r12 = r12.f169971d
            boolean r11 = r11.mo58857o(r12)
            if (r11 == 0) goto L_0x01f9
            goto L_0x021b
        L_0x021a:
            r7 = r9
        L_0x021b:
            r3 = r7
            com.google.bb.a.ad r3 = (com.google.p4152bb.p4153a.C54946ad) r3
        L_0x021e:
            r2.f186027a = r3
            java.lang.Object r3 = r2.f186027a
            com.google.bb.a.ad r3 = (com.google.p4152bb.p4153a.C54946ad) r3
            if (r3 == 0) goto L_0x02a1
            com.google.protobuf.bt r7 = com.google.p4152bb.p4153a.C55265lz.f145556m
            com.google.protobuf.bt r7 = com.google.protobuf.C62942bv.checkIsLite(r7)
            r3.mo58887l(r7)
            com.google.protobuf.bf r3 = r3.f169962ag
            com.google.protobuf.bs r11 = r7.f169971d
            java.lang.Object r3 = r3.mo58854l(r11)
            if (r3 != 0) goto L_0x023c
            java.lang.Object r3 = r7.f169969b
            goto L_0x0240
        L_0x023c:
            java.lang.Object r3 = r7.mo58889c(r3)
        L_0x0240:
            com.google.bb.a.lz r3 = (com.google.p4152bb.p4153a.C55265lz) r3
            if (r3 != 0) goto L_0x0245
            goto L_0x02a1
        L_0x0245:
            com.google.protobuf.cq r7 = r3.f145560c
            java.lang.String r11 = "modularAction\n        .userIntentList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0255:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x026c
            java.lang.Object r12 = r7.next()
            com.google.bb.a.nl r12 = (com.google.p4152bb.p4153a.C55305nl) r12
            com.google.protobuf.cq r12 = r12.f145692b
            java.lang.String r13 = "it.executeInfoList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r13)
            p5462h.p5463a.C69540x.m100811r(r11, r12)
            goto L_0x0255
        L_0x026c:
            h.l.k r7 = p5462h.p5463a.C69540x.m100847ac(r11)
            com.google.android.apps.search.googleapp.search.voicesearch.a.b r11 = com.google.android.apps.search.googleapp.search.voicesearch.p10467a.C138688b.f377211a
            h.l.k r7 = p5462h.p5482l.C69734n.m101140h(r7, r11)
            com.google.android.apps.search.googleapp.search.voicesearch.a.c r11 = com.google.android.apps.search.googleapp.search.voicesearch.p10467a.C138689c.f377212a
            h.l.k r7 = p5462h.p5482l.C69734n.m101143k(r7, r11)
            com.google.android.apps.search.googleapp.search.voicesearch.a.d r11 = new com.google.android.apps.search.googleapp.search.voicesearch.a.d
            r11.<init>(r10, r2)
            h.l.k r2 = p5462h.p5482l.C69734n.m101144l(r7, r11)
            java.lang.Object r2 = p5462h.p5482l.C69734n.m101137e(r2)
            android.content.Intent r2 = (android.content.Intent) r2
            if (r2 == 0) goto L_0x0291
            r10.mo114467a(r2)
            goto L_0x02a1
        L_0x0291:
            kotlinx.coroutines.aw r2 = r10.f377221d
            com.google.android.apps.search.googleapp.search.voicesearch.a.e r7 = new com.google.android.apps.search.googleapp.search.voicesearch.a.e
            r7.<init>(r10, r3, r9)
            kotlinx.coroutines.be r2 = kotlinx.coroutines.C71803m.m105042c(r2, r9, r9, r7, r4)
            com.google.android.apps.search.googleapp.search.voicesearch.a.a r3 = com.google.android.apps.search.googleapp.search.voicesearch.p10467a.C138687a.f377210a
            r2.mo62873s(r3)
        L_0x02a1:
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r2 = r0.f377501b
            int r2 = r2.f377534b
            int r2 = com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138787x.m225440b(r2)
            r3 = 7
            if (r2 != 0) goto L_0x02ad
            goto L_0x02af
        L_0x02ad:
            if (r2 == r3) goto L_0x02bc
        L_0x02af:
            com.google.android.apps.search.googleapp.search.i.w r2 = r0.f377510m
            com.google.android.libraries.assistant.o.an r7 = r1.f52452a
            if (r7 != 0) goto L_0x02b7
            com.google.android.libraries.assistant.o.an r7 = com.google.android.libraries.assistant.p1533o.C18451an.f52363e
        L_0x02b7:
            com.google.protobuf.cq r7 = r7.f52366b
            r2.mo113791a(r7)
        L_0x02bc:
            com.google.android.libraries.assistant.o.an r2 = r1.f52452a
            if (r2 != 0) goto L_0x02c2
            com.google.android.libraries.assistant.o.an r2 = com.google.android.libraries.assistant.p1533o.C18451an.f52363e
        L_0x02c2:
            com.google.protobuf.cq r2 = r2.f52365a
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x02f6
            com.google.android.libraries.assistant.o.an r2 = r1.f52452a
            if (r2 != 0) goto L_0x02d0
            com.google.android.libraries.assistant.o.an r2 = com.google.android.libraries.assistant.p1533o.C18451an.f52363e
        L_0x02d0:
            com.google.protobuf.cq r2 = r2.f52365a
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.search.googleapp.search.voicesearch.c.p r7 = com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138779p.f377493a
            j$.util.stream.Stream r2 = r2.map(r7)
            com.google.android.apps.search.googleapp.search.voicesearch.c.q r7 = com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138780q.f377494a
            j$.util.stream.Stream r2 = r2.filter(r7)
            com.google.android.apps.search.googleapp.search.voicesearch.c.r r7 = com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138781r.f377495a
            com.google.android.apps.search.googleapp.search.voicesearch.c.s r10 = com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138782s.f377496a
            com.google.android.apps.search.googleapp.search.voicesearch.c.t r11 = com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138783t.f377497a
            j$.util.stream.Collector r7 = com.google.common.p4522b.C58370cn.m89403c(r7, r10, r11)
            java.lang.Object r2 = r2.collect(r7)
            com.google.common.b.hd r2 = (com.google.common.p4522b.C58495hd) r2
            com.google.android.apps.search.googleapp.search.voicesearch.c.i r7 = r0.f377513p
            r7.f377460d = r2
        L_0x02f6:
            com.google.android.libraries.assistant.o.an r2 = r1.f52452a
            if (r2 != 0) goto L_0x02fc
            com.google.android.libraries.assistant.o.an r2 = com.google.android.libraries.assistant.p1533o.C18451an.f52363e
        L_0x02fc:
            boolean r2 = r2.f52367c
            if (r2 == 0) goto L_0x0305
            com.google.android.apps.search.googleapp.search.i.w r2 = r0.f377510m
            r2.mo113793b()
        L_0x0305:
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r2 = r0.f377501b
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.android.apps.search.googleapp.search.voicesearch.c.w r2 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138786w) r2
            com.google.android.libraries.assistant.o.aa r7 = r1.f52454c
            if (r7 != 0) goto L_0x0313
            com.google.android.libraries.assistant.o.aa r7 = com.google.android.libraries.assistant.p1533o.C18438aa.f52334e
        L_0x0313:
            boolean r7 = r7.f52339d
            if (r7 == 0) goto L_0x0320
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r7 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r7
            r7.f377537e = r6
        L_0x0320:
            com.google.android.libraries.assistant.o.aa r7 = r1.f52454c
            if (r7 != 0) goto L_0x0327
            com.google.android.libraries.assistant.o.aa r10 = com.google.android.libraries.assistant.p1533o.C18438aa.f52334e
            goto L_0x0328
        L_0x0327:
            r10 = r7
        L_0x0328:
            com.google.android.libraries.assistant.o.al r10 = r10.f52337b
            if (r10 == 0) goto L_0x0368
            if (r7 != 0) goto L_0x0330
            com.google.android.libraries.assistant.o.aa r7 = com.google.android.libraries.assistant.p1533o.C18438aa.f52334e
        L_0x0330:
            com.google.android.libraries.assistant.o.al r7 = r7.f52337b
            if (r7 != 0) goto L_0x0336
            com.google.android.libraries.assistant.o.al r7 = com.google.android.libraries.assistant.p1533o.C18449al.f52359c
        L_0x0336:
            java.lang.String r7 = r7.f52361a
            boolean r10 = r7.isEmpty()
            if (r10 != 0) goto L_0x0368
            com.google.android.libraries.f.a r10 = r0.f377508k
            long r10 = r10.mo26872d()
            j$.time.Duration r10 = p3186j$.time.Duration.ofNanos(r10)
            r0.f377518u = r10
            boolean r10 = r0.f377519v
            if (r10 != 0) goto L_0x035c
            com.google.android.apps.search.googleapp.t.f.c r10 = r0.f377514q
            com.google.android.libraries.search.b.i.g r11 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97868bu
            java.lang.String r12 = "GOOGLEAPP_VOICE_SEARCH_F…_RECOGNIZED_TEXT_RECEIVED"
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r12)
            r10.mo115177d(r11)
            r0.f377519v = r6
        L_0x035c:
            r2.copyOnWrite()
            com.google.protobuf.bv r10 = r2.instance
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r10 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r10
            r7.getClass()
            r10.f377535c = r7
        L_0x0368:
            com.google.android.libraries.assistant.o.aa r7 = r1.f52454c
            if (r7 != 0) goto L_0x036e
            com.google.android.libraries.assistant.o.aa r7 = com.google.android.libraries.assistant.p1533o.C18438aa.f52334e
        L_0x036e:
            com.google.android.libraries.assistant.o.al r7 = r7.f52337b
            if (r7 != 0) goto L_0x0374
            com.google.android.libraries.assistant.o.al r7 = com.google.android.libraries.assistant.p1533o.C18449al.f52359c
        L_0x0374:
            com.google.android.libraries.assistant.o.ak r7 = r7.f52362b
            if (r7 == 0) goto L_0x0395
            com.google.android.libraries.assistant.o.aa r7 = r1.f52454c
            if (r7 != 0) goto L_0x037e
            com.google.android.libraries.assistant.o.aa r7 = com.google.android.libraries.assistant.p1533o.C18438aa.f52334e
        L_0x037e:
            com.google.android.libraries.assistant.o.al r7 = r7.f52337b
            if (r7 != 0) goto L_0x0384
            com.google.android.libraries.assistant.o.al r7 = com.google.android.libraries.assistant.p1533o.C18449al.f52359c
        L_0x0384:
            com.google.android.libraries.assistant.o.ak r7 = r7.f52362b
            if (r7 != 0) goto L_0x038a
            com.google.android.libraries.assistant.o.ak r7 = com.google.android.libraries.assistant.p1533o.C18448ak.f52353e
        L_0x038a:
            long r10 = r7.f52358d
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r7 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r7
            r7.f377536d = r10
        L_0x0395:
            int r7 = r1.f52453b
            int r7 = com.google.android.libraries.assistant.p1533o.C18501s.m35964a(r7)
            if (r7 != 0) goto L_0x039e
            r7 = 1
        L_0x039e:
            int r7 = r7 + -2
            r10 = -1
            r11 = 6
            if (r7 == r10) goto L_0x03da
            if (r7 == 0) goto L_0x03da
            if (r7 == r6) goto L_0x03bb
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r4 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r4
            int r3 = com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138787x.m225439a(r3)
            r4.f377534b = r3
            com.google.android.apps.search.googleapp.search.voicesearch.c.d r3 = r0.f377512o
            r3.f377450c = r9
            goto L_0x047c
        L_0x03bb:
            boolean r3 = r0.f377516s
            if (r3 != 0) goto L_0x047c
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r3 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r3
            java.lang.String r3 = r3.f377535c
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x047c
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r3 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r3
            int r4 = com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138787x.m225439a(r11)
            r3.f377534b = r4
            goto L_0x047c
        L_0x03da:
            com.google.android.libraries.assistant.o.aa r7 = r1.f52454c
            if (r7 != 0) goto L_0x03e0
            com.google.android.libraries.assistant.o.aa r7 = com.google.android.libraries.assistant.p1533o.C18438aa.f52334e
        L_0x03e0:
            int r7 = r7.f52336a
            r10 = 5
            r12 = 4
            if (r7 == 0) goto L_0x03fa
            if (r7 == r6) goto L_0x03f8
            if (r7 == r5) goto L_0x03f6
            if (r7 == r4) goto L_0x03f4
            if (r7 == r12) goto L_0x03f2
            if (r7 == r10) goto L_0x03fb
            r3 = 0
            goto L_0x03fb
        L_0x03f2:
            r3 = 6
            goto L_0x03fb
        L_0x03f4:
            r3 = 5
            goto L_0x03fb
        L_0x03f6:
            r3 = 4
            goto L_0x03fb
        L_0x03f8:
            r3 = 3
            goto L_0x03fb
        L_0x03fa:
            r3 = 2
        L_0x03fb:
            if (r3 != 0) goto L_0x03fe
            r3 = 1
        L_0x03fe:
            int r3 = r3 + -2
            if (r3 == r6) goto L_0x0458
            if (r3 == r5) goto L_0x0444
            if (r3 == r12) goto L_0x0430
            if (r3 == r10) goto L_0x040a
            goto L_0x047c
        L_0x040a:
            boolean r3 = r0.f377516s
            if (r3 == 0) goto L_0x047c
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r3 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r3
            int r3 = r3.f377534b
            int r3 = com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138787x.m225440b(r3)
            if (r3 != 0) goto L_0x041b
            goto L_0x041c
        L_0x041b:
            r6 = r3
        L_0x041c:
            boolean r3 = m225433e(r6)
            if (r3 == 0) goto L_0x047c
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r3 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r3
            int r4 = com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138787x.m225439a(r11)
            r3.f377534b = r4
            goto L_0x047c
        L_0x0430:
            boolean r3 = r0.m225434f(r10)
            if (r3 == 0) goto L_0x047c
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r3 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r3
            int r4 = com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138787x.m225439a(r10)
            r3.f377534b = r4
            goto L_0x047c
        L_0x0444:
            boolean r3 = r0.m225434f(r12)
            if (r3 == 0) goto L_0x047c
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r3 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r3
            int r4 = com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138787x.m225439a(r12)
            r3.f377534b = r4
            goto L_0x047c
        L_0x0458:
            boolean r3 = r0.m225434f(r4)
            if (r3 == 0) goto L_0x047c
            com.google.android.apps.search.googleapp.t.f.c r3 = r0.f377514q
            com.google.android.libraries.search.b.i.g r5 = com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a.f97867bt
            java.lang.String r6 = "GOOGLEAPP_VOICE_SEARCH_STARTS_LISTENING"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)
            r3.mo115177d(r5)
            com.google.android.apps.search.googleapp.search.voicesearch.c.b r3 = r0.f377511n
            r3.mo114503a()
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r3 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r3
            int r4 = com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138787x.m225439a(r4)
            r3.f377534b = r4
        L_0x047c:
            com.google.android.libraries.assistant.o.aa r3 = r1.f52454c
            if (r3 != 0) goto L_0x0483
            com.google.android.libraries.assistant.o.aa r4 = com.google.android.libraries.assistant.p1533o.C18438aa.f52334e
            goto L_0x0484
        L_0x0483:
            r4 = r3
        L_0x0484:
            com.google.android.libraries.assistant.o.e r4 = r4.f52338c
            if (r4 == 0) goto L_0x0496
            if (r3 != 0) goto L_0x048c
            com.google.android.libraries.assistant.o.aa r3 = com.google.android.libraries.assistant.p1533o.C18438aa.f52334e
        L_0x048c:
            com.google.android.libraries.assistant.o.e r3 = r3.f52338c
            if (r3 != 0) goto L_0x0492
            com.google.android.libraries.assistant.o.e r3 = com.google.android.libraries.assistant.p1533o.C18487e.f52425b
        L_0x0492:
            int r3 = r3.f52427a
            r0.f377502c = r3
        L_0x0496:
            boolean r1 = r1.f52455d
            if (r1 == 0) goto L_0x04cc
            boolean r1 = r0.f377515r
            if (r1 == 0) goto L_0x04b4
            boolean r1 = r0.f377500a
            if (r1 != 0) goto L_0x04b4
            boolean r1 = r0.f377505f
            if (r1 != 0) goto L_0x04b4
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r1 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r1
            int r3 = com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138787x.m225439a(r8)
            r1.f377534b = r3
            goto L_0x04cc
        L_0x04b4:
            com.google.android.apps.search.googleapp.t.f.c r1 = r0.f377514q
            com.google.android.apps.search.googleapp.t.f.b r3 = com.google.android.apps.search.googleapp.p10516t.p10522f.C139707b.NO_SPEECH_DETECTED
            java.lang.String r4 = r0.f377517t
            r1.mo115180g(r3, r4, r9)
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r1 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r1
            r3 = 9
            int r3 = com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138787x.m225439a(r3)
            r1.f377534b = r3
        L_0x04cc:
            com.google.protobuf.bv r1 = r2.build()
            com.google.android.apps.search.googleapp.search.voicesearch.c.y r1 = (com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138788y) r1
            r0.m225432d(r1)
            return
        L_0x04d6:
            goto L_0x04d8
        L_0x04d7:
            throw r9
        L_0x04d8:
            goto L_0x04d7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.search.voicesearch.p10469c.C138784u.mo20123c(java.lang.Object):void");
    }
}
