package com.google.android.libraries.assistant.auto.ondevice;

import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.carassistant.p6784f.C85726n;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6519al.p6642ce.C85080a;
import com.google.android.apps.gsa.search.core.p6519al.p6757s.C85596b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.assistant.auto.ondevice.p705a.C11835b;
import com.google.android.libraries.assistant.auto.ondevice.p708b.C11839aa;
import com.google.android.libraries.assistant.auto.ondevice.p708b.C11842ad;
import com.google.android.libraries.assistant.auto.ondevice.p708b.C11843ae;
import com.google.android.libraries.assistant.auto.ondevice.p708b.C11844af;
import com.google.android.libraries.assistant.auto.ondevice.p708b.C11846c;
import com.google.android.libraries.assistant.auto.ondevice.p708b.C11847d;
import com.google.android.libraries.assistant.auto.ondevice.p708b.C11848e;
import com.google.android.libraries.assistant.auto.ondevice.p708b.C11853j;
import com.google.android.libraries.assistant.auto.ondevice.p708b.C11856m;
import com.google.android.libraries.assistant.auto.ondevice.p708b.C11857n;
import com.google.android.libraries.assistant.auto.ondevice.p708b.C11859p;
import com.google.android.libraries.assistant.auto.ondevice.p708b.C11860q;
import com.google.android.libraries.assistant.auto.ondevice.p708b.C11861r;
import com.google.android.libraries.assistant.auto.ondevice.p708b.C11868y;
import com.google.android.libraries.assistant.auto.ondevice.p708b.C11869z;
import com.google.android.libraries.assistant.auto.ondevice.p709c.C11871a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15653e;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15654f;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15661m;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1153c.C15673e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p4242bp.p4243a.p4246c.C56159d;
import com.google.p4273bs.p4277b.p4278a.C56473m;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.q */
/* compiled from: PG */
public final class C11926q extends C86734a implements C85596b {

    /* renamed from: a */
    public static final C59071e f38310a = C59071e.m91332i("com.google.android.libraries.assistant.auto.ondevice.q");

    /* renamed from: b */
    public final C22871g f38311b;

    /* renamed from: c */
    public final C11846c f38312c;

    /* renamed from: f */
    public final C85080a f38313f;

    /* renamed from: g */
    public final C58833ax f38314g;

    /* renamed from: h */
    public final C86124t f38315h;

    /* renamed from: i */
    public final C11835b f38316i;

    /* renamed from: j */
    public final C58833ax f38317j;

    /* renamed from: k */
    public boolean f38318k = false;

    /* renamed from: l */
    private final C58833ax f38319l;

