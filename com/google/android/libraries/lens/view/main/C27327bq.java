package com.google.android.libraries.lens.view.main;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;
import androidx.core.p094f.C1894g;
import androidx.core.p094f.C1897j;
import com.google.android.libraries.lens.common.p1998a.C24093a;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.android.libraries.lens.view.filecache.C25839c;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.translation.C26059ax;
import com.google.android.libraries.lens.view.filters.translation.C26119db;
import com.google.android.libraries.lens.view.filters.translation.C26120dc;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.frozenimage.C26270b;
import com.google.android.libraries.lens.view.frozenimage.C26275g;
import com.google.android.libraries.lens.view.gallery.p2112e.C26416i;
import com.google.android.libraries.lens.view.gleam.C26504ci;
import com.google.android.libraries.lens.view.gleam.C26505cj;
import com.google.android.libraries.lens.view.gleam.C26526dd;
import com.google.android.libraries.lens.view.gleam.C26586ff;
import com.google.android.libraries.lens.view.gleam.region.C26614e;
import com.google.android.libraries.lens.view.gleam.region.C26615f;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26980p;
import com.google.android.libraries.lens.view.p2056af.C25050av;
import com.google.android.libraries.lens.view.p2067ak.C25225bd;
import com.google.android.libraries.lens.view.p2069am.C25333i;
import com.google.android.libraries.lens.view.p2078at.C25495aa;
import com.google.android.libraries.lens.view.p2078at.C25496ab;
import com.google.android.libraries.lens.view.p2078at.C25497ac;
import com.google.android.libraries.lens.view.p2078at.C25499ae;
import com.google.android.libraries.lens.view.p2078at.C25523f;
import com.google.android.libraries.lens.view.p2078at.C25533p;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2078at.C25543z;
import com.google.android.libraries.lens.view.p2081au.C25575y;
import com.google.android.libraries.lens.view.p2087ay.C25664y;
import com.google.android.libraries.lens.view.p2091bb.C25688b;
import com.google.android.libraries.lens.view.p2091bb.C25691e;
import com.google.android.libraries.lens.view.p2092c.C25699a;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26749ar;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26765q;
import com.google.android.libraries.lens.view.p2113h.p2123f.C26821c;
import com.google.android.libraries.lens.view.p2133i.p2134a.C26898c;
import com.google.android.libraries.lens.view.p2133i.p2134a.C26899d;
import com.google.android.libraries.lens.view.p2133i.p2134a.C26901f;
import com.google.android.libraries.lens.view.p2148l.C27228h;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.p2153o.C27459a;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27655b;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.android.libraries.lens.view.p2180z.C28225a;
import com.google.android.libraries.lens.view.sensors.orientation.C27727d;
import com.google.android.libraries.lens.view.session.C27749al;
import com.google.android.libraries.lens.view.session.C27761ax;
import com.google.android.libraries.lens.view.session.C27772bh;
import com.google.android.libraries.lens.view.session.C27773bi;
import com.google.android.libraries.lens.view.session.C27774bj;
import com.google.android.libraries.lens.view.session.C27777bm;
import com.google.android.libraries.lens.view.session.C27778bn;
import com.google.android.libraries.lens.view.session.C27781bq;
import com.google.android.libraries.lens.view.session.C27794n;
import com.google.android.libraries.lens.view.textoverlay.C28072e;
import com.google.android.libraries.lens.view.textoverlay.C28079l;
import com.google.android.libraries.lens.view.vision.C28179u;
import com.google.android.libraries.lens.view.vision.C28180v;
import com.google.android.libraries.p1657ba.p1661b.p1662a.p1663a.C19642a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.lens.p4699e.C62245z;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62445bv;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56221ab;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56223ad;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56277cd;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56278ce;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56318p;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56320r;
import dagger.C68214a;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.view.main.bq */
/* compiled from: PG */
public final class C27327bq implements C25496ab, C27654a {

    /* renamed from: a */
    public static final C59071e f74753a = C59071e.m91332i("com.google.android.libraries.lens.view.main.bq");

    /* renamed from: b */
    public static final PointF f74754b = new PointF(0.5f, 0.5f);

    /* renamed from: A */
    public final C27419f f74755A;

    /* renamed from: B */
    public final boolean f74756B;

    /* renamed from: C */
    public final C27232l f74757C;

    /* renamed from: D */
    public final boolean f74758D;

    /* renamed from: E */
    public final boolean f74759E;

    /* renamed from: F */
    public final boolean f74760F;

    /* renamed from: G */
    public final boolean f74761G;

    /* renamed from: H */
    public final boolean f74762H;

    /* renamed from: I */
    public final C47632e f74763I = new C47632e();

    /* renamed from: J */
    public C26119db f74764J;

    /* renamed from: K */
    public boolean f74765K;

    /* renamed from: L */
    public C26765q f74766L;

    /* renamed from: M */
    public C26505cj f74767M;

    /* renamed from: N */
    public C28072e f74768N;

    /* renamed from: O */
    public C26270b f74769O;

    /* renamed from: P */
    public C25497ac f74770P;

    /* renamed from: Q */
    public C25497ac f74771Q;

    /* renamed from: R */
    public boolean f74772R;

    /* renamed from: S */
    public final C25225bd f74773S;

