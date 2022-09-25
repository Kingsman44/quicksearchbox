package com.google.android.libraries.lens.view.gleam;

import android.content.Context;
import android.graphics.RectF;
import android.os.Trace;
import android.util.Size;
import com.google.android.libraries.lens.common.p1998a.C24095c;
import com.google.android.libraries.lens.view.filters.p2101e.C25976a;
import com.google.android.libraries.lens.view.filters.p2101e.C25989d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.frozenimage.C26269a;
import com.google.android.libraries.lens.view.frozenimage.C26270b;
import com.google.android.libraries.lens.view.gleam.region.C26611b;
import com.google.android.libraries.lens.view.gleam.region.C26613d;
import com.google.android.libraries.lens.view.gleam.region.C26614e;
import com.google.android.libraries.lens.view.gleam.region.C26615f;
import com.google.android.libraries.lens.view.gleam.region.C26620k;
import com.google.android.libraries.lens.view.main.C27295al;
import com.google.android.libraries.lens.view.p2069am.C25306an;
import com.google.android.libraries.lens.view.p2069am.C25307ao;
import com.google.android.libraries.lens.view.p2069am.C25308ap;
import com.google.android.libraries.lens.view.p2069am.C25309aq;
import com.google.android.libraries.lens.view.p2069am.C25310ar;
import com.google.android.libraries.lens.view.p2069am.C25311as;
import com.google.android.libraries.lens.view.p2069am.C25312at;
import com.google.android.libraries.lens.view.p2069am.C25348x;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.android.libraries.lens.view.p2078at.C25495aa;
import com.google.android.libraries.lens.view.p2078at.C25497ac;
import com.google.android.libraries.lens.view.p2078at.C25533p;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.p2087ay.C25624ag;
import com.google.android.libraries.lens.view.p2087ay.C25649j;
import com.google.android.libraries.lens.view.p2087ay.C25650k;
import com.google.android.libraries.lens.view.p2087ay.C25651l;
import com.google.android.libraries.lens.view.p2087ay.C25656q;
import com.google.android.libraries.lens.view.p2087ay.C25662w;
import com.google.android.libraries.lens.view.p2087ay.C25664y;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.lens.view.p2113h.p2123f.C26821c;
import com.google.android.libraries.lens.view.session.C27792l;
import com.google.android.libraries.lens.view.session.C27793m;
import com.google.android.libraries.lens.view.utils.C28120i;
import com.google.android.libraries.lens.view.utils.C28133v;
import com.google.android.libraries.lens.view.utils.C28134w;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.base.C58839bc;
import com.google.common.base.C58845bi;
import com.google.common.base.C58846bj;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4699e.C62210aw;
import com.google.lens.p4699e.C62219be;
import com.google.lens.p4699e.C62223d;
import com.google.lens.p4699e.C62227h;
import com.google.lens.p4699e.C62231l;
import com.google.lens.p4707j.C62436bm;
import com.google.lens.p4707j.C62438bo;
import com.google.lens.p4707j.C62439bp;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62444bu;
import com.google.lens.p4707j.C62445bv;
import com.google.lens.p4707j.C62491dn;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56219a;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56300d;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56309g;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56310h;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56317o;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56318p;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56320r;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56321s;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56323u;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56324v;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56327y;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56328z;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.lens.view.gleam.dd */
/* compiled from: PG */
public final class C26526dd implements C26505cj, C26269a {

    /* renamed from: I */
    private static final RectF f72276I = new RectF(0.0f, 0.0f, 1.0f, 1.0f);

    /* renamed from: a */
    public static final C58974d f72277a = C58974d.m91135i("GleamController");

    /* renamed from: A */
    public final boolean f72278A;

    /* renamed from: B */
    public final boolean f72279B;

    /* renamed from: C */
    public final boolean f72280C;

    /* renamed from: D */
    public Runnable f72281D = null;

    /* renamed from: E */
    public boolean f72282E;

    /* renamed from: F */
    public C58833ax f72283F;

    /* renamed from: G */
    public C27295al f72284G;

    /* renamed from: H */
    public final C26525dc f72285H;

    /* renamed from: J */
    private final C25976a f72286J;

    /* renamed from: K */
    private final C25537t f72287K;

    /* renamed from: L */
    private final C26244b f72288L;

    /* renamed from: M */
    private final AtomicBoolean f72289M = new AtomicBoolean();

    /* renamed from: N */
    private final C37215b f72290N;

    /* renamed from: O */
    private int f72291O;

    /* renamed from: b */
    public final Executor f72292b;

    /* renamed from: c */
    public final Executor f72293c;

    /* renamed from: d */
    public final Executor f72294d;

    /* renamed from: e */
    public final Context f72295e;

    /* renamed from: f */
    public final C25664y f72296f;

    /* renamed from: g */
    public final C25624ag f72297g;

    /* renamed from: h */
    public final C26637y f72298h;

    /* renamed from: i */
    public final C25989d f72299i;

    /* renamed from: j */
    public C26270b f72300j;

    /* renamed from: k */
    public C26603l f72301k;

    /* renamed from: l */
    public C26615f f72302l;

    /* renamed from: m */
    public Integer f72303m = 0;

    /* renamed from: n */
    public long f72304n = 0;

    /* renamed from: o */
    public C27793m f72305o;

    /* renamed from: p */
    public C27793m f72306p = null;

    /* renamed from: q */
    final C25758g f72307q;

    /* renamed from: r */
    final C25758g f72308r;

    /* renamed from: s */
    public final C25758g f72309s;

    /* renamed from: t */
    public final C25758g f72310t;

    /* renamed from: u */
    public final C25758g f72311u;

    /* renamed from: v */
    public final C25758g f72312v;

    /* renamed from: w */
    public final C25758g f72313w;

    /* renamed from: x */
    public final C25758g f72314x;

    /* renamed from: y */
    public final C25758g f72315y;

    /* renamed from: z */
    public final C26821c f72316z;

