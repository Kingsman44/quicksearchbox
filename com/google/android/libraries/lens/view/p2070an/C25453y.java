package com.google.android.libraries.lens.view.p2070an;

import android.content.Context;
import com.google.android.libraries.lens.p2014e.C24201ad;
import com.google.android.libraries.lens.p2014e.C24202ae;
import com.google.android.libraries.lens.p2014e.C24204ag;
import com.google.android.libraries.lens.p2014e.C24205ah;
import com.google.android.libraries.lens.view.connectivity.C25749c;
import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.android.libraries.lens.view.p2053ad.C24981d;
import com.google.android.libraries.lens.view.p2056af.C25050av;
import com.google.android.libraries.lens.view.p2067ak.C25197ac;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2081au.C25545aa;
import com.google.android.libraries.lens.view.p2081au.C25560j;
import com.google.android.libraries.lens.view.p2081au.C25561k;
import com.google.android.libraries.lens.view.p2081au.C25562l;
import com.google.android.libraries.lens.view.p2081au.C25563m;
import com.google.android.libraries.lens.view.p2081au.C25564n;
import com.google.android.libraries.lens.view.p2081au.C25574x;
import com.google.android.libraries.lens.view.p2081au.C25575y;
import com.google.android.libraries.lens.view.p2096f.C25799b;
import com.google.android.libraries.lens.view.p2153o.C27459a;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.android.libraries.lens.view.session.C27761ax;
import com.google.android.libraries.lens.view.session.ondevice.C27968f;
import com.google.android.libraries.lens.view.utils.C28130s;
import com.google.android.libraries.lens.view.utils.C28131t;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.lens.p4707j.C62496ds;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.protobuf.C63088z;
import com.google.protos.p4963bf.p4964a.p4965a.C64573av;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.an.y */
/* compiled from: PG */
public final class C25453y implements C27654a {

    /* renamed from: a */
    public final LensConnectivityManager f69339a;

    /* renamed from: b */
    public final C37215b f69340b;

    /* renamed from: c */
    public final C27968f f69341c;

    /* renamed from: d */
    public final C25368af f69342d;

    /* renamed from: e */
    public final C25575y f69343e;

    /* renamed from: f */
    public final C25545aa f69344f;

    /* renamed from: g */
    public final C27459a f69345g;

    /* renamed from: h */
    public final boolean f69346h;

    /* renamed from: i */
    public C25369ag f69347i;

    /* renamed from: j */
    public final C25749c f69348j;

    /* renamed from: k */
    public C60845bz f69349k;

    /* renamed from: l */
    public boolean f69350l;

    /* renamed from: m */
    public boolean f69351m;

    /* renamed from: n */
    private final Context f69352n;

    /* renamed from: o */
    private final Context f69353o;

    /* renamed from: p */
    private final C25799b f69354p;

    /* renamed from: q */
    private final C25050av f69355q;

    /* renamed from: r */
    private final C27761ax f69356r;

    /* renamed from: s */
    private final C25225bd f69357s;

    /* renamed from: t */
    private final C25197ac f69358t;

    /* renamed from: u */
    private final C24981d f69359u;

    /* renamed from: v */
    private final Executor f69360v;

    /* renamed from: w */
    private final C21370a f69361w;

    /* renamed from: x */
    private final boolean f69362x;

    /* renamed from: y */
    private final boolean f69363y;

    /* renamed from: z */
    private final boolean f69364z;

    public C25453y(Context context, Context context2, LensConnectivityManager lensConnectivityManager, C25799b bVar, C37215b bVar2, C25050av avVar, C27761ax axVar, C27968f fVar, C25225bd bdVar, C25197ac acVar, C25368af afVar, C25575y yVar, C25545aa aaVar, C24981d dVar, Executor executor, C21370a aVar, C58833ax axVar2, boolean z, boolean z2, boolean z3, boolean z4) {
        Executor executor2 = executor;
        this.f69352n = context;
        this.f69353o = context2;
        this.f69339a = lensConnectivityManager;
        this.f69354p = bVar;
        this.f69340b = bVar2;
        this.f69355q = avVar;
        this.f69356r = axVar;
        this.f69341c = fVar;
        this.f69357s = bdVar;
        this.f69358t = acVar;
        this.f69342d = afVar;
        this.f69343e = yVar;
        this.f69344f = aaVar;
        this.f69359u = dVar;
        this.f69360v = executor2;
        this.f69361w = aVar;
        this.f69345g = (C27459a) axVar2.mo56111f();
        this.f69362x = z4;
        this.f69363y = z;
        this.f69364z = z2;
        this.f69346h = z3;
        this.f69348j = new C25447s(this, executor2);
    }

