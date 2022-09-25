package com.google.android.apps.gsa.staticplugins.p7877dx.p7879b;

import com.google.android.apps.gsa.search.core.p6519al.p6749o.C85536a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6884y.p6889e.p6893d.C87300a;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90195a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90197c;
import com.google.android.apps.gsa.shared.monet.p7070b.p7079af.C90208n;
import com.google.android.apps.gsa.shared.monet.p7070b.p7095m.C90263e;
import com.google.android.apps.gsa.shared.p7020bd.C89408a;
import com.google.android.apps.gsa.shared.p7020bd.C89409b;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.sidekick.main.p7204g.C91391c;
import com.google.android.apps.gsa.staticplugins.p7877dx.p7880c.C100297a;
import com.google.android.apps.gsa.staticplugins.p7877dx.p7880c.C100300d;
import com.google.android.apps.gsa.staticplugins.p7877dx.p7880c.C100301e;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62974ct;
import java.util.Collection;
import java.util.HashSet;
import p5451f.p5452a.p5453a.p5454a.C69395aq;
import p5451f.p5452a.p5453a.p5454a.C69396ar;
import p5451f.p5452a.p5453a.p5454a.C69421bp;
import p5451f.p5452a.p5453a.p5454a.C69459x;

/* renamed from: com.google.android.apps.gsa.staticplugins.dx.b.m */
/* compiled from: PG */
public final class C100295m extends C23056g implements C90195a, C100297a {

    /* renamed from: a */
    public static final C59071e f280458a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dx.b.m");

    /* renamed from: b */
    public final C100300d f280459b;

    /* renamed from: c */
    public final C86124t f280460c;

    /* renamed from: d */
    public final C22871g f280461d;

    /* renamed from: e */
    public final C89409b f280462e;

    /* renamed from: f */
    public final C85536a f280463f;

    /* renamed from: g */
    public final C91391c f280464g;

    /* renamed from: h */
    public final C42876ab f280465h;

    /* renamed from: i */
    public final C21370a f280466i;

    /* renamed from: j */
    private final C86338r f280467j;

    /* renamed from: k */
    private final C58833ax f280468k;

    /* renamed from: l */
    private final boolean f280469l;

    /* renamed from: m */
    private final C90197c f280470m;

    /* renamed from: n */
    private final C58833ax f280471n;

    public C100295m(C23052c cVar, C100300d dVar, C86124t tVar, C86338r rVar, C22871g gVar, C58833ax axVar, C58833ax axVar2, C90197c cVar2, C58833ax axVar3, C89409b bVar, C85536a aVar, C91391c cVar3, C42876ab abVar, C21370a aVar2) {
        super(cVar);
        this.f280459b = dVar;
        this.f280460c = tVar;
        this.f280467j = rVar;
        this.f280461d = gVar;
        this.f280468k = axVar;
        boolean z = false;
        if (axVar2.mo56113h() && ((Boolean) ((C58881cr) axVar2.mo56107c()).mo6453a()).booleanValue()) {
            z = true;
        }
        this.f280469l = z;
        this.f280470m = cVar2;
        this.f280471n = axVar3;
        this.f280462e = bVar;
        this.f280463f = aVar;
        this.f280464g = cVar3;
        this.f280465h = abVar;
        this.f280466i = aVar2;
    }

    /* renamed from: a */
    public final void mo83936a(C90208n nVar) {
        mo91869i(nVar, false);
    }

    /* renamed from: e */
    public final void mo91866e() {
        if (this.f280471n.mo56113h()) {
            C58833ax axVar = (C58833ax) this.f280459b.mo91864i().f63720e;
            ((C90263e) this.f280471n.mo56107c()).mo83975c(axVar);
            ((C23251a) this.f280459b.mo91861f()).mo28730f(Boolean.valueOf(mo91870j(axVar)), false);
        }
    }

