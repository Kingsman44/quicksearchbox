package com.google.android.libraries.lens.view.p2081au;

import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.android.libraries.lens.view.utils.C28130s;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.lens.view.au.af */
/* compiled from: PG */
public final class C25550af implements C25575y {

    /* renamed from: d */
    public static final /* synthetic */ int f69549d = 0;

    /* renamed from: e */
    private static final C58974d f69550e = C58974d.m91135i("LensUiState");

    /* renamed from: a */
    public final C25547ac f69551a = C25547ac.m47081a(C25549ae.f69548a);

    /* renamed from: b */
    public final C25547ac f69552b = C25547ac.m47081a(C25549ae.f69548a);

    /* renamed from: c */
    public final C25547ac f69553c = new C25547ac(C28130s.m52411b(C56306df.AUTO_FILTER), C25549ae.f69548a);

    /* renamed from: f */
    private final C37215b f69554f;

    public C25550af(C37215b bVar) {
        this.f69554f = bVar;
    }

    /* renamed from: a */
    public final C25569s mo30605a() {
        return this.f69553c;
    }

    /* renamed from: b */
    public final C25569s mo30606b() {
        return this.f69552b;
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("LensUiState");
        eVar.mo33149f("prefetchImage", String.valueOf(((C58833ax) this.f69551a.mo30656d()).mo56111f()));
        eVar.mo33149f("interaction", String.valueOf(((C58833ax) this.f69552b.mo30656d()).mo56111f()));
        eVar.mo33149f("appliedFilters", (String) Collection.EL.stream(((C56280cg) this.f69553c.mo30656d()).f149994a).map(C25548ad.f69547a).collect(Collectors.joining(",")));
    }

    /* renamed from: d */
    public final C25569s mo30607d() {
        return this.f69551a;
    }

    /* renamed from: e */
    public final void mo30608e(C56280cg cgVar) {
        C58838bb.m90868c(cgVar.f149994a.size() > 0);
        this.f69553c.mo30603e(cgVar);
    }

    /* renamed from: f */
    public final void mo30609f(C25574x xVar) {
        if (xVar != null && !((C58833ax) this.f69551a.mo30656d()).mo56113h()) {
            ((C58970a) ((C58970a) f69550e.mo56226d()).mo56372aa(50168)).mo56386p("setting interaction without a prefetch image");
        }
        if (xVar != null) {
            this.f69554f.mo19974a(C37194a.f98497bG);
        }
        this.f69552b.mo30603e(C58833ax.m90833j(xVar));
    }

    /* renamed from: g */
    public final void mo30610g(C60870cx cxVar) {
        if (cxVar == null && ((C58833ax) this.f69552b.mo30656d()).mo56113h()) {
            ((C58970a) ((C58970a) f69550e.mo56226d()).mo56372aa(50169)).mo56386p("clearing prefetch image before interaction");
        }
        this.f69551a.mo30603e(C58833ax.m90833j(cxVar));
    }
}