    public C26526dd(Executor executor, Executor executor2, Executor executor3, Context context, C26821c cVar, C25664y yVar, C25976a aVar, C25537t tVar, C25624ag agVar, C26244b bVar, C26637y yVar2, C25989d dVar, C37215b bVar2, boolean z, boolean z2, boolean z3) {
        C58836b bVar3 = C58836b.f156633a;
        this.f72283F = bVar3;
        this.f72285H = new C26525dc(this);
        this.f72292b = executor;
        this.f72293c = executor2;
        this.f72294d = executor3;
        this.f72295e = context;
        this.f72296f = yVar;
        this.f72286J = aVar;
        this.f72287K = tVar;
        this.f72316z = cVar;
        this.f72288L = bVar;
        this.f72299i = dVar;
        this.f72290N = bVar2;
        this.f72278A = z;
        this.f72279B = z2;
        this.f72280C = z3;
        this.f72307q = new C25758g(bVar3);
        this.f72308r = new C25758g(C58836b.f156633a);
        this.f72309s = new C25758g(false);
        this.f72310t = new C25758g(C58836b.f156633a);
        this.f72311u = new C25758g(C25497ac.NONE);
        this.f72312v = new C25758g(C58836b.f156633a);
        this.f72313w = new C25758g(C26588fh.DEFAULT_SCRIM);
        this.f72314x = new C25758g(0);
        this.f72315y = new C25758g(0);
        this.f72297g = agVar;
        this.f72298h = yVar2;
    }

    /* renamed from: A */
    private final void m48977A(C26504ci ciVar, C58833ax axVar, boolean z) {
        this.f72296f.mo30777k();
        m48978B(ciVar, axVar, z);
        ciVar.f72224r = true;
        mo31805y();
        if (this.f72288L.mo31462g(C26239a.EDUCATION_FILTER_SWITCH_ON_MATH_GLEAM_SELECTION_ENABLED) && this.f72299i.f70642a.f70649b.equals(C25980d.AUTO_FILTER) && ciVar.mo31764i()) {
            this.f72283F = C58833ax.m90834k(ciVar.mo31759c());
        }
    }

    /* renamed from: B */
    private final void m48978B(C26504ci ciVar, C58833ax axVar, boolean z) {
        float f;
        C25349y d = ciVar.mo31760d();
        if (!((C25497ac) this.f72311u.mo3842a()).mo30525b()) {
            ((C58970a) ((C58970a) f72277a.mo56226d()).mo56372aa(49442)).mo56386p("showRegionForObject(): region cannot be shown in lvf");
        } else if (this.f72299i.mo31203a().mo31194k()) {
            if (ciVar.mo31763g() || d == C25349y.PLANAR_GLEAM) {
                C26615f fVar = this.f72302l;
                if (fVar != null) {
                    ((C26620k) fVar).f72593f.mo31884j();
                    return;
                }
                return;
            }
            RectF c = ciVar.mo31759c();
            float f2 = 0.0f;
            if (d == C25349y.MATH_GLEAM && this.f72288L.mo31456b(C26239a.EDUCATION_MATH_GLEAMS_TYPE) == 0 && ((C58833ax) this.f72312v.mo3842a()).mo56113h()) {
                Size size = (Size) ((C58833ax) this.f72312v.mo3842a()).mo56107c();
                float a = C28134w.m52424a(5.0f, this.f72295e) / ((float) size.getWidth());
                f2 = C28134w.m52424a(5.0f, this.f72295e) / ((float) size.getHeight());
                f = a;
            } else {
                f = 0.0f;
            }
            if (d == C25349y.MATH_GLEAM && this.f72288L.mo31456b(C26239a.EDUCATION_MATH_GLEAMS_TYPE) == 1 && ((C58833ax) this.f72312v.mo3842a()).mo56113h()) {
                Size size2 = (Size) ((C58833ax) this.f72312v.mo3842a()).mo56107c();
                f = C28134w.m52424a(4.0f, this.f72295e) / ((float) size2.getWidth());
                f2 = C28134w.m52424a(2.0f, this.f72295e) / ((float) size2.getHeight());
            }
            RectF rectF = new RectF(c.left - f, c.top - f2, c.right + f, c.bottom + f2);
            C26615f fVar2 = this.f72302l;
            fVar2.getClass();
            C26613d f3 = C26614e.m49159f(rectF);
            if (!this.f72280C) {
                axVar = C58836b.f156633a;
            }
            ((C26611b) f3).f72569b = axVar;
            f3.mo31893b(z);
            fVar2.mo31905c(f3.mo31892a());
        }
    }

    /* renamed from: C */
    private static void m48979C(C25758g gVar, int i) {
        if (((Integer) gVar.mo3842a()).intValue() != i) {
            gVar.mo5708l(Integer.valueOf(i));
        }
    }

    /* renamed from: o */
    public static C58833ax m48980o(C26504ci ciVar) {
        C58833ax axVar = ciVar.f72230x;
        if (!axVar.mo56113h() || ((C62227h) axVar.mo56107c()).f168017b.isEmpty()) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(((C62227h) axVar.mo56107c()).f168017b);
    }

    /* renamed from: e */
    public final C58833ax mo31769e() {
        if (!mo31776l()) {
            return C58836b.f156633a;
        }
        C26615f fVar = this.f72302l;
        fVar.getClass();
        return C58833ax.m90834k(((C26620k) fVar).f72593f.mo31882h());
    }