    /* renamed from: T */
    public final C21370a f74774T;

    /* renamed from: U */
    public final C26821c f74775U;

    /* renamed from: V */
    public final C27794n f74776V;

    /* renamed from: W */
    public final C25989d f74777W;

    /* renamed from: X */
    public final C27761ax f74778X;

    /* renamed from: Y */
    public final Executor f74779Y;

    /* renamed from: Z */
    public final C69464a f74780Z;

    /* renamed from: aa */
    public final C26899d f74781aa;

    /* renamed from: ab */
    public final C26901f f74782ab;

    /* renamed from: ac */
    public final C27727d f74783ac;

    /* renamed from: ad */
    public final C26980p f74784ad;

    /* renamed from: ae */
    public final C25499ae f74785ae;

    /* renamed from: af */
    public final C25691e f74786af;

    /* renamed from: ag */
    public C27322bl f74787ag;

    /* renamed from: ah */
    public C26749ar f74788ah;

    /* renamed from: ai */
    public Size f74789ai;

    /* renamed from: aj */
    public final C26586ff f74790aj;
    @Deprecated

    /* renamed from: ak */
    public C58833ax f74791ak;

    /* renamed from: al */
    public C58833ax f74792al;

    /* renamed from: am */
    public final C27749al f74793am;

    /* renamed from: an */
    private final boolean f74794an;

    /* renamed from: ao */
    private final C27459a f74795ao;

    /* renamed from: ap */
    private boolean f74796ap;

    /* renamed from: aq */
    private final C27306aw f74797aq;

    /* renamed from: c */
    public final C25543z f74798c;

    /* renamed from: d */
    public final C60888db f74799d;

    /* renamed from: e */
    public final Context f74800e;

    /* renamed from: f */
    public final C25537t f74801f;

    /* renamed from: g */
    public final C69464a f74802g;

    /* renamed from: h */
    public final C69464a f74803h;

    /* renamed from: i */
    public final C26244b f74804i;

    /* renamed from: j */
    public final boolean f74805j;

    /* renamed from: k */
    public final boolean f74806k;

    /* renamed from: l */
    public final boolean f74807l;

    /* renamed from: m */
    public final C25664y f74808m;

    /* renamed from: n */
    public final C37215b f74809n;

    /* renamed from: o */
    public final C68214a f74810o;

    /* renamed from: p */
    public final Executor f74811p;

    /* renamed from: q */
    public final C27781bq f74812q;

    /* renamed from: r */
    public final C25050av f74813r;

    /* renamed from: s */
    public final C25839c f74814s;

    /* renamed from: t */
    public final C19642a f74815t;

    /* renamed from: u */
    public final C27288ae f74816u;

    /* renamed from: v */
    public final C26059ax f74817v;

    /* renamed from: w */
    public final C26120dc f74818w;

    /* renamed from: x */
    public final C25575y f74819x;

    /* renamed from: y */
    public final C25699a f74820y;

    /* renamed from: z */
    public final C28225a f74821z;

    public C27327bq(C69464a aVar, C25575y yVar, C25543z zVar, C60888db dbVar, Context context, C25537t tVar, C69464a aVar2, C26244b bVar, boolean z, boolean z2, boolean z3, C25664y yVar2, C37215b bVar2, C25225bd bdVar, C21370a aVar3, C26821c cVar, C69464a aVar4, C27749al alVar, Executor executor, C27794n nVar, C25989d dVar, C27781bq bqVar, C25050av avVar, C25839c cVar2, C27761ax axVar, Executor executor2, C19642a aVar5, C27655b bVar3, C27288ae aeVar, C26899d dVar2, C26901f fVar, C26059ax axVar2, C26120dc dcVar, C25699a aVar6, C68214a aVar7, C27727d dVar3, C28225a aVar8, C26980p pVar, C25499ae aeVar2, C25691e eVar, C26586ff ffVar, C58833ax axVar3, boolean z4, C27232l lVar, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        C27794n nVar2 = nVar;
        C27306aw awVar = new C27306aw(this);
        this.f74797aq = awVar;
        this.f74770P = C25497ac.NONE;
        this.f74771Q = C25497ac.NONE;
        C58836b bVar4 = C58836b.f156633a;
        this.f74791ak = bVar4;
        this.f74792al = bVar4;
        this.f74803h = aVar;
        this.f74819x = yVar;
        this.f74798c = zVar;
        this.f74799d = dbVar;
        this.f74800e = context;
        this.f74801f = tVar;
        this.f74802g = aVar2;
        this.f74804i = bVar;
        this.f74805j = z;
        this.f74806k = z2;
        this.f74807l = z3;
        this.f74808m = yVar2;
        this.f74809n = bVar2;
        this.f74773S = bdVar;
        this.f74780Z = aVar4;
        this.f74776V = nVar2;
        this.f74774T = aVar3;
        this.f74775U = cVar;
        this.f74793am = alVar;
        this.f74811p = executor;
        this.f74777W = dVar;
        this.f74812q = bqVar;
        this.f74813r = avVar;
        this.f74814s = cVar2;
        this.f74778X = axVar;
        this.f74779Y = executor2;
        this.f74815t = aVar5;
        this.f74816u = aeVar;
        this.f74781aa = dVar2;
        this.f74782ab = fVar;
        this.f74817v = axVar2;
        this.f74818w = dcVar;
        this.f74820y = aVar6;
        this.f74810o = aVar7;
        this.f74783ac = dVar3;
        this.f74821z = aVar8;
        this.f74784ad = pVar;
        this.f74785ae = aeVar2;
        this.f74786af = eVar;
        this.f74790aj = ffVar;
        this.f74755A = new C27419f(bVar);
        this.f74795ao = (C27459a) axVar3.mo56111f();
        this.f74756B = z4;
        this.f74757C = lVar;
        this.f74794an = z5;
        this.f74758D = z6;
        this.f74759E = z7;
        this.f74760F = z8;
        this.f74761G = z9;
        this.f74762H = z10;
        bVar3.mo33143a(this);
        nVar2.mo33305c(awVar);
    }

