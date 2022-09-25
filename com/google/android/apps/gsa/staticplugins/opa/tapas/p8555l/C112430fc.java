package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112464ai;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112467al;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112470ao;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121438d;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48588ad;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.fc */
/* compiled from: PG */
public final /* synthetic */ class C112430fc implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C112435fh f311916a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f311917b;

    /* renamed from: c */
    public final /* synthetic */ Map f311918c;

    public /* synthetic */ C112430fc(C112435fh fhVar, C113405ep epVar, Map map) {
        this.f311916a = fhVar;
        this.f311917b = epVar;
        this.f311918c = map;
    }

    public final Object get() {
        C60870cx cxVar;
        C60870cx cxVar2;
        C112435fh fhVar = this.f311916a;
        C113405ep epVar = this.f311917b;
        Map map = this.f311918c;
        long b = fhVar.f311933f.mo26870b();
        if (!fhVar.f311931d.mo99233d()) {
            return C60856cj.m92900i(fhVar.mo99523g());
        }
        fhVar.f311935h.mo99076a(C111255r.CORTEX_LOG, "Cortex ranker enabled");
        Optional empty = Optional.empty();
        if (epVar.mo100028k().isPresent()) {
            empty = ((C113408es) epVar.mo100028k().get()).mo100118a().mo100032o();
        }
        if (empty.isEmpty()) {
            empty = epVar.mo100032o();
        }
        if (!fhVar.f311943p) {
            cxVar2 = fhVar.f311937j.mo28201a("[Tapas] create user context", new C112409eq(fhVar, empty));
            cxVar = C60856cj.m92900i(fhVar.f311942o.mo99048f(Optional.empty(), false, fhVar.f311934g.mo99543n(C48634bw.TOP_CONTACT_INFOS_SIGNAL).map(C112470ao.f311987a), fhVar.f311934g.mo99543n(C48634bw.STARRED_CONTACT_INFOS_SIGNAL).map(C112464ai.f311981a), fhVar.f311934g.mo99538i(), fhVar.f311934g.mo99536g(), Optional.empty()));
        } else if (fhVar.f311930c.mo79746e(C90063do.f249493ea)) {
            C60870cx a = fhVar.f311934g.f311989a.mo99547a(C48634bw.CORTEX_SIGNAL);
            cxVar2 = fhVar.f311937j.mo28209i(a, "[Tapas] eval transform user context", new C112407eo(empty));
            cxVar = fhVar.f311937j.mo28209i(a, "[Tapas] get user context", C112408ep.f311876a);
        } else {
            Optional map2 = fhVar.f311934g.mo99543n(C48634bw.CORTEX_SIGNAL).map(C112467al.f311984a);
            C112435fh.f311928a.mo105240i("CORTEX_SIGNAL_".concat(true != map2.isPresent() ? "MISSING" : "PRESENT"));
            C48588ad adVar = (C48588ad) map2.orElse(C48588ad.f125578i);
            cxVar2 = C60856cj.m92900i(C112435fh.m186261d(empty, adVar));
            cxVar = C60856cj.m92900i(adVar);
        }
        C60870cx cxVar3 = cxVar2;
        if (!fhVar.f311930c.mo79746e(C90063do.f249298ar)) {
            return fhVar.f311937j.mo28210j(cxVar3, "[Tapas] spawn model run", new C112410er(fhVar, fhVar.mo99524h(C113339cj.m187494b(map), epVar.mo100033p(), cxVar), epVar, map, b));
        } else if (!fhVar.f311930c.mo79746e(C90063do.f249364cD)) {
            return C60856cj.m92900i(C121438d.f337093a);
        } else {
            return fhVar.f311938k.mo28210j(cxVar3, "[Tapas] spawn background model run", new C112397ee(fhVar, map, epVar, cxVar));
        }
    }
}
