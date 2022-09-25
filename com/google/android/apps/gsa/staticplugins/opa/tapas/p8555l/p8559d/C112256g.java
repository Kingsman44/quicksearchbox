package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8559d;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112565t;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9223c.C121431c;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121438d;
import com.google.assistant.p3781ad.p3787c.p3788a.C48485ad;
import com.google.assistant.p3781ad.p3787c.p3788a.C48486ae;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48634bw;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.d.g */
/* compiled from: PG */
public final /* synthetic */ class C112256g implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C112267r f311556a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f311557b;

    /* renamed from: c */
    public final /* synthetic */ Map f311558c;

    public /* synthetic */ C112256g(C112267r rVar, C113405ep epVar, Map map) {
        this.f311556a = rVar;
        this.f311557b = epVar;
        this.f311558c = map;
    }

    public final Object get() {
        C112267r rVar = this.f311556a;
        C113405ep epVar = this.f311557b;
        Map map = this.f311558c;
        long b = rVar.f311586b.mo26870b();
        rVar.f311588d.mo99076a(C111255r.NG3_LOG, "NG3 ranker enabled");
        if (!rVar.f311585a.mo99477b()) {
            rVar.mo99479c(Level.SEVERE, "Model Wrapper not available.", new Object[0]);
            return C60856cj.m92900i(C121438d.f337093a);
        }
        C58485gu b2 = C113339cj.m187494b(map);
        C48485ad adVar = (C48485ad) C48486ae.f125248d.createBuilder();
        String p = epVar.mo100033p();
        adVar.copyOnWrite();
        C48486ae aeVar = (C48486ae) adVar.instance;
        p.getClass();
        aeVar.f125250a |= 1;
        aeVar.f125251b = p;
        Optional g = rVar.f311587c.mo99536g();
        Optional map2 = rVar.f311587c.mo99543n(C48634bw.GEMINI_USER_PROFILE_SIGNAL).map(C112565t.f312158a).map(C112264o.f311576a);
        C60870cx g2 = C60922j.m93044g(C60856cj.m92896e((List) Collection.EL.stream(b2).map(new C112266q(rVar, g, map2, map2.map(new C112265p(adVar)))).collect(C58370cn.f155946a)), new C112257h(adVar), rVar.f311589e);
        C121431c cVar = rVar.f311585a;
        Objects.requireNonNull(cVar);
        C60870cx g3 = C60922j.m93044g(g2, new C112258i(cVar), rVar.f311589e);
        return C60856cj.m92895d(g2, g3).mo57334a(new C112259j(rVar, g2, g3, b2, map, b), rVar.f311589e);
    }
}