    /* renamed from: p */
    public static void m50890p(C60870cx cxVar) {
        if (cxVar != null) {
            C27307ax axVar = new C27307ax();
            C60856cj.m92911t(cxVar, C47810es.m84974n(axVar), C60826bg.f164896a);
        }
    }

    /* renamed from: A */
    public final void mo32868A(C25497ac acVar, C25533p pVar) {
        C58838bb.m90884s(!this.f74796ap, "mode transition cannot be reentrant!");
        C58838bb.m90884s(!this.f74806k || !this.f74770P.mo30525b() || !acVar.mo30525b(), "Unexpected FROZEN -> FROZEN transition");
        ((C59052c) ((C59052c) f74753a.mo56224b()).mo56372aa(49747)).mo56354G("ImageMode %s -> %s", this.f74770P.name(), acVar.name());
        this.f74796ap = true;
        C25497ac acVar2 = this.f74770P;
        this.f74770P = acVar;
        mo32892x();
        C25497ac acVar3 = this.f74770P;
        if (acVar3 != C25497ac.FROZEN) {
            this.f74771Q = acVar3;
        }
        C27322bl blVar = this.f74787ag;
        blVar.getClass();
        C25495aa.m46954a(blVar, acVar2, acVar, pVar);
        this.f74796ap = false;
    }

    /* renamed from: B */
    public final boolean mo32869B() {
        C28072e eVar = this.f74768N;
        return eVar != null && ((C58833ax) ((C28079l) eVar).f76420h.mo3842a()).mo56113h();
    }

