package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.gsa.contacts.cn;
import com.google.android.apps.gsa.p8839t.p8844e.C118354c;
import com.google.android.apps.gsa.p8839t.p8844e.C118355d;
import com.google.android.apps.gsa.p8839t.p8844e.C118356e;
import com.google.android.apps.gsa.p8839t.p8844e.C118357f;
import com.google.android.apps.gsa.p8839t.p8847h.C118407b;
import com.google.android.apps.gsa.p8839t.p8847h.C118427c;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87694ac;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8451c.C110560t;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8627a.C114547f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114723c;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114724d;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114725e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114726f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114728h;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e.C114729i;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114741k;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114759m;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114865dh;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114880l;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.platform.p8637a.C114903ab;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115025cb;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115035cl;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115051da;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115053dc;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115055de;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.assistant.p3994s.p3995a.C53268hp;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5294a.C68226l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.ci */
/* compiled from: PG */
public final class C114708ci {

    /* renamed from: a */
    public static final C59071e f318280a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.ci");

    /* renamed from: b */
    public final C22871g f318281b;

    /* renamed from: c */
    public C114759m f318282c;

    /* renamed from: d */
    public final Object f318283d = new Object();

    /* renamed from: e */
    public final C114560aj f318284e;

    /* renamed from: f */
    public final C114602bw f318285f;

    /* renamed from: g */
    public final C115087y f318286g;

    /* renamed from: h */
    C58485gu f318287h;

    /* renamed from: i */
    public C58485gu f318288i;

    /* renamed from: j */
    public C58485gu f318289j;

    /* renamed from: k */
    public boolean f318290k = false;

    /* renamed from: l */
    SettableFuture f318291l = new SettableFuture();

    /* renamed from: m */
    private final C22871g f318292m;

    /* renamed from: n */
    private final C107698i f318293n;

    /* renamed from: o */
    private final C53306j f318294o;

    /* renamed from: p */
    private final int f318295p;

