package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113246a;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113251ad;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113501m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113502n;
import com.google.assistant.p3781ad.p3789d.C48582b;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4129b.p4136c.C54757e;
import com.google.p4129b.p4136c.C54758f;
import com.google.p4129b.p4136c.C54759g;
import java.util.HashMap;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.u */
/* compiled from: PG */
public final class C111071u {

    /* renamed from: d */
    private static final C59071e f309293d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.a.u");

    /* renamed from: a */
    public final C113251ad f309294a;

    /* renamed from: b */
    public final Executor f309295b;

    /* renamed from: c */
    public final C110963aa f309296c;

    /* renamed from: e */
    private final C111029bz f309297e;

    /* renamed from: f */
    private final C86124t f309298f;

    public C111071u(C111029bz bzVar, C113251ad adVar, C86124t tVar, C90851k kVar, C110963aa aaVar) {
        this.f309297e = bzVar;
        this.f309294a = adVar;
        this.f309298f = tVar;
        this.f309296c = aaVar;
        if (tVar.mo79746e(C90063do.f249338be)) {
            this.f309295b = kVar.mo85210c("TapasLightweightExecutor");
        } else {
            this.f309295b = C60826bg.f164896a;
        }
    }

    /* renamed from: a */
    public final int mo99040a() {
        return this.f309298f.mo79746e(C90063do.f249634j) ? 10001 : 12000;
    }

    /* renamed from: b */
    public final C113501m mo99041b(Optional optional, String str, String str2, C48582b bVar, C54758f fVar, String str3, C58495hd hdVar, Optional optional2) {
        C58495hd hdVar2;
        C48670ae a = this.f309297e.mo99018a(str);
        C58976aa aaVar = C58975e.f156826a;
        C113501m n = C113502n.m187946n();
        C113246a aVar = (C113246a) n;
        aVar.f313592b = Optional.m71637of(str);
        aVar.f313593c = Optional.m71637of(bVar);
        aVar.f313594d = Optional.m71637of(fVar);
        aVar.f313591a = Optional.m71637of(str2);
        aVar.f313602l = Optional.m71637of(new C111064n(this, str3, str, hdVar));
        Objects.requireNonNull(n);
        optional2.ifPresent(new C111065o(n));
        if (this.f309298f.mo79746e(C90063do.f249344bk)) {
            if (optional.isPresent()) {
                aVar.f313591a = Optional.m71637of(((CharSequence) optional.get()).toString());
            } else {
                C59104x d = f309293d.mo56226d();
                d.mo56378ag(C58975e.f156826a, "TapasAABuildHelper");
                ((C59052c) ((C59052c) d).mo56372aa(27055)).mo56389s("App label does not exist for package %s. Falling back to geller source.", str);
            }
        }
        HashMap hashMap = new HashMap();
        for (C54757e eVar : fVar.f143678a) {
            Optional d2 = this.f309297e.mo99021d(a);
            if (d2.isEmpty()) {
                hdVar2 = C58729pv.f156485a;
            } else {
                hdVar2 = ((C111062l) d2.get()).mo99009c().mo99034a(bVar, eVar);
            }
            hashMap.putAll(hdVar2);
        }
        n.mo99921c(C58495hd.m89898l(hashMap));
        n.mo99922d(hdVar);
        return n;
    }

    /* renamed from: c */
    public final C60870cx mo99042c(C49301bt btVar, C48582b bVar, C54758f fVar, C58495hd hdVar, C54759g gVar) {
        C60870cx cxVar;
        String str = btVar.f127426b;
        C60870cx b = this.f309294a.mo99925b(str);
        if (this.f309298f.mo79746e(C90063do.f249261aG)) {
            cxVar = C60856cj.m92900i(Optional.empty());
        } else {
            cxVar = this.f309294a.mo99924a(str);
        }
        return C60922j.m93044g(C60838bs.m92859i(C60856cj.m92895d(b, cxVar).mo57334a(new C111066p(b, cxVar), this.f309295b)), new C111063m(this, btVar, bVar, fVar, gVar, hdVar), this.f309295b);
    }
}