    /* renamed from: C */
    public final boolean mo32870C() {
        if (!this.f74777W.mo31207f(C56306df.EDUCATION)) {
            return false;
        }
        if (!this.f74804i.mo31462g(C26239a.EDUCATION_SELECTION_STATE_ENABLED) || !this.f74804i.mo31462g(C26239a.SELECTION_STATE_ENABLED)) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public final boolean mo32871D() {
        return this.f74777W.mo31207f(C56306df.TRANSLATE) && !this.f74818w.mo31318k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public final boolean mo32872E() {
        if (!this.f74765K) {
            ((C59052c) ((C59052c) f74753a.mo56226d()).mo56372aa(49749)).mo56386p("Unexpected call to unfreezeImage while inactive");
            return false;
        } else if (!this.f74798c.mo30591a() || !this.f74770P.mo30525b()) {
            return false;
        } else {
            C27288ae aeVar = this.f74816u;
            if (aeVar.f74680m != null) {
                aeVar.mo32826b();
                aeVar.f74673f.mo33233b(false);
                aeVar.mo32827d();
                aeVar.mo32828e();
                C27286ac acVar = aeVar.f74679l;
                acVar.getClass();
                C27326bp bpVar = (C27326bp) acVar;
                if (!bpVar.f74752a.f74798c.mo30592b()) {
                    C27322bl blVar = bpVar.f74752a.f74787ag;
                    blVar.getClass();
                    blVar.mo32864n(2);
                    bpVar.f74752a.f74820y.mo30830c();
                    C27327bq bqVar = bpVar.f74752a;
                    C27419f fVar = bqVar.f74755A;
                    fVar.f75057b = false;
                    fVar.f75058c = 1;
                    bqVar.mo32868A(bqVar.f74771Q, (C25533p) null);
                    aeVar.mo32839p();
                } else {
                    throw new IllegalStateException("Unexpected unfreeze in post-capture");
                }
            }
            return true;
        }
    }

    /* renamed from: F */
    public final void mo32873F(String str, int i, C26898c cVar) {
        if (this.f74765K) {
            C62722b bVar = C62722b.INTERNAL;
            C56306df dfVar = C56306df.UNKNOWN_FILTER_TYPE;
            C26898c cVar2 = C26898c.INTERNAL;
            C24231w wVar = C24231w.UNKNOWN;
            int ordinal = cVar.ordinal();
            if (ordinal == 1) {
                bVar = C62722b.DEADLINE_EXCEEDED;
            } else if (ordinal == 2) {
                bVar = C62722b.UNAVAILABLE;
            } else if (ordinal == 3) {
                bVar = C62722b.RESOURCE_EXHAUSTED;
            }
            C37215b bVar2 = this.f74809n;
            C37252a i2 = C37194a.f98460aW.mo40815i(bVar);
            ((C37253b) i2).mo40795s("cloud_copy_target_device_guid", str);
            bVar2.mo19974a(i2);
            this.f74781aa.mo32278i(str, i);
        }
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("MainFragmentController");
        eVar.mo33146c(this.f74777W);
        eVar.mo33148e("entrypointType", this.f74798c.name());
        C26765q qVar = this.f74766L;
        if (qVar != null) {
            eVar.mo33146c(qVar);
        } else {
            eVar.mo33148e("CameraController", "null");
        }
        eVar.mo33146c(this.f74816u);
    }

    /* renamed from: e */
    public final C24231w mo32874e() {
        if (mo32871D()) {
            return C24231w.TRANSLATED_TEXT;
        }
        return C24231w.TEXT;
    }

    /* renamed from: f */
    public final C27774bj mo32875f(C24231w wVar, boolean z) {
        RectF rectF;
        C58833ax axVar = ((C26526dd) this.f74767M).f72283F;
        if (axVar.mo56113h()) {
            rectF = (RectF) axVar.mo56107c();
            ((C26526dd) this.f74767M).f72283F = C58836b.f156633a;
        } else {
            C26615f fVar = ((C26526dd) this.f74767M).f72302l;
            fVar.getClass();
            rectF = fVar.mo31903a();
        }
        C27773bi b = C27778bn.m51732d(rectF, z).mo33281b();
        b.mo33278f(5);
        b.mo33276d(wVar);
        return b.mo33279g();
    }

    /* renamed from: g */
    public final String mo32876g() {
        C56277cd cdVar;
        C58833ax b = this.f74777W.mo31204b(C56306df.TRANSLATE);
        if (!b.mo56113h()) {
            return C56277cd.f149981d.f149985c;
        }
        C56278ce ceVar = (C56278ce) b.mo56107c();
        if (ceVar.f149989b == 3) {
            cdVar = (C56277cd) ceVar.f149990c;
        } else {
            cdVar = C56277cd.f149981d;
        }
        return cdVar.f149985c;
    }

    /* renamed from: h */
    public final String mo32877h() {
        C56277cd cdVar;
        C58833ax b = this.f74777W.mo31204b(C56306df.TRANSLATE);
        if (!b.mo56113h()) {
            return C1897j.m5167d(C1894g.m5157a(this.f74800e.getResources().getConfiguration())).f5774b.f5775a.get(0).toLanguageTag();
        }
        C56278ce ceVar = (C56278ce) b.mo56107c();
        if (ceVar.f149989b == 3) {
            cdVar = (C56277cd) ceVar.f149990c;
        } else {
            cdVar = C56277cd.f149981d;
        }
        return cdVar.f149984b;
    }

    /* renamed from: i */
    public final void mo32878i() {
        this.f74816u.mo32829f(true);
        this.f74775U.mo32190e();
    }

    /* renamed from: j */
    public final void mo32879j() {
        C26765q qVar = this.f74766L;
        if (qVar != null) {
            qVar.mo32123n();
            this.f74766L = null;
        }
    }

    /* renamed from: k */
    public final void mo32880k() {
        C26765q qVar;
        C58838bb.m90883r(this.f74770P.mo30527d());
        mo32868A(C25497ac.LIVE, (C25533p) null);
        if (this.f74772R && (qVar = this.f74766L) != null) {
            qVar.mo32116g();
        }
    }

    /* renamed from: kW */
    public final void mo30520kW(C25533p pVar) {
        if (this.f74806k || ((C25523f) pVar).f69505c) {
            this.f74786af.mo30811m();
        }
    }

    /* renamed from: kX */
    public final /* synthetic */ void mo30521kX(boolean z) {
    }

    /* renamed from: kY */
    public final void mo30522kY(C25497ac acVar, C25497ac acVar2, C25533p pVar) {
        C25495aa.m46954a(this.f74767M, acVar, acVar2, pVar);
        C25495aa.m46954a(this.f74769O, acVar, acVar2, pVar);
        if (acVar2.mo30525b()) {
            mo32894z();
        }
        if (pVar != null) {
            pVar.mo30588g(new C27296am(this, acVar.mo30525b(), pVar));
        }
    }

    /* renamed from: kZ */
    public final void mo30523kZ() {
        this.f74768N.mo33534c();
        this.f74786af.mo30808j();
        mo32890v();
    }

    /* renamed from: l */
    public final void mo32881l() {
        C58838bb.m90883r(this.f74770P.mo30526c());
        mo32868A(C25497ac.NONE, (C25533p) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo32882m(C26416i iVar) {
        if (!this.f74765K) {
            ((C59052c) ((C59052c) f74753a.mo56225c()).mo56372aa(49727)).mo56386p("UI Disposed; not freezing image.");
            return;
        }
        C58838bb.m90884s(C58833ax.m90833j(this.f74816u.f74684q).mo56113h(), "No injected image to freeze");
        if (C58833ax.m90833j(this.f74816u.f74680m).mo56113h()) {
            ((C59052c) ((C59052c) f74753a.mo56226d()).mo56372aa(49726)).mo56386p("Call to #freezeInjectedImage when already frozen");
            return;
        }
        if (iVar != null) {
            ((C26275g) this.f74769O).f71412b.mo5708l(C58833ax.m90834k(iVar));
        }
        if (this.f74806k) {
            this.f74816u.mo32830g(false, C58836b.f156633a);
            return;
        }
        this.f74816u.mo32830g(true, C58836b.f156633a);
        mo32890v();
        if (this.f74794an && this.f74757C.mo32714t().mo56113h()) {
            ((C59052c) ((C59052c) f74753a.mo56224b()).mo56372aa(49733)).mo56386p("Show client region of interest.");
            this.f74767M.mo31772h(C26614e.m49159f((RectF) this.f74757C.mo32714t().mo56107c()).mo31892a());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0050, code lost:
        if (((com.google.common.base.C58833ax) r2.f74669b.f69551a.mo30656d()).mo56113h() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        if (((com.google.common.base.C58833ax) r2.f74669b.f69551a.mo30656d()).mo56113h() != false) goto L_0x006e;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32883n() {
        /*
            r4 = this;
            boolean r0 = r4.f74765K
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.google.android.libraries.lens.view.filters.translation.db r0 = r4.f74764J
            r1 = 0
            if (r0 == 0) goto L_0x0018
            com.google.android.libraries.lens.view.filters.translation.dc r2 = r4.f74818w
            java.util.List r2 = r2.f70978d
            com.google.android.libraries.lens.view.filters.translation.da r3 = new com.google.android.libraries.lens.view.filters.translation.da
            r3.<init>(r0)
            p3186j$.util.Collection.EL.removeIf(r2, r3)
            r4.f74764J = r1
        L_0x0018:
            r0 = 0
            r4.f74765K = r0
            com.google.android.libraries.lens.view.gleam.cj r2 = r4.f74767M
            com.google.android.libraries.lens.view.gleam.dd r2 = (com.google.android.libraries.lens.view.gleam.C26526dd) r2
            com.google.android.libraries.lens.view.ay.ag r3 = r2.f72297g
            r3.mo30738i()
            r3.mo30736g()
            r2.mo31799s()
            com.google.android.libraries.lens.view.ay.y r3 = r2.f72296f
            com.google.android.libraries.lens.view.gleam.dc r2 = r2.f72285H
            r3.mo30778l(r2)
            r4.mo32879j()
            com.google.android.libraries.lens.view.main.ae r2 = r4.f74816u
            boolean r3 = r2.f74678k
            if (r3 == 0) goto L_0x0053
            com.google.android.libraries.lens.view.at.p r3 = r2.f74680m
            if (r3 != 0) goto L_0x0071
            com.google.android.libraries.lens.view.l.h r3 = r2.f74684q
            if (r3 != 0) goto L_0x0071
            com.google.android.libraries.lens.view.au.af r3 = r2.f74669b
            com.google.android.libraries.lens.view.au.ac r3 = r3.f69551a
            java.lang.Object r3 = r3.mo30656d()
            com.google.common.base.ax r3 = (com.google.common.base.C58833ax) r3
            boolean r3 = r3.mo56113h()
            if (r3 == 0) goto L_0x0071
            goto L_0x006e
        L_0x0053:
            com.google.android.libraries.lens.view.at.p r3 = r2.f74680m
            if (r3 == 0) goto L_0x005b
            boolean r3 = r2.f74682o
            if (r3 != 0) goto L_0x0071
        L_0x005b:
            r2.mo32829f(r0)
            com.google.android.libraries.lens.view.au.af r3 = r2.f74669b
            com.google.android.libraries.lens.view.au.ac r3 = r3.f69551a
            java.lang.Object r3 = r3.mo30656d()
            com.google.common.base.ax r3 = (com.google.common.base.C58833ax) r3
            boolean r3 = r3.mo56113h()
            if (r3 == 0) goto L_0x0071
        L_0x006e:
            r2.mo32828e()
        L_0x0071:
            com.google.android.libraries.lens.view.au.o r3 = r2.f74670c
            com.google.android.libraries.lens.view.au.s r3 = r3.mo30595d()
            r3.mo30657f(r1)
            com.google.android.libraries.lens.view.au.o r3 = r2.f74670c
            com.google.android.libraries.lens.view.au.s r3 = r3.mo30594b()
            r3.mo30657f(r1)
            com.google.android.libraries.lens.view.au.o r3 = r2.f74670c
            com.google.android.libraries.lens.view.au.s r3 = r3.mo30597f()
            r3.mo30657f(r1)
            com.google.android.libraries.lens.view.au.o r3 = r2.f74670c
            com.google.android.libraries.lens.view.au.s r3 = r3.mo30596e()
            r3.mo30657f(r1)
            com.google.android.libraries.lens.view.au.o r2 = r2.f74670c
            com.google.android.libraries.lens.view.au.s r2 = r2.mo30593a()
            r2.mo30657f(r1)
            com.google.android.libraries.lens.view.sensors.orientation.d r1 = r4.f74783ac
            com.google.apps.tiktok.tracing.contrib.b.e r2 = r1.f75700d
            com.google.android.libraries.lens.view.sensors.orientation.a r3 = new com.google.android.libraries.lens.view.sensors.orientation.a
            r3.<init>(r1)
            java.util.concurrent.Executor r1 = r1.f75698b
            com.google.common.util.concurrent.cx r1 = r2.mo51511a(r3, r1)
            java.lang.String r2 = "OrientationService.stopListening failed"
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r1, r2, r3)
            com.google.android.libraries.lens.view.session.bq r1 = r4.f74812q
            com.google.common.util.concurrent.SettableFuture r2 = r1.f75787b
            r2.cancel(r0)
            com.google.common.util.concurrent.SettableFuture r0 = new com.google.common.util.concurrent.SettableFuture
            r0.<init>()
            r1.f75787b = r0
            com.google.android.libraries.lens.view.c.a r0 = r4.f74820y
            r0.mo30831d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.main.C27327bq.mo32883n():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo32884o(C27228h hVar) {
        this.f74816u.mo32837n(hVar, mo32870C() ? mo32875f(C24231w.POSTCAPTURE_INJECTED_IMAGE, true) : null);
    }

    /* renamed from: q */
    public final void mo32885q() {
        C26749ar arVar;
        Size size;
        if (this.f74798c.mo30591a()) {
            C26765q qVar = this.f74766L;
            if (qVar != null && (arVar = this.f74788ah) != null && (size = this.f74789ai) != null) {
                int width = size.getWidth();
                Size size2 = this.f74789ai;
                size2.getClass();
                qVar.mo32114e(arVar, width, size2.getHeight());
                this.f74788ah = null;
                this.f74789ai = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("maybeUpdateSurfaceOnCameraController called in postcapture mode");
    }

    /* renamed from: r */
    public final void mo32886r() {
        boolean f = this.f74777W.mo31207f(C56306df.OUTDOOR);
        boolean z = false;
        if (!this.f74770P.mo30525b() && this.f74798c.mo30591a()) {
            z = true;
        }
        C26765q qVar = this.f74766L;
        if (qVar != null && z && f) {
            qVar.mo32116g();
        }
    }

    /* renamed from: s */
    public final void mo32887s(C27774bj bjVar, C58833ax axVar) {
        if (this.f74777W.mo31207f(C56306df.EDUCATION)) {
            C27773bi b = bjVar.mo33281b();
            b.mo33278f(5);
            bjVar = b.mo33279g();
        }
        mo32888t(bjVar, axVar);
    }

    /* renamed from: t */
    public final void mo32888t(C27774bj bjVar, C58833ax axVar) {
        C58833ax axVar2;
        Matrix matrix;
        if (this.f74765K) {
            RectF a = bjVar.mo33280a();
            if (!bjVar.mo33259f().isEmpty()) {
                Iterator it = bjVar.mo33259f().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        axVar2 = C58836b.f156633a;
                        break;
                    }
                    C56320r rVar = (C56320r) it.next();
                    C56318p pVar = rVar.f150101h;
                    if (pVar == null) {
                        pVar = C56318p.f150087c;
                    }
                    if ((pVar.f150089a & 4) != 0) {
                        C56318p pVar2 = rVar.f150101h;
                        if (pVar2 == null) {
                            pVar2 = C56318p.f150087c;
                        }
                        axVar2 = C58833ax.m90834k(pVar2.f150090b);
                    }
                }
                if (axVar2.mo56113h()) {
                    C58833ax d = this.f74808m.mo30770d((String) axVar2.mo56107c());
                    if (d.mo56113h()) {
                        C26504ci ciVar = (C26504ci) d.mo56107c();
                        C28179u uVar = ciVar.f72215i;
                        C28179u uVar2 = ciVar.f72214h;
                        C25333i iVar = ciVar.f72219m;
                        float[] fArr = new float[2];
                        if (uVar2.mo33666i() == uVar.mo33666i()) {
                            matrix = new Matrix();
                        } else {
                            double degrees = Math.toDegrees((double) (uVar.mo33658c() - uVar2.mo33658c()));
                            Matrix matrix2 = new Matrix();
                            matrix2.postTranslate(-uVar2.mo33662f(), -uVar2.mo33663g());
                            matrix2.postScale(uVar.mo33659d() / uVar2.mo33659d(), uVar.mo33660e() / uVar2.mo33660e());
                            matrix2.postTranslate(uVar.mo33662f(), uVar.mo33663g());
                            matrix2.postRotate((float) degrees, uVar.mo33662f(), uVar.mo33663g());
                            matrix = matrix2;
                        }
                        float degrees2 = (float) Math.toDegrees((double) (uVar.mo33658c() - uVar2.mo33658c()));
                        float d2 = uVar.mo33659d() / uVar2.mo33659d();
                        C58833ax axVar3 = ciVar.f72232z;
                        if (axVar3.mo56113h() && (((C62245z) axVar3.mo56107c()).f168050a & 1) != 0) {
                            C62445bv bvVar = ((C62245z) ciVar.f72232z.mo56107c()).f168051b;
                            if (bvVar == null) {
                                bvVar = C62445bv.f168618e;
                            }
                            if ((bvVar.f168620a & 1) != 0) {
                                C62445bv bvVar2 = ((C62245z) ciVar.f72232z.mo56107c()).f168051b;
                                if (bvVar2 == null) {
                                    bvVar2 = C62445bv.f168618e;
                                }
                                C62441br brVar = bvVar2.f168621b;
                                if (brVar == null) {
                                    brVar = C62441br.f168608h;
                                }
                                C56224ae d3 = C24093a.m44748d(brVar);
                                if (!matrix.isIdentity()) {
                                    Size size = new Size(iVar.f68947a, iVar.f68948b);
                                    float f = d3.f149757c;
                                    float f2 = d3.f149756b;
                                    float f3 = d3.f149758d;
                                    float f4 = d3.f149759e;
                                    int a2 = C56223ad.m87941a(d3.f149761g);
                                    if (a2 == 0 || a2 == 1) {
                                        f *= (float) size.getWidth();
                                        f2 *= (float) size.getHeight();
                                        f3 *= (float) size.getWidth();
                                        f4 *= (float) size.getHeight();
                                    }
                                    RectF rectF = new RectF(f, f2, f3 + f, f4 + f2);
                                    fArr[0] = rectF.centerX();
                                    fArr[1] = rectF.centerY();
                                    matrix.mapPoints(fArr);
                                    float f5 = d3.f149760f;
                                    float width = (rectF.width() * d2) / ((float) iVar.f68947a);
                                    float height = (rectF.height() * d2) / ((float) iVar.f68948b);
                                    C56221ab abVar = (C56221ab) C56224ae.f149753h.createBuilder();
                                    float f6 = fArr[0];
                                    int i = iVar.f68947a;
                                    abVar.copyOnWrite();
                                    C56224ae aeVar = (C56224ae) abVar.instance;
                                    aeVar.f149755a = 2 | aeVar.f149755a;
                                    aeVar.f149757c = (f6 / ((float) i)) - (width / 2.0f);
                                    float f7 = fArr[1];
                                    int i2 = iVar.f68948b;
                                    abVar.copyOnWrite();
                                    C56224ae aeVar2 = (C56224ae) abVar.instance;
                                    aeVar2.f149755a = 1 | aeVar2.f149755a;
                                    aeVar2.f149756b = (f7 / ((float) i2)) - (height / 2.0f);
                                    abVar.copyOnWrite();
                                    C56224ae aeVar3 = (C56224ae) abVar.instance;
                                    aeVar3.f149755a |= 4;
                                    aeVar3.f149758d = width;
                                    abVar.copyOnWrite();
                                    C56224ae aeVar4 = (C56224ae) abVar.instance;
                                    aeVar4.f149755a |= 8;
                                    aeVar4.f149759e = height;
                                    abVar.copyOnWrite();
                                    C56224ae aeVar5 = (C56224ae) abVar.instance;
                                    aeVar5.f149755a |= 16;
                                    aeVar5.f149760f = degrees2 + f5;
                                    d3 = (C56224ae) abVar.build();
                                }
                                a = C24093a.m44745a(d3);
                            }
                        }
                        C62441br a3 = C28180v.m52673a(uVar, ciVar.f72218l);
                        a = C24093a.m44751g(new PointF(a3.f168611b, a3.f168612c), new SizeF(a3.f168613d, a3.f168614e), a3.f168615f, 2, 0.0f);
                    }
                }
            }
            C27773bi b = bjVar.mo33281b();
            b.mo33275c(a);
            C27774bj g = b.mo33279g();
            this.f74791ak = C58833ax.m90834k(g);
            mo32889u(g, axVar);
            return;
        }
        ((C59052c) ((C59052c) f74753a.mo56225c()).mo56372aa(49739)).mo56386p("onRegionSelection when Lens is not started");
    }

    /* renamed from: u */
    public final void mo32889u(C27777bm bmVar, C58833ax axVar) {
        C27777bm bmVar2;
        if (!this.f74765K) {
            ((C59052c) ((C59052c) f74753a.mo56225c()).mo56372aa(49740)).mo56386p("onImageClick in bad state");
            return;
        }
        if (this.f74816u.mo32848y(bmVar)) {
            bmVar2 = bmVar;
        } else {
            bmVar2 = bmVar.mo33261i(new C27301ar(this));
        }
        C27459a aVar = this.f74795ao;
        if (aVar != null && (bmVar instanceof C27772bh)) {
            ((C27772bh) bmVar).mo33271a();
            ((C27772bh) bmVar2).mo33271a();
            bmVar2.mo33259f();
            aVar.mo33004kR();
        }
        this.f74816u.mo32843t(bmVar2, axVar);
    }

    /* renamed from: v */
    public final void mo32890v() {
        this.f74786af.mo30810l(C25688b.f69827a);
    }

    /* renamed from: w */
    public final void mo32891w(C58833ax axVar, C24231w wVar) {
        C58833ax e = this.f74767M.mo31769e();
        mo32888t(C27778bn.m51731c(e.mo56113h() ? (RectF) e.mo56107c() : new RectF(0.0f, 0.0f, 1.0f, 1.0f), this.f74808m.mo30771e(), wVar, true), axVar);
    }

    /* renamed from: x */
    public final void mo32892x() {
        C26765q qVar = this.f74766L;
        if (qVar != null) {
            boolean c = this.f74770P.mo30526c();
            boolean z = true;
            if (!c && (!this.f74770P.mo30527d() || !this.f74772R)) {
                z = false;
            }
            boolean z2 = !z;
            qVar.mo32118i(c);
            if (z2 != qVar.mo32125p()) {
                qVar.mo32120k(z2);
                if (z) {
                    this.f74816u.mo32828e();
                    qVar.mo32121l(1.0f);
                }
            }
        }
    }

    /* renamed from: y */
    public final void mo32893y(C27777bm bmVar) {
        int ordinal;
        if (this.f74795ao != null) {
            C56306df dfVar = C56306df.UNKNOWN_FILTER_TYPE;
            C26898c cVar = C26898c.INTERNAL;
            C24231w wVar = C24231w.UNKNOWN;
            int h = bmVar.mo33260h();
            int i = h - 1;
            if (h != 0) {
                if (!(i != 3 || (ordinal = bmVar.mo33256c().ordinal()) == 4 || ordinal == 6)) {
                    String.format("%s RS interaction", new Object[]{bmVar.mo33256c().name()});
                }
                C27459a aVar = this.f74795ao;
                aVar.getClass();
                aVar.mo33003kQ();
                return;
            }
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b A[SYNTHETIC] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32894z() {
        /*
            r6 = this;
            com.google.android.libraries.lens.view.filters.e.d r0 = r6.f74777W
            com.google.bp.f.b.a.cg r0 = r0.f70643b
            com.google.protobuf.cq r0 = r0.f149994a
            int r0 = r0.size()
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            com.google.android.libraries.lens.view.gleam.cj r0 = r6.f74767M
            r0.mo31773i()
            com.google.android.libraries.lens.view.gleam.cj r0 = r6.f74767M
            com.google.android.libraries.lens.view.frozenimage.b r1 = r6.f74769O
            r2 = 1
            com.google.android.libraries.lens.e.r[] r3 = new com.google.android.libraries.lens.p2014e.C24226r[r2]
            com.google.android.libraries.lens.e.r r4 = com.google.android.libraries.lens.p2014e.C24226r.RECTIFIED_DOCUMENT
            r5 = 0
            r3[r5] = r4
            com.google.android.libraries.lens.view.frozenimage.g r1 = (com.google.android.libraries.lens.view.frozenimage.C26275g) r1
            com.google.android.libraries.lens.view.d.g r1 = r1.f71411a
            java.lang.Object r1 = r1.mo3842a()
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1
            com.google.android.libraries.lens.view.frozenimage.f r4 = new com.google.android.libraries.lens.view.frozenimage.f
            r4.<init>(r3)
            com.google.common.base.ax r1 = r1.mo56106b(r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            java.lang.Object r1 = r1.mo56109e(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0044
            com.google.android.libraries.lens.view.gleam.fh r1 = com.google.android.libraries.lens.view.gleam.C26588fh.NO_SCRIM
            goto L_0x008d
        L_0x0044:
            com.google.android.libraries.lens.view.filters.e.d r1 = r6.f74777W
            com.google.android.libraries.lens.view.filters.e.a.e r1 = r1.mo31203a()
            boolean r1 = r1.mo31194k()
            if (r1 == 0) goto L_0x0059
            boolean r1 = r6.mo32869B()
            if (r1 == 0) goto L_0x0059
            com.google.android.libraries.lens.view.gleam.fh r1 = com.google.android.libraries.lens.view.gleam.C26588fh.DARK_SCRIM
            goto L_0x008d
        L_0x0059:
            com.google.android.libraries.lens.view.filters.e.d r1 = r6.f74777W
            com.google.bp.f.b.a.cg r1 = r1.f70643b
            com.google.protobuf.cq r1 = r1.f149994a
            java.util.Iterator r1 = r1.iterator()
        L_0x0063:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x008b
            java.lang.Object r3 = r1.next()
            com.google.bp.f.b.a.ce r3 = (com.google.p4242bp.p4257f.p4260b.p4261a.C56278ce) r3
            int r3 = r3.f149991d
            com.google.bp.f.b.a.df r3 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.m87964a(r3)
            if (r3 != 0) goto L_0x0079
            com.google.bp.f.b.a.df r3 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.UNKNOWN_FILTER_TYPE
        L_0x0079:
            com.google.android.libraries.lens.view.i.a.c r4 = com.google.android.libraries.lens.view.p2133i.p2134a.C26898c.INTERNAL
            com.google.android.libraries.lens.e.w r4 = com.google.android.libraries.lens.p2014e.C24231w.UNKNOWN
            int r3 = r3.ordinal()
            r4 = 3
            if (r3 == r4) goto L_0x0088
            r4 = 6
            if (r3 == r4) goto L_0x0088
            goto L_0x0063
        L_0x0088:
            com.google.android.libraries.lens.view.gleam.fh r1 = com.google.android.libraries.lens.view.gleam.C26588fh.DARK_SCRIM
            goto L_0x008d
        L_0x008b:
            com.google.android.libraries.lens.view.gleam.fh r1 = com.google.android.libraries.lens.view.gleam.C26588fh.DEFAULT_SCRIM
        L_0x008d:
            r0.mo31774j(r1)
            com.google.android.libraries.lens.view.textoverlay.e r0 = r6.f74768N
            com.google.android.libraries.lens.view.filters.e.d r1 = r6.f74777W
            com.google.android.libraries.lens.view.filters.e.a.e r1 = r1.mo31203a()
            boolean r1 = r1.mo31197n()
            com.google.android.libraries.lens.view.textoverlay.l r0 = (com.google.android.libraries.lens.view.textoverlay.C28079l) r0
            com.google.android.libraries.lens.view.d.g r0 = r0.f76421i
            r1 = r1 ^ r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.mo5708l(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.main.C27327bq.mo32894z():void");
    }
}