    /* renamed from: f */
    public final C58833ax mo31770f(C62439bp bpVar, boolean z) {
        C62438bo boVar = bpVar.f168606b;
        if (boVar == null) {
            boVar = C62438bo.f168599c;
        }
        if ((boVar.f168601a & 1) != 0) {
            C62438bo boVar2 = bpVar.f168606b;
            if (boVar2 == null) {
                boVar2 = C62438bo.f168599c;
            }
            String str = boVar2.f168602b;
            C58833ax d = this.f72296f.mo30770d(str);
            if (!d.mo56113h()) {
                ((C58970a) ((C58970a) f72277a.mo56226d()).mo56372aa(49432)).mo56389s("autoSelectGleam(): failed due to missing tracked object for visual object id %s", str);
                return C58836b.f156633a;
            } else if (((C26504ci) d.mo56107c()).f72224r || mo31776l()) {
                return C58836b.f156633a;
            } else {
                m48977A((C26504ci) d.mo56107c(), C58836b.f156633a, !z);
                C26603l lVar = this.f72301k;
                if (lVar != null) {
                    lVar.mo31869a(str);
                }
                RectF c = ((C26504ci) d.mo56107c()).mo31759c();
                if (((C26504ci) d.mo56107c()).f72214h.mo33664h() > 0) {
                    return C58833ax.m90834k(c);
                }
                return C58836b.f156633a;
            }
        } else if (!((C25497ac) this.f72311u.mo3842a()).mo30525b() || mo31776l() || !this.f72299i.mo31203a().mo31194k()) {
            return C58836b.f156633a;
        } else {
            RectF rectF = f72276I;
            C62436bm bmVar = bpVar.f168607c;
            if (bmVar == null) {
                bmVar = C62436bm.f168595b;
            }
            C62445bv bvVar = bmVar.f168597a;
            if (bvVar == null) {
                bvVar = C62445bv.f168618e;
            }
            if ((bvVar.f168620a & 1) != 0) {
                C62436bm bmVar2 = bpVar.f168607c;
                if (bmVar2 == null) {
                    bmVar2 = C62436bm.f168595b;
                }
                C62445bv bvVar2 = bmVar2.f168597a;
                if (bvVar2 == null) {
                    bvVar2 = C62445bv.f168618e;
                }
                C62441br brVar = bvVar2.f168621b;
                if (brVar == null) {
                    brVar = C62441br.f168608h;
                }
                rectF = C24095c.m44759d(brVar);
            }
            C26615f fVar = this.f72302l;
            fVar.getClass();
            C26613d f = C26614e.m49159f(rectF);
            f.mo31893b(!z);
            fVar.mo31905c(f.mo31892a());
            return C58833ax.m90834k(rectF);
        }
    }

    /* renamed from: g */
    public final void mo31771g() {
        C25664y yVar = this.f72296f;
        C58485gu f = yVar.mo30772f();
        Objects.requireNonNull(f);
        synchronized (yVar.f69790f) {
            yVar.f69791g.clear();
        }
        if (yVar.f69798n.mo30746f()) {
            int size = f.size();
            for (int i = 0; i < size; i++) {
                yVar.f69798n.mo30745e((C26504ci) f.get(i));
            }
        }
        mo31796p();
        this.f72281D = null;
    }

    /* renamed from: i */
    public final void mo31773i() {
        C25980d dVar = this.f72299i.f70642a.f70649b;
        C58839bc bcVar = C26504ci.f72199a;
        if ((((C25497ac) this.f72311u.mo3842a()).mo30525b() && this.f72282E) || this.f72286J.mo31167a(dVar, (C25497ac) this.f72311u.mo3842a())) {
            bcVar = C26504ci.f72200b;
        } else if (dVar.equals(C25980d.EDUCATION)) {
            if (!this.f72288L.mo31462g(C26239a.EDUCATION_PARAGRAPH_SELECTION_ENABLED) || !((C25497ac) this.f72311u.mo3842a()).mo30525b()) {
                bcVar = this.f72288L.mo31462g(C26239a.ENABLE_MATH_GLEAMS_IN_EDUCATION_FILTER) ? C26504ci.f72204f : C26504ci.f72200b;
            } else {
                C58839bc bcVar2 = C26504ci.f72204f;
                C58839bc bcVar3 = C26504ci.f72202d;
                bcVar2.getClass();
                bcVar3.getClass();
                bcVar = new C58845bi(C58846bj.m90902d(bcVar2, bcVar3));
            }
        } else if (dVar.equals(C25980d.TRANSLATE)) {
            bcVar = C26504ci.f72202d;
        } else if ((dVar.equals(C25980d.AUTO_FILTER) || dVar.equals(C25980d.SHOPPING)) && ((C25497ac) this.f72311u.mo3842a()).mo30526c()) {
            bcVar = C26504ci.f72201c;
        }
        C25664y yVar = this.f72296f;
        if (bcVar != yVar.f69792h) {
            yVar.f69792h = bcVar;
            mo31805y();
        }
    }

    /* renamed from: k */
    public final void mo31775k() {
        Runnable runnable = this.f72281D;
        if (runnable != null) {
            this.f72293c.execute(runnable);
            this.f72281D = null;
        }
    }

    /* renamed from: kW */
    public final /* synthetic */ void mo30520kW(C25533p pVar) {
    }

    /* renamed from: kX */
    public final /* synthetic */ void mo30521kX(boolean z) {
    }