    public C114708ci(Context context, C114561ak akVar, C114603bx bxVar, C115088z zVar, C86124t tVar, C22871g gVar, C22871g gVar2, C107698i iVar, boolean z, C53306j jVar) {
        C114561ak akVar2 = akVar;
        C114603bx bxVar2 = bxVar;
        C115088z zVar2 = zVar;
        Context a = C39239a.m68666a(context, C39226b.TAG_CLASSIC_ASSISTANT_SNAPSHOT);
        a.getClass();
        jVar.getClass();
        C86124t tVar2 = (C86124t) akVar2.f317681a.mo17428b();
        tVar2.getClass();
        C22871g gVar3 = (C22871g) akVar2.f317682b.mo17428b();
        gVar3.getClass();
        ((C22871g) akVar2.f317683c.mo17428b()).getClass();
        ((C22871g) akVar2.f317684d.mo17428b()).getClass();
        C115035cl clVar = (C115035cl) akVar2.f317685e.mo17428b();
        clVar.getClass();
        ((C115051da) akVar2.f317686f.mo17428b()).getClass();
        C115055de deVar = (C115055de) akVar2.f317687g.mo17428b();
        deVar.getClass();
        ((C115053dc) akVar2.f317688h.mo17428b()).getClass();
        C114724d dVar = (C114724d) akVar2.f317689i.mo17428b();
        dVar.getClass();
        C114729i iVar2 = (C114729i) akVar2.f317690j.mo17428b();
        iVar2.getClass();
        C114726f fVar = (C114726f) akVar2.f317691k.mo17428b();
        fVar.getClass();
        C118357f fVar2 = (C118357f) akVar2.f317692l.mo17428b();
        fVar2.getClass();
        C68214a a2 = C68219e.m98518a(((C68226l) akVar2.f317693m).f184585a);
        a2.getClass();
        cn cnVar = (cn) akVar2.f317694n.mo17428b();
        cnVar.getClass();
        this.f318284e = new C114560aj(a, jVar, tVar2, gVar3, clVar, deVar, dVar, iVar2, fVar, fVar2, a2, cnVar);
        C114605bz bzVar = (C114605bz) bxVar2.f317866a.mo17428b();
        C114605bz bzVar2 = bzVar;
        bzVar.getClass();
        C108013bm bmVar = (C108013bm) bxVar2.f317867b.mo17428b();
        C108013bm bmVar2 = bmVar;
        bmVar.getClass();
        C114547f fVar3 = (C114547f) bxVar2.f317868c.mo17428b();
        C114547f fVar4 = fVar3;
        fVar3.getClass();
        C68214a a3 = C68219e.m98518a(((C68226l) bxVar2.f317869d).f184585a);
        C68214a aVar = a3;
        a3.getClass();
        C86124t tVar3 = (C86124t) bxVar2.f317870e.mo17428b();
        C86124t tVar4 = tVar3;
        tVar3.getClass();
        C22871g gVar4 = (C22871g) bxVar2.f317871f.mo17428b();
        C22871g gVar5 = gVar4;
        gVar4.getClass();
        C22871g gVar6 = (C22871g) bxVar2.f317872g.mo17428b();
        C22871g gVar7 = gVar6;
        gVar6.getClass();
        C22871g gVar8 = (C22871g) bxVar2.f317873h.mo17428b();
        C22871g gVar9 = gVar8;
        gVar8.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) bxVar2.f317874i.mo17428b();
        SharedPreferences sharedPreferences2 = sharedPreferences;
        sharedPreferences.getClass();
        C21370a aVar2 = (C21370a) bxVar2.f317875j.mo17428b();
        C21370a aVar3 = aVar2;
        aVar2.getClass();
        C86054o oVar = (C86054o) bxVar2.f317876k.mo17428b();
        C86054o oVar2 = oVar;
        oVar.getClass();
        C107710u uVar = (C107710u) bxVar2.f317877l.mo17428b();
        C107710u uVar2 = uVar;
        uVar.getClass();
        C107698i iVar3 = (C107698i) bxVar2.f317878m.mo17428b();
        C107698i iVar4 = iVar3;
        iVar3.getClass();
        C68214a a4 = C68219e.m98518a(((C68226l) bxVar2.f317879n).f184585a);
        C68214a aVar4 = a4;
        a4.getClass();
        C110560t tVar5 = (C110560t) bxVar2.f317880o.mo17428b();
        C110560t tVar6 = tVar5;
        tVar5.getClass();
        C68214a a5 = C68219e.m98518a(((C68226l) bxVar2.f317881p).f184585a);
        C68214a aVar5 = a5;
        a5.getClass();
        C114903ab abVar = (C114903ab) bxVar2.f317882q.mo17428b();
        C114903ab abVar2 = abVar;
        abVar.getClass();
        C114880l lVar = (C114880l) bxVar2.f317883r.mo17428b();
        lVar.getClass();
        C114865dh dhVar = (C114865dh) bxVar2.f317884s.mo17428b();
        dhVar.getClass();
        jVar.getClass();
        C114602bw bwVar = new C114602bw(bzVar2, bmVar2, fVar4, aVar, tVar4, gVar5, gVar7, gVar9, sharedPreferences2, aVar3, oVar2, uVar2, iVar4, aVar4, tVar6, aVar5, abVar2, lVar, dhVar, z, jVar);
        this.f318285f = bwVar;
        C115088z zVar3 = zVar;
        C86124t tVar7 = (C86124t) zVar3.f319486a.mo17428b();
        tVar7.getClass();
        C22871g gVar10 = (C22871g) zVar3.f319487b.mo17428b();
        gVar10.getClass();
        C58833ax axVar = (C58833ax) zVar3.f319488c.mo17428b();
        axVar.getClass();
        C68214a a6 = C68219e.m98518a(((C68226l) zVar3.f319489d).f184585a);
        a6.getClass();
        ((C115025cb) zVar3.f319490e.mo17428b()).getClass();
        jVar.getClass();
        C68214a a7 = C68219e.m98518a(((C68226l) zVar3.f319491f).f184585a);
        a7.getClass();
        this.f318286g = new C115087y(tVar7, gVar10, axVar, a6, jVar, a7);
        this.f318281b = gVar2;
        this.f318292m = gVar;
        this.f318293n = iVar;
        C114707ch chVar = new C114707ch(this);
        C58976aa aaVar = C58975e.f156826a;
        bwVar.f317852m = chVar;
        this.f318295p = ((int) tVar.mo79743a(C90014bt.f247810oF)) + 1;
        this.f318294o = jVar;
    }

    /* renamed from: g */
    private final void m190140g(boolean z) {
        C60870cx e;
        C60870cx cxVar;
        C60870cx i;
        C60870cx i2;
        synchronized (this.f318283d) {
            this.f318290k = true;
            C60870cx[] cxVarArr = new C60870cx[3];
            C22871g gVar = this.f318281b;
            C114602bw bwVar = this.f318285f;
            C58976aa aaVar = C58975e.f156826a;
            if (!z) {
                if (bwVar.f317850k == C53306j.MAIN_APP) {
                    bwVar.f317849j.mo28212l("onGenericClientEvent", new C114600bu(bwVar, new C88489j(C87739bu.REQUEST_ZERO_STATE_RESPONSE).mo82013a()));
                }
                if (bwVar.mo101448j()) {
                    C60870cx cxVar2 = (C60870cx) bwVar.f317855p.mo6453a();
                }
                new C90873ag(bwVar.mo101443e(), bwVar.f317845f, "hasValidCachedResponseToShow", new C114598bs(bwVar)).mo85223a(new C114599bt(bwVar));
            }
            bwVar.f317851l.mo101662a(new C114601bv(bwVar));
            synchronized (bwVar.f317848i) {
                e = C90877ak.m148471e(bwVar.f317854o, bwVar.f317844e.mo79743a(C90014bt.f247810oF), TimeUnit.SECONDS, bwVar.f317842c);
            }
            cxVarArr[0] = gVar.mo28209i(e, "zsResponseDataManager.getSectionDataListFuture()", new C114706cg(this));
            C22871g gVar2 = this.f318281b;
            C114560aj ajVar = this.f318284e;
            if (ajVar.mo101407c()) {
                ajVar.f317677n.mo57356n(C58485gu.m89845m());
            }
            ((C89859i) ajVar.f317668e.mo27525b()).mo83702b(C89849ae.OPA_ZERO_STATE_INITIALIZE_LOCAL_DATA);
            ajVar.f317667d.name();
            if (ajVar.f317667d.ordinal() != 14) {
                C60870cx[] cxVarArr2 = new C60870cx[4];
                C118356e eVar = ajVar.f317672i;
                if (eVar == null) {
                    cxVar = C118826c.f331423b;
                } else {
                    C22871g gVar3 = ajVar.f317666c;
                    ((C89859i) eVar.f328511g.mo27525b()).mo83702b(C89849ae.OPA_ZERO_STATE_TOP_CONTACT_MANAGER_START_INIT);
                    new C90873ag(eVar.f328509e.mo76935j(), eVar.f328506b, "opaStore.getTopContactSections", new C118354c(eVar)).mo85223a(new C118355d(eVar));
                    if (!eVar.f328514j) {
                        eVar.mo103677b();
                        eVar.f328514j = true;
                    }
                    C60870cx e2 = C90877ak.m148471e(eVar.f328515k, eVar.f328508d.mo79743a(C90014bt.f247829op), TimeUnit.SECONDS, eVar.f328507c);
                    C89859i iVar = (C89859i) eVar.f328511g.mo27525b();
                    new C90873ag(e2, eVar.f328507c, "attach timeout callback", new C118407b(C89849ae.OPA_ZERO_STATE_TOP_CONTACT_MANAGER_FINISH_INIT, iVar)).mo85223a(new C118427c(C89849ae.OPA_ZERO_STATE_TOP_CONTACT_MANAGER_INIT_TIMEOUT, iVar));
                    cxVar = gVar3.mo28209i(e2, "topContactManager.getTopContactListFuture()", new C114551aa(ajVar));
                }
                cxVarArr2[0] = cxVar;
                cxVarArr2[1] = ajVar.mo101405a();
                C114728h hVar = ajVar.f317670g;
                if (hVar == null) {
                    i = C118826c.f331423b;
                } else {
                    C22871g gVar4 = ajVar.f317666c;
                    if (!hVar.f318367g) {
                        hVar.mo101546a();
                        hVar.f318367g = true;
                    }
                    i = gVar4.mo28209i(C90877ak.m148471e(hVar.f318366f, hVar.f318363c.mo79743a(C90014bt.f247829op), TimeUnit.SECONDS, hVar.f318365e), "smsManager.getUnreadSmsByPhoneNumberMapFuture()", new C114559ai(ajVar));
                }
                cxVarArr2[2] = i;
                C114725e eVar2 = ajVar.f317671h;
                if (eVar2 == null) {
                    i2 = C118826c.f331423b;
                } else {
                    i2 = ajVar.f317666c.mo28209i(eVar2.mo101543a(), "messageManager.getMessageNotificationListFuture()", new C114552ab(ajVar));
                }
                cxVarArr2[3] = i2;
                new C90873ag(C60856cj.m92907p(cxVarArr2), ajVar.f317666c, "initializeLocalSections", new C114557ag(ajVar)).mo85223a(new C114558ah(ajVar));
            } else {
                new C90873ag(ajVar.mo101405a(), ajVar.f317666c, "initializeLocalSectionsInAmbientMode()", new C114553ac(ajVar)).mo85223a(new C114554ad(ajVar));
            }
            C60870cx e3 = C90877ak.m148471e(ajVar.f317677n, ajVar.f317665b.mo79743a(C90014bt.f247810oF), TimeUnit.SECONDS, ajVar.f317666c);
            C114741k.m190203a(e3, (C89859i) ajVar.f317668e.mo27525b(), ajVar.f317666c, C89849ae.OPA_ZERO_STATE_LOCAL_DATA_LOADED, C89849ae.OPA_ZERO_STATE_LOCAL_DATA_TIMEOUT);
            cxVarArr[1] = gVar2.mo28209i(e3, "localDataManager.getSectionDataListFuture()", new C114702cc(this));
            cxVarArr[2] = this.f318281b.mo28209i(this.f318286g.mo101842a(), "homeAutomationDataManager.getSectionDataListFuture()", new C114614ca(this));
            new C90873ag(C60856cj.m92907p(cxVarArr), this.f318281b, "buildSectionDataLists", new C114703cd(this)).mo85223a(new C114704ce(this));
        }
    }

    /* renamed from: a */
    public final C60870cx mo101525a() {
        C60870cx e;
        C58976aa aaVar = C58975e.f156826a;
        m190140g(false);
        synchronized (this.f318283d) {
            e = C90877ak.m148471e(this.f318291l, (long) this.f318295p, TimeUnit.SECONDS, this.f318281b);
        }
        return e;
    }

    /* renamed from: b */
    public final void mo101526b() {
        C58976aa aaVar = C58975e.f156826a;
        C114602bw bwVar = this.f318285f;
        bwVar.f317846g.mo96221d(bwVar, C88244um.OPA_ZERO_STATE_RESPONSE, C88244um.OPA_ZERO_STATE_ASYNC_UPDATE_RESPONSE);
        C114725e eVar = this.f318284e.f317671h;
        if (eVar != null) {
            eVar.f318347b.mo96221d(eVar, C88244um.VALID_UNREAD_MESSAGES);
        }
        this.f318282c = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01d5, code lost:
        if (r6 == false) goto L_0x01de;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101527c() {
        /*
            r19 = this;
            r1 = r19
            com.google.common.b.gu r0 = r1.f318288i
            com.google.common.b.gu r2 = r1.f318287h
            com.google.common.b.gu r3 = r1.f318289j
            com.google.assistant.s.a.j r4 = r1.f318294o
            com.google.assistant.s.a.j r5 = com.google.assistant.p3994s.p3995a.C53306j.UNKNOWNN
            int r4 = r4.ordinal()
            r6 = 1
            if (r4 == r6) goto L_0x0171
            r7 = 14
            if (r4 == r7) goto L_0x001f
            if (r0 != 0) goto L_0x01e2
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x01e2
        L_0x001f:
            if (r0 != 0) goto L_0x0025
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x0025:
            if (r2 != 0) goto L_0x002b
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x002b:
            if (r3 != 0) goto L_0x0031
            com.google.common.b.gu r3 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x0031:
            com.google.common.base.b r4 = com.google.common.base.C58836b.f156633a
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ap r7 = new com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ap
            r7.<init>()
            int r8 = r0.size()
            r5 = r4
            r10 = r5
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r9 = 0
        L_0x0044:
            if (r9 >= r8) goto L_0x0105
            java.lang.Object r16 = r0.get(r9)
            r6 = r16
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.l r6 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114758l) r6
            r16 = r0
            boolean r0 = r6 instanceof com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115017bu
            if (r0 == 0) goto L_0x0093
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bu r6 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115017bu) r6
            com.google.common.base.ax r0 = r6.mo101817a()
            boolean r17 = r0.mo56113h()
            if (r17 == 0) goto L_0x008c
            java.lang.Object r17 = r0.mo56107c()
            java.lang.Integer r17 = (java.lang.Integer) r17
            r18 = r4
            int r4 = r17.intValue()
            r17 = r8
            r8 = 49929(0xc309, float:6.9965E-41)
            if (r4 == r8) goto L_0x0083
            r8 = 54997(0xd6d5, float:7.7067E-41)
            if (r4 == r8) goto L_0x007e
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56107c()
            goto L_0x00a1
        L_0x007e:
            com.google.common.base.ax r5 = com.google.common.base.C58833ax.m90834k(r6)
            goto L_0x00a1
        L_0x0083:
            com.google.common.base.ax r14 = com.google.common.base.C58833ax.m90834k(r6)
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r6)
            goto L_0x00a1
        L_0x008c:
            r18 = r4
            r17 = r8
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x00a1
        L_0x0093:
            r18 = r4
            r17 = r8
            boolean r0 = r6 instanceof com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C114994ay
            if (r0 == 0) goto L_0x00a3
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ay r6 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C114994ay) r6
            com.google.common.base.ax r15 = com.google.common.base.C58833ax.m90834k(r6)
        L_0x00a1:
            r8 = 1
            goto L_0x00fa
        L_0x00a3:
            int r0 = r6.mo101585b()
            r4 = 13
            if (r0 != r4) goto L_0x00c0
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.cv r6 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115045cv) r6
            com.google.assistant.s.a.gy r0 = r6.f319361a
            int r4 = r0.f139588a
            r8 = 1
            if (r4 != r8) goto L_0x00b9
            java.lang.Object r0 = r0.f139589b
            com.google.assistant.s.a.eb r0 = (com.google.assistant.p3994s.p3995a.C53173eb) r0
            goto L_0x00bb
        L_0x00b9:
            com.google.assistant.s.a.eb r0 = com.google.assistant.p3994s.p3995a.C53173eb.f139350f
        L_0x00bb:
            com.google.common.base.ax r13 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x00fa
        L_0x00c0:
            r8 = 1
            int r0 = r6.mo101585b()
            r4 = 24
            if (r0 != r4) goto L_0x00de
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.cv r6 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115045cv) r6
            com.google.assistant.s.a.gy r0 = r6.f319361a
            int r4 = r0.f139588a
            r6 = 2
            if (r4 != r6) goto L_0x00d7
            java.lang.Object r0 = r0.f139589b
            com.google.assistant.s.a.es r0 = (com.google.assistant.p3994s.p3995a.C53190es) r0
            goto L_0x00d9
        L_0x00d7:
            com.google.assistant.s.a.es r0 = com.google.assistant.p3994s.p3995a.C53190es.f139393s
        L_0x00d9:
            com.google.common.base.ax r10 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x00fa
        L_0x00de:
            int r0 = r6.mo101585b()
            r4 = 25
            if (r0 != r4) goto L_0x00fa
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.cv r6 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115045cv) r6
            com.google.assistant.s.a.gy r0 = r6.f319361a
            int r4 = r0.f139588a
            r6 = 4
            if (r4 != r6) goto L_0x00f4
            java.lang.Object r0 = r0.f139589b
            com.google.assistant.s.a.gt r0 = (com.google.assistant.p3994s.p3995a.C53245gt) r0
            goto L_0x00f6
        L_0x00f4:
            com.google.assistant.s.a.gt r0 = com.google.assistant.p3994s.p3995a.C53245gt.f139564n
        L_0x00f6:
            com.google.common.base.ax r11 = com.google.common.base.C58833ax.m90834k(r0)
        L_0x00fa:
            int r9 = r9 + 1
            r0 = r16
            r8 = r17
            r4 = r18
            r6 = 1
            goto L_0x0044
        L_0x0105:
            r18 = r4
            r8 = 1
            int r0 = r2.size()
            r6 = r4
            r9 = 0
        L_0x010e:
            if (r9 >= r0) goto L_0x0137
            java.lang.Object r16 = r2.get(r9)
            r8 = r16
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.l r8 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114758l) r8
            r16 = r0
            boolean r0 = r8 instanceof com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115034ck
            if (r0 == 0) goto L_0x0126
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ck r8 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115034ck) r8
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r8)
            r4 = r0
            goto L_0x0131
        L_0x0126:
            boolean r0 = r8 instanceof com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115052db
            if (r0 == 0) goto L_0x0131
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.db r8 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115052db) r8
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r8)
            r6 = r0
        L_0x0131:
            int r9 = r9 + 1
            r0 = r16
            r8 = 1
            goto L_0x010e
        L_0x0137:
            int r0 = r3.size()
            r2 = 0
        L_0x013c:
            if (r2 >= r0) goto L_0x0153
            java.lang.Object r8 = r3.get(r2)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.l r8 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114758l) r8
            boolean r9 = r8 instanceof com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115024ca
            if (r9 == 0) goto L_0x0150
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ca r8 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115024ca) r8
            com.google.common.base.ax r8 = com.google.common.base.C58833ax.m90834k(r8)
            r7.f319140a = r8
        L_0x0150:
            int r2 = r2 + 1
            goto L_0x013c
        L_0x0153:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.an r0 = new com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.an
            r0.<init>(r15)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ar r2 = new com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ar
            r2.<init>(r14, r13, r4, r6)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.as r3 = new com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.as
            r3.<init>(r12, r11, r10)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ao r4 = new com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ao
            r4.<init>(r5)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.y r5 = r7.mo101789a()
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89850r(r0, r2, r3, r4, r5)
            goto L_0x01e2
        L_0x0171:
            if (r0 != 0) goto L_0x0177
            com.google.common.b.gu r0 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x0177:
            if (r2 != 0) goto L_0x017d
            com.google.common.b.gu r2 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x017d:
            int r3 = r2.size()
            r4 = 0
            r5 = r4
            r6 = 0
        L_0x0184:
            if (r6 >= r3) goto L_0x01ab
            java.lang.Object r7 = r2.get(r6)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.l r7 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114758l) r7
            boolean r8 = r7 instanceof com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115034ck
            if (r8 == 0) goto L_0x0196
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ck r7 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115034ck) r7
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r5 = r7
            goto L_0x01a8
        L_0x0196:
            boolean r8 = r7 instanceof com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115054dd
            if (r8 == 0) goto L_0x01a0
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.dd r7 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115054dd) r7
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4 = r7
            goto L_0x01a8
        L_0x01a0:
            boolean r8 = r7 instanceof com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115049cz
            if (r8 == 0) goto L_0x01a8
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.cz r7 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115049cz) r7
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
        L_0x01a8:
            int r6 = r6 + 1
            goto L_0x0184
        L_0x01ab:
            int r2 = r0.size()
            r3 = 0
            r6 = 0
        L_0x01b1:
            if (r3 >= r2) goto L_0x01e2
            java.lang.Object r7 = r0.get(r3)
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.l r7 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114758l) r7
            boolean r8 = r7 instanceof com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115017bu
            if (r8 == 0) goto L_0x01df
            if (r6 != 0) goto L_0x01df
            com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.bu r7 = (com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.C115017bu) r7
            if (r5 == 0) goto L_0x01cb
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r5)
            r7.f319256h = r6
            r6 = 1
            goto L_0x01cc
        L_0x01cb:
            r6 = 0
        L_0x01cc:
            if (r4 == 0) goto L_0x01d5
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r4)
            r7.f319257i = r6
            goto L_0x01d8
        L_0x01d5:
            if (r6 != 0) goto L_0x01d8
            goto L_0x01de
        L_0x01d8:
            com.google.common.base.cr r6 = r7.mo101818c()
            r7.f319258j = r6
        L_0x01de:
            r6 = 1
        L_0x01df:
            int r3 = r3 + 1
            goto L_0x01b1
        L_0x01e2:
            java.lang.Object r2 = r1.f318283d
            monitor-enter(r2)
            com.google.common.util.concurrent.SettableFuture r3 = r1.f318291l     // Catch:{ all -> 0x024f }
            boolean r3 = r3.isDone()     // Catch:{ all -> 0x024f }
            if (r3 != 0) goto L_0x01f4
            com.google.common.util.concurrent.SettableFuture r3 = r1.f318291l     // Catch:{ all -> 0x024f }
            r3.mo57356n(r0)     // Catch:{ all -> 0x024f }
        L_0x01f2:
            r5 = 0
            goto L_0x0224
        L_0x01f4:
            boolean r3 = r0.isEmpty()     // Catch:{ all -> 0x024f }
            if (r3 == 0) goto L_0x0217
            com.google.common.f.e r3 = f318280a     // Catch:{ all -> 0x024f }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x024f }
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x024f }
            java.lang.String r5 = "ZSSectionDataManager"
            r3.mo56378ag(r4, r5)     // Catch:{ all -> 0x024f }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x024f }
            r4 = 29235(0x7233, float:4.0967E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ all -> 0x024f }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x024f }
            java.lang.String r4 = "Newly fetched sectionDataList is empty, DO NOT update existing sectionDataListFuture"
            r3.mo56386p(r4)     // Catch:{ all -> 0x024f }
            goto L_0x01f2
        L_0x0217:
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x024f }
            com.google.common.util.concurrent.SettableFuture r3 = new com.google.common.util.concurrent.SettableFuture     // Catch:{ all -> 0x024f }
            r3.<init>()     // Catch:{ all -> 0x024f }
            r1.f318291l = r3     // Catch:{ all -> 0x024f }
            r3.mo57356n(r0)     // Catch:{ all -> 0x024f }
            r5 = 1
        L_0x0224:
            monitor-exit(r2)     // Catch:{ all -> 0x024f }
            if (r5 == 0) goto L_0x024e
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            java.lang.Thread r3 = r3.getThread()
            if (r2 != r3) goto L_0x023e
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.m r2 = r1.f318282c
            if (r2 != 0) goto L_0x023a
            goto L_0x023e
        L_0x023a:
            r2.mo101409a(r0)
            return
        L_0x023e:
            com.google.android.apps.gsa.staticplugins.opa.zerostate.h.m r2 = r1.f318282c
            if (r2 == 0) goto L_0x024e
            com.google.android.libraries.gsa.k.g r2 = r1.f318292m
            com.google.android.apps.gsa.staticplugins.opa.zerostate.cb r3 = new com.google.android.apps.gsa.staticplugins.opa.zerostate.cb
            r3.<init>(r1, r0)
            java.lang.String r0 = "updateSectionDataListListeners"
            r2.mo28212l(r0, r3)
        L_0x024e:
            return
        L_0x024f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x024f }
            goto L_0x0253
        L_0x0252:
            throw r0
        L_0x0253:
            goto L_0x0252
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.zerostate.C114708ci.mo101527c():void");
    }

    /* renamed from: d */
    public final void mo101528d() {
        C58976aa aaVar = C58975e.f156826a;
        C115087y yVar = this.f318286g;
        if (yVar.f319479a.isDone()) {
            yVar.f319479a = new SettableFuture();
        }
    }

    /* renamed from: e */
    public final void mo101529e() {
        this.f318285f.mo101444f();
        m190140g(false);
    }

    /* renamed from: f */
    public final void mo101530f(C53270hr hrVar, C53287ih ihVar) {
        this.f318285f.mo101444f();
        C58976aa aaVar = C58975e.f156826a;
        C114560aj ajVar = this.f318284e;
        if (!ajVar.mo101407c()) {
            if (ajVar.f317677n.isDone()) {
                ajVar.f317677n = new SettableFuture();
            }
            C114723c cVar = ajVar.f317669f;
            if (cVar != null) {
                if (cVar.f318336j.isDone()) {
                    cVar.f318336j = new SettableFuture();
                }
                cVar.mo101541a();
                cVar.f318335i = true;
                ajVar.f317674k = C58485gu.m89845m();
            }
            C114728h hVar = ajVar.f317670g;
            if (hVar != null) {
                if (hVar.f318366f.isDone()) {
                    hVar.f318366f = new SettableFuture();
                }
                hVar.mo101546a();
                hVar.f318367g = true;
                ajVar.f317675l = new HashMap();
            }
            C114725e eVar = ajVar.f317671h;
            if (eVar != null) {
                eVar.mo101544b();
                ajVar.f317673j = new ArrayList();
            }
            C118356e eVar2 = ajVar.f317672i;
            if (eVar2 != null) {
                eVar2.mo103677b();
                ajVar.f317676m = new ArrayList();
            }
        }
        mo101528d();
        C53268hp hpVar = (C53268hp) C53271hs.f139650u.createBuilder();
        C53306j jVar = this.f318294o;
        hpVar.copyOnWrite();
        C53271hs hsVar = (C53271hs) hpVar.instance;
        hsVar.f139663l = jVar.f139793X;
        hsVar.f139652a |= 512;
        hpVar.copyOnWrite();
        C53271hs hsVar2 = (C53271hs) hpVar.instance;
        hsVar2.f139665n = hrVar.f139649g;
        hsVar2.f139652a |= 2048;
        if (ihVar != null) {
            hpVar.copyOnWrite();
            C53271hs hsVar3 = (C53271hs) hpVar.instance;
            hsVar3.f139668q = ihVar;
            hsVar3.f139652a |= 65536;
        }
        C87695ad adVar = (C87695ad) C87696ae.f237132p.createBuilder();
        adVar.copyOnWrite();
        C87696ae aeVar = (C87696ae) adVar.instance;
        aeVar.f237134a |= 1024;
        aeVar.f237144k = true;
        adVar.copyOnWrite();
        C87696ae aeVar2 = (C87696ae) adVar.instance;
        C53271hs hsVar4 = (C53271hs) hpVar.build();
        hsVar4.getClass();
        aeVar2.f237136c = hsVar4;
        aeVar2.f237134a |= 2;
        adVar.copyOnWrite();
        C87696ae aeVar3 = (C87696ae) adVar.instance;
        aeVar3.f237134a |= 2048;
        aeVar3.f237145l = true;
        C107698i iVar = this.f318293n;
        C88489j jVar2 = new C88489j(C87739bu.ASSISTANT_CLIENT_SYNC_START);
        jVar2.mo82014b(C87694ac.f237131a, (C87696ae) adVar.build());
        iVar.mo96219b(jVar2.mo82013a());
        m190140g(true);
    }
}