    /* renamed from: b */
    public static C24205ah m46884b(C25560j jVar) {
        C28131t tVar = C28131t.f76545a;
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        C24204ag c = C24205ah.m45050c(C63088z.m96139A(wrap.array()));
        c.mo29690b((C62496ds) jVar.mo30616c().mo56108d(C25448t.f69331a));
        return c.mo29689a();
    }

    /* renamed from: a */
    public final C24202ae mo30487a(C25560j jVar, boolean z) {
        C56280cg cgVar = (C56280cg) this.f69343e.mo30605a().mo30656d();
        return C24202ae.m45042d(cgVar, (!this.f69363y || z || !C28130s.m52412c(cgVar, C56306df.AUTO_FILTER)) ? C64573av.f175078c : C25454z.f69366b, jVar.mo30617d());
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("LensQuerySession");
        C25369ag agVar = this.f69347i;
        if (agVar != null) {
            eVar.mo33146c(agVar);
        }
        eVar.mo33146c(this.f69344f);
    }

    /* renamed from: d */
    public final void mo30488d(C24201ad adVar, C25560j jVar, C25574x xVar) {
        ((C58970a) ((C58970a) C25454z.f69365a.mo56224b()).mo56372aa(49848)).mo56355H("Query[%s] starting (interaction=%b)", adVar.mo29680c(), adVar.mo29682e().mo56113h());
        mo30491g(adVar.mo29682e().mo56113h());
        if (adVar.mo29682e().mo56113h()) {
            this.f69344f.mo30598g((C25563m) null);
        }
        C25369ag agVar = this.f69347i;
        agVar.getClass();
        C60870cx h = C60922j.m93045h(agVar.mo30418b(adVar, ((C58833ax) this.f69343e.mo30606b().mo30656d()).mo56113h(), new C25452x(this, adVar, jVar)), C47810es.m84966f(C25441m.f69323a), C60826bg.f164896a);
        C25369ag agVar2 = this.f69347i;
        agVar2.getClass();
        C25564n a = agVar2.mo30417a();
        this.f69344f.mo30602k(C25562l.m47138g(this.f69343e.mo30607d().f69592b, adVar, jVar, (C25574x) null, a, adVar.mo29682e().mo56113h() ? C60856cj.m92901j(h) : h));
        C27459a aVar = this.f69345g;
        if (aVar != null) {
            aVar.mo32996kV();
            if (this.f69362x) {
                C27459a aVar2 = this.f69345g;
                C58833ax.m90834k(jVar.mo30614a().mo29707c());
                aVar2.mo32995kU();
            }
        }
        if (adVar.mo29682e().mo56113h()) {
            this.f69344f.mo30601j(C25562l.m47138g(this.f69343e.mo30606b().f69592b, adVar, jVar, xVar, a, h));
            C27459a aVar3 = this.f69345g;
            if (aVar3 != null) {
                aVar3.mo32993kS();
            }
        }
    }

    /* renamed from: e */
    public final void mo30489e(C25574x xVar, boolean z, int i) {
        C58974d dVar = C25454z.f69365a;
        if (xVar != null) {
            if (this.f69346h) {
                C58833ax axVar = (C58833ax) this.f69344f.f69543b.mo30656d();
                if (axVar.mo56113h() && ((C25561k) axVar.mo56107c()).mo30621a() == i && ((C25561k) axVar.mo56107c()).mo30623c().mo29701g()) {
                    ((C58970a) ((C58970a) C25454z.f69365a.mo56224b()).mo56372aa(49850)).mo56386p("Interaction result is up-to-date");
                    return;
                }
            }
            mo30491g(true);
            this.f69344f.mo30598g((C25563m) null);
            C58838bb.m90884s(((C58833ax) this.f69343e.mo30607d().mo30656d()).mo56113h(), "no prefetch image set");
            this.f69350l = true;
            mo30492h();
        } else if (!z || this.f69346h) {
            mo30493i();
        }
    }