    /* renamed from: m */
    private final C11930u f38320m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11926q(C22871g gVar, C58833ax axVar, C86124t tVar, C11847d dVar, C85080a aVar, C11835b bVar, C58833ax axVar2, C11930u uVar, C58833ax axVar3) {
        super(C118575h.WORKER_OFFLINE_ASSISTANT_RESPONSE, "offlineassistantresponse");
        C11847d dVar2 = dVar;
        this.f38311b = gVar;
        this.f38319l = axVar;
        C56159d dVar3 = C56159d.f149629b;
        C86124t tVar2 = (C86124t) dVar2.f38125a.mo17428b();
        C86124t tVar3 = tVar2;
        tVar2.getClass();
        C11839aa aaVar = (C11839aa) dVar2.f38126b.mo17428b();
        C11839aa aaVar2 = aaVar;
        aaVar.getClass();
        C11853j jVar = (C11853j) dVar2.f38127c.mo17428b();
        C11853j jVar2 = jVar;
        jVar.getClass();
        C11842ad adVar = (C11842ad) dVar2.f38128d.mo17428b();
        C11842ad adVar2 = adVar;
        adVar.getClass();
        C11843ae aeVar = (C11843ae) dVar2.f38129e.mo17428b();
        C11843ae aeVar2 = aeVar;
        aeVar.getClass();
        C11844af afVar = (C11844af) dVar2.f38130f.mo17428b();
        C11844af afVar2 = afVar;
        afVar.getClass();
        C11868y yVar = (C11868y) dVar2.f38131g.mo17428b();
        C11868y yVar2 = yVar;
        yVar.getClass();
        C11861r rVar = (C11861r) dVar2.f38132h.mo17428b();
        C11861r rVar2 = rVar;
        rVar.getClass();
        C11856m mVar = (C11856m) dVar2.f38133i.mo17428b();
        C11856m mVar2 = mVar;
        mVar.getClass();
        C11860q qVar = (C11860q) dVar2.f38134j.mo17428b();
        C11860q qVar2 = qVar;
        qVar.getClass();
        C11869z zVar = (C11869z) dVar2.f38135k.mo17428b();
        C11869z zVar2 = zVar;
        zVar.getClass();
        C11859p pVar = (C11859p) dVar2.f38136l.mo17428b();
        C11859p pVar2 = pVar;
        pVar.getClass();
        C11848e eVar = (C11848e) dVar2.f38137m.mo17428b();
        C11848e eVar2 = eVar;
        eVar.getClass();
        C11857n nVar = (C11857n) dVar2.f38138n.mo17428b();
        C11857n nVar2 = nVar;
        nVar.getClass();
        b bVar2 = (b) dVar2.f38139o.mo17428b();
        b bVar3 = bVar2;
        bVar2.getClass();
        C85726n nVar3 = (C85726n) dVar2.f38140p.mo17428b();
        C85726n nVar4 = nVar3;
        nVar3.getClass();
        C86054o oVar = (C86054o) dVar2.f38141q.mo17428b();
        oVar.getClass();
        dVar3.getClass();
        this.f38312c = new C11846c(tVar3, aaVar2, jVar2, adVar2, aeVar2, afVar2, yVar2, rVar2, mVar2, qVar2, zVar2, pVar2, eVar2, nVar2, bVar3, nVar4, oVar, dVar3);
        this.f38314g = axVar2;
        this.f38313f = aVar;
        this.f38315h = tVar;
        this.f38316i = bVar;
        this.f38320m = uVar;
        this.f38317j = axVar3;
    }

    /* renamed from: f */
    private final C60870cx m27732f(Callable callable) {
        C22871g gVar = this.f38311b;
        return this.f38311b.mo28205e(gVar.mo28210j(gVar.mo28201a("loadSharedLibrary", new C11919j(this)), "#loadSharedLibrary", new C11906f(callable)), "Catching failure in callIfInitSucceeds().", Exception.class, C11916g.f38297a);
    }