    /* renamed from: f */
    public final void mo91867f(boolean z) {
        C69459x xVar;
        C69459x xVar2;
        C69396ar arVar = C69396ar.f185678d;
        try {
            C58833ax a = this.f280462e.mo83325a(C69395aq.BOTTOM_BAR_PROMOTION_INDICATOR);
            if (a.mo56113h()) {
                arVar = this.f280462e.mo83327c(((Integer) a.mo56107c()).intValue());
            }
        } catch (C89408a | C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f280458a.mo56225c()).mo56382g(e)).mo56372aa(33301)).mo56386p("Error retrieving tip next tip");
        }
        if (!C69396ar.f185678d.equals(arVar)) {
            if (arVar.f185680a == 7) {
                xVar = (C69459x) arVar.f185681b;
            } else {
                xVar = C69459x.f185869c;
            }
            if (xVar.f185872b == z) {
                if (arVar.f185680a == 7) {
                    xVar2 = (C69459x) arVar.f185681b;
                } else {
                    xVar2 = C69459x.f185869c;
                }
                C90208n a2 = C90208n.m146767a(xVar2.f185871a);
                if (a2 == null) {
                    a2 = C90208n.UNKNOWN_TAB;
                }
                if (a2 != C90208n.UNKNOWN_TAB && a2 != C90208n.NO_TAB && !((C58485gu) this.f280459b.mo91865j().f63720e).contains(a2) && ((C58833ax) ((C23251a) this.f280459b.mo91858c()).f63720e).mo56113h()) {
                    C69421bp bpVar = arVar.f185682c;
                    if (bpVar == null) {
                        bpVar = C69421bp.f185742q;
                    }
                    int i = bpVar.f185745b;
                    new C90873ag(this.f280463f.mo79049a(i), this.f280461d, "Trigger promotion indicator", new C100288f(this, i, arVar)).mo85223a(new C100289g());
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo91868h(C90208n nVar) {
        mo91869i(nVar, true);
        if (this.f280468k.mo56113h()) {
            ((C87300a) this.f280468k.mo56107c()).mo80949b(nVar);
        }
        C90208n nVar2 = C90208n.UNKNOWN_TAB;
        if (nVar.ordinal() == 7) {
            String concat = String.valueOf(nVar.name()).concat("_used");
            if (!this.f280467j.contains(concat)) {
                C86337q b = this.f280467j.mo80076b();
                b.mo80067b(concat, true);
                b.apply();
            }
        }
    }

    /* renamed from: i */
    public final void mo91869i(C90208n nVar, boolean z) {
        C69459x xVar;
        C58485gu guVar = (C58485gu) this.f280459b.mo91865j().f63720e;
        if (!guVar.contains(nVar)) {
            C23251a j = this.f280459b.mo91865j();
            C58480gp e = C58485gu.m89837e();
            e.mo55396h(guVar);
            e.mo55395g(nVar);
            j.mo28730f(e.mo55394f(), false);
        }
        C58833ax axVar = (C58833ax) ((C23251a) this.f280459b.mo91859d()).f63720e;
        if (axVar.mo56113h()) {
            C69396ar arVar = (C69396ar) axVar.mo56107c();
            if (arVar.f185680a == 7) {
                xVar = (C69459x) arVar.f185681b;
            } else {
                xVar = C69459x.f185869c;
            }
            C90208n a = C90208n.m146767a(xVar.f185871a);
            if (a == null) {
                a = C90208n.UNKNOWN_TAB;
            }
            if (a == nVar) {
                ((C23251a) this.f280459b.mo91859d()).mo28730f(C58836b.f156633a, false);
                C69421bp bpVar = ((C69396ar) axVar.mo56107c()).f185682c;
                if (bpVar == null) {
                    bpVar = C69421bp.f185742q;
                }
                if (!bpVar.f185749f) {
                    C85536a aVar = this.f280463f;
                    C69421bp bpVar2 = ((C69396ar) axVar.mo56107c()).f185682c;
                    if (bpVar2 == null) {
                        bpVar2 = C69421bp.f185742q;
                    }
                    aVar.mo79051c(bpVar2.f185745b);
                }
            }
        }
        if (!z || this.f280470m.mo83940a(nVar)) {
            ((C23251a) this.f280459b.mo91858c()).mo28730f(C58833ax.m90834k(nVar), false);
        }
    }

    /* renamed from: iA */
    public final boolean mo28438iA() {
        return true;
    }

    /* renamed from: iB */
    public final void mo28497iB(C23028x xVar) {
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C100301e.m166239b(this.f280459b, C100301e.m166238a(protoParcelable));
        C58833ax axVar = (C58833ax) ((C23251a) this.f280459b.mo91858c()).f63720e;
        if (axVar.mo56113h()) {
            this.f280459b.mo91865j().mo28730f(C58485gu.m89846n((C90208n) axVar.mo56107c()), false);
        }
        if (this.f280460c.mo79746e(C89972ak.f246584y) && this.f280471n.mo56113h()) {
            this.f280461d.mo28212l("Fetch and handle Menu tip", new C100291i(this));
        }
    }

    /* renamed from: iE */
    public final void mo28498iE() {
        ((C23251a) this.f280459b.mo91860e()).mo28730f(Boolean.valueOf(this.f280460c.mo79746e(C90110fh.f250712r)), false);
        ((C23251a) this.f280459b.mo91863h()).mo28730f(Boolean.valueOf(this.f280469l), false);
        if (this.f280468k.mo56113h()) {
            ((C87300a) this.f280468k.mo56107c()).mo80951d(new HashSet((Collection) ((C23251a) this.f280459b.mo91862g()).f63720e));
        }
        if (!this.f280471n.mo56113h()) {
            ((C23251a) this.f280459b.mo91861f()).mo28730f(false, false);
            this.f280459b.mo91864i().mo28730f(C58836b.f156633a, false);
        } else if (this.f280460c.mo79746e(C89972ak.f246584y)) {
            mo91866e();
            ((C90263e) this.f280471n.mo56107c()).mo83974b(new C100285c(this));
        }
        if (this.f280460c.mo79746e(C89972ak.f246526A)) {
            this.f280461d.mo28213m("maybeShowSmartDot", this.f280460c.mo79743a(C89972ak.f246556ad), new C100286d(this));
        } else {
            mo91867f(false);
        }
    }

    /* renamed from: iW */
    public final void mo28499iW() {
        if (this.f280471n.mo56113h()) {
            ((C90263e) this.f280471n.mo56107c()).mo83973a();
        }
    }

    /* renamed from: j */
    public final boolean mo91870j(C58833ax axVar) {
        if (!this.f280460c.mo79746e(C89972ak.f246554ab) || !axVar.mo56113h()) {
            return false;
        }
        C69421bp bpVar = ((C69396ar) axVar.mo56107c()).f185682c;
        if (bpVar == null) {
            bpVar = C69421bp.f185742q;
        }
        return !bpVar.f185749f;
    }
}