    /* renamed from: kY */
    public final void mo30522kY(C25497ac acVar, C25497ac acVar2, C25533p pVar) {
        if (acVar != acVar2) {
            C25758g gVar = this.f72311u;
            acVar2.getClass();
            gVar.mo5708l(acVar2);
            if (acVar2.mo30526c()) {
                mo31803w();
            } else {
                mo31799s();
                if (acVar2.mo30527d()) {
                    mo31771g();
                } else {
                    mo31798r();
                }
            }
            mo31773i();
            if (acVar.mo30525b()) {
                this.f72294d.execute(C47810es.m84977q(new C26514cs(this)));
            }
            if (acVar2.mo30525b()) {
                C58485gu f = this.f72296f.mo30772f();
                int size = f.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    C26504ci ciVar = (C26504ci) f.get(i);
                    i++;
                    if (ciVar.f72224r) {
                        m48978B(ciVar, C58836b.f156633a, false);
                        break;
                    }
                }
            }
            C25495aa.m46954a(this.f72297g, acVar, acVar2, pVar);
        }
    }

    /* renamed from: kZ */
    public final /* synthetic */ void mo30523kZ() {
    }

    /* renamed from: l */
    public final boolean mo31776l() {
        if (!((C25497ac) this.f72311u.mo3842a()).mo30525b()) {
            return false;
        }
        C26615f fVar = this.f72302l;
        fVar.getClass();
        return !((C26620k) fVar).f72593f.mo31882h().isEmpty();
    }

    /* renamed from: m */
    public final boolean mo31777m() {
        return this.f72298h.mo31918c();
    }

    /* renamed from: n */
    public final C25312at mo31795n(C25310ar arVar) {
        C25311as asVar = (C25311as) C25312at.f68870c.createBuilder();
        C58833ax a = this.f72298h.mo31917a();
        if (a.mo56113h() && Collection.EL.stream(arVar.f68867a).anyMatch(C26635w.f72641a)) {
            C25309aq aqVar = (C25309aq) C25310ar.f68865c.createBuilder();
            for (C25308ap apVar : arVar.f68867a) {
                if (C26637y.m49210b(apVar)) {
                    C62231l lVar = (C62231l) a.mo56107c();
                    C25348x xVar = (C25348x) C25308ap.f68839y.createBuilder();
                    C25349y yVar = C25349y.DOCUMENT_GLEAM;
                    xVar.copyOnWrite();
                    ((C25308ap) xVar.instance).f68848i = yVar.getNumber();
                    xVar.copyOnWrite();
                    C25308ap apVar2 = (C25308ap) xVar.instance;
                    lVar.getClass();
                    apVar2.f68844e = lVar;
                    apVar2.f68843d = 13;
                    C62444bu buVar = (C62444bu) C62445bv.f168618e.createBuilder();
                    C62491dn dnVar = lVar.f168026b;
                    if (dnVar == null) {
                        dnVar = C62491dn.f168710e;
                    }
                    C62441br f = C24095c.m44761f(dnVar);
                    buVar.copyOnWrite();
                    C62445bv bvVar = (C62445bv) buVar.instance;
                    f.getClass();
                    bvVar.f168621b = f;
                    bvVar.f168620a |= 1;
                    C62491dn dnVar2 = lVar.f168026b;
                    if (dnVar2 == null) {
                        dnVar2 = C62491dn.f168710e;
                    }
                    buVar.copyOnWrite();
                    C62445bv bvVar2 = (C62445bv) buVar.instance;
                    dnVar2.getClass();
                    bvVar2.f168622c = dnVar2;
                    bvVar2.f168620a |= 2;
                    xVar.copyOnWrite();
                    C62445bv bvVar3 = (C62445bv) buVar.build();
                    bvVar3.getClass();
                    ((C25308ap) xVar.instance).f68847h = bvVar3;
                    xVar.copyOnWrite();
                    ((C25308ap) xVar.instance).f68849j = "DocumentQuadLabel";
                    apVar = (C25308ap) xVar.build();
                }
                aqVar.mo30370a(apVar);
            }
            arVar = (C25310ar) aqVar.build();
        }
        asVar.copyOnWrite();
        arVar.getClass();
        ((C25312at) asVar.instance).f68872a = arVar;
        boolean andSet = this.f72289M.getAndSet(false);
        asVar.copyOnWrite();
        ((C25312at) asVar.instance).f68873b = andSet;
        return (C25312at) asVar.build();
    }

    /* renamed from: p */
    public final void mo31796p() {
        this.f72303m = 0;
        this.f72305o = null;
    }

    /* renamed from: q */
    public final void mo31797q(C25312at atVar) {
        C25310ar arVar = atVar.f68872a;
        int i = 0;
        if (arVar != null) {
            int i2 = 0;
            for (C25308ap apVar : arVar.f68867a) {
                C25349y a = C25349y.m46667a(apVar.f68848i);
                if (a == null) {
                    a = C25349y.UNRECOGNIZED;
                }
                if (!a.equals(C25349y.UNKNOWN) && !a.equals(C25349y.PRE_GLEAM) && !a.equals(C25349y.THINKING_GLEAM)) {
                    if (a.equals(C25349y.PLANAR_GLEAM)) {
                        i2++;
                    }
                    i++;
                }
            }
            m48979C(this.f72314x, i);
            m48979C(this.f72315y, i2);
            return;
        }
        m48979C(this.f72314x, 0);
        m48979C(this.f72315y, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo31798r() {
        C58485gu f = this.f72296f.mo30772f();
        int size = f.size();
        for (int i = 0; i < size; i++) {
            C26504ci ciVar = (C26504ci) f.get(i);
            if (C26504ci.m48939h(ciVar.f72231y)) {
                ciVar.f72220n = true;
            }
        }
    }

    /* renamed from: s */
    public final void mo31799s() {
        this.f72309s.mo5708l(false);
    }

    /* renamed from: t */
    public final void mo31800t(C27793m mVar) {
        boolean z;
        C58485gu guVar;
        C62219be beVar;
        C58485gu guVar2;
        Iterator it;
        C26603l lVar;
        if (!((C25497ac) this.f72311u.mo3842a()).mo30527d()) {
            C27792l c = mVar.mo33237c();
            C26637y yVar = this.f72298h;
            C56220aa h = mVar.mo33243h();
            C58480gp e = C58485gu.m89837e();
            for (C56327y yVar2 : h.f149750a) {
                C56324v vVar = yVar2.f150144g;
                if (vVar == null) {
                    vVar = C56324v.f150122c;
                }
                C56323u a = C56323u.m87968a(vVar.f150125b);
                if (a == null) {
                    a = C56323u.GLEAM;
                }
                if (!C58832aw.m90831a(a, C56323u.DOCUMENT_GLEAM)) {
                    e.mo55395g(yVar2);
                }
            }
            C58833ax a2 = yVar.f72643a.mo33098a();
            if (a2.mo56113h()) {
                C62231l lVar2 = (C62231l) a2.mo56107c();
                C56219a aVar = (C56219a) C56327y.f150136i.createBuilder();
                C56321s sVar = (C56321s) C56324v.f150122c.createBuilder();
                C56323u uVar = C56323u.DOCUMENT_GLEAM;
                sVar.copyOnWrite();
                C56324v vVar2 = (C56324v) sVar.instance;
                vVar2.f150125b = uVar.f150121l;
                vVar2.f150124a |= 1;
                aVar.copyOnWrite();
                C56327y yVar3 = (C56327y) aVar.instance;
                C56324v vVar3 = (C56324v) sVar.build();
                vVar3.getClass();
                yVar3.f150144g = vVar3;
                yVar3.f150138a |= 32;
                C62444bu buVar = (C62444bu) C62445bv.f168618e.createBuilder();
                C62491dn dnVar = lVar2.f168026b;
                if (dnVar == null) {
                    dnVar = C62491dn.f168710e;
                }
                C62441br f = C24095c.m44761f(dnVar);
                buVar.copyOnWrite();
                C62445bv bvVar = (C62445bv) buVar.instance;
                f.getClass();
                bvVar.f168621b = f;
                bvVar.f168620a |= 1;
                aVar.copyOnWrite();
                C56327y yVar4 = (C56327y) aVar.instance;
                C62445bv bvVar2 = (C62445bv) buVar.build();
                bvVar2.getClass();
                yVar4.f150140c = bvVar2;
                yVar4.f150139b = 7;
                C56300d dVar = (C56300d) C56320r.f150092n.createBuilder();
                dVar.copyOnWrite();
                C56320r rVar = (C56320r) dVar.instance;
                rVar.f150094a |= 2;
                rVar.f150096c = "DocumentQuadLabel";
                C56309g gVar = (C56309g) C56310h.f150072g.createBuilder();
                gVar.copyOnWrite();
                C56310h hVar = (C56310h) gVar.instance;
                lVar2.getClass();
                hVar.f150076c = lVar2;
                hVar.f150075b = 5;
                dVar.copyOnWrite();
                C56320r rVar2 = (C56320r) dVar.instance;
                C56310h hVar2 = (C56310h) gVar.build();
                hVar2.getClass();
                rVar2.f150100g = hVar2;
                rVar2.f150094a |= 64;
                C56317o oVar = (C56317o) C56318p.f150087c.createBuilder();
                oVar.copyOnWrite();
                C56318p pVar = (C56318p) oVar.instance;
                pVar.f150089a |= 4;
                pVar.f150090b = "==DocumentGleam==";
                C56318p pVar2 = (C56318p) oVar.build();
                dVar.copyOnWrite();
                C56320r rVar3 = (C56320r) dVar.instance;
                pVar2.getClass();
                rVar3.f150101h = pVar2;
                rVar3.f150094a |= 128;
                aVar.mo54333b((C56320r) dVar.build());
                e.mo55395g((C56327y) aVar.build());
            }
            C56328z zVar = (C56328z) h.toBuilder();
            zVar.copyOnWrite();
            ((C56220aa) zVar.instance).f149750a = C56220aa.emptyProtobufList();
            zVar.mo54356a(e.mo55394f());
            c.mo33220b((C56220aa) zVar.build());
            C27793m a3 = c.mo33219a();
            Trace.beginSection("onDetectedObjectsAvailableTask");
            boolean j = a3.mo33302j();
            if (!j) {
                this.f72291O += a3.mo33243h().f149750a.size();
            } else if (this.f72291O != 0) {
                this.f72289M.set(true);
                this.f72291O = 0;
            }
            if (!a3.mo33243h().f149750a.isEmpty()) {
                if ((this.f72279B || !((C25497ac) this.f72311u.mo3842a()).mo30526c()) && (lVar = this.f72301k) != null) {
                    lVar.mo31870b(a3);
                }
                C25664y yVar5 = this.f72296f;
                boolean b = ((C25497ac) this.f72311u.mo3842a()).mo30525b();
                if (b || yVar5.f69798n.mo30746f()) {
                    long a4 = a3.mo33235a();
                    C56220aa h2 = a3.mo33243h();
                    boolean booleanValue = ((Boolean) a3.mo33242g().mo56109e(Boolean.FALSE)).booleanValue();
                    boolean j2 = a3.mo33302j();
                    boolean z2 = j2 || booleanValue;
                    C58495hd g = yVar5.mo30773g();
                    ArrayList arrayList = new ArrayList(g.values());
                    C58480gp gpVar = new C58480gp(4);
                    C58485gu.m89845m();
                    synchronized (yVar5.f69786b) {
                        Iterator it2 = h2.f149750a.iterator();
                        while (it2.hasNext()) {
                            C56327y yVar6 = (C56327y) it2.next();
                            if ((!C26551eb.m49044i(yVar6) || z2) && (!C26551eb.m49041f(yVar6) || b)) {
                                C58833ax a5 = C28120i.m52397a(yVar6);
                                C26504ci ciVar = a5.mo56113h() ? (C26504ci) g.get(a5.mo56107c()) : null;
                                if (ciVar == null) {
                                    it = it2;
                                    gpVar.mo55395g(yVar6);
                                } else if (!ciVar.mo31766k()) {
                                    it = it2;
                                    if (C25349y.GLEAM.equals(ciVar.mo31760d())) {
                                        ciVar.mo31767l();
                                    }
                                    ciVar.f72216j = yVar6;
                                    ciVar.f72217k = null;
                                    if (ciVar.mo31766k()) {
                                        ciVar.f72229w = C28120i.m52399c(ciVar.f72216j);
                                        ciVar.f72225s = C28120i.m52398b(ciVar.f72229w, ciVar.f72219m);
                                        ciVar.f72226t = C28120i.m52400d(ciVar.f72216j, ciVar.f72219m);
                                    }
                                    arrayList.remove(ciVar);
                                } else if (b) {
                                    gpVar.mo55395g(yVar6);
                                } else {
                                    arrayList.remove(ciVar);
                                    ciVar.f72223q = true;
                                }
                                it2 = it;
                            }
                        }
                        boolean z3 = true;
                        Stream stream = Collection.EL.stream(arrayList);
                        if (!z2) {
                            stream = stream.filter(C25656q.f69776a);
                        }
                        C58485gu f2 = gpVar.mo55394f();
                        if (b) {
                            stream.forEach(new C25649j(yVar5));
                            guVar = (C58485gu) Collection.EL.stream(f2).map(new C25662w(yVar5, a4)).collect(C58370cn.f155946a);
                            synchronized (yVar5.f69790f) {
                                yVar5.f69791g.addAll(guVar);
                            }
                        } else {
                            if (a4 == 0) {
                                z3 = false;
                            }
                            C58838bb.m90868c(z3);
                            long e2 = yVar5.f69795k.mo26873e();
                            C58485gu guVar3 = (C58485gu) stream.collect(C58370cn.f155946a);
                            Collection.EL.stream(guVar3).forEach(C25651l.f69771a);
                            if (!guVar3.isEmpty() || !f2.isEmpty()) {
                                long j3 = yVar5.f69801q + 1;
                                yVar5.f69801q = j3;
                                z = j;
                                guVar = yVar5.f69798n.mo30743c(f2, guVar3, a4, yVar5.f69787c, e2, j2, new C25650k(yVar5, j3));
                                synchronized (yVar5.f69790f) {
                                    yVar5.f69791g.addAll(guVar);
                                }
                            } else {
                                ((C58970a) ((C58970a) C25664y.f69785a.mo56224b()).mo56372aa(50216)).mo56388r("***** removeOrAddObjectsLive[%d]: Skip removeOrAdd", a4);
                                guVar = C58485gu.m89845m();
                            }
                        }
                        z = j;
                    }
                    if (a3.mo33301i()) {
                        C58495hd a6 = C26602k.m49118a((List) a3.mo33241f().mo56109e(C58485gu.m89845m()));
                        int size = guVar.size();
                        for (int i = 0; i < size; i++) {
                            C26504ci ciVar2 = (C26504ci) guVar.get(i);
                            C56327y yVar7 = ciVar2.f72216j;
                            C58833ax axVar = C58836b.f156633a;
                            float f3 = 0.0f;
                            for (C56320r rVar4 : yVar7.f150143f) {
                                if (!axVar.mo56113h() || rVar4.f150099f > f3) {
                                    C56318p pVar3 = rVar4.f150101h;
                                    if (pVar3 == null) {
                                        pVar3 = C56318p.f150087c;
                                    }
                                    C62223d dVar2 = (C62223d) a6.get(pVar3.f150090b);
                                    if (dVar2 != null) {
                                        axVar = C58833ax.m90834k(dVar2);
                                        f3 = rVar4.f150099f;
                                    }
                                }
                            }
                            if (axVar.mo56113h()) {
                                C62223d dVar3 = (C62223d) axVar.mo56107c();
                                if (dVar3.f168007a == 10 && ciVar2.f72229w != null && !ciVar2.f72223q) {
                                    Objects.requireNonNull(dVar3);
                                    if (dVar3.f168007a == 10) {
                                        beVar = (C62219be) dVar3.f168008b;
                                    } else {
                                        beVar = C62219be.f167986j;
                                    }
                                    C25306an anVar = (C25306an) C25307ao.f68833c.createBuilder();
                                    anVar.copyOnWrite();
                                    beVar.getClass();
                                    ((C25307ao) anVar.instance).f68835a = beVar;
                                    String str = beVar.f167992e;
                                    if (str.isEmpty() || beVar.f167993f.size() == 0) {
                                        guVar2 = C58485gu.m89845m();
                                    } else {
                                        C58480gp e3 = C58485gu.m89837e();
                                        for (C62210aw awVar : beVar.f167993f) {
                                            e3.mo55395g(str.substring(awVar.f167966b, awVar.f167967c));
                                        }
                                        guVar2 = e3.mo55394f();
                                    }
                                    anVar.copyOnWrite();
                                    C25307ao aoVar = (C25307ao) anVar.instance;
                                    C62971cq cqVar = aoVar.f68836b;
                                    if (!cqVar.mo58948c()) {
                                        aoVar.f68836b = C62942bv.mutableCopy(cqVar);
                                    }
                                    C62947c.addAll((Iterable) guVar2, (List) aoVar.f68836b);
                                    ciVar2.f72227u = C58833ax.m90834k((C25307ao) anVar.build());
                                }
                            }
                        }
                    }
                } else {
                    ((C58970a) ((C58970a) C25664y.f69785a.mo56226d()).mo56372aa(50215)).mo56386p("onDetectedObjectsAvailable called while not frozen and tracking unavailable.");
                    C58485gu.m89845m();
                    z = j;
                }
                if (!((C25497ac) this.f72311u.mo3842a()).mo30526c()) {
                    mo31798r();
                }
            } else {
                z = j;
            }
            C25624ag agVar = this.f72297g;
            if (!z || agVar.mo30740k()) {
                agVar.f69705h = 0;
            } else {
                agVar.f69705h = agVar.f69701d.mo26871c();
                agVar.mo30738i();
                agVar.mo30739j();
            }
            mo31805y();
            if (z) {
                this.f72306p = a3;
            }
            this.f72292b.execute(C47810es.m84977q(new C26511cp(this)));
            Trace.endSection();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0081, code lost:
        if (r1 != false) goto L_0x008e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31801u(com.google.common.base.C58833ax r5, android.graphics.PointF r6, boolean r7) {
        /*
            r4 = this;
            boolean r0 = r5.mo56113h()
            if (r0 == 0) goto L_0x0017
            com.google.android.libraries.lens.view.ay.y r0 = r4.f72296f
            java.lang.Object r1 = r5.mo56107c()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.google.common.base.ax r0 = r0.mo30769c(r1)
            goto L_0x0019
        L_0x0017:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0019:
            boolean r1 = r0.mo56113h()
            if (r1 == 0) goto L_0x002d
            java.lang.Object r1 = r0.mo56107c()
            com.google.android.libraries.lens.view.gleam.ci r1 = (com.google.android.libraries.lens.view.gleam.C26504ci) r1
            boolean r1 = r4.mo31806z(r1)
            if (r1 != 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            return
        L_0x002d:
            boolean r1 = r5.mo56113h()
            if (r1 == 0) goto L_0x006f
            com.google.android.libraries.lens.view.d.g r1 = r4.f72311u
            java.lang.Object r1 = r1.mo3842a()
            com.google.android.libraries.lens.view.at.ac r1 = (com.google.android.libraries.lens.view.p2078at.C25497ac) r1
            boolean r1 = r1.mo30525b()
            if (r1 == 0) goto L_0x006f
            com.google.android.libraries.lens.view.ay.y r1 = r4.f72296f
            com.google.common.base.ax r1 = r1.mo30771e()
            boolean r1 = r1.mo56113h()
            if (r1 == 0) goto L_0x006f
            com.google.android.libraries.lens.view.ay.y r1 = r4.f72296f
            com.google.common.base.ax r1 = r1.mo30771e()
            java.lang.Object r1 = r1.mo56107c()
            com.google.android.libraries.lens.view.gleam.ci r1 = (com.google.android.libraries.lens.view.gleam.C26504ci) r1
            com.google.android.libraries.lens.view.vision.u r1 = r1.f72214h
            int r1 = r1.mo33664h()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r5.mo56107c()
            boolean r1 = com.google.common.base.C58832aw.m90831a(r1, r2)
            if (r1 != 0) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            return
        L_0x006f:
            com.google.android.libraries.lens.view.d.g r1 = r4.f72311u
            java.lang.Object r1 = r1.mo3842a()
            com.google.android.libraries.lens.view.at.ac r1 = (com.google.android.libraries.lens.view.p2078at.C25497ac) r1
            boolean r1 = r1.mo30525b()
            boolean r5 = r5.mo56113h()
            if (r5 != 0) goto L_0x0084
            if (r1 == 0) goto L_0x0095
            goto L_0x008e
        L_0x0084:
            if (r1 != 0) goto L_0x008e
            com.google.android.libraries.search.b.b r5 = r4.f72290N
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a.f98639r
            r5.mo19974a(r1)
            goto L_0x0095
        L_0x008e:
            com.google.android.libraries.search.b.b r5 = r4.f72290N
            com.google.android.libraries.search.b.i.g r1 = com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a.f98596d
            r5.mo19974a(r1)
        L_0x0095:
            boolean r5 = r0.mo56113h()
            if (r5 == 0) goto L_0x00b7
            java.lang.Object r5 = r0.mo56107c()
            com.google.android.libraries.lens.view.gleam.ci r5 = (com.google.android.libraries.lens.view.gleam.C26504ci) r5
            com.google.android.libraries.lens.view.am.y r5 = r5.mo31760d()
            com.google.android.libraries.lens.view.am.y r1 = com.google.android.libraries.lens.view.p2069am.C25349y.TEXT_GLEAM
            if (r5 == r1) goto L_0x00b7
            java.lang.Object r5 = r0.mo56107c()
            com.google.android.libraries.lens.view.gleam.ci r5 = (com.google.android.libraries.lens.view.gleam.C26504ci) r5
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r6)
            r2 = 0
            r4.m48977A(r5, r1, r2)
        L_0x00b7:
            com.google.android.libraries.lens.view.main.al r5 = r4.f72284G
            if (r5 == 0) goto L_0x01a7
            com.google.android.libraries.lens.view.main.bq r5 = r5.f74703a
            boolean r1 = r0.mo56113h()
            if (r1 != 0) goto L_0x00dc
            com.google.android.libraries.lens.e.w r7 = com.google.android.libraries.lens.p2014e.C24231w.SCREEN
            com.google.android.libraries.lens.view.frozenimage.b r0 = r5.f74769O
            boolean r0 = r0.mo31474e()
            com.google.android.libraries.lens.view.session.bh r6 = com.google.android.libraries.lens.view.session.C27778bn.m51730b(r6, r7, r0)
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            r5.mo32889u(r6, r7)
            com.google.android.libraries.lens.view.bb.e r5 = r5.f74786af
            com.google.android.libraries.lens.view.bb.b r6 = com.google.android.libraries.lens.view.p2091bb.C25688b.f69827a
            r5.mo30810l(r6)
            return
        L_0x00dc:
            java.lang.Object r1 = r0.mo56107c()
            com.google.android.libraries.lens.view.gleam.ci r1 = (com.google.android.libraries.lens.view.gleam.C26504ci) r1
            com.google.android.libraries.lens.view.am.y r1 = r1.mo31760d()
            com.google.android.libraries.lens.view.am.y r2 = com.google.android.libraries.lens.view.p2069am.C25349y.TEXT_GLEAM
            r3 = 1
            if (r1 != r2) goto L_0x0129
            java.lang.Object r7 = r0.mo56107c()
            com.google.android.libraries.lens.view.gleam.ci r7 = (com.google.android.libraries.lens.view.gleam.C26504ci) r7
            com.google.android.libraries.lens.view.frozenimage.b r0 = r5.f74769O
            boolean r0 = r0.mo31474e()
            r0 = r0 ^ r3
            java.lang.String r1 = "TextGleamTap should occur only for live mode"
            com.google.common.base.C58838bb.m90884s(r0, r1)
            com.google.android.libraries.lens.e.w r0 = r5.mo32874e()
            com.google.android.libraries.lens.view.frozenimage.b r1 = r5.f74769O
            boolean r1 = r1.mo31474e()
            com.google.android.libraries.lens.view.session.bh r6 = com.google.android.libraries.lens.view.session.C27778bn.m51730b(r6, r0, r1)
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            r5.mo32889u(r6, r0)
            com.google.android.libraries.lens.view.bb.e r5 = r5.f74786af
            com.google.android.libraries.lens.view.bb.a r6 = com.google.android.libraries.lens.view.p2091bb.C25688b.m47362b()
            android.graphics.RectF r7 = r7.mo31759c()
            r0 = r6
            com.google.android.libraries.lens.view.bb.c r0 = (com.google.android.libraries.lens.view.p2091bb.C25689c) r0
            r0.f69829a = r7
            r0.f69830b = r3
            com.google.android.libraries.lens.view.bb.b r6 = r6.mo30790c()
            r5.mo30810l(r6)
            return
        L_0x0129:
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.libraries.lens.view.gleam.ci r0 = (com.google.android.libraries.lens.view.gleam.C26504ci) r0
            com.google.android.libraries.lens.view.flags.b r1 = r5.f74804i
            com.google.android.libraries.lens.view.flags.a r2 = com.google.android.libraries.lens.view.flags.C26239a.EDUCATION_FILTER_SWITCH_ON_MATH_GLEAM_SELECTION_ENABLED
            boolean r1 = r1.mo31462g(r2)
            if (r1 == 0) goto L_0x0154
            com.google.android.libraries.lens.view.filters.e.d r1 = r5.f74777W
            com.google.bp.f.b.a.df r2 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.AUTO_FILTER
            boolean r1 = r1.mo31207f(r2)
            if (r1 == 0) goto L_0x0154
            boolean r1 = r0.mo31764i()
            if (r1 == 0) goto L_0x0154
            com.google.android.libraries.lens.view.main.bl r5 = r5.f74787ag
            r5.getClass()
            com.google.bp.f.b.a.df r6 = com.google.p4242bp.p4257f.p4260b.p4261a.C56306df.EDUCATION
            r5.mo32862l(r6, r3)
            return
        L_0x0154:
            com.google.android.libraries.lens.view.frozenimage.b r1 = r5.f74769O
            boolean r1 = r1.mo31474e()
            com.google.android.libraries.lens.view.filters.e.d r2 = r5.f74777W
            com.google.android.libraries.lens.view.filters.e.i r2 = r2.f70642a
            com.google.android.libraries.lens.view.filters.e.a.d r2 = r2.f70649b
            boolean r3 = r5.f74805j
            com.google.common.base.ax r1 = com.google.android.libraries.lens.view.session.C27778bn.m51734f(r0, r1, r2, r3, r7)
            boolean r2 = r1.mo56113h()
            if (r2 == 0) goto L_0x0178
            java.lang.Object r6 = r1.mo56107c()
            com.google.android.libraries.lens.view.session.bj r6 = (com.google.android.libraries.lens.view.session.C27774bj) r6
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            r5.mo32887s(r6, r7)
            goto L_0x018e
        L_0x0178:
            if (r7 == 0) goto L_0x017d
            com.google.android.libraries.lens.e.w r7 = com.google.android.libraries.lens.p2014e.C24231w.OBJECT
            goto L_0x017f
        L_0x017d:
            com.google.android.libraries.lens.e.w r7 = com.google.android.libraries.lens.p2014e.C24231w.GLEAM
        L_0x017f:
            com.google.android.libraries.lens.view.frozenimage.b r1 = r5.f74769O
            boolean r1 = r1.mo31474e()
            com.google.android.libraries.lens.view.session.bh r6 = com.google.android.libraries.lens.view.session.C27778bn.m51729a(r6, r0, r7, r1)
            com.google.common.base.b r7 = com.google.common.base.C58836b.f156633a
            r5.mo32889u(r6, r7)
        L_0x018e:
            com.google.android.libraries.lens.view.bb.e r5 = r5.f74786af
            com.google.android.libraries.lens.view.bb.a r6 = com.google.android.libraries.lens.view.p2091bb.C25688b.m47362b()
            android.graphics.RectF r7 = r0.mo31759c()
            r0 = r6
            com.google.android.libraries.lens.view.bb.c r0 = (com.google.android.libraries.lens.view.p2091bb.C25689c) r0
            r0.f69829a = r7
            r7 = 3
            r0.f69830b = r7
            com.google.android.libraries.lens.view.bb.b r6 = r6.mo30790c()
            r5.mo30810l(r6)
        L_0x01a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.gleam.C26526dd.mo31801u(com.google.common.base.ax, android.graphics.PointF, boolean):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo31802v() {
        C58833ax axVar;
        C25664y yVar = this.f72296f;
        if (!yVar.f69788d.mo56113h()) {
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k(yVar.mo30768b(((Long) yVar.f69788d.mo56107c()).longValue()));
        }
        if (!axVar.mo56113h()) {
            ((C58970a) ((C58970a) f72277a.mo56226d()).mo56372aa(49439)).mo56386p("Unable to retrieve frozen gleam update from GleamManager.");
            return;
        }
        this.f72292b.execute(C47810es.m84977q(new C26524db(this, mo31795n((C25310ar) axVar.mo56107c()))));
    }

    /* renamed from: w */
    public final void mo31803w() {
        this.f72309s.mo5708l(true);
    }

    /* renamed from: x */
    public final void mo31804x() {
        this.f72296f.mo30777k();
        mo31805y();
    }

    /* renamed from: y */
    public final void mo31805y() {
        if (((C25497ac) this.f72311u.mo3842a()).mo30525b()) {
            this.f72294d.execute(new C26523da(this));
        }
    }

    /* renamed from: z */
    public final boolean mo31806z(C26504ci ciVar) {
        if (!ciVar.mo31763g()) {
            return false;
        }
        C58833ax o = m48980o(ciVar);
        if (!o.mo56113h()) {
            ((C58970a) ((C58970a) f72277a.mo56224b()).mo56372aa(49446)).mo56386p("Barcode gleam has no intent URI");
            return false;
        }
        if (this.f72287K.mo30556f(C28133v.m52416b((String) o.mo56107c()))) {
            ((C58970a) ((C58970a) f72277a.mo56224b()).mo56372aa(49445)).mo56386p("Opened barcode intent");
            return true;
        }
        ((C58970a) ((C58970a) f72277a.mo56224b()).mo56372aa(49444)).mo56386p("Could not open barcode intent");
        return false;
    }

    /* renamed from: h */
    public final void mo31772h(C26614e eVar) {
        C26615f fVar = this.f72302l;
        fVar.getClass();
        fVar.mo31905c(eVar);
    }

    /* renamed from: j */
    public final void mo31774j(C26588fh fhVar) {
        C25758g gVar = this.f72313w;
        fhVar.getClass();
        gVar.mo5708l(fhVar);
    }
}