    /* renamed from: a */
    public final C60870cx mo20301a(String str) {
        if (this.f38319l.mo56113h()) {
            return C60856cj.m92900i(((C11871a) this.f38319l.mo56107c()).mo20260d());
        }
        return C60856cj.m92900i(C56473m.f150850b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e4, code lost:
        if (r1.f38106b.mo79746e(com.google.android.apps.gsa.shared.p7066m.C90086ek.f250251C) != false) goto L_0x00e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00be  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20302b(com.google.assistant.p3897e.p3921j.C52081en r11) {
        /*
            r10 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            boolean r0 = r10.f38318k
            if (r0 == 0) goto L_0x001f
            com.google.protobuf.cq r0 = r11.f136684d
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)
            com.google.android.libraries.assistant.auto.ondevice.c r1 = com.google.android.libraries.assistant.auto.ondevice.C11870c.f38215a
            boolean r0 = r0.noneMatch(r1)
            if (r0 != 0) goto L_0x0015
            goto L_0x001f
        L_0x0015:
            com.google.android.libraries.assistant.auto.ondevice.d r11 = new com.google.android.libraries.assistant.auto.ondevice.d
            r11.<init>(r10)
            com.google.common.util.concurrent.cx r11 = r10.m27732f(r11)
            return r11
        L_0x001f:
            r0 = 0
            r10.f38318k = r0
            com.google.android.apps.gsa.search.core.i.t r1 = r10.f38315h
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250335bG
            boolean r1 = r1.mo79746e(r2)
            if (r1 == 0) goto L_0x004e
            com.google.android.libraries.assistant.auto.ondevice.a.b r0 = r10.f38316i
            com.google.android.libraries.assistant.auto.tng.r.c.b.m r1 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r.m32453f()
            com.google.android.libraries.assistant.auto.tng.r.c.b.o r11 = com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15653e.m32432a(r11)
            r2 = r1
            com.google.android.libraries.assistant.auto.tng.r.c.b.f r2 = (com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15654f) r2
            r2.f46775a = r11
            com.google.android.apps.gsa.shared.search.Query r11 = r0.f38020c
            com.google.common.base.ax r11 = r0.mo20176a(r11, r1)
            com.google.common.util.concurrent.cx r11 = r10.mo20305e(r11)
            com.google.android.libraries.assistant.auto.ondevice.e r0 = com.google.android.libraries.assistant.auto.ondevice.C11884e.f38248a
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60922j.m93044g(r11, r0, r1)
            return r11
        L_0x004e:
            com.google.android.libraries.assistant.auto.ondevice.b.c r1 = r10.f38312c
            com.google.common.f.a.d r2 = com.google.android.libraries.assistant.auto.ondevice.p708b.C11846c.f38105a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "#dispatchConversationDelta"
            r4 = 43528(0xaa08, float:6.0996E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.protobuf.cq r2 = r11.f136684d
            java.util.Iterator r2 = r2.iterator()
        L_0x0064:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0119
            java.lang.Object r3 = r2.next()
            com.google.assistant.e.j.ep r3 = (com.google.assistant.p3897e.p3921j.C52083ep) r3
            com.google.android.apps.gsa.search.core.i.t r4 = r1.f38106b
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250295aT
            boolean r4 = r4.mo79746e(r5)
            if (r4 == 0) goto L_0x0064
            int r4 = r3.f136692b
            r5 = 3
            if (r4 != r5) goto L_0x0084
            java.lang.Object r4 = r3.f136693c
            com.google.assistant.e.j.ek r4 = (com.google.assistant.p3897e.p3921j.C52078ek) r4
            goto L_0x0086
        L_0x0084:
            com.google.assistant.e.j.ek r4 = com.google.assistant.p3897e.p3921j.C52078ek.f136671f
        L_0x0086:
            int r4 = r4.f136674b
            r6 = 1
            r7 = 5
            if (r4 != r7) goto L_0x00ae
            int r4 = r3.f136692b
            if (r4 != r5) goto L_0x0095
            java.lang.Object r4 = r3.f136693c
            com.google.assistant.e.j.ek r4 = (com.google.assistant.p3897e.p3921j.C52078ek) r4
            goto L_0x0097
        L_0x0095:
            com.google.assistant.e.j.ek r4 = com.google.assistant.p3897e.p3921j.C52078ek.f136671f
        L_0x0097:
            int r8 = r4.f136674b
            if (r8 != r7) goto L_0x00a0
            java.lang.Object r4 = r4.f136675c
            com.google.assistant.e.j.du r4 = (com.google.assistant.p3897e.p3921j.C51805du) r4
            goto L_0x00a2
        L_0x00a0:
            com.google.assistant.e.j.du r4 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x00a2:
            java.lang.String r8 = "message_notification.READ"
            java.lang.String r4 = r4.f135927b
            boolean r4 = android.text.TextUtils.equals(r8, r4)
            if (r4 == 0) goto L_0x00ae
            r4 = 1
            goto L_0x00af
        L_0x00ae:
            r4 = 0
        L_0x00af:
            int r8 = r3.f136692b
            if (r8 != r5) goto L_0x00b8
            java.lang.Object r9 = r3.f136693c
            com.google.assistant.e.j.ek r9 = (com.google.assistant.p3897e.p3921j.C52078ek) r9
            goto L_0x00ba
        L_0x00b8:
            com.google.assistant.e.j.ek r9 = com.google.assistant.p3897e.p3921j.C52078ek.f136671f
        L_0x00ba:
            int r9 = r9.f136674b
            if (r9 != r7) goto L_0x00e7
            if (r8 != r5) goto L_0x00c5
            java.lang.Object r3 = r3.f136693c
            com.google.assistant.e.j.ek r3 = (com.google.assistant.p3897e.p3921j.C52078ek) r3
            goto L_0x00c7
        L_0x00c5:
            com.google.assistant.e.j.ek r3 = com.google.assistant.p3897e.p3921j.C52078ek.f136671f
        L_0x00c7:
            int r5 = r3.f136674b
            if (r5 != r7) goto L_0x00d0
            java.lang.Object r3 = r3.f136675c
            com.google.assistant.e.j.du r3 = (com.google.assistant.p3897e.p3921j.C51805du) r3
            goto L_0x00d2
        L_0x00d0:
            com.google.assistant.e.j.du r3 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x00d2:
            java.lang.String r5 = "message_notification.REPLY"
            java.lang.String r3 = r3.f135927b
            boolean r3 = android.text.TextUtils.equals(r5, r3)
            if (r3 == 0) goto L_0x00e7
            com.google.android.apps.gsa.search.core.i.t r3 = r1.f38106b
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90086ek.f250251C
            boolean r3 = r3.mo79746e(r5)
            if (r3 == 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00e7:
            r6 = 0
        L_0x00e8:
            if (r4 != 0) goto L_0x00ec
            if (r6 == 0) goto L_0x0064
        L_0x00ec:
            com.google.android.apps.gsa.search.core.google.gaia.o r0 = r1.f38120p
            android.accounts.Account r0 = r0.mo79668a()
            if (r0 == 0) goto L_0x0105
            com.google.android.apps.gsa.search.core.carassistant.f.n r0 = r1.f38119o
            boolean r0 = r0.mo79376c()
            if (r0 != 0) goto L_0x0105
            com.google.android.libraries.assistant.auto.ondevice.b.z r0 = r1.f38115k
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            r1.f38122r = r0
            goto L_0x0116
        L_0x0105:
            if (r4 == 0) goto L_0x010e
            com.google.android.libraries.assistant.auto.ondevice.b.ae r0 = r1.f38110f
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0114
        L_0x010e:
            com.google.android.libraries.assistant.auto.ondevice.b.n r0 = r1.f38124t
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
        L_0x0114:
            r1.f38122r = r0
        L_0x0116:
            com.google.common.base.ax r0 = r1.f38122r
            goto L_0x0126
        L_0x0119:
            com.google.common.base.ax r0 = r1.f38122r
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x0124
            com.google.common.base.ax r0 = r1.f38122r
            goto L_0x0126
        L_0x0124:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0126:
            boolean r1 = r0.mo56113h()
            if (r1 == 0) goto L_0x0137
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.g.b.a r0 = (com.google.android.apps.gsa.g.b.a) r0
            com.google.common.util.concurrent.cx r11 = r0.c(r11)
            return r11
        L_0x0137:
            com.google.assistant.e.j.en r11 = com.google.assistant.p3897e.p3921j.C52081en.f136679i
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r11)
            com.google.common.util.concurrent.cx r11 = com.google.common.util.concurrent.C60856cj.m92900i(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.ondevice.C11926q.mo20302b(com.google.assistant.e.j.en):com.google.common.util.concurrent.cx");
    }

    /* renamed from: c */
    public final C60870cx mo20303c(C61752n nVar, Query query) {
        if ((!this.f38315h.mo79746e(C90086ek.f250359be) || !nVar.f166811b.startsWith("ActionPackage__")) && (!this.f38317j.mo56113h() || !C15673e.f46796a.contains(nVar.f166811b))) {
            C58976aa aaVar = C58975e.f156826a;
            this.f38318k = false;
            if (!this.f38315h.mo79746e(C90086ek.f250335bG)) {
                return this.f38311b.mo28201a("Dispatching IntentQuery", new C11837b(this, nVar, query));
            }
            C11835b bVar = this.f38316i;
            C15661m f = C15666r.m32453f();
            ((C15654f) f).f46775a = C15653e.m32433b(nVar);
            return mo20305e(bVar.mo20176a(query, f));
        }
        this.f38318k = true;
        return m27732f(new C11925p(this));
    }

    /* renamed from: d */
    public final C60870cx mo20304d(com.google.android.apps.gsa.g.f.b bVar, Query query) {
        if (bVar == com.google.android.apps.gsa.g.f.b.a) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        return m27732f(new C11918i(this, bVar, query));
    }

    /* renamed from: e */
    public final C60870cx mo20305e(C58833ax axVar) {
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C22871g gVar = this.f38311b;
        C11930u uVar = this.f38320m;
        return gVar.mo28210j(uVar.f38324c.mo28209i(uVar.f38323b.mo79697b(), "Get portable fulfiller from fulfillment box.", new C11929t(uVar)), "Get results from fulfillment box.", new C11920k(axVar));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