    /* renamed from: f */
    public final void mo30490f(C60870cx cxVar, boolean z, int i) {
        C58974d dVar = C25454z.f69365a;
        if (cxVar == null) {
            this.f69349k = null;
            if (!z || this.f69346h) {
                mo30493i();
                return;
            }
            return;
        }
        if (this.f69346h) {
            C58833ax axVar = (C58833ax) this.f69344f.f69542a.mo30656d();
            if (axVar.mo56113h() && ((C25561k) axVar.mo56107c()).mo30621a() == i && ((C25561k) axVar.mo56107c()).mo30623c().mo29701g()) {
                ((C58970a) ((C58970a) C25454z.f69365a.mo56224b()).mo56372aa(49852)).mo56386p("Prefetch result is up-to-date");
                return;
            }
        }
        mo30491g(false);
        this.f69344f.mo30598g((C25563m) null);
        C25449u uVar = new C25449u(this);
        this.f69349k = uVar;
        C60856cj.m92911t(cxVar, C47810es.m84974n(uVar), this.f69360v);
    }

    /* renamed from: g */
    public final void mo30491g(boolean z) {
        C58833ax axVar = (C58833ax) this.f69344f.f69545d.mo30656d();
        if (axVar.mo56113h()) {
            ((C58970a) ((C58970a) C25454z.f69365a.mo56224b()).mo56372aa(49854)).mo56389s("Query[%s] cancelling (image)", ((C25562l) axVar.mo56107c()).mo30631b().mo29680c());
            ((C25562l) axVar.mo56107c()).mo30636f().cancel(false);
        }
        if (z) {
            this.f69350l = false;
            C58833ax axVar2 = (C58833ax) this.f69344f.f69546e.mo30656d();
            if (axVar2.mo56113h()) {
                ((C58970a) ((C58970a) C25454z.f69365a.mo56224b()).mo56372aa(49853)).mo56389s("Query[%s] cancelling (interaction)", ((C25562l) axVar2.mo56107c()).mo30631b().mo29680c());
                ((C25562l) axVar2.mo56107c()).mo30636f().cancel(false);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0470  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30492h() {
        /*
            r20 = this;
            r1 = r20
            boolean r0 = r1.f69350l
            if (r0 == 0) goto L_0x0495
            com.google.common.util.concurrent.bz r0 = r1.f69349k
            if (r0 == 0) goto L_0x000c
            goto L_0x0495
        L_0x000c:
            com.google.android.libraries.lens.view.au.y r0 = r1.f69343e
            com.google.android.libraries.lens.view.au.s r0 = r0.mo30607d()
            java.lang.Object r0 = r0.mo30656d()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            java.lang.Object r0 = r0.mo56111f()
            com.google.common.util.concurrent.cx r0 = (com.google.common.util.concurrent.C60870cx) r0
            if (r0 == 0) goto L_0x0487
            boolean r2 = r0.isDone()
            if (r2 != 0) goto L_0x0028
            goto L_0x0487
        L_0x0028:
            java.lang.Object r0 = com.google.common.util.concurrent.C60856cj.m92909r(r0)     // Catch:{ ExecutionException -> 0x0480, CancellationException -> 0x0471 }
            r2 = r0
            com.google.android.libraries.lens.view.au.j r2 = (com.google.android.libraries.lens.view.p2081au.C25560j) r2     // Catch:{ ExecutionException -> 0x0480, CancellationException -> 0x0471 }
            r3 = 0
            r1.f69350l = r3
            com.google.android.libraries.lens.view.au.y r0 = r1.f69343e
            com.google.android.libraries.lens.view.au.s r0 = r0.mo30606b()
            java.lang.Object r0 = r0.mo30656d()
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0
            java.lang.Object r0 = r0.mo56107c()
            r4 = r0
            com.google.android.libraries.lens.view.au.x r4 = (com.google.android.libraries.lens.view.p2081au.C25574x) r4
            com.google.android.libraries.lens.e.s r0 = r2.mo30614a()
            com.google.android.libraries.lens.e.r r0 = r0.mo29709e()
            com.google.android.libraries.lens.view.session.bm r5 = r4.mo30644a()
            boolean r6 = r1.f69364z
            int r12 = com.google.android.libraries.lens.view.session.C27761ax.m51631h(r0, r5, r6)
            com.google.android.libraries.lens.view.session.bm r0 = r4.mo30644a()
            int r13 = com.google.android.libraries.lens.view.session.C27761ax.m51630g(r12, r0)
            com.google.android.libraries.lens.view.session.bm r7 = r4.mo30644a()
            com.google.common.base.ax r0 = r4.mo30647d()
            java.lang.Object r0 = r0.mo56111f()
            r8 = r0
            com.google.bp.f.b.a.be r8 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56251be) r8
            boolean r9 = r4.mo30650f()
            com.google.common.base.ax r0 = r4.mo30648e()
            java.lang.Object r0 = r0.mo56111f()
            r10 = r0
            com.google.common.o.l.n r10 = (com.google.common.p4552o.p4566l.C60214n) r10
            com.google.common.base.ax r0 = r4.mo30646c()
            java.lang.Object r0 = r0.mo56111f()
            r11 = r0
            com.google.common.o.abp r11 = (com.google.common.p4552o.abp) r11
            com.google.android.libraries.lens.e.y r5 = r7.mo33262j(r8, r9, r10, r11, r12, r13)
            com.google.android.libraries.lens.view.ak.bd r0 = r1.f69357s
            com.google.android.libraries.lens.view.ak.bt r0 = r0.f68662a
            r6 = 1
            com.google.protobuf.MessageLite r0 = r0.mo30362b(r6)
            com.google.android.libraries.lens.view.ak.ae r0 = (com.google.android.libraries.lens.view.p2067ak.C25199ae) r0
            com.google.android.libraries.lens.view.ak.bw r0 = r0.f68634g
            if (r0 != 0) goto L_0x009d
            com.google.android.libraries.lens.view.ak.bw r0 = com.google.android.libraries.lens.view.p2067ak.C25244bw.f68702b
        L_0x009d:
            long r7 = r0.f68704a
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00b7
            com.google.android.libraries.f.a r0 = r1.f69361w
            long r7 = r0.mo26870b()
            com.google.android.libraries.lens.view.ak.bd r0 = r1.f69357s
            com.google.android.libraries.lens.view.ak.bt r0 = r0.f68662a
            com.google.android.libraries.lens.view.ak.ak r9 = new com.google.android.libraries.lens.view.ak.ak
            r9.<init>(r7)
            r0.mo30363c(r9)
        L_0x00b7:
            com.google.android.libraries.lens.view.af.av r9 = r1.f69355q
            com.google.android.libraries.lens.view.session.ax r10 = r1.f69356r
            android.content.Context r0 = r1.f69352n
            com.google.common.o.aac r11 = com.google.android.libraries.lens.view.utils.C28137z.m52436b(r0, r3)
            com.google.common.o.aba r0 = com.google.common.p4552o.aba.f158175d
            com.google.protobuf.bn r0 = r0.createBuilder()
            r12 = r0
            com.google.common.o.aaz r12 = (com.google.common.p4552o.aaz) r12
            com.google.android.libraries.lens.view.session.ondevice.f r0 = r1.f69341c
            com.google.common.util.concurrent.cx r13 = r0.f76133e
            if (r13 == 0) goto L_0x0119
            boolean r13 = r13.isDone()
            if (r13 != 0) goto L_0x00d7
            goto L_0x0119
        L_0x00d7:
            com.google.common.util.concurrent.cx r0 = r0.f76133e     // Catch:{ ExecutionException -> 0x0100 }
            java.lang.Object r0 = com.google.common.util.concurrent.C60856cj.m92909r(r0)     // Catch:{ ExecutionException -> 0x0100 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ ExecutionException -> 0x0100 }
            boolean r13 = r0.booleanValue()     // Catch:{ ExecutionException -> 0x0100 }
            com.google.common.f.a.d r0 = com.google.android.libraries.lens.view.session.ondevice.C27968f.f76129a     // Catch:{ ExecutionException -> 0x00fe }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ ExecutionException -> 0x00fe }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ ExecutionException -> 0x00fe }
            r14 = 49957(0xc325, float:7.0005E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r14)     // Catch:{ ExecutionException -> 0x00fe }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ ExecutionException -> 0x00fe }
            java.lang.String r14 = "HintCascadeReady: %b"
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r13)     // Catch:{ ExecutionException -> 0x00fe }
            r0.mo56389s(r14, r15)     // Catch:{ ExecutionException -> 0x00fe }
            goto L_0x0110
        L_0x00fe:
            r0 = move-exception
            goto L_0x0102
        L_0x0100:
            r0 = move-exception
            r13 = 0
        L_0x0102:
            com.google.common.f.a.d r14 = com.google.android.libraries.lens.view.session.ondevice.C27968f.f76129a
            com.google.common.f.x r14 = r14.mo56226d()
            java.lang.String r15 = "hintContentAvailable inaccessible"
            r6 = 49958(0xc326, float:7.0006E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r14).mo56382g(r0)).mo56372aa(r6)).mo56386p(r15)
        L_0x0110:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x011b
        L_0x0119:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x011b:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r0 = r0.mo56109e(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r12.copyOnWrite()
            com.google.protobuf.bv r3 = r12.instance
            com.google.common.o.aba r3 = (com.google.common.p4552o.aba) r3
            int r6 = r3.f158177a
            r13 = 1
            r6 = r6 | r13
            r3.f158177a = r6
            r3.f158178b = r0
            com.google.protobuf.bv r0 = r12.build()
            com.google.common.o.aba r0 = (com.google.common.p4552o.aba) r0
            android.content.Context r3 = r1.f69353o
            boolean r3 = com.google.android.libraries.lens.view.utils.C28110al.m52391c(r3)
            android.content.Context r6 = r1.f69353o
            android.content.res.Resources r6 = r6.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.orientation
            r13 = 2
            r14 = 1
            if (r6 == r14) goto L_0x015a
            if (r6 == r13) goto L_0x0158
            r6 = 1
            goto L_0x015b
        L_0x0158:
            r6 = 3
            goto L_0x015b
        L_0x015a:
            r6 = 2
        L_0x015b:
            com.google.android.libraries.lens.view.ak.ac r14 = r1.f69358t
            boolean r14 = r14.mo30344d()
            com.google.common.o.acb r15 = com.google.common.p4552o.acb.f158263r
            com.google.protobuf.bn r15 = r15.createBuilder()
            com.google.common.o.abd r15 = (com.google.common.p4552o.abd) r15
            com.google.common.o.abm r17 = com.google.common.p4552o.abm.f158210e
            com.google.protobuf.bn r17 = r17.createBuilder()
            r12 = r17
            com.google.common.o.abi r12 = (com.google.common.p4552o.abi) r12
            com.google.android.libraries.lens.e.s r17 = r2.mo30614a()
            int r17 = r17.mo29718l()
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.common.o.abm r13 = (com.google.common.p4552o.abm) r13
            r18 = r4
            int r4 = r17 + -1
            r19 = 0
            if (r17 == 0) goto L_0x0470
            r13.f158215d = r4
            int r4 = r13.f158212a
            r4 = r4 | 16
            r13.f158212a = r4
            com.google.android.libraries.lens.e.s r4 = r2.mo30614a()
            int r4 = r4.mo29719m()
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.common.o.abm r13 = (com.google.common.p4552o.abm) r13
            int r1 = r4 + -1
            if (r4 == 0) goto L_0x046d
            r13.f158214c = r1
            int r1 = r13.f158212a
            r1 = r1 | 4
            r13.f158212a = r1
            com.google.protobuf.bv r1 = r12.build()
            com.google.common.o.abm r1 = (com.google.common.p4552o.abm) r1
            r15.copyOnWrite()
            com.google.protobuf.bv r4 = r15.instance
            com.google.common.o.acb r4 = (com.google.common.p4552o.acb) r4
            r1.getClass()
            r4.f158270f = r1
            int r1 = r4.f158265a
            r1 = r1 | 16
            r4.f158265a = r1
            com.google.android.libraries.lens.e.s r1 = r2.mo30614a()
            android.util.Size r1 = r1.mo29792n()
            com.google.common.o.abz r4 = com.google.common.p4552o.abz.f158243d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.common.o.aby r4 = (com.google.common.p4552o.aby) r4
            int r12 = r1.getWidth()
            r4.copyOnWrite()
            com.google.protobuf.bv r13 = r4.instance
            com.google.common.o.abz r13 = (com.google.common.p4552o.abz) r13
            r17 = r9
            int r9 = r13.f158245a
            r16 = 1
            r9 = r9 | 1
            r13.f158245a = r9
            r13.f158246b = r12
            int r1 = r1.getHeight()
            r4.copyOnWrite()
            com.google.protobuf.bv r9 = r4.instance
            com.google.common.o.abz r9 = (com.google.common.p4552o.abz) r9
            int r12 = r9.f158245a
            r13 = 2
            r12 = r12 | r13
            r9.f158245a = r12
            r9.f158247c = r1
            com.google.protobuf.bv r1 = r4.build()
            com.google.common.o.abz r1 = (com.google.common.p4552o.abz) r1
            r15.copyOnWrite()
            com.google.protobuf.bv r4 = r15.instance
            com.google.common.o.acb r4 = (com.google.common.p4552o.acb) r4
            r1.getClass()
            r4.f158272h = r1
            int r1 = r4.f158265a
            r1 = r1 | 128(0x80, float:1.794E-43)
            r4.f158265a = r1
            r15.copyOnWrite()
            com.google.protobuf.bv r1 = r15.instance
            com.google.common.o.acb r1 = (com.google.common.p4552o.acb) r1
            int r4 = r1.f158265a
            r4 = r4 | 4
            r1.f158265a = r4
            r1.f158268d = r7
            r1 = 1
            if (r1 == r3) goto L_0x022b
            r12 = 2
            goto L_0x022c
        L_0x022b:
            r12 = 3
        L_0x022c:
            r15.copyOnWrite()
            com.google.protobuf.bv r1 = r15.instance
            com.google.common.o.acb r1 = (com.google.common.p4552o.acb) r1
            int r12 = r12 + -1
            r1.f158277m = r12
            int r3 = r1.f158265a
            r3 = r3 | 4096(0x1000, float:5.74E-42)
            r1.f158265a = r3
            r15.copyOnWrite()
            com.google.protobuf.bv r1 = r15.instance
            com.google.common.o.acb r1 = (com.google.common.p4552o.acb) r1
            int r6 = r6 + -1
            r1.f158279o = r6
            int r3 = r1.f158265a
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            r1.f158265a = r3
            com.google.android.libraries.lens.e.s r1 = r2.mo30614a()
            int r1 = r1.mo29705a()
            r15.copyOnWrite()
            com.google.protobuf.bv r3 = r15.instance
            com.google.common.o.acb r3 = (com.google.common.p4552o.acb) r3
            int r4 = r3.f158265a
            r6 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 | r6
            r3.f158265a = r4
            r3.f158280p = r1
            r15.copyOnWrite()
            com.google.protobuf.bv r1 = r15.instance
            com.google.common.o.acb r1 = (com.google.common.p4552o.acb) r1
            int r3 = r1.f158265a
            r4 = 65536(0x10000, float:9.18355E-41)
            r3 = r3 | r4
            r1.f158265a = r3
            r1.f158281q = r14
            com.google.common.base.ax r1 = r5.mo29758c()
            boolean r1 = r1.mo56113h()
            if (r1 != 0) goto L_0x0283
            goto L_0x0329
        L_0x0283:
            com.google.common.base.ax r1 = r5.mo29758c()
            java.lang.Object r1 = r1.mo56107c()
            com.google.bp.f.b.a.be r1 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56251be) r1
            int r1 = r1.f149847a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0329
            com.google.common.base.ax r1 = r5.mo29758c()
            java.lang.Object r1 = r1.mo56107c()
            com.google.bp.f.b.a.be r1 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56251be) r1
            com.google.lens.j.dc r1 = r1.f149849c
            if (r1 != 0) goto L_0x02a3
            com.google.lens.j.dc r1 = com.google.lens.p4707j.C62480dc.f168685c
        L_0x02a3:
            int r1 = r1.f168687a
            r3 = 1
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0329
            com.google.common.base.ax r1 = r5.mo29758c()
            java.lang.Object r1 = r1.mo56107c()
            com.google.bp.f.b.a.be r1 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56251be) r1
            com.google.lens.j.dc r1 = r1.f149849c
            if (r1 != 0) goto L_0x02b9
            com.google.lens.j.dc r1 = com.google.lens.p4707j.C62480dc.f168685c
        L_0x02b9:
            java.lang.String r1 = r1.f168688b
            com.google.common.o.abq r3 = com.google.common.p4552o.abq.f158222e
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.common.o.abn r3 = (com.google.common.p4552o.abn) r3
            int r4 = r1.length()
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.common.o.abq r7 = (com.google.common.p4552o.abq) r7
            int r8 = r7.f158224a
            r9 = 1
            r8 = r8 | r9
            r7.f158224a = r8
            r7.f158225b = r4
            java.lang.String r4 = "[^a-zA-Z0-9 ]"
            java.lang.String r7 = ""
            java.lang.String r1 = r1.replaceAll(r4, r7)
            java.lang.String r4 = " +"
            java.lang.String[] r1 = r1.split(r4)
            int r1 = r1.length
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.abq r4 = (com.google.common.p4552o.abq) r4
            int r7 = r4.f158224a
            r8 = 2
            r7 = r7 | r8
            r4.f158224a = r7
            r4.f158226c = r1
            com.google.common.base.ax r1 = r5.mo29757b()
            com.google.common.o.abp r4 = com.google.common.p4552o.abp.UNKNOWN_QUERY_SOURCE
            java.lang.Object r1 = r1.mo56109e(r4)
            com.google.common.o.abp r1 = (com.google.common.p4552o.abp) r1
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.abq r4 = (com.google.common.p4552o.abq) r4
            int r1 = r1.f158221d
            r4.f158227d = r1
            int r1 = r4.f158224a
            r1 = r1 | 4
            r4.f158224a = r1
            r15.copyOnWrite()
            com.google.protobuf.bv r1 = r15.instance
            com.google.common.o.acb r1 = (com.google.common.p4552o.acb) r1
            com.google.protobuf.bv r3 = r3.build()
            com.google.common.o.abq r3 = (com.google.common.p4552o.abq) r3
            r3.getClass()
            r1.f158275k = r3
            int r3 = r1.f158265a
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r1.f158265a = r3
        L_0x0329:
            com.google.common.base.ax r1 = r5.mo29758c()
            boolean r1 = r1.mo56113h()
            if (r1 != 0) goto L_0x0334
            goto L_0x0398
        L_0x0334:
            com.google.common.base.ax r1 = r5.mo29758c()
            java.lang.Object r1 = r1.mo56107c()
            com.google.bp.f.b.a.be r1 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56251be) r1
            int r1 = r1.f149847a
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0398
            com.google.common.base.ax r1 = r5.mo29758c()
            java.lang.Object r1 = r1.mo56107c()
            com.google.bp.f.b.a.be r1 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56251be) r1
            com.google.lens.j.dc r1 = r1.f149849c
            if (r1 != 0) goto L_0x0354
            com.google.lens.j.dc r1 = com.google.lens.p4707j.C62480dc.f168685c
        L_0x0354:
            int r1 = r1.f168687a
            r3 = 1
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0398
            java.lang.String r1 = r10.f75766a
            if (r1 == 0) goto L_0x0398
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            boolean r1 = com.google.lens.p4711m.C62632i.m94822g(r1)
            if (r1 != 0) goto L_0x0398
            java.lang.String r1 = r10.f75766a
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            boolean r1 = com.google.lens.p4711m.C62632i.m94817b(r1)
            if (r1 != 0) goto L_0x0398
            com.google.common.base.ax r1 = r5.mo29758c()
            java.lang.Object r1 = r1.mo56107c()
            com.google.bp.f.b.a.be r1 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56251be) r1
            com.google.lens.j.dc r1 = r1.f149849c
            if (r1 != 0) goto L_0x0384
            com.google.lens.j.dc r1 = com.google.lens.p4707j.C62480dc.f168685c
        L_0x0384:
            java.lang.String r1 = r1.f168688b
            r15.copyOnWrite()
            com.google.protobuf.bv r3 = r15.instance
            com.google.common.o.acb r3 = (com.google.common.p4552o.acb) r3
            r1.getClass()
            int r4 = r3.f158265a
            r4 = r4 | 2048(0x800, float:2.87E-42)
            r3.f158265a = r4
            r3.f158276l = r1
        L_0x0398:
            com.google.common.o.uf r1 = com.google.common.p4552o.C60555uf.f164065cO
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.common.o.tz r1 = (com.google.common.p4552o.C60548tz) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.common.o.uf r3 = (com.google.common.p4552o.C60555uf) r3
            int r4 = r3.f164093a
            r7 = 2
            r4 = r4 | r7
            r3.f164093a = r4
            r4 = 1151(0x47f, float:1.613E-42)
            r3.f164258m = r4
            com.google.common.o.aar r3 = r10.mo33231b()
            com.google.android.libraries.lens.e.s r4 = r2.mo30614a()
            com.google.android.libraries.lens.e.r r4 = r4.mo29709e()
            com.google.common.o.acp r4 = com.google.android.libraries.lens.view.session.C27761ax.m51629f(r4, r5)
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.common.o.aas r7 = (com.google.common.p4552o.aas) r7
            com.google.common.o.aas r8 = com.google.common.p4552o.aas.f158145p
            r4.getClass()
            r7.f158150d = r4
            int r4 = r7.f158147a
            r4 = r4 | 8
            r7.f158147a = r4
            com.google.protobuf.bv r4 = r15.build()
            com.google.common.o.acb r4 = (com.google.common.p4552o.acb) r4
            r3.copyOnWrite()
            com.google.protobuf.bv r7 = r3.instance
            com.google.common.o.aas r7 = (com.google.common.p4552o.aas) r7
            r4.getClass()
            r7.f158149c = r4
            int r4 = r7.f158147a
            r4 = r4 | 4
            r7.f158147a = r4
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.aas r4 = (com.google.common.p4552o.aas) r4
            r11.getClass()
            r4.f158156j = r11
            int r7 = r4.f158147a
            r6 = r6 | r7
            r4.f158147a = r6
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.common.o.aas r4 = (com.google.common.p4552o.aas) r4
            r0.getClass()
            r4.f158160n = r0
            int r0 = r4.f158147a
            r6 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 | r6
            r4.f158147a = r0
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            com.google.protobuf.bv r3 = r3.build()
            com.google.common.o.aas r3 = (com.google.common.p4552o.aas) r3
            r3.getClass()
            r0.f164197by = r3
            int r3 = r0.f164253h
            r3 = r3 | 8
            r0.f164253h = r3
            com.google.protobuf.bv r0 = r1.build()
            com.google.common.o.uf r0 = (com.google.common.p4552o.C60555uf) r0
            r1 = r17
            r1.mo30241a(r0)
            com.google.android.libraries.lens.e.af r0 = com.google.android.libraries.lens.p2014e.C24203af.m45046b()
            r3 = 1
            r1 = r20
            com.google.android.libraries.lens.e.ae r3 = r1.mo30487a(r2, r3)
            com.google.android.libraries.lens.e.ah r4 = m46884b(r2)
            com.google.android.libraries.lens.e.s r6 = r2.mo30614a()
            com.google.android.libraries.lens.e.i r7 = new com.google.android.libraries.lens.e.i
            r7.<init>()
            r7.f66240a = r0
            r7.f66241b = r3
            r7.mo29676b(r6)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r5)
            r7.f66242c = r0
            r7.mo29677c(r4)
            com.google.android.libraries.lens.e.ad r0 = r7.mo29675a()
            r3 = r18
            r1.mo30488d(r0, r2, r3)
            com.google.android.libraries.lens.view.ad.d r0 = r1.f69359u
            com.google.android.libraries.lens.view.ad.c r2 = com.google.android.libraries.lens.view.p2053ad.C24980c.QUERY_SENT
            r0.mo30198a(r2)
            return
        L_0x046d:
            r1 = r20
            throw r19
        L_0x0470:
            throw r19
        L_0x0471:
            com.google.common.f.a.d r0 = com.google.android.libraries.lens.view.p2070an.C25454z.f69365a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r2 = "Prefetch image Future cancelled before cleared"
            r3 = 49856(0xc2c0, float:6.9863E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x0480:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r0)
            throw r2
        L_0x0487:
            com.google.common.f.a.d r0 = com.google.android.libraries.lens.view.p2070an.C25454z.f69365a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r2 = "Expected prefetchImageFuture to be complete"
            r3 = 49855(0xc2bf, float:6.9862E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r0).mo56372aa(r3)).mo56386p(r2)
        L_0x0495:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2070an.C25453y.mo30492h():void");
    }

    /* renamed from: i */
    public final void mo30493i() {
        if (!this.f69351m) {
            mo30491g(true);
        } else if (!this.f69354p.mo30941b()) {
            C58970a aVar = (C58970a) C25454z.f69365a.mo56226d();
            aVar.mo56380ai(C58979ad.FULL);
            ((C58970a) aVar.mo56372aa(49857)).mo56386p("Called after destroy");
        } else {
            throw new IllegalStateException("Called after destroy; crashing on dev build");
        }
    }
}
